package defpackage;

/* renamed from: rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6874rd extends QA {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public C6874rd(String str, String str2, int i, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QA)) {
            return false;
        }
        QA qa = (QA) obj;
        if (this.a == ((C6874rd) qa).a) {
            C6874rd c6874rd = (C6874rd) qa;
            if (this.b.equals(c6874rd.b) && this.c.equals(c6874rd.c) && this.d == c6874rd.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return AbstractC8235ym.m(sb, this.d, "}");
    }
}
