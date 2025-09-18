package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: rn1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6906rn1 implements WildcardType, Type {
    public static final C6906rn1 c = new C6906rn1(null, null);
    public final Type a;
    public final Type b;

    public C6906rn1(Type type, Type type2) {
        this.a = type;
        this.b = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.b;
        if (type != null) {
            return "? super " + AbstractC1437Se1.a(type);
        }
        Type type2 = this.a;
        if (type2 == null || O90.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC1437Se1.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
