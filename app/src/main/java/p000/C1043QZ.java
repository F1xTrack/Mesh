package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: QZ */
/* loaded from: classes.dex */
public class C1043QZ implements InterfaceFutureC7800Jj0 {

    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 f9668a;

    /* renamed from: b */
    public C0300El f9669b;

    public C1043QZ(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        interfaceFutureC7800Jj0.getClass();
        this.f9668a = interfaceFutureC7800Jj0;
    }

    /* renamed from: a */
    public static C1043QZ m6727a(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        return interfaceFutureC7800Jj0 instanceof C1043QZ ? (C1043QZ) interfaceFutureC7800Jj0 : new C1043QZ(interfaceFutureC7800Jj0);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f9668a.cancel(z);
    }

    @Override // p000.InterfaceFutureC7800Jj0
    /* renamed from: d */
    public final void mo2494d(Runnable runnable, Executor executor) {
        this.f9668a.mo2494d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f9668a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9668a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9668a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.f9668a.get(j, timeUnit);
    }

    public C1043QZ() {
        this.f9668a = AbstractC11797yQ1.m26149b(new C9196e41(18, this));
    }
}
