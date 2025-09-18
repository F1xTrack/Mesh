package defpackage;

import java.util.ArrayList;

/* renamed from: tK1 */
/* loaded from: classes.dex */
public abstract class AbstractC7201tK1 {
    public static final C0240Cv0 a = new C0240Cv0(23);

    public static final void a(InterfaceC0174Bz0 interfaceC0174Bz0, KX kx, ArrayList arrayList) {
        O90.f(interfaceC0174Bz0, "<this>");
        O90.f(kx, "fqName");
        if (interfaceC0174Bz0 instanceof InterfaceC0330Dz0) {
            ((InterfaceC0330Dz0) interfaceC0174Bz0).d(kx, arrayList);
        } else {
            arrayList.addAll(interfaceC0174Bz0.a(kx));
        }
    }

    public static final boolean b(InterfaceC0174Bz0 interfaceC0174Bz0, KX kx) {
        O90.f(interfaceC0174Bz0, "<this>");
        O90.f(kx, "fqName");
        return interfaceC0174Bz0 instanceof InterfaceC0330Dz0 ? ((InterfaceC0330Dz0) interfaceC0174Bz0).c(kx) : c(interfaceC0174Bz0, kx).isEmpty();
    }

    public static final ArrayList c(InterfaceC0174Bz0 interfaceC0174Bz0, KX kx) {
        O90.f(interfaceC0174Bz0, "<this>");
        O90.f(kx, "fqName");
        ArrayList arrayList = new ArrayList();
        a(interfaceC0174Bz0, kx, arrayList);
        return arrayList;
    }

    public static void d(Object obj) throws Throwable {
        if (obj instanceof C4227hp1) {
            throw ((C4227hp1) obj).a;
        }
    }
}
