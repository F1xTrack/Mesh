package p000;

/* renamed from: lf0 */
/* loaded from: classes2.dex */
public class C10165lf0 extends AbstractC11189tf0 implements InterfaceC9781if0 {

    /* renamed from: n */
    public final Object f37226n;

    /* renamed from: o */
    public final Object f37227o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10165lf0(AbstractC10675pe0 abstractC10675pe0, String str, String str2) {
        super(abstractC10675pe0, str, str2, AbstractC7284zl.NO_RECEIVER);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(str, "name");
        O90.m5968f(str2, "signature");
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28538b;
        this.f37226n = AbstractC0705LB.m4916c(enumC9659hi0, new C10037kf0(this, 0));
        this.f37227o = AbstractC0705LB.m4916c(enumC9659hi0, new C10037kf0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC10293mf0
    /* renamed from: c */
    public final InterfaceC8466We0 mo3001c() {
        return (C9909jf0) this.f37226n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9909jf0) this.f37226n.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC11189tf0
    /* renamed from: v */
    public final AbstractC10677pf0 mo10479v() {
        return (C9909jf0) this.f37226n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC10293mf0
    /* renamed from: c */
    public final InterfaceC9653hf0 mo3001c() {
        return (C9909jf0) this.f37226n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10165lf0(AbstractC10675pe0 abstractC10675pe0, EE0 ee0) {
        super(abstractC10675pe0, ee0);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(ee0, "descriptor");
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28538b;
        this.f37226n = AbstractC0705LB.m4916c(enumC9659hi0, new C10037kf0(this, 0));
        this.f37227o = AbstractC0705LB.m4916c(enumC9659hi0, new C10037kf0(this, 1));
    }
}
