package p000;

/* loaded from: classes.dex */
public final class DD0 {

    /* renamed from: a */
    public final String f1898a;

    /* renamed from: b */
    public final int f1899b;

    /* renamed from: c */
    public final int f1900c;

    /* renamed from: d */
    public final boolean f1901d;

    public DD0(boolean z, int i, int i2, String str) {
        this.f1898a = str;
        this.f1899b = i;
        this.f1900c = i2;
        this.f1901d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DD0)) {
            return false;
        }
        DD0 dd0 = (DD0) obj;
        return O90.m5963a(this.f1898a, dd0.f1898a) && this.f1899b == dd0.f1899b && this.f1900c == dd0.f1900c && this.f1901d == dd0.f1901d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = ((((this.f1898a.hashCode() * 31) + this.f1899b) * 31) + this.f1900c) * 31;
        boolean z = this.f1901d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f1898a);
        sb.append(", pid=");
        sb.append(this.f1899b);
        sb.append(", importance=");
        sb.append(this.f1900c);
        sb.append(", isDefaultProcess=");
        return F91.m2540w(sb, this.f1901d, ')');
    }
}
