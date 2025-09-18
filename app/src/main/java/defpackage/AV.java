package defpackage;

/* loaded from: classes.dex */
public final class AV {
    public final String a;

    public AV(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AV) && O90.a(this.a, ((AV) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return F91.v(new StringBuilder("FirebaseSessionsData(sessionId="), this.a, ')');
    }
}
