package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9088dE1 {

    /* renamed from: a */
    public static final C11238u21 f25894a = new C11238u21(2);

    /* renamed from: b */
    public static final C10598p21 f25895b = new C10598p21(1);

    /* renamed from: a */
    public static void m17509a(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC11153tN0.m24909u(i2, "at index "));
            }
        }
    }

    /* renamed from: b */
    public static BD1 m17510b() {
        String str;
        ClassLoader classLoader = AbstractC9088dE1.class.getClassLoader();
        if (BD1.class.equals(BD1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!BD1.class.getPackage().equals(AbstractC9088dE1.class.getPackage())) {
                throw new IllegalArgumentException(BD1.class.getName());
            }
            str = BD1.class.getPackage().getName() + ".BlazeGenerated" + BD1.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    AbstractC1374Vq.m8597p(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e) {
                    throw new IllegalStateException(e);
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC9088dE1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(C9854jD1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(BD1.class.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (BD1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (BD1) BD1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
