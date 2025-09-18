package p000;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* renamed from: xx */
/* loaded from: classes2.dex */
public final class C7170xx extends C10745qB0 {

    /* renamed from: d */
    public static final boolean f45912d;

    /* renamed from: c */
    public final Provider f45913c;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC7044vx.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC7044vx.m25531a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f45912d = z;
    }

    public C7170xx() {
        Provider providerNewProvider = Conscrypt.newProvider();
        O90.m5967e(providerNewProvider, "newProvider()");
        this.f45913c = providerNewProvider;
    }

    @Override // p000.C10745qB0
    /* renamed from: d */
    public final void mo5408d(SSLSocket sSLSocket, String str, List list) {
        O90.m5968f(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo5408d(sSLSocket, str, list);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) NV1.m5735q(list).toArray(new String[0]));
        }
    }

    @Override // p000.C10745qB0
    /* renamed from: f */
    public final String mo5409f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.C10745qB0
    /* renamed from: l */
    public final SSLContext mo8121l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f45913c);
        O90.m5967e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p000.C10745qB0
    /* renamed from: m */
    public final SSLSocketFactory mo23952m(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextMo8121l = mo8121l();
        sSLContextMo8121l.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo8121l.getSocketFactory();
        O90.m5967e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p000.C10745qB0
    /* renamed from: n */
    public final X509TrustManager mo8122n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        O90.m5965c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                O90.m5966d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C7107wx.f45175a);
                return x509TrustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        O90.m5967e(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
