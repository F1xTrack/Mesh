package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: g32 */
/* loaded from: classes.dex */
public final class C9450g32 extends Task {

    /* renamed from: a */
    public final Object f27543a = new Object();

    /* renamed from: b */
    public final X11 f27544b = new X11(12);

    /* renamed from: c */
    public boolean f27545c;

    /* renamed from: d */
    public volatile boolean f27546d;

    /* renamed from: e */
    public Object f27547e;

    /* renamed from: f */
    public Exception f27548f;

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: a */
    public final C9450g32 mo11134a(Executor executor, InterfaceC7932Lx0 interfaceC7932Lx0) {
        this.f27544b.m8922t(new JM1(executor, interfaceC7932Lx0));
        m18393t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: b */
    public final C9450g32 mo11135b(InterfaceC8036Nx0 interfaceC8036Nx0) {
        this.f27544b.m8922t(new JM1(Y81.f14171a, interfaceC8036Nx0));
        m18393t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: c */
    public final C9450g32 mo11136c(InterfaceC8348Tx0 interfaceC8348Tx0) {
        mo11137d(Y81.f14171a, interfaceC8348Tx0);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: d */
    public final C9450g32 mo11137d(Executor executor, InterfaceC8348Tx0 interfaceC8348Tx0) {
        this.f27544b.m8922t(new JM1(executor, interfaceC8348Tx0));
        m18393t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: e */
    public final C9450g32 mo11138e(Executor executor, InterfaceC9307ey0 interfaceC9307ey0) {
        this.f27544b.m8922t(new JM1(executor, interfaceC9307ey0));
        m18393t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: f */
    public final C9450g32 mo11139f(Executor executor, InterfaceC1319Uy interfaceC1319Uy) {
        C9450g32 c9450g32 = new C9450g32();
        this.f27544b.m8922t(new C11519wE1(executor, interfaceC1319Uy, c9450g32, 0));
        m18393t();
        return c9450g32;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: g */
    public final C9450g32 mo11140g(Executor executor, InterfaceC1319Uy interfaceC1319Uy) {
        C9450g32 c9450g32 = new C9450g32();
        this.f27544b.m8922t(new C11519wE1(executor, interfaceC1319Uy, c9450g32, 1));
        m18393t();
        return c9450g32;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: h */
    public final Exception mo11141h() {
        Exception exc;
        synchronized (this.f27543a) {
            exc = this.f27548f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i */
    public final Object mo11142i() {
        Object obj;
        synchronized (this.f27543a) {
            try {
                Preconditions.checkState(this.f27545c, "Task is not yet complete");
                if (this.f27546d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f27548f;
                if (exc != null) {
                    throw new C10143lU0(exc);
                }
                obj = this.f27547e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j */
    public final boolean mo11143j() {
        boolean z;
        synchronized (this.f27543a) {
            z = this.f27545c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k */
    public final boolean mo11144k() {
        boolean z;
        synchronized (this.f27543a) {
            try {
                z = false;
                if (this.f27545c && !this.f27546d && this.f27548f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l */
    public final C9450g32 mo11145l(InterfaceC9968k61 interfaceC9968k61) {
        ExecutorC0862Nh executorC0862Nh = Y81.f14171a;
        C9450g32 c9450g32 = new C9450g32();
        this.f27544b.m8922t(new JM1(executorC0862Nh, interfaceC9968k61, c9450g32));
        m18393t();
        return c9450g32;
    }

    /* renamed from: m */
    public final C9450g32 m18386m(Executor executor, InterfaceC8036Nx0 interfaceC8036Nx0) {
        this.f27544b.m8922t(new JM1(executor, interfaceC8036Nx0));
        m18393t();
        return this;
    }

    /* renamed from: n */
    public final C9450g32 m18387n(Executor executor, InterfaceC9968k61 interfaceC9968k61) {
        C9450g32 c9450g32 = new C9450g32();
        this.f27544b.m8922t(new JM1(executor, interfaceC9968k61, c9450g32));
        m18393t();
        return c9450g32;
    }

    /* renamed from: o */
    public final void m18388o(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f27543a) {
            m18392s();
            this.f27545c = true;
            this.f27548f = exc;
        }
        this.f27544b.m8923u(this);
    }

    /* renamed from: p */
    public final void m18389p(Object obj) {
        synchronized (this.f27543a) {
            m18392s();
            this.f27545c = true;
            this.f27547e = obj;
        }
        this.f27544b.m8923u(this);
    }

    /* renamed from: q */
    public final void m18390q() {
        synchronized (this.f27543a) {
            try {
                if (this.f27545c) {
                    return;
                }
                this.f27545c = true;
                this.f27546d = true;
                this.f27544b.m8923u(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: r */
    public final boolean m18391r(Object obj) {
        synchronized (this.f27543a) {
            try {
                if (this.f27545c) {
                    return false;
                }
                this.f27545c = true;
                this.f27547e = obj;
                this.f27544b.m8923u(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: s */
    public final void m18392s() {
        if (this.f27545c) {
            int i = C0245Dt.f2288a;
            if (!mo11143j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excMo11141h = mo11141h();
        }
    }

    /* renamed from: t */
    public final void m18393t() {
        synchronized (this.f27543a) {
            try {
                if (this.f27545c) {
                    this.f27544b.m8923u(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
