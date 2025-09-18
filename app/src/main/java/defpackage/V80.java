package defpackage;

import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class V80 extends HttpsURLConnection {
    public final W80 a;
    public final HttpsURLConnection b;

    public V80(HttpsURLConnection httpsURLConnection, C0646Ia1 c0646Ia1, C2030Zu0 c2030Zu0) {
        super(httpsURLConnection.getURL());
        this.b = httpsURLConnection;
        this.a = new W80(httpsURLConnection, c0646Ia1, c2030Zu0);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.a.a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        W80 w80 = this.a;
        long jA = w80.e.a();
        C2030Zu0 c2030Zu0 = w80.b;
        c2030Zu0.j(jA);
        c2030Zu0.b();
        w80.a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.a.a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.a.a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        W80 w80 = this.a;
        w80.i();
        if (Build.VERSION.SDK_INT >= 24) {
            return w80.a.getContentLengthLong();
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.a.a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.a.a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.a.a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        W80 w80 = this.a;
        w80.i();
        if (Build.VERSION.SDK_INT >= 24) {
            return w80.a.getHeaderFieldLong(str, j);
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.a.a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.a.f();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        W80 w80 = this.a;
        w80.getClass();
        try {
            return w80.a.getPermission();
        } catch (IOException e) {
            long jA = w80.e.a();
            C2030Zu0 c2030Zu0 = w80.b;
            c2030Zu0.j(jA);
            AbstractC2224av0.c(c2030Zu0);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.a.a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.a.a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.a.a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.a.h();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.a.a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.a.a.getUseCaches();
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.a.a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.a.a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.a.a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.a.a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.a.a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.a.a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.a.a.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.a.a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.a.a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.a.a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.a.a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        W80 w80 = this.a;
        w80.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            w80.b.f = str2;
        }
        w80.a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.a.a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.a.a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.a.a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.a.c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        W80 w80 = this.a;
        w80.i();
        return w80.a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.a.a.setFixedLengthStreamingMode(j);
    }
}
