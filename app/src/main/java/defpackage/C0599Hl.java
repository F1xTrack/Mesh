package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: Hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599Hl implements InterfaceFutureC0750Jj0 {
    public final WeakReference a;
    public final C0521Gl b = new C0521Gl(this);

    public C0599Hl(C0365El c0365El) {
        this.a = new WeakReference(c0365El);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0365El c0365El = (C0365El) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && c0365El != null) {
            c0365El.a = null;
            c0365El.b = null;
            c0365El.c.j(null);
        }
        return zCancel;
    }

    @Override // defpackage.InterfaceFutureC0750Jj0
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof V0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
