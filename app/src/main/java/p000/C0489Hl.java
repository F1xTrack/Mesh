package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: Hl */
/* loaded from: classes.dex */
public final class C0489Hl implements InterfaceFutureC7800Jj0 {

    /* renamed from: a */
    public final WeakReference f4483a;

    /* renamed from: b */
    public final C0426Gl f4484b = new C0426Gl(this);

    public C0489Hl(C0300El c0300El) {
        this.f4483a = new WeakReference(c0300El);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0300El c0300El = (C0300El) this.f4483a.get();
        boolean zCancel = this.f4484b.cancel(z);
        if (zCancel && c0300El != null) {
            c0300El.f2876a = null;
            c0300El.f2877b = null;
            c0300El.f2878c.m10413j(null);
        }
        return zCancel;
    }

    @Override // p000.InterfaceFutureC7800Jj0
    /* renamed from: d */
    public final void mo2494d(Runnable runnable, Executor executor) {
        this.f4484b.mo2494d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f4484b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4484b.f16709a instanceof C1322V0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4484b.isDone();
    }

    public final String toString() {
        return this.f4484b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f4484b.get(j, timeUnit);
    }
}
