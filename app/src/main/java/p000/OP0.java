package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class OP0 {

    /* renamed from: a */
    public static final NP1 f8436a;

    static {
        NP1 kp0;
        try {
            kp0 = new MP0();
        } catch (NoSuchMethodException unused) {
            kp0 = new KP0();
        }
        f8436a = kp0;
    }

    /* renamed from: a */
    public static void m6062a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    /* renamed from: b */
    public static String m6063b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m6062a(constructor, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m6064c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* renamed from: d */
    public static String m6065d(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m6064c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m6062a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m6063b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* renamed from: e */
    public static void m6066e(AccessibleObject accessibleObject) throws SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new C10799qc0(AbstractC7222ym.m26234k("Failed making ", m6065d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e);
        }
    }
}
