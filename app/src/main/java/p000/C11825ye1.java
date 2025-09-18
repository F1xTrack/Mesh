package p000;

import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: ye1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11825ye1 {

    /* renamed from: a */
    public final Class f46373a;

    /* renamed from: b */
    public final Type f46374b;

    /* renamed from: c */
    public final int f46375c;

    public C11825ye1(Type type) {
        Objects.requireNonNull(type);
        Type typeM24602a = AbstractC6800s4.m24602a(type);
        this.f46374b = typeM24602a;
        this.f46373a = AbstractC6800s4.m24608g(typeM24602a);
        this.f46375c = typeM24602a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11825ye1) {
            if (AbstractC6800s4.m24604c(this.f46374b, ((C11825ye1) obj).f46374b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46375c;
    }

    public final String toString() {
        return AbstractC6800s4.m24610i(this.f46374b);
    }
}
