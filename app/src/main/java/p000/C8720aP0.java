package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: aP0 */
/* loaded from: classes2.dex */
public final class C8720aP0 extends AbstractC11157tP0 implements InterfaceC11564wb0 {

    /* renamed from: a */
    public final Type f15491a;

    /* renamed from: b */
    public final AbstractC11157tP0 f15492b;

    /* renamed from: c */
    public final C0779MN f15493c;

    /* JADX WARN: Multi-variable type inference failed */
    public C8720aP0(Type type) {
        AbstractC11157tP0 c10901rP0;
        AbstractC11157tP0 c10901rP02;
        this.f15491a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    O90.m5967e(componentType, "getComponentType(...)");
                    c10901rP0 = componentType.isPrimitive() ? new C10901rP0(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C8720aP0(componentType) : componentType instanceof WildcardType ? new C11540wP0((WildcardType) componentType) : new C9749iP0(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        O90.m5967e(genericComponentType, "getGenericComponentType(...)");
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                c10901rP02 = new C10901rP0(cls2);
                this.f15492b = c10901rP02;
                this.f15493c = C0779MN.f7117a;
            }
        }
        c10901rP0 = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C8720aP0(genericComponentType) : genericComponentType instanceof WildcardType ? new C11540wP0((WildcardType) genericComponentType) : new C9749iP0(genericComponentType);
        c10901rP02 = c10901rP0;
        this.f15492b = c10901rP02;
        this.f15493c = C0779MN.f7117a;
    }

    @Override // p000.AbstractC11157tP0
    /* renamed from: b */
    public final Type mo9728b() {
        return this.f15491a;
    }

    @Override // p000.InterfaceC8302Ta0
    public final Collection getAnnotations() {
        return this.f15493c;
    }
}
