package defpackage;

/* renamed from: jr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5390jr0 {
    public final long a;
    public final String b;

    public C5390jr0(long j, String str) {
        O90.f(str, "message");
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5390jr0)) {
            return false;
        }
        C5390jr0 c5390jr0 = (C5390jr0) obj;
        return this.a == c5390jr0.a && O90.a(this.b, c5390jr0.b);
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "Message(id=" + this.a + ", message=" + this.b + ")";
    }
}
