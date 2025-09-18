package p000;

/* renamed from: sz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11101sz0 {

    /* renamed from: b */
    public static final C11101sz0 f42744b = new C11101sz0(1, "SUCCESS");

    /* renamed from: a */
    public final int f42745a;

    public C11101sz0(int i, String str) {
        if (i != 0) {
            this.f42745a = i;
        } else {
            m24812a(3);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m24812a(int r10) {
        /*
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            if (r10 == r3) goto Lf
            if (r10 == r2) goto Lf
            if (r10 == r1) goto Lf
            if (r10 == r0) goto Lf
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
            goto L11
        Lf:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L11:
            if (r10 == r3) goto L1b
            if (r10 == r2) goto L1b
            if (r10 == r1) goto L1b
            if (r10 == r0) goto L1b
            r5 = r2
            goto L1c
        L1b:
            r5 = r1
        L1c:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "success"
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
            r8 = 0
            if (r10 == r3) goto L31
            if (r10 == r2) goto L31
            if (r10 == r1) goto L2e
            if (r10 == r0) goto L31
            r5[r8] = r7
            goto L35
        L2e:
            r5[r8] = r6
            goto L35
        L31:
            java.lang.String r9 = "debugMessage"
            r5[r8] = r9
        L35:
            switch(r10) {
                case 1: goto L45;
                case 2: goto L45;
                case 3: goto L45;
                case 4: goto L45;
                case 5: goto L40;
                case 6: goto L3b;
                default: goto L38;
            }
        L38:
            r5[r3] = r6
            goto L47
        L3b:
            java.lang.String r6 = "getDebugMessage"
            r5[r3] = r6
            goto L47
        L40:
            java.lang.String r6 = "getResult"
            r5[r3] = r6
            goto L47
        L45:
            r5[r3] = r7
        L47:
            if (r10 == r3) goto L5a
            if (r10 == r2) goto L55
            if (r10 == r1) goto L50
            if (r10 == r0) goto L50
            goto L5e
        L50:
            java.lang.String r6 = "<init>"
            r5[r2] = r6
            goto L5e
        L55:
            java.lang.String r6 = "conflict"
            r5[r2] = r6
            goto L5e
        L5a:
            java.lang.String r6 = "incompatible"
            r5[r2] = r6
        L5e:
            java.lang.String r4 = java.lang.String.format(r4, r5)
            if (r10 == r3) goto L70
            if (r10 == r2) goto L70
            if (r10 == r1) goto L70
            if (r10 == r0) goto L70
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
            goto L75
        L70:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
        L75:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11101sz0.m24812a(int):void");
    }

    /* renamed from: b */
    public static C11101sz0 m24813b(String str) {
        return new C11101sz0(3, str);
    }

    /* renamed from: d */
    public static C11101sz0 m24814d(String str) {
        return new C11101sz0(2, str);
    }

    /* renamed from: c */
    public final int m24815c() {
        int i = this.f42745a;
        if (i != 0) {
            return i;
        }
        m24812a(5);
        throw null;
    }
}
