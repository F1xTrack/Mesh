package defpackage;

/* renamed from: De, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266De {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public C0266De(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0266De)) {
            return false;
        }
        C0266De c0266De = (C0266De) obj;
        return this.a == c0266De.a && this.b.equals(c0266De.b) && this.c == c0266De.c && this.d == c0266De.d && this.e == c0266De.e && this.f == c0266De.f && this.g == c0266De.g && this.h.equals(c0266De.h) && this.i.equals(c0266De.i);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", availableProcessors=");
        sb.append(this.c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", isEmulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return AbstractC1705Vq.l(sb, this.i, "}");
    }
}
