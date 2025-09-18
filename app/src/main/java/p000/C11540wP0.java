package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: wP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11540wP0 extends AbstractC11157tP0 implements InterfaceC11564wb0 {

    /* renamed from: a */
    public final WildcardType f44859a;

    public C11540wP0(WildcardType wildcardType) {
        this.f44859a = wildcardType;
    }

    @Override // p000.AbstractC11157tP0
    /* renamed from: b */
    public final Type mo9728b() {
        return this.f44859a;
    }

    /* renamed from: c */
    public final AbstractC11157tP0 m25615c() {
        AbstractC11157tP0 c8720aP0;
        WildcardType wildcardType = this.f44859a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length != 1) {
            if (upperBounds.length == 1) {
                Type type = (Type) AbstractC0576J8.m4198y(upperBounds);
                if (!O90.m5963a(type, Object.class)) {
                    O90.m5965c(type);
                    boolean z = type instanceof Class;
                    if (z) {
                        Class cls = (Class) type;
                        if (cls.isPrimitive()) {
                            return new C10901rP0(cls);
                        }
                    }
                    c8720aP0 = ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C8720aP0(type) : type instanceof WildcardType ? new C11540wP0((WildcardType) type) : new C9749iP0(type);
                }
            }
            return null;
        }
        Object objM4198y = AbstractC0576J8.m4198y(lowerBounds);
        O90.m5967e(objM4198y, "single(...)");
        Type type2 = (Type) objM4198y;
        boolean z2 = type2 instanceof Class;
        if (z2) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new C10901rP0(cls2);
            }
        }
        c8720aP0 = ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new C8720aP0(type2) : type2 instanceof WildcardType ? new C11540wP0((WildcardType) type2) : new C9749iP0(type2);
        return c8720aP0;
    }

    @Override // p000.InterfaceC8302Ta0
    public final Collection getAnnotations() {
        return C0779MN.f7117a;
    }
}
