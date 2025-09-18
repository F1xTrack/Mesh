package p000;

/* renamed from: bw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8915bw1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f17237a;

    /* renamed from: b */
    public final /* synthetic */ C7967Mo1 f17238b;

    /* renamed from: c */
    public int f17239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8915bw1(C7967Mo1 c7967Mo1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f17238b = c7967Mo1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f17237a = obj;
        this.f17239c |= Integer.MIN_VALUE;
        Object objM5447m = this.f17238b.m5447m(null, null, this);
        return objM5447m == EnumC0817Mz.f7418a ? objM5447m : new PS0(objM5447m);
    }
}
