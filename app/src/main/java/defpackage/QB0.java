package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class QB0 {
    public final PB0 a;
    public final OB0 b;
    public final M71 c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public QB0(OB0 ob0, PB0 pb0, AbstractC0178Ca1 abstractC0178Ca1, int i, M71 m71, Looper looper) {
        this.b = ob0;
        this.a = pb0;
        this.f = looper;
        this.c = m71;
    }

    public final synchronized void a(long j) {
        boolean z;
        YN1.f(this.g);
        YN1.f(this.f.getThread() != Thread.currentThread());
        this.c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.i;
            if (z || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            this.c.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        YN1.f(!this.g);
        this.g = true;
        C3390dR c3390dR = (C3390dR) this.b;
        synchronized (c3390dR) {
            if (!c3390dR.z && c3390dR.j.getThread().isAlive()) {
                c3390dR.h.a(14, this).b();
                return;
            }
            AbstractC6789rA1.h("Ignoring messages sent after release.");
            b(false);
        }
    }
}
