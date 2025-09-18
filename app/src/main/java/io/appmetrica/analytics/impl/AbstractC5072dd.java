package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.dd */
/* loaded from: classes2.dex */
public abstract class AbstractC5072dd implements InterfaceC5007an, InterfaceC5211j2 {

    /* renamed from: a */
    public final String f31481a;

    /* renamed from: b */
    public final int f31482b;

    /* renamed from: c */
    public final InterfaceC5357on f31483c;

    /* renamed from: d */
    public final AbstractC4770R2 f31484d;

    /* renamed from: e */
    public PublicLogger f31485e = PublicLogger.getAnonymousInstance();

    public AbstractC5072dd(int i, String str, InterfaceC5357on interfaceC5357on, AbstractC4770R2 abstractC4770R2) {
        this.f31482b = i;
        this.f31481a = str;
        this.f31483c = interfaceC5357on;
        this.f31484d = abstractC4770R2;
    }

    /* renamed from: a */
    public final C5032bn m20280a() {
        C5032bn c5032bn = new C5032bn();
        c5032bn.f31343b = this.f31482b;
        c5032bn.f31342a = this.f31481a.getBytes();
        c5032bn.f31345d = new C5082dn();
        c5032bn.f31344c = new C5057cn();
        return c5032bn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5007an
    /* renamed from: a */
    public abstract /* synthetic */ void mo19457a(C4982Zm c4982Zm);

    /* renamed from: b */
    public final AbstractC4770R2 m20282b() {
        return this.f31484d;
    }

    /* renamed from: c */
    public final String m20283c() {
        return this.f31481a;
    }

    /* renamed from: d */
    public final InterfaceC5357on m20284d() {
        return this.f31483c;
    }

    /* renamed from: e */
    public final int m20285e() {
        return this.f31482b;
    }

    /* renamed from: f */
    public final boolean m20286f() {
        C5307mn c5307mnMo19211a = this.f31483c.mo19211a(this.f31481a);
        if (c5307mnMo19211a.f32232a) {
            return true;
        }
        this.f31485e.warning("Attribute " + this.f31481a + " of type " + ((String) AbstractC4623Km.f30412a.get(this.f31482b)) + " is skipped because " + c5307mnMo19211a.f32233b, new Object[0]);
        return false;
    }

    /* renamed from: a */
    public final void m20281a(PublicLogger publicLogger) {
        this.f31485e = publicLogger;
    }
}
