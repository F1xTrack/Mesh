package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: HH */
/* loaded from: classes.dex */
public final class ScheduledFutureC0459HH extends AbstractC1759b1 implements ScheduledFuture {

    /* renamed from: h */
    public final ScheduledFuture f4202h;

    public ScheduledFutureC0459HH(InterfaceC0396GH interfaceC0396GH) {
        this.f4202h = interfaceC0396GH.mo576a(new C9432fw1(12, this));
    }

    @Override // p000.AbstractC1759b1
    /* renamed from: b */
    public final void mo3341b() {
        ScheduledFuture scheduledFuture = this.f4202h;
        Object obj = this.f16709a;
        scheduledFuture.cancel((obj instanceof C1322V0) && ((C1322V0) obj).f12292a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4202h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4202h.getDelay(timeUnit);
    }
}
