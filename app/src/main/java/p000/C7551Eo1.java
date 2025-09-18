package p000;

/* renamed from: Eo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7551Eo1 {

    /* renamed from: a */
    public final String f2911a;

    /* renamed from: b */
    public final int f2912b;

    public C7551Eo1(String str, int i) {
        O90.m5968f(str, "workSpecId");
        this.f2911a = str;
        this.f2912b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7551Eo1)) {
            return false;
        }
        C7551Eo1 c7551Eo1 = (C7551Eo1) obj;
        return O90.m5963a(this.f2911a, c7551Eo1.f2911a) && this.f2912b == c7551Eo1.f2912b;
    }

    public final int hashCode() {
        return (this.f2911a.hashCode() * 31) + this.f2912b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f2911a);
        sb.append(", generation=");
        return AbstractC7222ym.m26235l(sb, this.f2912b, ')');
    }
}
