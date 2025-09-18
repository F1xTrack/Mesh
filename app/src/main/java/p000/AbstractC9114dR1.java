package p000;

import java.lang.reflect.Method;

/* renamed from: dR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9114dR1 {
    /* renamed from: a */
    public static final String m17666a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        O90.m5967e(parameterTypes, "getParameterTypes(...)");
        sb.append(AbstractC0576J8.m4196w(parameterTypes, "", "(", ")", XS0.f13773i, 24));
        Class<?> returnType = method.getReturnType();
        O90.m5967e(returnType, "getReturnType(...)");
        sb.append(VO0.m8434b(returnType));
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m17667b(InterfaceC6766ro interfaceC6766ro) {
        O90.m5968f(interfaceC6766ro, "<this>");
        InterfaceC6766ro interfaceC6766ro2 = interfaceC6766ro instanceof InterfaceC6766ro ? interfaceC6766ro : null;
        if (interfaceC6766ro2 != null) {
            return interfaceC6766ro2.mo2393e();
        }
        return null;
    }
}
