package defpackage;

/* loaded from: classes.dex */
public abstract class QI1 {
    public static final VK a = new VK("StdlibClassFinder", 1);

    public static final void a(InterfaceC6099nZ interfaceC6099nZ, Object obj, InterfaceC0173Bz interfaceC0173Bz) {
        C7074sg c7074sgB = b(interfaceC6099nZ, obj, null);
        if (c7074sgB != null) {
            AbstractC7243tY1.a(interfaceC0173Bz, c7074sgB);
        }
    }

    public static final C7074sg b(InterfaceC6099nZ interfaceC6099nZ, Object obj, C7074sg c7074sg) {
        try {
            interfaceC6099nZ.invoke(obj);
        } catch (Throwable th) {
            if (c7074sg == null || c7074sg.getCause() == th) {
                return new C7074sg("Exception in undelivered element handler for " + obj, th);
            }
            I02.a(c7074sg, th);
        }
        return c7074sg;
    }
}
