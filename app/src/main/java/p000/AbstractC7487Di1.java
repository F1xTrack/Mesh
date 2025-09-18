package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Di1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7487Di1 {

    /* renamed from: a */
    public final C7119x8 f2184a;

    /* renamed from: b */
    public final C7119x8 f2185b;

    /* renamed from: c */
    public final C7119x8 f2186c;

    public AbstractC7487Di1(C7119x8 c7119x8, C7119x8 c7119x82, C7119x8 c7119x83) {
        this.f2184a = c7119x8;
        this.f2185b = c7119x82;
        this.f2186c = c7119x83;
    }

    /* renamed from: a */
    public abstract C7539Ei1 mo1845a();

    /* renamed from: b */
    public final Class m1846b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C7119x8 c7119x8 = this.f2186c;
        Class cls2 = (Class) c7119x8.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c7119x8.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m1847c(String str) throws NoSuchMethodException, SecurityException {
        C7119x8 c7119x8 = this.f2184a;
        Method method = (Method) c7119x8.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC7487Di1.class.getClassLoader()).getDeclaredMethod("read", AbstractC7487Di1.class);
        c7119x8.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final Method m1848d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C7119x8 c7119x8 = this.f2185b;
        Method method = (Method) c7119x8.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM1846b = m1846b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM1846b.getDeclaredMethod("write", cls, AbstractC7487Di1.class);
        c7119x8.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo1849e(int i);

    /* renamed from: f */
    public final int m1850f(int i, int i2) {
        return !mo1849e(i2) ? i : ((C7539Ei1) this).f2847e.readInt();
    }

    /* renamed from: g */
    public final Parcelable m1851g(Parcelable parcelable, int i) {
        if (!mo1849e(i)) {
            return parcelable;
        }
        return ((C7539Ei1) this).f2847e.readParcelable(C7539Ei1.class.getClassLoader());
    }

    /* renamed from: h */
    public final InterfaceC7591Fi1 m1852h() {
        String string = ((C7539Ei1) this).f2847e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC7591Fi1) m1847c(string).invoke(null, mo1845a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: i */
    public abstract void mo1853i(int i);

    /* renamed from: j */
    public final void m1854j(int i, int i2) {
        mo1853i(i2);
        ((C7539Ei1) this).f2847e.writeInt(i);
    }

    /* renamed from: k */
    public final void m1855k(Parcelable parcelable, int i) {
        mo1853i(i);
        ((C7539Ei1) this).f2847e.writeParcelable(parcelable, 0);
    }

    /* renamed from: l */
    public final void m1856l(InterfaceC7591Fi1 interfaceC7591Fi1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC7591Fi1 == null) {
            ((C7539Ei1) this).f2847e.writeString(null);
            return;
        }
        try {
            ((C7539Ei1) this).f2847e.writeString(m1846b(interfaceC7591Fi1.getClass()).getName());
            C7539Ei1 c7539Ei1Mo1845a = mo1845a();
            try {
                m1848d(interfaceC7591Fi1.getClass()).invoke(null, interfaceC7591Fi1, c7539Ei1Mo1845a);
                int i = c7539Ei1Mo1845a.f2851i;
                if (i >= 0) {
                    int i2 = c7539Ei1Mo1845a.f2846d.get(i);
                    Parcel parcel = c7539Ei1Mo1845a.f2847e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC7591Fi1.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
