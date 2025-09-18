package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class HT1 {
    public static InterfaceC6587q61 a(InterfaceC6587q61 interfaceC6587q61) {
        if ((interfaceC6587q61 instanceof C7159t61) || (interfaceC6587q61 instanceof C6968s61)) {
            return interfaceC6587q61;
        }
        if (interfaceC6587q61 instanceof Serializable) {
            return new C6968s61(interfaceC6587q61);
        }
        C7159t61 c7159t61 = new C7159t61();
        c7159t61.a = interfaceC6587q61;
        return c7159t61;
    }

    public static final Object b(Object obj) {
        return obj instanceof C6165nv ? RQ1.b(((C6165nv) obj).a) : obj;
    }
}
