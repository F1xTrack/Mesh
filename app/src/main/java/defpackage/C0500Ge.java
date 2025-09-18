package defpackage;

import android.util.Range;
import android.util.Size;

/* renamed from: Ge */
/* loaded from: classes.dex */
public final class C0500Ge {
    public static final Range f = new Range(0, 0);
    public final Size a;
    public final CM b;
    public final Range c;
    public final C3456dn d;
    public final boolean e;

    public C0500Ge(Size size, CM cm, Range range, C3456dn c3456dn, boolean z) {
        this.a = size;
        this.b = cm;
        this.c = range;
        this.d = c3456dn;
        this.e = z;
    }

    public final C7375uF a() {
        C7375uF c7375uF = new C7375uF();
        c7375uF.a = this.a;
        c7375uF.b = this.b;
        c7375uF.c = this.c;
        c7375uF.d = this.d;
        c7375uF.e = Boolean.valueOf(this.e);
        return c7375uF;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0500Ge)) {
            return false;
        }
        C0500Ge c0500Ge = (C0500Ge) obj;
        if (this.a.equals(c0500Ge.a) && this.b.equals(c0500Ge.b) && this.c.equals(c0500Ge.c)) {
            C3456dn c3456dn = c0500Ge.d;
            C3456dn c3456dn2 = this.d;
            if (c3456dn2 != null ? c3456dn2.equals(c3456dn) : c3456dn == null) {
                if (this.e == c0500Ge.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        C3456dn c3456dn = this.d;
        return ((iHashCode ^ (c3456dn == null ? 0 : c3456dn.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", dynamicRange=");
        sb.append(this.b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.c);
        sb.append(", implementationOptions=");
        sb.append(this.d);
        sb.append(", zslDisabled=");
        return AbstractC8235ym.m(sb, this.e, "}");
    }
}
