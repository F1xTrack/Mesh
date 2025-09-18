package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Tc0 */
/* loaded from: classes2.dex */
public final class C1508Tc0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C0231Cs0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1508Tc0(C0231Cs0 c0231Cs0, int i) {
        super(0);
        this.e = i;
        this.f = c0231Cs0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return new C1430Sc0(this.f);
            case 1:
                C0231Cs0 c0231Cs0 = this.f;
                C0481Fx1 c0481Fx1 = c0231Cs0.h;
                if (c0481Fx1 == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = c0231Cs0.getName().a;
                    O90.e(str, "toString(...)");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                c0231Cs0.x1();
                List list = (List) c0481Fx1.a;
                list.contains(c0231Cs0);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((C0231Cs0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    InterfaceC0174Bz0 interfaceC0174Bz0 = ((C0231Cs0) it2.next()).i;
                    O90.c(interfaceC0174Bz0);
                    arrayList.add(interfaceC0174Bz0);
                }
                return new C1798Wv(arrayList, "CompositeProvider@ModuleDescriptor for " + c0231Cs0.getName());
            default:
                return ((C1835Xh0) this.f.C0(AbstractC6581q41.i)).h;
        }
    }
}
