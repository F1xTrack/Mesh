package p000;

/* renamed from: E */
/* loaded from: classes2.dex */
public abstract class AbstractC0252E extends AbstractC6337l1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0252E(Z41 z41) {
        super(z41);
        if (z41 != null) {
        } else {
            m1961l(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m1961l(int r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0252E.m1961l(int):void");
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: f */
    public final AbstractC7742Ig0 mo1963f() {
        InterfaceC6976us interfaceC6976usMo1962a = mo1962a();
        if (interfaceC6976usMo1962a == null) {
            AbstractC11955zg0.m26490a(108);
            throw null;
        }
        C8340Tt0 c8340Tt0 = AbstractC11955zg0.f46926e;
        if (AbstractC11955zg0.m26491b(interfaceC6976usMo1962a, AbstractC10604p41.f39800a) || AbstractC11955zg0.m26491b(interfaceC6976usMo1962a, AbstractC10604p41.f39802b)) {
            return null;
        }
        return mo1964h().m26498e();
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: h */
    public final AbstractC11955zg0 mo1964h() {
        AbstractC11955zg0 abstractC11955zg0M25152e = AbstractC6940uI.m25152e(mo1962a());
        if (abstractC11955zg0M25152e != null) {
            return abstractC11955zg0M25152e;
        }
        m1961l(1);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r6 = true;
     */
    @Override // p000.AbstractC6337l1
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1965j(p000.InterfaceC0873Ns r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.InterfaceC6976us
            r1 = 0
            if (r0 == 0) goto L73
            us r0 = r5.mo1962a()
            java.lang.String r2 = "first"
            p000.O90.m5968f(r0, r2)
            Tt0 r2 = r0.getName()
            Tt0 r3 = r6.getName()
            boolean r2 = p000.O90.m5963a(r2, r3)
            r3 = 1
            if (r2 != 0) goto L1f
        L1d:
            r6 = r1
            goto L70
        L1f:
            CD r0 = r0.mo423i()
            CD r6 = r6.mo423i()
        L27:
            if (r0 == 0) goto L6f
            if (r6 == 0) goto L6f
            boolean r2 = r0 instanceof p000.InterfaceC7402Bs0
            if (r2 == 0) goto L32
            boolean r6 = r6 instanceof p000.InterfaceC7402Bs0
            goto L70
        L32:
            boolean r2 = r6 instanceof p000.InterfaceC7402Bs0
            if (r2 == 0) goto L37
            goto L1d
        L37:
            boolean r2 = r0 instanceof p000.InterfaceC11993zz0
            if (r2 == 0) goto L52
            boolean r2 = r6 instanceof p000.InterfaceC11993zz0
            if (r2 == 0) goto L1d
            zz0 r0 = (p000.InterfaceC11993zz0) r0
            Az0 r0 = (p000.AbstractC7364Az0) r0
            zz0 r6 = (p000.InterfaceC11993zz0) r6
            Az0 r6 = (p000.AbstractC7364Az0) r6
            KX r0 = r0.f494f
            KX r6 = r6.f494f
            boolean r6 = p000.O90.m5963a(r0, r6)
            if (r6 == 0) goto L1d
            goto L6f
        L52:
            boolean r2 = r6 instanceof p000.InterfaceC11993zz0
            if (r2 == 0) goto L57
            goto L1d
        L57:
            Tt0 r2 = r0.getName()
            Tt0 r4 = r6.getName()
            boolean r2 = p000.O90.m5963a(r2, r4)
            if (r2 != 0) goto L66
            goto L1d
        L66:
            CD r0 = r0.mo423i()
            CD r6 = r6.mo423i()
            goto L27
        L6f:
            r6 = r3
        L70:
            if (r6 == 0) goto L73
            r1 = r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0252E.mo1965j(Ns):boolean");
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC6976us mo1962a();
}
