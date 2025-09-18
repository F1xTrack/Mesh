package p000;

/* renamed from: NM */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0841NM implements InterfaceC8296Sx0 {

    /* renamed from: a */
    public final /* synthetic */ int f7732a;

    /* renamed from: b */
    public final /* synthetic */ C0904OM f7733b;

    public /* synthetic */ C0841NM(C0904OM c0904om, int i) {
        this.f7732a = i;
        this.f7733b = c0904om;
    }

    @Override // p000.InterfaceC8296Sx0
    public final void onFailure(Throwable th) {
        switch (this.f7732a) {
            case 0:
                C0904OM c0904om = this.f7733b;
                O90.m5968f(c0904om, "this$0");
                O90.m5968f(th, "error");
                AbstractC10396nS1.m23145a(c0904om.f8392f.m9645a(th), C6228jI.f35045w, C6228jI.f35040r);
                break;
            default:
                C0904OM c0904om2 = this.f7733b;
                O90.m5968f(c0904om2, "this$0");
                O90.m5968f(th, "error");
                AbstractC10396nS1.m23145a(c0904om2.f8392f.m9645a(th), C6228jI.f35045w, C6228jI.f35041s);
                break;
        }
    }
}
