package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class JM1 implements NZ1, InterfaceC3680ey0, InterfaceC1571Tx0, InterfaceC0947Lx0 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public JM1(Executor executor, InterfaceC0947Lx0 interfaceC0947Lx0) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.d = interfaceC0947Lx0;
    }

    private final void c(Task task) {
        synchronized (this.c) {
            try {
                if (((InterfaceC1103Nx0) this.d) == null) {
                    return;
                }
                this.b.execute(new WZ(this, task, false, 26));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d(Task task) {
        if (task.k() || ((C3892g32) task).d) {
            return;
        }
        synchronized (this.c) {
            try {
                if (((InterfaceC1571Tx0) this.d) == null) {
                    return;
                }
                this.b.execute(new RO1(this, task, false, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e(Task task) {
        if (task.k()) {
            synchronized (this.c) {
                try {
                    if (((InterfaceC3680ey0) this.d) == null) {
                        return;
                    }
                    this.b.execute(new RunnableC7990xT1(this, 2, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.NZ1
    public final void a(Task task) {
        switch (this.a) {
            case 0:
                if (((C3892g32) task).d) {
                    synchronized (this.c) {
                        try {
                            if (((InterfaceC0947Lx0) this.d) != null) {
                                this.b.execute(new RunnableC6133nk0(17, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                c(task);
                return;
            case 2:
                d(task);
                return;
            case 3:
                e(task);
                return;
            default:
                this.b.execute(new RO1(this, task, false, 10));
                return;
        }
    }

    @Override // defpackage.InterfaceC0947Lx0
    public void b() {
        ((C3892g32) this.d).q();
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
        ((C3892g32) this.d).o(exc);
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) {
        ((C3892g32) this.d).p(obj);
    }

    public JM1(Executor executor, InterfaceC1103Nx0 interfaceC1103Nx0) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.d = interfaceC1103Nx0;
    }

    public JM1(Executor executor, InterfaceC1571Tx0 interfaceC1571Tx0) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.d = interfaceC1571Tx0;
    }

    public JM1(Executor executor, InterfaceC3680ey0 interfaceC3680ey0) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.d = interfaceC3680ey0;
    }

    public JM1(Executor executor, InterfaceC5441k61 interfaceC5441k61, C3892g32 c3892g32) {
        this.a = 4;
        this.b = executor;
        this.c = interfaceC5441k61;
        this.d = c3892g32;
    }
}
