package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: HY */
/* loaded from: classes.dex */
public class C0476HY extends AbstractC0161CY {
    @Override // p000.AbstractC0161CY
    /* renamed from: a */
    public final void mo204a(View view, Object obj) {
        ((AbstractC7579Fc1) obj).mo2695b(view);
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: b */
    public final void mo205b(Object obj, ArrayList arrayList) {
        AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) obj;
        if (abstractC7579Fc1 == null) {
            return;
        }
        int i = 0;
        if (abstractC7579Fc1 instanceof C7943Mc1) {
            C7943Mc1 c7943Mc1 = (C7943Mc1) abstractC7579Fc1;
            int size = c7943Mc1.f7269B.size();
            while (i < size) {
                mo205b((i < 0 || i >= c7943Mc1.f7269B.size()) ? null : (AbstractC7579Fc1) c7943Mc1.f7269B.get(i), arrayList);
                i++;
            }
            return;
        }
        if (AbstractC0161CY.m1208h(abstractC7579Fc1.f3340e) && AbstractC0161CY.m1208h(abstractC7579Fc1.f3341f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC7579Fc1.mo2695b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: c */
    public final void mo206c(ViewGroup viewGroup, Object obj) {
        AbstractC7787Jc1.m4368a(viewGroup, (AbstractC7579Fc1) obj);
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: e */
    public final boolean mo207e(Object obj) {
        return obj instanceof AbstractC7579Fc1;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: f */
    public final Object mo208f(Object obj) {
        if (obj != null) {
            return ((AbstractC7579Fc1) obj).clone();
        }
        return null;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: i */
    public final Object mo209i(Object obj, Object obj2, Object obj3) {
        AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) obj;
        AbstractC7579Fc1 abstractC7579Fc12 = (AbstractC7579Fc1) obj2;
        AbstractC7579Fc1 abstractC7579Fc13 = (AbstractC7579Fc1) obj3;
        if (abstractC7579Fc1 != null && abstractC7579Fc12 != null) {
            C7943Mc1 c7943Mc1 = new C7943Mc1();
            c7943Mc1.m5410L(abstractC7579Fc1);
            c7943Mc1.m5410L(abstractC7579Fc12);
            c7943Mc1.f7270C = false;
            abstractC7579Fc1 = c7943Mc1;
        } else if (abstractC7579Fc1 == null) {
            abstractC7579Fc1 = abstractC7579Fc12 != null ? abstractC7579Fc12 : null;
        }
        if (abstractC7579Fc13 == null) {
            return abstractC7579Fc1;
        }
        C7943Mc1 c7943Mc12 = new C7943Mc1();
        if (abstractC7579Fc1 != null) {
            c7943Mc12.m5410L(abstractC7579Fc1);
        }
        c7943Mc12.m5410L(abstractC7579Fc13);
        return c7943Mc12;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: j */
    public final Object mo210j(Object obj, Object obj2) {
        C7943Mc1 c7943Mc1 = new C7943Mc1();
        if (obj != null) {
            c7943Mc1.m5410L((AbstractC7579Fc1) obj);
        }
        c7943Mc1.m5410L((AbstractC7579Fc1) obj2);
        return c7943Mc1;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: k */
    public final void mo211k(Object obj, View view, ArrayList arrayList) {
        ((AbstractC7579Fc1) obj).m2694a(new C0287EY(view, arrayList));
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: l */
    public final void mo212l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC7579Fc1) obj).m2694a(new C0350FY(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: m */
    public final void mo213m(View view, Object obj) {
        if (view != null) {
            AbstractC0161CY.m1207g(view, new Rect());
            ((AbstractC7579Fc1) obj).mo2687E(new C0224DY());
        }
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: n */
    public final void mo214n(Object obj, Rect rect) {
        ((AbstractC7579Fc1) obj).mo2687E(new C0224DY());
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: o */
    public final void mo215o(Object obj, C0744Lp c0744Lp, RunnableC3973eA runnableC3973eA) {
        AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) obj;
        c0744Lp.m5111c(new C0424Gj(abstractC7579Fc1, 29, runnableC3973eA));
        abstractC7579Fc1.m2694a(new C0413GY(runnableC3973eA));
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: p */
    public final void mo216p(Object obj, View view, ArrayList arrayList) {
        C7943Mc1 c7943Mc1 = (C7943Mc1) obj;
        ArrayList arrayList2 = c7943Mc1.f3341f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0161CY.m1206d(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo205b(c7943Mc1, arrayList);
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: q */
    public final void mo217q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C7943Mc1 c7943Mc1 = (C7943Mc1) obj;
        if (c7943Mc1 != null) {
            ArrayList arrayList3 = c7943Mc1.f3341f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m3498s(c7943Mc1, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: r */
    public final Object mo218r(Object obj) {
        if (obj == null) {
            return null;
        }
        C7943Mc1 c7943Mc1 = new C7943Mc1();
        c7943Mc1.m5410L((AbstractC7579Fc1) obj);
        return c7943Mc1;
    }

    /* renamed from: s */
    public final void m3498s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) obj;
        int i = 0;
        if (abstractC7579Fc1 instanceof C7943Mc1) {
            C7943Mc1 c7943Mc1 = (C7943Mc1) abstractC7579Fc1;
            int size = c7943Mc1.f7269B.size();
            while (i < size) {
                m3498s((i < 0 || i >= c7943Mc1.f7269B.size()) ? null : (AbstractC7579Fc1) c7943Mc1.f7269B.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (AbstractC0161CY.m1208h(abstractC7579Fc1.f3340e)) {
            ArrayList arrayList3 = abstractC7579Fc1.f3341f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    abstractC7579Fc1.mo2695b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC7579Fc1.mo2683A((View) arrayList.get(size3));
                }
            }
        }
    }
}
