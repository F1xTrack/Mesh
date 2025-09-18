package defpackage;

/* renamed from: Ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0488Ga implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0644Ia b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ RunnableC0488Ga(C0644Ia c0644Ia, boolean z, int i) {
        this.a = i;
        this.b = c0644Ia;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0644Ia c0644Ia = this.b;
                int iX = AbstractC8235ym.x(c0644Ia.g);
                if (iX != 0) {
                    if (iX == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                c0644Ia.b.set(null);
                c0644Ia.c.set(false);
                AbstractC0759Jm0.f("AudioSource");
                c0644Ia.g = 2;
                c0644Ia.a.execute(new RunnableC0488Ga(c0644Ia, this.c, 1));
                c0644Ia.e();
                return;
            default:
                C0644Ia c0644Ia2 = this.b;
                int iX2 = AbstractC8235ym.x(c0644Ia2.g);
                if (iX2 != 0 && iX2 != 1) {
                    if (iX2 == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                boolean z = c0644Ia2.r;
                boolean z2 = this.c;
                if (z == z2) {
                    return;
                }
                c0644Ia2.r = z2;
                if (c0644Ia2.g == 2) {
                    c0644Ia2.a();
                    return;
                }
                return;
        }
    }
}
