package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Tc0 */
/* loaded from: classes2.dex */
public final class C8306Tc0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f11444e;

    /* renamed from: f */
    public final /* synthetic */ C7454Cs0 f11445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8306Tc0(C7454Cs0 c7454Cs0, int i) {
        super(0);
        this.f11444e = i;
        this.f11445f = c7454Cs0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f11444e) {
            case 0:
                return new C8254Sc0(this.f11445f);
            case 1:
                C7454Cs0 c7454Cs0 = this.f11445f;
                C7621Fx1 c7621Fx1 = c7454Cs0.f1738h;
                if (c7621Fx1 == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = c7454Cs0.getName().f11577a;
                    O90.m5967e(str, "toString(...)");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                c7454Cs0.m1425x1();
                List list = (List) c7621Fx1.f3494a;
                list.contains(c7454Cs0);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((C7454Cs0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    InterfaceC7416Bz0 interfaceC7416Bz0 = ((C7454Cs0) it2.next()).f1739i;
                    O90.m5965c(interfaceC7416Bz0);
                    arrayList.add(interfaceC7416Bz0);
                }
                return new C1442Wv(arrayList, "CompositeProvider@ModuleDescriptor for " + c7454Cs0.getName());
            default:
                return ((C8524Xh0) this.f11445f.mo895C0(AbstractC10732q41.f40585i)).f13926h;
        }
    }
}
