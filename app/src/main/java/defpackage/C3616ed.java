package defpackage;

import java.util.List;

/* renamed from: ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3616ed extends GA {
    public final String a;
    public final int b;
    public final List c;

    public C3616ed(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GA)) {
            return false;
        }
        GA ga = (GA) obj;
        if (this.a.equals(((C3616ed) ga).a)) {
            C3616ed c3616ed = (C3616ed) ga;
            if (this.b == c3616ed.b && this.c.equals(c3616ed.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
