package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C2566E;
import com.yandex.metrica.impl.p022ob.C2766M;
import com.yandex.metrica.impl.p022ob.C2885Qi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Yc */
/* loaded from: classes2.dex */
public class C3078Yc implements C2766M.c, C2566E.b {

    /* renamed from: a */
    private List<C3028Wc> f22870a;

    /* renamed from: b */
    private final C2766M f22871b;

    /* renamed from: c */
    private final C3207dd f22872c;

    /* renamed from: d */
    private final C2566E f22873d;

    /* renamed from: e */
    private volatile C2978Uc f22874e;

    /* renamed from: f */
    private final Set<InterfaceC3003Vc> f22875f;

    /* renamed from: g */
    private final Object f22876g;

    public C3078Yc(Context context) {
        this(C2842P0.m14728i().m14734d(), C3207dd.m15750a(context), new C2885Qi.b(context), C2842P0.m14728i().m14733c());
    }

    /* renamed from: d */
    private void m15481d() {
        C2978Uc c2978UcM15480a = m15480a();
        if (C2968U2.m15245a(this.f22874e, c2978UcM15480a)) {
            return;
        }
        this.f22872c.m15756a(c2978UcM15480a);
        this.f22874e = c2978UcM15480a;
        C2978Uc c2978Uc = this.f22874e;
        Iterator<InterfaceC3003Vc> it = this.f22875f.iterator();
        while (it.hasNext()) {
            it.next().mo15306a(c2978Uc);
        }
    }

    /* renamed from: a */
    public synchronized void m15483a(InterfaceC3003Vc interfaceC3003Vc) {
        this.f22875f.add(interfaceC3003Vc);
    }

    /* renamed from: b */
    public void m15484b() {
        synchronized (this.f22876g) {
            this.f22871b.m14565a(this);
            this.f22873d.m14018a(this);
        }
    }

    /* renamed from: c */
    public synchronized void m15485c() {
        m15481d();
    }

    /* renamed from: a */
    public synchronized void m15482a(C2885Qi c2885Qi) {
        this.f22870a = c2885Qi.m14898x();
        this.f22874e = m15480a();
        this.f22872c.m15755a(c2885Qi, this.f22874e);
        C2978Uc c2978Uc = this.f22874e;
        Iterator<InterfaceC3003Vc> it = this.f22875f.iterator();
        while (it.hasNext()) {
            it.next().mo15306a(c2978Uc);
        }
    }

    public C3078Yc(C2766M c2766m, C3207dd c3207dd, C2885Qi.b bVar, C2566E c2566e) {
        this.f22875f = new HashSet();
        this.f22876g = new Object();
        this.f22871b = c2766m;
        this.f22872c = c3207dd;
        this.f22873d = c2566e;
        this.f22870a = bVar.m14950a().m14898x();
    }

    @Override // com.yandex.metrica.impl.p022ob.C2566E.b
    /* renamed from: a */
    public synchronized void mo14025a(C2566E.a aVar) {
        m15481d();
    }

    @Override // com.yandex.metrica.impl.p022ob.C2766M.c
    /* renamed from: a */
    public synchronized void mo14569a(C2766M.b.a aVar) {
        m15481d();
    }

    /* renamed from: a */
    private C2978Uc m15480a() {
        C2566E.a aVarM14023c = this.f22873d.m14023c();
        C2766M.b.a aVarM14566b = this.f22871b.m14566b();
        for (C3028Wc c3028Wc : this.f22870a) {
            if (c3028Wc.f22684b.f23645a.contains(aVarM14566b) && c3028Wc.f22684b.f23646b.contains(aVarM14023c)) {
                return c3028Wc.f22683a;
            }
        }
        return null;
    }
}
