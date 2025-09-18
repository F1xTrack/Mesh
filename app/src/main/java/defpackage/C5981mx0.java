package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: mx0 */
/* loaded from: classes2.dex */
public final class C5981mx0 implements HostnameVerifier {
    public static final C5981mx0 b = new C5981mx0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C5981mx0(int i) {
        this.a = i;
    }

    public static List a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        MN mn = MN.a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return mn;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && O90.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return mn;
        }
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbN = AbstractC8235ym.n(length2, "endIndex > string.length: ", " > ");
            sbN.append(str.length());
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += 4;
                        i2 += 2;
                    }
                }
                j += i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.security.cert.X509Certificate r11, java.lang.String r12) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5981mx0.c(java.security.cert.X509Certificate, java.lang.String):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws CertificateParsingException {
        switch (this.a) {
            case 0:
                O90.f(str, "host");
                O90.f(sSLSession, "session");
                if (!b(str)) {
                    return false;
                }
                try {
                    Certificate certificate = sSLSession.getPeerCertificates()[0];
                    O90.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    return c((X509Certificate) certificate, str);
                } catch (SSLException unused) {
                    return false;
                }
            default:
                try {
                    X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
                    x509Certificate.getSubjectDN().getName();
                    AbstractC2022Zr1.a(x509Certificate, str);
                    AsyncTaskC1245Ps1.a();
                    return true;
                } catch (SSLException e) {
                    e.getMessage();
                    return false;
                }
        }
    }
}
