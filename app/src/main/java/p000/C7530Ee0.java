package p000;

/* renamed from: Ee0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7530Ee0 extends C9525gf0 implements InterfaceC7426Ce0 {

    /* renamed from: p */
    public final Object f2818p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7530Ee0(AbstractC10675pe0 abstractC10675pe0, String str, String str2, Object obj) {
        super(abstractC10675pe0, str, str2, obj);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(str, "name");
        O90.m5968f(str2, "signature");
        this.f2818p = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C10801qd0(3, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC7686He0
    /* renamed from: d */
    public final InterfaceC11824ye0 mo247d() {
        return (C7478De0) this.f2818p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC7426Ce0, p000.InterfaceC7686He0
    /* renamed from: d */
    public final InterfaceC7374Be0 mo247d() {
        return (C7478De0) this.f2818p.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7530Ee0(AbstractC10675pe0 abstractC10675pe0, EE0 ee0) {
        super(abstractC10675pe0, ee0);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(ee0, "descriptor");
        this.f2818p = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C10801qd0(3, this));
    }
}
