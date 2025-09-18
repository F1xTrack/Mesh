package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class N81 {
    public boolean b;
    public boolean c;
    public Object d;
    public Exception e;
    public final Object a = new Object();
    public ArrayList f = new ArrayList();

    static {
        new N81((Boolean) null);
        new N81(Boolean.TRUE);
        new N81(Boolean.FALSE);
        new N81(0);
    }

    public N81() {
    }

    public static N81 c(Exception exc) {
        N81 n81 = new N81();
        synchronized (n81.a) {
            try {
                if (n81.b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                n81.b = true;
                n81.e = exc;
                n81.a.notifyAll();
                n81.h();
                return n81;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final N81 a(InterfaceC1573Ty interfaceC1573Ty) {
        boolean zF;
        C6845rT0 c6845rT0 = new C6845rT0();
        synchronized (this.a) {
            try {
                zF = f();
                if (!zF) {
                    this.f.add(new H81(c6845rT0, interfaceC1573Ty));
                }
            } finally {
            }
        }
        try {
            if (zF) {
                try {
                    try {
                        c6845rT0.i(interfaceC1573Ty.a(this));
                    } catch (Exception e) {
                        c6845rT0.g(e);
                    }
                } catch (CancellationException unused) {
                    c6845rT0.e();
                }
            }
        } catch (Exception e2) {
            c6845rT0.g(new C7074sg(e2));
        }
        return (N81) c6845rT0.a;
    }

    public final N81 b(InterfaceC1573Ty interfaceC1573Ty, Executor executor) {
        boolean zF;
        C6845rT0 c6845rT0 = new C6845rT0();
        synchronized (this.a) {
            try {
                zF = f();
                if (!zF) {
                    this.f.add(new I81(c6845rT0, interfaceC1573Ty, executor));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zF) {
            try {
                executor.execute(new RunnableC1492Sx(interfaceC1573Ty, this, c6845rT0, 17));
            } catch (Exception e) {
                c6845rT0.g(new C7074sg(e));
            }
        }
        return (N81) c6845rT0.a;
    }

    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    public final Object e() {
        Object obj;
        synchronized (this.a) {
            obj = this.d;
        }
        return obj;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = d() != null;
        }
        return z;
    }

    public final void h() {
        synchronized (this.a) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC1573Ty) it.next()).a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f = null;
        }
    }

    public final boolean i() {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.c = true;
                this.a.notifyAll();
                h();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(Object obj) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.d = obj;
                this.a.notifyAll();
                h();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public N81(Boolean bool) {
        j(bool);
    }

    public N81(int i) {
        i();
    }
}
