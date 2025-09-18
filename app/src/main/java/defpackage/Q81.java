package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Q81 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public volatile PS0 c;

    public static void d(Executor executor, final InterfaceC5908mZ interfaceC5908mZ) {
        if (executor != null) {
            final int i = 0;
            executor.execute(new Runnable(i, interfaceC5908mZ) { // from class: E81
                public final /* synthetic */ int a;
                public final /* synthetic */ AbstractC1676Vg0 b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.b = (AbstractC1676Vg0) interfaceC5908mZ;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, mZ] */
                /* JADX WARN: Type inference failed for: r0v2, types: [Vg0, mZ] */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.a) {
                        case 0:
                            this.b.invoke();
                            break;
                        default:
                            this.b.invoke();
                            break;
                    }
                }
            });
        } else {
            final int i2 = 1;
            ((Handler) AbstractC2462c91.b.getValue()).post(new Runnable(i2, interfaceC5908mZ) { // from class: E81
                public final /* synthetic */ int a;
                public final /* synthetic */ AbstractC1676Vg0 b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.b = (AbstractC1676Vg0) interfaceC5908mZ;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, mZ] */
                /* JADX WARN: Type inference failed for: r0v2, types: [Vg0, mZ] */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.a) {
                        case 0:
                            this.b.invoke();
                            break;
                        default:
                            this.b.invoke();
                            break;
                    }
                }
            });
        }
    }

    public final void a(InterfaceC1181Ox0 interfaceC1181Ox0, Executor executor) {
        synchronized (this) {
            try {
                PS0 ps0 = this.c;
                if (ps0 == null) {
                    this.b.add(new C6356ov(interfaceC1181Ox0, executor));
                } else {
                    d(executor, new C7726w5(interfaceC1181Ox0, 25, PS0.a(ps0.a)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC3489dy0 interfaceC3489dy0, InterfaceC1493Sx0 interfaceC1493Sx0) {
        synchronized (this) {
            try {
                PS0 ps0 = this.c;
                if (ps0 == null) {
                    this.a.add(new C1217Pj0(interfaceC3489dy0, interfaceC1493Sx0));
                } else {
                    Object obj = ps0.a;
                    Object obj2 = obj instanceof OS0 ? null : obj;
                    Throwable thA = PS0.a(obj);
                    if (obj2 != null && interfaceC3489dy0 != null) {
                        d(null, new L81(interfaceC3489dy0, obj2, 0));
                    }
                    if (thA != null && interfaceC1493Sx0 != null) {
                        d(null, new M81(interfaceC1493Sx0, thA, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object c() throws InterruptedException {
        O90.f(TimeUnit.SECONDS, "unit");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.c != null) {
            countDownLatch.countDown();
        } else {
            F81 f81 = new F81(countDownLatch);
            Object value = AbstractC2462c91.a.getValue();
            O90.e(value, "<get-executorService>(...)");
            a(f81, (ExecutorService) value);
        }
        countDownLatch.await();
        PS0 ps0 = this.c;
        if (ps0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object obj = ps0.a;
        RQ1.d(obj);
        return obj;
    }
}
