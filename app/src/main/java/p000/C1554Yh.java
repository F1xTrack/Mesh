package p000;

/* renamed from: Yh */
/* loaded from: classes.dex */
public final class C1554Yh implements InterfaceC10907rS0 {

    /* renamed from: b */
    public static final C11864yy0 f14452b = C11864yy0.m26288a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c */
    public static final C11864yy0 f14453c = new C11864yy0("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C11864yy0.f46557e);

    /* renamed from: a */
    public final C11967zm0 f14454a;

    public C1554Yh(C11967zm0 c11967zm0) {
        this.f14454a = c11967zm0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    @Override // p000.InterfaceC1782bO
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo397n(java.lang.Object r6, java.io.File r7, p000.C7830Jy0 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            kS0 r6 = (p000.InterfaceC10011kS0) r6
            java.lang.Object r6 = r6.get()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            yy0 r0 = p000.C1554Yh.f14453c
            java.lang.Object r1 = r8.m4482c(r0)
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
            int r2 = p000.AbstractC10433nl0.f38500a
            android.os.SystemClock.elapsedRealtimeNanos()
            yy0 r2 = p000.C1554Yh.f14452b
            java.lang.Object r2 = r8.m4482c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L61
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L61
            zm0 r7 = r5.f14454a
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
            p000.AbstractC7381Bh1.m804c(r6)
            android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Object r8 = r8.m4482c(r0)
            java.util.Objects.toString(r8)
            r6.hasAlpha()
        L85:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1554Yh.mo397n(java.lang.Object, java.io.File, Jy0):boolean");
    }

    @Override // p000.InterfaceC10907rS0
    /* renamed from: r */
    public final int mo401r(C7830Jy0 c7830Jy0) {
        return 2;
    }
}
