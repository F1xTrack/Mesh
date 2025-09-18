package defpackage;

import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: ox0 */
/* loaded from: classes2.dex */
public final class C6363ox0 implements Cloneable {
    public static final List D = AbstractC0199Ch1.m(EnumC3548eG0.HTTP_2, EnumC3548eG0.HTTP_1_1);
    public static final List E = AbstractC0199Ch1.m(C6744qx.e, C6744qx.f);
    public final int A;
    public final long B;
    public final G10 C;
    public final C6860rY0 a;
    public final C1016Mu0 b;
    public final List c;
    public final List d;
    public final C2199an e;
    public final boolean f;
    public final C5396jt0 g;
    public final boolean h;
    public final boolean i;
    public final InterfaceC4255hz j;
    public final C1921Yk k;
    public final C7532v32 l;
    public final Proxy m;
    public final ProxySelector n;
    public final C5396jt0 o;
    public final SocketFactory p;
    public final SSLSocketFactory q;
    public final X509TrustManager r;
    public final List s;
    public final List t;
    public final HostnameVerifier u;
    public final C2017Zq v;
    public final AbstractC7225tS1 w;
    public final int x;
    public final int y;
    public final int z;

    public C6363ox0(C6172nx0 c6172nx0) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.a = c6172nx0.a;
        this.b = c6172nx0.b;
        this.c = AbstractC0199Ch1.y(c6172nx0.c);
        this.d = AbstractC0199Ch1.y(c6172nx0.d);
        this.e = c6172nx0.e;
        this.f = c6172nx0.f;
        this.g = c6172nx0.g;
        this.h = c6172nx0.h;
        this.i = c6172nx0.i;
        this.j = c6172nx0.j;
        this.k = c6172nx0.k;
        this.l = c6172nx0.l;
        Proxy proxy = c6172nx0.m;
        this.m = proxy;
        if (proxy != null) {
            proxySelector = C8456zw0.a;
        } else {
            proxySelector = c6172nx0.n;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C8456zw0.a;
            }
        }
        this.n = proxySelector;
        this.o = c6172nx0.o;
        this.p = c6172nx0.p;
        List list = c6172nx0.s;
        this.s = list;
        this.t = c6172nx0.t;
        this.u = c6172nx0.u;
        this.x = c6172nx0.x;
        this.y = c6172nx0.y;
        this.z = c6172nx0.z;
        this.A = c6172nx0.A;
        this.B = c6172nx0.B;
        G10 g10 = c6172nx0.C;
        this.C = g10 == null ? new G10(29) : g10;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.q = null;
            this.w = null;
            this.r = null;
            this.v = C2017Zq.c;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((C6744qx) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = c6172nx0.q;
                    if (sSLSocketFactory != null) {
                        this.q = sSLSocketFactory;
                        AbstractC7225tS1 abstractC7225tS1 = c6172nx0.w;
                        O90.c(abstractC7225tS1);
                        this.w = abstractC7225tS1;
                        X509TrustManager x509TrustManager = c6172nx0.r;
                        O90.c(x509TrustManager);
                        this.r = x509TrustManager;
                        C2017Zq c2017Zq = c6172nx0.v;
                        c2017Zq.getClass();
                        this.v = O90.a(c2017Zq.b, abstractC7225tS1) ? c2017Zq : new C2017Zq(c2017Zq.a, abstractC7225tS1);
                    } else {
                        C6601qB0 c6601qB0 = C6601qB0.a;
                        X509TrustManager x509TrustManagerN = C6601qB0.a.n();
                        this.r = x509TrustManagerN;
                        this.q = C6601qB0.a.m(x509TrustManagerN);
                        AbstractC7225tS1 abstractC7225tS1B = C6601qB0.a.b(x509TrustManagerN);
                        this.w = abstractC7225tS1B;
                        C2017Zq c2017Zq2 = c6172nx0.v;
                        c2017Zq2.getClass();
                        this.v = O90.a(c2017Zq2.b, abstractC7225tS1B) ? c2017Zq2 : new C2017Zq(c2017Zq2.a, abstractC7225tS1B);
                    }
                }
            }
            this.q = null;
            this.w = null;
            this.r = null;
            this.v = C2017Zq.c;
        }
        List list3 = this.c;
        O90.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List list4 = this.d;
        O90.d(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List list5 = this.s;
        boolean z = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.r;
        AbstractC7225tS1 abstractC7225tS12 = this.w;
        SSLSocketFactory sSLSocketFactory2 = this.q;
        if (!z || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((C6744qx) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (abstractC7225tS12 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (abstractC7225tS12 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!O90.a(this.v, C2017Zq.c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final C6172nx0 a() {
        C6172nx0 c6172nx0 = new C6172nx0();
        c6172nx0.a = this.a;
        c6172nx0.b = this.b;
        AbstractC0314Du.m(c6172nx0.c, this.c);
        AbstractC0314Du.m(c6172nx0.d, this.d);
        c6172nx0.e = this.e;
        c6172nx0.f = this.f;
        c6172nx0.g = this.g;
        c6172nx0.h = this.h;
        c6172nx0.i = this.i;
        c6172nx0.j = this.j;
        c6172nx0.k = this.k;
        c6172nx0.l = this.l;
        c6172nx0.m = this.m;
        c6172nx0.n = this.n;
        c6172nx0.o = this.o;
        c6172nx0.p = this.p;
        c6172nx0.q = this.q;
        c6172nx0.r = this.r;
        c6172nx0.s = this.s;
        c6172nx0.t = this.t;
        c6172nx0.u = this.u;
        c6172nx0.v = this.v;
        c6172nx0.w = this.w;
        c6172nx0.x = this.x;
        c6172nx0.y = this.y;
        c6172nx0.z = this.z;
        c6172nx0.A = this.A;
        c6172nx0.B = this.B;
        c6172nx0.C = this.C;
        return c6172nx0;
    }

    public final DN0 b(C6649qR0 c6649qR0) {
        O90.f(c6649qR0, "request");
        return new DN0(this, c6649qR0, false);
    }

    public final MN0 c(C6649qR0 c6649qR0, Y02 y02) {
        MN0 mn0 = new MN0(C2272b91.h, c6649qR0, y02, new Random(), 0, this.B);
        if (c6649qR0.c.b("Sec-WebSocket-Extensions") != null) {
            mn0.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            C6172nx0 c6172nx0A = a();
            c6172nx0A.e = new C2199an();
            List list = MN0.w;
            O90.f(list, "protocols");
            ArrayList arrayListD0 = AbstractC8069xu.d0(list);
            EnumC3548eG0 enumC3548eG0 = EnumC3548eG0.H2_PRIOR_KNOWLEDGE;
            if (!arrayListD0.contains(enumC3548eG0) && !arrayListD0.contains(EnumC3548eG0.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListD0).toString());
            }
            if (arrayListD0.contains(enumC3548eG0) && arrayListD0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListD0).toString());
            }
            if (arrayListD0.contains(EnumC3548eG0.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListD0).toString());
            }
            if (arrayListD0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayListD0.remove(EnumC3548eG0.SPDY_3);
            if (!arrayListD0.equals(c6172nx0A.t)) {
                c6172nx0A.C = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayListD0);
            O90.e(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            c6172nx0A.t = listUnmodifiableList;
            C6363ox0 c6363ox0 = new C6363ox0(c6172nx0A);
            C7375uF c7375uFA = c6649qR0.a();
            c7375uFA.y("Upgrade", "websocket");
            c7375uFA.y("Connection", "Upgrade");
            c7375uFA.y("Sec-WebSocket-Key", mn0.f);
            c7375uFA.y("Sec-WebSocket-Version", "13");
            c7375uFA.y("Sec-WebSocket-Extensions", "permessage-deflate");
            C6649qR0 c6649qR0O = c7375uFA.o();
            DN0 dn0 = new DN0(c6363ox0, c6649qR0O, true);
            mn0.g = dn0;
            dn0.f(new VH(mn0, c6649qR0O, false, 19));
        }
        return mn0;
    }

    public final Object clone() {
        return super.clone();
    }

    public C6363ox0() {
        this(new C6172nx0());
    }
}
