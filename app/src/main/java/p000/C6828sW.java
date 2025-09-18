package p000;

/* renamed from: sW */
/* loaded from: classes2.dex */
public final class C6828sW extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f42467a;

    /* renamed from: b */
    public int f42468b;

    /* renamed from: c */
    public final /* synthetic */ C4238iN f42469c;

    /* renamed from: d */
    public C4238iN f42470d;

    /* renamed from: e */
    public InterfaceC6748rW f42471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6828sW(C4238iN c4238iN, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f42469c = c4238iN;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f42467a = obj;
        this.f42468b |= Integer.MIN_VALUE;
        return this.f42469c.collect(null, this);
    }
}
