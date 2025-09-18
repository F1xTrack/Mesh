package defpackage;

import java.lang.reflect.Type;
import java.util.List;

/* renamed from: Te0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1514Te0 implements InterfaceC1280Qe0 {
    public static final /* synthetic */ InterfaceC5927mf0[] e;
    public final AbstractC1589Ud0 a;
    public final int b;
    public final EnumC1202Pe0 c;
    public final AP0 d;

    static {
        IP0 ip0 = BP0.a;
        e = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C1514Te0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), ip0.f(new GE0(ip0.b(C1514Te0.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C1514Te0(AbstractC1589Ud0 abstractC1589Ud0, int i, EnumC1202Pe0 enumC1202Pe0, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(abstractC1589Ud0, "callable");
        this.a = abstractC1589Ud0;
        this.b = i;
        this.c = enumC1202Pe0;
        this.d = AbstractC7978xP1.a(null, interfaceC5908mZ);
        AbstractC7978xP1.a(null, new C1436Se0(this, 0));
    }

    public static final Type b(C1514Te0 c1514Te0, Type... typeArr) {
        c1514Te0.getClass();
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new C1358Re0(typeArr) : (Type) J8.y(typeArr);
        }
        throw new C1420Rz("Expected at least 1 type for compound type");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1514Te0) {
            C1514Te0 c1514Te0 = (C1514Te0) obj;
            if (O90.a(this.a, c1514Te0.a)) {
                if (this.b == c1514Te0.b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1199Pd0
    public final List getAnnotations() {
        throw null;
    }

    public final String getName() {
        InterfaceC2464cA0 interfaceC2464cA0K = k();
        C1758Wh1 c1758Wh1 = interfaceC2464cA0K instanceof C1758Wh1 ? (C1758Wh1) interfaceC2464cA0K : null;
        if (c1758Wh1 == null || c1758Wh1.i().F()) {
            return null;
        }
        C1559Tt0 name = c1758Wh1.getName();
        O90.e(name, "getName(...)");
        if (name.b) {
            return null;
        }
        return name.b();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final InterfaceC2464cA0 k() {
        InterfaceC5927mf0 interfaceC5927mf0 = e[0];
        Object objInvoke = this.d.invoke();
        O90.e(objInvoke, "getValue(...)");
        return (InterfaceC2464cA0) objInvoke;
    }

    public final C7835wf0 l() {
        AbstractC0663Ig0 type = k().getType();
        O90.e(type, "getType(...)");
        return new C7835wf0(type, new C1436Se0(this, 1));
    }

    public final boolean m() {
        InterfaceC2464cA0 interfaceC2464cA0K = k();
        C1758Wh1 c1758Wh1 = interfaceC2464cA0K instanceof C1758Wh1 ? (C1758Wh1) interfaceC2464cA0K : null;
        if (c1758Wh1 != null) {
            return AbstractC7384uI.a(c1758Wh1);
        }
        return false;
    }

    public final boolean n() {
        InterfaceC2464cA0 interfaceC2464cA0K = k();
        return (interfaceC2464cA0K instanceof C1758Wh1) && ((C1758Wh1) interfaceC2464cA0K).k != null;
    }

    public final String toString() {
        String strB;
        C5857mI c5857mI = QP0.a;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("extension receiver parameter");
        } else if (iOrdinal == 2) {
            sb.append("parameter #" + this.b + ' ' + getName());
        }
        sb.append(" of ");
        InterfaceC8042xl interfaceC8042xlP = this.a.p();
        if (interfaceC8042xlP instanceof CE0) {
            strB = QP0.c((CE0) interfaceC8042xlP);
        } else {
            if (!(interfaceC8042xlP instanceof AZ)) {
                throw new IllegalStateException(("Illegal callable: " + interfaceC8042xlP).toString());
            }
            strB = QP0.b((AZ) interfaceC8042xlP);
        }
        sb.append(strB);
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }
}
