package ru.ok.tracer.base.http;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.AbstractC2141aT1;
import defpackage.AbstractC8069xu;
import defpackage.D51;
import defpackage.NP1;
import defpackage.O90;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.base.cert.TrustManagerUtils;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ok/tracer/base/http/HttpUrlConnectionHttpClient;", "Lru/ok/tracer/base/http/HttpClient;", "Landroid/content/Context;", "context", "", "userAgent", "", "trafficStatsTag", "connectTimeout", "readTimeout", "<init>", "(Landroid/content/Context;Ljava/lang/String;III)V", "Ljava/net/HttpURLConnection;", "connection", "getResponseCode", "(Ljava/net/HttpURLConnection;)I", "conn", "LTf1;", "connect", "(Ljava/net/HttpURLConnection;III)V", "Lru/ok/tracer/base/http/HttpRequest;", "request", "Lru/ok/tracer/base/http/HttpResponse;", "execute", "(Lru/ok/tracer/base/http/HttpRequest;)Lru/ok/tracer/base/http/HttpResponse;", "Landroid/content/Context;", "Ljava/lang/String;", "I", "Companion", "tracer-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpUrlConnectionHttpClient implements HttpClient {
    public static final int NO_TRAFFIC_STATS_TAG = -1;
    private final int connectTimeout;
    private final Context context;
    private final int readTimeout;
    private final int trafficStatsTag;
    private final String userAgent;

    public HttpUrlConnectionHttpClient(Context context, String str, int i, int i2, int i3) {
        O90.f(context, "context");
        this.context = context;
        this.userAgent = str;
        this.trafficStatsTag = i;
        this.connectTimeout = i2;
        this.readTimeout = i3;
    }

    private final void connect(HttpURLConnection conn, int trafficStatsTag, int connectTimeout, int readTimeout) throws IOException {
        int threadStatsTag;
        if (trafficStatsTag != -1) {
            threadStatsTag = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(trafficStatsTag);
        } else {
            threadStatsTag = -1;
        }
        try {
            if (connectTimeout > 0) {
                try {
                    try {
                        try {
                            conn.setConnectTimeout(connectTimeout);
                        } catch (IllegalArgumentException e) {
                            if (Build.VERSION.SDK_INT <= 23 && "timeout < 0".equals(e.getMessage())) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    } catch (SecurityException e2) {
                        Throwable cause = e2.getCause();
                        if (cause == null) {
                            throw e2;
                        }
                        String name = cause.getClass().getName();
                        if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                            throw e2;
                        }
                        throw new UnknownHostException();
                    }
                } catch (NullPointerException e3) {
                    if (Build.VERSION.SDK_INT <= 23 && "ssl_session == null".equals(e3.getMessage())) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
            }
            if (readTimeout > 0) {
                conn.setReadTimeout(readTimeout);
            }
            conn.connect();
            if (threadStatsTag != -1) {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
        } catch (Throwable th) {
            if (threadStatsTag != -1) {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
            throw th;
        }
    }

    private final int getResponseCode(HttpURLConnection connection) throws IOException {
        try {
            return connection.getResponseCode();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException(e);
        } catch (NullPointerException e2) {
            String message = e2.getMessage();
            if (message == null || !D51.o(message, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false)) {
                throw e2;
            }
            throw new IOException(e2);
        }
    }

    @Override // ru.ok.tracer.base.http.HttpClient
    public HttpResponse execute(HttpRequest request) throws IOException {
        String str;
        BufferedInputStream bufferedInputStream;
        byte[] bArrF;
        O90.f(request, "request");
        String method = request.getMethod();
        String url = request.getUrl();
        HttpRequestBody body = request.getBody();
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection());
        O90.d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(TrustManagerUtils.createSSLSocketFactory(TrustManagerUtils.createTracerTrustManager(this.context)));
        }
        try {
            httpURLConnection.setRequestMethod(method);
            String str2 = this.userAgent;
            if (str2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            if (body != null) {
                httpURLConnection.setRequestProperty("Content-Type", body.getContentType());
                httpURLConnection.setDoOutput(true);
                if (body.getContentLength() >= 0) {
                    httpURLConnection.setFixedLengthStreamingMode(body.getContentLength());
                } else {
                    httpURLConnection.setChunkedStreamingMode(4096);
                }
            }
            connect(httpURLConnection, this.trafficStatsTag, this.connectTimeout, this.readTimeout);
            if (body != null) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    O90.e(outputStream, "it");
                    body.writeTo(outputStream);
                    AbstractC2141aT1.a(outputStream, null);
                } finally {
                }
            }
            int responseCode = getResponseCode(httpURLConnection);
            String responseMessage = httpURLConnection.getResponseMessage();
            List<String> list = httpURLConnection.getHeaderFields().get("Content-Type");
            if (list == null || (str = (String) AbstractC8069xu.C(list)) == null) {
                str = "application/octet-stream";
            }
            if (responseCode < 400) {
                InputStream inputStream = httpURLConnection.getInputStream();
                O90.e(inputStream, "conn.inputStream");
                bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
                try {
                    bArrF = NP1.f(bufferedInputStream);
                    AbstractC2141aT1.a(bufferedInputStream, null);
                } finally {
                }
            } else {
                InputStream errorStream = httpURLConnection.getErrorStream();
                O90.e(errorStream, "conn.errorStream");
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
                try {
                    bArrF = NP1.f(bufferedInputStream);
                    AbstractC2141aT1.a(bufferedInputStream, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            O90.e(responseMessage, "responseMessage");
            return new HttpResponse(responseCode, responseMessage, new HttpByteArrayBody(str, bArrF));
        } catch (IOException e) {
            httpURLConnection.disconnect();
            throw e;
        }
    }

    public /* synthetic */ HttpUrlConnectionHttpClient(Context context, String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? -1 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }
}
