package p000;

/* renamed from: b9 */
/* loaded from: classes2.dex */
public final class C1767b9 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f16822a;

    /* renamed from: b */
    public final /* synthetic */ C3910d9 f16823b;

    /* renamed from: c */
    public int f16824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767b9(C3910d9 c3910d9, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f16823b = c3910d9;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f16822a = obj;
        this.f16824c |= Integer.MIN_VALUE;
        return C3910d9.m17496d(this.f16823b, null, null, null, this);
    }
}
