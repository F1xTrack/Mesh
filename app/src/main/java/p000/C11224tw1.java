package p000;

/* renamed from: tw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11224tw1 {

    /* renamed from: a */
    public final long f43427a;

    /* renamed from: b */
    public final String f43428b;

    public C11224tw1(long j, String str) {
        this.f43427a = j;
        this.f43428b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11224tw1)) {
            return false;
        }
        C11224tw1 c11224tw1 = (C11224tw1) obj;
        return this.f43427a == c11224tw1.f43427a && O90.m5963a(this.f43428b, c11224tw1.f43428b);
    }

    public final int hashCode() {
        long j = this.f43427a;
        return this.f43428b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "ConfigMetadata(version=" + ((Object) ("ConfigVersion(value=" + this.f43427a + ')')) + ", configFingerprint=" + ((Object) ("ConfigFingerprint(value=" + this.f43428b + ')')) + ')';
    }
}
