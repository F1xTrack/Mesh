package defpackage;

/* renamed from: kZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5527kZ0 {
    public final String a;

    public C5527kZ0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5527kZ0) && O90.a(this.a, ((C5527kZ0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return F91.v(new StringBuilder("SessionDetails(sessionId="), this.a, ')');
    }
}
