package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes2.dex */
public final class OT0 {
    public final C6575q3 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public OT0(C6575q3 c6575q3, Proxy proxy, InetSocketAddress inetSocketAddress) {
        O90.f(inetSocketAddress, "socketAddress");
        this.a = c6575q3;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OT0) {
            OT0 ot0 = (OT0) obj;
            if (O90.a(ot0.a, this.a) && O90.a(ot0.b, this.b) && O90.a(ot0.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
