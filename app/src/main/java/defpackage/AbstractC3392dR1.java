package defpackage;

import java.lang.reflect.Method;

/* renamed from: dR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3392dR1 {
    public static final String a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        O90.e(parameterTypes, "getParameterTypes(...)");
        sb.append(J8.w(parameterTypes, "", "(", ")", XS0.i, 24));
        Class<?> returnType = method.getReturnType();
        O90.e(returnType, "getReturnType(...)");
        sb.append(VO0.b(returnType));
        return sb.toString();
    }

    public static final String b(InterfaceC6907ro interfaceC6907ro) {
        O90.f(interfaceC6907ro, "<this>");
        InterfaceC6907ro interfaceC6907ro2 = interfaceC6907ro instanceof InterfaceC6907ro ? interfaceC6907ro : null;
        if (interfaceC6907ro2 != null) {
            return interfaceC6907ro2.e();
        }
        return null;
    }
}
