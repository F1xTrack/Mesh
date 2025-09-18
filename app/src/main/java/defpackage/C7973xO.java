package defpackage;

/* renamed from: xO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7973xO {
    public final String a;

    public C7973xO(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7973xO)) {
            return false;
        }
        return this.a.equals(((C7973xO) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1705Vq.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
