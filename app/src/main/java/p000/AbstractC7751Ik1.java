package p000;

import java.util.HashMap;

/* renamed from: Ik1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7751Ik1 {

    /* renamed from: a */
    public static final HashMap f5122a = new HashMap();

    /* renamed from: b */
    public static final HashMap f5123b = new HashMap();

    /* renamed from: a */
    public static void m3995a() {
        AbstractC8323Tk1.f11493a.clear();
        AbstractC8323Tk1.f11494b.clear();
        f5122a.clear();
        f5123b.clear();
    }

    /* renamed from: b */
    public static Object m3996b(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(name.concat("$$PropsSetter")).newInstance();
        } catch (ClassNotFoundException unused) {
            cls.toString();
            AbstractC3929dS.m17683p("ViewManagerPropertyUpdater");
            return null;
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException("Unable to instantiate methods getter for ".concat(name), e);
        } catch (InstantiationException e2) {
            e = e2;
            throw new RuntimeException("Unable to instantiate methods getter for ".concat(name), e);
        }
    }

    /* renamed from: c */
    public static C7699Hk1 m3997c(Class cls) {
        HashMap map = f5122a;
        C7699Hk1 c7699Hk1 = (C7699Hk1) map.get(cls);
        if (c7699Hk1 == null) {
            c7699Hk1 = (C7699Hk1) m3996b(cls);
            if (c7699Hk1 == null) {
                c7699Hk1 = new C7699Hk1(cls);
            }
            map.put(cls, c7699Hk1);
        }
        return c7699Hk1;
    }

    /* renamed from: d */
    public static C7647Gk1 m3998d(Class cls) {
        HashMap map = f5123b;
        C7647Gk1 c7647Gk1 = (C7647Gk1) map.get(cls);
        if (c7647Gk1 == null) {
            c7647Gk1 = (C7647Gk1) m3996b(cls);
            if (c7647Gk1 == null) {
                c7647Gk1 = new C7647Gk1(cls);
            }
            map.put(cls, c7647Gk1);
        }
        return c7647Gk1;
    }
}
