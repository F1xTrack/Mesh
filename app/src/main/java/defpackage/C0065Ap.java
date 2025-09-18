package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: Ap, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0065Ap implements InterfaceC0143Bp {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C0065Ap(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0143Bp
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                ((ScheduledFuture) this.b).cancel(false);
                break;
            case 1:
                ((InterfaceC6099nZ) this.b).invoke(th);
                break;
            default:
                ((MK) this.b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC6099nZ) this.b).getClass().getSimpleName() + '@' + AbstractC8130yD.c(this) + ']';
            default:
                return "DisposeOnCancel[" + ((MK) this.b) + ']';
        }
    }
}
