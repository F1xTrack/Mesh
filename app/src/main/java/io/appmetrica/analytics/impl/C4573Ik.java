package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Ik */
/* loaded from: classes2.dex */
public final class C4573Ik {

    /* renamed from: a */
    public final C5294ma f30318a = new C5294ma();

    /* renamed from: b */
    public final HashMap f30319b = new HashMap();

    /* renamed from: c */
    public C5155gl f30320c = null;

    /* renamed from: d */
    public final C4525Gk f30321d = new C4525Gk(this);

    /* renamed from: a */
    public static final C4573Ik m19516a() {
        return AbstractC4549Hk.f30262a;
    }

    /* renamed from: a */
    public final C4428Cl m19517a(Context context, C4964Z4 c4964z4, C5005al c5005al) {
        C4428Cl c4428Cl = (C4428Cl) this.f30319b.get(c4964z4.f31144a);
        boolean z = true;
        if (c4428Cl == null) {
            synchronized (this.f30319b) {
                try {
                    c4428Cl = (C4428Cl) this.f30319b.get(c4964z4.f31144a);
                    if (c4428Cl == null) {
                        c4428Cl = new C4428Cl(new C4453Dl(context, c4964z4.f31144a, c5005al, this.f30321d));
                        c4428Cl.m19300f();
                        this.f30319b.put(c4964z4.f31144a, c4428Cl);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            c4428Cl.m19291a(c5005al);
        }
        return c4428Cl;
    }

    /* renamed from: a */
    public final void m19518a(C4964Z4 c4964z4, InterfaceC4788Rk interfaceC4788Rk) {
        synchronized (this.f30319b) {
            try {
                this.f30318a.m20705a(c4964z4.f31144a, interfaceC4788Rk);
                C5155gl c5155gl = this.f30320c;
                if (c5155gl != null) {
                    interfaceC4788Rk.mo19574a(c5155gl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
