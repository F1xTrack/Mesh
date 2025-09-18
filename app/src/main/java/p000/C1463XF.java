package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: XF */
/* loaded from: classes.dex */
public final class C1463XF extends AbstractC11538wO0 {

    /* renamed from: s */
    public static TimeInterpolator f13633s;

    /* renamed from: g */
    public boolean f13634g;

    /* renamed from: h */
    public ArrayList f13635h;

    /* renamed from: i */
    public ArrayList f13636i;

    /* renamed from: j */
    public ArrayList f13637j;

    /* renamed from: k */
    public ArrayList f13638k;

    /* renamed from: l */
    public ArrayList f13639l;

    /* renamed from: m */
    public ArrayList f13640m;

    /* renamed from: n */
    public ArrayList f13641n;

    /* renamed from: o */
    public ArrayList f13642o;

    /* renamed from: p */
    public ArrayList f13643p;

    /* renamed from: q */
    public ArrayList f13644q;

    /* renamed from: r */
    public ArrayList f13645r;

    /* renamed from: h */
    public static void m8952h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((OO0) arrayList.get(size)).f8408a.animate().cancel();
        }
    }

    @Override // p000.AbstractC11538wO0
    /* renamed from: a */
    public final boolean mo8953a(OO0 oo0, OO0 oo02, C11649xG0 c11649xG0, C11649xG0 c11649xG02) {
        int i;
        int i2;
        int i3 = c11649xG0.f45508b;
        int i4 = c11649xG0.f45509c;
        if (oo02.m6059p()) {
            int i5 = c11649xG0.f45508b;
            i2 = c11649xG0.f45509c;
            i = i5;
        } else {
            i = c11649xG02.f45508b;
            i2 = c11649xG02.f45509c;
        }
        if (oo0 == oo02) {
            return m8957g(oo0, i3, i4, i, i2);
        }
        View view = oo0.f8408a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m8961l(oo0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m8961l(oo02);
        float f = -((int) ((i - i3) - translationX));
        View view2 = oo02.f8408a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f13638k;
        C1337VF c1337vf = new C1337VF();
        c1337vf.f12460a = oo0;
        c1337vf.f12461b = oo02;
        c1337vf.f12462c = i3;
        c1337vf.f12463d = i4;
        c1337vf.f12464e = i;
        c1337vf.f12465f = i2;
        arrayList.add(c1337vf);
        return true;
    }

    @Override // p000.AbstractC11538wO0
    /* renamed from: d */
    public final void mo8954d(OO0 oo0) {
        View view = oo0.f8408a;
        view.animate().cancel();
        ArrayList arrayList = this.f13637j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1400WF) arrayList.get(size)).f13091a == oo0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m25614c(oo0);
                arrayList.remove(size);
            }
        }
        m8959j(this.f13638k, oo0);
        if (this.f13635h.remove(oo0)) {
            view.setAlpha(1.0f);
            m25614c(oo0);
        }
        if (this.f13636i.remove(oo0)) {
            view.setAlpha(1.0f);
            m25614c(oo0);
        }
        ArrayList arrayList2 = this.f13641n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m8959j(arrayList3, oo0);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f13640m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C1400WF) arrayList5.get(size4)).f13091a == oo0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m25614c(oo0);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f13639l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(oo0)) {
                view.setAlpha(1.0f);
                m25614c(oo0);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f13644q.remove(oo0);
        this.f13642o.remove(oo0);
        this.f13645r.remove(oo0);
        this.f13643p.remove(oo0);
        m8958i();
    }

    @Override // p000.AbstractC11538wO0
    /* renamed from: e */
    public final void mo8955e() {
        ArrayList arrayList = this.f13637j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1400WF c1400wf = (C1400WF) arrayList.get(size);
            View view = c1400wf.f13091a.f8408a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m25614c(c1400wf.f13091a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f13635h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m25614c((OO0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f13636i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            OO0 oo0 = (OO0) arrayList3.get(size3);
            oo0.f8408a.setAlpha(1.0f);
            m25614c(oo0);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f13638k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1337VF c1337vf = (C1337VF) arrayList4.get(size4);
            OO0 oo02 = c1337vf.f12460a;
            if (oo02 != null) {
                m8960k(c1337vf, oo02);
            }
            OO0 oo03 = c1337vf.f12461b;
            if (oo03 != null) {
                m8960k(c1337vf, oo03);
            }
        }
        arrayList4.clear();
        if (mo8956f()) {
            ArrayList arrayList5 = this.f13640m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C1400WF c1400wf2 = (C1400WF) arrayList6.get(size6);
                    View view2 = c1400wf2.f13091a.f8408a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m25614c(c1400wf2.f13091a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f13639l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    OO0 oo04 = (OO0) arrayList8.get(size8);
                    oo04.f8408a.setAlpha(1.0f);
                    m25614c(oo04);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f13641n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1337VF c1337vf2 = (C1337VF) arrayList10.get(size10);
                    OO0 oo05 = c1337vf2.f12460a;
                    if (oo05 != null) {
                        m8960k(c1337vf2, oo05);
                    }
                    OO0 oo06 = c1337vf2.f12461b;
                    if (oo06 != null) {
                        m8960k(c1337vf2, oo06);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m8952h(this.f13644q);
            m8952h(this.f13643p);
            m8952h(this.f13642o);
            m8952h(this.f13645r);
            ArrayList arrayList11 = this.f44848b;
            if (arrayList11.size() > 0) {
                AbstractC1374Vq.m8597p(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // p000.AbstractC11538wO0
    /* renamed from: f */
    public final boolean mo8956f() {
        return (this.f13636i.isEmpty() && this.f13638k.isEmpty() && this.f13637j.isEmpty() && this.f13635h.isEmpty() && this.f13643p.isEmpty() && this.f13644q.isEmpty() && this.f13642o.isEmpty() && this.f13645r.isEmpty() && this.f13640m.isEmpty() && this.f13639l.isEmpty() && this.f13641n.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    public final boolean m8957g(OO0 oo0, int i, int i2, int i3, int i4) {
        View view = oo0.f8408a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) oo0.f8408a.getTranslationY());
        m8961l(oo0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m25614c(oo0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f13637j;
        C1400WF c1400wf = new C1400WF();
        c1400wf.f13091a = oo0;
        c1400wf.f13092b = translationX;
        c1400wf.f13093c = translationY;
        c1400wf.f13094d = i3;
        c1400wf.f13095e = i4;
        arrayList.add(c1400wf);
        return true;
    }

    /* renamed from: i */
    public final void m8958i() {
        if (mo8956f()) {
            return;
        }
        ArrayList arrayList = this.f44848b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            AbstractC1374Vq.m8597p(arrayList.get(0));
            throw null;
        }
    }

    /* renamed from: j */
    public final void m8959j(ArrayList arrayList, OO0 oo0) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1337VF c1337vf = (C1337VF) arrayList.get(size);
            if (m8960k(c1337vf, oo0) && c1337vf.f12460a == null && c1337vf.f12461b == null) {
                arrayList.remove(c1337vf);
            }
        }
    }

    /* renamed from: k */
    public final boolean m8960k(C1337VF c1337vf, OO0 oo0) {
        if (c1337vf.f12461b == oo0) {
            c1337vf.f12461b = null;
        } else {
            if (c1337vf.f12460a != oo0) {
                return false;
            }
            c1337vf.f12460a = null;
        }
        oo0.f8408a.setAlpha(1.0f);
        View view = oo0.f8408a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m25614c(oo0);
        return true;
    }

    /* renamed from: l */
    public final void m8961l(OO0 oo0) {
        if (f13633s == null) {
            f13633s = new ValueAnimator().getInterpolator();
        }
        oo0.f8408a.animate().setInterpolator(f13633s);
        mo8954d(oo0);
    }
}
