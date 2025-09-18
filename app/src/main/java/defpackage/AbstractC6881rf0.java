package defpackage;

/* renamed from: rf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6881rf0 extends AbstractC6118nf0 implements InterfaceC8212ye0 {
    public static final /* synthetic */ InterfaceC5927mf0[] i;
    public final AP0 g = AbstractC7978xP1.a(null, new C6691qf0(this, 1));
    public final Object h = LB.c(EnumC4205hi0.b, new C6691qf0(this, 0));

    static {
        IP0 ip0 = BP0.a;
        i = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(AbstractC6881rf0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC6881rf0) && O90.a(u(), ((AbstractC6881rf0) obj).u());
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final String getName() {
        return F91.v(new StringBuilder("<set-"), u().h, '>');
    }

    public final int hashCode() {
        return u().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC1589Ud0
    public final InterfaceC0755Jl m() {
        return (InterfaceC0755Jl) this.h.getValue();
    }

    @Override // defpackage.AbstractC1589Ud0
    public final InterfaceC8042xl p() {
        InterfaceC5927mf0 interfaceC5927mf0 = i[0];
        Object objInvoke = this.g.invoke();
        O90.e(objInvoke, "getValue(...)");
        return (JE0) objInvoke;
    }

    @Override // defpackage.AbstractC6118nf0
    public final InterfaceC8324zE0 t() {
        InterfaceC5927mf0 interfaceC5927mf0 = i[0];
        Object objInvoke = this.g.invoke();
        O90.e(objInvoke, "getValue(...)");
        return (JE0) objInvoke;
    }

    public final String toString() {
        return "setter of " + u();
    }
}
