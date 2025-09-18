package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class D00 implements GenericArrayType, Type {

    /* renamed from: a */
    public final Type f1797a;

    public D00(Type type) {
        O90.m5968f(type, "elementType");
        this.f1797a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (O90.m5963a(this.f1797a, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f1797a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC8259Se1.m7402a(this.f1797a) + "[]";
    }

    public final int hashCode() {
        return this.f1797a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
