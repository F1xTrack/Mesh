package defpackage;

/* renamed from: bf0 */
/* loaded from: classes2.dex */
public class C2367bf0 extends AbstractC7263tf0 implements InterfaceC1904Ye0 {
    public final Object n;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2367bf0(AbstractC6497pe0 abstractC6497pe0, EE0 ee0) {
        super(abstractC6497pe0, ee0);
        O90.f(abstractC6497pe0, "container");
        O90.f(ee0, "descriptor");
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.b;
        this.n = LB.c(enumC4205hi0, new C2176af0(this, 0));
        this.o = LB.c(enumC4205hi0, new C2176af0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5927mf0
    public final InterfaceC1748We0 c() {
        return (C1982Ze0) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return ((C1982Ze0) this.n.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC7263tf0
    public final AbstractC6500pf0 v() {
        return (C1982Ze0) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5927mf0
    public final InterfaceC1826Xe0 c() {
        return (C1982Ze0) this.n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2367bf0(AbstractC6497pe0 abstractC6497pe0, String str, String str2, Object obj) {
        super(abstractC6497pe0, str, str2, obj);
        O90.f(abstractC6497pe0, "container");
        O90.f(str, "name");
        O90.f(str2, "signature");
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.b;
        this.n = LB.c(enumC4205hi0, new C2176af0(this, 0));
        this.o = LB.c(enumC4205hi0, new C2176af0(this, 1));
    }
}
