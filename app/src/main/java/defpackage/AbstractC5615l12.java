package defpackage;

/* renamed from: l12 */
/* loaded from: classes.dex */
public abstract class AbstractC5615l12 {
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable a(defpackage.InterfaceC6472pW r5, defpackage.InterfaceC6853rW r6, defpackage.AbstractC1963Yy r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C7235tW
            if (r0 == 0) goto L13
            r0 = r7
            tW r0 = (defpackage.C7235tW) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tW r0 = new tW
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            TO0 r5 = r0.a
            defpackage.RQ1.d(r7)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            r1 = r6
            goto L52
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.RQ1.d(r7)
            TO0 r7 = new TO0
            r7.<init>()
            vW r2 = new vW     // Catch: java.lang.Throwable -> L4f
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4f
            r0.a = r7     // Catch: java.lang.Throwable -> L4f
            r0.c = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L4d
            goto L92
        L4d:
            r1 = 0
            goto L92
        L4f:
            r5 = move-exception
            r1 = r5
            r5 = r7
        L52:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5e
            boolean r6 = r5.equals(r1)
            if (r6 != 0) goto L8f
        L5e:
            Bz r6 = r0.getContext()
            Ev0 r7 = defpackage.C0396Ev0.e
            zz r6 = r6.g(r7)
            Ob0 r6 = (defpackage.InterfaceC1115Ob0) r6
            if (r6 == 0) goto L90
            cc0 r6 = (defpackage.C2548cc0) r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.C2548cc0.a
            java.lang.Object r7 = r7.get(r6)
            boolean r0 = r7 instanceof defpackage.C6165nv
            if (r0 != 0) goto L84
            boolean r0 = r7 instanceof defpackage.C2167ac0
            if (r0 == 0) goto L90
            ac0 r7 = (defpackage.C2167ac0) r7
            boolean r7 = r7.d()
            if (r7 == 0) goto L90
        L84:
            java.util.concurrent.CancellationException r6 = r6.u()
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L8f
            goto L90
        L8f:
            throw r1
        L90:
            if (r5 != 0) goto L93
        L92:
            return r1
        L93:
            boolean r6 = r1 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L9b
            defpackage.I02.a(r5, r1)
            throw r5
        L9b:
            defpackage.I02.a(r1, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5615l12.a(pW, rW, Yy):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.InterfaceC6472pW r6, defpackage.AbstractC1963Yy r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C8377zW
            if (r0 == 0) goto L13
            r0 = r7
            zW r0 = (defpackage.C8377zW) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zW r0 = new zW
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            yG r3 = defpackage.XA1.a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            yW r6 = r0.b
            TO0 r0 = r0.a
            defpackage.RQ1.d(r7)     // Catch: defpackage.r -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.RQ1.d(r7)
            TO0 r7 = new TO0
            r7.<init>()
            r7.a = r3
            yW r2 = new yW
            r5 = 0
            r2.<init>(r7, r5)
            r0.a = r7     // Catch: defpackage.r -> L56
            r0.b = r2     // Catch: defpackage.r -> L56
            r0.d = r4     // Catch: defpackage.r -> L56
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: defpackage.r -> L56
            if (r6 != r1) goto L54
            goto L62
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            rW r1 = r7.a
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r1 = r0.a
            if (r1 == r3) goto L63
        L62:
            return r1
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5615l12.b(pW, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1 r5, defpackage.InterfaceC1729Vy r6) {
        /*
            boolean r0 = r6 instanceof defpackage.AW
            if (r0 == 0) goto L13
            r0 = r6
            AW r0 = (defpackage.AW) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            AW r0 = new AW
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yW r5 = r0.b
            TO0 r0 = r0.a
            defpackage.RQ1.d(r6)     // Catch: defpackage.r -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.RQ1.d(r6)
            TO0 r6 = new TO0
            r6.<init>()
            yW r2 = new yW
            r4 = 1
            r2.<init>(r6, r4)
            r0.a = r6     // Catch: defpackage.r -> L52
            r0.b = r2     // Catch: defpackage.r -> L52
            r0.d = r3     // Catch: defpackage.r -> L52
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: defpackage.r -> L52
            if (r5 != r1) goto L50
            goto L5c
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            rW r1 = r6.a
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r1 = r0.a
        L5c:
            return r1
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5615l12.c(com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1, Vy):java.lang.Object");
    }

    public static final C0376Eo1 d(C1623Uo1 c1623Uo1) {
        O90.f(c1623Uo1, "<this>");
        return new C0376Eo1(c1623Uo1.a, c1623Uo1.t);
    }
}
