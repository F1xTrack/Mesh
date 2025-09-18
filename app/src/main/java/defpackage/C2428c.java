package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* renamed from: c */
/* loaded from: classes2.dex */
public final class C2428c implements WildcardType, Serializable {
    public final /* synthetic */ int a;
    public final Type b;
    public final Type c;

    public C2428c(Type[] typeArr, Type[] typeArr2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                IL1.b(typeArr2.length <= 1);
                IL1.b(typeArr.length == 1);
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    AbstractC6960s4.b(typeArr[0]);
                    this.c = null;
                    this.b = AbstractC6960s4.a(typeArr[0]);
                    break;
                } else {
                    Objects.requireNonNull(typeArr2[0]);
                    AbstractC6960s4.b(typeArr2[0]);
                    IL1.b(typeArr[0] == Object.class);
                    this.c = AbstractC6960s4.a(typeArr2[0]);
                    this.b = Object.class;
                    break;
                }
            default:
                FL1.b(typeArr2.length <= 1);
                FL1.b(typeArr.length == 1);
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    AbstractC1717Vu.c(typeArr[0]);
                    this.c = null;
                    this.b = AbstractC1717Vu.b(typeArr[0]);
                    break;
                } else {
                    Objects.requireNonNull(typeArr2[0]);
                    AbstractC1717Vu.c(typeArr2[0]);
                    FL1.b(typeArr[0] == Object.class);
                    this.c = AbstractC1717Vu.b(typeArr2[0]);
                    this.b = Object.class;
                    break;
                }
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof WildcardType) || !AbstractC1717Vu.f(this, (WildcardType) obj)) {
                }
                break;
            default:
                if (!(obj instanceof WildcardType) || !AbstractC6960s4.c(this, (WildcardType) obj)) {
                }
                break;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        switch (this.a) {
            case 0:
                Type type = this.c;
                return type != null ? new Type[]{type} : AbstractC1717Vu.b;
            default:
                Type type2 = this.c;
                return type2 != null ? new Type[]{type2} : AbstractC6960s4.b;
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.b;
        switch (this.a) {
            case 0:
                return new Type[]{type};
            default:
                return new Type[]{type};
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                Type type = this.c;
                return (type != null ? type.hashCode() + 31 : 1) ^ (this.b.hashCode() + 31);
            default:
                Type type2 = this.c;
                return (type2 != null ? type2.hashCode() + 31 : 1) ^ (this.b.hashCode() + 31);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                Type type = this.c;
                if (type != null) {
                    return "? super " + AbstractC1717Vu.q(type);
                }
                Type type2 = this.b;
                if (type2 == Object.class) {
                    return "?";
                }
                return "? extends " + AbstractC1717Vu.q(type2);
            default:
                Type type3 = this.c;
                if (type3 != null) {
                    return "? super " + AbstractC6960s4.i(type3);
                }
                Type type4 = this.b;
                if (type4 == Object.class) {
                    return "?";
                }
                return "? extends " + AbstractC6960s4.i(type4);
        }
    }
}
