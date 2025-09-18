package p000;

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
public final class C10585ox0 implements Cloneable {

    /* renamed from: D */
    public static final List f39366D = AbstractC7433Ch1.m1284m(EnumC9219eG0.HTTP_2, EnumC9219eG0.HTTP_1_1);

    /* renamed from: E */
    public static final List f39367E = AbstractC7433Ch1.m1284m(C6712qx.f41258e, C6712qx.f41259f);

    /* renamed from: A */
    public final int f39368A;

    /* renamed from: B */
    public final long f39369B;

    /* renamed from: C */
    public final G10 f39370C;

    /* renamed from: a */
    public final C10919rY0 f39371a;

    /* renamed from: b */
    public final C7978Mu0 f39372b;

    /* renamed from: c */
    public final List f39373c;

    /* renamed from: d */
    public final List f39374d;

    /* renamed from: e */
    public final C1686an f39375e;

    /* renamed from: f */
    public final boolean f39376f;

    /* renamed from: g */
    public final C9937jt0 f39377g;

    /* renamed from: h */
    public final boolean f39378h;

    /* renamed from: i */
    public final boolean f39379i;

    /* renamed from: j */
    public final InterfaceC4213hz f39380j;

    /* renamed from: k */
    public final C1557Yk f39381k;

    /* renamed from: l */
    public final C11370v32 f39382l;

    /* renamed from: m */
    public final Proxy f39383m;

    /* renamed from: n */
    public final ProxySelector f39384n;

    /* renamed from: o */
    public final C9937jt0 f39385o;

    /* renamed from: p */
    public final SocketFactory f39386p;

    /* renamed from: q */
    public final SSLSocketFactory f39387q;

    /* renamed from: r */
    public final X509TrustManager f39388r;

    /* renamed from: s */
    public final List f39389s;

    /* renamed from: t */
    public final List f39390t;

    /* renamed from: u */
    public final HostnameVerifier f39391u;

    /* renamed from: v */
    public final C1626Zq f39392v;

    /* renamed from: w */
    public final AbstractC11164tS1 f39393w;

    /* renamed from: x */
    public final int f39394x;

    /* renamed from: y */
    public final int f39395y;

    /* renamed from: z */
    public final int f39396z;

