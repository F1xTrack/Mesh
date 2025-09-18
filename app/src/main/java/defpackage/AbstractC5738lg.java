package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lg */
/* loaded from: classes.dex */
public abstract class AbstractC5738lg {
    public final InterfaceC4388ig c;
    public ES1 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public AbstractC5738lg(List list) {
        InterfaceC4388ig c5547kg;
        if (list.isEmpty()) {
            c5547kg = new C1538Tm0(8);
        } else {
            c5547kg = list.size() == 1 ? new C5547kg(list) : new C5356jg(list);
        }
        this.c = c5547kg;
    }

    public final void a(InterfaceC4198hg interfaceC4198hg) {
        this.a.add(interfaceC4198hg);
    }

    public float b() {
        if (this.h == -1.0f) {
            this.h = this.c.k();
        }
        return this.h;
    }

    public final float c() {
        Interpolator interpolator;
        C6312og0 c6312og0E = this.c.e();
        if (c6312og0E == null || c6312og0E.c() || (interpolator = c6312og0E.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        C6312og0 c6312og0E = this.c.e();
        if (c6312og0E.c()) {
            return 0.0f;
        }
        return (this.d - c6312og0E.b()) / (c6312og0E.a() - c6312og0E.b());
    }

    public Object e() {
        Interpolator interpolator;
        float fD = d();
        ES1 es1 = this.e;
        InterfaceC4388ig interfaceC4388ig = this.c;
        if (es1 == null && interfaceC4388ig.b(fD)) {
            return this.f;
        }
        C6312og0 c6312og0E = interfaceC4388ig.e();
        Interpolator interpolator2 = c6312og0E.e;
        Object objF = (interpolator2 == null || (interpolator = c6312og0E.f) == null) ? f(c6312og0E, c()) : g(c6312og0E, fD, interpolator2.getInterpolation(fD), interpolator.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(C6312og0 c6312og0, float f);

    public Object g(C6312og0 c6312og0, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4198hg) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        InterfaceC4388ig interfaceC4388ig = this.c;
        if (interfaceC4388ig.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = interfaceC4388ig.l();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = interfaceC4388ig.l();
            }
            f = this.g;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (interfaceC4388ig.f(f)) {
            h();
        }
    }

    public final void j(ES1 es1) {
        ES1 es12 = this.e;
        if (es12 != null) {
            es12.getClass();
        }
        this.e = es1;
    }
}
