package p000;

import java.util.ArrayList;

/* renamed from: tK1 */
/* loaded from: classes.dex */
public abstract class AbstractC11148tK1 {

    /* renamed from: a */
    public static final C7460Cv0 f42996a = new C7460Cv0(23);

    /* renamed from: a */
    public static final void m24876a(InterfaceC7416Bz0 interfaceC7416Bz0, C0664KX c0664kx, ArrayList arrayList) {
        O90.m5968f(interfaceC7416Bz0, "<this>");
        O90.m5968f(c0664kx, "fqName");
        if (interfaceC7416Bz0 instanceof InterfaceC7520Dz0) {
            ((InterfaceC7520Dz0) interfaceC7416Bz0).mo1484d(c0664kx, arrayList);
        } else {
            arrayList.addAll(interfaceC7416Bz0.mo939a(c0664kx));
        }
    }

    /* renamed from: b */
    public static final boolean m24877b(InterfaceC7416Bz0 interfaceC7416Bz0, C0664KX c0664kx) {
        O90.m5968f(interfaceC7416Bz0, "<this>");
        O90.m5968f(c0664kx, "fqName");
        return interfaceC7416Bz0 instanceof InterfaceC7520Dz0 ? ((InterfaceC7520Dz0) interfaceC7416Bz0).mo1483c(c0664kx) : m24878c(interfaceC7416Bz0, c0664kx).isEmpty();
    }

    /* renamed from: c */
    public static final ArrayList m24878c(InterfaceC7416Bz0 interfaceC7416Bz0, C0664KX c0664kx) {
        O90.m5968f(interfaceC7416Bz0, "<this>");
        O90.m5968f(c0664kx, "fqName");
        ArrayList arrayList = new ArrayList();
        m24876a(interfaceC7416Bz0, c0664kx, arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static void m24879d(Object obj) throws Throwable {
        if (obj instanceof C9674hp1) {
            throw ((C9674hp1) obj).f28617a;
        }
    }
}
