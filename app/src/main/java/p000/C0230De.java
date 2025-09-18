package p000;

/* renamed from: De */
/* loaded from: classes.dex */
public final class C0230De {

    /* renamed from: a */
    public final int f2119a;

    /* renamed from: b */
    public final String f2120b;

    /* renamed from: c */
    public final int f2121c;

    /* renamed from: d */
    public final long f2122d;

    /* renamed from: e */
    public final long f2123e;

    /* renamed from: f */
    public final boolean f2124f;

    /* renamed from: g */
    public final int f2125g;

    /* renamed from: h */
    public final String f2126h;

    /* renamed from: i */
    public final String f2127i;

    public C0230De(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f2119a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f2120b = str;
        this.f2121c = i2;
        this.f2122d = j;
        this.f2123e = j2;
        this.f2124f = z;
        this.f2125g = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f2126h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f2127i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0230De)) {
            return false;
        }
        C0230De c0230De = (C0230De) obj;
        return this.f2119a == c0230De.f2119a && this.f2120b.equals(c0230De.f2120b) && this.f2121c == c0230De.f2121c && this.f2122d == c0230De.f2122d && this.f2123e == c0230De.f2123e && this.f2124f == c0230De.f2124f && this.f2125g == c0230De.f2125g && this.f2126h.equals(c0230De.f2126h) && this.f2127i.equals(c0230De.f2127i);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f2119a ^ 1000003) * 1000003) ^ this.f2120b.hashCode()) * 1000003) ^ this.f2121c) * 1000003;
        long j = this.f2122d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f2123e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f2124f ? 1231 : 1237)) * 1000003) ^ this.f2125g) * 1000003) ^ this.f2126h.hashCode()) * 1000003) ^ this.f2127i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f2119a);
        sb.append(", model=");
        sb.append(this.f2120b);
        sb.append(", availableProcessors=");
        sb.append(this.f2121c);
        sb.append(", totalRam=");
        sb.append(this.f2122d);
        sb.append(", diskSpace=");
        sb.append(this.f2123e);
        sb.append(", isEmulator=");
        sb.append(this.f2124f);
        sb.append(", state=");
        sb.append(this.f2125g);
        sb.append(", manufacturer=");
        sb.append(this.f2126h);
        sb.append(", modelClass=");
        return AbstractC1374Vq.m8593l(sb, this.f2127i, "}");
    }
}
