package defpackage;

/* renamed from: Yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1912Yh implements InterfaceC6842rS0 {
    public static final C8272yy0 b = C8272yy0.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final C8272yy0 c = new C8272yy0("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C8272yy0.e);
    public final C8426zm0 a;

    public C1912Yh(C8426zm0 c8426zm0) {
        this.a = c8426zm0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    @Override // defpackage.InterfaceC2315bO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(java.lang.Object r6, java.io.File r7, defpackage.C0795Jy0 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            kS0 r6 = (defpackage.InterfaceC5506kS0) r6
            java.lang.Object r6 = r6.get()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            yy0 r0 = defpackage.C1912Yh.c
            java.lang.Object r1 = r8.c(r0)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L13
            goto L1e
        L13:
            boolean r1 = r6.hasAlpha()
            if (r1 == 0) goto L1c
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L1e
        L1c:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L1e:
            r6.getWidth()
            r6.getHeight()
            int r2 = defpackage.AbstractC6136nl0.a
            android.os.SystemClock.elapsedRealtimeNanos()
            yy0 r2 = defpackage.C1912Yh.b
            java.lang.Object r2 = r8.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L61
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L61
            zm0 r7 = r5.a
            if (r7 == 0) goto L4b
            Ij r3 = new Ij     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L49
            r3.<init>(r4, r7)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L49
            goto L4c
        L45:
            r3 = r4
            goto L5b
        L47:
            r3 = r4
            goto L61
        L49:
            r6 = move-exception
            goto L45
        L4b:
            r3 = r4
        L4c:
            r6.compress(r1, r2, r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L61
            r3.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L61
            r3.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            goto L58
        L56:
            r6 = move-exception
            goto L67
        L58:
            r7 = 1
            goto L69
        L5a:
            r6 = move-exception
        L5b:
            if (r3 == 0) goto L60
            r3.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L60
        L60:
            throw r6
        L61:
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L68
            goto L68
        L67:
            throw r6
        L68:
            r7 = 0
        L69:
            r2 = 2
            java.lang.String r3 = "BitmapEncoder"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L85
            java.util.Objects.toString(r1)
            defpackage.AbstractC0121Bh1.c(r6)
            android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Object r8 = r8.c(r0)
            java.util.Objects.toString(r8)
            r6.hasAlpha()
        L85:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1912Yh.n(java.lang.Object, java.io.File, Jy0):boolean");
    }

    @Override // defpackage.InterfaceC6842rS0
    public final int r(C0795Jy0 c0795Jy0) {
        return 2;
    }
}
