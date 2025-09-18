package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class BP0 {
    public static final IP0 a;

    static {
        IP0 ip0 = null;
        try {
            ip0 = (IP0) JP0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ip0 == null) {
            ip0 = new IP0();
        }
        a = ip0;
    }

    public static InterfaceC1667Vd0 a(Class cls) {
        return a.b(cls);
    }

    public static InterfaceC7454uf0 b(Class cls) {
        IP0 ip0 = a;
        return ip0.j(ip0.b(cls), Collections.emptyList(), true);
    }

    public static InterfaceC7454uf0 c(Class cls) {
        IP0 ip0 = a;
        return ip0.j(ip0.b(cls), Collections.emptyList(), false);
    }
}
