package p000;

/* renamed from: GP */
/* loaded from: classes2.dex */
public final class C0404GP extends AbstractRunnableC0467HP {

    /* renamed from: c */
    public final RunnableC7627Ga1 f3730c;

    public C0404GP(long j, RunnableC7627Ga1 runnableC7627Ga1) {
        super(j);
        this.f3730c = runnableC7627Ga1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3730c.run();
    }

    @Override // p000.AbstractRunnableC0467HP
    public final String toString() {
        return super.toString() + this.f3730c;
    }
}
