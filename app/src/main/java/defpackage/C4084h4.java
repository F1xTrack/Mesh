package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4084h4 extends AbstractC7225tS1 {
    public final X509TrustManager a;
    public final X509TrustManagerExtensions b;

    public C4084h4(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        O90.f(x509TrustManager, "trustManager");
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    @Override // defpackage.AbstractC7225tS1
    public final List a(String str, List list) throws CertificateException, SSLPeerUnverifiedException {
        O90.f(list, "chain");
        O90.f(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            O90.e(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4084h4) && ((C4084h4) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }
}
