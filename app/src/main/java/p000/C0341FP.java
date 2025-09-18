package p000;

/* renamed from: FP */
/* loaded from: classes2.dex */
public final class C0341FP extends AbstractRunnableC0467HP {

    /* renamed from: c */
    public final C0619Jp f3201c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0593JP f3202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0341FP(AbstractC0593JP abstractC0593JP, long j, C0619Jp c0619Jp) {
        super(j);
        this.f3202d = abstractC0593JP;
        this.f3201c = c0619Jp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3201c.m4423C(this.f3202d);
    }

    @Override // p000.AbstractRunnableC0467HP
    public final String toString() {
        return super.toString() + this.f3201c;
    }
}
