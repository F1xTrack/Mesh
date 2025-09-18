package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: wP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7787wP0 extends AbstractC7215tP0 implements InterfaceC7823wb0 {
    public final WildcardType a;

    public C7787wP0(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // defpackage.AbstractC7215tP0
    public final Type b() {
        return this.a;
    }

    public final AbstractC7215tP0 c() {
        AbstractC7215tP0 c2128aP0;
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length != 1) {
            if (upperBounds.length == 1) {
                Type type = (Type) J8.y(upperBounds);
                if (!O90.a(type, Object.class)) {
                    O90.c(type);
                    boolean z = type instanceof Class;
                    if (z) {
                        Class cls = (Class) type;
                        if (cls.isPrimitive()) {
                            return new C6833rP0(cls);
                        }
                    }
                    c2128aP0 = ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C2128aP0(type) : type instanceof WildcardType ? new C7787wP0((WildcardType) type) : new C4339iP0(type);
                }
            }
            return null;
        }
        Object objY = J8.y(lowerBounds);
        O90.e(objY, "single(...)");
        Type type2 = (Type) objY;
        boolean z2 = type2 instanceof Class;
        if (z2) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new C6833rP0(cls2);
            }
        }
        c2128aP0 = ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new C2128aP0(type2) : type2 instanceof WildcardType ? new C7787wP0((WildcardType) type2) : new C4339iP0(type2);
        return c2128aP0;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final Collection getAnnotations() {
        return MN.a;
    }
}
