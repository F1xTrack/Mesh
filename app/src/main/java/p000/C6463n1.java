package p000;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: n1 */
/* loaded from: classes2.dex */
public final class C6463n1 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ int f38039a;

    /* renamed from: b */
    public final /* synthetic */ Object f38040b;

    public /* synthetic */ C6463n1(int i, Object obj) {
        this.f38039a = i;
        this.f38040b = obj;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f38039a) {
            case 0:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                C6526o1 c6526o1 = (C6526o1) this.f38040b;
                sb.append(((C8340Tt0) c6526o1.f38685b).m7801b());
                return AbstractC10922rZ1.m24427a(sb.toString(), ((AbstractC6654q1) c6526o1.f38686c).getUpperBounds());
            case 1:
                C1032QO c1032qo = (C1032QO) this.f38040b;
                c1032qo.getClass();
                HashSet hashSet = new HashSet();
                for (C8340Tt0 c8340Tt0 : (Set) c1032qo.f9609e.f10153i.invoke()) {
                    EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47099f;
                    hashSet.addAll(c1032qo.mo1769a(c8340Tt0, enumC11985zv0));
                    hashSet.addAll(c1032qo.mo1771e(c8340Tt0, enumC11985zv0));
                }
                return hashSet;
            default:
                return (List) this.f38040b;
        }
    }
}
