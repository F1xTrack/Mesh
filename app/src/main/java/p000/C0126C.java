package p000;

import java.util.List;

/* renamed from: C */
/* loaded from: classes2.dex */
public final class C0126C implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ int f1136a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0189D f1137b;

    public /* synthetic */ C0126C(AbstractC0189D abstractC0189D, int i) {
        this.f1136a = i;
        this.f1137b = abstractC0189D;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        AbstractC0189D abstractC0189D = this.f1137b;
        switch (this.f1136a) {
            case 0:
                InterfaceC10059kq0 interfaceC10059kq0Mo1487O0 = abstractC0189D.mo1487O0();
                C0063B c0063b = new C0063B(0, this);
                C4177hP c4177hP = AbstractC7375Be1.f963a;
                if (C6298kP.m22200f(abstractC0189D)) {
                    return C6298kP.m22197c(EnumC6235jP.f35126k, abstractC0189D.toString());
                }
                InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = abstractC0189D.mo1439v();
                if (interfaceC8101Pd1Mo1439v == null) {
                    AbstractC7375Be1.m783a(12);
                    throw null;
                }
                if (interfaceC10059kq0Mo1487O0 == null) {
                    AbstractC7375Be1.m783a(13);
                    throw null;
                }
                List listM786d = AbstractC7375Be1.m786d(interfaceC8101Pd1Mo1439v.getParameters());
                C7789Jd1.f5652b.getClass();
                return NV1.m5728C(C7789Jd1.f5653c, interfaceC8101Pd1Mo1439v, listM786d, false, interfaceC10059kq0Mo1487O0, c0063b);
            case 1:
                return new C11379v80(abstractC0189D.mo1487O0());
            default:
                return new C10937rh0(abstractC0189D);
        }
    }
}
