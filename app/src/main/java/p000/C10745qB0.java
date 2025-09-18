package p000;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: qB0 */
/* loaded from: classes2.dex */
public class C10745qB0 {

    /* renamed from: a */
    public static volatile C10745qB0 f40658a;

    /* renamed from: b */
    public static final Logger f40659b;

    /* JADX WARN: Removed duplicated region for block: B:115:0x0094 A[PHI: r2
  0x0094: PHI (r2v26 qB0) = (r2v15 qB0), (r2v20 qB0), (r2v24 qB0), (r2v29 qB0) binds: [B:136:0x00e2, B:130:0x00d4, B:122:0x00b4, B:114:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d7  */
    static {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10745qB0.<clinit>():void");
    }

    /* renamed from: i */
    public static void m23946i(int i, String str, Throwable th) {
        O90.m5968f(str, "message");
        f40659b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: j */
    public static /* synthetic */ void m23947j(C10745qB0 c10745qB0, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        c10745qB0.getClass();
        m23946i(i, str, null);
    }

    /* renamed from: b */
    public AbstractC11164tS1 mo9669b(X509TrustManager x509TrustManager) {
        O90.m5968f(x509TrustManager, "trustManager");
        return new C0924Og(mo23948c(x509TrustManager));
    }

    /* renamed from: c */
    public InterfaceC9650hd1 mo23948c(X509TrustManager x509TrustManager) {
        O90.m5968f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        O90.m5967e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C1112Rg((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo5408d(SSLSocket sSLSocket, String str, List list) {
        O90.m5968f(list, "protocols");
    }

    /* renamed from: e */
    public void mo23949e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        O90.m5968f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: f */
    public String mo5409f(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: g */
    public Object mo23950g() {
        if (f40659b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo9670h(String str) {
        O90.m5968f(str, "hostname");
        return true;
    }

    /* renamed from: k */
    public void mo23951k(Object obj, String str) {
        O90.m5968f(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m23946i(5, str, (Throwable) obj);
    }

    /* renamed from: l */
    public SSLContext mo8121l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        O90.m5967e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: m */
    public SSLSocketFactory mo23952m(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextMo8121l = mo8121l();
            sSLContextMo8121l.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo8121l.getSocketFactory();
            O90.m5967e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: n */
    public X509TrustManager mo8122n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void mo5407a(SSLSocket sSLSocket) {
    }
}
