package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class L implements InterfaceC7011sL, InterfaceC5854mH {
    public static final Map q = C1723Vw.a("component_tag", "drawee");
    public static final Map r = C1723Vw.b("origin", "memory_bitmap", "origin_sub", "shortcut");
    public static final Class s = L.class;
    public final C7393uL a;
    public final C6045nH b;
    public final ScheduledExecutorServiceC0583Hf1 c;
    public InterfaceC3301cz d;
    public final C7047sX e;
    public F00 f;
    public C7560vD g;
    public String h;
    public Object i;
    public boolean j;
    public boolean k;
    public boolean l;
    public YC m;
    public Object n;
    public boolean o;
    public Drawable p;

    public L(C6045nH c6045nH, ScheduledExecutorServiceC0583Hf1 scheduledExecutorServiceC0583Hf1) {
        this.a = C7393uL.c ? new C7393uL() : C7393uL.b;
        this.e = new C7047sX();
        this.o = true;
        this.b = c6045nH;
        this.c = scheduledExecutorServiceC0583Hf1;
        f(null, null);
    }

    public final void a(InterfaceC3301cz interfaceC3301cz) {
        interfaceC3301cz.getClass();
        InterfaceC3301cz interfaceC3301cz2 = this.d;
        if (interfaceC3301cz2 instanceof K) {
            ((K) interfaceC3301cz2).a(interfaceC3301cz);
            return;
        }
        if (interfaceC3301cz2 == null) {
            this.d = interfaceC3301cz;
            return;
        }
        AbstractC4368iZ.b();
        K k = new K();
        k.a(interfaceC3301cz2);
        k.a(interfaceC3301cz);
        AbstractC4368iZ.b();
        this.d = k;
    }

    public abstract Drawable b(Object obj);

    public final InterfaceC3301cz c() {
        InterfaceC3301cz interfaceC3301cz = this.d;
        return interfaceC3301cz == null ? C1672Vf.a : interfaceC3301cz;
    }

    public abstract L60 d(Object obj);

    public final F00 e() {
        F00 f00 = this.f;
        if (f00 != null) {
            return f00;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.i);
    }

    public final synchronized void f(Object obj, String str) {
        C6045nH c6045nH;
        try {
            AbstractC4368iZ.b();
            this.a.a(EnumC7202tL.f);
            if (!this.o && (c6045nH = this.b) != null) {
                c6045nH.b(this);
            }
            this.j = false;
            n();
            InterfaceC3301cz interfaceC3301cz = this.d;
            if (interfaceC3301cz instanceof K) {
                ((K) interfaceC3301cz).c();
            } else {
                this.d = null;
            }
            F00 f00 = this.f;
            if (f00 != null) {
                f00.f.u(f00.a);
                f00.g();
                C7036sT0 c7036sT0 = this.f.d;
                c7036sT0.d = null;
                c7036sT0.invalidateSelf();
                this.f = null;
            }
            this.g = null;
            if (AbstractC3393dS.a.o(2)) {
                AbstractC3393dS.l(s, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.h, str);
            }
            this.h = str;
            this.i = obj;
            AbstractC4368iZ.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean g(String str, YC yc) {
        if (yc == null && this.m == null) {
            return true;
        }
        return str.equals(this.h) && yc == this.m && this.k;
    }

    public final void h(String str, Throwable th) {
        if (AbstractC3393dS.a.o(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.h;
            if (AbstractC3393dS.a.o(2)) {
                s.getSimpleName();
                String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th);
            }
        }
    }

    public final void i(Object obj, String str) {
        if (AbstractC3393dS.a.o(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.h;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            AbstractC8446zt abstractC8446zt = (AbstractC8446zt) obj;
            Object[] objArr = {numValueOf, str2, str, simpleName, Integer.valueOf((abstractC8446zt == null || !abstractC8446zt.A()) ? 0 : System.identityHashCode(abstractC8446zt.b.d()))};
            if (AbstractC3393dS.a.o(2)) {
                s.getSimpleName();
                String.format(null, "controller %x %s: %s: image: %s %x", objArr);
            }
        }
    }

    public final K2 j() {
        F00 f00 = this.f;
        if (f00 instanceof F00) {
            String.valueOf(!(f00.e(2) instanceof C6851rV0) ? null : f00.f(2).d);
            if (f00.e(2) instanceof C6851rV0) {
                PointF pointF = f00.f(2).e;
            }
        }
        F00 f002 = this.f;
        Rect bounds = f002 != null ? f002.d.getBounds() : null;
        Object obj = this.i;
        O90.f(q, "componentAttribution");
        O90.f(r, "shortcutAttribution");
        K2 k2 = new K2();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        k2.a = obj;
        return k2;
    }

    public final void k(String str, YC yc, Throwable th, boolean z) {
        AbstractC4368iZ.b();
        if (!g(str, yc)) {
            h("ignore_old_datasource @ onFailure", th);
            yc.close();
            AbstractC4368iZ.b();
            return;
        }
        this.a.a(z ? EnumC7202tL.m : EnumC7202tL.n);
        C7047sX c7047sX = this.e;
        if (z) {
            h("final_failed @ onFailure", th);
            this.m = null;
            this.l = true;
            F00 f00 = this.f;
            if (f00 != null) {
                C6269oS c6269oS = f00.e;
                c6269oS.r++;
                f00.c();
                if (c6269oS.c(5) != null) {
                    f00.b(5);
                } else {
                    f00.b(1);
                }
                c6269oS.a();
            }
            K2 k2J = j();
            c().g(this.h, th);
            c7047sX.a(this.h, th, k2J);
        } else {
            h("intermediate_failed @ onFailure", th);
            c().n(this.h, th);
            c7047sX.c(this.h);
        }
        AbstractC4368iZ.b();
    }

    public final void l(String str, YC yc, Object obj, float f, boolean z, boolean z2, boolean z3) {
        try {
            AbstractC4368iZ.b();
            if (!g(str, yc)) {
                i(obj, "ignore_old_datasource @ onNewResult");
                AbstractC8446zt.p((AbstractC8446zt) obj);
                yc.close();
                AbstractC4368iZ.b();
                return;
            }
            this.a.a(z ? EnumC7202tL.k : EnumC7202tL.l);
            try {
                Drawable drawableB = b(obj);
                Object obj2 = this.n;
                this.n = obj;
                this.p = drawableB;
                try {
                    if (z) {
                        i(obj, "set_final_result @ onNewResult");
                        this.m = null;
                        e().i(drawableB, 1.0f, z2);
                        p(str, obj, yc);
                    } else if (z3) {
                        i(obj, "set_temporary_result @ onNewResult");
                        e().i(drawableB, 1.0f, z2);
                        p(str, obj, yc);
                    } else {
                        i(obj, "set_intermediate_result @ onNewResult");
                        e().i(drawableB, f, z2);
                        L60 l60D = d(obj);
                        c().b(str, l60D);
                        this.e.d(str, l60D);
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        AbstractC8446zt.p((AbstractC8446zt) obj2);
                    }
                    AbstractC4368iZ.b();
                } catch (Throwable th) {
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        AbstractC8446zt.p((AbstractC8446zt) obj2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                i(obj, "drawable_failed @ onNewResult");
                AbstractC8446zt.p((AbstractC8446zt) obj);
                k(str, yc, e, z);
                AbstractC4368iZ.b();
            }
        } catch (Throwable th2) {
            AbstractC4368iZ.b();
            throw th2;
        }
    }

    public final void m() {
        this.a.a(EnumC7202tL.i);
        F00 f00 = this.f;
        if (f00 != null) {
            f00.f.u(f00.a);
            f00.g();
        }
        n();
    }

    public final void n() {
        boolean z = this.k;
        this.k = false;
        this.l = false;
        YC yc = this.m;
        if (yc != null) {
            yc.close();
            this.m = null;
        }
        this.p = null;
        Object obj = this.n;
        if (obj != null) {
            d(obj);
            i(this.n, "release");
            AbstractC8446zt.p((AbstractC8446zt) this.n);
            this.n = null;
        }
        if (z) {
            c().j(this.h);
            this.e.e(this.h, j());
        }
    }

    public final void o(YC yc, L60 l60) {
        c().h(this.i, this.h);
        String str = this.h;
        Object obj = this.i;
        C6589q70 c6589q70 = ((C4297iB0) this).x;
        if (c6589q70 != null) {
            Uri uri = c6589q70.b;
        }
        this.e.f(str, obj, j());
    }

    public final void p(String str, Object obj, YC yc) {
        L60 l60D = d(obj);
        InterfaceC3301cz interfaceC3301czC = c();
        Object obj2 = this.p;
        interfaceC3301czC.o(str, l60D, obj2 instanceof Animatable ? (Animatable) obj2 : null);
        this.e.b(str, l60D, j());
    }

    public String toString() {
        C1857Xo1 c1857Xo1D = EI1.d(this);
        c1857Xo1D.k("isAttached", this.j);
        c1857Xo1D.k("isRequestSubmitted", this.k);
        c1857Xo1D.k("hasFetchFailed", this.l);
        AbstractC8446zt abstractC8446zt = (AbstractC8446zt) this.n;
        int iIdentityHashCode = 0;
        if (abstractC8446zt != null && abstractC8446zt.A()) {
            iIdentityHashCode = System.identityHashCode(abstractC8446zt.b.d());
        }
        c1857Xo1D.l(String.valueOf(iIdentityHashCode), "fetchedImage");
        c1857Xo1D.l(this.a.a.toString(), "events");
        return c1857Xo1D.toString();
    }
}
