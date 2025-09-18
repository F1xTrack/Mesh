package defpackage;

import com.huawei.hmf.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Wu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1797Wu1 extends Task {
    public boolean b;
    public Object c;
    public Exception d;
    public final Object a = new Object();
    public ArrayList e = new ArrayList();

    @Override // com.huawei.hmf.tasks.Task
    public final C1797Wu1 a(InterfaceC1025Mx0 interfaceC1025Mx0) {
        h(new C7306tt1(X81.c.b, interfaceC1025Mx0));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final C1797Wu1 b(InterfaceC1415Rx0 interfaceC1415Rx0) {
        h(new C7306tt1(X81.c.b, interfaceC1415Rx0));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final C1797Wu1 c(InterfaceC3299cy0 interfaceC3299cy0) {
        h(new C7306tt1(X81.c.b, interfaceC3299cy0));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Object e() {
        Object obj;
        synchronized (this.a) {
            try {
                if (this.d != null) {
                    throw new RuntimeException(this.d);
                }
                obj = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.b && this.d == null;
            } finally {
            }
        }
        return z;
    }

    public final void h(C7306tt1 c7306tt1) {
        boolean zF;
        synchronized (this.a) {
            try {
                zF = f();
                if (!zF) {
                    this.e.add(c7306tt1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zF) {
            c7306tt1.a(this);
        }
    }

    public final void i() {
        synchronized (this.a) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    try {
                        try {
                            ((C7306tt1) it.next()).a(this);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
