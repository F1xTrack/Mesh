package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: Vm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1695Vm1 {
    public static final C8272yy0 e = C8272yy0.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder");
    public static final C8272yy0 f = C8272yy0.a(Boolean.TRUE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.SystemDecoder");
    public static final C5396jt0 g = new C5396jt0(23);
    public static final ArrayDeque h;
    public final InterfaceC5935mi a;
    public final DisplayMetrics b;
    public final C8426zm0 c;
    public final ArrayList d;

    static {
        char[] cArr = AbstractC0121Bh1.a;
        h = new ArrayDeque(0);
    }

    public C1695Vm1(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC5935mi interfaceC5935mi, C8426zm0 c8426zm0) {
        this.d = arrayList;
        IL1.d(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        IL1.d(interfaceC5935mi, "Argument must not be null");
        this.a = interfaceC5935mi;
        IL1.d(c8426zm0, "Argument must not be null");
        this.c = c8426zm0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, defpackage.C5396jt0 r11, defpackage.InterfaceC5935mi r12) throws java.io.IOException {
        /*
            boolean r0 = r10.inJustDecodeBounds
            if (r0 == 0) goto La
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r9.mark(r0)
            goto Ld
        La:
            r11.getClass()
        Ld:
            int r0 = r10.outWidth
            int r1 = r10.outHeight
            java.lang.String r2 = r10.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.AbstractC7827wc1.d
            r3.lock()
            r4 = 0
            android.graphics.Bitmap r11 = com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeStream(r9, r4, r10)     // Catch: java.lang.Throwable -> L28 java.lang.IllegalArgumentException -> L2a
            r3.unlock()
            boolean r10 = r10.inJustDecodeBounds
            if (r10 == 0) goto L27
            r9.reset()
        L27:
            return r11
        L28:
            r9 = move-exception
            goto L69
        L2a:
            r3 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r0 = defpackage.AbstractC1705Vq.m(r6, r7, r0, r1, r8)     // Catch: java.lang.Throwable -> L28
            r0.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L28
            android.graphics.Bitmap r1 = r10.inBitmap     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L28
            r0.append(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L28
            r5.<init>(r0, r3)     // Catch: java.lang.Throwable -> L28
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L68
            r9.reset()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            r12.i(r0)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            r10.inBitmap = r4     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            java.util.concurrent.locks.Lock r10 = defpackage.AbstractC7827wc1.d
            r10.unlock()
            return r9
        L67:
            throw r5     // Catch: java.lang.Throwable -> L28
        L68:
            throw r5     // Catch: java.lang.Throwable -> L28
        L69:
            java.util.concurrent.locks.Lock r10 = defpackage.AbstractC7827wc1.d
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1695Vm1.c(java.io.InputStream, android.graphics.BitmapFactory$Options, jt0, mi):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        f(options);
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C6126ni a(InputStream inputStream, int i, int i2, C0795Jy0 c0795Jy0) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        C5396jt0 c5396jt0 = g;
        IL1.a("You must provide an InputStream that supports mark()", inputStream.markSupported());
        byte[] bArr = (byte[]) this.c.d(65536, byte[].class);
        synchronized (C1695Vm1.class) {
            ArrayDeque arrayDeque = h;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        MD md = (MD) c0795Jy0.c(C3562eL.f);
        AbstractC2496cL abstractC2496cL = (AbstractC2496cL) c0795Jy0.c(C3562eL.h);
        boolean zBooleanValue = ((Boolean) c0795Jy0.c(C3562eL.i)).booleanValue();
        C8272yy0 c8272yy0 = C3562eL.j;
        if (c0795Jy0.c(c8272yy0) != null) {
            ((Boolean) c0795Jy0.c(c8272yy0)).booleanValue();
        }
        try {
            return C6126ni.b(this.a, b(inputStream, options2, abstractC2496cL, md, i, i2, zBooleanValue, c5396jt0));
        } finally {
            e(options2);
            this.c.h(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(java.io.InputStream r23, android.graphics.BitmapFactory.Options r24, defpackage.AbstractC2496cL r25, defpackage.MD r26, int r27, int r28, boolean r29, defpackage.C5396jt0 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1695Vm1.b(java.io.InputStream, android.graphics.BitmapFactory$Options, cL, MD, int, int, boolean, jt0):android.graphics.Bitmap");
    }
}
