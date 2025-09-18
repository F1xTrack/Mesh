package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class R81 {
    public static final ExecutorService g;
    public static final ExecutorC3799fa0 h;
    public static final R81 i;
    public static final R81 j;
    public boolean b;
    public boolean c;
    public Object d;
    public Exception e;
    public final Object a = new Object();
    public ArrayList f = new ArrayList();

    static {
        C0512Gi c0512Gi = C0512Gi.d;
        g = c0512Gi.a;
        h = c0512Gi.c;
        TJ tj = C6197o4.b.a;
        new R81((Boolean) null);
        i = new R81(Boolean.TRUE);
        j = new R81(Boolean.FALSE);
        new R81(0);
    }

    public R81() {
    }

    public static R81 a(Callable callable, ExecutorService executorService) {
        L21 l21 = new L21(2);
        try {
            executorService.execute(new WZ(l21, 17, callable));
        } catch (Exception e) {
            l21.f(new C7074sg(e));
        }
        return (R81) l21.b;
    }

    public static R81 b(Exception exc) {
        R81 r81 = new R81();
        synchronized (r81.a) {
            try {
                if (r81.b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                r81.b = true;
                r81.e = exc;
                r81.a.notifyAll();
                r81.g();
                return r81;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    public final Object d() {
        Object obj;
        synchronized (this.a) {
            obj = this.d;
        }
        return obj;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = c() != null;
        }
        return z;
    }

    public final void g() {
        synchronized (this.a) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC1807Wy) it.next()).a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f = null;
        }
    }

    public final boolean h() {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.c = true;
                this.a.notifyAll();
                g();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i(Object obj) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.d = obj;
                this.a.notifyAll();
                g();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public R81(Boolean bool) {
        i(bool);
    }

    public R81(int i2) {
        h();
    }
}
