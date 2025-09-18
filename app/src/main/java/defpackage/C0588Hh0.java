package defpackage;

/* renamed from: Hh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0588Hh0 {
    public final C1559Tt0 a;
    public final C3957gP0 b;

    public C0588Hh0(C1559Tt0 c1559Tt0, C3957gP0 c3957gP0) {
        O90.f(c1559Tt0, "name");
        this.a = c1559Tt0;
        this.b = c3957gP0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0588Hh0) {
            if (O90.a(this.a, ((C0588Hh0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
