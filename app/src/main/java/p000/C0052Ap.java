package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: Ap */
/* loaded from: classes2.dex */
public final class C0052Ap implements InterfaceC0115Bp {

    /* renamed from: a */
    public final /* synthetic */ int f381a;

    /* renamed from: b */
    public final Object f382b;

    public /* synthetic */ C0052Ap(int i, Object obj) {
        this.f381a = i;
        this.f382b = obj;
    }

    @Override // p000.InterfaceC0115Bp
    /* renamed from: a */
    public final void mo324a(Throwable th) {
        switch (this.f381a) {
            case 0:
                ((ScheduledFuture) this.f382b).cancel(false);
                break;
            case 1:
                ((InterfaceC6497nZ) this.f382b).invoke(th);
                break;
            default:
                ((InterfaceC0776MK) this.f382b).mo3407a();
                break;
        }
    }

    public final String toString() {
        switch (this.f381a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f382b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC6497nZ) this.f382b).getClass().getSimpleName() + '@' + AbstractC7187yD.m26097c(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC0776MK) this.f382b) + ']';
        }
    }
}
