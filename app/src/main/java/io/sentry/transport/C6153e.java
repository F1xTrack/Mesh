package io.sentry.transport;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.C5750A1;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.debugmeta.C6042c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p000.AbstractC7222ym;

/* renamed from: io.sentry.transport.e */
/* loaded from: classes2.dex */
public final class C6153e {

    /* renamed from: e */
    public static final Charset f34635e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Proxy f34636a;

    /* renamed from: b */
    public final C6042c f34637b;

    /* renamed from: c */
    public final C5759D1 f34638c;

    /* renamed from: d */
    public final C6161m f34639d;

    public C6153e(C5759D1 c5759d1, C6042c c6042c, C6161m c6161m) {
        Proxy proxy;
        String str;
        String str2;
        this.f34637b = c6042c;
        this.f34638c = c5759d1;
        this.f34639d = c6161m;
        C5750A1 proxy2 = c5759d1.getProxy();
        if (proxy2 == null || (str = proxy2.f33206b) == null || (str2 = proxy2.f33205a) == null) {
            proxy = null;
        } else {
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str2, Integer.parseInt(str)));
            } catch (NumberFormatException e) {
                this.f34638c.getLogger().mo21405c(EnumC6069n1.ERROR, e, AbstractC7222ym.m26234k("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
            }
        }
        this.f34636a = proxy;
        if (proxy == null || c5759d1.getProxy() == null) {
            return;
        }
        String str3 = c5759d1.getProxy().f33207c;
        String str4 = c5759d1.getProxy().f33208d;
        if (str3 == null || str4 == null) {
            return;
        }
        Authenticator.setDefault(new C6158j(str3, str4));
    }

    /* renamed from: a */
    public static void m21867a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    /* renamed from: b */
    public static String m21868b(HttpURLConnection httpURLConnection) throws IOException {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f34635e));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    /* renamed from: c */
    public final AbstractC6003a m21869c(HttpURLConnection httpURLConnection) {
        C5759D1 c5759d1 = this.f34638c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                m21871e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return C6164p.f34657a;
                }
                ILogger logger = c5759d1.getLogger();
                EnumC6069n1 enumC6069n1 = EnumC6069n1.ERROR;
                logger.mo21407k(enumC6069n1, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (c5759d1.isDebug()) {
                    c5759d1.getLogger().mo21407k(enumC6069n1, "%s", m21868b(httpURLConnection));
                }
                return new C6163o(responseCode);
            } catch (IOException e) {
                c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, e, "Error reading and logging the response stream", new Object[0]);
                m21867a(httpURLConnection);
                return new C6163o(-1);
            }
        } finally {
            m21867a(httpURLConnection);
        }
    }

    /* renamed from: d */
    public final AbstractC6003a m21870d(C6042c c6042c) {
        OutputStream outputStream;
        C6042c c6042c2 = this.f34637b;
        URL url = (URL) c6042c2.f34198b;
        Proxy proxy = this.f34636a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()) : (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)));
        for (Map.Entry entry : ((HashMap) c6042c2.f34199c).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        C5759D1 c5759d1 = this.f34638c;
        httpURLConnection.setConnectTimeout(c5759d1.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(c5759d1.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = c5759d1.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            outputStream = httpURLConnection.getOutputStream();
        } finally {
            try {
            } finally {
            }
        }
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                c5759d1.getSerializer().mo21462f(c6042c, gZIPOutputStream);
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                return m21869c(httpURLConnection);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x015a  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21871e(java.net.HttpURLConnection r25, int r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.C6153e.m21871e(java.net.HttpURLConnection, int):void");
    }
}
