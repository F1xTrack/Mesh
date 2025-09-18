package defpackage;

import java.util.ArrayList;

/* renamed from: le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5732le {
    public final TM a;
    public final TM b;
    public final int c;
    public final ArrayList d;

    public C5732le(TM tm, TM tm2, int i, ArrayList arrayList) {
        this.a = tm;
        this.b = tm2;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5732le)) {
            return false;
        }
        C5732le c5732le = (C5732le) obj;
        return this.a.equals(c5732le.a) && this.b.equals(c5732le.b) && this.c == c5732le.c && this.d.equals(c5732le.d);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "In{edge=" + this.a + ", postviewEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormats=" + this.d + "}";
    }
}
