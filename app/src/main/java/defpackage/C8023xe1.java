package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: xe1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8023xe1 {
    public final Class a;
    public final Type b;
    public final int c;

    public C8023xe1(Type type) {
        Objects.requireNonNull(type);
        Type typeB = AbstractC1717Vu.b(type);
        this.b = typeB;
        this.a = AbstractC1717Vu.i(typeB);
        this.c = typeB.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8023xe1) {
            if (AbstractC1717Vu.f(this.b, ((C8023xe1) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return AbstractC1717Vu.q(this.b);
    }
}
