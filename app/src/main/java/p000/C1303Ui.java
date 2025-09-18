package p000;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: Ui */
/* loaded from: classes2.dex */
public final class C1303Ui extends C10745qB0 {

    /* renamed from: d */
    public static final boolean f11981d;

    /* renamed from: c */
    public final Provider f11982c = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC1240Ti.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f11981d = z;
    }

    @Override // p000.C10745qB0
    /* renamed from: d */
    public final void mo5408d(SSLSocket sSLSocket, String str, List list) {
        O90.m5968f(list, "protocols");
        super.mo5408d(sSLSocket, str, list);
    }

    @Override // p000.C10745qB0
    /* renamed from: f */
    public final String mo5409f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p000.C10745qB0
    /* renamed from: l */
    public final SSLContext mo8121l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f11982c);
        O90.m5967e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p000.C10745qB0
    /* renamed from: n */
    public final X509TrustManager mo8122n() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        O90.m5965c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                O90.m5966d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        O90.m5967e(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
