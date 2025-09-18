package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: LK */
/* loaded from: classes2.dex */
public final class C0714LK implements InterfaceC0776MK {

    /* renamed from: a */
    public final ScheduledFuture f6613a;

    public C0714LK(ScheduledFuture scheduledFuture) {
        this.f6613a = scheduledFuture;
    }

    @Override // p000.InterfaceC0776MK
    /* renamed from: a */
    public final void mo3407a() {
        this.f6613a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f6613a + ']';
    }
}
