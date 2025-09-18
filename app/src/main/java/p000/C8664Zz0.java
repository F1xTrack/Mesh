package p000;

import java.util.Objects;

/* renamed from: Zz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8664Zz0 {

    /* renamed from: a */
    public final Object f15267a;

    /* renamed from: b */
    public final Object f15268b;

    public C8664Zz0(Object obj, Object obj2) {
        this.f15267a = obj;
        this.f15268b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8664Zz0)) {
            return false;
        }
        C8664Zz0 c8664Zz0 = (C8664Zz0) obj;
        return Objects.equals(c8664Zz0.f15267a, this.f15267a) && Objects.equals(c8664Zz0.f15268b, this.f15268b);
    }

    public final int hashCode() {
        Object obj = this.f15267a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f15268b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f15267a + " " + this.f15268b + "}";
    }
}
