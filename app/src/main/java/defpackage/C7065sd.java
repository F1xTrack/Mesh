package defpackage;

/* renamed from: sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7065sd extends RA {
    public final String a;

    public C7065sd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RA)) {
            return false;
        }
        return this.a.equals(((C7065sd) ((RA) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1705Vq.l(new StringBuilder("User{identifier="), this.a, "}");
    }
}
