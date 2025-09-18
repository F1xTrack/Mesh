package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6575q3 {
    public final C7532v32 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final C2017Zq e;
    public final C5396jt0 f;
    public final Proxy g;
    public final ProxySelector h;
    public final D40 i;
    public final List j;
    public final List k;

    public C6575q3(String str, int i, C7532v32 c7532v32, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2017Zq c2017Zq, C5396jt0 c5396jt0, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        O90.f(str, "uriHost");
        O90.f(c7532v32, "dns");
        O90.f(socketFactory, "socketFactory");
        O90.f(c5396jt0, "proxyAuthenticator");
        O90.f(list, "protocols");
        O90.f(list2, "connectionSpecs");
        O90.f(proxySelector, "proxySelector");
        this.a = c7532v32;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = c2017Zq;
        this.f = c5396jt0;
        this.g = proxy;
        this.h = proxySelector;
        C40 c40 = new C40();
        c40.i(sSLSocketFactory != null ? "https" : "http");
        c40.e(str);
        c40.g(i);
        this.i = c40.c();
        this.j = AbstractC0199Ch1.y(list);
        this.k = AbstractC0199Ch1.y(list2);
    }

    public final boolean a(C6575q3 c6575q3) {
        O90.f(c6575q3, "that");
        return O90.a(this.a, c6575q3.a) && O90.a(this.f, c6575q3.f) && O90.a(this.j, c6575q3.j) && O90.a(this.k, c6575q3.k) && O90.a(this.h, c6575q3.h) && O90.a(this.g, c6575q3.g) && O90.a(this.c, c6575q3.c) && O90.a(this.d, c6575q3.d) && O90.a(this.e, c6575q3.e) && this.i.e == c6575q3.i.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6575q3) {
            C6575q3 c6575q3 = (C6575q3) obj;
            if (O90.a(this.i, c6575q3.i) && a(c6575q3)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + AbstractC1705Vq.e(527, 31, this.i.h)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        D40 d40 = this.i;
        sb.append(d40.d);
        sb.append(':');
        sb.append(d40.e);
        sb.append(", ");
        Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.h;
        }
        return F91.v(sb, str, '}');
    }
}
