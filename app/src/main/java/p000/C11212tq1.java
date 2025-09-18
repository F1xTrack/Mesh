package p000;

/* renamed from: tq1 */
/* loaded from: classes2.dex */
public final class C11212tq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f43362a;

    /* renamed from: b */
    public final /* synthetic */ C8335Tq1 f43363b;

    /* renamed from: c */
    public int f43364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11212tq1(C8335Tq1 c8335Tq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f43363b = c8335Tq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f43362a = obj;
        this.f43364c |= Integer.MIN_VALUE;
        return this.f43363b.m7791e(this);
    }
}
