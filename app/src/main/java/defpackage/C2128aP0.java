package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: aP0 */
/* loaded from: classes2.dex */
public final class C2128aP0 extends AbstractC7215tP0 implements InterfaceC7823wb0 {
    public final Type a;
    public final AbstractC7215tP0 b;
    public final MN c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2128aP0(Type type) {
        AbstractC7215tP0 c6833rP0;
        AbstractC7215tP0 c6833rP02;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    O90.e(componentType, "getComponentType(...)");
                    c6833rP0 = componentType.isPrimitive() ? new C6833rP0(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C2128aP0(componentType) : componentType instanceof WildcardType ? new C7787wP0((WildcardType) componentType) : new C4339iP0(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        O90.e(genericComponentType, "getGenericComponentType(...)");
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                c6833rP02 = new C6833rP0(cls2);
                this.b = c6833rP02;
                this.c = MN.a;
            }
        }
        c6833rP0 = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C2128aP0(genericComponentType) : genericComponentType instanceof WildcardType ? new C7787wP0((WildcardType) genericComponentType) : new C4339iP0(genericComponentType);
        c6833rP02 = c6833rP0;
        this.b = c6833rP02;
        this.c = MN.a;
    }

    @Override // defpackage.AbstractC7215tP0
    public final Type b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final Collection getAnnotations() {
        return this.c;
    }
}
