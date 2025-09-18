package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class WS1 {
    public static final void a(InterfaceC7492us interfaceC7492us, LinkedHashSet linkedHashSet, InterfaceC5578kq0 interfaceC5578kq0, boolean z) {
        for (CD cd : AbstractC8171yQ1.a(interfaceC5578kq0, C4317iI.o, 2)) {
            if (cd instanceof InterfaceC7492us) {
                InterfaceC7492us interfaceC7492usY1 = (InterfaceC7492us) cd;
                if (interfaceC7492usY1.M()) {
                    C1559Tt0 name = interfaceC7492usY1.getName();
                    O90.e(name, "getName(...)");
                    InterfaceC1087Ns interfaceC1087NsC = interfaceC5578kq0.c(name, EnumC8453zv0.d);
                    interfaceC7492usY1 = interfaceC1087NsC instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsC : interfaceC1087NsC instanceof InterfaceC0499Gd1 ? ((VI) ((InterfaceC0499Gd1) interfaceC1087NsC)).y1() : null;
                }
                if (interfaceC7492usY1 == null) {
                    continue;
                } else {
                    if (interfaceC7492us == null) {
                        AbstractC7002sI.a(27);
                        throw null;
                    }
                    int i = AbstractC7002sI.a;
                    Iterator it = interfaceC7492usY1.v().b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC7002sI.p((AbstractC0663Ig0) it.next(), interfaceC7492us.x1())) {
                                linkedHashSet.add(interfaceC7492usY1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        InterfaceC5578kq0 interfaceC5578kq0I0 = interfaceC7492usY1.I0();
                        O90.e(interfaceC5578kq0I0, "getUnsubstitutedInnerClassesScope(...)");
                        a(interfaceC7492us, linkedHashSet, interfaceC5578kq0I0, z);
                    }
                }
            }
        }
    }

    public static final Object b(InterfaceC1331Qv0 interfaceC1331Qv0, InterfaceC5927mf0 interfaceC5927mf0) {
        O90.f(interfaceC1331Qv0, "<this>");
        O90.f(interfaceC5927mf0, "p");
        return interfaceC1331Qv0.invoke();
    }
}
