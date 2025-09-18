package p000;

/* renamed from: Ga */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0415Ga implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3803a;

    /* renamed from: b */
    public final /* synthetic */ C0541Ia f3804b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3805c;

    public /* synthetic */ RunnableC0415Ga(C0541Ia c0541Ia, boolean z, int i) {
        this.f3803a = i;
        this.f3804b = c0541Ia;
        this.f3805c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3803a) {
            case 0:
                C0541Ia c0541Ia = this.f3804b;
                int iM26247x = AbstractC7222ym.m26247x(c0541Ia.f4999g);
                if (iM26247x != 0) {
                    if (iM26247x == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                c0541Ia.f4994b.set(null);
                c0541Ia.f4995c.set(false);
                AbstractC7806Jm0.m4412f("AudioSource");
                c0541Ia.f4999g = 2;
                c0541Ia.f4993a.execute(new RunnableC0415Ga(c0541Ia, this.f3805c, 1));
                c0541Ia.m3942e();
                return;
            default:
                C0541Ia c0541Ia2 = this.f3804b;
                int iM26247x2 = AbstractC7222ym.m26247x(c0541Ia2.f4999g);
                if (iM26247x2 != 0 && iM26247x2 != 1) {
                    if (iM26247x2 == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                boolean z = c0541Ia2.f5010r;
                boolean z2 = this.f3805c;
                if (z == z2) {
                    return;
                }
                c0541Ia2.f5010r = z2;
                if (c0541Ia2.f4999g == 2) {
                    c0541Ia2.m3938a();
                    return;
                }
                return;
        }
    }
}
