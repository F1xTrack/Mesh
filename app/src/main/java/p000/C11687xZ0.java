package p000;

/* renamed from: xZ0 */
/* loaded from: classes.dex */
public final class C11687xZ0 extends AbstractC6399m0 {
    /* renamed from: j */
    public final boolean m25921j(Object obj) {
        if (obj == null) {
            obj = AbstractC6399m0.f37380g;
        }
        if (!AbstractC6399m0.f37379f.mo9445b(this, null, obj)) {
            return false;
        }
        AbstractC6399m0.m22606b(this);
        return true;
    }

    /* renamed from: k */
    public final boolean m25922k(Throwable th) {
        if (!AbstractC6399m0.f37379f.mo9445b(this, null, new C1321V(th))) {
            return false;
        }
        AbstractC6399m0.m22606b(this);
        return true;
    }

    /* renamed from: l */
    public final boolean m25923l(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        C1321V c1321v;
        interfaceFutureC7800Jj0.getClass();
        Object obj = this.f37381a;
        if (obj == null) {
            if (interfaceFutureC7800Jj0.isDone()) {
                if (!AbstractC6399m0.f37379f.mo9445b(this, null, AbstractC6399m0.m22609f(interfaceFutureC7800Jj0))) {
                    return false;
                }
                AbstractC6399m0.m22606b(this);
            } else {
                RunnableC1637a0 runnableC1637a0 = new RunnableC1637a0(this, interfaceFutureC7800Jj0);
                if (AbstractC6399m0.f37379f.mo9445b(this, null, runnableC1637a0)) {
                    try {
                        interfaceFutureC7800Jj0.mo2494d(runnableC1637a0, EnumC1089RJ.f10118a);
                    } catch (Throwable th) {
                        try {
                            c1321v = new C1321V(th);
                        } catch (Throwable unused) {
                            c1321v = C1321V.f12288b;
                        }
                        AbstractC6399m0.f37379f.mo9445b(this, runnableC1637a0, c1321v);
                    }
                } else {
                    obj = this.f37381a;
                }
            }
            return true;
        }
        if (!(obj instanceof C1132S)) {
            return false;
        }
        interfaceFutureC7800Jj0.cancel(((C1132S) obj).f10521a);
        return false;
    }
}
