package p000;

/* renamed from: Cv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C7461Cv1 implements InterfaceC8296Sx0 {

    /* renamed from: a */
    public final /* synthetic */ int f1760a;

    /* renamed from: b */
    public final /* synthetic */ C7773Iv1 f1761b;

    public /* synthetic */ C7461Cv1(C7773Iv1 c7773Iv1, int i) {
        this.f1760a = i;
        this.f1761b = c7773Iv1;
    }

    @Override // p000.InterfaceC8296Sx0
    public final void onFailure(Throwable th) {
        switch (this.f1760a) {
            case 0:
                C7773Iv1 c7773Iv1 = this.f1761b;
                O90.m5968f(c7773Iv1, "this$0");
                O90.m5968f(th, "error");
                AbstractC10396nS1.m23145a(c7773Iv1.f5204d.m9645a(th), C6228jI.f35045w, C8237Rt1.f10474j);
                break;
            default:
                C7773Iv1 c7773Iv12 = this.f1761b;
                O90.m5968f(c7773Iv12, "this$0");
                O90.m5968f(th, "error");
                AbstractC10396nS1.m23145a(c7773Iv12.f5204d.m9645a(th), C6228jI.f35045w, C8237Rt1.f10473i);
                break;
        }
    }
}
