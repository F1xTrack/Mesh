package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.H4 */
/* loaded from: classes2.dex */
public abstract class AbstractC4533H4 extends AbstractC5072dd {

    /* renamed from: f */
    public final Object f30235f;

    public AbstractC4533H4(int i, String str, Object obj, InterfaceC5357on interfaceC5357on, AbstractC4770R2 abstractC4770R2) {
        super(i, str, interfaceC5357on, abstractC4770R2);
        this.f30235f = obj;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5072dd, io.appmetrica.analytics.impl.InterfaceC5007an
    /* renamed from: a */
    public final void mo19457a(C4982Zm c4982Zm) {
        if (m20286f()) {
            AbstractC4770R2 abstractC4770R2 = this.f31484d;
            int i = this.f31482b;
            C5032bn c5032bnMo19430a = abstractC4770R2.mo19430a(c4982Zm, (C5032bn) ((HashMap) c4982Zm.f31229a.get(i)).get(this.f31481a), this);
            if (c5032bnMo19430a != null) {
                mo19197a(c5032bnMo19430a);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo19197a(C5032bn c5032bn);

    /* renamed from: g */
    public final Object m19458g() {
        return this.f30235f;
    }
}
