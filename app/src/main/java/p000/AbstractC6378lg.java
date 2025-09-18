package p000;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lg */
/* loaded from: classes.dex */
public abstract class AbstractC6378lg {

    /* renamed from: c */
    public final InterfaceC4257ig f37230c;

    /* renamed from: e */
    public ES1 f37232e;

    /* renamed from: a */
    public final ArrayList f37228a = new ArrayList(1);

    /* renamed from: b */
    public boolean f37229b = false;

    /* renamed from: d */
    public float f37231d = 0.0f;

    /* renamed from: f */
    public Object f37233f = null;

    /* renamed from: g */
    public float f37234g = -1.0f;

    /* renamed from: h */
    public float f37235h = -1.0f;

    public AbstractC6378lg(List list) {
        InterfaceC4257ig c6315kg;
        if (list.isEmpty()) {
            c6315kg = new C8326Tm0(8);
        } else {
            c6315kg = list.size() == 1 ? new C6315kg(list) : new C6252jg(list);
        }
        this.f37230c = c6315kg;
    }

    /* renamed from: a */
    public final void m22527a(InterfaceC4194hg interfaceC4194hg) {
        this.f37228a.add(interfaceC4194hg);
    }

    /* renamed from: b */
    public float mo5062b() {
        if (this.f37235h == -1.0f) {
            this.f37235h = this.f37230c.mo7747k();
        }
        return this.f37235h;
    }

    /* renamed from: c */
    public final float m22528c() {
        Interpolator interpolator;
        C10551og0 c10551og0Mo7744e = this.f37230c.mo7744e();
        if (c10551og0Mo7744e == null || c10551og0Mo7744e.m23519c() || (interpolator = c10551og0Mo7744e.f39161d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(m22529d());
    }

    /* renamed from: d */
    public final float m22529d() {
        if (this.f37229b) {
            return 0.0f;
        }
        C10551og0 c10551og0Mo7744e = this.f37230c.mo7744e();
        if (c10551og0Mo7744e.m23519c()) {
            return 0.0f;
        }
        return (this.f37231d - c10551og0Mo7744e.m23518b()) / (c10551og0Mo7744e.m23517a() - c10551og0Mo7744e.m23518b());
    }

    /* renamed from: e */
    public Object mo5063e() {
        Interpolator interpolator;
        float fM22529d = m22529d();
        ES1 es1 = this.f37232e;
        InterfaceC4257ig interfaceC4257ig = this.f37230c;
        if (es1 == null && interfaceC4257ig.mo7743b(fM22529d)) {
            return this.f37233f;
        }
        C10551og0 c10551og0Mo7744e = interfaceC4257ig.mo7744e();
        Interpolator interpolator2 = c10551og0Mo7744e.f39162e;
        Object objMo3189f = (interpolator2 == null || (interpolator = c10551og0Mo7744e.f39163f) == null) ? mo3189f(c10551og0Mo7744e, m22528c()) : mo6876g(c10551og0Mo7744e, fM22529d, interpolator2.getInterpolation(fM22529d), interpolator.getInterpolation(fM22529d));
        this.f37233f = objMo3189f;
        return objMo3189f;
    }

    /* renamed from: f */
    public abstract Object mo3189f(C10551og0 c10551og0, float f);

    /* renamed from: g */
    public Object mo6876g(C10551og0 c10551og0, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: h */
    public void mo5064h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37228a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4194hg) arrayList.get(i)).mo1741a();
            i++;
        }
    }

    /* renamed from: i */
    public void mo5065i(float f) {
        InterfaceC4257ig interfaceC4257ig = this.f37230c;
        if (interfaceC4257ig.isEmpty()) {
            return;
        }
        if (this.f37234g == -1.0f) {
            this.f37234g = interfaceC4257ig.mo7748l();
        }
        float f2 = this.f37234g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f37234g = interfaceC4257ig.mo7748l();
            }
            f = this.f37234g;
        } else if (f > mo5062b()) {
            f = mo5062b();
        }
        if (f == this.f37231d) {
            return;
        }
        this.f37231d = f;
        if (interfaceC4257ig.mo7745f(f)) {
            mo5064h();
        }
    }

    /* renamed from: j */
    public final void m22530j(ES1 es1) {
        ES1 es12 = this.f37232e;
        if (es12 != null) {
            es12.getClass();
        }
        this.f37232e = es1;
    }
}
