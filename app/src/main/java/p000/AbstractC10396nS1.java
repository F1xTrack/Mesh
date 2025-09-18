package p000;

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
public abstract class AbstractC10396nS1 {
    /* renamed from: a */
    public static final C9443g11 m23145a(AbstractC8926c11 abstractC8926c11, InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2) {
        O90.m5968f(interfaceC6497nZ, "onError");
        C9443g11 c9443g11 = new C9443g11(interfaceC6497nZ, interfaceC6497nZ2);
        abstractC8926c11.mo10562a(c9443g11);
        return c9443g11;
    }

    /* renamed from: c */
    public static BR1 m23147c() {
        String str;
        ClassLoader classLoader = AbstractC10396nS1.class.getClassLoader();
        if (BR1.class.equals(BR1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!BR1.class.getPackage().equals(AbstractC10396nS1.class.getPackage())) {
                throw new IllegalArgumentException(BR1.class.getName());
            }
            str = BR1.class.getPackage().getName() + ".BlazeGenerated" + BR1.class.getSimpleName() + "Loader";
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
            Iterator it = ServiceLoader.load(AbstractC10396nS1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(C9498gR1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(BR1.class.getSimpleName()), (Throwable) e5);
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
