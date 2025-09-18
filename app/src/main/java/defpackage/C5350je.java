package defpackage;

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
public final class C5350je implements XP {
    public final /* synthetic */ int a = 0;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ C5350je() {
    }

    @Override // defpackage.XP
    public U21 a(HS0 hs0) {
        if (!AbstractC7724w40.a(hs0)) {
            return k(0L);
        }
        String strB = hs0.f.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        if ("chunked".equalsIgnoreCase(strB)) {
            D40 d40 = hs0.a.a;
            if (this.b == 4) {
                this.b = 5;
                return new W30(this, d40);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        long jL = AbstractC0199Ch1.l(hs0);
        if (jL != -1) {
            return k(jL);
        }
        if (this.b == 4) {
            this.b = 5;
            ((FN0) this.d).l();
            return new Y30(this);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    @Override // defpackage.XP
    public void b(C6649qR0 c6649qR0) {
        O90.f(c6649qR0, "request");
        Proxy.Type type = ((FN0) this.d).b.b.type();
        O90.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(c6649qR0.b);
        sb.append(' ');
        D40 d40 = c6649qR0.a;
        if (d40.i || type != Proxy.Type.HTTP) {
            String strB = d40.b();
            String strD = d40.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(d40);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        O90.e(string, "StringBuilder().apply(builderAction).toString()");
        m(c6649qR0.c, string);
    }

    @Override // defpackage.XP
    public void c() {
        ((C8161yN0) this.f).flush();
    }

    @Override // defpackage.XP
    public void cancel() throws IOException {
        Socket socket = ((FN0) this.d).c;
        if (socket != null) {
            AbstractC0199Ch1.e(socket);
        }
    }

    @Override // defpackage.XP
    public long d(HS0 hs0) {
        if (!AbstractC7724w40.a(hs0)) {
            return 0L;
        }
        String strB = hs0.f.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        if ("chunked".equalsIgnoreCase(strB)) {
            return -1L;
        }
        return AbstractC0199Ch1.l(hs0);
    }

    @Override // defpackage.XP
    public Z11 e(C6649qR0 c6649qR0, long j) {
        O90.f(c6649qR0, "request");
        if ("chunked".equalsIgnoreCase(c6649qR0.c.b("Transfer-Encoding"))) {
            if (this.b == 1) {
                this.b = 2;
                return new V30(this);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.b == 1) {
            this.b = 2;
            return new C6999sH(this);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    @Override // defpackage.XP
    public GS0 f(boolean z) throws IOException {
        C0617Hr c0617Hr = (C0617Hr) this.g;
        int i = this.b;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        try {
            String strW = ((C8351zN0) c0617Hr.c).W(c0617Hr.b);
            c0617Hr.b -= strW.length();
            VY vyO = US1.O(strW);
            int i2 = vyO.b;
            GS0 gs0 = new GS0();
            gs0.b = (EnumC3548eG0) vyO.c;
            gs0.c = i2;
            gs0.d = (String) vyO.d;
            J20 j20 = new J20();
            while (true) {
                String strW2 = ((C8351zN0) c0617Hr.c).W(c0617Hr.b);
                c0617Hr.b -= strW2.length();
                if (strW2.length() == 0) {
                    break;
                }
                j20.c(strW2);
            }
            gs0.c(j20.g());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.b = 3;
                return gs0;
            }
            if (102 > i2 || i2 >= 200) {
                this.b = 4;
                return gs0;
            }
            this.b = 3;
            return gs0;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((FN0) this.d).b.a.i.g()), e);
        }
    }

    @Override // defpackage.XP
    public FN0 g() {
        return (FN0) this.d;
    }

    @Override // defpackage.XP
    public void h() {
        ((C8161yN0) this.f).flush();
    }

    public C5541ke i() {
        String strI = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.g) == null) {
            strI = strI.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            strI = AbstractC8235ym.i(strI, " tokenCreationEpochInSecs");
        }
        if (strI.isEmpty()) {
            return new C5541ke((String) this.c, this.b, (String) this.d, (String) this.e, ((Long) this.g).longValue(), ((Long) this.h).longValue(), (String) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public boolean j() {
        return this.b < ((List) this.f).size() || !((ArrayList) this.h).isEmpty();
    }

    public X30 k(long j) {
        if (this.b == 4) {
            this.b = 5;
            return new X30(this, j);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.List] */
    public C5700lT0 l() throws SocketException, UnknownHostException {
        String hostAddress;
        int port;
        List listE;
        boolean zContains;
        if (!j()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.b < ((List) this.f).size()) {
            boolean z = this.b < ((List) this.f).size();
            C6575q3 c6575q3 = (C6575q3) this.c;
            if (!z) {
                throw new SocketException("No route to " + c6575q3.i.d + "; exhausted proxy configurations: " + ((List) this.f));
            }
            List list = (List) this.f;
            int i = this.b;
            this.b = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                D40 d40 = c6575q3.i;
                hostAddress = d40.d;
                port = d40.e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                O90.e(socketAddressAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                O90.f(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    O90.e(hostAddress, "hostName");
                } else {
                    hostAddress = address.getHostAddress();
                    O90.e(hostAddress, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                byte[] bArr = AbstractC0199Ch1.a;
                O90.f(hostAddress, "<this>");
                if (AbstractC0199Ch1.f.b(hostAddress)) {
                    listE = AbstractC8259yu.e(InetAddress.getByName(hostAddress));
                } else {
                    O90.f((InterfaceC7089sl) this.e, "call");
                    c6575q3.a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                        O90.e(allByName, "getAllByName(hostname)");
                        List listD = J8.D(allByName);
                        if (listD.isEmpty()) {
                            throw new UnknownHostException(c6575q3.a + " returned no addresses for " + hostAddress);
                        }
                        listE = listD;
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                Iterator it = listE.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                OT0 ot0 = new OT0((C6575q3) this.c, proxy, (InetSocketAddress) it2.next());
                G10 g10 = (G10) this.d;
                synchronized (g10) {
                    zContains = ((LinkedHashSet) g10.b).contains(ot0);
                }
                if (zContains) {
                    ((ArrayList) this.h).add(ot0);
                } else {
                    arrayList.add(ot0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC0314Du.m(arrayList, (ArrayList) this.h);
            ((ArrayList) this.h).clear();
        }
        return new C5700lT0(arrayList);
    }

    public void m(K20 k20, String str) {
        O90.f(str, "requestLine");
        if (this.b != 0) {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        C8161yN0 c8161yN0 = (C8161yN0) this.f;
        c8161yN0.L(str);
        c8161yN0.L("\r\n");
        int size = k20.size();
        for (int i = 0; i < size; i++) {
            c8161yN0.L(k20.d(i));
            c8161yN0.L(": ");
            c8161yN0.L(k20.q(i));
            c8161yN0.L("\r\n");
        }
        c8161yN0.L("\r\n");
        this.b = 1;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ((EnumC0039Ag0) this.d) + " version=" + ((C6112nd0) this.e);
            default:
                return super.toString();
        }
    }

    public C5350je(EnumC0039Ag0 enumC0039Ag0, C6112nd0 c6112nd0, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        O90.f(enumC0039Ag0, "kind");
        this.d = enumC0039Ag0;
        this.e = c6112nd0;
        this.f = strArr;
        this.g = strArr2;
        this.h = strArr3;
        this.c = str;
        this.b = i;
    }

    public C5350je(C6575q3 c6575q3, G10 g10, InterfaceC7089sl interfaceC7089sl) {
        List listM;
        O90.f(g10, "routeDatabase");
        O90.f(interfaceC7089sl, "call");
        this.c = c6575q3;
        this.d = g10;
        this.e = interfaceC7089sl;
        MN mn = MN.a;
        this.f = mn;
        this.g = mn;
        this.h = new ArrayList();
        D40 d40 = c6575q3.i;
        O90.f(d40, "url");
        Proxy proxy = c6575q3.g;
        if (proxy != null) {
            listM = AbstractC8259yu.e(proxy);
        } else {
            URI uriH = d40.h();
            if (uriH.getHost() == null) {
                listM = AbstractC0199Ch1.m(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = c6575q3.h.select(uriH);
                List<Proxy> list = listSelect;
                if (list != null && !list.isEmpty()) {
                    O90.e(listSelect, "proxiesOrNull");
                    listM = AbstractC0199Ch1.y(listSelect);
                } else {
                    listM = AbstractC0199Ch1.m(Proxy.NO_PROXY);
                }
            }
        }
        this.f = listM;
        this.b = 0;
    }

    public C5350je(C6363ox0 c6363ox0, FN0 fn0, C8351zN0 c8351zN0, C8161yN0 c8161yN0) {
        O90.f(fn0, "connection");
        O90.f(c8351zN0, "source");
        O90.f(c8161yN0, "sink");
        this.c = c6363ox0;
        this.d = fn0;
        this.e = c8351zN0;
        this.f = c8161yN0;
        this.g = new C0617Hr(c8351zN0);
    }
}
