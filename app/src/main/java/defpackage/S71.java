package defpackage;

/* loaded from: classes.dex */
public final class S71 {
    public final String a;
    public final int b;
    public final int c;

    public S71(String str, int i, int i2) {
        O90.f(str, "workSpecId");
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S71)) {
            return false;
        }
        S71 s71 = (S71) obj;
        return O90.a(this.a, s71.a) && this.b == s71.b && this.c == s71.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return AbstractC8235ym.l(sb, this.c, ')');
    }
}
