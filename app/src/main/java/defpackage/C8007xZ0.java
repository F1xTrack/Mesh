package defpackage;

/* renamed from: xZ0 */
/* loaded from: classes.dex */
public final class C8007xZ0 extends AbstractC5799m0 {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = AbstractC5799m0.g;
        }
        if (!AbstractC5799m0.f.b(this, null, obj)) {
            return false;
        }
        AbstractC5799m0.b(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!AbstractC5799m0.f.b(this, null, new V(th))) {
            return false;
        }
        AbstractC5799m0.b(this);
        return true;
    }

    public final boolean l(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        V v;
        interfaceFutureC0750Jj0.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (interfaceFutureC0750Jj0.isDone()) {
                if (!AbstractC5799m0.f.b(this, null, AbstractC5799m0.f(interfaceFutureC0750Jj0))) {
                    return false;
                }
                AbstractC5799m0.b(this);
            } else {
                RunnableC2048a0 runnableC2048a0 = new RunnableC2048a0(this, interfaceFutureC0750Jj0);
                if (AbstractC5799m0.f.b(this, null, runnableC2048a0)) {
                    try {
                        interfaceFutureC0750Jj0.d(runnableC2048a0, RJ.a);
                    } catch (Throwable th) {
                        try {
                            v = new V(th);
                        } catch (Throwable unused) {
                            v = V.b;
                        }
                        AbstractC5799m0.f.b(this, runnableC2048a0, v);
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        interfaceFutureC0750Jj0.cancel(((S) obj).a);
        return false;
    }
}
