package defpackage;

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
public final class C3349dD0 extends AbstractC3821fh1 {
    public static final C2283bD0 v = new C2283bD0();
    public static final C20 w = QR1.h();
    public InterfaceC2473cD0 o;
    public C20 p;
    public C7433uY0 q;
    public G70 r;
    public R61 s;
    public Z61 t;
    public C7624vY0 u;

    @Override // defpackage.AbstractC3821fh1
    public final void C(Rect rect) {
        this.i = rect;
        G();
    }

    public final void F() {
        C7624vY0 c7624vY0 = this.u;
        if (c7624vY0 != null) {
            c7624vY0.b();
            this.u = null;
        }
        G70 g70 = this.r;
        if (g70 != null) {
            g70.a();
            this.r = null;
        }
        R61 r61 = this.s;
        if (r61 != null) {
            r61.c();
            this.s = null;
        }
        this.t = null;
    }

    public final void G() {
        InterfaceC7480uo interfaceC7480uoD = d();
        R61 r61 = this.s;
        if (interfaceC7480uoD == null || r61 == null) {
            return;
        }
        DV1.d(new O61(r61, i(interfaceC7480uoD, n(interfaceC7480uoD)), ((Y60) this.f).p0(), 0));
    }

    public final void H(InterfaceC2473cD0 interfaceC2473cD0) {
        DV1.a();
        this.o = interfaceC2473cD0;
        this.p = w;
        if (c() != null) {
            I((C3539eD0) this.f, this.g);
            q();
        }
        p();
    }

    public final void I(C3539eD0 c3539eD0, C0500Ge c0500Ge) {
        Rect rect;
        DV1.a();
        InterfaceC7480uo interfaceC7480uoD = d();
        Objects.requireNonNull(interfaceC7480uoD);
        F();
        AbstractC3377dM1.i(this.s == null, null);
        Matrix matrix = this.j;
        boolean zM = interfaceC7480uoD.m();
        Size size = c0500Ge.a;
        Rect rect2 = this.i;
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        R61 r61 = new R61(1, 34, c0500Ge, matrix, zM, rect, i(interfaceC7480uoD, n(interfaceC7480uoD)), ((Y60) this.f).p0(), interfaceC7480uoD.m() && n(interfaceC7480uoD));
        this.s = r61;
        r61.a(new RunnableC1577Tz0(2, this));
        Z61 z61D = this.s.d(interfaceC7480uoD, true);
        this.t = z61D;
        this.r = z61D.l;
        if (this.o != null) {
            G();
            InterfaceC2473cD0 interfaceC2473cD0 = this.o;
            interfaceC2473cD0.getClass();
            Z61 z61 = this.t;
            z61.getClass();
            this.p.execute(new RQ(interfaceC2473cD0, 23, z61));
        }
        C7433uY0 c7433uY0E = C7433uY0.e(c3539eD0, c0500Ge.a);
        a(c7433uY0E, c0500Ge);
        int iE = F91.e(c3539eD0);
        C2005Zm c2005Zm = c7433uY0E.b;
        if (iE != 0) {
            c2005Zm.getClass();
            if (iE != 0) {
                ((C0468Ft0) c2005Zm.e).e(InterfaceC5361jh1.d1, Integer.valueOf(iE));
            }
        }
        C3456dn c3456dn = c0500Ge.d;
        if (c3456dn != null) {
            c2005Zm.c(c3456dn);
        }
        if (this.o != null) {
            c7433uY0E.c(this.r, c0500Ge.b, ((Y60) this.f).r());
        }
        C7624vY0 c7624vY0 = this.u;
        if (c7624vY0 != null) {
            c7624vY0.b();
        }
        C7624vY0 c7624vY02 = new C7624vY0(new C2452c60(3, this));
        this.u = c7624vY02;
        c7433uY0E.f = c7624vY02;
        this.q = c7433uY0E;
        Object[] objArr = {c7433uY0E.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC5361jh1 g(boolean z, InterfaceC5934mh1 interfaceC5934mh1) {
        v.getClass();
        C3539eD0 c3539eD0 = C2283bD0.a;
        c3539eD0.getClass();
        InterfaceC7122sw interfaceC7122swA = interfaceC5934mh1.a(F91.b(c3539eD0), 1);
        if (z) {
            interfaceC7122swA = AbstractC1705Vq.q(interfaceC7122swA, c3539eD0);
        }
        if (interfaceC7122swA == null) {
            return null;
        }
        return ((C3709f60) m(interfaceC7122swA)).f();
    }

    @Override // defpackage.AbstractC3821fh1
    public final Set k() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC4393ih1 m(InterfaceC7122sw interfaceC7122sw) {
        return new C3709f60(C0468Ft0.c(interfaceC7122sw), 2);
    }

    public final String toString() {
        return "Preview:".concat(h());
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC5361jh1 u(InterfaceC6907ro interfaceC6907ro, InterfaceC4393ih1 interfaceC4393ih1) {
        interfaceC4393ih1.c().e(M60.x0, 34);
        return interfaceC4393ih1.d();
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge x(C3456dn c3456dn) {
        this.q.b(c3456dn);
        Object[] objArr = {this.q.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        C7375uF c7375uFA = this.g.a();
        c7375uFA.d = c3456dn;
        return c7375uFA.l();
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge y(C0500Ge c0500Ge, C0500Ge c0500Ge2) {
        I((C3539eD0) this.f, c0500Ge);
        return c0500Ge;
    }

    @Override // defpackage.AbstractC3821fh1
    public final void z() {
        F();
    }
}
