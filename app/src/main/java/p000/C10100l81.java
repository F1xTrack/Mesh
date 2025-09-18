package p000;

/* renamed from: l81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10100l81 implements InterfaceC8296Sx0 {

    /* renamed from: a */
    public final /* synthetic */ int f36920a;

    /* renamed from: b */
    public final /* synthetic */ C0904OM f36921b;

    public /* synthetic */ C10100l81(C0904OM c0904om, int i) {
        this.f36920a = i;
        this.f36921b = c0904om;
    }

    @Override // p000.InterfaceC8296Sx0
    public final void onFailure(Throwable th) {
        switch (this.f36920a) {
            case 0:
                C0904OM c0904om = this.f36921b;
                O90.m5968f(c0904om, "this$0");
                O90.m5968f(th, "error");
                AbstractC10396nS1.m23145a(c0904om.f8392f.m9645a(th), C6228jI.f35045w, XS0.f13761A);
                break;
            default:
                C0904OM c0904om2 = this.f36921b;
                O90.m5968f(c0904om2, "this$0");
                O90.m5968f(th, "error");
                AbstractC10396nS1.m23145a(c0904om2.f8392f.m9645a(th), C6228jI.f35045w, XS0.f13790z);
                break;
        }
    }
}
