package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: pV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10657pV0 {

    /* renamed from: a */
    public static final List f40126a = AbstractC7230yu.m26275f(Application.class, C9505gV0.class);

    /* renamed from: b */
    public static final List f40127b = AbstractC7230yu.m26274e(C9505gV0.class);

    /* renamed from: a */
    public static final Constructor m23810a(List list, Class cls) throws SecurityException {
        O90.m5968f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        O90.m5967e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            O90.m5967e(parameterTypes, "constructor.parameterTypes");
            List listM4173D = AbstractC0576J8.m4173D(parameterTypes);
            if (list.equals(listM4173D)) {
                return constructor;
            }
            if (list.size() == listM4173D.size() && listM4173D.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC8375Uk1 m23811b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC8375Uk1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "Failed to access "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(AbstractC11153tN0.m24910v(cls, "An exception happened in constructor of "), e3.getCause());
        }
    }
}
