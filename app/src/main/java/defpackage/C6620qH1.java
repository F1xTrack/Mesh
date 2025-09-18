package defpackage;

/* renamed from: qH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6620qH1 implements InterfaceC6053nJ1, InterfaceC3591eU1 {
    public final /* synthetic */ int a;

    public /* synthetic */ C6620qH1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC3591eU1
    public boolean b(Class cls) {
        return false;
    }

    @Override // defpackage.InterfaceC3591eU1
    public YU1 d(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                return (String) UW1.o0.a();
            case 1:
                CX1.b.get();
                Boolean bool = (Boolean) HX1.b.a();
                bool.getClass();
                return bool;
            default:
                C4179hZ1.b.get();
                Boolean bool2 = (Boolean) C6101nZ1.d.a();
                bool2.getClass();
                return bool2;
        }
    }
}
