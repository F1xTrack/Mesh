package defpackage;

import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: Re0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1358Re0 implements Type {
    public final Type[] a;
    public final int b;

    public C1358Re0(Type[] typeArr) {
        O90.f(typeArr, "types");
        this.a = typeArr;
        this.b = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1358Re0) {
            if (Arrays.equals(this.a, ((C1358Re0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return J8.w(this.a, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return getTypeName();
    }
}
