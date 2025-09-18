package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: ye1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8213ye1 {
    public final Class a;
    public final Type b;
    public final int c;

    public C8213ye1(Type type) {
        Objects.requireNonNull(type);
        Type typeA = AbstractC6960s4.a(type);
        this.b = typeA;
        this.a = AbstractC6960s4.g(typeA);
        this.c = typeA.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8213ye1) {
            if (AbstractC6960s4.c(this.b, ((C8213ye1) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return AbstractC6960s4.i(this.b);
    }
}
