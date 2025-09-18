package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: g32 */
/* loaded from: classes.dex */
public final class C3892g32 extends Task {
    public final Object a = new Object();
    public final X11 b = new X11(12);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final C3892g32 a(Executor executor, InterfaceC0947Lx0 interfaceC0947Lx0) {
        this.b.t(new JM1(executor, interfaceC0947Lx0));
        t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final C3892g32 b(InterfaceC1103Nx0 interfaceC1103Nx0) {
        this.b.t(new JM1(Y81.a, interfaceC1103Nx0));
        t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final C3892g32 c(InterfaceC1571Tx0 interfaceC1571Tx0) {
        d(Y81.a, interfaceC1571Tx0);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final C3892g32 d(Executor executor, InterfaceC1571Tx0 interfaceC1571Tx0) {
        this.b.t(new JM1(executor, interfaceC1571Tx0));
        t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final C3892g32 e(Executor executor, InterfaceC3680ey0 interfaceC3680ey0) {
        this.b.t(new JM1(executor, interfaceC3680ey0));
        t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final C3892g32 f(Executor executor, InterfaceC1651Uy interfaceC1651Uy) {
        C3892g32 c3892g32 = new C3892g32();
        this.b.t(new C7755wE1(executor, interfaceC1651Uy, c3892g32, 0));
        t();
        return c3892g32;
    }

    @Override // com.google.android.gms.tasks.Task
    public final C3892g32 g(Executor executor, InterfaceC1651Uy interfaceC1651Uy) {
        C3892g32 c3892g32 = new C3892g32();
        this.b.t(new C7755wE1(executor, interfaceC1651Uy, c3892g32, 1));
        t();
        return c3892g32;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object i() {
        Object obj;
        synchronized (this.a) {
            try {
                Preconditions.checkState(this.c, "Task is not yet complete");
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new C5703lU0(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final C3892g32 l(InterfaceC5441k61 interfaceC5441k61) {
        ExecutorC1054Nh executorC1054Nh = Y81.a;
        C3892g32 c3892g32 = new C3892g32();
        this.b.t(new JM1(executorC1054Nh, interfaceC5441k61, c3892g32));
        t();
        return c3892g32;
    }

    public final C3892g32 m(Executor executor, InterfaceC1103Nx0 interfaceC1103Nx0) {
        this.b.t(new JM1(executor, interfaceC1103Nx0));
        t();
        return this;
    }

    public final C3892g32 n(Executor executor, InterfaceC5441k61 interfaceC5441k61) {
        C3892g32 c3892g32 = new C3892g32();
        this.b.t(new JM1(executor, interfaceC5441k61, c3892g32));
        t();
        return c3892g32;
    }

    public final void o(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.a) {
            s();
            this.c = true;
            this.f = exc;
        }
        this.b.u(this);
    }

    public final void p(Object obj) {
        synchronized (this.a) {
            s();
            this.c = true;
            this.e = obj;
        }
        this.b.u(this);
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.u(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.u(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        if (this.c) {
            int i = C0311Dt.a;
            if (!j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excH = h();
        }
    }

    public final void t() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.u(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
