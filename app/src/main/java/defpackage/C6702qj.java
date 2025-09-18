package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6702qj implements InterfaceC0443Fl {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ C6702qj(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.InterfaceC0443Fl
    public final Object h0(C0365El c0365El) {
        switch (this.a) {
            case 0:
                this.b.set(c0365El);
                return "Data closed";
            case 1:
                this.b.set(new C1693Vm(0, c0365El));
                return "OnScreenFlashUiApplied";
            case 2:
                this.b.set(c0365El);
                return "Data closed";
            case 3:
                this.b.set(c0365El);
                return "acquireInputBuffer";
            case 4:
                this.b.set(c0365El);
                return "mReleasedFuture";
            default:
                this.b.set(c0365El);
                return "Terminate InputBuffer";
        }
    }
}
