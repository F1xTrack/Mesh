package p000;

/* renamed from: bf0 */
/* loaded from: classes2.dex */
public class C8880bf0 extends AbstractC11189tf0 implements InterfaceC8570Ye0 {

    /* renamed from: n */
    public final Object f17109n;

    /* renamed from: o */
    public final Object f17110o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8880bf0(AbstractC10675pe0 abstractC10675pe0, EE0 ee0) {
        super(abstractC10675pe0, ee0);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(ee0, "descriptor");
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28538b;
        this.f17109n = AbstractC0705LB.m4916c(enumC9659hi0, new C8752af0(this, 0));
        this.f17110o = AbstractC0705LB.m4916c(enumC9659hi0, new C8752af0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC10293mf0
    /* renamed from: c */
    public final InterfaceC8466We0 mo3001c() {
        return (C8622Ze0) this.f17109n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return ((C8622Ze0) this.f17109n.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC11189tf0
    /* renamed from: v */
    public final AbstractC10677pf0 mo10479v() {
        return (C8622Ze0) this.f17109n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC10293mf0
    /* renamed from: c */
    public final InterfaceC8518Xe0 mo3001c() {
        return (C8622Ze0) this.f17109n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8880bf0(AbstractC10675pe0 abstractC10675pe0, String str, String str2, Object obj) {
        super(abstractC10675pe0, str, str2, obj);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(str, "name");
        O90.m5968f(str2, "signature");
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28538b;
        this.f17109n = AbstractC0705LB.m4916c(enumC9659hi0, new C8752af0(this, 0));
        this.f17110o = AbstractC0705LB.m4916c(enumC9659hi0, new C8752af0(this, 1));
    }
}
