package p000;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: b */
/* loaded from: classes2.dex */
public final class C1757b implements ParameterizedType, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f16696a;

    /* renamed from: b */
    public final Type f16697b;

    /* renamed from: c */
    public final Type f16698c;

    /* renamed from: d */
    public final Type[] f16699d;

    public C1757b(Type type, Type type2, Type[] typeArr, int i) {
        this.f16696a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(type2);
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    boolean z = true;
                    boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                    if (type == null && !z2) {
                        z = false;
                    }
                    IL1.m3828b(z);
                }
                this.f16697b = type == null ? null : AbstractC6800s4.m24602a(type);
                this.f16698c = AbstractC6800s4.m24602a(type2);
                Type[] typeArr2 = (Type[]) typeArr.clone();
                this.f16699d = typeArr2;
                int length = typeArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Objects.requireNonNull(this.f16699d[i2]);
                    AbstractC6800s4.m24603b(this.f16699d[i2]);
                    Type[] typeArr3 = this.f16699d;
                    typeArr3[i2] = AbstractC6800s4.m24602a(typeArr3[i2]);
                }
                break;
            default:
                Objects.requireNonNull(type2);
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    boolean z3 = true;
                    boolean z4 = Modifier.isStatic(cls2.getModifiers()) || cls2.getEnclosingClass() == null;
                    if (type == null && !z4) {
                        z3 = false;
                    }
                    FL1.m2583b(z3);
                }
                this.f16697b = type == null ? null : AbstractC1378Vu.m8617b(type);
                this.f16698c = AbstractC1378Vu.m8617b(type2);
                Type[] typeArr4 = (Type[]) typeArr.clone();
                this.f16699d = typeArr4;
                int length2 = typeArr4.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    Objects.requireNonNull(this.f16699d[i3]);
                    AbstractC1378Vu.m8618c(this.f16699d[i3]);
                    Type[] typeArr5 = this.f16699d;
                    typeArr5[i3] = AbstractC1378Vu.m8617b(typeArr5[i3]);
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f16696a) {
            case 0:
                if (!(obj instanceof ParameterizedType) || !AbstractC1378Vu.m8621f(this, (ParameterizedType) obj)) {
                }
                break;
            default:
                if (!(obj instanceof ParameterizedType) || !AbstractC6800s4.m24604c(this, (ParameterizedType) obj)) {
                }
                break;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        switch (this.f16696a) {
        }
        return (Type[]) this.f16699d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        switch (this.f16696a) {
        }
        return this.f16697b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        switch (this.f16696a) {
        }
        return this.f16698c;
    }

    public final int hashCode() {
        switch (this.f16696a) {
            case 0:
                int iHashCode = Arrays.hashCode(this.f16699d) ^ this.f16698c.hashCode();
                Type type = this.f16697b;
                return iHashCode ^ (type != null ? type.hashCode() : 0);
            default:
                int iHashCode2 = Arrays.hashCode(this.f16699d) ^ this.f16698c.hashCode();
                Type type2 = this.f16697b;
                return iHashCode2 ^ (type2 != null ? type2.hashCode() : 0);
        }
    }

    public final String toString() {
        switch (this.f16696a) {
            case 0:
                Type[] typeArr = this.f16699d;
                int length = typeArr.length;
                Type type = this.f16698c;
                if (length == 0) {
                    return AbstractC1378Vu.m8632q(type);
                }
                StringBuilder sb = new StringBuilder((length + 1) * 30);
                sb.append(AbstractC1378Vu.m8632q(type));
                sb.append("<");
                sb.append(AbstractC1378Vu.m8632q(typeArr[0]));
                for (int i = 1; i < length; i++) {
                    sb.append(", ");
                    sb.append(AbstractC1378Vu.m8632q(typeArr[i]));
                }
                sb.append(">");
                return sb.toString();
            default:
                Type[] typeArr2 = this.f16699d;
                int length2 = typeArr2.length;
                Type type2 = this.f16698c;
                if (length2 == 0) {
                    return AbstractC6800s4.m24610i(type2);
                }
                StringBuilder sb2 = new StringBuilder((length2 + 1) * 30);
                sb2.append(AbstractC6800s4.m24610i(type2));
                sb2.append("<");
                sb2.append(AbstractC6800s4.m24610i(typeArr2[0]));
                for (int i2 = 1; i2 < length2; i2++) {
                    sb2.append(", ");
                    sb2.append(AbstractC6800s4.m24610i(typeArr2[i2]));
                }
                sb2.append(">");
                return sb2.toString();
        }
    }
}
