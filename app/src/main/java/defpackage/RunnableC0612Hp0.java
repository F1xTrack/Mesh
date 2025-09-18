package defpackage;

/* renamed from: Hp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0612Hp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VY b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ C4020gk0 d;
    public final /* synthetic */ C7102sp0 e;

    public /* synthetic */ RunnableC0612Hp0(VY vy, InterfaceC0846Kp0 interfaceC0846Kp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0, int i) {
        this.a = i;
        this.b = vy;
        this.c = interfaceC0846Kp0;
        this.d = c4020gk0;
        this.e = c7102sp0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Kp0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Kp0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Kp0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VY vy = this.b;
                int i = vy.b;
                this.c.o(i, (C0456Fp0) vy.c, this.d, this.e);
                break;
            case 1:
                VY vy2 = this.b;
                int i2 = vy2.b;
                this.c.E(i2, (C0456Fp0) vy2.c, this.d, this.e);
                break;
            default:
                VY vy3 = this.b;
                int i3 = vy3.b;
                this.c.v(i3, (C0456Fp0) vy3.c, this.d, this.e);
                break;
        }
    }
}
