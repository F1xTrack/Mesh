package p000;

/* renamed from: wG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11523wG1 implements InterfaceC10378nJ1, UE1, InterfaceC11821yc1 {

    /* renamed from: a */
    public final /* synthetic */ int f44744a;

    public /* synthetic */ C11523wG1(int i) {
        this.f44744a = i;
    }

    /* renamed from: a */
    public static final C11400vI1 m25582a(Object obj, Object obj2) {
        C11400vI1 c11400vI1M25384e = (C11400vI1) obj;
        C11400vI1 c11400vI1 = (C11400vI1) obj2;
        if (!c11400vI1.isEmpty()) {
            if (!c11400vI1M25384e.f44325a) {
                c11400vI1M25384e = c11400vI1M25384e.m25384e();
            }
            c11400vI1M25384e.m25387l();
            if (!c11400vI1.isEmpty()) {
                c11400vI1M25384e.putAll(c11400vI1);
            }
        }
        return c11400vI1M25384e;
    }

    @Override // p000.InterfaceC11821yc1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f44744a) {
            case 0:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11855W.m8754a();
                l.getClass();
                return l;
            default:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11862b0.m8754a()).longValue());
        }
    }
}
