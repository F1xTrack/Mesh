package defpackage;

/* renamed from: Eo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376Eo1 {
    public final String a;
    public final int b;

    public C0376Eo1(String str, int i) {
        O90.f(str, "workSpecId");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0376Eo1)) {
            return false;
        }
        C0376Eo1 c0376Eo1 = (C0376Eo1) obj;
        return O90.a(this.a, c0376Eo1.a) && this.b == c0376Eo1.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return AbstractC8235ym.l(sb, this.b, ')');
    }
}
