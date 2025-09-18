package defpackage;

/* renamed from: So1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467So1 {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1467So1)) {
            return false;
        }
        C1467So1 c1467So1 = (C1467So1) obj;
        return O90.a(this.a, c1467So1.a) && this.b == c1467So1.b;
    }

    public final int hashCode() {
        return AbstractC8235ym.x(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + F91.G(this.b) + ')';
    }
}
