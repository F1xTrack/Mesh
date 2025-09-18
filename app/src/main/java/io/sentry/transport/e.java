package io.sentry.transport;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.AbstractC8235ym;
import io.sentry.A1;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
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

/* loaded from: classes2.dex */
public final class e {
    public static final Charset e = Charset.forName("UTF-8");
    public final Proxy a;
    public final io.sentry.internal.debugmeta.c b;
    public final D1 c;
    public final m d;

    public e(D1 d1, io.sentry.internal.debugmeta.c cVar, m mVar) {
        Proxy proxy;
        String str;
        String str2;
        this.b = cVar;
        this.c = d1;
        this.d = mVar;
        A1 proxy2 = d1.getProxy();
        if (proxy2 == null || (str = proxy2.b) == null || (str2 = proxy2.a) == null) {
            proxy = null;
        } else {
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str2, Integer.parseInt(str)));
            } catch (NumberFormatException e2) {
                this.c.getLogger().c(EnumC5148n1.ERROR, e2, AbstractC8235ym.k("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
            }
        }
        this.a = proxy;
        if (proxy == null || d1.getProxy() == null) {
            return;
        }
        String str3 = d1.getProxy().c;
        String str4 = d1.getProxy().d;
        if (str3 == null || str4 == null) {
            return;
        }
        Authenticator.setDefault(new j(str3, str4));
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    public static String b(HttpURLConnection httpURLConnection) throws IOException {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
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

    public final io.sentry.config.a c(HttpURLConnection httpURLConnection) {
        D1 d1 = this.c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    d1.getLogger().k(EnumC5148n1.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return p.a;
                }
                ILogger logger = d1.getLogger();
                EnumC5148n1 enumC5148n1 = EnumC5148n1.ERROR;
                logger.k(enumC5148n1, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (d1.isDebug()) {
                    d1.getLogger().k(enumC5148n1, "%s", b(httpURLConnection));
                }
                return new o(responseCode);
            } catch (IOException e2) {
                d1.getLogger().c(EnumC5148n1.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return new o(-1);
            }
        } finally {
            a(httpURLConnection);
        }
    }

    public final io.sentry.config.a d(io.sentry.internal.debugmeta.c cVar) {
        OutputStream outputStream;
        io.sentry.internal.debugmeta.c cVar2 = this.b;
        URL url = (URL) cVar2.b;
        Proxy proxy = this.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()) : (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)));
        for (Map.Entry entry : ((HashMap) cVar2.c).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        D1 d1 = this.c;
        httpURLConnection.setConnectTimeout(d1.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(d1.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = d1.getSslSocketFactory();
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
                d1.getSerializer().f(cVar, gZIPOutputStream);
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                return c(httpURLConnection);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.net.HttpURLConnection r25, int r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.e.e(java.net.HttpURLConnection, int):void");
    }
}
