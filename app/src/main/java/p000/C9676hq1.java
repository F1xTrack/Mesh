package p000;

/* renamed from: hq1 */
/* loaded from: classes2.dex */
public final class C9676hq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f28621a;

    /* renamed from: b */
    public final /* synthetic */ C8335Tq1 f28622b;

    /* renamed from: c */
    public int f28623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9676hq1(C8335Tq1 c8335Tq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f28622b = c8335Tq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f28621a = obj;
        this.f28623c |= Integer.MIN_VALUE;
        return this.f28622b.m7787a(this);
    }
}
