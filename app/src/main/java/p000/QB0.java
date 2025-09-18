package p000;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class QB0 {

    /* renamed from: a */
    public final PB0 f9517a;

    /* renamed from: b */
    public final OB0 f9518b;

    /* renamed from: c */
    public final M71 f9519c;

    /* renamed from: d */
    public int f9520d;

    /* renamed from: e */
    public Object f9521e;

    /* renamed from: f */
    public final Looper f9522f;

    /* renamed from: g */
    public boolean f9523g;

    /* renamed from: h */
    public boolean f9524h;

    /* renamed from: i */
    public boolean f9525i;

    public QB0(OB0 ob0, PB0 pb0, AbstractC7419Ca1 abstractC7419Ca1, int i, M71 m71, Looper looper) {
        this.f9518b = ob0;
        this.f9517a = pb0;
        this.f9522f = looper;
        this.f9519c = m71;
    }

    /* renamed from: a */
    public final synchronized void m6595a(long j) {
        boolean z;
        YN1.m9281f(this.f9523g);
        YN1.m9281f(this.f9522f.getThread() != Thread.currentThread());
        this.f9519c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.f9525i;
            if (z || j <= 0) {
                break;
            }
            this.f9519c.getClass();
            wait(j);
            this.f9519c.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    /* renamed from: b */
    public final synchronized void m6596b(boolean z) {
        this.f9524h = z | this.f9524h;
        this.f9525i = true;
        notifyAll();
    }

    /* renamed from: c */
    public final void m6597c() {
        YN1.m9281f(!this.f9523g);
        this.f9523g = true;
        C3928dR c3928dR = (C3928dR) this.f9518b;
        synchronized (c3928dR) {
            if (!c3928dR.f26106z && c3928dR.f26090j.getThread().isAlive()) {
                c3928dR.f26088h.m6904a(14, this).m6576b();
                return;
            }
            AbstractC10872rA1.m24175h("Ignoring messages sent after release.");
            m6596b(false);
        }
    }
}
