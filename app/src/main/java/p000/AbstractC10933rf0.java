package p000;

/* renamed from: rf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10933rf0 extends AbstractC10421nf0 implements InterfaceC11824ye0 {

    /* renamed from: i */
    public static final /* synthetic */ InterfaceC10293mf0[] f41792i;

    /* renamed from: g */
    public final AP0 f41793g = AbstractC11668xP1.m25850a(null, new C10805qf0(this, 1));

    /* renamed from: h */
    public final Object f41794h = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C10805qf0(this, 0));

    static {
        IP0 ip0 = BP0.f799a;
        f41792i = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(AbstractC10933rf0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC10933rf0) && O90.m5963a(mo1740u(), ((AbstractC10933rf0) obj).mo1740u());
    }

    @Override // p000.InterfaceC8152Qd0
    public final String getName() {
        return F91.m2539v(new StringBuilder("<set-"), mo1740u().f43198h, '>');
    }

    public final int hashCode() {
        return mo1740u().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC8360Ud0
    /* renamed from: m */
    public final InterfaceC0615Jl mo8091m() {
        return (InterfaceC0615Jl) this.f41794h.getValue();
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: p */
    public final InterfaceC7158xl mo8094p() {
        InterfaceC10293mf0 interfaceC10293mf0 = f41792i[0];
        Object objInvoke = this.f41793g.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (JE0) objInvoke;
    }

    @Override // p000.AbstractC10421nf0
    /* renamed from: t */
    public final InterfaceC11899zE0 mo23160t() {
        InterfaceC10293mf0 interfaceC10293mf0 = f41792i[0];
        Object objInvoke = this.f41793g.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (JE0) objInvoke;
    }

    public final String toString() {
        return "setter of " + mo1740u();
    }
}
