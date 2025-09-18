package defpackage;

/* renamed from: Hs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0621Hs0 {
    public final NP a;
    public final Object b;
    public final Object c;

    public C0621Hs0(NP np, Object obj, Object obj2) {
        this.a = np;
        this.b = obj;
        this.c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0621Hs0)) {
            return false;
        }
        C0621Hs0 c0621Hs0 = (C0621Hs0) obj;
        return this.a == c0621Hs0.a && O90.a(this.b, c0621Hs0.b) && O90.a(this.c, c0621Hs0.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "PostponedEvent(eventName=" + this.a + ", sender=" + this.b + ", payload=" + this.c + ")";
    }
}
