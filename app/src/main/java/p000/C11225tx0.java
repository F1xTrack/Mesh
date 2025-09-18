package p000;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: tx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11225tx0 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }
}
