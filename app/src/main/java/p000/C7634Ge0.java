package p000;

/* renamed from: Ge0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7634Ge0 extends C10165lf0 implements InterfaceC7686He0 {

    /* renamed from: p */
    public final Object f3844p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7634Ge0(AbstractC10675pe0 abstractC10675pe0, EE0 ee0) {
        super(abstractC10675pe0, ee0);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(ee0, "descriptor");
        this.f3844p = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C10801qd0(4, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC7686He0
    /* renamed from: d */
    public final InterfaceC11824ye0 mo247d() {
        return (C7582Fe0) this.f3844p.getValue();
    }
}
