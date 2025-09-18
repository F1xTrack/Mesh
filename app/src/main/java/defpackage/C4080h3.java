package defpackage;

/* renamed from: h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4080h3 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4080h3)) {
            return false;
        }
        C4080h3 c4080h3 = (C4080h3) obj;
        int i = this.a;
        if (i != c4080h3.a) {
            return false;
        }
        if (i == 8 && Math.abs(this.c - this.b) == 1 && this.c == c4080h3.b && this.b == c4080h3.c) {
            return true;
        }
        return this.c == c4080h3.c && this.b == c4080h3.b;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        return AbstractC1705Vq.j(sb, this.c, ",p:null]");
    }
}
