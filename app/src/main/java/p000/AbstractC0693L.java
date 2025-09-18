package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Map;

/* renamed from: L */
/* loaded from: classes.dex */
public abstract class AbstractC0693L implements InterfaceC6817sL, InterfaceC6416mH {

    /* renamed from: q */
    public static final Map f6425q = C1380Vw.m8640a("component_tag", "drawee");

    /* renamed from: r */
    public static final Map f6426r = C1380Vw.m8641b("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: s */
    public static final Class f6427s = AbstractC0693L.class;

    /* renamed from: a */
    public final C6943uL f6428a;

    /* renamed from: b */
    public final C6479nH f6429b;

    /* renamed from: c */
    public final ScheduledExecutorServiceC7689Hf1 f6430c;

    /* renamed from: d */
    public InterfaceC3899cz f6431d;

    /* renamed from: e */
    public final C6829sX f6432e;

    /* renamed from: f */
    public F00 f6433f;

    /* renamed from: g */
    public C6998vD f6434g;

    /* renamed from: h */
    public String f6435h;

    /* renamed from: i */
    public Object f6436i;

    /* renamed from: j */
    public boolean f6437j;

    /* renamed from: k */
    public boolean f6438k;

    /* renamed from: l */
    public boolean f6439l;

    /* renamed from: m */
    public InterfaceC1523YC f6440m;

    /* renamed from: n */
    public Object f6441n;

    /* renamed from: o */
    public boolean f6442o;

    /* renamed from: p */
    public Drawable f6443p;

    public AbstractC0693L(C6479nH c6479nH, ScheduledExecutorServiceC7689Hf1 scheduledExecutorServiceC7689Hf1) {
        this.f6428a = C6943uL.f43670c ? new C6943uL() : C6943uL.f43669b;
        this.f6432e = new C6829sX();
        this.f6442o = true;
        this.f6429b = c6479nH;
        this.f6430c = scheduledExecutorServiceC7689Hf1;
        m4808f(null, null);
    }

    /* renamed from: a */
    public final void m4803a(InterfaceC3899cz interfaceC3899cz) {
        interfaceC3899cz.getClass();
        InterfaceC3899cz interfaceC3899cz2 = this.f6431d;
        if (interfaceC3899cz2 instanceof C0630K) {
            ((C0630K) interfaceC3899cz2).m24939a(interfaceC3899cz);
            return;
        }
        if (interfaceC3899cz2 == null) {
            this.f6431d = interfaceC3899cz;
            return;
        }
        AbstractC4250iZ.m19063b();
        C0630K c0630k = new C0630K();
        c0630k.m24939a(interfaceC3899cz2);
        c0630k.m24939a(interfaceC3899cz);
        AbstractC4250iZ.m19063b();
        this.f6431d = c0630k;
    }

    /* renamed from: b */
    public abstract Drawable mo4804b(Object obj);

    /* renamed from: c */
    public final InterfaceC3899cz m4805c() {
        InterfaceC3899cz interfaceC3899cz = this.f6431d;
        return interfaceC3899cz == null ? C1363Vf.f12683a : interfaceC3899cz;
    }

    /* renamed from: d */
    public abstract L60 mo4806d(Object obj);

    /* renamed from: e */
    public final F00 m4807e() {
        F00 f00 = this.f6433f;
        if (f00 != null) {
            return f00;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f6436i);
    }

    /* renamed from: f */
    public final synchronized void m4808f(Object obj, String str) {
        C6479nH c6479nH;
        try {
            AbstractC4250iZ.m19063b();
            this.f6428a.m25182a(EnumC6880tL.f43002f);
            if (!this.f6442o && (c6479nH = this.f6429b) != null) {
                c6479nH.m23116b(this);
            }
            this.f6437j = false;
            m4816n();
            InterfaceC3899cz interfaceC3899cz = this.f6431d;
            if (interfaceC3899cz instanceof C0630K) {
                ((C0630K) interfaceC3899cz).m24940c();
            } else {
                this.f6431d = null;
            }
            F00 f00 = this.f6433f;
            if (f00 != null) {
                f00.f3010f.mo24392u(f00.f3005a);
                f00.m2478g();
                C11037sT0 c11037sT0 = this.f6433f.f3008d;
                c11037sT0.f42445d = null;
                c11037sT0.invalidateSelf();
                this.f6433f = null;
            }
            this.f6434g = null;
            if (AbstractC3929dS.f26114a.m18228o(2)) {
                AbstractC3929dS.m17679l(f6427s, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f6435h, str);
            }
            this.f6435h = str;
            this.f6436i = obj;
            AbstractC4250iZ.m19063b();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: g */
    public final boolean m4809g(String str, InterfaceC1523YC interfaceC1523YC) {
        if (interfaceC1523YC == null && this.f6440m == null) {
            return true;
        }
        return str.equals(this.f6435h) && interfaceC1523YC == this.f6440m && this.f6438k;
    }

    /* renamed from: h */
    public final void m4810h(String str, Throwable th) {
        if (AbstractC3929dS.f26114a.m18228o(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f6435h;
            if (AbstractC3929dS.f26114a.m18228o(2)) {
                f6427s.getSimpleName();
                String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th);
            }
        }
    }

    /* renamed from: i */
    public final void m4811i(Object obj, String str) {
        if (AbstractC3929dS.f26114a.m18228o(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f6435h;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            AbstractC7292zt abstractC7292zt = (AbstractC7292zt) obj;
            Object[] objArr = {numValueOf, str2, str, simpleName, Integer.valueOf((abstractC7292zt == null || !abstractC7292zt.m26570A()) ? 0 : System.identityHashCode(abstractC7292zt.f47074b.m24574d()))};
            if (AbstractC3929dS.f26114a.m18228o(2)) {
                f6427s.getSimpleName();
                String.format(null, "controller %x %s: %s: image: %s %x", objArr);
            }
        }
    }

    /* renamed from: j */
    public final C0633K2 m4812j() {
        F00 f00 = this.f6433f;
        if (f00 instanceof F00) {
            String.valueOf(!(f00.m2476e(2) instanceof C10913rV0) ? null : f00.m2477f(2).f41687d);
            if (f00.m2476e(2) instanceof C10913rV0) {
                PointF pointF = f00.m2477f(2).f41688e;
            }
        }
        F00 f002 = this.f6433f;
        Rect bounds = f002 != null ? f002.f3008d.getBounds() : null;
        Object obj = this.f6436i;
        O90.m5968f(f6425q, "componentAttribution");
        O90.m5968f(f6426r, "shortcutAttribution");
        C0633K2 c0633k2 = new C0633K2();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        c0633k2.f5884a = obj;
        return c0633k2;
    }

    /* renamed from: k */
    public final void m4813k(String str, InterfaceC1523YC interfaceC1523YC, Throwable th, boolean z) {
        AbstractC4250iZ.m19063b();
        if (!m4809g(str, interfaceC1523YC)) {
            m4810h("ignore_old_datasource @ onFailure", th);
            interfaceC1523YC.close();
            AbstractC4250iZ.m19063b();
            return;
        }
        this.f6428a.m25182a(z ? EnumC6880tL.f43009m : EnumC6880tL.f43010n);
        C6829sX c6829sX = this.f6432e;
        if (z) {
            m4810h("final_failed @ onFailure", th);
            this.f6440m = null;
            this.f6439l = true;
            F00 f00 = this.f6433f;
            if (f00 != null) {
                C6553oS c6553oS = f00.f3009e;
                c6553oS.f39017r++;
                f00.m2474c();
                if (c6553oS.m23407c(5) != null) {
                    f00.m2473b(5);
                } else {
                    f00.m2473b(1);
                }
                c6553oS.m23405a();
            }
            C0633K2 c0633k2M4812j = m4812j();
            m4805c().mo3352g(this.f6435h, th);
            c6829sX.m24743a(this.f6435h, th, c0633k2M4812j);
        } else {
            m4810h("intermediate_failed @ onFailure", th);
            m4805c().mo3355n(this.f6435h, th);
            c6829sX.m24745c(this.f6435h);
        }
        AbstractC4250iZ.m19063b();
    }

    /* renamed from: l */
    public final void m4814l(String str, InterfaceC1523YC interfaceC1523YC, Object obj, float f, boolean z, boolean z2, boolean z3) {
        try {
            AbstractC4250iZ.m19063b();
            if (!m4809g(str, interfaceC1523YC)) {
                m4811i(obj, "ignore_old_datasource @ onNewResult");
                AbstractC7292zt.m26569p((AbstractC7292zt) obj);
                interfaceC1523YC.close();
                AbstractC4250iZ.m19063b();
                return;
            }
            this.f6428a.m25182a(z ? EnumC6880tL.f43007k : EnumC6880tL.f43008l);
            try {
                Drawable drawableMo4804b = mo4804b(obj);
                Object obj2 = this.f6441n;
                this.f6441n = obj;
                this.f6443p = drawableMo4804b;
                try {
                    if (z) {
                        m4811i(obj, "set_final_result @ onNewResult");
                        this.f6440m = null;
                        m4807e().m2480i(drawableMo4804b, 1.0f, z2);
                        m4818p(str, obj, interfaceC1523YC);
                    } else if (z3) {
                        m4811i(obj, "set_temporary_result @ onNewResult");
                        m4807e().m2480i(drawableMo4804b, 1.0f, z2);
                        m4818p(str, obj, interfaceC1523YC);
                    } else {
                        m4811i(obj, "set_intermediate_result @ onNewResult");
                        m4807e().m2480i(drawableMo4804b, f, z2);
                        L60 l60Mo4806d = mo4806d(obj);
                        m4805c().mo3351b(str, l60Mo4806d);
                        this.f6432e.m24746d(str, l60Mo4806d);
                    }
                    if (obj2 != null && obj2 != obj) {
                        m4811i(obj2, "release_previous_result @ onNewResult");
                        AbstractC7292zt.m26569p((AbstractC7292zt) obj2);
                    }
                    AbstractC4250iZ.m19063b();
                } catch (Throwable th) {
                    if (obj2 != null && obj2 != obj) {
                        m4811i(obj2, "release_previous_result @ onNewResult");
                        AbstractC7292zt.m26569p((AbstractC7292zt) obj2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                m4811i(obj, "drawable_failed @ onNewResult");
                AbstractC7292zt.m26569p((AbstractC7292zt) obj);
                m4813k(str, interfaceC1523YC, e, z);
                AbstractC4250iZ.m19063b();
            }
        } catch (Throwable th2) {
            AbstractC4250iZ.m19063b();
            throw th2;
        }
    }

    /* renamed from: m */
    public final void m4815m() {
        this.f6428a.m25182a(EnumC6880tL.f43005i);
        F00 f00 = this.f6433f;
        if (f00 != null) {
            f00.f3010f.mo24392u(f00.f3005a);
            f00.m2478g();
        }
        m4816n();
    }

    /* renamed from: n */
    public final void m4816n() {
        boolean z = this.f6438k;
        this.f6438k = false;
        this.f6439l = false;
        InterfaceC1523YC interfaceC1523YC = this.f6440m;
        if (interfaceC1523YC != null) {
            interfaceC1523YC.close();
            this.f6440m = null;
        }
        this.f6443p = null;
        Object obj = this.f6441n;
        if (obj != null) {
            mo4806d(obj);
            m4811i(this.f6441n, "release");
            AbstractC7292zt.m26569p((AbstractC7292zt) this.f6441n);
            this.f6441n = null;
        }
        if (z) {
            m4805c().mo3354j(this.f6435h);
            this.f6432e.m24747e(this.f6435h, m4812j());
        }
    }

    /* renamed from: o */
    public final void m4817o(InterfaceC1523YC interfaceC1523YC, L60 l60) {
        m4805c().mo3353h(this.f6436i, this.f6435h);
        String str = this.f6435h;
        Object obj = this.f6436i;
        C10737q70 c10737q70 = ((C9721iB0) this).f28887x;
        if (c10737q70 != null) {
            Uri uri = c10737q70.f40609b;
        }
        this.f6432e.m24748f(str, obj, m4812j());
    }

    /* renamed from: p */
    public final void m4818p(String str, Object obj, InterfaceC1523YC interfaceC1523YC) {
        L60 l60Mo4806d = mo4806d(obj);
        InterfaceC3899cz interfaceC3899czM4805c = m4805c();
        Object obj2 = this.f6443p;
        interfaceC3899czM4805c.mo3356o(str, l60Mo4806d, obj2 instanceof Animatable ? (Animatable) obj2 : null);
        this.f6432e.m24744b(str, l60Mo4806d, m4812j());
    }

    public String toString() {
        C8539Xo1 c8539Xo1M2121d = EI1.m2121d(this);
        c8539Xo1M2121d.m9142k("isAttached", this.f6437j);
        c8539Xo1M2121d.m9142k("isRequestSubmitted", this.f6438k);
        c8539Xo1M2121d.m9142k("hasFetchFailed", this.f6439l);
        AbstractC7292zt abstractC7292zt = (AbstractC7292zt) this.f6441n;
        int iIdentityHashCode = 0;
        if (abstractC7292zt != null && abstractC7292zt.m26570A()) {
            iIdentityHashCode = System.identityHashCode(abstractC7292zt.f47074b.m24574d());
        }
        c8539Xo1M2121d.m9143l(String.valueOf(iIdentityHashCode), "fetchedImage");
        c8539Xo1M2121d.m9143l(this.f6428a.f43671a.toString(), "events");
        return c8539Xo1M2121d.toString();
    }
}
