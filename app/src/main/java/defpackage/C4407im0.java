package defpackage;

/* renamed from: im0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4407im0 implements InterfaceC5757lm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5948mm0 b;
    public final /* synthetic */ float c;

    public /* synthetic */ C4407im0(C5948mm0 c5948mm0, float f, int i) {
        this.a = i;
        this.b = c5948mm0;
        this.c = f;
    }

    @Override // defpackage.InterfaceC5757lm0
    public final void run() {
        switch (this.a) {
            case 0:
                C5948mm0 c5948mm0 = this.b;
                C1847Xl0 c1847Xl0 = c5948mm0.a;
                float f = this.c;
                if (c1847Xl0 != null) {
                    float fE = AbstractC2215as0.e(c1847Xl0.l, c1847Xl0.m, f);
                    ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = c5948mm0.b;
                    choreographerFrameCallbackC7856wm0.n(choreographerFrameCallbackC7856wm0.j, fE);
                    break;
                } else {
                    c5948mm0.f.add(new C4407im0(c5948mm0, f, 0));
                    break;
                }
            case 1:
                C5948mm0 c5948mm02 = this.b;
                C1847Xl0 c1847Xl02 = c5948mm02.a;
                float f2 = this.c;
                if (c1847Xl02 != null) {
                    c5948mm02.t((int) AbstractC2215as0.e(c1847Xl02.l, c1847Xl02.m, f2));
                    break;
                } else {
                    c5948mm02.f.add(new C4407im0(c5948mm02, f2, 1));
                    break;
                }
            default:
                this.b.v(this.c);
                break;
        }
    }
}
