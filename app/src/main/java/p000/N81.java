package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class N81 {

    /* renamed from: b */
    public boolean f7528b;

    /* renamed from: c */
    public boolean f7529c;

    /* renamed from: d */
    public Object f7530d;

    /* renamed from: e */
    public Exception f7531e;

    /* renamed from: a */
    public final Object f7527a = new Object();

    /* renamed from: f */
    public ArrayList f7532f = new ArrayList();

    static {
        new N81((Boolean) null);
        new N81(Boolean.TRUE);
        new N81(Boolean.FALSE);
        new N81(0);
    }

    public N81() {
    }

    /* renamed from: c */
    public static N81 m5568c(Exception exc) {
        N81 n81 = new N81();
        synchronized (n81.f7527a) {
            try {
                if (n81.f7528b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                n81.f7528b = true;
                n81.f7531e = exc;
                n81.f7527a.notifyAll();
                n81.m5575h();
                return n81;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final N81 m5569a(InterfaceC1256Ty interfaceC1256Ty) {
        boolean zM5573f;
        C10909rT0 c10909rT0 = new C10909rT0();
        synchronized (this.f7527a) {
            try {
                zM5573f = m5573f();
                if (!zM5573f) {
                    this.f7532f.add(new H81(c10909rT0, interfaceC1256Ty));
                }
            } finally {
            }
        }
        try {
            if (zM5573f) {
                try {
                    try {
                        c10909rT0.m24357i(interfaceC1256Ty.mo2126a(this));
                    } catch (Exception e) {
                        c10909rT0.m24356g(e);
                    }
                } catch (CancellationException unused) {
                    c10909rT0.m24355e();
                }
            }
        } catch (Exception e2) {
            c10909rT0.m24356g(new C6838sg(e2));
        }
        return (N81) c10909rT0.f41672a;
    }

    /* renamed from: b */
    public final N81 m5570b(InterfaceC1256Ty interfaceC1256Ty, Executor executor) {
        boolean zM5573f;
        C10909rT0 c10909rT0 = new C10909rT0();
        synchronized (this.f7527a) {
            try {
                zM5573f = m5573f();
                if (!zM5573f) {
                    this.f7532f.add(new I81(c10909rT0, interfaceC1256Ty, executor));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM5573f) {
            try {
                executor.execute(new RunnableC1192Sx(interfaceC1256Ty, this, c10909rT0, 17));
            } catch (Exception e) {
                c10909rT0.m24356g(new C6838sg(e));
            }
        }
        return (N81) c10909rT0.f41672a;
    }

    /* renamed from: d */
    public final Exception m5571d() {
        Exception exc;
        synchronized (this.f7527a) {
            exc = this.f7531e;
        }
        return exc;
    }

    /* renamed from: e */
    public final Object m5572e() {
        Object obj;
        synchronized (this.f7527a) {
            obj = this.f7530d;
        }
        return obj;
    }

    /* renamed from: f */
    public final boolean m5573f() {
        boolean z;
        synchronized (this.f7527a) {
            z = this.f7528b;
        }
        return z;
    }

    /* renamed from: g */
    public final boolean m5574g() {
        boolean z;
        synchronized (this.f7527a) {
            z = m5571d() != null;
        }
        return z;
    }

    /* renamed from: h */
    public final void m5575h() {
        synchronized (this.f7527a) {
            Iterator it = this.f7532f.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC1256Ty) it.next()).mo2126a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f7532f = null;
        }
    }

    /* renamed from: i */
    public final boolean m5576i() {
        synchronized (this.f7527a) {
            try {
                if (this.f7528b) {
                    return false;
                }
                this.f7528b = true;
                this.f7529c = true;
                this.f7527a.notifyAll();
                m5575h();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final boolean m5577j(Object obj) {
        synchronized (this.f7527a) {
            try {
                if (this.f7528b) {
                    return false;
                }
                this.f7528b = true;
                this.f7530d = obj;
                this.f7527a.notifyAll();
                m5575h();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public N81(Boolean bool) {
        m5577j(bool);
    }

    public N81(int i) {
        m5576i();
    }
}
