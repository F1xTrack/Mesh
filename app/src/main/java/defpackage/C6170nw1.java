package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: nw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6170nw1 extends X509ExtendedTrustManager {
    public final ArrayList a;

    public C6170nw1(List list) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        ArrayList arrayList = new ArrayList();
        X509TrustManager x509TrustManagerA = a(null);
        if (x509TrustManagerA != null) {
            try {
                arrayList.add(new C0469Ft1(x509TrustManagerA, new X509TrustManagerExtensions(x509TrustManagerA)));
            } catch (Exception e) {
                e.toString();
            }
        }
        if (!list.isEmpty()) {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            O90.e(certificateFactory, "getInstance(\"X.509\")");
            ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(AbstractC7680vr.a);
                O90.e(bytes, "this as java.lang.String).getBytes(charset)");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                try {
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
                    AbstractC2141aT1.a(byteArrayInputStream, null);
                    arrayList2.add(certificateGenerateCertificate);
                } finally {
                }
            }
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            Iterator it2 = arrayList2.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC8259yu.j();
                    throw null;
                }
                keyStore.setCertificateEntry("ca" + i, (Certificate) next);
                i = i2;
            }
            X509TrustManager x509TrustManagerA2 = a(keyStore);
            if (x509TrustManagerA2 != null) {
                try {
                    arrayList.add(new C0469Ft1(x509TrustManagerA2, new X509TrustManagerExtensions(x509TrustManagerA2)));
                } catch (Exception e2) {
                    e2.toString();
                }
            }
        }
        this.a = arrayList;
    }

    public static X509TrustManager a(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            O90.e(trustManagers, "factory.trustManagers");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) AbstractC8069xu.C(arrayList);
        } catch (KeyStoreException e) {
            e = e;
            e.toString();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            e.toString();
            return null;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((C0469Ft1) it.next()).a.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                e.toString();
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((C0469Ft1) it.next()).a.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                e.toString();
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X509Certificate[] acceptedIssuers = ((C0469Ft1) it.next()).a.getAcceptedIssuers();
            O90.e(acceptedIssuers, "it.trustManager.acceptedIssuers");
            AbstractC0314Du.m(arrayList2, J8.D(acceptedIssuers));
        }
        Object[] array = arrayList2.toArray(new X509Certificate[0]);
        O90.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (X509Certificate[]) array;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        O90.f(x509CertificateArr, "chain");
        O90.f(str, "authType");
        O90.f(socket, "conn");
        checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        O90.f(x509CertificateArr, "chain");
        O90.f(str, "authType");
        O90.f(socket, "conn");
        String hostName = socket.getInetAddress().getHostName();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((C0469Ft1) it.next()).b.checkServerTrusted(x509CertificateArr, str, hostName);
                return;
            } catch (CertificateException e) {
                e.toString();
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        O90.f(x509CertificateArr, "chain");
        O90.f(sSLEngine, "ssl");
        checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        O90.f(x509CertificateArr, "chain");
        O90.f(sSLEngine, "ssl");
        String peerHost = sSLEngine.getSession().getPeerHost();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((C0469Ft1) it.next()).b.checkServerTrusted(x509CertificateArr, str, peerHost);
                return;
            } catch (CertificateException e) {
                e.toString();
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
