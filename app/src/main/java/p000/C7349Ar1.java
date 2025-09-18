package p000;

/* renamed from: Ar1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7349Ar1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f448a;

    /* renamed from: b */
    public final /* synthetic */ C7765Ir1 f449b;

    /* renamed from: c */
    public int f450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7349Ar1(C7765Ir1 c7765Ir1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f449b = c7765Ir1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f448a = obj;
        this.f450c |= Integer.MIN_VALUE;
        Object objM4055f = this.f449b.m4055f(this);
        return objM4055f == EnumC0817Mz.f7418a ? objM4055f : new C8491Wq1((String) objM4055f);
    }
}
