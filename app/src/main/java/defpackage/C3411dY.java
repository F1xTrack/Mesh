package defpackage;

import androidx.fragment.app.o;

/* renamed from: dY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3411dY {
    public static final L01 b = new L01();
    public final /* synthetic */ o a;

    public C3411dY(o oVar) {
        this.a = oVar;
    }

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        L01 l01 = b;
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

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e) {
            throw new C7074sg(AbstractC8235ym.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C7074sg(AbstractC8235ym.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
