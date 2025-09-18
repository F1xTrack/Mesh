package p000;

import java.lang.reflect.Type;
import java.util.List;

/* renamed from: Te0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8310Te0 implements InterfaceC8154Qe0 {

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC10293mf0[] f11453e;

    /* renamed from: a */
    public final AbstractC8360Ud0 f11454a;

    /* renamed from: b */
    public final int f11455b;

    /* renamed from: c */
    public final EnumC8102Pe0 f11456c;

    /* renamed from: d */
    public final AP0 f11457d;

    static {
        IP0 ip0 = BP0.f799a;
        f11453e = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C8310Te0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), ip0.mo3850f(new GE0(ip0.mo3846b(C8310Te0.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C8310Te0(AbstractC8360Ud0 abstractC8360Ud0, int i, EnumC8102Pe0 enumC8102Pe0, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(abstractC8360Ud0, "callable");
        this.f11454a = abstractC8360Ud0;
        this.f11455b = i;
        this.f11456c = enumC8102Pe0;
        this.f11457d = AbstractC11668xP1.m25850a(null, interfaceC6434mZ);
        AbstractC11668xP1.m25850a(null, new C8258Se0(this, 0));
    }

    /* renamed from: b */
    public static final Type m7709b(C8310Te0 c8310Te0, Type... typeArr) {
        c8310Te0.getClass();
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new C8206Re0(typeArr) : (Type) AbstractC0576J8.m4198y(typeArr);
        }
        throw new C1131Rz("Expected at least 1 type for compound type");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8310Te0) {
            C8310Te0 c8310Te0 = (C8310Te0) obj;
            if (O90.m5963a(this.f11454a, c8310Te0.f11454a)) {
                if (this.f11455b == c8310Te0.f11455b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC8100Pd0
    public final List getAnnotations() {
        throw null;
    }

    public final String getName() {
        InterfaceC8946cA0 interfaceC8946cA0M7710k = m7710k();
        C8473Wh1 c8473Wh1 = interfaceC8946cA0M7710k instanceof C8473Wh1 ? (C8473Wh1) interfaceC8946cA0M7710k : null;
        if (c8473Wh1 == null || c8473Wh1.mo423i().mo107F()) {
            return null;
        }
        C8340Tt0 name = c8473Wh1.getName();
        O90.m5967e(name, "getName(...)");
        if (name.f11578b) {
            return null;
        }
        return name.m7801b();
    }

    public final int hashCode() {
        return (this.f11454a.hashCode() * 31) + this.f11455b;
    }

    /* renamed from: k */
    public final InterfaceC8946cA0 m7710k() {
        InterfaceC10293mf0 interfaceC10293mf0 = f11453e[0];
        Object objInvoke = this.f11457d.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (InterfaceC8946cA0) objInvoke;
    }

    /* renamed from: l */
    public final C11572wf0 m7711l() {
        AbstractC7742Ig0 type = m7710k().getType();
        O90.m5967e(type, "getType(...)");
        return new C11572wf0(type, new C8258Se0(this, 1));
    }

    /* renamed from: m */
    public final boolean m7712m() {
        InterfaceC8946cA0 interfaceC8946cA0M7710k = m7710k();
        C8473Wh1 c8473Wh1 = interfaceC8946cA0M7710k instanceof C8473Wh1 ? (C8473Wh1) interfaceC8946cA0M7710k : null;
        if (c8473Wh1 != null) {
            return AbstractC6940uI.m25148a(c8473Wh1);
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m7713n() {
        InterfaceC8946cA0 interfaceC8946cA0M7710k = m7710k();
        return (interfaceC8946cA0M7710k instanceof C8473Wh1) && ((C8473Wh1) interfaceC8946cA0M7710k).f13327k != null;
    }

    public final String toString() {
        String strM6683b;
        C6417mI c6417mI = QP0.f9616a;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f11456c.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("extension receiver parameter");
        } else if (iOrdinal == 2) {
            sb.append("parameter #" + this.f11455b + ' ' + getName());
        }
        sb.append(" of ");
        InterfaceC7158xl interfaceC7158xlMo8094p = this.f11454a.mo8094p();
        if (interfaceC7158xlMo8094p instanceof CE0) {
            strM6683b = QP0.m6684c((CE0) interfaceC7158xlMo8094p);
        } else {
            if (!(interfaceC7158xlMo8094p instanceof InterfaceC0036AZ)) {
                throw new IllegalStateException(("Illegal callable: " + interfaceC7158xlMo8094p).toString());
            }
            strM6683b = QP0.m6683b((InterfaceC0036AZ) interfaceC7158xlMo8094p);
        }
        sb.append(strM6683b);
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
