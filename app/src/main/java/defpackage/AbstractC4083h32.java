package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: h32 */
/* loaded from: classes.dex */
public abstract class AbstractC4083h32 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1667Vd0 a(InterfaceC4384ie0 interfaceC4384ie0) {
        InterfaceC7492us interfaceC7492us;
        if (interfaceC4384ie0 instanceof InterfaceC1667Vd0) {
            return (InterfaceC1667Vd0) interfaceC4384ie0;
        }
        if (!(interfaceC4384ie0 instanceof InterfaceC8025xf0)) {
            throw new C1420Rz("Cannot calculate JVM erasure for type: " + interfaceC4384ie0, 1);
        }
        InterfaceC5927mf0 interfaceC5927mf0 = C8215yf0.d[0];
        Object objInvoke = ((C8215yf0) ((InterfaceC8025xf0) interfaceC4384ie0)).b.invoke();
        O90.e(objInvoke, "getValue(...)");
        List list = (List) objInvoke;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC7454uf0 interfaceC7454uf0 = (InterfaceC7454uf0) next;
            O90.d(interfaceC7454uf0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC1087Ns interfaceC1087NsA = ((C7835wf0) interfaceC7454uf0).a.E().a();
            interfaceC7492us = interfaceC1087NsA instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsA : null;
            if (interfaceC7492us != null && interfaceC7492us.l() != EnumC0152Bs.b && interfaceC7492us.l() != EnumC0152Bs.e) {
                interfaceC7492us = next;
                break;
            }
        }
        InterfaceC7454uf0 interfaceC7454uf02 = (InterfaceC7454uf0) interfaceC7492us;
        if (interfaceC7454uf02 == null) {
            interfaceC7454uf02 = (InterfaceC7454uf0) AbstractC8069xu.C(list);
        }
        return interfaceC7454uf02 != null ? b(interfaceC7454uf02) : BP0.a.b(Object.class);
    }

    public static final InterfaceC1667Vd0 b(InterfaceC7454uf0 interfaceC7454uf0) {
        InterfaceC4384ie0 interfaceC4384ie0I = interfaceC7454uf0.i();
        if (interfaceC4384ie0I != null) {
            return a(interfaceC4384ie0I);
        }
        throw new C1420Rz("Cannot calculate JVM erasure for type: " + interfaceC7454uf0, 1);
    }
}
