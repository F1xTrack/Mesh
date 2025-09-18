package p000;

/* renamed from: Ev1 */
/* loaded from: classes2.dex */
public final class C7565Ev1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f2968a;

    /* renamed from: b */
    public final /* synthetic */ C8033Nv1 f2969b;

    /* renamed from: c */
    public int f2970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7565Ev1(C8033Nv1 c8033Nv1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f2969b = c8033Nv1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f2968a = obj;
        this.f2970c |= Integer.MIN_VALUE;
        Object objM5905a = this.f2969b.m5905a(null, this);
        return objM5905a == EnumC0817Mz.f7418a ? objM5905a : new PS0(objM5905a);
    }
}
