package defpackage;

/* renamed from: v81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7547v81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C7737w81 b;

    public /* synthetic */ RunnableC7547v81(C7737w81 c7737w81, int i) {
        this.a = i;
        this.b = c7737w81;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                C7737w81 c7737w81 = this.b;
                c7737w81.d = null;
                c7737w81.c();
                break;
        }
    }
}
