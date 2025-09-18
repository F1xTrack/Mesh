package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: dD0 */
/* loaded from: classes.dex */
public final class C9085dD0 extends AbstractC9402fh1 {

    /* renamed from: v */
    public static final C8824bD0 f25879v = new C8824bD0();

    /* renamed from: w */
    public static final C20 f25880w = QR1.m6710h();

    /* renamed from: o */
    public InterfaceC8952cD0 f25881o;

    /* renamed from: p */
    public C20 f25882p;

    /* renamed from: q */
    public C11303uY0 f25883q;

    /* renamed from: r */
    public G70 f25884r;

    /* renamed from: s */
    public R61 f25885s;

    /* renamed from: t */
    public Z61 f25886t;

    /* renamed from: u */
    public C11431vY0 f25887u;

    @Override // p000.AbstractC9402fh1
    /* renamed from: C */
    public final void mo7092C(Rect rect) {
        this.f27340i = rect;
        m17505G();
    }

    /* renamed from: F */
    public final void m17504F() {
        C11431vY0 c11431vY0 = this.f25887u;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
            this.f25887u = null;
        }
        G70 g70 = this.f25884r;
        if (g70 != null) {
            g70.mo6573a();
            this.f25884r = null;
        }
        R61 r61 = this.f25885s;
        if (r61 != null) {
            r61.m6898c();
            this.f25885s = null;
        }
        this.f25886t = null;
    }

    /* renamed from: G */
    public final void m17505G() {
        InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
        R61 r61 = this.f25885s;
        if (interfaceC6972uoM18274d == null || r61 == null) {
            return;
        }
        DV1.m1719d(new O61(r61, m18278i(interfaceC6972uoM18274d, m18281n(interfaceC6972uoM18274d)), ((Y60) this.f27337f).mo7431p0(), 0));
    }

    /* renamed from: H */
    public final void m17506H(InterfaceC8952cD0 interfaceC8952cD0) {
        DV1.m1716a();
        this.f25881o = interfaceC8952cD0;
        this.f25882p = f25880w;
        if (m18273c() != null) {
            m17507I((C9213eD0) this.f27337f, this.f27338g);
            m18284q();
        }
        m18283p();
    }

    /* renamed from: I */
    public final void m17507I(C9213eD0 c9213eD0, C0419Ge c0419Ge) {
        Rect rect;
        DV1.m1716a();
        InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
        Objects.requireNonNull(interfaceC6972uoM18274d);
        m17504F();
        AbstractC9104dM1.m17550i(this.f25885s == null, null);
        Matrix matrix = this.f27341j;
        boolean zMo1339m = interfaceC6972uoM18274d.mo1339m();
        Size size = c0419Ge.f3839a;
        Rect rect2 = this.f27340i;
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        R61 r61 = new R61(1, 34, c0419Ge, matrix, zMo1339m, rect, m18278i(interfaceC6972uoM18274d, m18281n(interfaceC6972uoM18274d)), ((Y60) this.f27337f).mo7431p0(), interfaceC6972uoM18274d.mo1339m() && m18281n(interfaceC6972uoM18274d));
        this.f25885s = r61;
        r61.m6896a(new RunnableC8352Tz0(2, this));
        Z61 z61M6899d = this.f25885s.m6899d(interfaceC6972uoM18274d, true);
        this.f25886t = z61M6899d;
        this.f25884r = z61M6899d.f14748l;
        if (this.f25881o != null) {
            m17505G();
            InterfaceC8952cD0 interfaceC8952cD0 = this.f25881o;
            interfaceC8952cD0.getClass();
            Z61 z61 = this.f25886t;
            z61.getClass();
            this.f25882p.execute(new RunnableC1096RQ(interfaceC8952cD0, 23, z61));
        }
        C11303uY0 c11303uY0M25202e = C11303uY0.m25202e(c9213eD0, c0419Ge.f3839a);
        m18271a(c11303uY0M25202e, c0419Ge);
        int iM2522e = F91.m2522e(c9213eD0);
        C1622Zm c1622Zm = c11303uY0M25202e.f43134b;
        if (iM2522e != 0) {
            c1622Zm.getClass();
            if (iM2522e != 0) {
                ((C7612Ft0) c1622Zm.f15117e).m2815e(InterfaceC9914jh1.f35333d1, Integer.valueOf(iM2522e));
            }
        }
        C3950dn c3950dn = c0419Ge.f3842d;
        if (c3950dn != null) {
            c1622Zm.m9590c(c3950dn);
        }
        if (this.f25881o != null) {
            c11303uY0M25202e.m25205c(this.f25884r, c0419Ge.f3840b, ((Y60) this.f27337f).mo7432r());
        }
        C11431vY0 c11431vY0 = this.f25887u;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
        }
        C11431vY0 c11431vY02 = new C11431vY0(new C8938c60(3, this));
        this.f25887u = c11431vY02;
        c11303uY0M25202e.f43138f = c11431vY02;
        this.f25883q = c11303uY0M25202e;
        Object[] objArr = {c11303uY0M25202e.m25206d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m18270E(Collections.unmodifiableList(arrayList));
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: g */
    public final InterfaceC9914jh1 mo7101g(boolean z, InterfaceC10298mh1 interfaceC10298mh1) {
        f25879v.getClass();
        C9213eD0 c9213eD0 = C8824bD0.f16867a;
        c9213eD0.getClass();
        InterfaceC6854sw interfaceC6854swMo6364a = interfaceC10298mh1.mo6364a(F91.m2519b(c9213eD0), 1);
        if (z) {
            interfaceC6854swMo6364a = AbstractC1374Vq.m8598q(interfaceC6854swMo6364a, c9213eD0);
        }
        if (interfaceC6854swMo6364a == null) {
            return null;
        }
        return ((C9327f60) mo7103m(interfaceC6854swMo6364a)).m18191f();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: k */
    public final Set mo7102k() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: m */
    public final InterfaceC9786ih1 mo7103m(InterfaceC6854sw interfaceC6854sw) {
        return new C9327f60(C7612Ft0.m2813c(interfaceC6854sw), 2);
    }

    public final String toString() {
        return "Preview:".concat(m18277h());
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: u */
    public final InterfaceC9914jh1 mo7104u(InterfaceC6766ro interfaceC6766ro, InterfaceC9786ih1 interfaceC9786ih1) {
        interfaceC9786ih1.mo4871c().m2815e(M60.f6992x0, 34);
        return interfaceC9786ih1.mo4872d();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: x */
    public final C0419Ge mo7107x(C3950dn c3950dn) {
        this.f25883q.m25204b(c3950dn);
        Object[] objArr = {this.f25883q.m25206d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m18270E(Collections.unmodifiableList(arrayList));
        C6937uF c6937uFM3116a = this.f27338g.m3116a();
        c6937uFM3116a.f43619d = c3950dn;
        return c6937uFM3116a.m25140l();
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: y */
    public final C0419Ge mo7108y(C0419Ge c0419Ge, C0419Ge c0419Ge2) {
        m17507I((C9213eD0) this.f27337f, c0419Ge);
        return c0419Ge;
    }

    @Override // p000.AbstractC9402fh1
    /* renamed from: z */
    public final void mo17508z() {
        m17504F();
    }
}
