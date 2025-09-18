package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class BG1 implements InterfaceC6053nJ1, InterfaceC0940Lv, InterfaceC8207yc1 {
    public final /* synthetic */ int a;

    public /* synthetic */ BG1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC8207yc1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        return new PQ0(c1241Pr0.c(OJ1.class));
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                BW1.b.get();
                Boolean bool = (Boolean) GW1.a.a();
                bool.getClass();
                return bool;
            case 1:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.t.a()).longValue());
            default:
                RW1.b.get();
                return Integer.valueOf((int) ((Long) XW1.a.a()).longValue());
        }
    }
}
