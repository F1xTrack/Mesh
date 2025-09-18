package defpackage;

import java.net.URI;

/* loaded from: classes2.dex */
public final class ZA0 {
    public final URI a;
    public final C1135Oi b;

    public ZA0(URI uri, C1135Oi c1135Oi) {
        this.a = uri;
        this.b = c1135Oi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZA0)) {
            return false;
        }
        ZA0 za0 = (ZA0) obj;
        return O90.a(this.a, za0.a) && O90.a(this.b, za0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoFileInfo(uri=" + this.a + ", metadata=" + this.b + ")";
    }
}
