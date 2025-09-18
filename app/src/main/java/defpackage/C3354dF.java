package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: dF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3354dF {
    public static InterfaceC6163nu0 a;

    public C3354dF(Class cls) {
    }

    public static void a(InterfaceC6163nu0 interfaceC6163nu0) {
        if (b()) {
            return;
        }
        synchronized (C3354dF.class) {
            try {
                if (a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                a = interfaceC6163nu0;
            } finally {
            }
        }
    }

    public static boolean b() {
        boolean z;
        synchronized (C3354dF.class) {
            z = a != null;
        }
        return z;
    }

    public static boolean c(String str) {
        InterfaceC6163nu0 interfaceC6163nu0;
        synchronized (C3354dF.class) {
            interfaceC6163nu0 = a;
            if (interfaceC6163nu0 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC6163nu0.j(str);
    }

    public static C10 d(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof C10) {
                    return (C10) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e) {
                e(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                e(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                e(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                e(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void e(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(AbstractC7209tN0.v(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
