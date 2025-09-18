package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: iZ */
/* loaded from: classes.dex */
public abstract class AbstractC4250iZ {

    /* renamed from: a */
    public static S20 f29317a;

    /* renamed from: b */
    public static final C7190yG f29318b = new C7190yG("RESUME_TOKEN");

    /* renamed from: a */
    public static final Object m19062a(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0, Executor executor, AbstractC1571Yy abstractC1571Yy) {
        if (interfaceFutureC7800Jj0.isCancelled()) {
            throw new CancellationException("ListenableFuture<V> has been canceled!");
        }
        if (interfaceFutureC7800Jj0.isDone()) {
            return interfaceFutureC7800Jj0.get();
        }
        RU0 ru0 = new RU0(AbstractC10599p22.m23595b(abstractC1571Yy));
        RunnableC1483XZ runnableC1483XZ = new RunnableC1483XZ(interfaceFutureC7800Jj0, 11, ru0);
        if (executor == null) {
            C0399GK c0399gk = C0399GK.f3694a;
            executor = N02.m5506d(AbstractC7702Hm0.f4486a);
        }
        interfaceFutureC7800Jj0.mo2494d(runnableC1483XZ, executor);
        Object objM7026b = ru0.m7026b();
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        return objM7026b;
    }

    /* renamed from: b */
    public static final void m19063b() {
        if (f29317a == null) {
            synchronized (AbstractC4250iZ.class) {
                f29317a = new S20(12);
            }
        }
    }
}
