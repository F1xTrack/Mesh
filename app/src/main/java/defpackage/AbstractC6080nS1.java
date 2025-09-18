package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: nS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6080nS1 {
    public static final C3883g11 a(AbstractC2435c11 abstractC2435c11, InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2) {
        O90.f(interfaceC6099nZ, "onError");
        C3883g11 c3883g11 = new C3883g11(interfaceC6099nZ, interfaceC6099nZ2);
        abstractC2435c11.a(c3883g11);
        return c3883g11;
    }

    public static BR1 c() {
        String str;
        ClassLoader classLoader = AbstractC6080nS1.class.getClassLoader();
        if (BR1.class.equals(BR1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!BR1.class.getPackage().equals(AbstractC6080nS1.class.getPackage())) {
                throw new IllegalArgumentException(BR1.class.getName());
            }
            str = BR1.class.getPackage().getName() + ".BlazeGenerated" + BR1.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    AbstractC1705Vq.p(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
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
            Iterator it = ServiceLoader.load(AbstractC6080nS1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(C3964gR1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(BR1.class.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (BR1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (BR1) BR1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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
