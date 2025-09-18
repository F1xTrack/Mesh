package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: O8 */
/* loaded from: classes.dex */
public final class C0890O8 implements InterfaceC11129tB0 {

    /* renamed from: g */
    public static final byte[] f8245g = {-1, -39};

    /* renamed from: a */
    public final InterfaceC6380li f8246a;

    /* renamed from: b */
    public final boolean f8247b;

    /* renamed from: c */
    public final boolean f8248c;

    /* renamed from: d */
    public final PreverificationHelper f8249d;

    /* renamed from: e */
    public final InterfaceC9979kC0 f8250e;

    /* renamed from: f */
    public final /* synthetic */ int f8251f;

    public C0890O8(InterfaceC6380li interfaceC6380li, InterfaceC9979kC0 interfaceC9979kC0, C0856Nb c0856Nb, int i) {
        this.f8251f = i;
        this.f8249d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f8246a = interfaceC6380li;
        if (interfaceC6380li instanceof C6484nM) {
            this.f8247b = c0856Nb.f7894a;
            this.f8248c = c0856Nb.f7895b;
        }
        this.f8250e = interfaceC9979kC0;
    }

    /* renamed from: d */
    public static BitmapFactory.Options m5956d(EncodedImage encodedImage, Bitmap.Config config, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = encodedImage.getSampleSize();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z2 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z2) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z) {
            BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z2) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // p000.InterfaceC11129tB0
    /* renamed from: a */
    public final AbstractC7292zt mo5957a(EncodedImage encodedImage, Bitmap.Config config) {
        BitmapFactory.Options optionsM5956d = m5956d(encodedImage, config, this.f8247b);
        boolean z = optionsM5956d.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStream = encodedImage.getInputStream();
            inputStream.getClass();
            return m5959c(inputStream, optionsM5956d, null);
        } catch (RuntimeException e) {
            if (z) {
                return mo5957a(encodedImage, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    @Override // p000.InterfaceC11129tB0
    /* renamed from: b */
    public final AbstractC7292zt mo5958b(EncodedImage encodedImage, Bitmap.Config config, int i, ColorSpace colorSpace) throws IOException {
        boolean zIsCompleteAt = encodedImage.isCompleteAt(i);
        BitmapFactory.Options optionsM5956d = m5956d(encodedImage, config, this.f8247b);
        InputStream inputStream = encodedImage.getInputStream();
        inputStream.getClass();
        if (encodedImage.getSize() > i) {
            inputStream = new C8318Ti0(inputStream, i);
        }
        if (!zIsCompleteAt) {
            inputStream = new C11124t81(inputStream, f8245g);
        }
        boolean z = optionsM5956d.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                return m5959c(inputStream, optionsM5956d, colorSpace);
            } catch (RuntimeException e) {
                if (!z) {
                    throw e;
                }
                AbstractC7292zt abstractC7292ztMo5958b = mo5958b(encodedImage, Bitmap.Config.ARGB_8888, i, colorSpace);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return abstractC7292ztMo5958b;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C1273UE m5959c(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, android.graphics.ColorSpace r12) {
        /*
            r9 = this;
            OJ1 r0 = p000.AbstractC7292zt.f47072f
            int r1 = r11.outWidth
            int r2 = r11.outHeight
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 0
            if (r3 < r4) goto L1b
            com.facebook.imagepipeline.platform.PreverificationHelper r6 = r9.f8249d
            if (r6 == 0) goto L1b
            android.graphics.Bitmap$Config r7 = r11.inPreferredConfig
            boolean r6 = r6.shouldUseHardwareBitmapConfig(r7)
            if (r6 == 0) goto L1b
            r6 = 1
            goto L1c
        L1b:
            r6 = r5
        L1c:
            r7 = 0
            li r8 = r9.f8246a
            if (r6 == 0) goto L24
            r11.inMutable = r5
            goto L5b
        L24:
            boolean r5 = r9.f8247b
            if (r5 != 0) goto L5b
            int r5 = r9.f8251f
            switch(r5) {
                case 0: goto L3a;
                default: goto L2d;
            }
        L2d:
            android.graphics.Bitmap$Config r5 = p000.AbstractC1064Qu.m6807d(r11)
            if (r5 != 0) goto L35
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L35:
            int r1 = p000.AbstractC6697qi.m24050c(r1, r2, r5)
            goto L42
        L3a:
            android.graphics.Bitmap$Config r5 = r11.inPreferredConfig
            if (r5 == 0) goto L53
            int r1 = p000.AbstractC6697qi.m24050c(r1, r2, r5)
        L42:
            java.lang.Object r1 = r8.get(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L4b
            goto L5c
        L4b:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "BitmapPool.get returned null"
            r10.<init>(r11)
            throw r10
        L53:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Required value was null."
            r10.<init>(r11)
            throw r10
        L5b:
            r1 = r7
        L5c:
            r11.inBitmap = r1
            if (r3 < r4) goto L6d
            if (r12 != 0) goto L6a
            android.graphics.ColorSpace$Named r12 = p000.AbstractC1064Qu.m6801B()
            android.graphics.ColorSpace r12 = p000.AbstractC1064Qu.m6810g(r12)
        L6a:
            p000.AbstractC1064Qu.m6824u(r11, r12)
        L6d:
            kC0 r12 = r9.f8250e
            java.lang.Object r2 = r12.mo4581i()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            if (r2 != 0) goto L7f
            sD r2 = p000.C0644KD.f5944a
            r2 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
        L7f:
            byte[] r3 = r2.array()     // Catch: java.lang.Throwable -> Lae java.lang.RuntimeException -> Lb0 java.lang.IllegalArgumentException -> Lb2
            r11.inTempStorage = r3     // Catch: java.lang.Throwable -> Lae java.lang.RuntimeException -> Lb0 java.lang.IllegalArgumentException -> Lb2
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r10, r7, r11)     // Catch: java.lang.Throwable -> Lae java.lang.RuntimeException -> Lb0 java.lang.IllegalArgumentException -> Lb2
            r12.mo4580d(r2)
            if (r1 == 0) goto L9e
            if (r1 == r10) goto L9e
            r8.mo2828d(r1)
            if (r10 == 0) goto L98
            r10.recycle()
        L98:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L9e:
            boolean r11 = r9.f8248c
            if (r11 == 0) goto La9
            Fv0 r11 = p000.C7616Fv0.f3475c
            UE r10 = p000.AbstractC7292zt.m26567S(r10, r11, r0)
            return r10
        La9:
            UE r10 = p000.AbstractC7292zt.m26567S(r10, r8, r0)
            return r10
        Lae:
            r10 = move-exception
            goto Ld6
        Lb0:
            r10 = move-exception
            goto Lb4
        Lb2:
            r11 = move-exception
            goto Lba
        Lb4:
            if (r1 == 0) goto Lb9
            r8.mo2828d(r1)     // Catch: java.lang.Throwable -> Lae
        Lb9:
            throw r10     // Catch: java.lang.Throwable -> Lae
        Lba:
            if (r1 == 0) goto Lbf
            r8.mo2828d(r1)     // Catch: java.lang.Throwable -> Lae
        Lbf:
            r10.reset()     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
            if (r10 == 0) goto Ld4
            pl0 r1 = p000.C10689pl0.m23865l()     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
            UE r10 = p000.AbstractC7292zt.m26567S(r10, r1, r0)     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
            r12.mo4580d(r2)
            return r10
        Ld4:
            throw r11     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
        Ld5:
            throw r11     // Catch: java.lang.Throwable -> Lae
        Ld6:
            r12.mo4580d(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0890O8.m5959c(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.ColorSpace):UE");
    }
}
