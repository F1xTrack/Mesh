package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class R81 {

    /* renamed from: g */
    public static final ExecutorService f10027g;

    /* renamed from: h */
    public static final ExecutorC9387fa0 f10028h;

    /* renamed from: i */
    public static final R81 f10029i;

    /* renamed from: j */
    public static final R81 f10030j;

    /* renamed from: b */
    public boolean f10032b;

    /* renamed from: c */
    public boolean f10033c;

    /* renamed from: d */
    public Object f10034d;

    /* renamed from: e */
    public Exception f10035e;

    /* renamed from: a */
    public final Object f10031a = new Object();

    /* renamed from: f */
    public ArrayList f10036f = new ArrayList();

    static {
        C0423Gi c0423Gi = C0423Gi.f3853d;
        f10027g = c0423Gi.f3854a;
        f10028h = c0423Gi.f3856c;
        ExecutorC1215TJ executorC1215TJ = C6529o4.f38752b.f38755a;
        new R81((Boolean) null);
        f10029i = new R81(Boolean.TRUE);
        f10030j = new R81(Boolean.FALSE);
        new R81(0);
    }

    public R81() {
    }

    /* renamed from: a */
    public static R81 m6908a(Callable callable, ExecutorService executorService) {
        L21 l21 = new L21(2);
        try {
            executorService.execute(new RunnableC1420WZ(l21, 17, callable));
        } catch (Exception e) {
            l21.m4874f(new C6838sg(e));
        }
        return (R81) l21.f6473b;
    }

    /* renamed from: b */
    public static R81 m6909b(Exception exc) {
        R81 r81 = new R81();
        synchronized (r81.f10031a) {
            try {
                if (r81.f10032b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                r81.f10032b = true;
                r81.f10035e = exc;
                r81.f10031a.notifyAll();
                r81.m6914g();
                return r81;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final Exception m6910c() {
        Exception exc;
        synchronized (this.f10031a) {
            exc = this.f10035e;
        }
        return exc;
    }

    /* renamed from: d */
    public final Object m6911d() {
        Object obj;
        synchronized (this.f10031a) {
            obj = this.f10034d;
        }
        return obj;
    }

    /* renamed from: e */
    public final boolean m6912e() {
        boolean z;
        synchronized (this.f10031a) {
            z = this.f10032b;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean m6913f() {
        boolean z;
        synchronized (this.f10031a) {
            z = m6910c() != null;
        }
        return z;
    }

    /* renamed from: g */
    public final void m6914g() {
        synchronized (this.f10031a) {
            Iterator it = this.f10036f.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC1445Wy) it.next()).mo2929a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f10036f = null;
        }
    }

    /* renamed from: h */
    public final boolean m6915h() {
        synchronized (this.f10031a) {
            try {
                if (this.f10032b) {
                    return false;
                }
                this.f10032b = true;
                this.f10033c = true;
                this.f10031a.notifyAll();
                m6914g();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final boolean m6916i(Object obj) {
        synchronized (this.f10031a) {
            try {
                if (this.f10032b) {
                    return false;
                }
                this.f10032b = true;
                this.f10034d = obj;
                this.f10031a.notifyAll();
                m6914g();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public R81(Boolean bool) {
        m6916i(bool);
    }

    public R81(int i) {
        m6915h();
    }
}
