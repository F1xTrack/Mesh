package defpackage;

/* renamed from: Ee0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0345Ee0 extends C4005gf0 implements InterfaceC0189Ce0 {
    public final Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0345Ee0(AbstractC6497pe0 abstractC6497pe0, String str, String str2, Object obj) {
        super(abstractC6497pe0, str, str2, obj);
        O90.f(abstractC6497pe0, "container");
        O90.f(str, "name");
        O90.f(str2, "signature");
        this.p = LB.c(EnumC4205hi0.b, new C6685qd0(3, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC0579He0
    public final InterfaceC8212ye0 d() {
        return (C0267De0) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC0189Ce0, defpackage.InterfaceC0579He0
    public final InterfaceC0111Be0 d() {
        return (C0267De0) this.p.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0345Ee0(AbstractC6497pe0 abstractC6497pe0, EE0 ee0) {
        super(abstractC6497pe0, ee0);
        O90.f(abstractC6497pe0, "container");
        O90.f(ee0, "descriptor");
        this.p = LB.c(EnumC4205hi0.b, new C6685qd0(3, this));
    }
}
