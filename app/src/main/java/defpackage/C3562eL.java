package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: eL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3562eL {
    public static final C8272yy0 f = C8272yy0.a(MD.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final C8272yy0 g = new C8272yy0("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C8272yy0.e);
    public static final C8272yy0 h = AbstractC2496cL.f;
    public static final C8272yy0 i;
    public static final C8272yy0 j;
    public static final Set k;
    public static final C7532v32 l;
    public static final ArrayDeque m;
    public final InterfaceC5935mi a;
    public final DisplayMetrics b;
    public final C8426zm0 c;
    public final ArrayList d;
    public final F20 e = F20.a();

    static {
        Boolean bool = Boolean.FALSE;
        i = C8272yy0.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        j = C8272yy0.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        l = new C7532v32(12);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC0121Bh1.a;
        m = new ArrayDeque(0);
    }

    public C3562eL(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC5935mi interfaceC5935mi, C8426zm0 c8426zm0) {
        this.d = arrayList;
        IL1.d(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        IL1.d(interfaceC5935mi, "Argument must not be null");
        this.a = interfaceC5935mi;
        IL1.d(c8426zm0, "Argument must not be null");
        this.c = c8426zm0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(defpackage.InterfaceC4094h70 r8, android.graphics.BitmapFactory.Options r9, defpackage.InterfaceC3372dL r10, defpackage.InterfaceC5935mi r11) {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto La
            r10.m()
            r8.s()
        La:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.AbstractC7827wc1.d
            r3.lock()
            android.graphics.Bitmap r8 = r8.n(r9)     // Catch: java.lang.Throwable -> L1d java.lang.IllegalArgumentException -> L1f
            r3.unlock()
            return r8
        L1d:
            r8 = move-exception
            goto L5a
        L1f:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            java.lang.String r6 = ", outHeight: "
            java.lang.String r7 = ", outMimeType: "
            java.lang.StringBuilder r0 = defpackage.AbstractC1705Vq.m(r5, r6, r0, r1, r7)     // Catch: java.lang.Throwable -> L1d
            r0.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L59
            r11.i(r0)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L58
            r0 = 0
            r9.inBitmap = r0     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L58
            android.graphics.Bitmap r8 = c(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L58
            java.util.concurrent.locks.Lock r9 = defpackage.AbstractC7827wc1.d
            r9.unlock()
            return r8
        L58:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L59:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L5a:
            java.util.concurrent.locks.Lock r9 = defpackage.AbstractC7827wc1.d
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3562eL.c(h70, android.graphics.BitmapFactory$Options, dL, mi):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        f(options);
        ArrayDeque arrayDeque = m;
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
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C6126ni a(InterfaceC4094h70 interfaceC4094h70, int i2, int i3, C0795Jy0 c0795Jy0, InterfaceC3372dL interfaceC3372dL) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.c.d(65536, byte[].class);
        synchronized (C3562eL.class) {
            ArrayDeque arrayDeque = m;
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
        MD md = (MD) c0795Jy0.c(f);
        WC0 wc0 = (WC0) c0795Jy0.c(g);
        AbstractC2496cL abstractC2496cL = (AbstractC2496cL) c0795Jy0.c(AbstractC2496cL.f);
        boolean zBooleanValue = ((Boolean) c0795Jy0.c(i)).booleanValue();
        C8272yy0 c8272yy0 = j;
        try {
            return C6126ni.b(this.a, b(interfaceC4094h70, options2, abstractC2496cL, md, wc0, c0795Jy0.c(c8272yy0) != null && ((Boolean) c0795Jy0.c(c8272yy0)).booleanValue(), i2, i3, zBooleanValue, interfaceC3372dL));
        } finally {
            e(options2);
            this.c.h(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(defpackage.InterfaceC4094h70 r25, android.graphics.BitmapFactory.Options r26, defpackage.AbstractC2496cL r27, defpackage.MD r28, defpackage.WC0 r29, boolean r30, int r31, int r32, boolean r33, defpackage.InterfaceC3372dL r34) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3562eL.b(h70, android.graphics.BitmapFactory$Options, cL, MD, WC0, boolean, int, int, boolean, dL):android.graphics.Bitmap");
    }
}
