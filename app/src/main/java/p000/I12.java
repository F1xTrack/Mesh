package p000;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class I12 {
    /* renamed from: a */
    public static E20 m3731a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listM1284m = C0779MN.f7117a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C4080fs c4080fsM1946s = C4080fs.f27420b.m1946s(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC8043Oa1 enumC8043Oa1M3933b = IY1.m3933b(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listM1284m2 = peerCertificates != null ? AbstractC7433Ch1.m1284m(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listM1284m;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listM1284m = AbstractC7433Ch1.m1284m(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new E20(enumC8043Oa1M3933b, c4080fsM1946s, listM1284m, new D20(listM1284m2, 1));
    }

    /* renamed from: b */
    public static String m3732b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM24912x;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strM24912x = "null";
            } else {
                try {
                    strM24912x = obj.toString();
                } catch (Exception e) {
                    String strM8589h = AbstractC1374Vq.m8589h(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM8589h), (Throwable) e);
                    strM24912x = AbstractC11153tN0.m24912x("<", strM8589h, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strM24912x;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
