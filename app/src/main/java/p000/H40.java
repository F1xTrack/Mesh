package p000;

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
public final class H40 implements InterfaceC0643KC {

    /* renamed from: a */
    public final E10 f4040a;

    /* renamed from: b */
    public final int f4041b;

    /* renamed from: c */
    public HttpURLConnection f4042c;

    /* renamed from: d */
    public InputStream f4043d;

    /* renamed from: e */
    public volatile boolean f4044e;

    public H40(E10 e10, int i) {
        this.f4040a = e10;
        this.f4041b = i;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: b */
    public final void mo3255b() throws IOException {
        InputStream inputStream = this.f4043d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f4042c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f4042c = null;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: c */
    public final void mo3256c(EnumC11389vD0 enumC11389vD0, InterfaceC0580JC interfaceC0580JC) {
        E10 e10 = this.f4040a;
        int i = AbstractC10433nl0.f38500a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (e10.f2346f == null) {
                    e10.f2346f = new URL(e10.m1982d());
                }
                interfaceC0580JC.mo557j(m3258e(e10.f2346f, 0, null, e10.f2342b.mo4869a()));
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (IOException e) {
                interfaceC0580JC.mo556e(e);
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

    @Override // p000.InterfaceC0643KC
    public final void cancel() {
        this.f4044e = true;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: d */
    public final EnumC1460XC mo3257d() {
        return EnumC1460XC.f13615b;
    }

    /* renamed from: e */
    public final InputStream m3258e(URL url, int i, URL url2, Map map) throws IOException {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new C6583ou(-1, (IOException) null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C6583ou(-1, (IOException) null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.f4041b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f4042c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f4043d = this.f4042c.getInputStream();
                if (this.f4044e) {
                    return null;
                }
                try {
                    responseCode = this.f4042c.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f4042c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f4043d = new C0124By(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.f4043d = httpURLConnection2.getInputStream();
                        }
                        return this.f4043d;
                    } catch (IOException e) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new C6583ou(responseCode2, e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (responseCode == -1) {
                        throw new C6583ou(responseCode, (IOException) null, "Http request failed");
                    }
                    try {
                        throw new C6583ou(responseCode, (IOException) null, this.f4042c.getResponseMessage());
                    } catch (IOException e2) {
                        throw new C6583ou(responseCode, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.f4042c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C6583ou(responseCode, (IOException) null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo3255b();
                    return m3258e(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C6583ou(responseCode, e3, AbstractC7222ym.m26245v("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                try {
                    responseCode2 = this.f4042c.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new C6583ou(responseCode2, e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new C6583ou(0, e5, "URL.openConnection threw");
        }
    }
}
