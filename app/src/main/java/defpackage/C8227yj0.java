package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: yj0 */
/* loaded from: classes.dex */
public final class C8227yj0 implements InterfaceFutureC0750Jj0 {
    public ArrayList a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger d;
    public final C0599Hl e = AbstractC8171yQ1.b(new C3866fw1(21, this));
    public C0365El f;

    public C8227yj0(ArrayList arrayList, boolean z, TJ tj) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.d = new AtomicInteger(arrayList.size());
        d(new GR0(28, this), QR1.a());
        if (this.a.isEmpty()) {
            this.f.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(null);
        }
        ArrayList arrayList2 = this.a;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = (InterfaceFutureC0750Jj0) arrayList2.get(i2);
            interfaceFutureC0750Jj0.d(new RunnableC5251j7(this, i2, interfaceFutureC0750Jj0, 3), tj);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceFutureC0750Jj0) it.next()).cancel(z);
            }
        }
        return this.e.cancel(z);
    }

    @Override // defpackage.InterfaceFutureC0750Jj0
    public final void d(Runnable runnable, Executor executor) {
        this.e.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.e.b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.e.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList arrayList = this.a;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = (InterfaceFutureC0750Jj0) it.next();
                while (!interfaceFutureC0750Jj0.isDone()) {
                    try {
                        interfaceFutureC0750Jj0.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.e.b.get();
    }
}
