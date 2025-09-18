package p000;

/* loaded from: classes2.dex */
public final class A41 extends AbstractC1571Yy {

    /* renamed from: a */
    public B41 f60a;

    /* renamed from: b */
    public InterfaceC6748rW f61b;

    /* renamed from: c */
    public C41 f62c;

    /* renamed from: d */
    public InterfaceC8044Ob0 f63d;

    /* renamed from: e */
    public Object f64e;

    /* renamed from: f */
    public /* synthetic */ Object f65f;

    /* renamed from: g */
    public final /* synthetic */ B41 f66g;

    /* renamed from: h */
    public int f67h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A41(B41 b41, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f66g = b41;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f65f = obj;
        this.f67h |= Integer.MIN_VALUE;
        this.f66g.collect(null, this);
        return EnumC0817Mz.f7418a;
    }
}
