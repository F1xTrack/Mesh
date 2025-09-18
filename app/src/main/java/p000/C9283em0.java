package p000;

/* renamed from: em0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9283em0 implements InterfaceC10179lm0 {

    /* renamed from: a */
    public final /* synthetic */ int f26830a;

    /* renamed from: b */
    public final /* synthetic */ C10307mm0 f26831b;

    /* renamed from: c */
    public final /* synthetic */ String f26832c;

    public /* synthetic */ C9283em0(C10307mm0 c10307mm0, String str, int i) {
        this.f26830a = i;
        this.f26831b = c10307mm0;
        this.f26832c = str;
    }

    @Override // p000.InterfaceC10179lm0
    public final void run() {
        switch (this.f26830a) {
            case 0:
                this.f26831b.m22964s(this.f26832c);
                break;
            case 1:
                this.f26831b.m22962q(this.f26832c);
                break;
            default:
                this.f26831b.m22966u(this.f26832c);
                break;
        }
    }
}
