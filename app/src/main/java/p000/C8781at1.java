package p000;

/* renamed from: at1 */
/* loaded from: classes2.dex */
public final class C8781at1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f16645a;

    /* renamed from: b */
    public final /* synthetic */ C10578ot1 f16646b;

    /* renamed from: c */
    public int f16647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8781at1(C10578ot1 c10578ot1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f16646b = c10578ot1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f16645a = obj;
        this.f16647c |= Integer.MIN_VALUE;
        Object objMo4455a = this.f16646b.mo4455a(this);
        return objMo4455a == EnumC0817Mz.f7418a ? objMo4455a : new PS0(objMo4455a);
    }
}
