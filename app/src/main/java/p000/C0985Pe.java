package p000;

import android.util.Size;
import java.util.HashMap;

/* renamed from: Pe */
/* loaded from: classes.dex */
public final class C0985Pe {

    /* renamed from: a */
    public final Size f9204a;

    /* renamed from: b */
    public final HashMap f9205b;

    /* renamed from: c */
    public final Size f9206c;

    /* renamed from: d */
    public final HashMap f9207d;

    /* renamed from: e */
    public final Size f9208e;

    /* renamed from: f */
    public final HashMap f9209f;

    /* renamed from: g */
    public final HashMap f9210g;

    public C0985Pe(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f9204a = size;
        this.f9205b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f9206c = size2;
        this.f9207d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f9208e = size3;
        this.f9209f = map3;
        this.f9210g = map4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0985Pe)) {
            return false;
        }
        C0985Pe c0985Pe = (C0985Pe) obj;
        return this.f9204a.equals(c0985Pe.f9204a) && this.f9205b.equals(c0985Pe.f9205b) && this.f9206c.equals(c0985Pe.f9206c) && this.f9207d.equals(c0985Pe.f9207d) && this.f9208e.equals(c0985Pe.f9208e) && this.f9209f.equals(c0985Pe.f9209f) && this.f9210g.equals(c0985Pe.f9210g);
    }

    public final int hashCode() {
        return ((((((((((((this.f9204a.hashCode() ^ 1000003) * 1000003) ^ this.f9205b.hashCode()) * 1000003) ^ this.f9206c.hashCode()) * 1000003) ^ this.f9207d.hashCode()) * 1000003) ^ this.f9208e.hashCode()) * 1000003) ^ this.f9209f.hashCode()) * 1000003) ^ this.f9210g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f9204a + ", s720pSizeMap=" + this.f9205b + ", previewSize=" + this.f9206c + ", s1440pSizeMap=" + this.f9207d + ", recordSize=" + this.f9208e + ", maximumSizeMap=" + this.f9209f + ", ultraMaximumSizeMap=" + this.f9210g + "}";
    }
}
