package p000;

/* renamed from: Nt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8029Nt1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f8116a;

    /* renamed from: b */
    public final /* synthetic */ C10196lu1 f8117b;

    /* renamed from: c */
    public int f8118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8029Nt1(C10196lu1 c10196lu1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f8117b = c10196lu1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f8116a = obj;
        this.f8118c |= Integer.MIN_VALUE;
        Object objM22595a = this.f8117b.m22595a(this);
        return objM22595a == EnumC0817Mz.f7418a ? objM22595a : new PS0(objM22595a);
    }
}
