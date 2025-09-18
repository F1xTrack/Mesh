package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class EG0 implements InterfaceC9049cx0 {

    /* renamed from: a */
    public final /* synthetic */ int f2587a;

    /* renamed from: b */
    public final Object f2588b;

    public /* synthetic */ EG0(int i, Object obj) {
        this.f2587a = i;
        this.f2588b = obj;
    }

    @Override // p000.InterfaceC9049cx0
    /* renamed from: a */
    public final void mo2107a(Object obj) {
        Object obj2 = this.f2588b;
        switch (this.f2587a) {
            case 0:
                ((InterfaceC6650py) obj2).mo3020b(obj);
                return;
            case 1:
                ((C9491gO0) obj2).f27747b.m4389e((Boolean) obj);
                return;
            default:
                C0356Fe c0356Fe = (C0356Fe) obj;
                if (c0356Fe == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                C8215Ri1 c8215Ri1 = (C8215Ri1) obj2;
                if (c8215Ri1.f10395u == 3) {
                    return;
                }
                Objects.toString(c8215Ri1.f10391q);
                c0356Fe.toString();
                AbstractC7806Jm0.m4412f("VideoCapture");
                C0356Fe c0356Fe2 = c8215Ri1.f10391q;
                c8215Ri1.f10391q = c0356Fe;
                C0419Ge c0419Ge = c8215Ri1.f27338g;
                c0419Ge.getClass();
                int i = c0356Fe2.f3372a;
                Set set = C0356Fe.f3370e;
                boolean zContains = set.contains(Integer.valueOf(i));
                int i2 = c0356Fe.f3372a;
                if ((!zContains && !set.contains(Integer.valueOf(i2)) && i != i2) || (c8215Ri1.f10399y && c0356Fe2.f3374c != null && c0356Fe.f3374c == null)) {
                    c8215Ri1.m7099N();
                    return;
                }
                int i3 = c0356Fe2.f3372a;
                if ((i3 != -1 && i2 == -1) || (i3 == -1 && i2 != -1)) {
                    c8215Ri1.m7093H(c8215Ri1.f10392r, c0356Fe, c0419Ge);
                    Object[] objArr = {c8215Ri1.f10392r.m25206d()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    arrayList.add(obj3);
                    c8215Ri1.m18270E(Collections.unmodifiableList(arrayList));
                    c8215Ri1.m18284q();
                    return;
                }
                if (c0356Fe2.f3373b != c0356Fe.f3373b) {
                    c8215Ri1.m7093H(c8215Ri1.f10392r, c0356Fe, c0419Ge);
                    Object[] objArr2 = {c8215Ri1.f10392r.m25206d()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj4 = objArr2[0];
                    Objects.requireNonNull(obj4);
                    arrayList2.add(obj4);
                    c8215Ri1.m18270E(Collections.unmodifiableList(arrayList2));
                    Iterator it = c8215Ri1.f27332a.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC9274eh1) it.next()).mo1335i(c8215Ri1);
                    }
                    return;
                }
                return;
        }
    }

    @Override // p000.InterfaceC9049cx0
    public final void onError(Throwable th) {
        switch (this.f2587a) {
            case 0:
                AbstractC7806Jm0.m4412f("ObserverToConsumerAdapter");
                break;
            case 1:
                C0611Jh c0611Jh = ((C9491gO0) this.f2588b).f27747b;
                c0611Jh.getClass();
                c0611Jh.m4389e(new C0041Ae(th));
                break;
            default:
                AbstractC7806Jm0.m4412f("VideoCapture");
                break;
        }
    }
}
