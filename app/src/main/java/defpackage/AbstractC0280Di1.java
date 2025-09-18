package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Di1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0280Di1 {
    public final C7925x8 a;
    public final C7925x8 b;
    public final C7925x8 c;

    public AbstractC0280Di1(C7925x8 c7925x8, C7925x8 c7925x82, C7925x8 c7925x83) {
        this.a = c7925x8;
        this.b = c7925x82;
        this.c = c7925x83;
    }

    public abstract C0358Ei1 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C7925x8 c7925x8 = this.c;
        Class cls2 = (Class) c7925x8.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c7925x8.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        C7925x8 c7925x8 = this.a;
        Method method = (Method) c7925x8.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0280Di1.class.getClassLoader()).getDeclaredMethod("read", AbstractC0280Di1.class);
        c7925x8.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C7925x8 c7925x8 = this.b;
        Method method = (Method) c7925x8.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, AbstractC0280Di1.class);
        c7925x8.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((C0358Ei1) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((C0358Ei1) this).e.readParcelable(C0358Ei1.class.getClassLoader());
    }

    public final InterfaceC0436Fi1 h() {
        String string = ((C0358Ei1) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC0436Fi1) c(string).invoke(null, a());
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

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((C0358Ei1) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((C0358Ei1) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(InterfaceC0436Fi1 interfaceC0436Fi1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC0436Fi1 == null) {
            ((C0358Ei1) this).e.writeString(null);
            return;
        }
        try {
            ((C0358Ei1) this).e.writeString(b(interfaceC0436Fi1.getClass()).getName());
            C0358Ei1 c0358Ei1A = a();
            try {
                d(interfaceC0436Fi1.getClass()).invoke(null, interfaceC0436Fi1, c0358Ei1A);
                int i = c0358Ei1A.i;
                if (i >= 0) {
                    int i2 = c0358Ei1A.d.get(i);
                    Parcel parcel = c0358Ei1A.e;
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
            throw new RuntimeException(interfaceC0436Fi1.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
