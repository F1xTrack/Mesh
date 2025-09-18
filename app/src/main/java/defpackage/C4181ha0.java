package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ha0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4181ha0 implements InterfaceC8440zr {
    public static final C4181ha0 b = new C4181ha0(0);
    public static final C4181ha0 c = new C4181ha0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C4181ha0(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC8440zr
    public final boolean a(C3611eb0 c3611eb0) {
        X01 x01Y;
        switch (this.a) {
            case 0:
                C1758Wh1 c1758Wh1 = (C1758Wh1) c3611eb0.f0().get(1);
                C3759fN c3759fN = RP0.d;
                O90.c(c1758Wh1);
                InterfaceC0153Bs0 interfaceC0153Bs0J = AbstractC7384uI.j(c1758Wh1);
                c3759fN.getClass();
                InterfaceC7492us interfaceC7492usB = AbstractC3312d12.b(interfaceC0153Bs0J, AbstractC6390p41.Q);
                if (interfaceC7492usB == null) {
                    x01Y = null;
                } else {
                    C0733Jd1.b.getClass();
                    C0733Jd1 c0733Jd1 = C0733Jd1.c;
                    List parameters = interfaceC7492usB.v().getParameters();
                    O90.e(parameters, "getParameters(...)");
                    Object objR = AbstractC8069xu.R(parameters);
                    O90.e(objR, "single(...)");
                    x01Y = NV1.y(c0733Jd1, interfaceC7492usB, AbstractC8259yu.e(new C6962s41((InterfaceC5925me1) objR)));
                }
                if (x01Y == null) {
                    return false;
                }
                AbstractC0663Ig0 type = c1758Wh1.getType();
                O90.e(type, "getType(...)");
                return InterfaceC0819Kg0.a.b(x01Y, AbstractC0112Be1.g(type, false));
            default:
                List listF0 = c3611eb0.f0();
                O90.e(listF0, "getValueParameters(...)");
                List<C1758Wh1> list = listF0;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                for (C1758Wh1 c1758Wh12 : list) {
                    O90.c(c1758Wh12);
                    if (AbstractC7384uI.a(c1758Wh12) || c1758Wh12.k != null) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // defpackage.InterfaceC8440zr
    public final String b(C3611eb0 c3611eb0) {
        switch (this.a) {
        }
        return KS1.a(this, c3611eb0);
    }

    @Override // defpackage.InterfaceC8440zr
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
