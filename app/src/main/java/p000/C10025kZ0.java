package p000;

/* renamed from: kZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10025kZ0 {

    /* renamed from: a */
    public final String f36542a;

    public C10025kZ0(String str) {
        this.f36542a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10025kZ0) && O90.m5963a(this.f36542a, ((C10025kZ0) obj).f36542a);
    }

    public final int hashCode() {
        return this.f36542a.hashCode();
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("SessionDetails(sessionId="), this.f36542a, ')');
    }
}
