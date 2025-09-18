package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class SG1 implements InterfaceC6053nJ1, LM {
    public final /* synthetic */ int a;

    public /* synthetic */ SG1(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.LM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C7902x1 a(android.content.Context r3, java.lang.String r4, defpackage.KM r5) {
        /*
            r2 = this;
            x1 r0 = new x1
            r0.<init>()
            int r1 = r5.b(r3, r4)
            r0.a = r1
            r1 = 1
            int r3 = r5.a(r3, r4, r1)
            r0.b = r3
            int r4 = r0.a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SG1.a(android.content.Context, java.lang.String, KM):x1");
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                return (String) UW1.U.a();
            default:
                AX1.b.get();
                Boolean bool = (Boolean) FX1.b.a();
                bool.getClass();
                return bool;
        }
    }
}
