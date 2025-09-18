package defpackage;

import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.L0;
import io.sentry.M0;
import io.sentry.N1;
import io.sentry.O1;
import io.sentry.config.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class NG implements XG, InterfaceC2552cd1, M0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ NG(N1 n1, boolean z, AtomicReference atomicReference, D1 d1) {
        this.b = n1;
        this.a = z;
        this.c = atomicReference;
        this.d = d1;
    }

    @Override // io.sentry.M0
    public void b(L0 l0) {
        N1 n1 = (N1) this.b;
        boolean z = this.a;
        AtomicReference atomicReference = (AtomicReference) this.c;
        D1 d1 = (D1) this.d;
        O1 o1 = l0.k;
        if (o1 == null) {
            d1.getLogger().k(EnumC5148n1.INFO, "Session is null on updateSession", new Object[0]);
        } else if (o1.c(n1, null, z, null)) {
            if (o1.g == N1.Crashed) {
                o1.b(a.k());
                l0.k = null;
            }
            atomicReference.set(o1);
        }
    }

    @Override // defpackage.InterfaceC2552cd1
    public void d(Exception exc) throws Throwable {
        C5885mR0 c5885mR0 = (C5885mR0) this.b;
        c5885mR0.getClass();
        S81 s81 = (S81) this.c;
        if (exc != null) {
            s81.c(exc);
            return;
        }
        if (this.a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new MD0(c5885mR0, 18, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = AbstractC0511Gh1.a;
            boolean z2 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            nanos = jNanoTime - System.nanoTime();
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        s81.d((C0806Kc) this.d);
    }

    @Override // defpackage.XG
    public C3769fQ0 i(int i, C1272Qb1 c1272Qb1, int[] iArr) {
        C2103aH c2103aH = (C2103aH) this.b;
        c2103aH.getClass();
        OG og = new OG(c2103aH);
        int i2 = ((int[]) this.d)[i];
        M70 m70T = P70.t();
        for (int i3 = 0; i3 < c1272Qb1.a; i3++) {
            m70T.a(new PG(i, c1272Qb1, i3, (TG) this.c, iArr[i3], this.a, og, i2));
        }
        return m70T.h();
    }

    public /* synthetic */ NG(boolean z, Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
        this.d = obj3;
    }
}
