package defpackage;

/* renamed from: ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5729ld extends LA {
    public final String a;

    public C5729ld(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LA)) {
            return false;
        }
        return this.a.equals(((C5729ld) ((LA) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1705Vq.l(new StringBuilder("Log{content="), this.a, "}");
    }
}
