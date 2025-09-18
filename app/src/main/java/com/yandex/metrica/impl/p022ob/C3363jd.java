package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import com.yandex.metrica.impl.p022ob.C2891R0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jd */
/* loaded from: classes2.dex */
public class C3363jd implements InterfaceC2941T0 {

    /* renamed from: a */
    private C3727xd f23715a;

    /* renamed from: b */
    private C3389kd f23716b;

    /* renamed from: c */
    private final List<C3441md<?>> f23717c;

    /* renamed from: d */
    private final InterfaceC3053Xc<C2579Ec> f23718d;

    /* renamed from: e */
    private final InterfaceC3053Xc<C2579Ec> f23719e;

    /* renamed from: f */
    private final InterfaceC3053Xc<C2579Ec> f23720f;

    /* renamed from: g */
    private final InterfaceC3053Xc<C2704Jc> f23721g;

    /* renamed from: h */
    private final C2891R0 f23722h;

    /* renamed from: i */
    private boolean f23723i;

    public C3363jd(C3389kd c3389kd, C3727xd c3727xd) {
        this(c3389kd, c3727xd, C2842P0.m14728i().m14750u());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2941T0
    /* renamed from: a */
    public void mo14192a() {
        if (this.f23723i) {
            Iterator<C3441md<?>> it = this.f23717c.iterator();
            while (it.hasNext()) {
                it.next().m16432c();
            }
        }
    }

    /* renamed from: b */
    public Location m16121b() {
        if (this.f23723i) {
            return this.f23715a.m17175a();
        }
        return null;
    }

    /* renamed from: c */
    public void m16122c() {
        if (this.f23723i) {
            this.f23722h.m14962a();
            Iterator<C3441md<?>> it = this.f23717c.iterator();
            while (it.hasNext()) {
                it.next().m16429a();
            }
        }
    }

    /* renamed from: d */
    public void m16123d() {
        this.f23722h.m14964c();
        Iterator<C3441md<?>> it = this.f23717c.iterator();
        while (it.hasNext()) {
            it.next().m16431b();
        }
    }

    private C3363jd(C3389kd c3389kd, C3727xd c3727xd, C2676I9 c2676i9) {
        this(c3389kd, c3727xd, new C2779Mc(c3389kd, c2676i9), new C2928Sc(c3389kd, c2676i9), new C3623td(c3389kd), new C2754Lc(c3389kd, c2676i9, c3727xd), new C2891R0.c());
    }

    public C3363jd(C3389kd c3389kd, C3727xd c3727xd, AbstractC3700wc abstractC3700wc, AbstractC3700wc abstractC3700wc2, C3623td c3623td, C2754Lc c2754Lc, C2891R0.c cVar) {
        C2579Ec c2579Ec;
        C2704Jc c2704Jc;
        C2579Ec c2579Ec2;
        C2579Ec c2579Ec3;
        this.f23716b = c3389kd;
        C2978Uc c2978Uc = c3389kd.f23920c;
        if (c2978Uc != null) {
            this.f23723i = c2978Uc.f22445g;
            c2579Ec = c2978Uc.f22452n;
            c2579Ec2 = c2978Uc.f22453o;
            c2579Ec3 = c2978Uc.f22454p;
            c2704Jc = c2978Uc.f22455q;
        } else {
            c2579Ec = null;
            c2704Jc = null;
            c2579Ec2 = null;
            c2579Ec3 = null;
        }
        this.f23715a = c3727xd;
        C3441md<C2579Ec> c3441mdM17127a = abstractC3700wc.m17127a(c3727xd, c2579Ec2);
        C3441md<C2579Ec> c3441mdM17127a2 = abstractC3700wc2.m17127a(c3727xd, c2579Ec);
        C3441md<C2579Ec> c3441mdM16846a = c3623td.m16846a(c3727xd, c2579Ec3);
        C3441md<C2704Jc> c3441mdM14530a = c2754Lc.m14530a(c2704Jc);
        this.f23717c = Arrays.asList(c3441mdM17127a, c3441mdM17127a2, c3441mdM16846a, c3441mdM14530a);
        this.f23718d = c3441mdM17127a2;
        this.f23719e = c3441mdM17127a;
        this.f23720f = c3441mdM16846a;
        this.f23721g = c3441mdM14530a;
        C2891R0 c2891r0M14965a = cVar.m14965a(this.f23716b.f23918a.f25416b, this, this.f23715a.m17179b());
        this.f23722h = c2891r0M14965a;
        this.f23715a.m17179b().m14803a(c2891r0M14965a);
    }

    /* renamed from: a */
    public void m16119a(C2885Qi c2885Qi) {
        this.f23715a.m17177a(c2885Qi);
    }

    /* renamed from: a */
    public void m16120a(C2978Uc c2978Uc) {
        this.f23723i = c2978Uc != null && c2978Uc.f22445g;
        this.f23715a.m17178a(c2978Uc);
        ((C3441md) this.f23718d).m16430a(c2978Uc == null ? null : c2978Uc.f22452n);
        ((C3441md) this.f23719e).m16430a(c2978Uc == null ? null : c2978Uc.f22453o);
        ((C3441md) this.f23720f).m16430a(c2978Uc == null ? null : c2978Uc.f22454p);
        ((C3441md) this.f23721g).m16430a(c2978Uc != null ? c2978Uc.f22455q : null);
        mo14192a();
    }
}
