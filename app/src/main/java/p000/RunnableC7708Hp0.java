package p000;

/* renamed from: Hp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7708Hp0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4516a;

    /* renamed from: b */
    public final /* synthetic */ C1356VY f4517b;

    /* renamed from: c */
    public final /* synthetic */ Object f4518c;

    /* renamed from: d */
    public final /* synthetic */ C9535gk0 f4519d;

    /* renamed from: e */
    public final /* synthetic */ C11081sp0 f4520e;

    public /* synthetic */ RunnableC7708Hp0(C1356VY c1356vy, InterfaceC7864Kp0 interfaceC7864Kp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0, int i) {
        this.f4516a = i;
        this.f4517b = c1356vy;
        this.f4518c = interfaceC7864Kp0;
        this.f4519d = c9535gk0;
        this.f4520e = c11081sp0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Kp0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Kp0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Kp0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4516a) {
            case 0:
                C1356VY c1356vy = this.f4517b;
                int i = c1356vy.f12611b;
                this.f4518c.mo1095o(i, (C7604Fp0) c1356vy.f12612c, this.f4519d, this.f4520e);
                break;
            case 1:
                C1356VY c1356vy2 = this.f4517b;
                int i2 = c1356vy2.f12611b;
                this.f4518c.mo1016E(i2, (C7604Fp0) c1356vy2.f12612c, this.f4519d, this.f4520e);
                break;
            default:
                C1356VY c1356vy3 = this.f4517b;
                int i3 = c1356vy3.f12611b;
                this.f4518c.mo1109v(i3, (C7604Fp0) c1356vy3.f12612c, this.f4519d, this.f4520e);
                break;
        }
    }
}
