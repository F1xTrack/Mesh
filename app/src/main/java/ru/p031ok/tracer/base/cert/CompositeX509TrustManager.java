package ru.p031ok.tracer.base.cert;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import p000.AbstractC0246Du;
import p000.AbstractC0576J8;
import p000.O90;

@Metadata(m22266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m22267d2 = {"Lru/ok/tracer/base/cert/CompositeX509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "", "delegates", "<init>", "([Ljavax/net/ssl/X509TrustManager;)V", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "LTf1;", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "host", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "[Ljavax/net/ssl/X509TrustManager;", "Landroid/net/http/X509TrustManagerExtensions;", "delegateExtensions", "Ljava/util/List;", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
@SuppressLint({"CustomX509TrustManager"})
/* loaded from: classes2.dex */
final class CompositeX509TrustManager implements X509TrustManager {
    private final List<X509TrustManagerExtensions> delegateExtensions;
    private final X509TrustManager[] delegates;

    public CompositeX509TrustManager(X509TrustManager[] x509TrustManagerArr) {
        O90.m5968f(x509TrustManagerArr, "delegates");
        this.delegates = x509TrustManagerArr;
        ArrayList arrayList = new ArrayList(x509TrustManagerArr.length);
        for (X509TrustManager x509TrustManager : x509TrustManagerArr) {
            arrayList.add(new X509TrustManagerExtensions(x509TrustManager));
        }
        this.delegateExtensions = arrayList;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        O90.m5968f(chain, "chain");
        O90.m5968f(authType, "authType");
        for (X509TrustManager x509TrustManager : this.delegates) {
            try {
                x509TrustManager.checkClientTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        O90.m5968f(chain, "chain");
        O90.m5968f(authType, "authType");
        for (X509TrustManager x509TrustManager : this.delegates) {
            try {
                x509TrustManager.checkServerTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() throws CertificateException {
        X509TrustManager[] x509TrustManagerArr = this.delegates;
        ArrayList arrayList = new ArrayList();
        for (X509TrustManager x509TrustManager : x509TrustManagerArr) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            O90.m5967e(acceptedIssuers, "it.acceptedIssuers");
            AbstractC0246Du.m1920m(arrayList, AbstractC0576J8.m4173D(acceptedIssuers));
        }
        Object[] array = arrayList.toArray(new X509Certificate[0]);
        O90.m5966d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (X509Certificate[]) array;
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String host) throws CertificateException {
        O90.m5968f(chain, "chain");
        O90.m5968f(authType, "authType");
        O90.m5968f(host, "host");
        Iterator<X509TrustManagerExtensions> it = this.delegateExtensions.iterator();
        while (it.hasNext()) {
            try {
                List<X509Certificate> listCheckServerTrusted = it.next().checkServerTrusted(chain, authType, host);
                O90.m5967e(listCheckServerTrusted, "delegateExtension.checkS…ed(chain, authType, host)");
                return listCheckServerTrusted;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
