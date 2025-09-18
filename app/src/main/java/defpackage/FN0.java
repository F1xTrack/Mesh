package defpackage;

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
public final class FN0 extends AbstractC2256b40 {
    public final OT0 b;
    public Socket c;
    public Socket d;
    public E20 e;
    public EnumC3548eG0 f;
    public C4085h40 g;
    public C8351zN0 h;
    public C8161yN0 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public FN0(PT pt, OT0 ot0) {
        O90.f(pt, "connectionPool");
        O90.f(ot0, "route");
        this.b = ot0;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(C6363ox0 c6363ox0, OT0 ot0, IOException iOException) {
        O90.f(c6363ox0, "client");
        O90.f(ot0, "failedRoute");
        O90.f(iOException, "failure");
        if (ot0.b.type() != Proxy.Type.DIRECT) {
            C6575q3 c6575q3 = ot0.a;
            c6575q3.h.connectFailed(c6575q3.i.h(), ot0.b.address(), iOException);
        }
        G10 g10 = c6363ox0.C;
        synchronized (g10) {
            ((LinkedHashSet) g10.b).add(ot0);
        }
    }

    @Override // defpackage.AbstractC2256b40
    public final synchronized void a(C4085h40 c4085h40, AZ0 az0) {
        O90.f(c4085h40, "connection");
        O90.f(az0, "settings");
        this.o = (az0.a & 16) != 0 ? az0.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.AbstractC2256b40
    public final void b(C6198o40 c6198o40) {
        c6198o40.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, InterfaceC7089sl interfaceC7089sl) throws Throwable {
        OT0 ot0;
        O90.f(interfaceC7089sl, "call");
        if (this.f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.b.a.k;
        C6934rx c6934rx = new C6934rx(list);
        C6575q3 c6575q3 = this.b.a;
        if (c6575q3.c == null) {
            if (!list.contains(C6744qx.f)) {
                throw new PT0(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.i.d;
            C6601qB0 c6601qB0 = C6601qB0.a;
            if (!C6601qB0.a.h(str)) {
                throw new PT0(new UnknownServiceException(AbstractC8235ym.k("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c6575q3.j.contains(EnumC3548eG0.H2_PRIOR_KNOWLEDGE)) {
            throw new PT0(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        PT0 pt0 = null;
        do {
            try {
                OT0 ot02 = this.b;
                if (ot02.a.c != null && ot02.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, interfaceC7089sl);
                    if (this.c == null) {
                    }
                    ot0 = this.b;
                    if (ot0.a.c == null && ot0.b.type() == Proxy.Type.HTTP && this.c == null) {
                        throw new PT0(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.q = System.nanoTime();
                    return;
                }
                e(i, i2, interfaceC7089sl);
                g(c6934rx, interfaceC7089sl);
                O90.f(this.b.c, "inetSocketAddress");
                ot0 = this.b;
                if (ot0.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    AbstractC0199Ch1.e(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    AbstractC0199Ch1.e(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                O90.f(this.b.c, "inetSocketAddress");
                if (pt0 == null) {
                    pt0 = new PT0(e);
                } else {
                    I02.a(pt0.a, e);
                    pt0.b = e;
                }
                if (!z) {
                    throw pt0;
                }
                c6934rx.c = true;
                if (!c6934rx.b) {
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

    public final void e(int i, int i2, InterfaceC7089sl interfaceC7089sl) throws IOException {
        Socket socketCreateSocket;
        OT0 ot0 = this.b;
        Proxy proxy = ot0.b;
        C6575q3 c6575q3 = ot0.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : EN0.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = c6575q3.b.createSocket();
            O90.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.b.c;
        O90.f(interfaceC7089sl, "call");
        O90.f(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i2);
        try {
            C6601qB0 c6601qB0 = C6601qB0.a;
            C6601qB0.a.e(socketCreateSocket, this.b.c, i);
            try {
                this.h = JI1.b(JI1.h(socketCreateSocket));
                this.i = JI1.a(JI1.e(socketCreateSocket));
            } catch (NullPointerException e) {
                if (O90.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, InterfaceC7089sl interfaceC7089sl) throws IOException {
        C7375uF c7375uF = new C7375uF(9, false);
        OT0 ot0 = this.b;
        D40 d40 = ot0.a.i;
        O90.f(d40, "url");
        c7375uF.a = d40;
        c7375uF.A("CONNECT", null);
        C6575q3 c6575q3 = ot0.a;
        c7375uF.y("Host", AbstractC0199Ch1.x(c6575q3.i, true));
        c7375uF.y("Proxy-Connection", "Keep-Alive");
        c7375uF.y("User-Agent", "okhttp/4.12.0");
        C6649qR0 c6649qR0O = c7375uF.o();
        J20 j20 = new J20();
        K12.a("Proxy-Authenticate");
        K12.b("OkHttp-Preemptive", "Proxy-Authenticate");
        j20.i("Proxy-Authenticate");
        j20.d("Proxy-Authenticate", "OkHttp-Preemptive");
        j20.g();
        c6575q3.f.getClass();
        e(i, i2, interfaceC7089sl);
        String str = "CONNECT " + AbstractC0199Ch1.x(c6649qR0O.a, true) + " HTTP/1.1";
        C8351zN0 c8351zN0 = this.h;
        O90.c(c8351zN0);
        C8161yN0 c8161yN0 = this.i;
        O90.c(c8161yN0);
        C5350je c5350je = new C5350je(null, this, c8351zN0, c8161yN0);
        C0334Ea1 c0334Ea1R = c8351zN0.a.r();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0334Ea1R.g(j, timeUnit);
        c8161yN0.a.r().g(i3, timeUnit);
        c5350je.m(c6649qR0O.c, str);
        c5350je.c();
        GS0 gs0F = c5350je.f(false);
        O90.c(gs0F);
        gs0F.a = c6649qR0O;
        HS0 hs0A = gs0F.a();
        long jL = AbstractC0199Ch1.l(hs0A);
        if (jL != -1) {
            X30 x30K = c5350je.k(jL);
            AbstractC0199Ch1.v(x30K, Integer.MAX_VALUE, timeUnit);
            x30K.close();
        }
        int i4 = hs0A.d;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(AbstractC7209tN0.u(i4, "Unexpected response code for CONNECT: "));
            }
            c6575q3.f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c8351zN0.b.w() || !c8161yN0.b.w()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(C6934rx c6934rx, InterfaceC7089sl interfaceC7089sl) throws Throwable {
        SSLSocket sSLSocket;
        C6575q3 c6575q3 = this.b.a;
        SSLSocketFactory sSLSocketFactory = c6575q3.c;
        EnumC3548eG0 enumC3548eG0B = EnumC3548eG0.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c6575q3.j;
            EnumC3548eG0 enumC3548eG0 = EnumC3548eG0.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC3548eG0)) {
                this.d = this.c;
                this.f = enumC3548eG0B;
                return;
            } else {
                this.d = this.c;
                this.f = enumC3548eG0;
                m();
                return;
            }
        }
        O90.f(interfaceC7089sl, "call");
        C6575q3 c6575q32 = this.b.a;
        SSLSocketFactory sSLSocketFactory2 = c6575q32.c;
        SSLSocket sSLSocket2 = null;
        String strF = null;
        try {
            O90.c(sSLSocketFactory2);
            Socket socket = this.c;
            D40 d40 = c6575q32.i;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, d40.d, d40.e, true);
            O90.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C6744qx c6744qxA = c6934rx.a(sSLSocket);
            if (c6744qxA.b) {
                C6601qB0 c6601qB0 = C6601qB0.a;
                C6601qB0.a.d(sSLSocket, c6575q32.i.d, c6575q32.j);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            O90.e(session, "sslSocketSession");
            E20 e20A = I12.a(session);
            HostnameVerifier hostnameVerifier = c6575q32.d;
            O90.c(hostnameVerifier);
            if (hostnameVerifier.verify(c6575q32.i.d, session)) {
                C2017Zq c2017Zq = c6575q32.e;
                O90.c(c2017Zq);
                this.e = new E20(e20A.a, e20A.b, e20A.c, new C1939Yq(c2017Zq, e20A, c6575q32, 5));
                c2017Zq.a(c6575q32.i.d, new C6685qd0(18, this));
                if (c6744qxA.b) {
                    C6601qB0 c6601qB02 = C6601qB0.a;
                    strF = C6601qB0.a.f(sSLSocket);
                }
                this.d = sSLSocket;
                this.h = JI1.b(JI1.h(sSLSocket));
                this.i = JI1.a(JI1.e(sSLSocket));
                if (strF != null) {
                    enumC3548eG0B = AbstractC4334iN1.b(strF);
                }
                this.f = enumC3548eG0B;
                C6601qB0 c6601qB03 = C6601qB0.a;
                C6601qB0.a.a(sSLSocket);
                if (this.f == EnumC3548eG0.HTTP_2) {
                    m();
                    return;
                }
                return;
            }
            List listA = e20A.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c6575q32.i.d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            O90.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n              |Hostname ");
            sb.append(c6575q32.i.d);
            sb.append(" not verified:\n              |    certificate: ");
            C2017Zq c2017Zq2 = C2017Zq.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            C0674Ik c0674Ik = C0674Ik.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            O90.e(encoded, "publicKey.encoded");
            sb2.append(TE.L(encoded).b("SHA-256").a());
            sb.append(sb2.toString());
            sb.append("\n              |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n              |    subjectAltNames: ");
            sb.append(AbstractC8069xu.N(C5981mx0.a(x509Certificate, 7), C5981mx0.a(x509Certificate, 2)));
            sb.append("\n              ");
            throw new SSLPeerUnverifiedException(AbstractC7728w51.d(sb.toString()));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C6601qB0 c6601qB04 = C6601qB0.a;
                C6601qB0.a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                AbstractC0199Ch1.e(sSLSocket2);
            }
            throw th;
        }
    }

    public final synchronized void h() {
        this.m++;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(defpackage.C6575q3 r9, java.util.List r10) {
        /*
            r8 = this;
            r0 = 0
            byte[] r1 = defpackage.AbstractC0199Ch1.a
            java.util.ArrayList r1 = r8.p
            int r1 = r1.size()
            int r2 = r8.o
            if (r1 >= r2) goto Ld8
            boolean r1 = r8.j
            if (r1 == 0) goto L13
            goto Ld8
        L13:
            OT0 r1 = r8.b
            q3 r2 = r1.a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L1e
            return r0
        L1e:
            D40 r2 = r9.i
            java.lang.String r3 = r2.d
            q3 r4 = r1.a
            D40 r5 = r4.i
            java.lang.String r5 = r5.d
            boolean r3 = defpackage.O90.a(r3, r5)
            r5 = 1
            if (r3 == 0) goto L30
            return r5
        L30:
            h40 r3 = r8.g
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
            OT0 r3 = (defpackage.OT0) r3
            java.net.Proxy r6 = r3.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L4c
            java.net.Proxy r6 = r1.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L4c
            java.net.InetSocketAddress r3 = r3.c
            java.net.InetSocketAddress r6 = r1.c
            boolean r3 = defpackage.O90.a(r6, r3)
            if (r3 == 0) goto L4c
            mx0 r10 = defpackage.C5981mx0.b
            javax.net.ssl.HostnameVerifier r1 = r9.d
            if (r1 == r10) goto L7b
            return r0
        L7b:
            byte[] r10 = defpackage.AbstractC0199Ch1.a
            D40 r10 = r4.i
            int r1 = r10.e
            int r3 = r2.e
            if (r3 == r1) goto L86
            goto Ld8
        L86:
            java.lang.String r10 = r10.d
            java.lang.String r1 = r2.d
            boolean r10 = defpackage.O90.a(r1, r10)
            if (r10 == 0) goto L91
            goto Lb7
        L91:
            boolean r10 = r8.k
            if (r10 != 0) goto Ld8
            E20 r10 = r8.e
            if (r10 == 0) goto Ld8
            java.util.List r10 = r10.a()
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Ld8
            java.lang.Object r10 = r10.get(r0)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            defpackage.O90.d(r10, r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = defpackage.C5981mx0.c(r10, r1)
            if (r10 == 0) goto Ld8
        Lb7:
            Zq r9 = r9.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            defpackage.O90.c(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            E20 r10 = r8.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            defpackage.O90.c(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            java.lang.String r2 = "hostname"
            defpackage.O90.f(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            java.lang.String r2 = "peerCertificates"
            defpackage.O90.f(r10, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            Yq r2 = new Yq     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            r2.<init>(r9, r10, r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            r9.a(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld8
            return r5
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FN0.i(q3, java.util.List):boolean");
    }

    public final boolean j(boolean z) throws SocketException {
        long j;
        byte[] bArr = AbstractC0199Ch1.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        O90.c(socket);
        Socket socket2 = this.d;
        O90.c(socket2);
        C8351zN0 c8351zN0 = this.h;
        O90.c(c8351zN0);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C4085h40 c4085h40 = this.g;
        if (c4085h40 != null) {
            return c4085h40.e(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z2 = !c8351zN0.m();
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

    public final XP k(C6363ox0 c6363ox0, GN0 gn0) throws SocketException {
        O90.f(c6363ox0, "client");
        Socket socket = this.d;
        O90.c(socket);
        C8351zN0 c8351zN0 = this.h;
        O90.c(c8351zN0);
        C8161yN0 c8161yN0 = this.i;
        O90.c(c8161yN0);
        C4085h40 c4085h40 = this.g;
        if (c4085h40 != null) {
            return new C4276i40(c6363ox0, this, gn0, c4085h40);
        }
        int i = gn0.g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c8351zN0.a.r().g(i, timeUnit);
        c8161yN0.a.r().g(gn0.h, timeUnit);
        return new C5350je(c6363ox0, this, c8351zN0, c8161yN0);
    }

    public final synchronized void l() {
        this.j = true;
    }

    public final void m() throws SocketException {
        Socket socket = this.d;
        O90.c(socket);
        C8351zN0 c8351zN0 = this.h;
        O90.c(c8351zN0);
        C8161yN0 c8161yN0 = this.i;
        O90.c(c8161yN0);
        socket.setSoTimeout(0);
        C2272b91 c2272b91 = C2272b91.h;
        O90.f(c2272b91, "taskRunner");
        U41 u41 = new U41();
        u41.a = c2272b91;
        u41.f = AbstractC2256b40.a;
        String str = this.b.a.i.d;
        O90.f(str, "peerName");
        u41.b = socket;
        String str2 = AbstractC0199Ch1.g + ' ' + str;
        O90.f(str2, "<set-?>");
        u41.c = str2;
        u41.d = c8351zN0;
        u41.e = c8161yN0;
        u41.f = this;
        C4085h40 c4085h40 = new C4085h40(u41);
        this.g = c4085h40;
        AZ0 az0 = C4085h40.z;
        this.o = (az0.a & 16) != 0 ? az0.b[4] : Integer.MAX_VALUE;
        C6389p40 c6389p40 = c4085h40.w;
        synchronized (c6389p40) {
            try {
                if (c6389p40.d) {
                    throw new IOException("closed");
                }
                Logger logger = C6389p40.f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC0199Ch1.j(">> CONNECTION " + Z30.a.d(), new Object[0]));
                }
                c6389p40.a.k0(Z30.a);
                c6389p40.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        c4085h40.w.m(c4085h40.p);
        if (c4085h40.p.a() != 65535) {
            c4085h40.w.n(0, r1 - 65535);
        }
        c2272b91.e().c(new C6436pK(c4085h40.c, c4085h40.x, 3), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        OT0 ot0 = this.b;
        sb.append(ot0.a.i.d);
        sb.append(':');
        sb.append(ot0.a.i.e);
        sb.append(", proxy=");
        sb.append(ot0.b);
        sb.append(" hostAddress=");
        sb.append(ot0.c);
        sb.append(" cipherSuite=");
        E20 e20 = this.e;
        if (e20 == null || (obj = e20.b) == null) {
            obj = LocalNotification.Importance.NONE;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
