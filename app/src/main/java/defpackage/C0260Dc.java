package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* renamed from: Dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260Dc {
    public AbstractC6141nn b;
    public G70 c;
    public G70 d;
    public final Size f;
    public final int g;
    public final ArrayList h;
    public final boolean i;
    public final Size j;
    public final int k;
    public final TM l;
    public final TM m;
    public AbstractC6141nn a = new C2208aq(0);
    public G70 e = null;

    public C0260Dc(Size size, int i, ArrayList arrayList, boolean z, Size size2, int i2, TM tm, TM tm2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f = size;
        this.g = i;
        this.h = arrayList;
        this.i = z;
        this.j = size2;
        this.k = i2;
        this.l = tm;
        this.m = tm2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0260Dc)) {
            return false;
        }
        C0260Dc c0260Dc = (C0260Dc) obj;
        if (this.f.equals(c0260Dc.f) && this.g == c0260Dc.g && this.h.equals(c0260Dc.h) && this.i == c0260Dc.i) {
            Size size = c0260Dc.j;
            Size size2 = this.j;
            if (size2 != null ? size2.equals(size) : size == null) {
                if (this.k == c0260Dc.k && this.l.equals(c0260Dc.l) && this.m.equals(c0260Dc.m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * (-721379959);
        Size size = this.j;
        return ((((((iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=null, postviewSize=" + this.j + ", postviewImageFormat=" + this.k + ", requestEdge=" + this.l + ", errorEdge=" + this.m + "}";
    }
}
