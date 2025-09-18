package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class FN0 extends AbstractC8806b40 {

    /* renamed from: b */
    public final OT0 f3174b;

    /* renamed from: c */
    public Socket f3175c;

    /* renamed from: d */
    public Socket f3176d;

    /* renamed from: e */
    public E20 f3177e;

    /* renamed from: f */
    public EnumC9219eG0 f3178f;

    /* renamed from: g */
    public C9579h40 f3179g;

    /* renamed from: h */
    public C11917zN0 f3180h;

    /* renamed from: i */
    public C11790yN0 f3181i;

    /* renamed from: j */
    public boolean f3182j;

    /* renamed from: k */
    public boolean f3183k;

    /* renamed from: l */
    public int f3184l;

    /* renamed from: m */
    public int f3185m;

    /* renamed from: n */
    public int f3186n;

    /* renamed from: o */
    public int f3187o;

    /* renamed from: p */
    public final ArrayList f3188p;

    /* renamed from: q */
    public long f3189q;

    public FN0(C0974PT c0974pt, OT0 ot0) {
        O90.m5968f(c0974pt, "connectionPool");
        O90.m5968f(ot0, "route");
        this.f3174b = ot0;
        this.f3187o = 1;
        this.f3188p = new ArrayList();
        this.f3189q = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static void m2605d(C10585ox0 c10585ox0, OT0 ot0, IOException iOException) {
        O90.m5968f(c10585ox0, "client");
        O90.m5968f(ot0, "failedRoute");
        O90.m5968f(iOException, "failure");
        if (ot0.f8455b.type() != Proxy.Type.DIRECT) {
            C6656q3 c6656q3 = ot0.f8454a;
            c6656q3.f40536h.connectFailed(c6656q3.f40537i.m1535h(), ot0.f8455b.address(), iOException);
        }
        G10 g10 = c10585ox0.f39370C;
        synchronized (g10) {
            ((LinkedHashSet) g10.f3531b).add(ot0);
        }
    }

    @Override // p000.AbstractC8806b40
    /* renamed from: a */
    public final synchronized void mo2606a(C9579h40 c9579h40, AZ0 az0) {
        O90.m5968f(c9579h40, "connection");
        O90.m5968f(az0, "settings");
        this.f3187o = (az0.f248a & 16) != 0 ? az0.f249b[4] : Integer.MAX_VALUE;
    }

    @Override // p000.AbstractC8806b40
    /* renamed from: b */
    public final void mo2607b(C10475o40 c10475o40) {
        c10475o40.m23331c(8, null);
    }

    /* renamed from: c */
    public final void m2608c(int i, int i2, int i3, boolean z, InterfaceC6843sl interfaceC6843sl) throws Throwable {
        OT0 ot0;
        O90.m5968f(interfaceC6843sl, "call");
        if (this.f3178f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3174b.f8454a.f40539k;
        C6792rx c6792rx = new C6792rx(list);
        C6656q3 c6656q3 = this.f3174b.f8454a;
        if (c6656q3.f40531c == null) {
            if (!list.contains(C6712qx.f41259f)) {
                throw new PT0(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3174b.f8454a.f40537i.f1831d;
            C10745qB0 c10745qB0 = C10745qB0.f40658a;
            if (!C10745qB0.f40658a.mo9670h(str)) {
                throw new PT0(new UnknownServiceException(AbstractC7222ym.m26234k("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c6656q3.f40538j.contains(EnumC9219eG0.H2_PRIOR_KNOWLEDGE)) {
            throw new PT0(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        PT0 pt0 = null;
        do {
            try {
                OT0 ot02 = this.f3174b;
                if (ot02.f8454a.f40531c != null && ot02.f8455b.type() == Proxy.Type.HTTP) {
                    m2610f(i, i2, i3, interfaceC6843sl);
                    if (this.f3175c == null) {
                    }
                    ot0 = this.f3174b;
                    if (ot0.f8454a.f40531c == null && ot0.f8455b.type() == Proxy.Type.HTTP && this.f3175c == null) {
                        throw new PT0(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f3189q = System.nanoTime();
                    return;
                }
                m2609e(i, i2, interfaceC6843sl);
                m2611g(c6792rx, interfaceC6843sl);
                O90.m5968f(this.f3174b.f8456c, "inetSocketAddress");
                ot0 = this.f3174b;
                if (ot0.f8454a.f40531c == null) {
                }
                this.f3189q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.f3176d;
                if (socket != null) {
                    AbstractC7433Ch1.m1276e(socket);
                }
                Socket socket2 = this.f3175c;
                if (socket2 != null) {
                    AbstractC7433Ch1.m1276e(socket2);
                }
                this.f3176d = null;
                this.f3175c = null;
                this.f3180h = null;
                this.f3181i = null;
                this.f3177e = null;
                this.f3178f = null;
                this.f3179g = null;
                this.f3187o = 1;
                O90.m5968f(this.f3174b.f8456c, "inetSocketAddress");
                if (pt0 == null) {
                    pt0 = new PT0(e);
                } else {
                    I02.m3687a(pt0.f9082a, e);
                    pt0.f9083b = e;
                }
                if (!z) {
                    throw pt0;
                }
                c6792rx.f42172c = true;
                if (!c6792rx.f42171b) {
                    throw pt0;
                }
                if (e instanceof ProtocolException) {
                    throw pt0;
                }
                if (e instanceof InterruptedIOException) {
                    throw pt0;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw pt0;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw pt0;
                }
            }
        } while (e instanceof SSLException);
        throw pt0;
    }

    /* renamed from: e */
    public final void m2609e(int i, int i2, InterfaceC6843sl interfaceC6843sl) throws IOException {
        Socket socketCreateSocket;
        OT0 ot0 = this.f3174b;
        Proxy proxy = ot0.f8455b;
        C6656q3 c6656q3 = ot0.f8454a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : EN0.f2676a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = c6656q3.f40530b.createSocket();
            O90.m5965c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f3175c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f3174b.f8456c;
        O90.m5968f(interfaceC6843sl, "call");
        O90.m5968f(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i2);
        try {
            C10745qB0 c10745qB0 = C10745qB0.f40658a;
            C10745qB0.f40658a.mo23949e(socketCreateSocket, this.f3174b.f8456c, i);
            try {
                this.f3180h = JI1.m4274b(JI1.m4280h(socketCreateSocket));
                this.f3181i = JI1.m4273a(JI1.m4277e(socketCreateSocket));
            } catch (NullPointerException e) {
                if (O90.m5963a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3174b.f8456c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void m2610f(int i, int i2, int i3, InterfaceC6843sl interfaceC6843sl) throws IOException {
        C6937uF c6937uF = new C6937uF(9, false);
        OT0 ot0 = this.f3174b;
        D40 d40 = ot0.f8454a.f40537i;
        O90.m5968f(d40, "url");
        c6937uF.f43616a = d40;
        c6937uF.m25130A("CONNECT", null);
        C6656q3 c6656q3 = ot0.f8454a;
        c6937uF.m25145y("Host", AbstractC7433Ch1.m1295x(c6656q3.f40537i, true));
        c6937uF.m25145y("Proxy-Connection", "Keep-Alive");
        c6937uF.m25145y("User-Agent", "okhttp/4.12.0");
        C10777qR0 c10777qR0M25141o = c6937uF.m25141o();
        J20 j20 = new J20();
        K12.m4520a("Proxy-Authenticate");
        K12.m4521b("OkHttp-Preemptive", "Proxy-Authenticate");
        j20.m4142i("Proxy-Authenticate");
        j20.m4137d("Proxy-Authenticate", "OkHttp-Preemptive");
        j20.m4140g();
        c6656q3.f40534f.getClass();
        m2609e(i, i2, interfaceC6843sl);
        String str = "CONNECT " + AbstractC7433Ch1.m1295x(c10777qR0M25141o.f40870a, true) + " HTTP/1.1";
        C11917zN0 c11917zN0 = this.f3180h;
        O90.m5965c(c11917zN0);
        C11790yN0 c11790yN0 = this.f3181i;
        O90.m5965c(c11790yN0);
        C6250je c6250je = new C6250je(null, this, c11917zN0, c11790yN0);
        C7523Ea1 c7523Ea1Mo97r = c11917zN0.f46809a.mo97r();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7523Ea1Mo97r.mo1730g(j, timeUnit);
        c11790yN0.f46236a.mo2329r().mo1730g(i3, timeUnit);
        c6250je.m22083m(c10777qR0M25141o.f40872c, str);
        c6250je.mo8997c();
        GS0 gs0Mo9000f = c6250je.mo9000f(false);
        O90.m5965c(gs0Mo9000f);
        gs0Mo9000f.f3741a = c10777qR0M25141o;
        HS0 hs0M3066a = gs0Mo9000f.m3066a();
        long jM1283l = AbstractC7433Ch1.m1283l(hs0M3066a);
        if (jM1283l != -1) {
            X30 x30M22081k = c6250je.m22081k(jM1283l);
            AbstractC7433Ch1.m1293v(x30M22081k, Integer.MAX_VALUE, timeUnit);
            x30M22081k.close();
        }
        int i4 = hs0M3066a.f4298d;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(AbstractC11153tN0.m24909u(i4, "Unexpected response code for CONNECT: "));
            }
            c6656q3.f40534f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c11917zN0.f46810b.m23200w() || !c11790yN0.f46237b.m23200w()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: g */
    public final void m2611g(C6792rx c6792rx, InterfaceC6843sl interfaceC6843sl) throws Throwable {
        SSLSocket sSLSocket;
        C6656q3 c6656q3 = this.f3174b.f8454a;
        SSLSocketFactory sSLSocketFactory = c6656q3.f40531c;
        EnumC9219eG0 enumC9219eG0M19023b = EnumC9219eG0.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c6656q3.f40538j;
            EnumC9219eG0 enumC9219eG0 = EnumC9219eG0.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC9219eG0)) {
                this.f3176d = this.f3175c;
                this.f3178f = enumC9219eG0M19023b;
                return;
            } else {
                this.f3176d = this.f3175c;
                this.f3178f = enumC9219eG0;
                m2617m();
                return;
            }
        }
        O90.m5968f(interfaceC6843sl, "call");
        C6656q3 c6656q32 = this.f3174b.f8454a;
        SSLSocketFactory sSLSocketFactory2 = c6656q32.f40531c;
        SSLSocket sSLSocket2 = null;
        String strMo5409f = null;
        try {
            O90.m5965c(sSLSocketFactory2);
            Socket socket = this.f3175c;
            D40 d40 = c6656q32.f40537i;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, d40.f1831d, d40.f1832e, true);
            O90.m5966d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C6712qx c6712qxM24552a = c6792rx.m24552a(sSLSocket);
            if (c6712qxM24552a.f41261b) {
                C10745qB0 c10745qB0 = C10745qB0.f40658a;
                C10745qB0.f40658a.mo5408d(sSLSocket, c6656q32.f40537i.f1831d, c6656q32.f40538j);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            O90.m5967e(session, "sslSocketSession");
            E20 e20M3731a = I12.m3731a(session);
            HostnameVerifier hostnameVerifier = c6656q32.f40532d;
            O90.m5965c(hostnameVerifier);
            if (hostnameVerifier.verify(c6656q32.f40537i.f1831d, session)) {
                C1626Zq c1626Zq = c6656q32.f40533e;
                O90.m5965c(c1626Zq);
                this.f3177e = new E20(e20M3731a.f2357a, e20M3731a.f2358b, e20M3731a.f2359c, new C1563Yq(c1626Zq, e20M3731a, c6656q32, 5));
                c1626Zq.m9613a(c6656q32.f40537i.f1831d, new C10801qd0(18, this));
                if (c6712qxM24552a.f41261b) {
                    C10745qB0 c10745qB02 = C10745qB0.f40658a;
                    strMo5409f = C10745qB0.f40658a.mo5409f(sSLSocket);
                }
                this.f3176d = sSLSocket;
                this.f3180h = JI1.m4274b(JI1.m4280h(sSLSocket));
                this.f3181i = JI1.m4273a(JI1.m4277e(sSLSocket));
                if (strMo5409f != null) {
                    enumC9219eG0M19023b = AbstractC9746iN1.m19023b(strMo5409f);
                }
                this.f3178f = enumC9219eG0M19023b;
                C10745qB0 c10745qB03 = C10745qB0.f40658a;
                C10745qB0.f40658a.mo5407a(sSLSocket);
                if (this.f3178f == EnumC9219eG0.HTTP_2) {
                    m2617m();
                    return;
                }
                return;
            }
            List listM1987a = e20M3731a.m1987a();
            if (listM1987a.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c6656q32.f40537i.f1831d + " not verified (no certificates)");
            }
            Object obj = listM1987a.get(0);
            O90.m5966d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n              |Hostname ");
            sb.append(c6656q32.f40537i.f1831d);
            sb.append(" not verified:\n              |    certificate: ");
            C1626Zq c1626Zq2 = C1626Zq.f15146c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            C0551Ik c0551Ik = C0551Ik.f5116d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            O90.m5967e(encoded, "publicKey.encoded");
            sb2.append(C1210TE.m7636L(encoded).mo3982b("SHA-256").mo3981a());
            sb.append(sb2.toString());
            sb.append("\n              |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n              |    subjectAltNames: ");
            sb.append(AbstractC7167xu.m25968N(C10329mx0.m23023a(x509Certificate, 7), C10329mx0.m23023a(x509Certificate, 2)));
            sb.append("\n              ");
            throw new SSLPeerUnverifiedException(AbstractC11501w51.m25563d(sb.toString()));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C10745qB0 c10745qB04 = C10745qB0.f40658a;
                C10745qB0.f40658a.mo5407a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                AbstractC7433Ch1.m1276e(sSLSocket2);
            }
            throw th;
        }
    }

    /* renamed from: h */
    public final synchronized void m2612h() {
        this.f3185m++;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2613i(p000.C6656q3 r9, java.util.List r10) {
        /*
            r8 = this;
            r0 = 0
            byte[] r1 = p000.AbstractC7433Ch1.f1577a
            java.util.ArrayList r1 = r8.f3188p
            int r1 = r1.size()
            int r2 = r8.f3187o
            if (r1 >= r2) goto Ld8
            boolean r1 = r8.f3182j
            if (r1 == 0) goto L13
            goto Ld8
        L13:
            OT0 r1 = r8.f3174b
            q3 r2 = r1.f8454a
            boolean r2 = r2.m23929a(r9)
            if (r2 != 0) goto L1e
            return r0
        L1e:
            D40 r2 = r9.f40537i
            java.lang.String r3 = r2.f1831d
            q3 r4 = r1.f8454a
            D40 r5 = r4.f40537i
            java.lang.String r5 = r5.f1831d
            boolean r3 = p000.O90.m5963a(r3, r5)
            r5 = 1
            if (r3 == 0) goto L30
            return r5
        L30:
            h40 r3 = r8.f3179g
            if (r3 != 0) goto L35
            return r0
        L35:
            if (r10 == 0) goto Ld8
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r3 = r10 instanceof java.util.Collection
            if (r3 == 0) goto L48
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L48
            goto Ld8
        L48:
            java.util.Iterator r10 = r10.iterator()
        L4c:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Ld8
            java.lang.Object r3 = r10.next()
            OT0 r3 = (p000.OT0) r3
            java.net.Proxy r6 = r3.f8455b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L4c
            java.net.Proxy r6 = r1.f8455b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L4c
            java.net.InetSocketAddress r3 = r3.f8456c
            java.net.InetSocketAddress r6 = r1.f8456c
            boolean r3 = p000.O90.m5963a(r6, r3)
            if (r3 == 0) goto L4c
            mx0 r10 = p000.C10329mx0.f38001b
            javax.net.ssl.HostnameVerifier r1 = r9.f40532d
            if (r1 == r10) goto L7b
            return r0
        L7b:
            byte[] r10 = p000.AbstractC7433Ch1.f1577a
            D40 r10 = r4.f40537i
            int r1 = r10.f1832e
            int r3 = r2.f1832e
            if (r3 == r1) goto L86
            goto Ld8
        L86:
            java.lang.String r10 = r10.f1831d
            java.lang.String r1 = r2.f1831d
            boolean r10 = p000.O90.m5963a(r1, r10)
            if (r10 == 0) goto L91
            goto Lb7
        L91:
            boolean r10 = r8.f3183k
            if (r10 != 0) goto Ld8
            E20 r10 = r8.f3177e
            if (r10 == 0) goto Ld8
            java.util.List r10 = r10.m1987a()
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Ld8
            java.lang.Object r10 = r10.get(r0)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            p000.O90.m5966d(r10, r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = p000.C10329mx0.m23025c(r10, r1)
            if (r10 == 0) goto Ld8
        Lb7:
            Zq r9 = r9.f40533e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            p000.O90.m5965c(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            E20 r10 = r8.f3177e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            p000.O90.m5965c(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            java.util.List r10 = r10.m1987a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            java.lang.String r2 = "hostname"
            p000.O90.m5968f(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            java.lang.String r2 = "peerCertificates"
            p000.O90.m5968f(r10, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            Yq r2 = new Yq     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            r2.<init>(r9, r10, r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            r9.m9613a(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            return r5
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.FN0.m2613i(q3, java.util.List):boolean");
    }

    /* renamed from: j */
    public final boolean m2614j(boolean z) throws SocketException {
        long j;
        byte[] bArr = AbstractC7433Ch1.f1577a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f3175c;
        O90.m5965c(socket);
        Socket socket2 = this.f3176d;
        O90.m5965c(socket2);
        C11917zN0 c11917zN0 = this.f3180h;
        O90.m5965c(c11917zN0);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C9579h40 c9579h40 = this.f3179g;
        if (c9579h40 != null) {
            return c9579h40.m18715e(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f3189q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z2 = !c11917zN0.m26387m();
                socket2.setSoTimeout(soTimeout);
                return z2;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: k */
    public final InterfaceC1473XP m2615k(C10585ox0 c10585ox0, GN0 gn0) throws SocketException {
        O90.m5968f(c10585ox0, "client");
        Socket socket = this.f3176d;
        O90.m5965c(socket);
        C11917zN0 c11917zN0 = this.f3180h;
        O90.m5965c(c11917zN0);
        C11790yN0 c11790yN0 = this.f3181i;
        O90.m5965c(c11790yN0);
        C9579h40 c9579h40 = this.f3179g;
        if (c9579h40 != null) {
            return new C9707i40(c10585ox0, this, gn0, c9579h40);
        }
        int i = gn0.f3717g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c11917zN0.f46809a.mo97r().mo1730g(i, timeUnit);
        c11790yN0.f46236a.mo2329r().mo1730g(gn0.f3718h, timeUnit);
        return new C6250je(c10585ox0, this, c11917zN0, c11790yN0);
    }

    /* renamed from: l */
    public final synchronized void m2616l() {
        this.f3182j = true;
    }

    /* renamed from: m */
    public final void m2617m() throws SocketException {
        Socket socket = this.f3176d;
        O90.m5965c(socket);
        C11917zN0 c11917zN0 = this.f3180h;
        O90.m5965c(c11917zN0);
        C11790yN0 c11790yN0 = this.f3181i;
        O90.m5965c(c11790yN0);
        socket.setSoTimeout(0);
        C8817b91 c8817b91 = C8817b91.f16828h;
        O90.m5968f(c8817b91, "taskRunner");
        U41 u41 = new U41();
        u41.f11644a = c8817b91;
        u41.f11649f = AbstractC8806b40.f16732a;
        String str = this.f3174b.f8454a.f40537i.f1831d;
        O90.m5968f(str, "peerName");
        u41.f11645b = socket;
        String str2 = AbstractC7433Ch1.f1583g + ' ' + str;
        O90.m5968f(str2, "<set-?>");
        u41.f11646c = str2;
        u41.f11647d = c11917zN0;
        u41.f11648e = c11790yN0;
        u41.f11649f = this;
        C9579h40 c9579h40 = new C9579h40(u41);
        this.f3179g = c9579h40;
        AZ0 az0 = C9579h40.f28213z;
        this.f3187o = (az0.f248a & 16) != 0 ? az0.f249b[4] : Integer.MAX_VALUE;
        C10603p40 c10603p40 = c9579h40.f28236w;
        synchronized (c10603p40) {
            try {
                if (c10603p40.f39772d) {
                    throw new IOException("closed");
                }
                Logger logger = C10603p40.f39768f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC7433Ch1.m1281j(">> CONNECTION " + Z30.f14674a.mo3984d(), new Object[0]));
                }
                c10603p40.f39769a.mo4398k0(Z30.f14674a);
                c10603p40.f39769a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        c9579h40.f28236w.m23604m(c9579h40.f28229p);
        if (c9579h40.f28229p.m230a() != 65535) {
            c9579h40.f28236w.m23605n(0, r1 - 65535);
        }
        c8817b91.m10429e().m9679c(new C6610pK(c9579h40.f28216c, c9579h40.f28237x, 3), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        OT0 ot0 = this.f3174b;
        sb.append(ot0.f8454a.f40537i.f1831d);
        sb.append(':');
        sb.append(ot0.f8454a.f40537i.f1832e);
        sb.append(", proxy=");
        sb.append(ot0.f8455b);
        sb.append(" hostAddress=");
        sb.append(ot0.f8456c);
        sb.append(" cipherSuite=");
        E20 e20 = this.f3177e;
        if (e20 == null || (obj = e20.f2358b) == null) {
            obj = LocalNotification.Importance.NONE;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3178f);
        sb.append('}');
        return sb.toString();
    }
}
