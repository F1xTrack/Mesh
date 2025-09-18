package defpackage;

/* renamed from: aA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2082aA implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2273bA b;
    public final /* synthetic */ C0646Ia1 c;

    public /* synthetic */ RunnableC2082aA(C2273bA c2273bA, C0646Ia1 c0646Ia1, int i) {
        this.a = i;
        this.b = c2273bA;
        this.c = c0646Ia1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2273bA c2273bA = this.b;
                C3339dA c3339dAB = c2273bA.b(this.c);
                if (c3339dAB != null) {
                    c2273bA.a.add(c3339dAB);
                    break;
                }
                break;
            default:
                C2273bA c2273bA2 = this.b;
                C3339dA c3339dAB2 = c2273bA2.b(this.c);
                if (c3339dAB2 != null) {
                    c2273bA2.a.add(c3339dAB2);
                    break;
                }
                break;
        }
    }
}
