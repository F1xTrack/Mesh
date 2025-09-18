package p000;

/* renamed from: ou1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10580ou1 extends AbstractC1571Yy {

    /* renamed from: a */
    public HS0 f39348a;

    /* renamed from: b */
    public /* synthetic */ Object f39349b;

    /* renamed from: c */
    public final /* synthetic */ C8907bs1 f39350c;

    /* renamed from: d */
    public int f39351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10580ou1(C8907bs1 c8907bs1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f39350c = c8907bs1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f39349b = obj;
        this.f39351d |= Integer.MIN_VALUE;
        Object objM10535c = this.f39350c.m10535c(null, this);
        return objM10535c == EnumC0817Mz.f7418a ? objM10535c : new PS0(objM10535c);
    }
}
