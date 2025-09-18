package p000;

/* renamed from: qH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10758qH1 implements InterfaceC10378nJ1, InterfaceC9248eU1 {

    /* renamed from: a */
    public final /* synthetic */ int f40718a;

    public /* synthetic */ C10758qH1(int i) {
        this.f40718a = i;
    }

    @Override // p000.InterfaceC9248eU1
    /* renamed from: b */
    public boolean mo3057b(Class cls) {
        return false;
    }

    @Override // p000.InterfaceC9248eU1
    /* renamed from: d */
    public YU1 mo3059d(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f40718a) {
            case 0:
                PW1.f9104b.get();
                return (String) UW1.f11888o0.m8754a();
            case 1:
                CX1.f1423b.get();
                Boolean bool = (Boolean) HX1.f4337b.m8754a();
                bool.getClass();
                return bool;
            default:
                C9642hZ1.f28461b.get();
                Boolean bool2 = (Boolean) C10410nZ1.f38372d.m8754a();
                bool2.getClass();
                return bool2;
        }
    }
}
