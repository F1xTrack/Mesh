package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class O8 implements InterfaceC7173tB0 {
    public static final byte[] g = {-1, -39};
    public final InterfaceC5744li a;
    public final boolean b;
    public final boolean c;
    public final PreverificationHelper d;
    public final InterfaceC5458kC0 e;
    public final /* synthetic */ int f;

    public O8(InterfaceC5744li interfaceC5744li, InterfaceC5458kC0 interfaceC5458kC0, C1036Nb c1036Nb, int i) {
        this.f = i;
        this.d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.a = interfaceC5744li;
        if (interfaceC5744li instanceof C6060nM) {
            this.b = c1036Nb.a;
            this.c = c1036Nb.b;
        }
        this.e = interfaceC5458kC0;
    }

    public static BitmapFactory.Options d(EncodedImage encodedImage, Bitmap.Config config, boolean z) {
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

    @Override // defpackage.InterfaceC7173tB0
    public final AbstractC8446zt a(EncodedImage encodedImage, Bitmap.Config config) {
        BitmapFactory.Options optionsD = d(encodedImage, config, this.b);
        boolean z = optionsD.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStream = encodedImage.getInputStream();
            inputStream.getClass();
            return c(inputStream, optionsD, null);
        } catch (RuntimeException e) {
            if (z) {
                return a(encodedImage, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    @Override // defpackage.InterfaceC7173tB0
    public final AbstractC8446zt b(EncodedImage encodedImage, Bitmap.Config config, int i, ColorSpace colorSpace) throws IOException {
        boolean zIsCompleteAt = encodedImage.isCompleteAt(i);
        BitmapFactory.Options optionsD = d(encodedImage, config, this.b);
        InputStream inputStream = encodedImage.getInputStream();
        inputStream.getClass();
        if (encodedImage.getSize() > i) {
            inputStream = new C1526Ti0(inputStream, i);
        }
        if (!zIsCompleteAt) {
            inputStream = new C7165t81(inputStream, g);
        }
        boolean z = optionsD.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                return c(inputStream, optionsD, colorSpace);
            } catch (RuntimeException e) {
                if (!z) {
                    throw e;
                }
                AbstractC8446zt abstractC8446ztB = b(encodedImage, Bitmap.Config.ARGB_8888, i, colorSpace);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return abstractC8446ztB;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.UE c(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, android.graphics.ColorSpace r12) {
        /*
            r9 = this;
            OJ1 r0 = defpackage.AbstractC8446zt.f
            int r1 = r11.outWidth
            int r2 = r11.outHeight
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 0
            if (r3 < r4) goto L1b
            com.facebook.imagepipeline.platform.PreverificationHelper r6 = r9.d
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
            li r8 = r9.a
            if (r6 == 0) goto L24
            r11.inMutable = r5
            goto L5b
        L24:
            boolean r5 = r9.b
            if (r5 != 0) goto L5b
            int r5 = r9.f
            switch(r5) {
                case 0: goto L3a;
                default: goto L2d;
            }
        L2d:
            android.graphics.Bitmap$Config r5 = defpackage.AbstractC1327Qu.d(r11)
            if (r5 != 0) goto L35
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L35:
            int r1 = defpackage.AbstractC6699qi.c(r1, r2, r5)
            goto L42
        L3a:
            android.graphics.Bitmap$Config r5 = r11.inPreferredConfig
            if (r5 == 0) goto L53
            int r1 = defpackage.AbstractC6699qi.c(r1, r2, r5)
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
            android.graphics.ColorSpace$Named r12 = defpackage.AbstractC1327Qu.B()
            android.graphics.ColorSpace r12 = defpackage.AbstractC1327Qu.g(r12)
        L6a:
            defpackage.AbstractC1327Qu.u(r11, r12)
        L6d:
            kC0 r12 = r9.e
            java.lang.Object r2 = r12.i()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            if (r2 != 0) goto L7f
            sD r2 = defpackage.KD.a
            r2 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
        L7f:
            byte[] r3 = r2.array()     // Catch: java.lang.Throwable -> Lae java.lang.RuntimeException -> Lb0 java.lang.IllegalArgumentException -> Lb2
            r11.inTempStorage = r3     // Catch: java.lang.Throwable -> Lae java.lang.RuntimeException -> Lb0 java.lang.IllegalArgumentException -> Lb2
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r10, r7, r11)     // Catch: java.lang.Throwable -> Lae java.lang.RuntimeException -> Lb0 java.lang.IllegalArgumentException -> Lb2
            r12.d(r2)
            if (r1 == 0) goto L9e
            if (r1 == r10) goto L9e
            r8.d(r1)
            if (r10 == 0) goto L98
            r10.recycle()
        L98:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L9e:
            boolean r11 = r9.c
            if (r11 == 0) goto La9
            Fv0 r11 = defpackage.C0474Fv0.c
            UE r10 = defpackage.AbstractC8446zt.S(r10, r11, r0)
            return r10
        La9:
            UE r10 = defpackage.AbstractC8446zt.S(r10, r8, r0)
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
            r8.d(r1)     // Catch: java.lang.Throwable -> Lae
        Lb9:
            throw r10     // Catch: java.lang.Throwable -> Lae
        Lba:
            if (r1 == 0) goto Lbf
            r8.d(r1)     // Catch: java.lang.Throwable -> Lae
        Lbf:
            r10.reset()     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
            if (r10 == 0) goto Ld4
            pl0 r1 = defpackage.C6518pl0.l()     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
            UE r10 = defpackage.AbstractC8446zt.S(r10, r1, r0)     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
            r12.d(r2)
            return r10
        Ld4:
            throw r11     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Ld5
        Ld5:
            throw r11     // Catch: java.lang.Throwable -> Lae
        Ld6:
            r12.d(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.O8.c(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.ColorSpace):UE");
    }
}
