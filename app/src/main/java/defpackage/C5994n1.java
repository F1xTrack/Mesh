package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5994n1 implements InterfaceC5908mZ {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C5994n1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                C6185o1 c6185o1 = (C6185o1) this.b;
                sb.append(((C1559Tt0) c6185o1.b).b());
                return AbstractC6864rZ1.a(sb.toString(), ((AbstractC6567q1) c6185o1.c).getUpperBounds());
            case 1:
                QO qo = (QO) this.b;
                qo.getClass();
                HashSet hashSet = new HashSet();
                for (C1559Tt0 c1559Tt0 : (Set) qo.e.i.invoke()) {
                    EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.f;
                    hashSet.addAll(qo.a(c1559Tt0, enumC8453zv0));
                    hashSet.addAll(qo.e(c1559Tt0, enumC8453zv0));
                }
                return hashSet;
            default:
                return (List) this.b;
        }
    }
}
