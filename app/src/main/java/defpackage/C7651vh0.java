package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* renamed from: vh0 */
/* loaded from: classes2.dex */
public final class C7651vh0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C7841wh0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7651vh0(C7841wh0 c7841wh0, int i) {
        super(0);
        this.e = i;
        this.f = c7841wh0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.e) {
            case 0:
                C7841wh0 c7841wh0 = this.f;
                ArrayList arrayListB = c7841wh0.b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    InterfaceC1268Qa0 interfaceC1268Qa0 = (InterfaceC1268Qa0) it.next();
                    C1559Tt0 c1559Tt0 = ((XO0) interfaceC1268Qa0).a;
                    if (c1559Tt0 == null) {
                        c1559Tt0 = AbstractC1118Oc0.b;
                    }
                    AbstractC0323Dx abstractC0323DxA = c7841wh0.a(interfaceC1268Qa0);
                    Pair pair = abstractC0323DxA != null ? new Pair(c1559Tt0, abstractC0323DxA) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return AbstractC7096sn0.n(arrayList);
            case 1:
                return VO0.a(P22.b(P22.a(this.f.b.a))).b();
            default:
                C7841wh0 c7841wh02 = this.f;
                KX kxF = c7841wh02.f();
                WO0 wo0 = c7841wh02.b;
                if (kxF == null) {
                    return C5496kP.c(EnumC5305jP.E, wo0.toString());
                }
                C6045nH c6045nH = c7841wh02.a;
                InterfaceC7492us interfaceC7492usU = C0318Dv0.u(kxF, ((C0231Cs0) ((C4375ib0) c6045nH.b).o).e);
                if (interfaceC7492usU == null) {
                    C3957gP0 c3957gP0 = new C3957gP0(P22.b(P22.a(wo0.a)));
                    C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
                    C5996n11 c5996n11 = (C5996n11) c4375ib0.k;
                    c5996n11.getClass();
                    C0481Fx1 c0481Fx1 = (C0481Fx1) c5996n11.b;
                    if (c0481Fx1 == null) {
                        O90.o("resolver");
                        throw null;
                    }
                    interfaceC7492usU = c0481Fx1.x(c3957gP0);
                    if (interfaceC7492usU == null) {
                        interfaceC7492usU = AbstractC3312d12.d((C0231Cs0) c4375ib0.o, C0074As.j(kxF), ((LI) c4375ib0.d).c().l);
                    }
                }
                return interfaceC7492usU.m();
        }
    }
}
