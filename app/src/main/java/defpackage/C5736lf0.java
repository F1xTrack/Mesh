package defpackage;

/* renamed from: lf0 */
/* loaded from: classes2.dex */
public class C5736lf0 extends AbstractC7263tf0 implements InterfaceC4386if0 {
    public final Object n;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5736lf0(AbstractC6497pe0 abstractC6497pe0, String str, String str2) {
        super(abstractC6497pe0, str, str2, AbstractC8422zl.NO_RECEIVER);
        O90.f(abstractC6497pe0, "container");
        O90.f(str, "name");
        O90.f(str2, "signature");
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.b;
        this.n = LB.c(enumC4205hi0, new C5545kf0(this, 0));
        this.o = LB.c(enumC4205hi0, new C5545kf0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5927mf0
    public final InterfaceC1748We0 c() {
        return (C5354jf0) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5354jf0) this.n.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC7263tf0
    public final AbstractC6500pf0 v() {
        return (C5354jf0) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5927mf0
    public final InterfaceC4196hf0 c() {
        return (C5354jf0) this.n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5736lf0(AbstractC6497pe0 abstractC6497pe0, EE0 ee0) {
        super(abstractC6497pe0, ee0);
        O90.f(abstractC6497pe0, "container");
        O90.f(ee0, "descriptor");
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.b;
        this.n = LB.c(enumC4205hi0, new C5545kf0(this, 0));
        this.o = LB.c(enumC4205hi0, new C5545kf0(this, 1));
    }
}
