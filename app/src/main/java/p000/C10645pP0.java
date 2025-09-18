package p000;

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
public final class C10645pP0 extends AbstractC10517oP0 implements InterfaceC7420Cb0 {

    /* renamed from: a */
    public final Method f40051a;

    public C10645pP0(Method method) {
        O90.m5968f(method, "member");
        this.f40051a = method;
    }

    @Override // p000.AbstractC10517oP0
    /* renamed from: b */
    public final Member mo22030b() {
        return this.f40051a;
    }

    /* renamed from: f */
    public final AbstractC11157tP0 m23772f() {
        Type genericReturnType = this.f40051a.getGenericReturnType();
        O90.m5967e(genericReturnType, "getGenericReturnType(...)");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C10901rP0(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new C8720aP0(genericReturnType) : genericReturnType instanceof WildcardType ? new C11540wP0((WildcardType) genericReturnType) : new C9749iP0(genericReturnType);
    }

    /* renamed from: g */
    public final List m23773g() {
        Method method = this.f40051a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        O90.m5967e(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        O90.m5967e(parameterAnnotations, "getParameterAnnotations(...)");
        return m23389d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // p000.InterfaceC7420Cb0
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f40051a.getTypeParameters();
        O90.m5967e(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C11285uP0(typeVariable));
        }
        return arrayList;
    }
}
