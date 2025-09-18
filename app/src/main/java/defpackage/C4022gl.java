package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: gl */
/* loaded from: classes2.dex */
public final class C4022gl implements InterfaceC6785r90 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C4022gl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0627  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.HS0 c(defpackage.GN0 r33) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4022gl.c(GN0):HS0");
    }

    public static int e(HS0 hs0, int i) throws NumberFormatException {
        String strB = hs0.f.b("Retry-After");
        if (strB == null) {
            strB = null;
        }
        if (strB == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        O90.e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strB).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        O90.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // defpackage.InterfaceC6785r90
    public final HS0 a(GN0 gn0) throws Throwable {
        boolean z;
        IS0 is0;
        List list;
        int i;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C2017Zq c2017Zq;
        switch (this.a) {
            case 0:
                return c(gn0);
            case 1:
                C6649qR0 c6649qR0 = gn0.e;
                C7375uF c7375uFA = c6649qR0.a();
                AbstractC7221tR0 abstractC7221tR0 = c6649qR0.d;
                if (abstractC7221tR0 != null) {
                    C1859Xp0 c1859Xp0B = abstractC7221tR0.b();
                    if (c1859Xp0B != null) {
                        c7375uFA.y("Content-Type", c1859Xp0B.a);
                    }
                    long jA = abstractC7221tR0.a();
                    if (jA != -1) {
                        c7375uFA.y("Content-Length", String.valueOf(jA));
                        ((J20) c7375uFA.c).i("Transfer-Encoding");
                    } else {
                        c7375uFA.y("Transfer-Encoding", "chunked");
                        ((J20) c7375uFA.c).i("Content-Length");
                    }
                }
                K20 k20 = c6649qR0.c;
                String strB = k20.b("Host");
                int i2 = 0;
                D40 d40 = c6649qR0.a;
                if (strB == null) {
                    c7375uFA.y("Host", AbstractC0199Ch1.x(d40, false));
                }
                if (k20.b("Connection") == null) {
                    c7375uFA.y("Connection", "Keep-Alive");
                }
                if (k20.b("Accept-Encoding") == null && k20.b("Range") == null) {
                    c7375uFA.y("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                InterfaceC4255hz interfaceC4255hz = (InterfaceC4255hz) this.b;
                List listS = interfaceC4255hz.s(d40);
                if (!listS.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj : listS) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC8259yu.j();
                            throw null;
                        }
                        C4064gz c4064gz = (C4064gz) obj;
                        if (i2 > 0) {
                            sb.append("; ");
                        }
                        sb.append(c4064gz.a);
                        sb.append('=');
                        sb.append(c4064gz.b);
                        i2 = i3;
                    }
                    String string = sb.toString();
                    O90.e(string, "StringBuilder().apply(builderAction).toString()");
                    c7375uFA.y("Cookie", string);
                }
                if (k20.b("User-Agent") == null) {
                    c7375uFA.y("User-Agent", "okhttp/4.12.0");
                }
                HS0 hs0B = gn0.b(c7375uFA.o());
                K20 k202 = hs0B.f;
                AbstractC7724w40.b(interfaceC4255hz, d40, k202);
                GS0 gs0O = hs0B.o();
                gs0O.a = c6649qR0;
                if (z) {
                    String strB2 = k202.b("Content-Encoding");
                    if (strB2 == null) {
                        strB2 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strB2) && AbstractC7724w40.a(hs0B) && (is0 = hs0B.g) != null) {
                        C5235j20 c5235j20 = new C5235j20(is0.w());
                        J20 j20I = k202.i();
                        j20I.i("Content-Encoding");
                        j20I.i("Content-Length");
                        gs0O.c(j20I.g());
                        String strB3 = k202.b("Content-Type");
                        gs0O.g = new HN0(strB3 == null ? null : strB3, -1L, JI1.b(c5235j20), 0);
                    }
                }
                return gs0O.a();
            case 2:
                C6649qR0 c6649qR02 = gn0.e;
                HS0 hs0B2 = gn0.b(c6649qR02);
                String str = c6649qR02.a.h;
                GS0 gs0O2 = hs0B2.o();
                gs0O2.g = new C7605vS(str, hs0B2.g, (InterfaceC7795wS) this.b);
                return gs0O2.a();
            case 3:
                HS0 hs0B3 = gn0.b(gn0.e);
                GS0 gs0O3 = hs0B3.o();
                gs0O3.g = new KT(hs0B3.g, (PT) this.b);
                return gs0O3.a();
            case 4:
                ArrayList arrayList = ((RunnableC8155yL0) this.b).q;
                C6649qR0 c6649qR03 = gn0.e;
                arrayList.add(c6649qR03.a.h);
                return gn0.b(c6649qR03);
            default:
                C6649qR0 c6649qR04 = gn0.e;
                DN0 dn0 = gn0.a;
                List listO = MN.a;
                HS0 hs0 = null;
                int i4 = 0;
                C6649qR0 c6649qR0B = c6649qR04;
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        dn0.getClass();
                        O90.f(c6649qR0B, "request");
                        if (dn0.k != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (dn0) {
                            try {
                                if (dn0.m) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (dn0.l) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z2) {
                            PT pt = dn0.d;
                            D40 d402 = c6649qR0B.a;
                            boolean z3 = d402.i;
                            C6363ox0 c6363ox0 = dn0.a;
                            if (z3) {
                                SSLSocketFactory sSLSocketFactory2 = c6363ox0.q;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                HostnameVerifier hostnameVerifier2 = c6363ox0.u;
                                c2017Zq = c6363ox0.v;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                c2017Zq = null;
                            }
                            list = listO;
                            i = i4;
                            dn0.h = new YP(pt, new C6575q3(d402.d, d402.e, c6363ox0.l, c6363ox0.p, sSLSocketFactory, hostnameVerifier, c2017Zq, c6363ox0.o, c6363ox0.m, c6363ox0.t, c6363ox0.s, c6363ox0.n), dn0);
                        } else {
                            list = listO;
                            i = i4;
                        }
                        try {
                            if (dn0.o) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    HS0 hs0B4 = gn0.b(c6649qR0B);
                                    if (hs0 != null) {
                                        GS0 gs0O4 = hs0B4.o();
                                        GS0 gs0O5 = hs0.o();
                                        gs0O5.g = null;
                                        HS0 hs0A = gs0O5.a();
                                        if (hs0A.g != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        gs0O4.j = hs0A;
                                        hs0B4 = gs0O4.a();
                                    }
                                    hs0 = hs0B4;
                                    try {
                                        c6649qR0B = b(hs0, dn0.k);
                                        if (c6649qR0B == null) {
                                            dn0.i(false);
                                            return hs0;
                                        }
                                        IS0 is02 = hs0.g;
                                        if (is02 != null) {
                                            AbstractC0199Ch1.d(is02);
                                        }
                                        i4 = i + 1;
                                        if (i4 > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i4);
                                        }
                                        dn0.i(true);
                                        listO = list;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        dn0.i(true);
                                        throw th;
                                    }
                                } catch (PT0 e) {
                                    if (!d(e.b, dn0, c6649qR0B, false)) {
                                        IOException iOException = e.a;
                                        O90.f(iOException, "<this>");
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            I02.a(iOException, (Exception) it.next());
                                        }
                                        throw iOException;
                                    }
                                    listO = AbstractC8069xu.O(list, e.a);
                                    dn0.i(true);
                                    z2 = false;
                                    i4 = i;
                                } catch (IOException e2) {
                                    if (!d(e2, dn0, c6649qR0B, !(e2 instanceof C6362ox))) {
                                        Iterator it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            I02.a(e2, (Exception) it2.next());
                                        }
                                        throw e2;
                                    }
                                    listO = AbstractC8069xu.O(list, e2);
                                    dn0.i(true);
                                    i4 = i;
                                    z2 = false;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                dn0.i(true);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
        }
    }

    public C6649qR0 b(HS0 hs0, C4210hk c4210hk) throws ProtocolException {
        C40 c40;
        FN0 fn0;
        OT0 ot0 = (c4210hk == null || (fn0 = (FN0) c4210hk.e) == null) ? null : fn0.b;
        int i = hs0.d;
        String str = hs0.a.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((C6363ox0) this.b).g.getClass();
                return null;
            }
            if (i == 421) {
                if (c4210hk == null || O90.a(((C6575q3) ((YP) c4210hk.c).e).i.d, ((FN0) c4210hk.e).b.a.i.d)) {
                    return null;
                }
                FN0 fn02 = (FN0) c4210hk.e;
                synchronized (fn02) {
                    fn02.k = true;
                }
                return hs0.a;
            }
            if (i == 503) {
                HS0 hs02 = hs0.j;
                if ((hs02 == null || hs02.d != 503) && e(hs0, Integer.MAX_VALUE) == 0) {
                    return hs0.a;
                }
                return null;
            }
            if (i == 407) {
                O90.c(ot0);
                if (ot0.b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((C6363ox0) this.b).o.getClass();
                return null;
            }
            if (i == 408) {
                if (!((C6363ox0) this.b).f) {
                    return null;
                }
                HS0 hs03 = hs0.j;
                if ((hs03 == null || hs03.d != 408) && e(hs0, 0) <= 0) {
                    return hs0.a;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        C6363ox0 c6363ox0 = (C6363ox0) this.b;
        if (!c6363ox0.h) {
            return null;
        }
        String strB = hs0.f.b("Location");
        if (strB == null) {
            strB = null;
        }
        if (strB == null) {
            return null;
        }
        C6649qR0 c6649qR0 = hs0.a;
        D40 d40 = c6649qR0.a;
        d40.getClass();
        try {
            c40 = new C40();
            c40.f(d40, strB);
        } catch (IllegalArgumentException unused) {
            c40 = null;
        }
        D40 d40C = c40 != null ? c40.c() : null;
        if (d40C == null) {
            return null;
        }
        if (!O90.a(d40C.a, c6649qR0.a.a) && !c6363ox0.i) {
            return null;
        }
        C7375uF c7375uFA = c6649qR0.a();
        if (P12.a(str)) {
            boolean zEquals = str.equals("PROPFIND");
            int i2 = hs0.d;
            boolean z = zEquals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                c7375uFA.A(str, z ? c6649qR0.d : null);
            } else {
                c7375uFA.A("GET", null);
            }
            if (!z) {
                ((J20) c7375uFA.c).i("Transfer-Encoding");
                ((J20) c7375uFA.c).i("Content-Length");
                ((J20) c7375uFA.c).i("Content-Type");
            }
        }
        if (!AbstractC0199Ch1.a(c6649qR0.a, d40C)) {
            ((J20) c7375uFA.c).i("Authorization");
        }
        c7375uFA.a = d40C;
        return c7375uFA.o();
    }

    public boolean d(IOException iOException, DN0 dn0, C6649qR0 c6649qR0, boolean z) {
        C5350je c5350je;
        boolean zJ;
        FN0 fn0;
        if (!((C6363ox0) this.b).f) {
            return false;
        }
        if ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        YP yp = dn0.h;
        O90.c(yp);
        int i = yp.a;
        if (i == 0 && yp.b == 0 && yp.c == 0) {
            zJ = false;
        } else if (((OT0) yp.i) != null) {
            zJ = true;
        } else {
            OT0 ot0 = null;
            if (i <= 1 && yp.b <= 1 && yp.c <= 0 && (fn0 = ((DN0) yp.f).i) != null) {
                synchronized (fn0) {
                    if (fn0.l == 0 && AbstractC0199Ch1.a(fn0.b.a.i, ((C6575q3) yp.e).i)) {
                        ot0 = fn0.b;
                    }
                }
            }
            if (ot0 != null) {
                yp.i = ot0;
            } else {
                C5700lT0 c5700lT0 = (C5700lT0) yp.g;
                if ((c5700lT0 == null || !c5700lT0.b()) && (c5350je = (C5350je) yp.h) != null) {
                    zJ = c5350je.j();
                }
            }
            zJ = true;
        }
        return zJ;
    }

    public C4022gl(InterfaceC4255hz interfaceC4255hz) {
        this.a = 1;
        O90.f(interfaceC4255hz, "cookieJar");
        this.b = interfaceC4255hz;
    }

    public C4022gl(C6363ox0 c6363ox0) {
        this.a = 5;
        O90.f(c6363ox0, "client");
        this.b = c6363ox0;
    }
}
