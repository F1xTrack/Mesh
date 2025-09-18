package p000;

import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: xe1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11698xe1 {

    /* renamed from: a */
    public final Class f45725a;

    /* renamed from: b */
    public final Type f45726b;

    /* renamed from: c */
    public final int f45727c;

    public C11698xe1(Type type) {
        Objects.requireNonNull(type);
        Type typeM8617b = AbstractC1378Vu.m8617b(type);
        this.f45726b = typeM8617b;
        this.f45725a = AbstractC1378Vu.m8624i(typeM8617b);
        this.f45727c = typeM8617b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11698xe1) {
            if (AbstractC1378Vu.m8621f(this.f45726b, ((C11698xe1) obj).f45726b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45727c;
    }

    public final String toString() {
        return AbstractC1378Vu.m8632q(this.f45726b);
    }
}
