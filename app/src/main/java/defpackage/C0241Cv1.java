package defpackage;

/* renamed from: Cv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0241Cv1 implements InterfaceC1493Sx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0709Iv1 b;

    public /* synthetic */ C0241Cv1(C0709Iv1 c0709Iv1, int i) {
        this.a = i;
        this.b = c0709Iv1;
    }

    @Override // defpackage.InterfaceC1493Sx0
    public final void onFailure(Throwable th) {
        switch (this.a) {
            case 0:
                C0709Iv1 c0709Iv1 = this.b;
                O90.f(c0709Iv1, "this$0");
                O90.f(th, "error");
                AbstractC6080nS1.a(c0709Iv1.d.a(th), C5284jI.w, C1404Rt1.j);
                break;
            default:
                C0709Iv1 c0709Iv12 = this.b;
                O90.f(c0709Iv12, "this$0");
                O90.f(th, "error");
                AbstractC6080nS1.a(c0709Iv12.d.a(th), C5284jI.w, C1404Rt1.i);
                break;
        }
    }
}
