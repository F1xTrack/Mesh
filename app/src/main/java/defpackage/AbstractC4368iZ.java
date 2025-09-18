package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: iZ */
/* loaded from: classes.dex */
public abstract class AbstractC4368iZ {
    public static S20 a;
    public static final C8139yG b = new C8139yG("RESUME_TOKEN");

    public static final Object a(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0, Executor executor, AbstractC1963Yy abstractC1963Yy) {
        if (interfaceFutureC0750Jj0.isCancelled()) {
            throw new CancellationException("ListenableFuture<V> has been canceled!");
        }
        if (interfaceFutureC0750Jj0.isDone()) {
            return interfaceFutureC0750Jj0.get();
        }
        RU0 ru0 = new RU0(AbstractC6383p22.b(abstractC1963Yy));
        XZ xz = new XZ(interfaceFutureC0750Jj0, 11, ru0);
        if (executor == null) {
            GK gk = GK.a;
            executor = N02.d(AbstractC0603Hm0.a);
        }
        interfaceFutureC0750Jj0.d(xz, executor);
        Object objB = ru0.b();
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        return objB;
    }

    public static final void b() {
        if (a == null) {
            synchronized (AbstractC4368iZ.class) {
                a = new S20(12);
            }
        }
    }
}
