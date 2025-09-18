package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class QZ implements InterfaceFutureC0750Jj0 {
    public final InterfaceFutureC0750Jj0 a;
    public C0365El b;

    public QZ(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        interfaceFutureC0750Jj0.getClass();
        this.a = interfaceFutureC0750Jj0;
    }

    public static QZ a(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        return interfaceFutureC0750Jj0 instanceof QZ ? (QZ) interfaceFutureC0750Jj0 : new QZ(interfaceFutureC0750Jj0);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.InterfaceFutureC0750Jj0
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public QZ() {
        this.a = AbstractC8171yQ1.b(new C3513e41(18, this));
    }
}
