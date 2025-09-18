package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: yj0 */
/* loaded from: classes.dex */
public final class C11834yj0 implements InterfaceFutureC7800Jj0 {

    /* renamed from: a */
    public ArrayList f46426a;

    /* renamed from: b */
    public ArrayList f46427b;

    /* renamed from: c */
    public final boolean f46428c;

    /* renamed from: d */
    public final AtomicInteger f46429d;

    /* renamed from: e */
    public final C0489Hl f46430e = AbstractC11797yQ1.m26149b(new C9432fw1(21, this));

    /* renamed from: f */
    public C0300El f46431f;

    public C11834yj0(ArrayList arrayList, boolean z, ExecutorC1215TJ executorC1215TJ) {
        this.f46426a = arrayList;
        this.f46427b = new ArrayList(arrayList.size());
        this.f46428c = z;
        this.f46429d = new AtomicInteger(arrayList.size());
        mo2494d(new GR0(28, this), QR1.m6703a());
        if (this.f46426a.isEmpty()) {
            this.f46431f.m2375b(new ArrayList(this.f46427b));
            return;
        }
        for (int i = 0; i < this.f46426a.size(); i++) {
            this.f46427b.add(null);
        }
        ArrayList arrayList2 = this.f46426a;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = (InterfaceFutureC7800Jj0) arrayList2.get(i2);
            interfaceFutureC7800Jj0.mo2494d(new RunnableC6217j7(this, i2, interfaceFutureC7800Jj0, 3), executorC1215TJ);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.f46426a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceFutureC7800Jj0) it.next()).cancel(z);
            }
        }
        return this.f46430e.cancel(z);
    }

    @Override // p000.InterfaceFutureC7800Jj0
    /* renamed from: d */
    public final void mo2494d(Runnable runnable, Executor executor) {
        this.f46430e.f4484b.mo2494d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.f46430e.f4484b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f46430e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f46430e.f4484b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList arrayList = this.f46426a;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = (InterfaceFutureC7800Jj0) it.next();
                while (!interfaceFutureC7800Jj0.isDone()) {
                    try {
                        interfaceFutureC7800Jj0.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f46428c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.f46430e.f4484b.get();
    }
}
