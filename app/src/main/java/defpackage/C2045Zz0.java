package defpackage;

import java.util.Objects;

/* renamed from: Zz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2045Zz0 {
    public final Object a;
    public final Object b;

    public C2045Zz0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2045Zz0)) {
            return false;
        }
        C2045Zz0 c2045Zz0 = (C2045Zz0) obj;
        return Objects.equals(c2045Zz0.a, this.a) && Objects.equals(c2045Zz0.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
