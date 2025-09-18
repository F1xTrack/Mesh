package p000;

/* loaded from: classes.dex */
public final class E11 extends AbstractC1571Yy {

    /* renamed from: a */
    public Object f2349a;

    /* renamed from: b */
    public Object f2350b;

    /* renamed from: c */
    public /* synthetic */ Object f2351c;

    /* renamed from: d */
    public final /* synthetic */ I11 f2352d;

    /* renamed from: e */
    public int f2353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E11(I11 i11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f2352d = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f2351c = obj;
        this.f2353e |= Integer.MIN_VALUE;
        return this.f2352d.m3728h(this);
    }
}
