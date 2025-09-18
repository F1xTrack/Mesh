package p000;

import io.sentry.C5759D1;
import io.sentry.C5782L0;
import io.sentry.C5792O1;
import io.sentry.EnumC5789N1;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5785M0;
import io.sentry.config.AbstractC6003a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: NG */
/* loaded from: classes.dex */
public final /* synthetic */ class C0835NG implements InterfaceC1464XG, InterfaceC9005cd1, InterfaceC5785M0 {

    /* renamed from: a */
    public final /* synthetic */ boolean f7677a;

    /* renamed from: b */
    public final /* synthetic */ Object f7678b;

    /* renamed from: c */
    public final /* synthetic */ Object f7679c;

    /* renamed from: d */
    public final /* synthetic */ Object f7680d;

    public /* synthetic */ C0835NG(EnumC5789N1 enumC5789N1, boolean z, AtomicReference atomicReference, C5759D1 c5759d1) {
        this.f7678b = enumC5789N1;
        this.f7677a = z;
        this.f7679c = atomicReference;
        this.f7680d = c5759d1;
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public void mo3170b(C5782L0 c5782l0) {
        EnumC5789N1 enumC5789N1 = (EnumC5789N1) this.f7678b;
        boolean z = this.f7677a;
        AtomicReference atomicReference = (AtomicReference) this.f7679c;
        C5759D1 c5759d1 = (C5759D1) this.f7680d;
        C5792O1 c5792o1 = c5782l0.f33315k;
        if (c5792o1 == null) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Session is null on updateSession", new Object[0]);
        } else if (c5792o1.m21455c(enumC5789N1, null, z, null)) {
            if (c5792o1.f33353g == EnumC5789N1.Crashed) {
                c5792o1.m21454b(AbstractC6003a.m21752k());
                c5782l0.f33315k = null;
            }
            atomicReference.set(c5792o1);
        }
    }

    @Override // p000.InterfaceC9005cd1
    /* renamed from: d */
    public void mo4002d(Exception exc) throws Throwable {
        C10265mR0 c10265mR0 = (C10265mR0) this.f7678b;
        c10265mR0.getClass();
        S81 s81 = (S81) this.f7679c;
        if (exc != null) {
            s81.m7185c(exc);
            return;
        }
        if (this.f7677a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new MD0(c10265mR0, 18, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = AbstractC7641Gh1.f3852a;
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
        s81.m7186d((C0669Kc) this.f7680d);
    }

    @Override // p000.InterfaceC1464XG
    /* renamed from: i */
    public C9367fQ0 mo2075i(int i, C8149Qb1 c8149Qb1, int[] iArr) {
        C1654aH c1654aH = (C1654aH) this.f7678b;
        c1654aH.getClass();
        C0898OG c0898og = new C0898OG(c1654aH);
        int i2 = ((int[]) this.f7680d)[i];
        M70 m70M6233t = P70.m6233t();
        for (int i3 = 0; i3 < c8149Qb1.f9687a; i3++) {
            m70M6233t.m3755a(new C0961PG(i, c8149Qb1, i3, (C1212TG) this.f7679c, iArr[i3], this.f7677a, c0898og, i2));
        }
        return m70M6233t.m5273h();
    }

    public /* synthetic */ C0835NG(boolean z, Object obj, Object obj2, Object obj3) {
        this.f7678b = obj;
        this.f7679c = obj2;
        this.f7677a = z;
        this.f7680d = obj3;
    }
}
