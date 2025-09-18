package p000;

/* renamed from: h3 */
/* loaded from: classes.dex */
public final class C4155h3 {

    /* renamed from: a */
    public int f28181a;

    /* renamed from: b */
    public int f28182b;

    /* renamed from: c */
    public int f28183c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4155h3)) {
            return false;
        }
        C4155h3 c4155h3 = (C4155h3) obj;
        int i = this.f28181a;
        if (i != c4155h3.f28181a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f28183c - this.f28182b) == 1 && this.f28183c == c4155h3.f28182b && this.f28182b == c4155h3.f28183c) {
            return true;
        }
        return this.f28183c == c4155h3.f28183c && this.f28182b == c4155h3.f28182b;
    }

    public final int hashCode() {
        return (((this.f28181a * 31) + this.f28182b) * 31) + this.f28183c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f28181a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f28182b);
        sb.append("c:");
        return AbstractC1374Vq.m8591j(sb, this.f28183c, ",p:null]");
    }
}
