package p000;

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

/* renamed from: eL */
/* loaded from: classes.dex */
public final class C3984eL {

    /* renamed from: f */
    public static final C11864yy0 f26663f = C11864yy0.m26288a(EnumC0769MD.f7036c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g */
    public static final C11864yy0 f26664g = new C11864yy0("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C11864yy0.f46557e);

    /* renamed from: h */
    public static final C11864yy0 f26665h = AbstractC1841cL.f17437f;

    /* renamed from: i */
    public static final C11864yy0 f26666i;

    /* renamed from: j */
    public static final C11864yy0 f26667j;

    /* renamed from: k */
    public static final Set f26668k;

    /* renamed from: l */
    public static final C11370v32 f26669l;

    /* renamed from: m */
    public static final ArrayDeque f26670m;

    /* renamed from: a */
    public final InterfaceC6443mi f26671a;

    /* renamed from: b */
    public final DisplayMetrics f26672b;

    /* renamed from: c */
    public final C11967zm0 f26673c;

    /* renamed from: d */
    public final ArrayList f26674d;

    /* renamed from: e */
    public final F20 f26675e = F20.m2487a();

    static {
        Boolean bool = Boolean.FALSE;
        f26666i = C11864yy0.m26288a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f26667j = C11864yy0.m26288a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f26668k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f26669l = new C11370v32(12);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC7381Bh1.f976a;
        f26670m = new ArrayDeque(0);
    }

    public C3984eL(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC6443mi interfaceC6443mi, C11967zm0 c11967zm0) {
        this.f26674d = arrayList;
        IL1.m3830d(displayMetrics, "Argument must not be null");
        this.f26672b = displayMetrics;
        IL1.m3830d(interfaceC6443mi, "Argument must not be null");
        this.f26671a = interfaceC6443mi;
        IL1.m3830d(c11967zm0, "Argument must not be null");
        this.f26673c = c11967zm0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r4;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m17914c(p000.InterfaceC9585h70 r8, android.graphics.BitmapFactory.Options r9, p000.InterfaceC3922dL r10, p000.InterfaceC6443mi r11) {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto La
            r10.mo5561m()
            r8.mo9150s()
        La:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = p000.AbstractC11567wc1.f44998d
            r3.lock()
            android.graphics.Bitmap r8 = r8.mo9145n(r9)     // Catch: java.lang.Throwable -> L1d java.lang.IllegalArgumentException -> L1f
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
            java.lang.StringBuilder r0 = p000.AbstractC1374Vq.m8594m(r5, r6, r0, r1, r7)     // Catch: java.lang.Throwable -> L1d
            r0.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = m17915d(r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L59
            r11.mo319i(r0)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L58
            r0 = 0
            r9.inBitmap = r0     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L58
            android.graphics.Bitmap r8 = m17914c(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L58
            java.util.concurrent.locks.Lock r9 = p000.AbstractC11567wc1.f44998d
            r9.unlock()
            return r8
        L58:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L59:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L5a:
            java.util.concurrent.locks.Lock r9 = p000.AbstractC11567wc1.f44998d
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3984eL.m17914c(h70, android.graphics.BitmapFactory$Options, dL, mi):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public static String m17915d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: e */
    public static void m17916e(BitmapFactory.Options options) {
        m17917f(options);
        ArrayDeque arrayDeque = f26670m;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    /* renamed from: f */
    public static void m17917f(BitmapFactory.Options options) {
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

    /* renamed from: a */
    public final C6506ni m17918a(InterfaceC9585h70 interfaceC9585h70, int i, int i2, C7830Jy0 c7830Jy0, InterfaceC3922dL interfaceC3922dL) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f26673c.m26542d(65536, byte[].class);
        synchronized (C3984eL.class) {
            ArrayDeque arrayDeque = f26670m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m17917f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC0769MD enumC0769MD = (EnumC0769MD) c7830Jy0.m4482c(f26663f);
        WC0 wc0 = (WC0) c7830Jy0.m4482c(f26664g);
        AbstractC1841cL abstractC1841cL = (AbstractC1841cL) c7830Jy0.m4482c(AbstractC1841cL.f17437f);
        boolean zBooleanValue = ((Boolean) c7830Jy0.m4482c(f26666i)).booleanValue();
        C11864yy0 c11864yy0 = f26667j;
        try {
            return C6506ni.m23171b(this.f26671a, m17919b(interfaceC9585h70, options2, abstractC1841cL, enumC0769MD, wc0, c7830Jy0.m4482c(c11864yy0) != null && ((Boolean) c7830Jy0.m4482c(c11864yy0)).booleanValue(), i, i2, zBooleanValue, interfaceC3922dL));
        } finally {
            m17916e(options2);
            this.f26673c.m26546h(bArr);
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m17919b(p000.InterfaceC9585h70 r25, android.graphics.BitmapFactory.Options r26, p000.AbstractC1841cL r27, p000.EnumC0769MD r28, p000.WC0 r29, boolean r30, int r31, int r32, boolean r33, p000.InterfaceC3922dL r34) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3984eL.m17919b(h70, android.graphics.BitmapFactory$Options, cL, MD, WC0, boolean, int, int, boolean, dL):android.graphics.Bitmap");
    }
}
