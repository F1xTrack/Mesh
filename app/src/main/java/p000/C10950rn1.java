package p000;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: rn1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10950rn1 implements WildcardType, Type {

    /* renamed from: c */
    public static final C10950rn1 f41905c = new C10950rn1(null, null);

    /* renamed from: a */
    public final Type f41906a;

    /* renamed from: b */
    public final Type f41907b;

    public C10950rn1(Type type, Type type2) {
        this.f41906a = type;
        this.f41907b = type2;
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
        Type type = this.f41907b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f41907b;
        if (type != null) {
            return "? super " + AbstractC8259Se1.m7402a(type);
        }
        Type type2 = this.f41906a;
        if (type2 == null || O90.m5963a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC8259Se1.m7402a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f41906a;
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
