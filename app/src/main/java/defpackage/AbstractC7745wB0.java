package defpackage;

import java.lang.reflect.Method;

/* renamed from: wB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7745wB0 {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        O90.c(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (O90.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                O90.e(parameterTypes, "getParameterTypes(...)");
                if (O90.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !O90.a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
