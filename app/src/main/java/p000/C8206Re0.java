package p000;

import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: Re0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8206Re0 implements Type {

    /* renamed from: a */
    public final Type[] f10359a;

    /* renamed from: b */
    public final int f10360b;

    public C8206Re0(Type[] typeArr) {
        O90.m5968f(typeArr, "types");
        this.f10359a = typeArr;
        this.f10360b = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8206Re0) {
            if (Arrays.equals(this.f10359a, ((C8206Re0) obj).f10359a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC0576J8.m4196w(this.f10359a, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f10360b;
    }

    public final String toString() {
        return getTypeName();
    }
}
