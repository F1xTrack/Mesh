package p000;

/* loaded from: classes.dex */
public abstract class QI1 {

    /* renamed from: a */
    public static final C1342VK f9562a = new C1342VK("StdlibClassFinder", 1);

    /* renamed from: a */
    public static final void m6628a(InterfaceC6497nZ interfaceC6497nZ, Object obj, InterfaceC0125Bz interfaceC0125Bz) {
        C6838sg c6838sgM6629b = m6629b(interfaceC6497nZ, obj, null);
        if (c6838sgM6629b != null) {
            AbstractC11176tY1.m24942a(interfaceC0125Bz, c6838sgM6629b);
        }
    }

    /* renamed from: b */
    public static final C6838sg m6629b(InterfaceC6497nZ interfaceC6497nZ, Object obj, C6838sg c6838sg) {
        try {
            interfaceC6497nZ.invoke(obj);
        } catch (Throwable th) {
            if (c6838sg == null || c6838sg.getCause() == th) {
                return new C6838sg("Exception in undelivered element handler for " + obj, th);
            }
            I02.m3687a(c6838sg, th);
        }
        return c6838sg;
    }
}
