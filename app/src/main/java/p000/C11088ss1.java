package p000;

/* renamed from: ss1 */
/* loaded from: classes2.dex */
public final class C11088ss1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7715Hs1 f42650a;

    /* renamed from: b */
    public /* synthetic */ Object f42651b;

    /* renamed from: c */
    public final /* synthetic */ C7715Hs1 f42652c;

    /* renamed from: d */
    public int f42653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11088ss1(C7715Hs1 c7715Hs1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f42652c = c7715Hs1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f42651b = obj;
        this.f42653d |= Integer.MIN_VALUE;
        return this.f42652c.m3637a(this);
    }
}
