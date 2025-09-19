package com.bumptech.glide.integration.webp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import androidx.annotation.Keep;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.AbstractC8927c12;
import p000.C0683Kq;

@Keep
/* loaded from: classes.dex */
public class WebpBitmapFactory {
    private static final int IN_TEMP_BUFFER_SIZE = 8192;
    private static final int MAX_WEBP_HEADER_SIZE = 21;
    public static boolean sUseSystemDecoder = true;

    static {
        System.loadLibrary("glide-webp");
    }

    @Keep
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            Bitmap bitmap2 = options.inBitmap;
            if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2 && bitmap2.getConfig() == options.inPreferredConfig) {
                bitmap2.setHasAlpha(true);
                bitmap2.eraseColor(0);
                return bitmap2;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setHasAlpha(true);
        bitmapCreateBitmap.eraseColor(0);
        return bitmapCreateBitmap;
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i, int i2) {
        return decodeByteArray(bArr, i, i2, null);
    }

    public static Bitmap decodeFile(String str) {
        return decodeFile(str, null);
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor) {
        return decodeFileDescriptor(fileDescriptor, null, null);
    }

    public static Bitmap decodeResource(Resources resources, int i) {
        return decodeResource(resources, i, null);
    }

    public static Bitmap decodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return decodeStream(inputStream, rect, options);
    }

    public static Bitmap decodeStream(InputStream inputStream) {
        return decodeStream(inputStream, null, null);
    }

    private static byte[] getImageHeader(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 21);
        }
        inputStream.mark(21);
        byte[] bArr = new byte[21];
        try {
            inputStream.read(bArr, 0, 21);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[IN_TEMP_BUFFER_SIZE] : bArr;
    }

    private static float getScaleFromOptions(BitmapFactory.Options options) {
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        float f = i > 1 ? 1.0f / i : 1.0f;
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f : f * (i3 / i2);
    }

    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    private static void setDefaultPadding(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap == null || options == null) {
            return;
        }
        int i = options.inDensity;
        if (i == 0) {
            if (options.inBitmap != null) {
                bitmap.setDensity(160);
                return;
            }
            return;
        }
        bitmap.setDensity(i);
        int i2 = options.inTargetDensity;
        if (i2 == 0 || i == i2 || i == options.inScreenDensity || !options.inScaled) {
            return;
        }
        bitmap.setDensity(i2);
    }

    @Keep
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return options.inJustDecodeBounds;
    }

    private static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = ClipboardModule.MIMETYPE_WEBP;
        }
    }

    public static boolean webpSupportRequired(byte[] bArr, int i, int i2) {
        int iM10569g;
        try {
            iM10569g = AbstractC8927c12.m10569g(new C0683Kq(i, bArr, i2, 4));
        } catch (IOException unused) {
            iM10569g = 7;
        }
        if (sUseSystemDecoder) {
            return false;
        }
        return AbstractC8927c12.m10571i(iM10569g);
    }

    private static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, IN_TEMP_BUFFER_SIZE) : inputStream;
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        if ((i | i2) < 0 || bArr.length < i + i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (!webpSupportRequired(bArr, i, i2)) {
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
        Bitmap bitmapNativeDecodeByteArray = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(bitmapNativeDecodeByteArray, options);
        return bitmapNativeDecodeByteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap decodeFile(java.lang.String r2, android.graphics.BitmapFactory.Options r3) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            android.graphics.Bitmap r0 = decodeStream(r1, r0, r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
        La:
            r1.close()     // Catch: java.io.IOException -> L1d
            goto L1d
        Le:
            r2 = move-exception
            r0 = r1
            goto L1e
        L11:
            r2 = move-exception
            goto L17
        L13:
            r2 = move-exception
            goto L1e
        L15:
            r2 = move-exception
            r1 = r0
        L17:
            r2.toString()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L1d
            goto La
        L1d:
            return r0
        L1e:
            if (r0 == 0) goto L23
            r0.close()     // Catch: java.io.IOException -> L23
        L23:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmapDecodeFileDescriptor;
        InputStream inputStreamWrapToMarkSupportedStream = wrapToMarkSupportedStream(new FileInputStream(fileDescriptor));
        try {
            if (webpSupportRequired(getImageHeader(inputStreamWrapToMarkSupportedStream), 0, 21)) {
                bitmapDecodeFileDescriptor = nativeDecodeStream(inputStreamWrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                setWebpBitmapOptions(bitmapDecodeFileDescriptor, options);
                setDefaultPadding(rect);
            } else {
                bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            }
            try {
                inputStreamWrapToMarkSupportedStream.close();
            } catch (Throwable unused) {
            }
            return bitmapDecodeFileDescriptor;
        } catch (Throwable th) {
            try {
                inputStreamWrapToMarkSupportedStream.close();
            } catch (Throwable unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0010 A[EXC_TOP_SPLITTER, PHI: r0 r3
  0x0010: PHI (r0v3 android.graphics.Bitmap) = (r0v9 android.graphics.Bitmap), (r0v7 android.graphics.Bitmap) binds: [B:16:0x0021, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]
  0x0010: PHI (r3v3 java.io.InputStream) = (r3v2 java.io.InputStream), (r3v5 java.io.InputStream) binds: [B:16:0x0021, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap decodeResource(android.content.res.Resources r2, int r3, android.graphics.BitmapFactory.Options r4) throws java.lang.Throwable {
        /*
            r0 = 0
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.io.InputStream r3 = r2.openRawResource(r3, r1)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            android.graphics.Bitmap r0 = decodeResourceStream(r2, r1, r3, r0, r4)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L21
            if (r3 == 0) goto L24
        L10:
            r3.close()     // Catch: java.io.IOException -> L24
            goto L24
        L14:
            r2 = move-exception
            r0 = r3
            goto L1b
        L17:
            r2 = move-exception
            goto L1b
        L19:
            r3 = r0
            goto L21
        L1b:
            if (r0 == 0) goto L20
            r0.close()     // Catch: java.io.IOException -> L20
        L20:
            throw r2
        L21:
            if (r3 == 0) goto L24
            goto L10
        L24:
            if (r0 != 0) goto L35
            if (r4 == 0) goto L35
            android.graphics.Bitmap r2 = r4.inBitmap
            if (r2 != 0) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Problem decoding into existing bitmap"
            r2.<init>(r3)
            throw r2
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (inputStream == null) {
            return null;
        }
        InputStream inputStreamWrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        if (!webpSupportRequired(getImageHeader(inputStreamWrapToMarkSupportedStream), 0, 21)) {
            return BitmapFactory.decodeStream(inputStreamWrapToMarkSupportedStream, rect, options);
        }
        Bitmap bitmapNativeDecodeStream = nativeDecodeStream(inputStreamWrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(bitmapNativeDecodeStream, options);
        setDefaultPadding(rect);
        return bitmapNativeDecodeStream;
    }
}
