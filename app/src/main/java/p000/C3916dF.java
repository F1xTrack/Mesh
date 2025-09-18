package p000;

import java.lang.reflect.InvocationTargetException;

/* renamed from: dF */
/* loaded from: classes2.dex */
public final class C3916dF {

    /* renamed from: a */
    public static InterfaceC10451nu0 f25896a;

    public C3916dF(Class cls) {
    }

    /* renamed from: a */
    public static void m17511a(InterfaceC10451nu0 interfaceC10451nu0) {
        if (m17512b()) {
            return;
        }
        synchronized (C3916dF.class) {
            try {
                if (f25896a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f25896a = interfaceC10451nu0;
            } finally {
            }
        }
    }

    /* renamed from: b */
    public static boolean m17512b() {
        boolean z;
        synchronized (C3916dF.class) {
            z = f25896a != null;
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m17513c(String str) {
        InterfaceC10451nu0 interfaceC10451nu0;
        synchronized (C3916dF.class) {
            interfaceC10451nu0 = f25896a;
            if (interfaceC10451nu0 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC10451nu0.mo2830j(str);
    }

    /* renamed from: d */
    public static C10 m17514d(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof C10) {
                    return (C10) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e) {
                m17515e(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m17515e(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m17515e(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m17515e(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: e */
    public static void m17515e(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
