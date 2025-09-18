package p000;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: je */
/* loaded from: classes.dex */
public final class C6250je implements InterfaceC1473XP {

    /* renamed from: a */
    public final /* synthetic */ int f35296a = 0;

    /* renamed from: b */
    public int f35297b;

    /* renamed from: c */
    public Object f35298c;

    /* renamed from: d */
    public Object f35299d;

    /* renamed from: e */
    public Object f35300e;

    /* renamed from: f */
    public Object f35301f;

    /* renamed from: g */
    public Object f35302g;

    /* renamed from: h */
    public Object f35303h;

    public /* synthetic */ C6250je() {
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: a */
    public U21 mo8995a(HS0 hs0) {
        if (!AbstractC11498w40.m25558a(hs0)) {
            return m22081k(0L);
        }
        String strM4524b = hs0.f4300f.m4524b("Transfer-Encoding");
        if (strM4524b == null) {
            strM4524b = null;
        }
        if ("chunked".equalsIgnoreCase(strM4524b)) {
            D40 d40 = hs0.f4295a.f40870a;
            if (this.f35297b == 4) {
                this.f35297b = 5;
                return new W30(this, d40);
            }
            throw new IllegalStateException(("state: " + this.f35297b).toString());
        }
        long jM1283l = AbstractC7433Ch1.m1283l(hs0);
        if (jM1283l != -1) {
            return m22081k(jM1283l);
        }
        if (this.f35297b == 4) {
            this.f35297b = 5;
            ((FN0) this.f35299d).m2616l();
            return new Y30(this);
        }
        throw new IllegalStateException(("state: " + this.f35297b).toString());
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: b */
    public void mo8996b(C10777qR0 c10777qR0) {
        O90.m5968f(c10777qR0, "request");
        Proxy.Type type = ((FN0) this.f35299d).f3174b.f8455b.type();
        O90.m5967e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(c10777qR0.f40871b);
        sb.append(' ');
        D40 d40 = c10777qR0.f40870a;
        if (d40.f1836i || type != Proxy.Type.HTTP) {
            String strM1529b = d40.m1529b();
            String strM1531d = d40.m1531d();
            if (strM1531d != null) {
                strM1529b = strM1529b + '?' + strM1531d;
            }
            sb.append(strM1529b);
        } else {
            sb.append(d40);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
        m22083m(c10777qR0.f40872c, string);
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: c */
    public void mo8997c() {
        ((C11790yN0) this.f35301f).flush();
    }

    @Override // p000.InterfaceC1473XP
    public void cancel() throws IOException {
        Socket socket = ((FN0) this.f35299d).f3175c;
        if (socket != null) {
            AbstractC7433Ch1.m1276e(socket);
        }
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: d */
    public long mo8998d(HS0 hs0) {
        if (!AbstractC11498w40.m25558a(hs0)) {
            return 0L;
        }
        String strM4524b = hs0.f4300f.m4524b("Transfer-Encoding");
        if (strM4524b == null) {
            strM4524b = null;
        }
        if ("chunked".equalsIgnoreCase(strM4524b)) {
            return -1L;
        }
        return AbstractC7433Ch1.m1283l(hs0);
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: e */
    public Z11 mo8999e(C10777qR0 c10777qR0, long j) {
        O90.m5968f(c10777qR0, "request");
        if ("chunked".equalsIgnoreCase(c10777qR0.f40872c.m4524b("Transfer-Encoding"))) {
            if (this.f35297b == 1) {
                this.f35297b = 2;
                return new V30(this);
            }
            throw new IllegalStateException(("state: " + this.f35297b).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f35297b == 1) {
            this.f35297b = 2;
            return new C6813sH(this);
        }
        throw new IllegalStateException(("state: " + this.f35297b).toString());
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: f */
    public GS0 mo9000f(boolean z) throws IOException {
        C0495Hr c0495Hr = (C0495Hr) this.f35302g;
        int i = this.f35297b;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f35297b).toString());
        }
        try {
            String strM26384W = ((C11917zN0) c0495Hr.f4554c).m26384W(c0495Hr.f4553b);
            c0495Hr.f4553b -= strM26384W.length();
            C1356VY c1356vyM8031O = US1.m8031O(strM26384W);
            int i2 = c1356vyM8031O.f12611b;
            GS0 gs0 = new GS0();
            gs0.f3742b = (EnumC9219eG0) c1356vyM8031O.f12612c;
            gs0.f3743c = i2;
            gs0.f3744d = (String) c1356vyM8031O.f12613d;
            J20 j20 = new J20();
            while (true) {
                String strM26384W2 = ((C11917zN0) c0495Hr.f4554c).m26384W(c0495Hr.f4553b);
                c0495Hr.f4553b -= strM26384W2.length();
                if (strM26384W2.length() == 0) {
                    break;
                }
                j20.m4136c(strM26384W2);
            }
            gs0.m3067c(j20.m4140g());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f35297b = 3;
                return gs0;
            }
            if (102 > i2 || i2 >= 200) {
                this.f35297b = 4;
                return gs0;
            }
            this.f35297b = 3;
            return gs0;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((FN0) this.f35299d).f3174b.f8454a.f40537i.m1534g()), e);
        }
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: g */
    public FN0 mo9001g() {
        return (FN0) this.f35299d;
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: h */
    public void mo9002h() {
        ((C11790yN0) this.f35301f).flush();
    }

    /* renamed from: i */
    public C6313ke m22079i() {
        String strM26232i = this.f35297b == 0 ? " registrationStatus" : "";
        if (((Long) this.f35302g) == null) {
            strM26232i = strM26232i.concat(" expiresInSecs");
        }
        if (((Long) this.f35303h) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " tokenCreationEpochInSecs");
        }
        if (strM26232i.isEmpty()) {
            return new C6313ke((String) this.f35298c, this.f35297b, (String) this.f35299d, (String) this.f35300e, ((Long) this.f35302g).longValue(), ((Long) this.f35303h).longValue(), (String) this.f35301f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM26232i));
    }

    /* renamed from: j */
    public boolean m22080j() {
        return this.f35297b < ((List) this.f35301f).size() || !((ArrayList) this.f35303h).isEmpty();
    }

    /* renamed from: k */
    public X30 m22081k(long j) {
        if (this.f35297b == 4) {
            this.f35297b = 5;
            return new X30(this, j);
        }
        throw new IllegalStateException(("state: " + this.f35297b).toString());
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.List] */
    /* renamed from: l */
    public C10141lT0 m22082l() throws SocketException, UnknownHostException {
        String hostAddress;
        int port;
        List listM26274e;
        boolean zContains;
        if (!m22080j()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f35297b < ((List) this.f35301f).size()) {
            boolean z = this.f35297b < ((List) this.f35301f).size();
            C6656q3 c6656q3 = (C6656q3) this.f35298c;
            if (!z) {
                throw new SocketException("No route to " + c6656q3.f40537i.f1831d + "; exhausted proxy configurations: " + ((List) this.f35301f));
            }
            List list = (List) this.f35301f;
            int i = this.f35297b;
            this.f35297b = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            ArrayList arrayList2 = new ArrayList();
            this.f35302g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                D40 d40 = c6656q3.f40537i;
                hostAddress = d40.f1831d;
                port = d40.f1832e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                O90.m5967e(socketAddressAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                O90.m5968f(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    O90.m5967e(hostAddress, "hostName");
                } else {
                    hostAddress = address.getHostAddress();
                    O90.m5967e(hostAddress, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                byte[] bArr = AbstractC7433Ch1.f1577a;
                O90.m5968f(hostAddress, "<this>");
                if (AbstractC7433Ch1.f1582f.m10697b(hostAddress)) {
                    listM26274e = AbstractC7230yu.m26274e(InetAddress.getByName(hostAddress));
                } else {
                    O90.m5968f((InterfaceC6843sl) this.f35300e, "call");
                    c6656q3.f40529a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                        O90.m5967e(allByName, "getAllByName(hostname)");
                        List listM4173D = AbstractC0576J8.m4173D(allByName);
                        if (listM4173D.isEmpty()) {
                            throw new UnknownHostException(c6656q3.f40529a + " returned no addresses for " + hostAddress);
                        }
                        listM26274e = listM4173D;
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                Iterator it = listM26274e.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.f35302g.iterator();
            while (it2.hasNext()) {
                OT0 ot0 = new OT0((C6656q3) this.f35298c, proxy, (InetSocketAddress) it2.next());
                G10 g10 = (G10) this.f35299d;
                synchronized (g10) {
                    zContains = ((LinkedHashSet) g10.f3531b).contains(ot0);
                }
                if (zContains) {
                    ((ArrayList) this.f35303h).add(ot0);
                } else {
                    arrayList.add(ot0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC0246Du.m1920m(arrayList, (ArrayList) this.f35303h);
            ((ArrayList) this.f35303h).clear();
        }
        return new C10141lT0(arrayList);
    }

    /* renamed from: m */
    public void m22083m(K20 k20, String str) {
        O90.m5968f(str, "requestLine");
        if (this.f35297b != 0) {
            throw new IllegalStateException(("state: " + this.f35297b).toString());
        }
        C11790yN0 c11790yN0 = (C11790yN0) this.f35301f;
        c11790yN0.mo4391L(str);
        c11790yN0.mo4391L("\r\n");
        int size = k20.size();
        for (int i = 0; i < size; i++) {
            c11790yN0.mo4391L(k20.m4525d(i));
            c11790yN0.mo4391L(": ");
            c11790yN0.mo4391L(k20.m4528q(i));
            c11790yN0.mo4391L("\r\n");
        }
        c11790yN0.mo4391L("\r\n");
        this.f35297b = 1;
    }

    public String toString() {
        switch (this.f35296a) {
            case 2:
                return ((EnumC7326Ag0) this.f35299d) + " version=" + ((C10417nd0) this.f35300e);
            default:
                return super.toString();
        }
    }

    public C6250je(EnumC7326Ag0 enumC7326Ag0, C10417nd0 c10417nd0, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        O90.m5968f(enumC7326Ag0, "kind");
        this.f35299d = enumC7326Ag0;
        this.f35300e = c10417nd0;
        this.f35301f = strArr;
        this.f35302g = strArr2;
        this.f35303h = strArr3;
        this.f35298c = str;
        this.f35297b = i;
    }

    public C6250je(C6656q3 c6656q3, G10 g10, InterfaceC6843sl interfaceC6843sl) {
        List listM1284m;
        O90.m5968f(g10, "routeDatabase");
        O90.m5968f(interfaceC6843sl, "call");
        this.f35298c = c6656q3;
        this.f35299d = g10;
        this.f35300e = interfaceC6843sl;
        C0779MN c0779mn = C0779MN.f7117a;
        this.f35301f = c0779mn;
        this.f35302g = c0779mn;
        this.f35303h = new ArrayList();
        D40 d40 = c6656q3.f40537i;
        O90.m5968f(d40, "url");
        Proxy proxy = c6656q3.f40535g;
        if (proxy != null) {
            listM1284m = AbstractC7230yu.m26274e(proxy);
        } else {
            URI uriM1535h = d40.m1535h();
            if (uriM1535h.getHost() == null) {
                listM1284m = AbstractC7433Ch1.m1284m(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = c6656q3.f40536h.select(uriM1535h);
                List<Proxy> list = listSelect;
                if (list != null && !list.isEmpty()) {
                    O90.m5967e(listSelect, "proxiesOrNull");
                    listM1284m = AbstractC7433Ch1.m1296y(listSelect);
                } else {
                    listM1284m = AbstractC7433Ch1.m1284m(Proxy.NO_PROXY);
                }
            }
        }
        this.f35301f = listM1284m;
        this.f35297b = 0;
    }

    public C6250je(C10585ox0 c10585ox0, FN0 fn0, C11917zN0 c11917zN0, C11790yN0 c11790yN0) {
        O90.m5968f(fn0, "connection");
        O90.m5968f(c11917zN0, "source");
        O90.m5968f(c11790yN0, "sink");
        this.f35298c = c10585ox0;
        this.f35299d = fn0;
        this.f35300e = c11917zN0;
        this.f35301f = c11790yN0;
        this.f35302g = new C0495Hr(c11917zN0);
    }
}
