package p000;

import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* loaded from: classes.dex */
public final class U80 extends HttpURLConnection {

    /* renamed from: a */
    public final W80 f11662a;

    public U80(HttpURLConnection httpURLConnection, C7731Ia1 c7731Ia1, C8654Zu0 c8654Zu0) {
        super(httpURLConnection.getURL());
        this.f11662a = new W80(httpURLConnection, c7731Ia1, c8654Zu0);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f11662a.f13003a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f11662a.m8675a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        W80 w80 = this.f11662a;
        long jM3946a = w80.f13007e.m3946a();
        C8654Zu0 c8654Zu0 = w80.f13004b;
        c8654Zu0.m9635j(jM3946a);
        c8654Zu0.m9628b();
        w80.f13003a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f11662a.f13003a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f11662a.f13003a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f11662a.f13003a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f11662a.m8676b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        W80 w80 = this.f11662a;
        w80.m8683i();
        if (Build.VERSION.SDK_INT >= 24) {
            return w80.f13003a.getContentLengthLong();
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f11662a.f13003a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f11662a.f13003a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f11662a.f13003a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f11662a.m8678d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        W80 w80 = this.f11662a;
        w80.m8683i();
        if (Build.VERSION.SDK_INT >= 24) {
            return w80.f13003a.getHeaderFieldLong(str, j);
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f11662a.f13003a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f11662a.m8679e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f11662a.f13003a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f11662a.m8680f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        W80 w80 = this.f11662a;
        w80.getClass();
        try {
            return w80.f13003a.getPermission();
        } catch (IOException e) {
            long jM3946a = w80.f13007e.m3946a();
            C8654Zu0 c8654Zu0 = w80.f13004b;
            c8654Zu0.m9635j(jM3946a);
            AbstractC8784av0.m10381c(c8654Zu0);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f11662a.f13003a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f11662a.f13003a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f11662a.f13003a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f11662a.f13003a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f11662a.m8681g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f11662a.m8682h();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f11662a.f13003a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f11662a.f13003a.getUseCaches();
    }

    public final int hashCode() {
        return this.f11662a.f13003a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f11662a.f13003a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f11662a.f13003a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f11662a.f13003a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f11662a.f13003a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f11662a.f13003a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f11662a.f13003a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f11662a.f13003a.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.f11662a.f13003a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f11662a.f13003a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f11662a.f13003a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f11662a.f13003a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        W80 w80 = this.f11662a;
        w80.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            w80.f13004b.f15214f = str2;
        }
        w80.f13003a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f11662a.f13003a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f11662a.f13003a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f11662a.f13003a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f11662a.m8677c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        W80 w80 = this.f11662a;
        w80.m8683i();
        return w80.f13003a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.f11662a.f13003a.setFixedLengthStreamingMode(j);
    }
}
