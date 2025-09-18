package p000;

/* renamed from: P */
/* loaded from: classes2.dex */
public final class C0944P extends AbstractC1571Yy {

    /* renamed from: a */
    public NU0 f8770a;

    /* renamed from: b */
    public /* synthetic */ Object f8771b;

    /* renamed from: c */
    public final /* synthetic */ C8342Tu0 f8772c;

    /* renamed from: d */
    public int f8773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0944P(C8342Tu0 c8342Tu0, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f8772c = c8342Tu0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f8771b = obj;
        this.f8773d |= Integer.MIN_VALUE;
        return this.f8772c.collect(null, this);
    }
}
