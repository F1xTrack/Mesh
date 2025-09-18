package defpackage;

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
public class C6601qB0 {
    public static volatile C6601qB0 a;
    public static final Logger b;

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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6601qB0.<clinit>():void");
    }

    public static void i(int i, String str, Throwable th) {
        O90.f(str, "message");
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(C6601qB0 c6601qB0, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        c6601qB0.getClass();
        i(i, str, null);
    }

    public AbstractC7225tS1 b(X509TrustManager x509TrustManager) {
        O90.f(x509TrustManager, "trustManager");
        return new C1129Og(c(x509TrustManager));
    }

    public InterfaceC4191hd1 c(X509TrustManager x509TrustManager) {
        O90.f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        O90.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C1363Rg((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        O90.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        O90.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        O90.f(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        O90.f(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        O90.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextL = l();
            sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
            O90.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        O90.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                O90.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        O90.e(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
