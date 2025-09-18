package p000;

/* renamed from: nq1 */
/* loaded from: classes2.dex */
public final class C10444nq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8335Tq1 f38554a;

    /* renamed from: b */
    public /* synthetic */ Object f38555b;

    /* renamed from: c */
    public final /* synthetic */ C8335Tq1 f38556c;

    /* renamed from: d */
    public int f38557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10444nq1(C8335Tq1 c8335Tq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f38556c = c8335Tq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f38555b = obj;
        this.f38557d |= Integer.MIN_VALUE;
        return this.f38556c.m7789c(this);
    }
}
