package p000;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* renamed from: c */
/* loaded from: classes2.dex */
public final class C1819c implements WildcardType, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f17251a;

    /* renamed from: b */
    public final Type f17252b;

    /* renamed from: c */
    public final Type f17253c;

    public C1819c(Type[] typeArr, Type[] typeArr2, int i) {
        this.f17251a = i;
        switch (i) {
            case 1:
                IL1.m3828b(typeArr2.length <= 1);
                IL1.m3828b(typeArr.length == 1);
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    AbstractC6800s4.m24603b(typeArr[0]);
                    this.f17253c = null;
                    this.f17252b = AbstractC6800s4.m24602a(typeArr[0]);
                    break;
                } else {
                    Objects.requireNonNull(typeArr2[0]);
                    AbstractC6800s4.m24603b(typeArr2[0]);
                    IL1.m3828b(typeArr[0] == Object.class);
                    this.f17253c = AbstractC6800s4.m24602a(typeArr2[0]);
                    this.f17252b = Object.class;
                    break;
                }
            default:
                FL1.m2583b(typeArr2.length <= 1);
                FL1.m2583b(typeArr.length == 1);
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    AbstractC1378Vu.m8618c(typeArr[0]);
                    this.f17253c = null;
                    this.f17252b = AbstractC1378Vu.m8617b(typeArr[0]);
                    break;
                } else {
                    Objects.requireNonNull(typeArr2[0]);
                    AbstractC1378Vu.m8618c(typeArr2[0]);
                    FL1.m2583b(typeArr[0] == Object.class);
                    this.f17253c = AbstractC1378Vu.m8617b(typeArr2[0]);
                    this.f17252b = Object.class;
                    break;
                }
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f17251a) {
            case 0:
                if (!(obj instanceof WildcardType) || !AbstractC1378Vu.m8621f(this, (WildcardType) obj)) {
                }
                break;
            default:
                if (!(obj instanceof WildcardType) || !AbstractC6800s4.m24604c(this, (WildcardType) obj)) {
                }
                break;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        switch (this.f17251a) {
            case 0:
                Type type = this.f17253c;
                return type != null ? new Type[]{type} : AbstractC1378Vu.f12855b;
            default:
                Type type2 = this.f17253c;
                return type2 != null ? new Type[]{type2} : AbstractC6800s4.f42244b;
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f17252b;
        switch (this.f17251a) {
            case 0:
                return new Type[]{type};
            default:
                return new Type[]{type};
        }
    }

    public final int hashCode() {
        switch (this.f17251a) {
            case 0:
                Type type = this.f17253c;
                return (type != null ? type.hashCode() + 31 : 1) ^ (this.f17252b.hashCode() + 31);
            default:
                Type type2 = this.f17253c;
                return (type2 != null ? type2.hashCode() + 31 : 1) ^ (this.f17252b.hashCode() + 31);
        }
    }

    public final String toString() {
        switch (this.f17251a) {
            case 0:
                Type type = this.f17253c;
                if (type != null) {
                    return "? super " + AbstractC1378Vu.m8632q(type);
                }
                Type type2 = this.f17252b;
                if (type2 == Object.class) {
                    return "?";
                }
                return "? extends " + AbstractC1378Vu.m8632q(type2);
            default:
                Type type3 = this.f17253c;
                if (type3 != null) {
                    return "? super " + AbstractC6800s4.m24610i(type3);
                }
                Type type4 = this.f17252b;
                if (type4 == Object.class) {
                    return "?";
                }
                return "? extends " + AbstractC6800s4.m24610i(type4);
        }
    }
}
