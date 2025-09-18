package defpackage;

/* renamed from: l81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5638l81 implements InterfaceC1493Sx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OM b;

    public /* synthetic */ C5638l81(OM om, int i) {
        this.a = i;
        this.b = om;
    }

    @Override // defpackage.InterfaceC1493Sx0
    public final void onFailure(Throwable th) {
        switch (this.a) {
            case 0:
                OM om = this.b;
                O90.f(om, "this$0");
                O90.f(th, "error");
                AbstractC6080nS1.a(om.f.a(th), C5284jI.w, XS0.A);
                break;
            default:
                OM om2 = this.b;
                O90.f(om2, "this$0");
                O90.f(th, "error");
                AbstractC6080nS1.a(om2.f.a(th), C5284jI.w, XS0.z);
                break;
        }
    }
}
