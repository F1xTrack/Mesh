package p000;

import java.lang.reflect.Method;

/* renamed from: wB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11512wB0 {

    /* renamed from: a */
    public static final Method f44703a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        O90.m5965c(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (O90.m5963a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                O90.m5967e(parameterTypes, "getParameterTypes(...)");
                if (O90.m5963a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f44703a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !O90.m5963a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
