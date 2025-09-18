package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: a */
/* loaded from: classes2.dex */
public final class C2047a implements GenericArrayType, Serializable {
    public final /* synthetic */ int a;
    public final Type b;

    public C2047a(Type type, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(type);
                this.b = AbstractC6960s4.a(type);
                break;
            default:
                Objects.requireNonNull(type);
                this.b = AbstractC1717Vu.b(type);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof GenericArrayType) || !AbstractC1717Vu.f(this, (GenericArrayType) obj)) {
                }
                break;
            default:
                if (!(obj instanceof GenericArrayType) || !AbstractC6960s4.c(this, (GenericArrayType) obj)) {
                }
                break;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        switch (this.a) {
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return this.b.hashCode();
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return AbstractC1717Vu.q(this.b) + "[]";
            default:
                return AbstractC6960s4.i(this.b) + "[]";
        }
    }
}
