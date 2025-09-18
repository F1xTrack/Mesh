package p000;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: qc */
/* loaded from: classes.dex */
public final class C6691qc {

    /* renamed from: a */
    public final C0545Ie f41056a;

    /* renamed from: b */
    public final int f41057b;

    /* renamed from: c */
    public final Size f41058c;

    /* renamed from: d */
    public final C0149CM f41059d;

    /* renamed from: e */
    public final List f41060e;

    /* renamed from: f */
    public final C3950dn f41061f;

    /* renamed from: g */
    public final Range f41062g;

    public C6691qc(C0545Ie c0545Ie, int i, Size size, C0149CM c0149cm, List list, C3950dn c3950dn, Range range) {
        if (c0545Ie == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f41056a = c0545Ie;
        this.f41057b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f41058c = size;
        if (c0149cm == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f41059d = c0149cm;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f41060e = list;
        this.f41061f = c3950dn;
        this.f41062g = range;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6691qc)) {
            return false;
        }
        C6691qc c6691qc = (C6691qc) obj;
        if (this.f41056a.equals(c6691qc.f41056a) && this.f41057b == c6691qc.f41057b && this.f41058c.equals(c6691qc.f41058c) && this.f41059d.equals(c6691qc.f41059d) && this.f41060e.equals(c6691qc.f41060e)) {
            C3950dn c3950dn = c6691qc.f41061f;
            C3950dn c3950dn2 = this.f41061f;
            if (c3950dn2 != null ? c3950dn2.equals(c3950dn) : c3950dn == null) {
                Range range = c6691qc.f41062g;
                Range range2 = this.f41062g;
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
        int iHashCode = (((((((((this.f41056a.hashCode() ^ 1000003) * 1000003) ^ this.f41057b) * 1000003) ^ this.f41058c.hashCode()) * 1000003) ^ this.f41059d.hashCode()) * 1000003) ^ this.f41060e.hashCode()) * 1000003;
        C3950dn c3950dn = this.f41061f;
        int iHashCode2 = (iHashCode ^ (c3950dn == null ? 0 : c3950dn.hashCode())) * 1000003;
        Range range = this.f41062g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f41056a + ", imageFormat=" + this.f41057b + ", size=" + this.f41058c + ", dynamicRange=" + this.f41059d + ", captureTypes=" + this.f41060e + ", implementationOptions=" + this.f41061f + ", targetFrameRate=" + this.f41062g + "}";
    }
}
