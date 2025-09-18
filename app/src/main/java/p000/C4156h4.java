package p000;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: h4 */
/* loaded from: classes2.dex */
public final class C4156h4 extends AbstractC11164tS1 {

    /* renamed from: a */
    public final X509TrustManager f28211a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f28212b;

    public C4156h4(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        O90.m5968f(x509TrustManager, "trustManager");
        this.f28211a = x509TrustManager;
        this.f28212b = x509TrustManagerExtensions;
    }

    @Override // p000.AbstractC11164tS1
    /* renamed from: a */
    public final List mo6097a(String str, List list) throws CertificateException, SSLPeerUnverifiedException {
        O90.m5968f(list, "chain");
        O90.m5968f(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f28212b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            O90.m5967e(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4156h4) && ((C4156h4) obj).f28211a == this.f28211a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f28211a);
    }
}
