package p000;

/* renamed from: u80 */
/* loaded from: classes2.dex */
public abstract class AbstractC11251u80 {

    /* renamed from: a */
    public static final /* synthetic */ int f43535a = 0;

    static {
        C0055As.m358j(new C0664KX("kotlin.jvm.JvmInline"));
    }

    /* renamed from: a */
    public static final boolean m25116a(InterfaceC7158xl interfaceC7158xl) {
        AbstractC8057Oh1 abstractC8057Oh1Mo1429J0;
        O90.m5968f(interfaceC7158xl, "<this>");
        if (interfaceC7158xl instanceof FE0) {
            CE0 ce0M123y1 = ((FE0) interfaceC7158xl).m123y1();
            O90.m5967e(ce0M123y1, "getCorrespondingProperty(...)");
            if (ce0M123y1.mo121t0() == null) {
                InterfaceC0140CD interfaceC0140CDMo423i = ce0M123y1.mo423i();
                InterfaceC6976us interfaceC6976us = interfaceC0140CDMo423i instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CDMo423i : null;
                if (interfaceC6976us != null && (abstractC8057Oh1Mo1429J0 = interfaceC6976us.mo1429J0()) != null) {
                    C8340Tt0 name = ce0M123y1.getName();
                    O90.m5967e(name, "getName(...)");
                    if (abstractC8057Oh1Mo1429J0.mo6116a(name)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m25117b(InterfaceC0140CD interfaceC0140CD) {
        O90.m5968f(interfaceC0140CD, "<this>");
        return (interfaceC0140CD instanceof InterfaceC6976us) && (((InterfaceC6976us) interfaceC0140CD).mo1429J0() instanceof C11123t80);
    }

    /* renamed from: c */
    public static final boolean m25118c(InterfaceC0140CD interfaceC0140CD) {
        O90.m5968f(interfaceC0140CD, "<this>");
        return (interfaceC0140CD instanceof InterfaceC6976us) && (((InterfaceC6976us) interfaceC0140CD).mo1429J0() instanceof C9681ht0);
    }

    /* renamed from: d */
    public static final boolean m25119d(InterfaceC9276ei1 interfaceC9276ei1) {
        if (interfaceC9276ei1.mo121t0() == null) {
            InterfaceC0140CD interfaceC0140CDMo423i = interfaceC9276ei1.mo423i();
            C8340Tt0 c8340Tt0 = null;
            InterfaceC6976us interfaceC6976us = interfaceC0140CDMo423i instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CDMo423i : null;
            if (interfaceC6976us != null) {
                int i = AbstractC6940uI.f43634a;
                AbstractC8057Oh1 abstractC8057Oh1Mo1429J0 = interfaceC6976us.mo1429J0();
                C11123t80 c11123t80 = abstractC8057Oh1Mo1429J0 instanceof C11123t80 ? (C11123t80) abstractC8057Oh1Mo1429J0 : null;
                if (c11123t80 != null) {
                    c8340Tt0 = c11123t80.f42881a;
                }
            }
            if (O90.m5963a(c8340Tt0, interfaceC9276ei1.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m25120e(InterfaceC0140CD interfaceC0140CD) {
        O90.m5968f(interfaceC0140CD, "<this>");
        return m25117b(interfaceC0140CD) || m25118c(interfaceC0140CD);
    }

    /* renamed from: f */
    public static final boolean m25121f(AbstractC7742Ig0 abstractC7742Ig0) {
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        if (interfaceC0873NsMo1962a != null) {
            return m25120e(interfaceC0873NsMo1962a);
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m25122g(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        return (interfaceC0873NsMo1962a == null || !m25118c(interfaceC0873NsMo1962a) || AbstractC7375Be1.m787e(abstractC7742Ig0)) ? false : true;
    }

    /* renamed from: h */
    public static final X01 m25123h(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        InterfaceC6976us interfaceC6976us = interfaceC0873NsMo1962a instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1962a : null;
        if (interfaceC6976us == null) {
            return null;
        }
        int i = AbstractC6940uI.f43634a;
        AbstractC8057Oh1 abstractC8057Oh1Mo1429J0 = interfaceC6976us.mo1429J0();
        C11123t80 c11123t80 = abstractC8057Oh1Mo1429J0 instanceof C11123t80 ? (C11123t80) abstractC8057Oh1Mo1429J0 : null;
        if (c11123t80 != null) {
            return (X01) c11123t80.f42882b;
        }
        return null;
    }
}
