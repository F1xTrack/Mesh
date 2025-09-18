package p000;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes2.dex */
public final class OT0 {

    /* renamed from: a */
    public final C6656q3 f8454a;

    /* renamed from: b */
    public final Proxy f8455b;

    /* renamed from: c */
    public final InetSocketAddress f8456c;

    public OT0(C6656q3 c6656q3, Proxy proxy, InetSocketAddress inetSocketAddress) {
        O90.m5968f(inetSocketAddress, "socketAddress");
        this.f8454a = c6656q3;
        this.f8455b = proxy;
        this.f8456c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OT0) {
            OT0 ot0 = (OT0) obj;
            if (O90.m5963a(ot0.f8454a, this.f8454a) && O90.m5963a(ot0.f8455b, this.f8455b) && O90.m5963a(ot0.f8456c, this.f8456c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8456c.hashCode() + ((this.f8455b.hashCode() + ((this.f8454a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f8456c + '}';
    }
}
