package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: Tb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505Tb0 implements InterfaceFutureC0750Jj0 {
    public final C8007xZ0 a = new C8007xZ0();

    public C1505Tb0(C1271Qb0 c1271Qb0) {
        c1271Qb0.D(true, new NK(1, new C8277z(19, this)));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.InterfaceFutureC0750Jj0
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.a instanceof S;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
