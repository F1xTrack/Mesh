package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class XF extends AbstractC7784wO0 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((OO0) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.AbstractC7784wO0
    public final boolean a(OO0 oo0, OO0 oo02, C7950xG0 c7950xG0, C7950xG0 c7950xG02) {
        int i;
        int i2;
        int i3 = c7950xG0.b;
        int i4 = c7950xG0.c;
        if (oo02.p()) {
            int i5 = c7950xG0.b;
            i2 = c7950xG0.c;
            i = i5;
        } else {
            i = c7950xG02.b;
            i2 = c7950xG02.c;
        }
        if (oo0 == oo02) {
            return g(oo0, i3, i4, i, i2);
        }
        View view = oo0.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(oo0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(oo02);
        float f = -((int) ((i - i3) - translationX));
        View view2 = oo02.a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        VF vf = new VF();
        vf.a = oo0;
        vf.b = oo02;
        vf.c = i3;
        vf.d = i4;
        vf.e = i;
        vf.f = i2;
        arrayList.add(vf);
        return true;
    }

    @Override // defpackage.AbstractC7784wO0
    public final void d(OO0 oo0) {
        View view = oo0.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((WF) arrayList.get(size)).a == oo0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(oo0);
                arrayList.remove(size);
            }
        }
        j(this.k, oo0);
        if (this.h.remove(oo0)) {
            view.setAlpha(1.0f);
            c(oo0);
        }
        if (this.i.remove(oo0)) {
            view.setAlpha(1.0f);
            c(oo0);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, oo0);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((WF) arrayList5.get(size4)).a == oo0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(oo0);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(oo0)) {
                view.setAlpha(1.0f);
                c(oo0);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(oo0);
        this.o.remove(oo0);
        this.r.remove(oo0);
        this.p.remove(oo0);
        i();
    }

    @Override // defpackage.AbstractC7784wO0
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WF wf = (WF) arrayList.get(size);
            View view = wf.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(wf.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((OO0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            OO0 oo0 = (OO0) arrayList3.get(size3);
            oo0.a.setAlpha(1.0f);
            c(oo0);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            VF vf = (VF) arrayList4.get(size4);
            OO0 oo02 = vf.a;
            if (oo02 != null) {
                k(vf, oo02);
            }
            OO0 oo03 = vf.b;
            if (oo03 != null) {
                k(vf, oo03);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    WF wf2 = (WF) arrayList6.get(size6);
                    View view2 = wf2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(wf2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    OO0 oo04 = (OO0) arrayList8.get(size8);
                    oo04.a.setAlpha(1.0f);
                    c(oo04);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    VF vf2 = (VF) arrayList10.get(size10);
                    OO0 oo05 = vf2.a;
                    if (oo05 != null) {
                        k(vf2, oo05);
                    }
                    OO0 oo06 = vf2.b;
                    if (oo06 != null) {
                        k(vf2, oo06);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() > 0) {
                AbstractC1705Vq.p(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // defpackage.AbstractC7784wO0
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(OO0 oo0, int i, int i2, int i3, int i4) {
        View view = oo0.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) oo0.a.getTranslationY());
        l(oo0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(oo0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        WF wf = new WF();
        wf.a = oo0;
        wf.b = translationX;
        wf.c = translationY;
        wf.d = i3;
        wf.e = i4;
        arrayList.add(wf);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            AbstractC1705Vq.p(arrayList.get(0));
            throw null;
        }
    }

    public final void j(ArrayList arrayList, OO0 oo0) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            VF vf = (VF) arrayList.get(size);
            if (k(vf, oo0) && vf.a == null && vf.b == null) {
                arrayList.remove(vf);
            }
        }
    }

    public final boolean k(VF vf, OO0 oo0) {
        if (vf.b == oo0) {
            vf.b = null;
        } else {
            if (vf.a != oo0) {
                return false;
            }
            vf.a = null;
        }
        oo0.a.setAlpha(1.0f);
        View view = oo0.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(oo0);
        return true;
    }

    public final void l(OO0 oo0) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        oo0.a.animate().setInterpolator(s);
        d(oo0);
    }
}
