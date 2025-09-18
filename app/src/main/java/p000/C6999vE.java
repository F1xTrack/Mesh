package p000;

/* renamed from: vE */
/* loaded from: classes.dex */
public final /* synthetic */ class C6999vE implements InterfaceC8216Rj0, InterfaceC0363Fl {

    /* renamed from: a */
    public final /* synthetic */ int f44278a;

    /* renamed from: b */
    public final /* synthetic */ int f44279b;

    /* renamed from: c */
    public final /* synthetic */ Object f44280c;

    public /* synthetic */ C6999vE(Object obj, int i, int i2) {
        this.f44280c = obj;
        this.f44278a = i;
        this.f44279b = i2;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        C0584JG c0584jg = (C0584JG) this.f44280c;
        c0584jg.getClass();
        c0584jg.m4267b(new RunnableC3973eA(c0584jg, 10, new C6961ud(this.f44278a, this.f44279b, c0300El)), new RunnableC0458HG(0, c0300El));
        return "DefaultSurfaceProcessor#snapshot";
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        ((InterfaceC1577Z3) obj).mo2254p((C1514Y3) this.f44280c, this.f44278a, this.f44279b);
    }
}
