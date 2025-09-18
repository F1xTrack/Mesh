package p000;

/* renamed from: Ws1 */
/* loaded from: classes2.dex */
public final class C8495Ws1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f13432a;

    /* renamed from: b */
    public final /* synthetic */ C10578ot1 f13433b;

    /* renamed from: c */
    public int f13434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8495Ws1(C10578ot1 c10578ot1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f13433b = c10578ot1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f13432a = obj;
        this.f13434c |= Integer.MIN_VALUE;
        Object objMo4457c = this.f13433b.mo4457c(this);
        return objMo4457c == EnumC0817Mz.f7418a ? objMo4457c : new PS0(objMo4457c);
    }
}
