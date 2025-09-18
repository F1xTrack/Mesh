package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Cf */
/* loaded from: classes2.dex */
public final class C4422Cf {

    /* renamed from: a */
    public final HashSet f29962a = new HashSet();

    /* renamed from: b */
    public C4472Ef f29963b;

    /* renamed from: c */
    public boolean f29964c;

    /* renamed from: d */
    public final C5457sn f29965d;

    /* renamed from: e */
    public final Context f29966e;

    public C4422Cf(Context context, C5457sn c5457sn) {
        this.f29966e = context;
        this.f29965d = c5457sn;
        this.f29963b = c5457sn.m21060b();
        this.f29964c = c5457sn.m21062c();
    }

    /* renamed from: a */
    public final void m19277a() {
        if (this.f29964c) {
            return;
        }
        Context context = this.f29966e;
        InterfaceC4635La interfaceC4635LaM19638a = C4664Mf.m19638a(context, C5244ka.f32038C.f32044d.m21138a());
        InterfaceC4592Jf interfaceC4592Jf = (InterfaceC4592Jf) new C5474tf(this, new C4664Mf(interfaceC4635LaM19638a), new C5544wa(context), new C4688Nf(context)).f32638f.getValue();
        try {
            interfaceC4635LaM19638a.mo19597a(interfaceC4592Jf);
        } catch (Throwable th) {
            interfaceC4592Jf.mo19535a(th);
        }
    }

    /* renamed from: a */
    public final synchronized void m19279a(C4520Gf c4520Gf) {
        this.f29962a.add(c4520Gf);
        if (this.f29964c) {
            c4520Gf.m19446a(this.f29963b);
        }
    }

    /* renamed from: a */
    public final synchronized void m19278a(C4472Ef c4472Ef) {
        Iterator it = this.f29962a.iterator();
        while (it.hasNext()) {
            ((C4520Gf) it.next()).m19446a(c4472Ef);
        }
    }
}
