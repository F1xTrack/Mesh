package p000;

/* renamed from: aU0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8730aU0 implements InterfaceC9179dy0, InterfaceC8296Sx0 {

    /* renamed from: a */
    public final /* synthetic */ K81 f15533a;

    public /* synthetic */ C8730aU0(K81 k81) {
        this.f15533a = k81;
    }

    @Override // p000.InterfaceC8296Sx0
    public void onFailure(Throwable th) {
        K81 k81 = this.f15533a;
        O90.m5968f(k81, "$resultProvider");
        O90.m5968f(th, "innerExc");
        k81.m4569b(new C0973PS(th instanceof TT0 ? (TT0) th : new TT0(th)));
    }

    @Override // p000.InterfaceC9179dy0
    public void onSuccess(Object obj) {
        K81 k81 = this.f15533a;
        O90.m5968f(k81, "$resultProvider");
        O90.m5968f((C8313Tf1) obj, "it");
        k81.m4569b(C0910OS.f8449a);
    }
}
