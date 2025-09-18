package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9335fA0 implements ParameterizedType, Type {

    /* renamed from: a */
    public final Class f27101a;

    /* renamed from: b */
    public final Type f27102b;

    /* renamed from: c */
    public final Type[] f27103c;

    public C9335fA0(Class cls, Type type, ArrayList arrayList) {
        this.f27101a = cls;
        this.f27102b = type;
        this.f27103c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (O90.m5963a(this.f27101a, parameterizedType.getRawType()) && O90.m5963a(this.f27102b, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f27103c, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f27103c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f27102b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f27101a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f27101a;
        Type type = this.f27102b;
        if (type != null) {
            sb.append(AbstractC8259Se1.m7402a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC8259Se1.m7402a(cls));
        }
        Type[] typeArr = this.f27103c;
        if (typeArr.length != 0) {
            AbstractC0576J8.m4193t(typeArr, sb, ", ", "<", ">", -1, "...", C9207eA0.f26579a);
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    public final int hashCode() {
        int iHashCode = this.f27101a.hashCode();
        Type type = this.f27102b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f27103c);
    }

    public final String toString() {
        return getTypeName();
    }
}
