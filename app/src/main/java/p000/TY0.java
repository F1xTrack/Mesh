package p000;

/* loaded from: classes.dex */
public final class TY0 implements QY0 {

    /* renamed from: f */
    public static final double f11418f = Math.random();

    /* renamed from: g */
    public static final /* synthetic */ int f11419g = 0;

    /* renamed from: a */
    public final C0786MU f11420a;

    /* renamed from: b */
    public final InterfaceC1478XU f11421b;

    /* renamed from: c */
    public final C10537oZ0 f11422c;

    /* renamed from: d */
    public final C7391Bm1 f11423d;

    /* renamed from: e */
    public final InterfaceC0125Bz f11424e;

    public TY0(C0786MU c0786mu, InterfaceC1478XU interfaceC1478XU, C10537oZ0 c10537oZ0, C7391Bm1 c7391Bm1, InterfaceC0125Bz interfaceC0125Bz) {
        this.f11420a = c0786mu;
        this.f11421b = interfaceC1478XU;
        this.f11422c = c10537oZ0;
        this.f11423d = c7391Bm1;
        this.f11424e = interfaceC0125Bz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7704a(p000.TY0 r4, p000.AbstractC1571Yy r5) {
        /*
            boolean r0 = r5 instanceof p000.SY0
            if (r0 == 0) goto L13
            r0 = r5
            SY0 r0 = (p000.SY0) r0
            int r1 = r0.f10852d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10852d = r1
            goto L18
        L13:
            SY0 r0 = new SY0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10850b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f10852d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            TY0 r4 = r0.f10849a
            p000.RQ1.m7017d(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            p000.RQ1.m7017d(r5)
            r0.f10849a = r4
            r0.f10852d = r3
            oZ0 r5 = r4.f11422c
            java.lang.Object r5 = r5.m23502b(r0)
            if (r5 != r1) goto L41
            goto L72
        L41:
            oZ0 r5 = r4.f11422c
            Fx1 r0 = r5.f39091a
            java.lang.Boolean r0 = r0.m2850m()
            if (r0 == 0) goto L50
            boolean r3 = r0.booleanValue()
            goto L5c
        L50:
            UQ0 r5 = r5.f39092b
            java.lang.Boolean r5 = r5.m8013a()
            if (r5 == 0) goto L5c
            boolean r3 = r5.booleanValue()
        L5c:
            if (r3 != 0) goto L61
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L72
        L61:
            oZ0 r4 = r4.f11422c
            double r4 = r4.m23501a()
            double r0 = p000.TY0.f11418f
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L70
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L72
        L70:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TY0.m7704a(TY0, Yy):java.lang.Object");
    }
}
