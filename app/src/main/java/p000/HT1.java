package p000;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class HT1 {
    /* renamed from: a */
    public static InterfaceC10736q61 m3451a(InterfaceC10736q61 interfaceC10736q61) {
        if ((interfaceC10736q61 instanceof C11120t61) || (interfaceC10736q61 instanceof C10992s61)) {
            return interfaceC10736q61;
        }
        if (interfaceC10736q61 instanceof Serializable) {
            return new C10992s61(interfaceC10736q61);
        }
        C11120t61 c11120t61 = new C11120t61();
        c11120t61.f42837a = interfaceC10736q61;
        return c11120t61;
    }

    /* renamed from: b */
    public static final Object m3452b(Object obj) {
        return obj instanceof C6519nv ? RQ1.m7015b(((C6519nv) obj).f38606a) : obj;
    }
}
