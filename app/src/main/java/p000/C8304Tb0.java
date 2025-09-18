package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: Tb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8304Tb0 implements InterfaceFutureC7800Jj0 {

    /* renamed from: a */
    public final C11687xZ0 f11433a = new C11687xZ0();

    public C8304Tb0(C8148Qb0 c8148Qb0) {
        c8148Qb0.m10798D(true, new C0839NK(1, new C7236z(19, this)));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f11433a.cancel(z);
    }

    @Override // p000.InterfaceFutureC7800Jj0
    /* renamed from: d */
    public final void mo2494d(Runnable runnable, Executor executor) {
        this.f11433a.mo2494d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11433a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11433a.f37381a instanceof C1132S;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11433a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f11433a.get(j, timeUnit);
    }
}
