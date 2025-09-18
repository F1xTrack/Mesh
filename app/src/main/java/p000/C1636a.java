package p000;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: a */
/* loaded from: classes2.dex */
public final class C1636a implements GenericArrayType, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f15271a;

    /* renamed from: b */
    public final Type f15272b;

    public C1636a(Type type, int i) {
        this.f15271a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(type);
                this.f15272b = AbstractC6800s4.m24602a(type);
                break;
            default:
                Objects.requireNonNull(type);
                this.f15272b = AbstractC1378Vu.m8617b(type);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f15271a) {
            case 0:
                if (!(obj instanceof GenericArrayType) || !AbstractC1378Vu.m8621f(this, (GenericArrayType) obj)) {
                }
                break;
            default:
                if (!(obj instanceof GenericArrayType) || !AbstractC6800s4.m24604c(this, (GenericArrayType) obj)) {
                }
                break;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        switch (this.f15271a) {
        }
        return this.f15272b;
    }

    public final int hashCode() {
        switch (this.f15271a) {
        }
        return this.f15272b.hashCode();
    }

    public final String toString() {
        switch (this.f15271a) {
            case 0:
                return AbstractC1378Vu.m8632q(this.f15272b) + "[]";
            default:
                return AbstractC6800s4.m24610i(this.f15272b) + "[]";
        }
    }
}
