package p000;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class JM1 implements NZ1, InterfaceC9307ey0, InterfaceC8348Tx0, InterfaceC7932Lx0 {

    /* renamed from: a */
    public final /* synthetic */ int f5495a;

    /* renamed from: b */
    public final Executor f5496b;

    /* renamed from: c */
    public final Object f5497c;

    /* renamed from: d */
    public final Object f5498d;

    public JM1(Executor executor, InterfaceC7932Lx0 interfaceC7932Lx0) {
        this.f5495a = 0;
        this.f5497c = new Object();
        this.f5496b = executor;
        this.f5498d = interfaceC7932Lx0;
    }

    /* renamed from: c */
    private final void m4296c(Task task) {
        synchronized (this.f5497c) {
            try {
                if (((InterfaceC8036Nx0) this.f5498d) == null) {
                    return;
                }
                this.f5496b.execute(new RunnableC1420WZ(this, task, false, 26));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    private final void m4297d(Task task) {
        if (task.mo11144k() || ((C9450g32) task).f27546d) {
            return;
        }
        synchronized (this.f5497c) {
            try {
                if (((InterfaceC8348Tx0) this.f5498d) == null) {
                    return;
                }
                this.f5496b.execute(new RO1(this, task, false, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    private final void m4298e(Task task) {
        if (task.mo11144k()) {
            synchronized (this.f5497c) {
                try {
                    if (((InterfaceC9307ey0) this.f5498d) == null) {
                        return;
                    }
                    this.f5496b.execute(new RunnableC11676xT1(this, 2, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.NZ1
    /* renamed from: a */
    public final void mo4299a(Task task) {
        switch (this.f5495a) {
            case 0:
                if (((C9450g32) task).f27546d) {
                    synchronized (this.f5497c) {
                        try {
                            if (((InterfaceC7932Lx0) this.f5498d) != null) {
                                this.f5496b.execute(new RunnableC10431nk0(17, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                m4296c(task);
                return;
            case 2:
                m4297d(task);
                return;
            case 3:
                m4298e(task);
                return;
            default:
                this.f5496b.execute(new RO1(this, task, false, 10));
                return;
        }
    }

    @Override // p000.InterfaceC7932Lx0
    /* renamed from: b */
    public void mo4300b() {
        ((C9450g32) this.f5498d).m18390q();
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
        ((C9450g32) this.f5498d).m18388o(exc);
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) {
        ((C9450g32) this.f5498d).m18389p(obj);
    }

    public JM1(Executor executor, InterfaceC8036Nx0 interfaceC8036Nx0) {
        this.f5495a = 1;
        this.f5497c = new Object();
        this.f5496b = executor;
        this.f5498d = interfaceC8036Nx0;
    }

    public JM1(Executor executor, InterfaceC8348Tx0 interfaceC8348Tx0) {
        this.f5495a = 2;
        this.f5497c = new Object();
        this.f5496b = executor;
        this.f5498d = interfaceC8348Tx0;
    }

    public JM1(Executor executor, InterfaceC9307ey0 interfaceC9307ey0) {
        this.f5495a = 3;
        this.f5497c = new Object();
        this.f5496b = executor;
        this.f5498d = interfaceC9307ey0;
    }

    public JM1(Executor executor, InterfaceC9968k61 interfaceC9968k61, C9450g32 c9450g32) {
        this.f5495a = 4;
        this.f5496b = executor;
        this.f5497c = interfaceC9968k61;
        this.f5498d = c9450g32;
    }
}
