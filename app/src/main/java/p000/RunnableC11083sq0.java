package p000;

/* renamed from: sq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC11083sq0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f42635a;

    /* renamed from: b */
    public final /* synthetic */ C11211tq0 f42636b;

    /* renamed from: c */
    public final /* synthetic */ C7731Ia1 f42637c;

    public /* synthetic */ RunnableC11083sq0(C11211tq0 c11211tq0, C7731Ia1 c7731Ia1, int i) {
        this.f42635a = i;
        this.f42636b = c11211tq0;
        this.f42637c = c7731Ia1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42635a) {
            case 0:
                C11211tq0 c11211tq0 = this.f42636b;
                C7115x4 c7115x4M24998c = c11211tq0.m24998c(this.f42637c);
                if (c7115x4M24998c != null) {
                    c11211tq0.f43358b.add(c7115x4M24998c);
                    break;
                }
                break;
            default:
                C11211tq0 c11211tq02 = this.f42636b;
                C7115x4 c7115x4M24998c2 = c11211tq02.m24998c(this.f42637c);
                if (c7115x4M24998c2 != null) {
                    c11211tq02.f43358b.add(c7115x4M24998c2);
                    break;
                }
                break;
        }
    }
}
