package defpackage;

/* renamed from: yf0 */
/* loaded from: classes2.dex */
public final class C8215yf0 implements InterfaceC8025xf0, InterfaceC5351je0 {
    public static final /* synthetic */ InterfaceC5927mf0[] d;
    public final InterfaceC5925me1 a;
    public final AP0 b;
    public final InterfaceC8405zf0 c;

    static {
        IP0 ip0 = BP0.a;
        d = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C8215yf0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public C8215yf0(InterfaceC8405zf0 interfaceC8405zf0, InterfaceC5925me1 interfaceC5925me1) {
        Class cls;
        C3430de0 c3430de0C;
        Object objZ;
        O90.f(interfaceC5925me1, "descriptor");
        this.a = interfaceC5925me1;
        this.b = AbstractC7978xP1.a(null, new C6685qd0(5, this));
        if (interfaceC8405zf0 == null) {
            CD cdI = interfaceC5925me1.i();
            O90.e(cdI, "getContainingDeclaration(...)");
            if (cdI instanceof InterfaceC7492us) {
                objZ = c((InterfaceC7492us) cdI);
            } else {
                if (!(cdI instanceof InterfaceC8042xl)) {
                    throw new C1420Rz("Unknown type parameter container: " + cdI, 1);
                }
                CD cdI2 = ((InterfaceC8042xl) cdI).i();
                O90.e(cdI2, "getContainingDeclaration(...)");
                if (cdI2 instanceof InterfaceC7492us) {
                    c3430de0C = c((InterfaceC7492us) cdI2);
                } else {
                    MI mi = cdI instanceof MI ? (MI) cdI : null;
                    if (mi == null) {
                        throw new C1420Rz("Non-class callable descriptor must be deserialized: " + cdI, 1);
                    }
                    JI jiK0 = mi.k0();
                    C6494pd0 c6494pd0 = jiK0 instanceof C6494pd0 ? (C6494pd0) jiK0 : null;
                    C7977xP0 c7977xP0 = c6494pd0 != null ? c6494pd0.c : null;
                    C7977xP0 c7977xP02 = c7977xP0 instanceof C7977xP0 ? c7977xP0 : null;
                    if (c7977xP02 == null || (cls = c7977xP02.a) == null) {
                        throw new C1420Rz("Container of deserialized member is not resolved: " + mi, 1);
                    }
                    c3430de0C = (C3430de0) P22.e(cls);
                }
                objZ = cdI.Z(new C1304Qm0(c3430de0C), C1518Tf1.a);
            }
            O90.c(objZ);
            interfaceC8405zf0 = (InterfaceC8405zf0) objZ;
        }
        this.c = interfaceC8405zf0;
    }

    public static C3430de0 c(InterfaceC7492us interfaceC7492us) {
        Class clsK = AbstractC0433Fh1.k(interfaceC7492us);
        C3430de0 c3430de0 = (C3430de0) (clsK != null ? P22.e(clsK) : null);
        if (c3430de0 != null) {
            return c3430de0;
        }
        throw new C1420Rz("Type parameter container is not resolved: " + interfaceC7492us.i(), 1);
    }

    public final String b() {
        String strB = this.a.getName().b();
        O90.e(strB, "asString(...)");
        return strB;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8215yf0) {
            C8215yf0 c8215yf0 = (C8215yf0) obj;
            if (O90.a(this.c, c8215yf0.c) && b().equals(c8215yf0.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC5351je0
    public final InterfaceC1087Ns k() {
        return this.a;
    }

    public final String toString() {
        EnumC0192Cf0 enumC0192Cf0;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.a.O().ordinal();
        if (iOrdinal == 0) {
            enumC0192Cf0 = EnumC0192Cf0.a;
        } else if (iOrdinal == 1) {
            enumC0192Cf0 = EnumC0192Cf0.b;
        } else {
            if (iOrdinal != 2) {
                throw new C7074sg();
            }
            enumC0192Cf0 = EnumC0192Cf0.c;
        }
        int iOrdinal2 = enumC0192Cf0.ordinal();
        if (iOrdinal2 == 1) {
            sb.append("in ");
        } else if (iOrdinal2 == 2) {
            sb.append("out ");
        }
        sb.append(b());
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }
}
