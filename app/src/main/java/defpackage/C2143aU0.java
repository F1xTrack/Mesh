package defpackage;

/* renamed from: aU0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2143aU0 implements InterfaceC3489dy0, InterfaceC1493Sx0 {
    public final /* synthetic */ K81 a;

    public /* synthetic */ C2143aU0(K81 k81) {
        this.a = k81;
    }

    @Override // defpackage.InterfaceC1493Sx0
    public void onFailure(Throwable th) {
        K81 k81 = this.a;
        O90.f(k81, "$resultProvider");
        O90.f(th, "innerExc");
        k81.b(new PS(th instanceof TT0 ? (TT0) th : new TT0(th)));
    }

    @Override // defpackage.InterfaceC3489dy0
    public void onSuccess(Object obj) {
        K81 k81 = this.a;
        O90.f(k81, "$resultProvider");
        O90.f((C1518Tf1) obj, "it");
        k81.b(OS.a);
    }
}
