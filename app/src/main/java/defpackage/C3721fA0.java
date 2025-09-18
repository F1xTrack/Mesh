package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3721fA0 implements ParameterizedType, Type {
    public final Class a;
    public final Type b;
    public final Type[] c;

    public C3721fA0(Class cls, Type type, ArrayList arrayList) {
        this.a = cls;
        this.b = type;
        this.c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (O90.a(this.a, parameterizedType.getRawType()) && O90.a(this.b, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.c, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.a;
        Type type = this.b;
        if (type != null) {
            sb.append(AbstractC1437Se1.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC1437Se1.a(cls));
        }
        Type[] typeArr = this.c;
        if (typeArr.length != 0) {
            J8.t(typeArr, sb, ", ", "<", ">", -1, "...", C3530eA0.a);
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Type type = this.b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.c);
    }

    public final String toString() {
        return getTypeName();
    }
}
