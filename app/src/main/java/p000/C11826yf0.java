package p000;

/* renamed from: yf0 */
/* loaded from: classes2.dex */
public final class C11826yf0 implements InterfaceC11699xf0, InterfaceC9907je0 {

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC10293mf0[] f46379d;

    /* renamed from: a */
    public final InterfaceC10292me1 f46380a;

    /* renamed from: b */
    public final AP0 f46381b;

    /* renamed from: c */
    public final InterfaceC11953zf0 f46382c;

    static {
        IP0 ip0 = BP0.f799a;
        f46379d = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C11826yf0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public C11826yf0(InterfaceC11953zf0 interfaceC11953zf0, InterfaceC10292me1 interfaceC10292me1) {
        Class cls;
        C9139de0 c9139de0M26210c;
        Object objMo421Z;
        O90.m5968f(interfaceC10292me1, "descriptor");
        this.f46380a = interfaceC10292me1;
        this.f46381b = AbstractC11668xP1.m25850a(null, new C10801qd0(5, this));
        if (interfaceC11953zf0 == null) {
            InterfaceC0140CD interfaceC0140CDMo423i = interfaceC10292me1.mo423i();
            O90.m5967e(interfaceC0140CDMo423i, "getContainingDeclaration(...)");
            if (interfaceC0140CDMo423i instanceof InterfaceC6976us) {
                objMo421Z = m26210c((InterfaceC6976us) interfaceC0140CDMo423i);
            } else {
                if (!(interfaceC0140CDMo423i instanceof InterfaceC7158xl)) {
                    throw new C1131Rz("Unknown type parameter container: " + interfaceC0140CDMo423i, 1);
                }
                InterfaceC0140CD interfaceC0140CDMo423i2 = ((InterfaceC7158xl) interfaceC0140CDMo423i).mo423i();
                O90.m5967e(interfaceC0140CDMo423i2, "getContainingDeclaration(...)");
                if (interfaceC0140CDMo423i2 instanceof InterfaceC6976us) {
                    c9139de0M26210c = m26210c((InterfaceC6976us) interfaceC0140CDMo423i2);
                } else {
                    InterfaceC0774MI interfaceC0774MI = interfaceC0140CDMo423i instanceof InterfaceC0774MI ? (InterfaceC0774MI) interfaceC0140CDMo423i : null;
                    if (interfaceC0774MI == null) {
                        throw new C1131Rz("Non-class callable descriptor must be deserialized: " + interfaceC0140CDMo423i, 1);
                    }
                    InterfaceC0586JI interfaceC0586JIMo154k0 = interfaceC0774MI.mo154k0();
                    C10673pd0 c10673pd0 = interfaceC0586JIMo154k0 instanceof C10673pd0 ? (C10673pd0) interfaceC0586JIMo154k0 : null;
                    C11667xP0 c11667xP0 = c10673pd0 != null ? c10673pd0.f40247c : null;
                    C11667xP0 c11667xP02 = c11667xP0 instanceof C11667xP0 ? c11667xP0 : null;
                    if (c11667xP02 == null || (cls = c11667xP02.f45572a) == null) {
                        throw new C1131Rz("Container of deserialized member is not resolved: " + interfaceC0774MI, 1);
                    }
                    c9139de0M26210c = (C9139de0) P22.m6216e(cls);
                }
                objMo421Z = interfaceC0140CDMo423i.mo421Z(new C8170Qm0(c9139de0M26210c), C8313Tf1.f11463a);
            }
            O90.m5965c(objMo421Z);
            interfaceC11953zf0 = (InterfaceC11953zf0) objMo421Z;
        }
        this.f46382c = interfaceC11953zf0;
    }

    /* renamed from: c */
    public static C9139de0 m26210c(InterfaceC6976us interfaceC6976us) {
        Class clsM2759k = AbstractC7589Fh1.m2759k(interfaceC6976us);
        C9139de0 c9139de0 = (C9139de0) (clsM2759k != null ? P22.m6216e(clsM2759k) : null);
        if (c9139de0 != null) {
            return c9139de0;
        }
        throw new C1131Rz("Type parameter container is not resolved: " + interfaceC6976us.mo423i(), 1);
    }

    /* renamed from: b */
    public final String m26211b() {
        String strM7801b = this.f46380a.getName().m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        return strM7801b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11826yf0) {
            C11826yf0 c11826yf0 = (C11826yf0) obj;
            if (O90.m5963a(this.f46382c, c11826yf0.f46382c) && m26211b().equals(c11826yf0.m26211b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return m26211b().hashCode() + (this.f46382c.hashCode() * 31);
    }

    @Override // p000.InterfaceC9907je0
    /* renamed from: k */
    public final InterfaceC0873Ns mo17722k() {
        return this.f46380a;
    }

    public final String toString() {
        EnumC7428Cf0 enumC7428Cf0;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f46380a.mo22918O().ordinal();
        if (iOrdinal == 0) {
            enumC7428Cf0 = EnumC7428Cf0.f1568a;
        } else if (iOrdinal == 1) {
            enumC7428Cf0 = EnumC7428Cf0.f1569b;
        } else {
            if (iOrdinal != 2) {
                throw new C6838sg();
            }
            enumC7428Cf0 = EnumC7428Cf0.f1570c;
        }
        int iOrdinal2 = enumC7428Cf0.ordinal();
        if (iOrdinal2 == 1) {
            sb.append("in ");
        } else if (iOrdinal2 == 2) {
            sb.append("out ");
        }
        sb.append(m26211b());
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
