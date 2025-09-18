package p000;

/* renamed from: gf0 */
/* loaded from: classes2.dex */
public class C9525gf0 extends AbstractC11189tf0 implements InterfaceC9141df0 {

    /* renamed from: n */
    public final Object f27904n;

    /* renamed from: o */
    public final Object f27905o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9525gf0(AbstractC10675pe0 abstractC10675pe0, String str, String str2, Object obj) {
        super(abstractC10675pe0, str, str2, obj);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(str, "name");
        O90.m5968f(str2, "signature");
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28538b;
        this.f27904n = AbstractC0705LB.m4916c(enumC9659hi0, new C9397ff0(this, 0));
        this.f27905o = AbstractC0705LB.m4916c(enumC9659hi0, new C9397ff0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC10293mf0
    /* renamed from: c */
    public final InterfaceC8466We0 mo3001c() {
        return (C9269ef0) this.f27904n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC9141df0
    public final Object get(Object obj) {
        return ((C9269ef0) this.f27904n.getValue()).call(obj);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC11189tf0
    /* renamed from: v */
    public final AbstractC10677pf0 mo10479v() {
        return (C9269ef0) this.f27904n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC10293mf0
    /* renamed from: c */
    public final InterfaceC9008cf0 mo3001c() {
        return (C9269ef0) this.f27904n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9525gf0(AbstractC10675pe0 abstractC10675pe0, EE0 ee0) {
        super(abstractC10675pe0, ee0);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(ee0, "descriptor");
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28538b;
        this.f27904n = AbstractC0705LB.m4916c(enumC9659hi0, new C9397ff0(this, 0));
        this.f27905o = AbstractC0705LB.m4916c(enumC9659hi0, new C9397ff0(this, 1));
    }
}
