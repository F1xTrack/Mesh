package p000;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: rx */
/* loaded from: classes2.dex */
public final class C6792rx {

    /* renamed from: a */
    public int f42170a;

    /* renamed from: b */
    public boolean f42171b;

    /* renamed from: c */
    public boolean f42172c;

    /* renamed from: d */
    public final Object f42173d;

    public C6792rx(OL1 ol1, int i, boolean z, boolean z2) {
        this.f42173d = ol1;
        this.f42170a = i;
        this.f42171b = z;
        this.f42172c = z2;
    }

    /* renamed from: a */
    public C6712qx m24552a(SSLSocket sSLSocket) throws UnknownServiceException {
        C6712qx c6712qx;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f42170a;
        List list = (List) this.f42173d;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                c6712qx = null;
                break;
            }
            c6712qx = (C6712qx) list.get(i2);
            if (c6712qx.m24140b(sSLSocket)) {
                this.f42170a = i2 + 1;
                break;
            }
            i2++;
        }
        if (c6712qx == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f42172c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            O90.m5965c(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            O90.m5967e(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f42170a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((C6712qx) list.get(i3)).m24140b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.f42171b = z;
        boolean z2 = this.f42172c;
        String[] strArr = c6712qx.f41262c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            O90.m5967e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = AbstractC7433Ch1.m1288q(enabledCipherSuites2, strArr, C4080fs.f27421c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = c6712qx.f41263d;
        if (strArr2 != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            O90.m5967e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = AbstractC7433Ch1.m1288q(enabledProtocols3, strArr2, C11983zu0.f47088b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        O90.m5967e(supportedCipherSuites, "supportedCipherSuites");
        C8774aq0 c8774aq0 = C4080fs.f27421c;
        byte[] bArr = AbstractC7433Ch1.f1577a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c8774aq0.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            O90.m5967e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            O90.m5967e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            O90.m5967e(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C6649px c6649px = new C6649px();
        c6649px.f40445a = c6712qx.f41260a;
        c6649px.f40447c = strArr;
        c6649px.f40448d = strArr2;
        c6649px.f40446b = c6712qx.f41261b;
        O90.m5967e(enabledCipherSuites, "cipherSuitesIntersection");
        c6649px.m23892c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        O90.m5967e(enabledProtocols, "tlsVersionsIntersection");
        c6649px.m23895f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C6712qx c6712qxM23890a = c6649px.m23890a();
        if (c6712qxM23890a.m24141c() != null) {
            sSLSocket.setEnabledProtocols(c6712qxM23890a.f41263d);
        }
        if (c6712qxM23890a.m24139a() != null) {
            sSLSocket.setEnabledCipherSuites(c6712qxM23890a.f41262c);
        }
        return c6712qx;
    }

    /* renamed from: b */
    public void m24553b(Object obj, Object obj2, String str) {
        ((OL1) this.f42173d).m6028C1(this.f42170a, this.f42171b, this.f42172c, str, obj, obj2, null);
    }

    /* renamed from: c */
    public void m24554c(Object obj, String str) {
        ((OL1) this.f42173d).m6028C1(this.f42170a, this.f42171b, this.f42172c, str, obj, null, null);
    }

    /* renamed from: d */
    public void m24555d(String str) {
        ((OL1) this.f42173d).m6028C1(this.f42170a, this.f42171b, this.f42172c, str, null, null, null);
    }

    /* renamed from: e */
    public void m24556e(String str, Object obj, Object obj2, Object obj3) {
        ((OL1) this.f42173d).m6028C1(this.f42170a, this.f42171b, this.f42172c, str, obj, obj2, obj3);
    }

    public C6792rx(List list) {
        O90.m5968f(list, "connectionSpecs");
        this.f42173d = list;
    }
}
