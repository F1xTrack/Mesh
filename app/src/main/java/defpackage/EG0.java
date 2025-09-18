package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class EG0 implements InterfaceC3296cx0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ EG0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC3296cx0
    public final void a(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((InterfaceC6556py) obj2).b(obj);
                return;
            case 1:
                ((C3954gO0) obj2).b.e((Boolean) obj);
                return;
            default:
                C0422Fe c0422Fe = (C0422Fe) obj;
                if (c0422Fe == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                C1371Ri1 c1371Ri1 = (C1371Ri1) obj2;
                if (c1371Ri1.u == 3) {
                    return;
                }
                Objects.toString(c1371Ri1.q);
                c0422Fe.toString();
                AbstractC0759Jm0.f("VideoCapture");
                C0422Fe c0422Fe2 = c1371Ri1.q;
                c1371Ri1.q = c0422Fe;
                C0500Ge c0500Ge = c1371Ri1.g;
                c0500Ge.getClass();
                int i = c0422Fe2.a;
                Set set = C0422Fe.e;
                boolean zContains = set.contains(Integer.valueOf(i));
                int i2 = c0422Fe.a;
                if ((!zContains && !set.contains(Integer.valueOf(i2)) && i != i2) || (c1371Ri1.y && c0422Fe2.c != null && c0422Fe.c == null)) {
                    c1371Ri1.N();
                    return;
                }
                int i3 = c0422Fe2.a;
                if ((i3 != -1 && i2 == -1) || (i3 == -1 && i2 != -1)) {
                    c1371Ri1.H(c1371Ri1.r, c0422Fe, c0500Ge);
                    Object[] objArr = {c1371Ri1.r.d()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    arrayList.add(obj3);
                    c1371Ri1.E(Collections.unmodifiableList(arrayList));
                    c1371Ri1.q();
                    return;
                }
                if (c0422Fe2.b != c0422Fe.b) {
                    c1371Ri1.H(c1371Ri1.r, c0422Fe, c0500Ge);
                    Object[] objArr2 = {c1371Ri1.r.d()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj4 = objArr2[0];
                    Objects.requireNonNull(obj4);
                    arrayList2.add(obj4);
                    c1371Ri1.E(Collections.unmodifiableList(arrayList2));
                    Iterator it = c1371Ri1.a.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3630eh1) it.next()).i(c1371Ri1);
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC3296cx0
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                AbstractC0759Jm0.f("ObserverToConsumerAdapter");
                break;
            case 1:
                C0743Jh c0743Jh = ((C3954gO0) this.b).b;
                c0743Jh.getClass();
                c0743Jh.e(new C0032Ae(th));
                break;
            default:
                AbstractC0759Jm0.f("VideoCapture");
                break;
        }
    }
}
