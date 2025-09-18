package p000;

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
public final class C10456nw1 extends X509ExtendedTrustManager {

    /* renamed from: a */
    public final ArrayList f38617a;

    public C10456nw1(List list) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        ArrayList arrayList = new ArrayList();
        X509TrustManager x509TrustManagerM23285a = m23285a(null);
        if (x509TrustManagerM23285a != null) {
            try {
                arrayList.add(new C7613Ft1(x509TrustManagerM23285a, new X509TrustManagerExtensions(x509TrustManagerM23285a)));
            } catch (Exception e) {
                e.toString();
            }
        }
        if (!list.isEmpty()) {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            O90.m5967e(certificateFactory, "getInstance(\"X.509\")");
            ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(AbstractC7038vr.f44561a);
                O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                try {
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
                    AbstractC8729aT1.m9749a(byteArrayInputStream, null);
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
                    AbstractC7230yu.m26279j();
                    throw null;
                }
                keyStore.setCertificateEntry("ca" + i, (Certificate) next);
                i = i2;
            }
            X509TrustManager x509TrustManagerM23285a2 = m23285a(keyStore);
            if (x509TrustManagerM23285a2 != null) {
                try {
                    arrayList.add(new C7613Ft1(x509TrustManagerM23285a2, new X509TrustManagerExtensions(x509TrustManagerM23285a2)));
                } catch (Exception e2) {
                    e2.toString();
                }
            }
        }
        this.f38617a = arrayList;
    }

    /* renamed from: a */
    public static X509TrustManager m23285a(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            O90.m5967e(trustManagers, "factory.trustManagers");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) AbstractC7167xu.m25957C(arrayList);
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
        Iterator it = this.f38617a.iterator();
        while (it.hasNext()) {
            try {
                ((C7613Ft1) it.next()).f3461a.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                e.toString();
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Iterator it = this.f38617a.iterator();
        while (it.hasNext()) {
            try {
                ((C7613Ft1) it.next()).f3461a.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                e.toString();
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = this.f38617a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X509Certificate[] acceptedIssuers = ((C7613Ft1) it.next()).f3461a.getAcceptedIssuers();
            O90.m5967e(acceptedIssuers, "it.trustManager.acceptedIssuers");
            AbstractC0246Du.m1920m(arrayList2, AbstractC0576J8.m4173D(acceptedIssuers));
        }
        Object[] array = arrayList2.toArray(new X509Certificate[0]);
        O90.m5966d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (X509Certificate[]) array;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        O90.m5968f(x509CertificateArr, "chain");
        O90.m5968f(str, "authType");
        O90.m5968f(socket, "conn");
        checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        O90.m5968f(x509CertificateArr, "chain");
        O90.m5968f(str, "authType");
        O90.m5968f(socket, "conn");
        String hostName = socket.getInetAddress().getHostName();
        Iterator it = this.f38617a.iterator();
        while (it.hasNext()) {
            try {
                ((C7613Ft1) it.next()).f3462b.checkServerTrusted(x509CertificateArr, str, hostName);
                return;
            } catch (CertificateException e) {
                e.toString();
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        O90.m5968f(x509CertificateArr, "chain");
        O90.m5968f(sSLEngine, "ssl");
        checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        O90.m5968f(x509CertificateArr, "chain");
        O90.m5968f(sSLEngine, "ssl");
        String peerHost = sSLEngine.getSession().getPeerHost();
        Iterator it = this.f38617a.iterator();
        while (it.hasNext()) {
            try {
                ((C7613Ft1) it.next()).f3462b.checkServerTrusted(x509CertificateArr, str, peerHost);
                return;
            } catch (CertificateException e) {
                e.toString();
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
