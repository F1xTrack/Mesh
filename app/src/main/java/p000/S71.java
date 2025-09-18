package p000;

/* loaded from: classes.dex */
public final class S71 {

    /* renamed from: a */
    public final String f10588a;

    /* renamed from: b */
    public final int f10589b;

    /* renamed from: c */
    public final int f10590c;

    public S71(String str, int i, int i2) {
        O90.m5968f(str, "workSpecId");
        this.f10588a = str;
        this.f10589b = i;
        this.f10590c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S71)) {
            return false;
        }
        S71 s71 = (S71) obj;
        return O90.m5963a(this.f10588a, s71.f10588a) && this.f10589b == s71.f10589b && this.f10590c == s71.f10590c;
    }

    public final int hashCode() {
        return (((this.f10588a.hashCode() * 31) + this.f10589b) * 31) + this.f10590c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f10588a);
        sb.append(", generation=");
        sb.append(this.f10589b);
        sb.append(", systemId=");
        return AbstractC7222ym.m26235l(sb, this.f10590c, ')');
    }
}
