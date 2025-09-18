package defpackage;

/* renamed from: tw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7315tw1 {
    public final long a;
    public final String b;

    public C7315tw1(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7315tw1)) {
            return false;
        }
        C7315tw1 c7315tw1 = (C7315tw1) obj;
        return this.a == c7315tw1.a && O90.a(this.b, c7315tw1.b);
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "ConfigMetadata(version=" + ((Object) ("ConfigVersion(value=" + this.a + ')')) + ", configFingerprint=" + ((Object) ("ConfigFingerprint(value=" + this.b + ')')) + ')';
    }
}
