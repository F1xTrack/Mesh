package p000;

/* renamed from: aA */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1647aA implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f15339a;

    /* renamed from: b */
    public final /* synthetic */ C1768bA f15340b;

    /* renamed from: c */
    public final /* synthetic */ C7731Ia1 f15341c;

    public /* synthetic */ RunnableC1647aA(C1768bA c1768bA, C7731Ia1 c7731Ia1, int i) {
        this.f15339a = i;
        this.f15340b = c1768bA;
        this.f15341c = c7731Ia1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15339a) {
            case 0:
                C1768bA c1768bA = this.f15340b;
                C3911dA c3911dAM10431b = c1768bA.m10431b(this.f15341c);
                if (c3911dAM10431b != null) {
                    c1768bA.f16839a.add(c3911dAM10431b);
                    break;
                }
                break;
            default:
                C1768bA c1768bA2 = this.f15340b;
                C3911dA c3911dAM10431b2 = c1768bA2.m10431b(this.f15341c);
                if (c3911dAM10431b2 != null) {
                    c1768bA2.f16839a.add(c3911dAM10431b2);
                    break;
                }
                break;
        }
    }
}
