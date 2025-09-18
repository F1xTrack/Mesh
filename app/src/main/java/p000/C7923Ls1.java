package p000;

/* renamed from: Ls1 */
/* loaded from: classes2.dex */
public final class C7923Ls1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f6913a;

    /* renamed from: b */
    public final /* synthetic */ C10962rt1 f6914b;

    /* renamed from: c */
    public int f6915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7923Ls1(C10962rt1 c10962rt1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f6914b = c10962rt1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f6913a = obj;
        this.f6915c |= Integer.MIN_VALUE;
        return C10962rt1.m24491a(this.f6914b, this);
    }
}
