package defpackage;

/* renamed from: id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4380id extends IA {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public C4380id(boolean z, int i, int i2, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IA)) {
            return false;
        }
        IA ia = (IA) obj;
        if (this.a.equals(((C4380id) ia).a)) {
            C4380id c4380id = (C4380id) ia;
            if (this.b == c4380id.b && this.c == c4380id.c && this.d == c4380id.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return AbstractC8235ym.m(sb, this.d, "}");
    }
}
