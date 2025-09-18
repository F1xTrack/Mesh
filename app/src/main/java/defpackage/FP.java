package defpackage;

/* loaded from: classes2.dex */
public final class FP extends HP {
    public final C0767Jp c;
    public final /* synthetic */ JP d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP(JP jp, long j, C0767Jp c0767Jp) {
        super(j);
        this.d = jp;
        this.c = c0767Jp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.C(this.d);
    }

    @Override // defpackage.HP
    public final String toString() {
        return super.toString() + this.c;
    }
}
