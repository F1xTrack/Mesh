package p000;

import java.util.ArrayList;

/* renamed from: le */
/* loaded from: classes.dex */
public final class C6376le {

    /* renamed from: a */
    public final C1218TM f37208a;

    /* renamed from: b */
    public final C1218TM f37209b;

    /* renamed from: c */
    public final int f37210c;

    /* renamed from: d */
    public final ArrayList f37211d;

    public C6376le(C1218TM c1218tm, C1218TM c1218tm2, int i, ArrayList arrayList) {
        this.f37208a = c1218tm;
        this.f37209b = c1218tm2;
        this.f37210c = i;
        this.f37211d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6376le)) {
            return false;
        }
        C6376le c6376le = (C6376le) obj;
        return this.f37208a.equals(c6376le.f37208a) && this.f37209b.equals(c6376le.f37209b) && this.f37210c == c6376le.f37210c && this.f37211d.equals(c6376le.f37211d);
    }

    public final int hashCode() {
        return ((((((this.f37208a.hashCode() ^ 1000003) * 1000003) ^ this.f37209b.hashCode()) * 1000003) ^ this.f37210c) * 1000003) ^ this.f37211d.hashCode();
    }

    public final String toString() {
        return "In{edge=" + this.f37208a + ", postviewEdge=" + this.f37209b + ", inputFormat=" + this.f37210c + ", outputFormats=" + this.f37211d + "}";
    }
}
