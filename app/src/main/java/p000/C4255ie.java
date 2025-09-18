package p000;

/* renamed from: ie */
/* loaded from: classes.dex */
public final class C4255ie {

    /* renamed from: a */
    public final long f29397a;

    /* renamed from: b */
    public final C1236Te f29398b;

    /* renamed from: c */
    public final C0166Cd f29399c;

    public C4255ie(long j, C1236Te c1236Te, C0166Cd c0166Cd) {
        this.f29397a = j;
        this.f29398b = c1236Te;
        this.f29399c = c0166Cd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4255ie)) {
            return false;
        }
        C4255ie c4255ie = (C4255ie) obj;
        return this.f29397a == c4255ie.f29397a && this.f29398b.equals(c4255ie.f29398b) && this.f29399c.equals(c4255ie.f29399c);
    }

    public final int hashCode() {
        long j = this.f29397a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f29398b.hashCode()) * 1000003) ^ this.f29399c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f29397a + ", transportContext=" + this.f29398b + ", event=" + this.f29399c + "}";
    }
}
