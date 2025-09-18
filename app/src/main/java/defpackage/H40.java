package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* loaded from: classes.dex */
public final class H40 implements KC {
    public final E10 a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public H40(E10 e10, int i) {
        this.a = e10;
        this.b = i;
    }

    @Override // defpackage.KC
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.KC
    public final void b() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.KC
    public final void c(EnumC7561vD0 enumC7561vD0, JC jc) {
        E10 e10 = this.a;
        int i = AbstractC6136nl0.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (e10.f == null) {
                    e10.f = new URL(e10.d());
                }
                jc.j(e(e10.f, 0, null, e10.b.a()));
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (IOException e) {
                jc.e(e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    @Override // defpackage.KC
    public final void cancel() {
        this.e = true;
    }

    @Override // defpackage.KC
    public final XC d() {
        return XC.b;
    }

    public final InputStream e(URL url, int i, URL url2, Map map) throws IOException {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new C6353ou(-1, (IOException) null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C6353ou(-1, (IOException) null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                try {
                    responseCode = this.c.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new C0170By(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new C6353ou(responseCode2, e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (responseCode == -1) {
                        throw new C6353ou(responseCode, (IOException) null, "Http request failed");
                    }
                    try {
                        throw new C6353ou(responseCode, (IOException) null, this.c.getResponseMessage());
                    } catch (IOException e2) {
                        throw new C6353ou(responseCode, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C6353ou(responseCode, (IOException) null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return e(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C6353ou(responseCode, e3, AbstractC8235ym.v("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                try {
                    responseCode2 = this.c.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new C6353ou(responseCode2, e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new C6353ou(0, e5, "URL.openConnection threw");
        }
    }
}
