package p000;

/* renamed from: Pt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8133Pt1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f9337a;

    /* renamed from: b */
    public final /* synthetic */ C10196lu1 f9338b;

    /* renamed from: c */
    public int f9339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8133Pt1(C10196lu1 c10196lu1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f9338b = c10196lu1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f9337a = obj;
        this.f9339c |= Integer.MIN_VALUE;
        Object objM22596b = this.f9338b.m22596b(null, this);
        return objM22596b == EnumC0817Mz.f7418a ? objM22596b : new PS0(objM22596b);
    }
}
