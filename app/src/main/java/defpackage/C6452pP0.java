package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6452pP0 extends AbstractC6261oP0 implements InterfaceC0180Cb0 {
    public final Method a;

    public C6452pP0(Method method) {
        O90.f(method, "member");
        this.a = method;
    }

    @Override // defpackage.AbstractC6261oP0
    public final Member b() {
        return this.a;
    }

    public final AbstractC7215tP0 f() {
        Type genericReturnType = this.a.getGenericReturnType();
        O90.e(genericReturnType, "getGenericReturnType(...)");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C6833rP0(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new C2128aP0(genericReturnType) : genericReturnType instanceof WildcardType ? new C7787wP0((WildcardType) genericReturnType) : new C4339iP0(genericReturnType);
    }

    public final List g() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        O90.e(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        O90.e(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // defpackage.InterfaceC0180Cb0
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        O90.e(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C7406uP0(typeVariable));
        }
        return arrayList;
    }
}
