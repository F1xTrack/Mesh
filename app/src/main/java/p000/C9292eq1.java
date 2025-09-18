package p000;

/* renamed from: eq1 */
/* loaded from: classes2.dex */
public final class C9292eq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f26914a;

    /* renamed from: b */
    public final /* synthetic */ C7919Lq1 f26915b;

    /* renamed from: c */
    public int f26916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9292eq1(C7919Lq1 c7919Lq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f26915b = c7919Lq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f26914a = obj;
        this.f26916c |= Integer.MIN_VALUE;
        Object objM5117a = this.f26915b.m5117a(this);
        return objM5117a == EnumC0817Mz.f7418a ? objM5117a : new PS0(objM5117a);
    }
}
