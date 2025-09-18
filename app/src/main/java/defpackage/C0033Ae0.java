package defpackage;

/* renamed from: Ae0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0033Ae0 extends C2367bf0 implements InterfaceC0579He0 {
    public final Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0033Ae0(AbstractC6497pe0 abstractC6497pe0, EE0 ee0) {
        super(abstractC6497pe0, ee0);
        O90.f(abstractC6497pe0, "container");
        O90.f(ee0, "descriptor");
        this.p = LB.c(EnumC4205hi0.b, new C6685qd0(2, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC0579He0
    public final InterfaceC8212ye0 d() {
        return (C8402ze0) this.p.getValue();
    }
}
