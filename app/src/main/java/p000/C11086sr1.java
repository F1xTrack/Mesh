package p000;

/* renamed from: sr1 */
/* loaded from: classes2.dex */
public final class C11086sr1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f42644a;

    /* renamed from: b */
    public final /* synthetic */ C8597Yr1 f42645b;

    /* renamed from: c */
    public int f42646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11086sr1(C8597Yr1 c8597Yr1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f42645b = c8597Yr1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f42644a = obj;
        this.f42646c |= Integer.MIN_VALUE;
        Object objMo9157b = this.f42645b.mo9157b(null, this);
        return objMo9157b == EnumC0817Mz.f7418a ? objMo9157b : new PS0(objMo9157b);
    }
}
