package defpackage;

/* renamed from: Nd1 */
/* loaded from: classes2.dex */
public final class C1044Nd1 extends AbstractC5719lZ1 {
    public static final C1044Nd1 b = new C1044Nd1(0);
    public static final C1044Nd1 c = new C1044Nd1(1);
    public static final C1044Nd1 d = new C1044Nd1(2);
    public final /* synthetic */ int a;

    public /* synthetic */ C1044Nd1(int i) {
        this.a = i;
    }

    @Override // defpackage.AbstractC5719lZ1
    public final Z01 b(C2005Zm c2005Zm, InterfaceC0974Mg0 interfaceC0974Mg0) {
        switch (this.a) {
            case 0:
                O90.f(c2005Zm, "state");
                O90.f(interfaceC0974Mg0, "type");
                return ((InterfaceC1009Ms) c2005Zm.d).x(interfaceC0974Mg0);
            case 1:
                O90.f(c2005Zm, "state");
                O90.f(interfaceC0974Mg0, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                O90.f(c2005Zm, "state");
                O90.f(interfaceC0974Mg0, "type");
                return ((InterfaceC1009Ms) c2005Zm.d).V(interfaceC0974Mg0);
        }
    }
}
