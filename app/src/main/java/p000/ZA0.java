package p000;

import java.net.URI;

/* loaded from: classes2.dex */
public final class ZA0 {

    /* renamed from: a */
    public final URI f14766a;

    /* renamed from: b */
    public final C0926Oi f14767b;

    public ZA0(URI uri, C0926Oi c0926Oi) {
        this.f14766a = uri;
        this.f14767b = c0926Oi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZA0)) {
            return false;
        }
        ZA0 za0 = (ZA0) obj;
        return O90.m5963a(this.f14766a, za0.f14766a) && O90.m5963a(this.f14767b, za0.f14767b);
    }

    public final int hashCode() {
        return this.f14767b.hashCode() + (this.f14766a.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoFileInfo(uri=" + this.f14766a + ", metadata=" + this.f14767b + ")";
    }
}
