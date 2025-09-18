package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6681qc {
    public final C0656Ie a;
    public final int b;
    public final Size c;
    public final CM d;
    public final List e;
    public final C3456dn f;
    public final Range g;

    public C6681qc(C0656Ie c0656Ie, int i, Size size, CM cm, List list, C3456dn c3456dn, Range range) {
        if (c0656Ie == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.a = c0656Ie;
        this.b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.c = size;
        if (cm == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.d = cm;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.e = list;
        this.f = c3456dn;
        this.g = range;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6681qc)) {
            return false;
        }
        C6681qc c6681qc = (C6681qc) obj;
        if (this.a.equals(c6681qc.a) && this.b == c6681qc.b && this.c.equals(c6681qc.c) && this.d.equals(c6681qc.d) && this.e.equals(c6681qc.e)) {
            C3456dn c3456dn = c6681qc.f;
            C3456dn c3456dn2 = this.f;
            if (c3456dn2 != null ? c3456dn2.equals(c3456dn) : c3456dn == null) {
                Range range = c6681qc.g;
                Range range2 = this.g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        C3456dn c3456dn = this.f;
        int iHashCode2 = (iHashCode ^ (c3456dn == null ? 0 : c3456dn.hashCode())) * 1000003;
        Range range = this.g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
