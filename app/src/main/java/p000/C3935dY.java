package p000;

import androidx.fragment.app.AbstractC1733o;

/* renamed from: dY */
/* loaded from: classes.dex */
public final class C3935dY {

    /* renamed from: b */
    public static final L01 f26136b = new L01();

    /* renamed from: a */
    public final /* synthetic */ AbstractC1733o f26137a;

    public C3935dY(AbstractC1733o abstractC1733o) {
        this.f26137a = abstractC1733o;
    }

    /* renamed from: a */
    public static Class m17705a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        L01 l01 = f26136b;
        L01 l012 = (L01) l01.getOrDefault(classLoader, null);
        if (l012 == null) {
            l012 = new L01();
            l01.put(classLoader, l012);
        }
        Class cls = (Class) l012.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        l012.put(str, cls2);
        return cls2;
    }

    /* renamed from: b */
    public static Class m17706b(ClassLoader classLoader, String str) {
        try {
            return m17705a(classLoader, str);
        } catch (ClassCastException e) {
            throw new C6838sg(AbstractC7222ym.m26234k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C6838sg(AbstractC7222ym.m26234k("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
