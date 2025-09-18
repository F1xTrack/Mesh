package p000;

/* renamed from: zt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11982zt1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f47085a;

    /* renamed from: b */
    public final /* synthetic */ C10909rT0 f47086b;

    /* renamed from: c */
    public int f47087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11982zt1(C10909rT0 c10909rT0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f47086b = c10909rT0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f47085a = obj;
        this.f47087c |= Integer.MIN_VALUE;
        Object objMo9157b = this.f47086b.mo9157b(null, this);
        return objMo9157b == EnumC0817Mz.f7418a ? objMo9157b : new PS0(objMo9157b);
    }
}
