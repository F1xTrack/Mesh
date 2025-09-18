package p000;

import android.util.Size;
import java.util.ArrayList;

/* renamed from: Dc */
/* loaded from: classes.dex */
public final class C0228Dc {

    /* renamed from: b */
    public AbstractC6511nn f2061b;

    /* renamed from: c */
    public G70 f2062c;

    /* renamed from: d */
    public G70 f2063d;

    /* renamed from: f */
    public final Size f2065f;

    /* renamed from: g */
    public final int f2066g;

    /* renamed from: h */
    public final ArrayList f2067h;

    /* renamed from: i */
    public final boolean f2068i;

    /* renamed from: j */
    public final Size f2069j;

    /* renamed from: k */
    public final int f2070k;

    /* renamed from: l */
    public final C1218TM f2071l;

    /* renamed from: m */
    public final C1218TM f2072m;

    /* renamed from: a */
    public AbstractC6511nn f2060a = new C1747aq(0);

    /* renamed from: e */
    public G70 f2064e = null;

    public C0228Dc(Size size, int i, ArrayList arrayList, boolean z, Size size2, int i2, C1218TM c1218tm, C1218TM c1218tm2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2065f = size;
        this.f2066g = i;
        this.f2067h = arrayList;
        this.f2068i = z;
        this.f2069j = size2;
        this.f2070k = i2;
        this.f2071l = c1218tm;
        this.f2072m = c1218tm2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0228Dc)) {
            return false;
        }
        C0228Dc c0228Dc = (C0228Dc) obj;
        if (this.f2065f.equals(c0228Dc.f2065f) && this.f2066g == c0228Dc.f2066g && this.f2067h.equals(c0228Dc.f2067h) && this.f2068i == c0228Dc.f2068i) {
            Size size = c0228Dc.f2069j;
            Size size2 = this.f2069j;
            if (size2 != null ? size2.equals(size) : size == null) {
                if (this.f2070k == c0228Dc.f2070k && this.f2071l.equals(c0228Dc.f2071l) && this.f2072m.equals(c0228Dc.f2072m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f2065f.hashCode() ^ 1000003) * 1000003) ^ this.f2066g) * 1000003) ^ this.f2067h.hashCode()) * 1000003) ^ (this.f2068i ? 1231 : 1237)) * (-721379959);
        Size size = this.f2069j;
        return ((((((iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.f2070k) * 1000003) ^ this.f2071l.hashCode()) * 1000003) ^ this.f2072m.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f2065f + ", inputFormat=" + this.f2066g + ", outputFormats=" + this.f2067h + ", virtualCamera=" + this.f2068i + ", imageReaderProxyProvider=null, postviewSize=" + this.f2069j + ", postviewImageFormat=" + this.f2070k + ", requestEdge=" + this.f2071l + ", errorEdge=" + this.f2072m + "}";
    }
}