    public C10585ox0(C10457nx0 c10457nx0) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.f39371a = c10457nx0.f38622a;
        this.f39372b = c10457nx0.f38623b;
        this.f39373c = AbstractC7433Ch1.m1296y(c10457nx0.f38624c);
        this.f39374d = AbstractC7433Ch1.m1296y(c10457nx0.f38625d);
        this.f39375e = c10457nx0.f38626e;
        this.f39376f = c10457nx0.f38627f;
        this.f39377g = c10457nx0.f38628g;
        this.f39378h = c10457nx0.f38629h;
        this.f39379i = c10457nx0.f38630i;
        this.f39380j = c10457nx0.f38631j;
        this.f39381k = c10457nx0.f38632k;
        this.f39382l = c10457nx0.f38633l;
        Proxy proxy = c10457nx0.f38634m;
        this.f39383m = proxy;
        if (proxy != null) {
            proxySelector = C11987zw0.f47106a;
        } else {
            proxySelector = c10457nx0.f38635n;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C11987zw0.f47106a;
            }
        }
        this.f39384n = proxySelector;
        this.f39385o = c10457nx0.f38636o;
        this.f39386p = c10457nx0.f38637p;
        List list = c10457nx0.f38640s;
        this.f39389s = list;
        this.f39390t = c10457nx0.f38641t;
        this.f39391u = c10457nx0.f38642u;
        this.f39394x = c10457nx0.f38645x;
        this.f39395y = c10457nx0.f38646y;
        this.f39396z = c10457nx0.f38647z;
        this.f39368A = c10457nx0.f38619A;
        this.f39369B = c10457nx0.f38620B;
        G10 g10 = c10457nx0.f38621C;
        this.f39370C = g10 == null ? new G10(29) : g10;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f39387q = null;
            this.f39393w = null;
            this.f39388r = null;
            this.f39392v = C1626Zq.f15146c;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((C6712qx) it.next()).f41260a) {
                    SSLSocketFactory sSLSocketFactory = c10457nx0.f38638q;
                    if (sSLSocketFactory != null) {
                        this.f39387q = sSLSocketFactory;
                        AbstractC11164tS1 abstractC11164tS1 = c10457nx0.f38644w;
                        O90.m5965c(abstractC11164tS1);
                        this.f39393w = abstractC11164tS1;
                        X509TrustManager x509TrustManager = c10457nx0.f38639r;
                        O90.m5965c(x509TrustManager);
                        this.f39388r = x509TrustManager;
                        C1626Zq c1626Zq = c10457nx0.f38643v;
                        c1626Zq.getClass();
                        this.f39392v = O90.m5963a(c1626Zq.f15148b, abstractC11164tS1) ? c1626Zq : new C1626Zq(c1626Zq.f15147a, abstractC11164tS1);
                    } else {
                        C10745qB0 c10745qB0 = C10745qB0.f40658a;
                        X509TrustManager x509TrustManagerMo8122n = C10745qB0.f40658a.mo8122n();
                        this.f39388r = x509TrustManagerMo8122n;
                        this.f39387q = C10745qB0.f40658a.mo23952m(x509TrustManagerMo8122n);
                        AbstractC11164tS1 abstractC11164tS1Mo9669b = C10745qB0.f40658a.mo9669b(x509TrustManagerMo8122n);
                        this.f39393w = abstractC11164tS1Mo9669b;
                        C1626Zq c1626Zq2 = c10457nx0.f38643v;
                        c1626Zq2.getClass();
                        this.f39392v = O90.m5963a(c1626Zq2.f15148b, abstractC11164tS1Mo9669b) ? c1626Zq2 : new C1626Zq(c1626Zq2.f15147a, abstractC11164tS1Mo9669b);
                    }
                }
            }
            this.f39387q = null;
            this.f39393w = null;
            this.f39388r = null;
            this.f39392v = C1626Zq.f15146c;
        }
        List list3 = this.f39373c;
        O90.m5966d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List list4 = this.f39374d;
        O90.m5966d(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List list5 = this.f39389s;
        boolean z = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.f39388r;
        AbstractC11164tS1 abstractC11164tS12 = this.f39393w;
        SSLSocketFactory sSLSocketFactory2 = this.f39387q;
        if (!z || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((C6712qx) it2.next()).f41260a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (abstractC11164tS12 == null) {
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
        if (abstractC11164tS12 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!O90.m5963a(this.f39392v, C1626Zq.f15146c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: a */
    public final C10457nx0 m23579a() {
        C10457nx0 c10457nx0 = new C10457nx0();
        c10457nx0.f38622a = this.f39371a;
        c10457nx0.f38623b = this.f39372b;
        AbstractC0246Du.m1920m(c10457nx0.f38624c, this.f39373c);
        AbstractC0246Du.m1920m(c10457nx0.f38625d, this.f39374d);
        c10457nx0.f38626e = this.f39375e;
        c10457nx0.f38627f = this.f39376f;
        c10457nx0.f38628g = this.f39377g;
        c10457nx0.f38629h = this.f39378h;
        c10457nx0.f38630i = this.f39379i;
        c10457nx0.f38631j = this.f39380j;
        c10457nx0.f38632k = this.f39381k;
        c10457nx0.f38633l = this.f39382l;
        c10457nx0.f38634m = this.f39383m;
        c10457nx0.f38635n = this.f39384n;
        c10457nx0.f38636o = this.f39385o;
        c10457nx0.f38637p = this.f39386p;
        c10457nx0.f38638q = this.f39387q;
        c10457nx0.f38639r = this.f39388r;
        c10457nx0.f38640s = this.f39389s;
        c10457nx0.f38641t = this.f39390t;
        c10457nx0.f38642u = this.f39391u;
        c10457nx0.f38643v = this.f39392v;
        c10457nx0.f38644w = this.f39393w;
        c10457nx0.f38645x = this.f39394x;
        c10457nx0.f38646y = this.f39395y;
        c10457nx0.f38647z = this.f39396z;
        c10457nx0.f38619A = this.f39368A;
        c10457nx0.f38620B = this.f39369B;
        c10457nx0.f38621C = this.f39370C;
        return c10457nx0;
    }

    /* renamed from: b */
    public final DN0 m23580b(C10777qR0 c10777qR0) {
        O90.m5968f(c10777qR0, "request");
        return new DN0(this, c10777qR0, false);
    }

    /* renamed from: c */
    public final MN0 m23581c(C10777qR0 c10777qR0, Y02 y02) {
        MN0 mn0 = new MN0(C8817b91.f16828h, c10777qR0, y02, new Random(), 0, this.f39369B);
        if (c10777qR0.f40872c.m4524b("Sec-WebSocket-Extensions") != null) {
            mn0.m5351c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            C10457nx0 c10457nx0M23579a = m23579a();
            c10457nx0M23579a.f38626e = new C1686an();
            List list = MN0.f7118w;
            O90.m5968f(list, "protocols");
            ArrayList arrayListM25984d0 = AbstractC7167xu.m25984d0(list);
            EnumC9219eG0 enumC9219eG0 = EnumC9219eG0.H2_PRIOR_KNOWLEDGE;
            if (!arrayListM25984d0.contains(enumC9219eG0) && !arrayListM25984d0.contains(EnumC9219eG0.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListM25984d0).toString());
            }
            if (arrayListM25984d0.contains(enumC9219eG0) && arrayListM25984d0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListM25984d0).toString());
            }
            if (arrayListM25984d0.contains(EnumC9219eG0.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListM25984d0).toString());
            }
            if (arrayListM25984d0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayListM25984d0.remove(EnumC9219eG0.SPDY_3);
            if (!arrayListM25984d0.equals(c10457nx0M23579a.f38641t)) {
                c10457nx0M23579a.f38621C = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayListM25984d0);
            O90.m5967e(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            c10457nx0M23579a.f38641t = listUnmodifiableList;
            C10585ox0 c10585ox0 = new C10585ox0(c10457nx0M23579a);
            C6937uF c6937uFM23998a = c10777qR0.m23998a();
            c6937uFM23998a.m25145y("Upgrade", "websocket");
            c6937uFM23998a.m25145y("Connection", "Upgrade");
            c6937uFM23998a.m25145y("Sec-WebSocket-Key", mn0.f7124f);
            c6937uFM23998a.m25145y("Sec-WebSocket-Version", "13");
            c6937uFM23998a.m25145y("Sec-WebSocket-Extensions", "permessage-deflate");
            C10777qR0 c10777qR0M25141o = c6937uFM23998a.m25141o();
            DN0 dn0 = new DN0(c10585ox0, c10777qR0M25141o, true);
            mn0.f7125g = dn0;
            dn0.m1669f(new C1339VH(mn0, c10777qR0M25141o, false, 19));
        }
        return mn0;
    }

    public final Object clone() {
        return super.clone();
    }

    public C10585ox0() {
        this(new C10457nx0());
    }
}
