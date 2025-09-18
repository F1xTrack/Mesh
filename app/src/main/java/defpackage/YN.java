package defpackage;

/* loaded from: classes.dex */
public final class YN extends AbstractC8332zH {
    public final CC0 c;
    public final O01 d;
    public final boolean e;
    public final boolean f;

    public YN(AbstractC1516Tf abstractC1516Tf, CC0 cc0, O01 o01, boolean z) {
        super(abstractC1516Tf);
        this.c = cc0;
        this.d = o01;
        this.e = z;
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x006a A[Catch: all -> 0x005a, TryCatch #2 {all -> 0x005a, blocks: (B:60:0x0002, B:69:0x0018, B:72:0x0021, B:83:0x003b, B:86:0x0048, B:89:0x0053, B:94:0x005d, B:95:0x0060, B:97:0x0062, B:98:0x0065, B:101:0x006a, B:99:0x0066, B:100:0x0069, B:102:0x006e, B:85:0x0040, B:74:0x0027, B:76:0x002b, B:78:0x002f, B:88:0x004d), top: B:111:0x0002, inners: #0, #1, #3 }] */
    @Override // defpackage.AbstractC1516Tf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            com.facebook.imagepipeline.image.EncodedImage r6 = (com.facebook.imagepipeline.image.EncodedImage) r6
            defpackage.AbstractC4368iZ.b()     // Catch: java.lang.Throwable -> L5a
            boolean r0 = defpackage.AbstractC1516Tf.b(r5)     // Catch: java.lang.Throwable -> L5a
            Tf r1 = r4.b
            if (r0 != 0) goto L6e
            if (r6 == 0) goto L6e
            r0 = r5 & 10
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 != 0) goto L6e
            D60 r0 = r6.getImageFormat()     // Catch: java.lang.Throwable -> L5a
            D60 r2 = defpackage.D60.c     // Catch: java.lang.Throwable -> L5a
            if (r0 != r2) goto L21
            goto L6e
        L21:
            zt r0 = r6.getByteBufferRef()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L6a
            boolean r2 = r4.f     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            boolean r2 = r4.e     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            CC0 r2 = r4.c     // Catch: java.lang.Throwable -> L38
            O01 r3 = r4.d     // Catch: java.lang.Throwable -> L38
            zt r2 = r2.j0(r3, r0)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r5 = move-exception
            goto L66
        L3a:
            r2 = 0
        L3b:
            defpackage.AbstractC8446zt.p(r0)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L6a
            com.facebook.imagepipeline.image.EncodedImage r0 = new com.facebook.imagepipeline.image.EncodedImage     // Catch: java.lang.Throwable -> L61
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L61
            r0.copyMetaDataFrom(r6)     // Catch: java.lang.Throwable -> L61
            defpackage.AbstractC8446zt.p(r2)     // Catch: java.lang.Throwable -> L5a
            r6 = 1065353216(0x3f800000, float:1.0)
            r1.i(r6)     // Catch: java.lang.Throwable -> L5c
            r1.g(r5, r0)     // Catch: java.lang.Throwable -> L5c
            com.facebook.imagepipeline.image.EncodedImage.closeSafely(r0)     // Catch: java.lang.Throwable -> L5a
        L56:
            defpackage.AbstractC4368iZ.b()
            goto L72
        L5a:
            r5 = move-exception
            goto L73
        L5c:
            r5 = move-exception
            com.facebook.imagepipeline.image.EncodedImage.closeSafely(r0)     // Catch: java.lang.Throwable -> L5a
            throw r5     // Catch: java.lang.Throwable -> L5a
        L61:
            r5 = move-exception
            defpackage.AbstractC8446zt.p(r2)     // Catch: java.lang.Throwable -> L5a
            throw r5     // Catch: java.lang.Throwable -> L5a
        L66:
            defpackage.AbstractC8446zt.p(r0)     // Catch: java.lang.Throwable -> L5a
            throw r5     // Catch: java.lang.Throwable -> L5a
        L6a:
            r1.g(r5, r6)     // Catch: java.lang.Throwable -> L5a
            goto L56
        L6e:
            r1.g(r5, r6)     // Catch: java.lang.Throwable -> L5a
            goto L56
        L72:
            return
        L73:
            defpackage.AbstractC4368iZ.b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YN.h(int, java.lang.Object):void");
    }
}
