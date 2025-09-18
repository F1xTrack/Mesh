package p000;

/* renamed from: Mt1 */
/* loaded from: classes2.dex */
public final class C7977Mt1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f7383a;

    /* renamed from: b */
    public final /* synthetic */ C8165Qj1 f7384b;

    /* renamed from: c */
    public int f7385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7977Mt1(C8165Qj1 c8165Qj1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f7384b = c8165Qj1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f7383a = obj;
        this.f7385c |= Integer.MIN_VALUE;
        Object objMo6148b = this.f7384b.mo6148b(null, this);
        return objMo6148b == EnumC0817Mz.f7418a ? objMo6148b : new PS0(objMo6148b);
    }
}
