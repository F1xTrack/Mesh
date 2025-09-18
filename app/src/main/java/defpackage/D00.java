package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class D00 implements GenericArrayType, Type {
    public final Type a;

    public D00(Type type) {
        O90.f(type, "elementType");
        this.a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (O90.a(this.a, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC1437Se1.a(this.a) + "[]";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
