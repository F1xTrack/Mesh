package defpackage;

import java.util.concurrent.Executor;

/* renamed from: q60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6586q60 extends AbstractC5631l60 {
    public final Executor t;
    public final Object u = new Object();
    public InterfaceC3903g70 v;
    public C6395p60 w;

    public C6586q60(Executor executor) {
        this.t = executor;
    }

    @Override // defpackage.AbstractC5631l60
    public final InterfaceC3903g70 a(InterfaceC5252j70 interfaceC5252j70) {
        return interfaceC5252j70.a();
    }

    @Override // defpackage.AbstractC5631l60
    public final void c() {
        synchronized (this.u) {
            try {
                InterfaceC3903g70 interfaceC3903g70 = this.v;
                if (interfaceC3903g70 != null) {
                    interfaceC3903g70.close();
                    this.v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC5631l60
    public final void e(InterfaceC3903g70 interfaceC3903g70) {
        synchronized (this.u) {
            try {
                if (!this.s) {
                    interfaceC3903g70.close();
                    return;
                }
                if (this.w == null) {
                    C6395p60 c6395p60 = new C6395p60(interfaceC3903g70, this);
                    this.w = c6395p60;
                    AbstractC1500Sz1.a(b(c6395p60), new C1562Tu0(17, c6395p60), QR1.a());
                } else {
                    if (interfaceC3903g70.P().getTimestamp() <= this.w.b.P().getTimestamp()) {
                        interfaceC3903g70.close();
                    } else {
                        InterfaceC3903g70 interfaceC3903g702 = this.v;
                        if (interfaceC3903g702 != null) {
                            interfaceC3903g702.close();
                        }
                        this.v = interfaceC3903g70;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
