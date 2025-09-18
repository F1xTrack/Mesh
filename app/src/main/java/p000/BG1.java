package p000;

/* loaded from: classes.dex */
public final /* synthetic */ class BG1 implements InterfaceC10378nJ1, InterfaceC0750Lv, InterfaceC11821yc1 {

    /* renamed from: a */
    public final /* synthetic */ int f697a;

    public /* synthetic */ BG1(int i) {
        this.f697a = i;
    }

    @Override // p000.InterfaceC11821yc1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        return new PQ0(c8128Pr0.mo4068c(OJ1.class));
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f697a) {
            case 0:
                BW1.f864b.get();
                Boolean bool = (Boolean) GW1.f3795a.m8754a();
                bool.getClass();
                return bool;
            case 1:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11893t.m8754a()).longValue());
            default:
                RW1.f10254b.get();
                return Integer.valueOf((int) ((Long) XW1.f13828a.m8754a()).longValue());
        }
    }
}
