package p000;

/* renamed from: pf0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10677pf0 extends AbstractC10421nf0 implements InterfaceC8466We0 {

    /* renamed from: i */
    public static final /* synthetic */ InterfaceC10293mf0[] f40265i;

    /* renamed from: g */
    public final AP0 f40266g = AbstractC11668xP1.m25850a(null, new C10549of0(this, 1));

    /* renamed from: h */
    public final Object f40267h = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C10549of0(this, 0));

    static {
        IP0 ip0 = BP0.f799a;
        f40265i = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(AbstractC10677pf0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC10677pf0) && O90.m5963a(mo1740u(), ((AbstractC10677pf0) obj).mo1740u());
    }

    @Override // p000.InterfaceC8152Qd0
    public final String getName() {
        return F91.m2539v(new StringBuilder("<get-"), mo1740u().f43198h, '>');
    }

    public final int hashCode() {
        return mo1740u().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC8360Ud0
    /* renamed from: m */
    public final InterfaceC0615Jl mo8091m() {
        return (InterfaceC0615Jl) this.f40267h.getValue();
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: p */
    public final InterfaceC7158xl mo8094p() {
        InterfaceC10293mf0 interfaceC10293mf0 = f40265i[0];
        Object objInvoke = this.f40266g.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (FE0) objInvoke;
    }

    @Override // p000.AbstractC10421nf0
    /* renamed from: t */
    public final InterfaceC11899zE0 mo23160t() {
        InterfaceC10293mf0 interfaceC10293mf0 = f40265i[0];
        Object objInvoke = this.f40266g.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (FE0) objInvoke;
    }

    public final String toString() {
        return "getter of " + mo1740u();
    }
}
