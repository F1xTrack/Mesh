package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: Vm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8431Vm1 {

    /* renamed from: e */
    public static final C11864yy0 f12724e = C11864yy0.m26288a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder");

    /* renamed from: f */
    public static final C11864yy0 f12725f = C11864yy0.m26288a(Boolean.TRUE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.SystemDecoder");

    /* renamed from: g */
    public static final C9937jt0 f12726g = new C9937jt0(23);

    /* renamed from: h */
    public static final ArrayDeque f12727h;

    /* renamed from: a */
    public final InterfaceC6443mi f12728a;

    /* renamed from: b */
    public final DisplayMetrics f12729b;

    /* renamed from: c */
    public final C11967zm0 f12730c;

    /* renamed from: d */
    public final ArrayList f12731d;

    static {
        char[] cArr = AbstractC7381Bh1.f976a;
        f12727h = new ArrayDeque(0);
    }

    public C8431Vm1(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC6443mi interfaceC6443mi, C11967zm0 c11967zm0) {
        this.f12731d = arrayList;
        IL1.m3830d(displayMetrics, "Argument must not be null");
        this.f12729b = displayMetrics;
        IL1.m3830d(interfaceC6443mi, "Argument must not be null");
        this.f12728a = interfaceC6443mi;
        IL1.m3830d(c11967zm0, "Argument must not be null");
        this.f12730c = c11967zm0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r5;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m8544c(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, p000.C9937jt0 r11, p000.InterfaceC6443mi r12) throws java.io.IOException {
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
            java.util.concurrent.locks.Lock r3 = p000.AbstractC11567wc1.f44998d
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
            java.lang.StringBuilder r0 = p000.AbstractC1374Vq.m8594m(r6, r7, r0, r1, r8)     // Catch: java.lang.Throwable -> L28
            r0.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L28
            android.graphics.Bitmap r1 = r10.inBitmap     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = m8545d(r1)     // Catch: java.lang.Throwable -> L28
            r0.append(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L28
            r5.<init>(r0, r3)     // Catch: java.lang.Throwable -> L28
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L68
            r9.reset()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            r12.mo319i(r0)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            r10.inBitmap = r4     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            android.graphics.Bitmap r9 = m8544c(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L67
            java.util.concurrent.locks.Lock r10 = p000.AbstractC11567wc1.f44998d
            r10.unlock()
            return r9
        L67:
            throw r5     // Catch: java.lang.Throwable -> L28
        L68:
            throw r5     // Catch: java.lang.Throwable -> L28
        L69:
            java.util.concurrent.locks.Lock r10 = p000.AbstractC11567wc1.f44998d
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8431Vm1.m8544c(java.io.InputStream, android.graphics.BitmapFactory$Options, jt0, mi):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public static String m8545d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: e */
    public static void m8546e(BitmapFactory.Options options) {
        m8547f(options);
        ArrayDeque arrayDeque = f12727h;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    /* renamed from: f */
    public static void m8547f(BitmapFactory.Options options) {
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

    /* renamed from: a */
    public final C6506ni m8548a(InputStream inputStream, int i, int i2, C7830Jy0 c7830Jy0) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        C9937jt0 c9937jt0 = f12726g;
        IL1.m3827a("You must provide an InputStream that supports mark()", inputStream.markSupported());
        byte[] bArr = (byte[]) this.f12730c.m26542d(65536, byte[].class);
        synchronized (C8431Vm1.class) {
            ArrayDeque arrayDeque = f12727h;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m8547f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC0769MD enumC0769MD = (EnumC0769MD) c7830Jy0.m4482c(C3984eL.f26663f);
        AbstractC1841cL abstractC1841cL = (AbstractC1841cL) c7830Jy0.m4482c(C3984eL.f26665h);
        boolean zBooleanValue = ((Boolean) c7830Jy0.m4482c(C3984eL.f26666i)).booleanValue();
        C11864yy0 c11864yy0 = C3984eL.f26667j;
        if (c7830Jy0.m4482c(c11864yy0) != null) {
            ((Boolean) c7830Jy0.m4482c(c11864yy0)).booleanValue();
        }
        try {
            return C6506ni.m23171b(this.f12728a, m8549b(inputStream, options2, abstractC1841cL, enumC0769MD, i, i2, zBooleanValue, c9937jt0));
        } finally {
            m8546e(options2);
            this.f12730c.m26546h(bArr);
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m8549b(java.io.InputStream r23, android.graphics.BitmapFactory.Options r24, p000.AbstractC1841cL r25, p000.EnumC0769MD r26, int r27, int r28, boolean r29, p000.C9937jt0 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8431Vm1.m8549b(java.io.InputStream, android.graphics.BitmapFactory$Options, cL, MD, int, int, boolean, jt0):android.graphics.Bitmap");
    }
}
