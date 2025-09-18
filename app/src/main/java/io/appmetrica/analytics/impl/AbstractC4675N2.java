package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.N2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4675N2 {

    /* renamed from: a */
    public final AbstractC4806Se f30499a;

    /* renamed from: b */
    public final InterfaceC4392Ba f30500b;

    public AbstractC4675N2(AbstractC4806Se abstractC4806Se, InterfaceC4392Ba interfaceC4392Ba) {
        this.f30499a = abstractC4806Se;
        this.f30500b = interfaceC4392Ba;
    }

    /* renamed from: a */
    public final boolean m19645a(C4821T5 c4821t5, InterfaceC4651M2 interfaceC4651M2) {
        Iterator it = ((C4824T8) this.f30499a.mo19740a(c4821t5.f30764d)).f30777a.iterator();
        while (it.hasNext()) {
            if (interfaceC4651M2.mo19536a(it.next(), c4821t5)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final AbstractC4806Se m19646b() {
        return this.f30499a;
    }

    /* renamed from: a */
    public final InterfaceC4392Ba m19644a() {
        return this.f30500b;
    }
}
