package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: q3 */
/* loaded from: classes2.dex */
public final class C6656q3 {

    /* renamed from: a */
    public final C11370v32 f40529a;

    /* renamed from: b */
    public final SocketFactory f40530b;

    /* renamed from: c */
    public final SSLSocketFactory f40531c;

    /* renamed from: d */
    public final HostnameVerifier f40532d;

    /* renamed from: e */
    public final C1626Zq f40533e;

    /* renamed from: f */
    public final C9937jt0 f40534f;

    /* renamed from: g */
    public final Proxy f40535g;

    /* renamed from: h */
    public final ProxySelector f40536h;

    /* renamed from: i */
    public final D40 f40537i;

    /* renamed from: j */
    public final List f40538j;

    /* renamed from: k */
    public final List f40539k;

    public C6656q3(String str, int i, C11370v32 c11370v32, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1626Zq c1626Zq, C9937jt0 c9937jt0, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        O90.m5968f(str, "uriHost");
        O90.m5968f(c11370v32, "dns");
        O90.m5968f(socketFactory, "socketFactory");
        O90.m5968f(c9937jt0, "proxyAuthenticator");
        O90.m5968f(list, "protocols");
        O90.m5968f(list2, "connectionSpecs");
        O90.m5968f(proxySelector, "proxySelector");
        this.f40529a = c11370v32;
        this.f40530b = socketFactory;
        this.f40531c = sSLSocketFactory;
        this.f40532d = hostnameVerifier;
        this.f40533e = c1626Zq;
        this.f40534f = c9937jt0;
        this.f40535g = proxy;
        this.f40536h = proxySelector;
        C40 c40 = new C40();
        c40.m976i(sSLSocketFactory != null ? "https" : "http");
        c40.m972e(str);
        c40.m974g(i);
        this.f40537i = c40.m970c();
        this.f40538j = AbstractC7433Ch1.m1296y(list);
        this.f40539k = AbstractC7433Ch1.m1296y(list2);
    }

    /* renamed from: a */
    public final boolean m23929a(C6656q3 c6656q3) {
        O90.m5968f(c6656q3, "that");
        return O90.m5963a(this.f40529a, c6656q3.f40529a) && O90.m5963a(this.f40534f, c6656q3.f40534f) && O90.m5963a(this.f40538j, c6656q3.f40538j) && O90.m5963a(this.f40539k, c6656q3.f40539k) && O90.m5963a(this.f40536h, c6656q3.f40536h) && O90.m5963a(this.f40535g, c6656q3.f40535g) && O90.m5963a(this.f40531c, c6656q3.f40531c) && O90.m5963a(this.f40532d, c6656q3.f40532d) && O90.m5963a(this.f40533e, c6656q3.f40533e) && this.f40537i.f1832e == c6656q3.f40537i.f1832e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6656q3) {
            C6656q3 c6656q3 = (C6656q3) obj;
            if (O90.m5963a(this.f40537i, c6656q3.f40537i) && m23929a(c6656q3)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f40533e) + ((Objects.hashCode(this.f40532d) + ((Objects.hashCode(this.f40531c) + ((Objects.hashCode(this.f40535g) + ((this.f40536h.hashCode() + ((this.f40539k.hashCode() + ((this.f40538j.hashCode() + ((this.f40534f.hashCode() + ((this.f40529a.hashCode() + AbstractC1374Vq.m8586e(527, 31, this.f40537i.f1835h)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        D40 d40 = this.f40537i;
        sb.append(d40.f1831d);
        sb.append(':');
        sb.append(d40.f1832e);
        sb.append(", ");
        Proxy proxy = this.f40535g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f40536h;
        }
        return F91.m2539v(sb, str, '}');
    }
}
