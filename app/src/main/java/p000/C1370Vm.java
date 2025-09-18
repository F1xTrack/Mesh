package p000;

/* renamed from: Vm */
/* loaded from: classes.dex */
public final /* synthetic */ class C1370Vm {

    /* renamed from: a */
    public final /* synthetic */ int f12715a;

    /* renamed from: b */
    public final /* synthetic */ Object f12716b;

    public /* synthetic */ C1370Vm(int i, Object obj) {
        this.f12715a = i;
        this.f12716b = obj;
    }

    /* renamed from: a */
    public final void m8543a() {
        switch (this.f12715a) {
            case 0:
                AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
                ((C0300El) this.f12716b).m2375b(null);
                return;
            default:
                C8734aW0 c8734aW0 = (C8734aW0) this.f12716b;
                O90.m5968f(c8734aW0, "this$0");
                synchronized (c8734aW0.f15549b) {
                    try {
                        if (c8734aW0.f15551d == null) {
                            AbstractC7806Jm0.m4412f("ScreenFlashWrapper");
                        }
                        c8734aW0.m9757c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
