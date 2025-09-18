package p000;

import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class BP0 {

    /* renamed from: a */
    public static final IP0 f799a;

    static {
        IP0 ip0 = null;
        try {
            ip0 = (IP0) JP0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ip0 == null) {
            ip0 = new IP0();
        }
        f799a = ip0;
    }

    /* renamed from: a */
    public static InterfaceC8412Vd0 m713a(Class cls) {
        return f799a.mo3846b(cls);
    }

    /* renamed from: b */
    public static InterfaceC11317uf0 m714b(Class cls) {
        IP0 ip0 = f799a;
        return ip0.mo3854j(ip0.mo3846b(cls), Collections.emptyList(), true);
    }

    /* renamed from: c */
    public static InterfaceC11317uf0 m715c(Class cls) {
        IP0 ip0 = f799a;
        return ip0.mo3854j(ip0.mo3846b(cls), Collections.emptyList(), false);
    }
}
