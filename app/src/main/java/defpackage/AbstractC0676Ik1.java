package defpackage;

import java.util.HashMap;

/* renamed from: Ik1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0676Ik1 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a() {
        AbstractC1533Tk1.a.clear();
        AbstractC1533Tk1.b.clear();
        a.clear();
        b.clear();
    }

    public static Object b(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(name.concat("$$PropsSetter")).newInstance();
        } catch (ClassNotFoundException unused) {
            cls.toString();
            AbstractC3393dS.p("ViewManagerPropertyUpdater");
            return null;
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException("Unable to instantiate methods getter for ".concat(name), e);
        } catch (InstantiationException e2) {
            e = e2;
            throw new RuntimeException("Unable to instantiate methods getter for ".concat(name), e);
        }
    }

    public static C0598Hk1 c(Class cls) {
        HashMap map = a;
        C0598Hk1 c0598Hk1 = (C0598Hk1) map.get(cls);
        if (c0598Hk1 == null) {
            c0598Hk1 = (C0598Hk1) b(cls);
            if (c0598Hk1 == null) {
                c0598Hk1 = new C0598Hk1(cls);
            }
            map.put(cls, c0598Hk1);
        }
        return c0598Hk1;
    }

    public static C0520Gk1 d(Class cls) {
        HashMap map = b;
        C0520Gk1 c0520Gk1 = (C0520Gk1) map.get(cls);
        if (c0520Gk1 == null) {
            c0520Gk1 = (C0520Gk1) b(cls);
            if (c0520Gk1 == null) {
                c0520Gk1 = new C0520Gk1(cls);
            }
            map.put(cls, c0520Gk1);
        }
        return c0520Gk1;
    }
}
