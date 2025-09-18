package defpackage;

/* loaded from: classes.dex */
public final class DD0 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public DD0(boolean z, int i, int i2, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DD0)) {
            return false;
        }
        DD0 dd0 = (DD0) obj;
        return O90.a(this.a, dd0.a) && this.b == dd0.b && this.c == dd0.c && this.d == dd0.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return F91.w(sb, this.d, ')');
    }
}
