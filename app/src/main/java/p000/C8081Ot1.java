package p000;

/* renamed from: Ot1 */
/* loaded from: classes2.dex */
public final class C8081Ot1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f8660a;

    /* renamed from: b */
    public final /* synthetic */ C8165Qj1 f8661b;

    /* renamed from: c */
    public int f8662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8081Ot1(C8165Qj1 c8165Qj1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f8661b = c8165Qj1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f8660a = obj;
        this.f8662c |= Integer.MIN_VALUE;
        Object objMo6147a = this.f8661b.mo6147a(this);
        return objMo6147a == EnumC0817Mz.f7418a ? objMo6147a : new C8491Wq1((String) objMo6147a);
    }
}
