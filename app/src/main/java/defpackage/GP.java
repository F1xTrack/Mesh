package defpackage;

/* loaded from: classes2.dex */
public final class GP extends HP {
    public final RunnableC0490Ga1 c;

    public GP(long j, RunnableC0490Ga1 runnableC0490Ga1) {
        super(j);
        this.c = runnableC0490Ga1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.HP
    public final String toString() {
        return super.toString() + this.c;
    }
}
