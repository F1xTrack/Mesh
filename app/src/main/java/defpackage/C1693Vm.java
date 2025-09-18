package defpackage;

/* renamed from: Vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1693Vm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1693Vm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                AbstractC0759Jm0.f("Camera2CapturePipeline");
                ((C0365El) this.b).b(null);
                return;
            default:
                C2149aW0 c2149aW0 = (C2149aW0) this.b;
                O90.f(c2149aW0, "this$0");
                synchronized (c2149aW0.b) {
                    try {
                        if (c2149aW0.d == null) {
                            AbstractC0759Jm0.f("ScreenFlashWrapper");
                        }
                        c2149aW0.c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
