package defpackage;

/* renamed from: Be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110Be {
    public final C0188Ce a;
    public final C0344Ee b;
    public final C0266De c;

    public C0110Be(C0188Ce c0188Ce, C0344Ee c0344Ee, C0266De c0266De) {
        this.a = c0188Ce;
        this.b = c0344Ee;
        this.c = c0266De;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0110Be)) {
            return false;
        }
        C0110Be c0110Be = (C0110Be) obj;
        return this.a.equals(c0110Be.a) && this.b.equals(c0110Be.b) && this.c.equals(c0110Be.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
