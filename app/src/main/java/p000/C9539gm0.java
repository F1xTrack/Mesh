package p000;

/* renamed from: gm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9539gm0 implements InterfaceC10179lm0 {

    /* renamed from: a */
    public final /* synthetic */ int f27986a;

    /* renamed from: b */
    public final /* synthetic */ C10307mm0 f27987b;

    /* renamed from: c */
    public final /* synthetic */ int f27988c;

    public /* synthetic */ C9539gm0(C10307mm0 c10307mm0, int i, int i2) {
        this.f27986a = i2;
        this.f27987b = c10307mm0;
        this.f27988c = i;
    }

    @Override // p000.InterfaceC10179lm0
    public final void run() {
        switch (this.f27986a) {
            case 0:
                this.f27987b.m22961p(this.f27988c);
                break;
            case 1:
                this.f27987b.m22965t(this.f27988c);
                break;
            default:
                this.f27987b.m22960o(this.f27988c);
                break;
        }
    }
}
