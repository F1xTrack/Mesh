package defpackage;

/* renamed from: wG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7761wG1 implements InterfaceC6053nJ1, UE1, InterfaceC8207yc1 {
    public final /* synthetic */ int a;

    public /* synthetic */ C7761wG1(int i) {
        this.a = i;
    }

    public static final C7577vI1 a(Object obj, Object obj2) {
        C7577vI1 c7577vI1E = (C7577vI1) obj;
        C7577vI1 c7577vI1 = (C7577vI1) obj2;
        if (!c7577vI1.isEmpty()) {
            if (!c7577vI1E.a) {
                c7577vI1E = c7577vI1E.e();
            }
            c7577vI1E.l();
            if (!c7577vI1.isEmpty()) {
                c7577vI1E.putAll(c7577vI1);
            }
        }
        return c7577vI1E;
    }

    @Override // defpackage.InterfaceC8207yc1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                Long l = (Long) UW1.W.a();
                l.getClass();
                return l;
            default:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.b0.a()).longValue());
        }
    }
}
