package p000;

/* renamed from: kq1 */
/* loaded from: classes2.dex */
public final class C10060kq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f36723a;

    /* renamed from: b */
    public final /* synthetic */ C8335Tq1 f36724b;

    /* renamed from: c */
    public int f36725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10060kq1(C8335Tq1 c8335Tq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f36724b = c8335Tq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f36723a = obj;
        this.f36725c |= Integer.MIN_VALUE;
        return this.f36724b.m7788b(this);
    }
}
