package defpackage;

import android.util.Size;
import java.util.HashMap;

/* renamed from: Pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201Pe {
    public final Size a;
    public final HashMap b;
    public final Size c;
    public final HashMap d;
    public final Size e;
    public final HashMap f;
    public final HashMap g;

    public C1201Pe(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.a = size;
        this.b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.c = size2;
        this.d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.e = size3;
        this.f = map3;
        this.g = map4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1201Pe)) {
            return false;
        }
        C1201Pe c1201Pe = (C1201Pe) obj;
        return this.a.equals(c1201Pe.a) && this.b.equals(c1201Pe.b) && this.c.equals(c1201Pe.c) && this.d.equals(c1201Pe.d) && this.e.equals(c1201Pe.e) && this.f.equals(c1201Pe.f) && this.g.equals(c1201Pe.g);
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
