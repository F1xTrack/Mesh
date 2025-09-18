package p000;

/* renamed from: jr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9933jr0 {

    /* renamed from: a */
    public final long f35427a;

    /* renamed from: b */
    public final String f35428b;

    public C9933jr0(long j, String str) {
        O90.m5968f(str, "message");
        this.f35427a = j;
        this.f35428b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9933jr0)) {
            return false;
        }
        C9933jr0 c9933jr0 = (C9933jr0) obj;
        return this.f35427a == c9933jr0.f35427a && O90.m5963a(this.f35428b, c9933jr0.f35428b);
    }

    public final int hashCode() {
        long j = this.f35427a;
        return this.f35428b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "Message(id=" + this.f35427a + ", message=" + this.f35428b + ")";
    }
}
