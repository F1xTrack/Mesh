package defpackage;

/* renamed from: sq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7105sq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C7296tq0 b;
    public final /* synthetic */ C0646Ia1 c;

    public /* synthetic */ RunnableC7105sq0(C7296tq0 c7296tq0, C0646Ia1 c0646Ia1, int i) {
        this.a = i;
        this.b = c7296tq0;
        this.c = c0646Ia1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C7296tq0 c7296tq0 = this.b;
                C7913x4 c7913x4C = c7296tq0.c(this.c);
                if (c7913x4C != null) {
                    c7296tq0.b.add(c7913x4C);
                    break;
                }
                break;
            default:
                C7296tq0 c7296tq02 = this.b;
                C7913x4 c7913x4C2 = c7296tq02.c(this.c);
                if (c7913x4C2 != null) {
                    c7296tq02.b.add(c7913x4C2);
                    break;
                }
                break;
        }
    }
}
