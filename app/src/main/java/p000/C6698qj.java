package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qj */
/* loaded from: classes.dex */
public final /* synthetic */ class C6698qj implements InterfaceC0363Fl {

    /* renamed from: a */
    public final /* synthetic */ int f41113a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f41114b;

    public /* synthetic */ C6698qj(AtomicReference atomicReference, int i) {
        this.f41113a = i;
        this.f41114b = atomicReference;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public final Object mo411h0(C0300El c0300El) {
        switch (this.f41113a) {
            case 0:
                this.f41114b.set(c0300El);
                return "Data closed";
            case 1:
                this.f41114b.set(new C1370Vm(0, c0300El));
                return "OnScreenFlashUiApplied";
            case 2:
                this.f41114b.set(c0300El);
                return "Data closed";
            case 3:
                this.f41114b.set(c0300El);
                return "acquireInputBuffer";
            case 4:
                this.f41114b.set(c0300El);
                return "mReleasedFuture";
            default:
                this.f41114b.set(c0300El);
                return "Terminate InputBuffer";
        }
    }
}
