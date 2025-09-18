package p000;

/* renamed from: Qt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8185Qt1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f9854a;

    /* renamed from: b */
    public final /* synthetic */ C10196lu1 f9855b;

    /* renamed from: c */
    public int f9856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8185Qt1(C10196lu1 c10196lu1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f9855b = c10196lu1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f9854a = obj;
        this.f9856c |= Integer.MIN_VALUE;
        Object objM22597k = this.f9855b.m22597k(null, null, this);
        return objM22597k == EnumC0817Mz.f7418a ? objM22597k : new PS0(objM22597k);
    }
}
