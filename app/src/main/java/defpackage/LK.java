package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class LK implements MK {
    public final ScheduledFuture a;

    public LK(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.MK
    public final void a() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
