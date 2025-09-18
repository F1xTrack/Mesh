package p000;

/* renamed from: rs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10960rs1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f41939a;

    /* renamed from: b */
    public final /* synthetic */ C8071Oo1 f41940b;

    /* renamed from: c */
    public int f41941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10960rs1(C8071Oo1 c8071Oo1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f41940b = c8071Oo1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f41939a = obj;
        this.f41941c |= Integer.MIN_VALUE;
        Object objMo6147a = this.f41940b.mo6147a(this);
        return objMo6147a == EnumC0817Mz.f7418a ? objMo6147a : new C8491Wq1((String) objMo6147a);
    }
}
