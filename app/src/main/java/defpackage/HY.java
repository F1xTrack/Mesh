package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class HY extends CY {
    @Override // defpackage.CY
    public final void a(View view, Object obj) {
        ((AbstractC0418Fc1) obj).b(view);
    }

    @Override // defpackage.CY
    public final void b(Object obj, ArrayList arrayList) {
        AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) obj;
        if (abstractC0418Fc1 == null) {
            return;
        }
        int i = 0;
        if (abstractC0418Fc1 instanceof C0963Mc1) {
            C0963Mc1 c0963Mc1 = (C0963Mc1) abstractC0418Fc1;
            int size = c0963Mc1.B.size();
            while (i < size) {
                b((i < 0 || i >= c0963Mc1.B.size()) ? null : (AbstractC0418Fc1) c0963Mc1.B.get(i), arrayList);
                i++;
            }
            return;
        }
        if (CY.h(abstractC0418Fc1.e) && CY.h(abstractC0418Fc1.f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC0418Fc1.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.CY
    public final void c(ViewGroup viewGroup, Object obj) {
        AbstractC0730Jc1.a(viewGroup, (AbstractC0418Fc1) obj);
    }

    @Override // defpackage.CY
    public final boolean e(Object obj) {
        return obj instanceof AbstractC0418Fc1;
    }

    @Override // defpackage.CY
    public final Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC0418Fc1) obj).clone();
        }
        return null;
    }

    @Override // defpackage.CY
    public final Object i(Object obj, Object obj2, Object obj3) {
        AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) obj;
        AbstractC0418Fc1 abstractC0418Fc12 = (AbstractC0418Fc1) obj2;
        AbstractC0418Fc1 abstractC0418Fc13 = (AbstractC0418Fc1) obj3;
        if (abstractC0418Fc1 != null && abstractC0418Fc12 != null) {
            C0963Mc1 c0963Mc1 = new C0963Mc1();
            c0963Mc1.L(abstractC0418Fc1);
            c0963Mc1.L(abstractC0418Fc12);
            c0963Mc1.C = false;
            abstractC0418Fc1 = c0963Mc1;
        } else if (abstractC0418Fc1 == null) {
            abstractC0418Fc1 = abstractC0418Fc12 != null ? abstractC0418Fc12 : null;
        }
        if (abstractC0418Fc13 == null) {
            return abstractC0418Fc1;
        }
        C0963Mc1 c0963Mc12 = new C0963Mc1();
        if (abstractC0418Fc1 != null) {
            c0963Mc12.L(abstractC0418Fc1);
        }
        c0963Mc12.L(abstractC0418Fc13);
        return c0963Mc12;
    }

    @Override // defpackage.CY
    public final Object j(Object obj, Object obj2) {
        C0963Mc1 c0963Mc1 = new C0963Mc1();
        if (obj != null) {
            c0963Mc1.L((AbstractC0418Fc1) obj);
        }
        c0963Mc1.L((AbstractC0418Fc1) obj2);
        return c0963Mc1;
    }

    @Override // defpackage.CY
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0418Fc1) obj).a(new EY(view, arrayList));
    }

    @Override // defpackage.CY
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC0418Fc1) obj).a(new FY(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.CY
    public final void m(View view, Object obj) {
        if (view != null) {
            CY.g(view, new Rect());
            ((AbstractC0418Fc1) obj).E(new DY());
        }
    }

    @Override // defpackage.CY
    public final void n(Object obj, Rect rect) {
        ((AbstractC0418Fc1) obj).E(new DY());
    }

    @Override // defpackage.CY
    public final void o(Object obj, C0923Lp c0923Lp, RunnableC3529eA runnableC3529eA) {
        AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) obj;
        c0923Lp.c(new C0515Gj(abstractC0418Fc1, 29, runnableC3529eA));
        abstractC0418Fc1.a(new GY(runnableC3529eA));
    }

    @Override // defpackage.CY
    public final void p(Object obj, View view, ArrayList arrayList) {
        C0963Mc1 c0963Mc1 = (C0963Mc1) obj;
        ArrayList arrayList2 = c0963Mc1.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CY.d(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(c0963Mc1, arrayList);
    }

    @Override // defpackage.CY
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0963Mc1 c0963Mc1 = (C0963Mc1) obj;
        if (c0963Mc1 != null) {
            ArrayList arrayList3 = c0963Mc1.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(c0963Mc1, arrayList, arrayList2);
        }
    }

    @Override // defpackage.CY
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        C0963Mc1 c0963Mc1 = new C0963Mc1();
        c0963Mc1.L((AbstractC0418Fc1) obj);
        return c0963Mc1;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) obj;
        int i = 0;
        if (abstractC0418Fc1 instanceof C0963Mc1) {
            C0963Mc1 c0963Mc1 = (C0963Mc1) abstractC0418Fc1;
            int size = c0963Mc1.B.size();
            while (i < size) {
                s((i < 0 || i >= c0963Mc1.B.size()) ? null : (AbstractC0418Fc1) c0963Mc1.B.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (CY.h(abstractC0418Fc1.e)) {
            ArrayList arrayList3 = abstractC0418Fc1.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    abstractC0418Fc1.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC0418Fc1.A((View) arrayList.get(size3));
                }
            }
        }
    }
}
