package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class PP0 {

    /* renamed from: a */
    public static final QP1 f9065a;

    static {
        QP1 lp0;
        try {
            lp0 = new NP0();
        } catch (NoSuchMethodException unused) {
            lp0 = new LP0();
        }
        f9065a = lp0;
    }

    /* renamed from: a */
    public static void m6359a(AccessibleObject accessibleObject, StringBuilder sb) {
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
    public static String m6360b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m6359a(constructor, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m6361c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* renamed from: d */
    public static String m6362d(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m6361c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m6359a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m6360b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* renamed from: e */
    public static void m6363e(AccessibleObject accessibleObject) throws SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new C6838sg(AbstractC7222ym.m26234k("Failed making ", m6362d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e);
        }
    }
}
