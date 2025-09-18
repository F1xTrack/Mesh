package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: b */
/* loaded from: classes2.dex */
public final class C2238b implements ParameterizedType, Serializable {
    public final /* synthetic */ int a;
    public final Type b;
    public final Type c;
    public final Type[] d;

    public C2238b(Type type, Type type2, Type[] typeArr, int i) {
        this.a = i;
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
                    IL1.b(z);
                }
                this.b = type == null ? null : AbstractC6960s4.a(type);
                this.c = AbstractC6960s4.a(type2);
                Type[] typeArr2 = (Type[]) typeArr.clone();
                this.d = typeArr2;
                int length = typeArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Objects.requireNonNull(this.d[i2]);
                    AbstractC6960s4.b(this.d[i2]);
                    Type[] typeArr3 = this.d;
                    typeArr3[i2] = AbstractC6960s4.a(typeArr3[i2]);
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
                    FL1.b(z3);
                }
                this.b = type == null ? null : AbstractC1717Vu.b(type);
                this.c = AbstractC1717Vu.b(type2);
                Type[] typeArr4 = (Type[]) typeArr.clone();
                this.d = typeArr4;
                int length2 = typeArr4.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    Objects.requireNonNull(this.d[i3]);
                    AbstractC1717Vu.c(this.d[i3]);
                    Type[] typeArr5 = this.d;
                    typeArr5[i3] = AbstractC1717Vu.b(typeArr5[i3]);
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof ParameterizedType) || !AbstractC1717Vu.f(this, (ParameterizedType) obj)) {
                }
                break;
            default:
                if (!(obj instanceof ParameterizedType) || !AbstractC6960s4.c(this, (ParameterizedType) obj)) {
                }
                break;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        switch (this.a) {
        }
        return (Type[]) this.d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        switch (this.a) {
        }
        return this.c;
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                int iHashCode = Arrays.hashCode(this.d) ^ this.c.hashCode();
                Type type = this.b;
                return iHashCode ^ (type != null ? type.hashCode() : 0);
            default:
                int iHashCode2 = Arrays.hashCode(this.d) ^ this.c.hashCode();
                Type type2 = this.b;
                return iHashCode2 ^ (type2 != null ? type2.hashCode() : 0);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                Type[] typeArr = this.d;
                int length = typeArr.length;
                Type type = this.c;
                if (length == 0) {
                    return AbstractC1717Vu.q(type);
                }
                StringBuilder sb = new StringBuilder((length + 1) * 30);
                sb.append(AbstractC1717Vu.q(type));
                sb.append("<");
                sb.append(AbstractC1717Vu.q(typeArr[0]));
                for (int i = 1; i < length; i++) {
                    sb.append(", ");
                    sb.append(AbstractC1717Vu.q(typeArr[i]));
                }
                sb.append(">");
                return sb.toString();
            default:
                Type[] typeArr2 = this.d;
                int length2 = typeArr2.length;
                Type type2 = this.c;
                if (length2 == 0) {
                    return AbstractC6960s4.i(type2);
                }
                StringBuilder sb2 = new StringBuilder((length2 + 1) * 30);
                sb2.append(AbstractC6960s4.i(type2));
                sb2.append("<");
                sb2.append(AbstractC6960s4.i(typeArr2[0]));
                for (int i2 = 1; i2 < length2; i2++) {
                    sb2.append(", ");
                    sb2.append(AbstractC6960s4.i(typeArr2[i2]));
                }
                sb2.append(">");
                return sb2.toString();
        }
    }
}
