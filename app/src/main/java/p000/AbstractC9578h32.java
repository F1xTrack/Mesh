package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: h32 */
/* loaded from: classes.dex */
public abstract class AbstractC9578h32 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final InterfaceC8412Vd0 m18711a(InterfaceC9779ie0 interfaceC9779ie0) {
        InterfaceC6976us interfaceC6976us;
        if (interfaceC9779ie0 instanceof InterfaceC8412Vd0) {
            return (InterfaceC8412Vd0) interfaceC9779ie0;
        }
        if (!(interfaceC9779ie0 instanceof InterfaceC11699xf0)) {
            throw new C1131Rz("Cannot calculate JVM erasure for type: " + interfaceC9779ie0, 1);
        }
        InterfaceC10293mf0 interfaceC10293mf0 = C11826yf0.f46379d[0];
        Object objInvoke = ((C11826yf0) ((InterfaceC11699xf0) interfaceC9779ie0)).f46381b.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        List list = (List) objInvoke;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC11317uf0 interfaceC11317uf0 = (InterfaceC11317uf0) next;
            O90.m5966d(interfaceC11317uf0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC0873Ns interfaceC0873NsMo1962a = ((C11572wf0) interfaceC11317uf0).f45016a.mo3797E().mo1962a();
            interfaceC6976us = interfaceC0873NsMo1962a instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1962a : null;
            if (interfaceC6976us != null && interfaceC6976us.mo1436l() != EnumC0118Bs.f1061b && interfaceC6976us.mo1436l() != EnumC0118Bs.f1064e) {
                interfaceC6976us = next;
                break;
            }
        }
        InterfaceC11317uf0 interfaceC11317uf02 = (InterfaceC11317uf0) interfaceC6976us;
        if (interfaceC11317uf02 == null) {
            interfaceC11317uf02 = (InterfaceC11317uf0) AbstractC7167xu.m25957C(list);
        }
        return interfaceC11317uf02 != null ? m18712b(interfaceC11317uf02) : BP0.f799a.mo3846b(Object.class);
    }

    /* renamed from: b */
    public static final InterfaceC8412Vd0 m18712b(InterfaceC11317uf0 interfaceC11317uf0) {
        InterfaceC9779ie0 interfaceC9779ie0Mo8539i = interfaceC11317uf0.mo8539i();
        if (interfaceC9779ie0Mo8539i != null) {
            return m18711a(interfaceC9779ie0Mo8539i);
        }
        throw new C1131Rz("Cannot calculate JVM erasure for type: " + interfaceC11317uf0, 1);
    }
}
