package p000;

/* renamed from: im0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9795im0 implements InterfaceC10179lm0 {

    /* renamed from: a */
    public final /* synthetic */ int f29444a;

    /* renamed from: b */
    public final /* synthetic */ C10307mm0 f29445b;

    /* renamed from: c */
    public final /* synthetic */ float f29446c;

    public /* synthetic */ C9795im0(C10307mm0 c10307mm0, float f, int i) {
        this.f29444a = i;
        this.f29445b = c10307mm0;
        this.f29446c = f;
    }

    @Override // p000.InterfaceC10179lm0
    public final void run() {
        switch (this.f29444a) {
            case 0:
                C10307mm0 c10307mm0 = this.f29445b;
                C8532Xl0 c8532Xl0 = c10307mm0.f37887a;
                float f = this.f29446c;
                if (c8532Xl0 != null) {
                    float fM10353e = AbstractC8778as0.m10353e(c8532Xl0.f13958l, c8532Xl0.f13959m, f);
                    ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = c10307mm0.f37888b;
                    choreographerFrameCallbackC11586wm0.m25702n(choreographerFrameCallbackC11586wm0.f45092j, fM10353e);
                    break;
                } else {
                    c10307mm0.f37892f.add(new C9795im0(c10307mm0, f, 0));
                    break;
                }
            case 1:
                C10307mm0 c10307mm02 = this.f29445b;
                C8532Xl0 c8532Xl02 = c10307mm02.f37887a;
                float f2 = this.f29446c;
                if (c8532Xl02 != null) {
                    c10307mm02.m22965t((int) AbstractC8778as0.m10353e(c8532Xl02.f13958l, c8532Xl02.f13959m, f2));
                    break;
                } else {
                    c10307mm02.f37892f.add(new C9795im0(c10307mm02, f2, 1));
                    break;
                }
            default:
                this.f29445b.m22967v(this.f29446c);
                break;
        }
    }
}
