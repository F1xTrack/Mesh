package io.appmetrica.analytics.impl;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Hf */
/* loaded from: classes2.dex */
public final class C4544Hf implements InterfaceC4397Bf {

    /* renamed from: a */
    public final HashSet f30256a;

    /* renamed from: b */
    public boolean f30257b;

    /* renamed from: c */
    public C4472Ef f30258c;

    public C4544Hf() {
        this(C5244ka.m20614h().m20633r());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4397Bf
    /* renamed from: a */
    public final synchronized void mo19236a(C4472Ef c4472Ef) {
        try {
            this.f30258c = c4472Ef;
            this.f30257b = true;
            Iterator it = this.f30256a.iterator();
            while (it.hasNext()) {
                ((InterfaceC5499uf) it.next()).mo19203a(this.f30258c);
            }
            this.f30256a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public C4544Hf(C4422Cf c4422Cf) {
        this.f30256a = new HashSet();
        c4422Cf.m19279a(new C5604yk(this));
        c4422Cf.m19277a();
    }

    /* renamed from: a */
    public final synchronized void m19474a(InterfaceC5499uf interfaceC5499uf) {
        this.f30256a.add(interfaceC5499uf);
        if (this.f30257b) {
            interfaceC5499uf.mo19203a(this.f30258c);
            this.f30256a.remove(interfaceC5499uf);
        }
    }
}
