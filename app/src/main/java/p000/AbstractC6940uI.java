package p000;

/* renamed from: uI */
/* loaded from: classes2.dex */
public abstract class AbstractC6940uI {

    /* renamed from: a */
    public static final /* synthetic */ int f43634a = 0;

    static {
        C8340Tt0.m7798e("value");
    }

    /* renamed from: a */
    public static final boolean m25148a(C8473Wh1 c8473Wh1) {
        Boolean boolM8807c = WY1.m8807c(AbstractC7230yu.m26274e(c8473Wh1), OJ1.f8356b, C6877tI.f42990a);
        O90.m5967e(boolM8807c, "ifAny(...)");
        return boolM8807c.booleanValue();
    }

    /* renamed from: b */
    public static InterfaceC7158xl m25149b(InterfaceC7158xl interfaceC7158xl, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(interfaceC7158xl, "<this>");
        return (InterfaceC7158xl) WY1.m8805a(AbstractC7230yu.m26274e(interfaceC7158xl), new C0328FC(false, false), new C6348lC(new TO0(), interfaceC6497nZ));
    }

    /* renamed from: c */
    public static final C0664KX m25150c(InterfaceC0266ED interfaceC0266ED) {
        O90.m5968f(interfaceC0266ED, "<this>");
        C0789MX c0789mxM25155h = m25155h(interfaceC0266ED);
        if (!c0789mxM25155h.m5390d()) {
            c0789mxM25155h = null;
        }
        if (c0789mxM25155h != null) {
            return c0789mxM25155h.m5393g();
        }
        return null;
    }

    /* renamed from: d */
    public static final InterfaceC6976us m25151d(InterfaceC7116x5 interfaceC7116x5) {
        O90.m5968f(interfaceC7116x5, "<this>");
        InterfaceC0873Ns interfaceC0873NsMo1962a = interfaceC7116x5.getType().mo3797E().mo1962a();
        if (interfaceC0873NsMo1962a instanceof InterfaceC6976us) {
            return (InterfaceC6976us) interfaceC0873NsMo1962a;
        }
        return null;
    }

    /* renamed from: e */
    public static final AbstractC11955zg0 m25152e(InterfaceC0140CD interfaceC0140CD) {
        O90.m5968f(interfaceC0140CD, "<this>");
        return m25157j(interfaceC0140CD).mo897h();
    }

    /* renamed from: f */
    public static final C0055As m25153f(InterfaceC0873Ns interfaceC0873Ns) {
        InterfaceC0140CD interfaceC0140CDMo423i;
        C0055As c0055AsM25153f;
        if (interfaceC0873Ns == null || (interfaceC0140CDMo423i = interfaceC0873Ns.mo423i()) == null) {
            return null;
        }
        if (interfaceC0140CDMo423i instanceof InterfaceC11993zz0) {
            return new C0055As(((AbstractC7364Az0) ((InterfaceC11993zz0) interfaceC0140CDMo423i)).f494f, interfaceC0873Ns.getName());
        }
        if (!(interfaceC0140CDMo423i instanceof InterfaceC0936Os) || (c0055AsM25153f = m25153f((InterfaceC0873Ns) interfaceC0140CDMo423i)) == null) {
            return null;
        }
        return c0055AsM25153f.m361d(interfaceC0873Ns.getName());
    }

    /* renamed from: g */
    public static final C0664KX m25154g(InterfaceC0140CD interfaceC0140CD) {
        O90.m5968f(interfaceC0140CD, "<this>");
        C0664KX c0664kxM24696h = AbstractC6814sI.m24696h(interfaceC0140CD);
        if (c0664kxM24696h == null) {
            c0664kxM24696h = AbstractC6814sI.m24695g(interfaceC0140CD.mo423i()).m5388b(interfaceC0140CD.getName()).m5393g();
        }
        if (c0664kxM24696h != null) {
            return c0664kxM24696h;
        }
        AbstractC6814sI.m24689a(4);
        throw null;
    }

    /* renamed from: h */
    public static final C0789MX m25155h(InterfaceC0140CD interfaceC0140CD) {
        O90.m5968f(interfaceC0140CD, "<this>");
        C0789MX c0789mxM24695g = AbstractC6814sI.m24695g(interfaceC0140CD);
        O90.m5967e(c0789mxM24695g, "getFqName(...)");
        return c0789mxM24695g;
    }

    /* renamed from: i */
    public static final void m25156i(InterfaceC7402Bs0 interfaceC7402Bs0) {
        O90.m5968f(interfaceC7402Bs0, "<this>");
        if (interfaceC7402Bs0.mo898q(AbstractC10360nA1.f38164a) != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: j */
    public static final InterfaceC7402Bs0 m25157j(InterfaceC0140CD interfaceC0140CD) {
        O90.m5968f(interfaceC0140CD, "<this>");
        InterfaceC7402Bs0 interfaceC7402Bs0M24692d = AbstractC6814sI.m24692d(interfaceC0140CD);
        O90.m5967e(interfaceC7402Bs0M24692d, "getContainingModule(...)");
        return interfaceC7402Bs0M24692d;
    }

    /* renamed from: k */
    public static final InterfaceC7158xl m25158k(InterfaceC7158xl interfaceC7158xl) {
        O90.m5968f(interfaceC7158xl, "<this>");
        if (!(interfaceC7158xl instanceof InterfaceC11899zE0)) {
            return interfaceC7158xl;
        }
        CE0 ce0M123y1 = ((AE0) ((InterfaceC11899zE0) interfaceC7158xl)).m123y1();
        O90.m5967e(ce0M123y1, "getCorrespondingProperty(...)");
        return ce0M123y1;
    }
}
