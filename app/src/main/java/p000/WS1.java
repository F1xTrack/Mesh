package p000;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class WS1 {
    /* renamed from: a */
    public static final void m8762a(InterfaceC6976us interfaceC6976us, LinkedHashSet linkedHashSet, InterfaceC10059kq0 interfaceC10059kq0, boolean z) {
        for (InterfaceC0140CD interfaceC0140CD : AbstractC11797yQ1.m26148a(interfaceC10059kq0, C4233iI.f29060o, 2)) {
            if (interfaceC0140CD instanceof InterfaceC6976us) {
                InterfaceC6976us interfaceC6976usM8392y1 = (InterfaceC6976us) interfaceC0140CD;
                if (interfaceC6976usM8392y1.mo111M()) {
                    C8340Tt0 name = interfaceC6976usM8392y1.getName();
                    O90.m5967e(name, "getName(...)");
                    InterfaceC0873Ns interfaceC0873NsMo1770c = interfaceC10059kq0.mo1770c(name, EnumC11985zv0.f47097d);
                    interfaceC6976usM8392y1 = interfaceC0873NsMo1770c instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1770c : interfaceC0873NsMo1770c instanceof InterfaceC7633Gd1 ? ((C1340VI) ((InterfaceC7633Gd1) interfaceC0873NsMo1770c)).m8392y1() : null;
                }
                if (interfaceC6976usM8392y1 == null) {
                    continue;
                } else {
                    if (interfaceC6976us == null) {
                        AbstractC6814sI.m24689a(27);
                        throw null;
                    }
                    int i = AbstractC6814sI.f42360a;
                    Iterator it = interfaceC6976usM8392y1.mo1439v().mo5276b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC6814sI.m24704p((AbstractC7742Ig0) it.next(), interfaceC6976us.mo2089x1())) {
                                linkedHashSet.add(interfaceC6976usM8392y1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        InterfaceC10059kq0 interfaceC10059kq0Mo1486I0 = interfaceC6976usM8392y1.mo1486I0();
                        O90.m5967e(interfaceC10059kq0Mo1486I0, "getUnsubstitutedInnerClassesScope(...)");
                        m8762a(interfaceC6976us, linkedHashSet, interfaceC10059kq0Mo1486I0, z);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static final Object m8763b(InterfaceC8188Qv0 interfaceC8188Qv0, InterfaceC10293mf0 interfaceC10293mf0) {
        O90.m5968f(interfaceC8188Qv0, "<this>");
        O90.m5968f(interfaceC10293mf0, "p");
        return interfaceC8188Qv0.invoke();
    }
}
