package defpackage;

/* renamed from: mX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5904mX1 implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ ES1 c;

    public RunnableC5904mX1(ES1 es1, long j, long j2) {
        this.c = es1;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7595vO1 c7595vO1P0 = ((WW1) this.c.c).p0();
        RunnableC6133nk0 runnableC6133nk0 = new RunnableC6133nk0(20);
        runnableC6133nk0.b = this;
        c7595vO1P0.E1(runnableC6133nk0);
    }
}
