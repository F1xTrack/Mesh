package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class HH extends AbstractC2243b1 implements ScheduledFuture {
    public final ScheduledFuture h;

    public HH(GH gh) {
        this.h = gh.a(new C3866fw1(12, this));
    }

    @Override // defpackage.AbstractC2243b1
    public final void b() {
        ScheduledFuture scheduledFuture = this.h;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof V0) && ((V0) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.h.getDelay(timeUnit);
    }
}
