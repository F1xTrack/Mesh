package p000;

import java.util.concurrent.Executor;

/* renamed from: q60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10735q60 extends AbstractC10095l60 {

    /* renamed from: t */
    public final Executor f40603t;

    /* renamed from: u */
    public final Object f40604u = new Object();

    /* renamed from: v */
    public InterfaceC9457g70 f40605v;

    /* renamed from: w */
    public C10607p60 f40606w;

    public C10735q60(Executor executor) {
        this.f40603t = executor;
    }

    @Override // p000.AbstractC10095l60
    /* renamed from: a */
    public final InterfaceC9457g70 mo22356a(InterfaceC9841j70 interfaceC9841j70) {
        return interfaceC9841j70.mo4037a();
    }

    @Override // p000.AbstractC10095l60
    /* renamed from: c */
    public final void mo22358c() {
        synchronized (this.f40604u) {
            try {
                InterfaceC9457g70 interfaceC9457g70 = this.f40605v;
                if (interfaceC9457g70 != null) {
                    interfaceC9457g70.close();
                    this.f40605v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC10095l60
    /* renamed from: e */
    public final void mo22360e(InterfaceC9457g70 interfaceC9457g70) {
        synchronized (this.f40604u) {
            try {
                if (!this.f36910s) {
                    interfaceC9457g70.close();
                    return;
                }
                if (this.f40606w == null) {
                    C10607p60 c10607p60 = new C10607p60(interfaceC9457g70, this);
                    this.f40606w = c10607p60;
                    AbstractC8301Sz1.m7478a(m22357b(c10607p60), new C8342Tu0(17, c10607p60), QR1.m6703a());
                } else {
                    if (interfaceC9457g70.mo18403P().getTimestamp() <= this.f40606w.f46285b.mo18403P().getTimestamp()) {
                        interfaceC9457g70.close();
                    } else {
                        InterfaceC9457g70 interfaceC9457g702 = this.f40605v;
                        if (interfaceC9457g702 != null) {
                            interfaceC9457g702.close();
                        }
                        this.f40605v = interfaceC9457g70;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
