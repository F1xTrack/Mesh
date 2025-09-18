package p000;

/* renamed from: Za */
/* loaded from: classes2.dex */
public final class C1610Za extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f14984a;

    /* renamed from: b */
    public final /* synthetic */ X11 f14985b;

    /* renamed from: c */
    public int f14986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610Za(X11 x11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f14985b = x11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f14984a = obj;
        this.f14986c |= Integer.MIN_VALUE;
        return this.f14985b.m8918e(null, false, null, this);
    }
}
