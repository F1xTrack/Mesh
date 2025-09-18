package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: xX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8001xX0 implements X509TrustManager {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public C8001xX0(List list) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        X509TrustManager x509TrustManagerA = a(null);
        if (x509TrustManagerA != null) {
            arrayList.add(x509TrustManagerA);
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
                arrayList.add(x509TrustManagerA2);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            X509TrustManager x509TrustManager = (X509TrustManager) it3.next();
            arrayList3.add(new C0469Ft1(x509TrustManager, new X509TrustManagerExtensions(x509TrustManager)));
        }
        this.b = arrayList3;
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
        switch (this.a) {
            case 0:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                        return;
                    } catch (CertificateException e) {
                        e.getMessage();
                    }
                }
                throw new CertificateException("checkServerTrusted CertificateException");
            default:
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    try {
                        ((C0469Ft1) it2.next()).a.checkServerTrusted(x509CertificateArr, str);
                        return;
                    } catch (CertificateException e2) {
                        e2.toString();
                    }
                }
                throw new CertificateException("None of the TrustManagers trust this certificate chain");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        switch (this.a) {
            case 0:
                int length = x509CertificateArr.length;
                System.currentTimeMillis();
                for (X509Certificate x509Certificate : x509CertificateArr) {
                    Objects.toString(x509Certificate.getSubjectDN());
                    Objects.toString(x509Certificate.getIssuerDN());
                    Objects.toString(x509Certificate.getSerialNumber());
                }
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        X509TrustManager x509TrustManager = (X509TrustManager) arrayList.get(i);
                        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                        if (acceptedIssuers != null) {
                            for (X509Certificate x509Certificate2 : acceptedIssuers) {
                                Objects.toString(x509Certificate2.getIssuerDN());
                            }
                        }
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        Objects.toString(x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                        return;
                    } catch (CertificateException e) {
                        e.getMessage();
                        if (i == size - 1) {
                            if (x509CertificateArr.length > 0) {
                                Objects.toString(x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                            }
                            throw e;
                        }
                    }
                }
                System.currentTimeMillis();
                return;
            default:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((C0469Ft1) it.next()).a.checkServerTrusted(x509CertificateArr, str);
                        return;
                    } catch (CertificateException e2) {
                        e2.toString();
                    }
                }
                throw new CertificateException("None of the TrustManagers trust this certificate chain");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        switch (this.a) {
            case 0:
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
                    }
                    return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                } catch (Exception e) {
                    e.getMessage();
                    return new X509Certificate[0];
                }
            default:
                ArrayList arrayList2 = this.b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    X509Certificate[] acceptedIssuers = ((C0469Ft1) it2.next()).a.getAcceptedIssuers();
                    O90.e(acceptedIssuers, "it.trustManager.acceptedIssuers");
                    AbstractC0314Du.m(arrayList3, J8.D(acceptedIssuers));
                }
                Object[] array = arrayList3.toArray(new X509Certificate[0]);
                O90.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return (X509Certificate[]) array;
        }
    }

    public C8001xX0(InputStream inputStream) throws IOException {
        this.a = 0;
        this.b = new ArrayList();
        if (inputStream != null) {
            System.currentTimeMillis();
            try {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                    KeyStore keyStore = KeyStore.getInstance("bks");
                    keyStore.load(inputStream, "".toCharArray());
                    trustManagerFactory.init(keyStore);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    for (TrustManager trustManager : trustManagers) {
                        if (trustManager instanceof X509TrustManager) {
                            this.b.add((X509TrustManager) trustManager);
                        }
                    }
                    B12.a(inputStream);
                } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                    e.getMessage();
                }
                System.currentTimeMillis();
                return;
            } finally {
                B12.a(inputStream);
            }
        }
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }
}
