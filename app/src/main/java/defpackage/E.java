package defpackage;

/* loaded from: classes2.dex */
public abstract class E extends AbstractC5612l1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Z41 z41) {
        super(z41);
        if (z41 != null) {
        } else {
            l(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void l(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E.l(int):void");
    }

    @Override // defpackage.AbstractC5612l1
    public final AbstractC0663Ig0 f() {
        InterfaceC7492us interfaceC7492usA = a();
        if (interfaceC7492usA == null) {
            AbstractC8408zg0.a(108);
            throw null;
        }
        C1559Tt0 c1559Tt0 = AbstractC8408zg0.e;
        if (AbstractC8408zg0.b(interfaceC7492usA, AbstractC6390p41.a) || AbstractC8408zg0.b(interfaceC7492usA, AbstractC6390p41.b)) {
            return null;
        }
        return h().e();
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final AbstractC8408zg0 h() {
        AbstractC8408zg0 abstractC8408zg0E = AbstractC7384uI.e(a());
        if (abstractC8408zg0E != null) {
            return abstractC8408zg0E;
        }
        l(1);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r6 = true;
     */
    @Override // defpackage.AbstractC5612l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(defpackage.InterfaceC1087Ns r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.InterfaceC7492us
            r1 = 0
            if (r0 == 0) goto L73
            us r0 = r5.a()
            java.lang.String r2 = "first"
            defpackage.O90.f(r0, r2)
            Tt0 r2 = r0.getName()
            Tt0 r3 = r6.getName()
            boolean r2 = defpackage.O90.a(r2, r3)
            r3 = 1
            if (r2 != 0) goto L1f
        L1d:
            r6 = r1
            goto L70
        L1f:
            CD r0 = r0.i()
            CD r6 = r6.i()
        L27:
            if (r0 == 0) goto L6f
            if (r6 == 0) goto L6f
            boolean r2 = r0 instanceof defpackage.InterfaceC0153Bs0
            if (r2 == 0) goto L32
            boolean r6 = r6 instanceof defpackage.InterfaceC0153Bs0
            goto L70
        L32:
            boolean r2 = r6 instanceof defpackage.InterfaceC0153Bs0
            if (r2 == 0) goto L37
            goto L1d
        L37:
            boolean r2 = r0 instanceof defpackage.InterfaceC8465zz0
            if (r2 == 0) goto L52
            boolean r2 = r6 instanceof defpackage.InterfaceC8465zz0
            if (r2 == 0) goto L1d
            zz0 r0 = (defpackage.InterfaceC8465zz0) r0
            Az0 r0 = (defpackage.AbstractC0096Az0) r0
            zz0 r6 = (defpackage.InterfaceC8465zz0) r6
            Az0 r6 = (defpackage.AbstractC0096Az0) r6
            KX r0 = r0.f
            KX r6 = r6.f
            boolean r6 = defpackage.O90.a(r0, r6)
            if (r6 == 0) goto L1d
            goto L6f
        L52:
            boolean r2 = r6 instanceof defpackage.InterfaceC8465zz0
            if (r2 == 0) goto L57
            goto L1d
        L57:
            Tt0 r2 = r0.getName()
            Tt0 r4 = r6.getName()
            boolean r2 = defpackage.O90.a(r2, r4)
            if (r2 != 0) goto L66
            goto L1d
        L66:
            CD r0 = r0.i()
            CD r6 = r6.i()
            goto L27
        L6f:
            r6 = r3
        L70:
            if (r6 == 0) goto L73
            r1 = r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E.j(Ns):boolean");
    }

    @Override // defpackage.InterfaceC1200Pd1
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC7492us a();
}
