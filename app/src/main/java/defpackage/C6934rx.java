package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: rx */
/* loaded from: classes2.dex */
public final class C6934rx {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public C6934rx(OL1 ol1, int i, boolean z, boolean z2) {
        this.d = ol1;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public C6744qx a(SSLSocket sSLSocket) throws UnknownServiceException {
        C6744qx c6744qx;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.a;
        List list = (List) this.d;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                c6744qx = null;
                break;
            }
            c6744qx = (C6744qx) list.get(i2);
            if (c6744qx.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (c6744qx == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            O90.c(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            O90.e(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((C6744qx) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.b = z;
        boolean z2 = this.c;
        String[] strArr = c6744qx.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            O90.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = AbstractC0199Ch1.q(enabledCipherSuites2, strArr, C3852fs.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = c6744qx.d;
        if (strArr2 != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            O90.e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = AbstractC0199Ch1.q(enabledProtocols3, strArr2, C8450zu0.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        O90.e(supportedCipherSuites, "supportedCipherSuites");
        C2209aq0 c2209aq0 = C3852fs.c;
        byte[] bArr = AbstractC0199Ch1.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c2209aq0.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            O90.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            O90.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            O90.e(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C6553px c6553px = new C6553px();
        c6553px.a = c6744qx.a;
        c6553px.c = strArr;
        c6553px.d = strArr2;
        c6553px.b = c6744qx.b;
        O90.e(enabledCipherSuites, "cipherSuitesIntersection");
        c6553px.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        O90.e(enabledProtocols, "tlsVersionsIntersection");
        c6553px.f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C6744qx c6744qxA = c6553px.a();
        if (c6744qxA.c() != null) {
            sSLSocket.setEnabledProtocols(c6744qxA.d);
        }
        if (c6744qxA.a() != null) {
            sSLSocket.setEnabledCipherSuites(c6744qxA.c);
        }
        return c6744qx;
    }

    public void b(Object obj, Object obj2, String str) {
        ((OL1) this.d).C1(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public void c(Object obj, String str) {
        ((OL1) this.d).C1(this.a, this.b, this.c, str, obj, null, null);
    }

    public void d(String str) {
        ((OL1) this.d).C1(this.a, this.b, this.c, str, null, null, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((OL1) this.d).C1(this.a, this.b, this.c, str, obj, obj2, obj3);
    }

    public C6934rx(List list) {
        O90.f(list, "connectionSpecs");
        this.d = list;
    }
}
