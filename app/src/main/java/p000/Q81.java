package p000;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Q81 {

    /* renamed from: a */
    public final ArrayList f9494a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f9495b = new ArrayList();

    /* renamed from: c */
    public volatile PS0 f9496c;

    /* renamed from: d */
    public static void m6583d(Executor executor, final InterfaceC6434mZ interfaceC6434mZ) {
        if (executor != null) {
            final int i = 0;
            executor.execute(new Runnable(i, interfaceC6434mZ) { // from class: E81

                /* renamed from: a */
                public final /* synthetic */ int f2509a;

                /* renamed from: b */
                public final /* synthetic */ AbstractC8418Vg0 f2510b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f2510b = (AbstractC8418Vg0) interfaceC6434mZ;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, mZ] */
                /* JADX WARN: Type inference failed for: r0v2, types: [Vg0, mZ] */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f2509a) {
                        case 0:
                            this.f2510b.invoke();
                            break;
                        default:
                            this.f2510b.invoke();
                            break;
                    }
                }
            });
        } else {
            final int i2 = 1;
            ((Handler) AbstractC8945c91.f17337b.getValue()).post(new Runnable(i2, interfaceC6434mZ) { // from class: E81

                /* renamed from: a */
                public final /* synthetic */ int f2509a;

                /* renamed from: b */
                public final /* synthetic */ AbstractC8418Vg0 f2510b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f2510b = (AbstractC8418Vg0) interfaceC6434mZ;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, mZ] */
                /* JADX WARN: Type inference failed for: r0v2, types: [Vg0, mZ] */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f2509a) {
                        case 0:
                            this.f2510b.invoke();
                            break;
                        default:
                            this.f2510b.invoke();
                            break;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void m6584a(InterfaceC8088Ox0 interfaceC8088Ox0, Executor executor) {
        synchronized (this) {
            try {
                PS0 ps0 = this.f9496c;
                if (ps0 == null) {
                    this.f9495b.add(new C6584ov(interfaceC8088Ox0, executor));
                } else {
                    m6583d(executor, new C7053w5(interfaceC8088Ox0, 25, PS0.m6365a(ps0.f9075a)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m6585b(InterfaceC9179dy0 interfaceC9179dy0, InterfaceC8296Sx0 interfaceC8296Sx0) {
        synchronized (this) {
            try {
                PS0 ps0 = this.f9496c;
                if (ps0 == null) {
                    this.f9494a.add(new C8112Pj0(interfaceC9179dy0, interfaceC8296Sx0));
                } else {
                    Object obj = ps0.f9075a;
                    Object obj2 = obj instanceof OS0 ? null : obj;
                    Throwable thM6365a = PS0.m6365a(obj);
                    if (obj2 != null && interfaceC9179dy0 != null) {
                        m6583d(null, new L81(interfaceC9179dy0, obj2, 0));
                    }
                    if (thM6365a != null && interfaceC8296Sx0 != null) {
                        m6583d(null, new M81(interfaceC8296Sx0, thM6365a, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final Object m6586c() throws InterruptedException {
        O90.m5968f(TimeUnit.SECONDS, "unit");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f9496c != null) {
            countDownLatch.countDown();
        } else {
            F81 f81 = new F81(countDownLatch);
            Object value = AbstractC8945c91.f17336a.getValue();
            O90.m5967e(value, "<get-executorService>(...)");
            m6584a(f81, (ExecutorService) value);
        }
        countDownLatch.await();
        PS0 ps0 = this.f9496c;
        if (ps0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object obj = ps0.f9075a;
        RQ1.m7017d(obj);
        return obj;
    }
}
