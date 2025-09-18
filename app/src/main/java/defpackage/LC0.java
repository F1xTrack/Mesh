package defpackage;

/* loaded from: classes.dex */
public final class LC0 {
    public final String a;

    public LC0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LC0)) {
            return false;
        }
        return O90.a(this.a, ((LC0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
