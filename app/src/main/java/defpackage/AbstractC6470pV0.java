package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: pV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6470pV0 {
    public static final List a = AbstractC8259yu.f(Application.class, C3975gV0.class);
    public static final List b = AbstractC8259yu.e(C3975gV0.class);

    public static final Constructor a(List list, Class cls) throws SecurityException {
        O90.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        O90.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            O90.e(parameterTypes, "constructor.parameterTypes");
            List listD = J8.D(parameterTypes);
            if (list.equals(listD)) {
                return constructor;
            }
            if (list.size() == listD.size() && listD.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final AbstractC1611Uk1 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC1611Uk1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AbstractC7209tN0.v(cls, "Failed to access "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(AbstractC7209tN0.v(cls, "An exception happened in constructor of "), e3.getCause());
        }
    }
}
