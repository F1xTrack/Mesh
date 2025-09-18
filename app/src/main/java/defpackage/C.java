package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class C implements InterfaceC5908mZ {
    public final /* synthetic */ int a;
    public final /* synthetic */ D b;

    public /* synthetic */ C(D d, int i) {
        this.a = i;
        this.b = d;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        D d = this.b;
        switch (this.a) {
            case 0:
                InterfaceC5578kq0 interfaceC5578kq0O0 = d.O0();
                B b = new B(0, this);
                C4147hP c4147hP = AbstractC0112Be1.a;
                if (C5496kP.f(d)) {
                    return C5496kP.c(EnumC5305jP.k, d.toString());
                }
                InterfaceC1200Pd1 interfaceC1200Pd1V = d.v();
                if (interfaceC1200Pd1V == null) {
                    AbstractC0112Be1.a(12);
                    throw null;
                }
                if (interfaceC5578kq0O0 == null) {
                    AbstractC0112Be1.a(13);
                    throw null;
                }
                List listD = AbstractC0112Be1.d(interfaceC1200Pd1V.getParameters());
                C0733Jd1.b.getClass();
                return NV1.C(C0733Jd1.c, interfaceC1200Pd1V, listD, false, interfaceC5578kq0O0, b);
            case 1:
                return new C7546v80(d.O0());
            default:
                return new C6887rh0(d);
        }
    }
}
