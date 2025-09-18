package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yh0 */
/* loaded from: classes2.dex */
public final class C8221yh0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C8411zh0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8221yh0(C8411zh0 c8411zh0, int i) {
        super(0);
        this.e = i;
        this.f = c8411zh0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return AbstractC7437uZ1.b(this.f);
            case 1:
                C8411zh0 c8411zh0 = this.f;
                ArrayList typeParameters = c8411zh0.h.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(typeParameters));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    C7406uP0 c7406uP0 = (C7406uP0) it.next();
                    InterfaceC5925me1 interfaceC5925me1L = ((InterfaceC6307oe1) c8411zh0.j.c).l(c7406uP0);
                    if (interfaceC5925me1L == null) {
                        throw new AssertionError("Parameter " + c7406uP0 + " surely belongs to class " + c8411zh0.h + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC5925me1L);
                }
                return arrayList;
            default:
                C8411zh0 c8411zh02 = this.f;
                if (AbstractC7384uI.f(c8411zh02) == null) {
                    return null;
                }
                ((OJ1) ((C4375ib0) c8411zh02.g.b).w).getClass();
                return null;
        }
    }
}
