package p000;

/* renamed from: aW0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8734aW0 implements InterfaceC11119t60 {

    /* renamed from: a */
    public final InterfaceC11119t60 f15548a;

    /* renamed from: b */
    public final Object f15549b = new Object();

    /* renamed from: c */
    public boolean f15550c;

    /* renamed from: d */
    public C1370Vm f15551d;

    public C8734aW0(InterfaceC11119t60 interfaceC11119t60) {
        this.f15548a = interfaceC11119t60;
    }

    @Override // p000.InterfaceC11119t60
    /* renamed from: a */
    public final void mo9306a(long j, C1370Vm c1370Vm) {
        C8313Tf1 c8313Tf1;
        O90.m5968f(c1370Vm, "screenFlashListener");
        synchronized (this.f15549b) {
            this.f15550c = true;
            this.f15551d = c1370Vm;
        }
        InterfaceC11119t60 interfaceC11119t60 = this.f15548a;
        if (interfaceC11119t60 != null) {
            interfaceC11119t60.mo9306a(j, new C1370Vm(1, this));
            c8313Tf1 = C8313Tf1.f11463a;
        } else {
            c8313Tf1 = null;
        }
        if (c8313Tf1 == null) {
            AbstractC7806Jm0.m4412f("ScreenFlashWrapper");
            m9757c();
        }
    }

    /* renamed from: b */
    public final void m9756b() {
        C8313Tf1 c8313Tf1;
        synchronized (this.f15549b) {
            try {
                if (this.f15550c) {
                    InterfaceC11119t60 interfaceC11119t60 = this.f15548a;
                    if (interfaceC11119t60 != null) {
                        interfaceC11119t60.clear();
                        c8313Tf1 = C8313Tf1.f11463a;
                    } else {
                        c8313Tf1 = null;
                    }
                    if (c8313Tf1 == null) {
                        AbstractC7806Jm0.m4412f("ScreenFlashWrapper");
                    }
                } else {
                    AbstractC7806Jm0.m4412f("ScreenFlashWrapper");
                }
                this.f15550c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m9757c() {
        synchronized (this.f15549b) {
            try {
                C1370Vm c1370Vm = this.f15551d;
                if (c1370Vm != null) {
                    c1370Vm.m8543a();
                }
                this.f15551d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC11119t60
    public final void clear() {
        m9756b();
    }
}
