package defpackage;

import android.os.CancellationSignal;

/* renamed from: Lp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923Lp {
    public boolean a;
    public InterfaceC0845Kp b;
    public CancellationSignal c;
    public boolean d;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.d = true;
                InterfaceC0845Kp interfaceC0845Kp = this.b;
                CancellationSignal cancellationSignal = this.c;
                if (interfaceC0845Kp != null) {
                    try {
                        interfaceC0845Kp.e();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public final Object b() {
        CancellationSignal cancellationSignal;
        synchronized (this) {
            try {
                if (this.c == null) {
                    CancellationSignal cancellationSignal2 = new CancellationSignal();
                    this.c = cancellationSignal2;
                    if (this.a) {
                        cancellationSignal2.cancel();
                    }
                }
                cancellationSignal = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cancellationSignal;
    }

    public final void c(InterfaceC0845Kp interfaceC0845Kp) {
        synchronized (this) {
            while (this.d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b == interfaceC0845Kp) {
                return;
            }
            this.b = interfaceC0845Kp;
            if (this.a) {
                interfaceC0845Kp.e();
            }
        }
    }
}
