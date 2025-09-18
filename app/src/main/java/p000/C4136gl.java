package p000;

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
public final class C4136gl implements InterfaceC10869r90 {

    /* renamed from: a */
    public final /* synthetic */ int f27977a;

    /* renamed from: b */
    public final Object f27978b;

    public /* synthetic */ C4136gl(int i, Object obj) {
        this.f27977a = i;
        this.f27978b = obj;
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p000.HS0 m18632c(p000.GN0 r33) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4136gl.m18632c(GN0):HS0");
    }

    /* renamed from: e */
    public static int m18633e(HS0 hs0, int i) throws NumberFormatException {
        String strM4524b = hs0.f4300f.m4524b("Retry-After");
        if (strM4524b == null) {
            strM4524b = null;
        }
        if (strM4524b == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        O90.m5967e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strM4524b).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM4524b);
        O90.m5967e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // p000.InterfaceC10869r90
    /* renamed from: a */
    public final HS0 mo18634a(GN0 gn0) throws Throwable {
        boolean z;
        IS0 is0;
        List list;
        int i;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C1626Zq c1626Zq;
        switch (this.f27977a) {
            case 0:
                return m18632c(gn0);
            case 1:
                C10777qR0 c10777qR0 = gn0.f3715e;
                C6937uF c6937uFM23998a = c10777qR0.m23998a();
                AbstractC11161tR0 abstractC11161tR0 = c10777qR0.f40873d;
                if (abstractC11161tR0 != null) {
                    C8540Xp0 c8540Xp0Mo9187b = abstractC11161tR0.mo9187b();
                    if (c8540Xp0Mo9187b != null) {
                        c6937uFM23998a.m25145y("Content-Type", c8540Xp0Mo9187b.f13988a);
                    }
                    long jMo9186a = abstractC11161tR0.mo9186a();
                    if (jMo9186a != -1) {
                        c6937uFM23998a.m25145y("Content-Length", String.valueOf(jMo9186a));
                        ((J20) c6937uFM23998a.f43618c).m4142i("Transfer-Encoding");
                    } else {
                        c6937uFM23998a.m25145y("Transfer-Encoding", "chunked");
                        ((J20) c6937uFM23998a.f43618c).m4142i("Content-Length");
                    }
                }
                K20 k20 = c10777qR0.f40872c;
                String strM4524b = k20.m4524b("Host");
                int i2 = 0;
                D40 d40 = c10777qR0.f40870a;
                if (strM4524b == null) {
                    c6937uFM23998a.m25145y("Host", AbstractC7433Ch1.m1295x(d40, false));
                }
                if (k20.m4524b("Connection") == null) {
                    c6937uFM23998a.m25145y("Connection", "Keep-Alive");
                }
                if (k20.m4524b("Accept-Encoding") == null && k20.m4524b("Range") == null) {
                    c6937uFM23998a.m25145y("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                InterfaceC4213hz interfaceC4213hz = (InterfaceC4213hz) this.f27978b;
                List listMo2904s = interfaceC4213hz.mo2904s(d40);
                if (!listMo2904s.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj : listMo2904s) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC7230yu.m26279j();
                            throw null;
                        }
                        C4150gz c4150gz = (C4150gz) obj;
                        if (i2 > 0) {
                            sb.append("; ");
                        }
                        sb.append(c4150gz.f28128a);
                        sb.append('=');
                        sb.append(c4150gz.f28129b);
                        i2 = i3;
                    }
                    String string = sb.toString();
                    O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
                    c6937uFM23998a.m25145y("Cookie", string);
                }
                if (k20.m4524b("User-Agent") == null) {
                    c6937uFM23998a.m25145y("User-Agent", "okhttp/4.12.0");
                }
                HS0 hs0M3055b = gn0.m3055b(c6937uFM23998a.m25141o());
                K20 k202 = hs0M3055b.f4300f;
                AbstractC11498w40.m25559b(interfaceC4213hz, d40, k202);
                GS0 gs0M3429o = hs0M3055b.m3429o();
                gs0M3429o.f3741a = c10777qR0;
                if (z) {
                    String strM4524b2 = k202.m4524b("Content-Encoding");
                    if (strM4524b2 == null) {
                        strM4524b2 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strM4524b2) && AbstractC11498w40.m25558a(hs0M3055b) && (is0 = hs0M3055b.f4301g) != null) {
                        C9829j20 c9829j20 = new C9829j20(is0.mo3385w());
                        J20 j20M4526i = k202.m4526i();
                        j20M4526i.m4142i("Content-Encoding");
                        j20M4526i.m4142i("Content-Length");
                        gs0M3429o.m3067c(j20M4526i.m4140g());
                        String strM4524b3 = k202.m4524b("Content-Type");
                        gs0M3429o.f3747g = new HN0(strM4524b3 == null ? null : strM4524b3, -1L, JI1.m4274b(c9829j20), 0);
                    }
                }
                return gs0M3429o.m3066a();
            case 2:
                C10777qR0 c10777qR02 = gn0.f3715e;
                HS0 hs0M3055b2 = gn0.m3055b(c10777qR02);
                String str = c10777qR02.f40870a.f1835h;
                GS0 gs0M3429o2 = hs0M3055b2.m3429o();
                gs0M3429o2.f3747g = new C7013vS(str, hs0M3055b2.f4301g, (InterfaceC7076wS) this.f27978b);
                return gs0M3429o2.m3066a();
            case 3:
                HS0 hs0M3055b3 = gn0.m3055b(gn0.f3715e);
                GS0 gs0M3429o3 = hs0M3055b3.m3429o();
                gs0M3429o3.f3747g = new C0660KT(hs0M3055b3.f4301g, (C0974PT) this.f27978b);
                return gs0M3429o3.m3066a();
            case 4:
                ArrayList arrayList = ((RunnableC11786yL0) this.f27978b).f46214q;
                C10777qR0 c10777qR03 = gn0.f3715e;
                arrayList.add(c10777qR03.f40870a.f1835h);
                return gn0.m3055b(c10777qR03);
            default:
                C10777qR0 c10777qR04 = gn0.f3715e;
                DN0 dn0 = gn0.f3711a;
                List listM25969O = C0779MN.f7117a;
                HS0 hs0 = null;
                int i4 = 0;
                C10777qR0 c10777qR0M18635b = c10777qR04;
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        dn0.getClass();
                        O90.m5968f(c10777qR0M18635b, "request");
                        if (dn0.f1990k != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (dn0) {
                            try {
                                if (dn0.f1992m) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (dn0.f1991l) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z2) {
                            C0974PT c0974pt = dn0.f1983d;
                            D40 d402 = c10777qR0M18635b.f40870a;
                            boolean z3 = d402.f1836i;
                            C10585ox0 c10585ox0 = dn0.f1980a;
                            if (z3) {
                                SSLSocketFactory sSLSocketFactory2 = c10585ox0.f39387q;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                HostnameVerifier hostnameVerifier2 = c10585ox0.f39391u;
                                c1626Zq = c10585ox0.f39392v;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                c1626Zq = null;
                            }
                            list = listM25969O;
                            i = i4;
                            dn0.f1987h = new C1536YP(c0974pt, new C6656q3(d402.f1831d, d402.f1832e, c10585ox0.f39382l, c10585ox0.f39386p, sSLSocketFactory, hostnameVerifier, c1626Zq, c10585ox0.f39385o, c10585ox0.f39383m, c10585ox0.f39390t, c10585ox0.f39389s, c10585ox0.f39384n), dn0);
                        } else {
                            list = listM25969O;
                            i = i4;
                        }
                        try {
                            if (dn0.f1994o) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    HS0 hs0M3055b4 = gn0.m3055b(c10777qR0M18635b);
                                    if (hs0 != null) {
                                        GS0 gs0M3429o4 = hs0M3055b4.m3429o();
                                        GS0 gs0M3429o5 = hs0.m3429o();
                                        gs0M3429o5.f3747g = null;
                                        HS0 hs0M3066a = gs0M3429o5.m3066a();
                                        if (hs0M3066a.f4301g != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        gs0M3429o4.f3750j = hs0M3066a;
                                        hs0M3055b4 = gs0M3429o4.m3066a();
                                    }
                                    hs0 = hs0M3055b4;
                                    try {
                                        c10777qR0M18635b = m18635b(hs0, dn0.f1990k);
                                        if (c10777qR0M18635b == null) {
                                            dn0.m1671i(false);
                                            return hs0;
                                        }
                                        IS0 is02 = hs0.f4301g;
                                        if (is02 != null) {
                                            AbstractC7433Ch1.m1275d(is02);
                                        }
                                        i4 = i + 1;
                                        if (i4 > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i4);
                                        }
                                        dn0.m1671i(true);
                                        listM25969O = list;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        dn0.m1671i(true);
                                        throw th;
                                    }
                                } catch (PT0 e) {
                                    if (!m18636d(e.f9083b, dn0, c10777qR0M18635b, false)) {
                                        IOException iOException = e.f9082a;
                                        O90.m5968f(iOException, "<this>");
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            I02.m3687a(iOException, (Exception) it.next());
                                        }
                                        throw iOException;
                                    }
                                    listM25969O = AbstractC7167xu.m25969O(list, e.f9082a);
                                    dn0.m1671i(true);
                                    z2 = false;
                                    i4 = i;
                                } catch (IOException e2) {
                                    if (!m18636d(e2, dn0, c10777qR0M18635b, !(e2 instanceof C6586ox))) {
                                        Iterator it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            I02.m3687a(e2, (Exception) it2.next());
                                        }
                                        throw e2;
                                    }
                                    listM25969O = AbstractC7167xu.m25969O(list, e2);
                                    dn0.m1671i(true);
                                    i4 = i;
                                    z2 = false;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                dn0.m1671i(true);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
        }
    }

    /* renamed from: b */
    public C10777qR0 m18635b(HS0 hs0, C4198hk c4198hk) throws ProtocolException {
        C40 c40;
        FN0 fn0;
        OT0 ot0 = (c4198hk == null || (fn0 = (FN0) c4198hk.f28557e) == null) ? null : fn0.f3174b;
        int i = hs0.f4298d;
        String str = hs0.f4295a.f40871b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((C10585ox0) this.f27978b).f39377g.getClass();
                return null;
            }
            if (i == 421) {
                if (c4198hk == null || O90.m5963a(((C6656q3) ((C1536YP) c4198hk.f28555c).f14287e).f40537i.f1831d, ((FN0) c4198hk.f28557e).f3174b.f8454a.f40537i.f1831d)) {
                    return null;
                }
                FN0 fn02 = (FN0) c4198hk.f28557e;
                synchronized (fn02) {
                    fn02.f3183k = true;
                }
                return hs0.f4295a;
            }
            if (i == 503) {
                HS0 hs02 = hs0.f4304j;
                if ((hs02 == null || hs02.f4298d != 503) && m18633e(hs0, Integer.MAX_VALUE) == 0) {
                    return hs0.f4295a;
                }
                return null;
            }
            if (i == 407) {
                O90.m5965c(ot0);
                if (ot0.f8455b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((C10585ox0) this.f27978b).f39385o.getClass();
                return null;
            }
            if (i == 408) {
                if (!((C10585ox0) this.f27978b).f39376f) {
                    return null;
                }
                HS0 hs03 = hs0.f4304j;
                if ((hs03 == null || hs03.f4298d != 408) && m18633e(hs0, 0) <= 0) {
                    return hs0.f4295a;
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
        C10585ox0 c10585ox0 = (C10585ox0) this.f27978b;
        if (!c10585ox0.f39378h) {
            return null;
        }
        String strM4524b = hs0.f4300f.m4524b("Location");
        if (strM4524b == null) {
            strM4524b = null;
        }
        if (strM4524b == null) {
            return null;
        }
        C10777qR0 c10777qR0 = hs0.f4295a;
        D40 d40 = c10777qR0.f40870a;
        d40.getClass();
        try {
            c40 = new C40();
            c40.m973f(d40, strM4524b);
        } catch (IllegalArgumentException unused) {
            c40 = null;
        }
        D40 d40M970c = c40 != null ? c40.m970c() : null;
        if (d40M970c == null) {
            return null;
        }
        if (!O90.m5963a(d40M970c.f1828a, c10777qR0.f40870a.f1828a) && !c10585ox0.f39379i) {
            return null;
        }
        C6937uF c6937uFM23998a = c10777qR0.m23998a();
        if (P12.m6204a(str)) {
            boolean zEquals = str.equals("PROPFIND");
            int i2 = hs0.f4298d;
            boolean z = zEquals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                c6937uFM23998a.m25130A(str, z ? c10777qR0.f40873d : null);
            } else {
                c6937uFM23998a.m25130A("GET", null);
            }
            if (!z) {
                ((J20) c6937uFM23998a.f43618c).m4142i("Transfer-Encoding");
                ((J20) c6937uFM23998a.f43618c).m4142i("Content-Length");
                ((J20) c6937uFM23998a.f43618c).m4142i("Content-Type");
            }
        }
        if (!AbstractC7433Ch1.m1272a(c10777qR0.f40870a, d40M970c)) {
            ((J20) c6937uFM23998a.f43618c).m4142i("Authorization");
        }
        c6937uFM23998a.f43616a = d40M970c;
        return c6937uFM23998a.m25141o();
    }

    /* renamed from: d */
    public boolean m18636d(IOException iOException, DN0 dn0, C10777qR0 c10777qR0, boolean z) {
        C6250je c6250je;
        boolean zM22080j;
        FN0 fn0;
        if (!((C10585ox0) this.f27978b).f39376f) {
            return false;
        }
        if ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        C1536YP c1536yp = dn0.f1987h;
        O90.m5965c(c1536yp);
        int i = c1536yp.f14283a;
        if (i == 0 && c1536yp.f14284b == 0 && c1536yp.f14285c == 0) {
            zM22080j = false;
        } else if (((OT0) c1536yp.f14291i) != null) {
            zM22080j = true;
        } else {
            OT0 ot0 = null;
            if (i <= 1 && c1536yp.f14284b <= 1 && c1536yp.f14285c <= 0 && (fn0 = ((DN0) c1536yp.f14288f).f1988i) != null) {
                synchronized (fn0) {
                    if (fn0.f3184l == 0 && AbstractC7433Ch1.m1272a(fn0.f3174b.f8454a.f40537i, ((C6656q3) c1536yp.f14287e).f40537i)) {
                        ot0 = fn0.f3174b;
                    }
                }
            }
            if (ot0 != null) {
                c1536yp.f14291i = ot0;
            } else {
                C10141lT0 c10141lT0 = (C10141lT0) c1536yp.f14289g;
                if ((c10141lT0 == null || !c10141lT0.m22430b()) && (c6250je = (C6250je) c1536yp.f14290h) != null) {
                    zM22080j = c6250je.m22080j();
                }
            }
            zM22080j = true;
        }
        return zM22080j;
    }

    public C4136gl(InterfaceC4213hz interfaceC4213hz) {
        this.f27977a = 1;
        O90.m5968f(interfaceC4213hz, "cookieJar");
        this.f27978b = interfaceC4213hz;
    }

    public C4136gl(C10585ox0 c10585ox0) {
        this.f27977a = 5;
        O90.m5968f(c10585ox0, "client");
        this.f27978b = c10585ox0;
    }
}
