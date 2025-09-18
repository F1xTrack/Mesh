package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Wu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8499Wu1 extends Task {

    /* renamed from: b */
    public boolean f13449b;

    /* renamed from: c */
    public Object f13450c;

    /* renamed from: d */
    public Exception f13451d;

    /* renamed from: a */
    public final Object f13448a = new Object();

    /* renamed from: e */
    public ArrayList f13452e = new ArrayList();

    @Override // com.huawei.hmf.tasks.Task
    /* renamed from: a */
    public final C8499Wu1 mo8871a(InterfaceC7984Mx0 interfaceC7984Mx0) {
        m8878h(new C11218tt1(X81.f13575c.f13577b, interfaceC7984Mx0));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    /* renamed from: b */
    public final C8499Wu1 mo8872b(InterfaceC8244Rx0 interfaceC8244Rx0) {
        m8878h(new C11218tt1(X81.f13575c.f13577b, interfaceC8244Rx0));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    /* renamed from: c */
    public final C8499Wu1 mo8873c(InterfaceC9051cy0 interfaceC9051cy0) {
        m8878h(new C11218tt1(X81.f13575c.f13577b, interfaceC9051cy0));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    /* renamed from: d */
    public final Exception mo8874d() {
        Exception exc;
        synchronized (this.f13448a) {
            exc = this.f13451d;
        }
        return exc;
    }

    @Override // com.huawei.hmf.tasks.Task
    /* renamed from: e */
    public final Object mo8875e() {
        Object obj;
        synchronized (this.f13448a) {
            try {
                if (this.f13451d != null) {
                    throw new RuntimeException(this.f13451d);
                }
                obj = this.f13450c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.huawei.hmf.tasks.Task
    /* renamed from: f */
    public final boolean mo8876f() {
        boolean z;
        synchronized (this.f13448a) {
            z = this.f13449b;
        }
        return z;
    }

    @Override // com.huawei.hmf.tasks.Task
    /* renamed from: g */
    public final boolean mo8877g() {
        boolean z;
        synchronized (this.f13448a) {
            try {
                z = this.f13449b && this.f13451d == null;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: h */
    public final void m8878h(C11218tt1 c11218tt1) {
        boolean zMo8876f;
        synchronized (this.f13448a) {
            try {
                zMo8876f = mo8876f();
                if (!zMo8876f) {
                    this.f13452e.add(c11218tt1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zMo8876f) {
            c11218tt1.m25028a(this);
        }
    }

    /* renamed from: i */
    public final void m8879i() {
        synchronized (this.f13448a) {
            try {
                Iterator it = this.f13452e.iterator();
                while (it.hasNext()) {
                    try {
                        try {
                            ((C11218tt1) it.next()).m25028a(this);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
                this.f13452e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
