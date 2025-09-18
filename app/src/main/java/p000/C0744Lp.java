package p000;

import android.os.CancellationSignal;

/* renamed from: Lp */
/* loaded from: classes.dex */
public final class C0744Lp {

    /* renamed from: a */
    public boolean f6879a;

    /* renamed from: b */
    public InterfaceC0682Kp f6880b;

    /* renamed from: c */
    public CancellationSignal f6881c;

    /* renamed from: d */
    public boolean f6882d;

    /* renamed from: a */
    public final void m5109a() {
        synchronized (this) {
            try {
                if (this.f6879a) {
                    return;
                }
                this.f6879a = true;
                this.f6882d = true;
                InterfaceC0682Kp interfaceC0682Kp = this.f6880b;
                CancellationSignal cancellationSignal = this.f6881c;
                if (interfaceC0682Kp != null) {
                    try {
                        interfaceC0682Kp.mo3136e();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f6882d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.f6882d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final Object m5110b() {
        CancellationSignal cancellationSignal;
        synchronized (this) {
            try {
                if (this.f6881c == null) {
                    CancellationSignal cancellationSignal2 = new CancellationSignal();
                    this.f6881c = cancellationSignal2;
                    if (this.f6879a) {
                        cancellationSignal2.cancel();
                    }
                }
                cancellationSignal = this.f6881c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cancellationSignal;
    }

    /* renamed from: c */
    public final void m5111c(InterfaceC0682Kp interfaceC0682Kp) {
        synchronized (this) {
            while (this.f6882d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f6880b == interfaceC0682Kp) {
                return;
            }
            this.f6880b = interfaceC0682Kp;
            if (this.f6879a) {
                interfaceC0682Kp.mo3136e();
            }
        }
    }
}
