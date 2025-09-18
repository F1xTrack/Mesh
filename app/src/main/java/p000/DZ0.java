package p000;

/* loaded from: classes.dex */
public final class DZ0 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f2044a;

    /* renamed from: b */
    public final /* synthetic */ FZ0 f2045b;

    /* renamed from: c */
    public int f2046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DZ0(FZ0 fz0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f2045b = fz0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f2044a = obj;
        this.f2046c |= Integer.MIN_VALUE;
        return this.f2045b.m2674c(null, null, this);
    }
}
