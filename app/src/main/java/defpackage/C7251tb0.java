package defpackage;

/* renamed from: tb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7251tb0 {
    public final C0074As a;
    public final C0074As b;
    public final C0074As c;

    public C7251tb0(C0074As c0074As, C0074As c0074As2, C0074As c0074As3) {
        this.a = c0074As;
        this.b = c0074As2;
        this.c = c0074As3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7251tb0)) {
            return false;
        }
        C7251tb0 c7251tb0 = (C7251tb0) obj;
        return O90.a(this.a, c7251tb0.a) && O90.a(this.b, c7251tb0.b) && O90.a(this.c, c7251tb0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
