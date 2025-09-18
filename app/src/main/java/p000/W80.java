package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class W80 {

    /* renamed from: f */
    public static final C6989v4 f13002f = C6989v4.m25319d();

    /* renamed from: a */
    public final HttpURLConnection f13003a;

    /* renamed from: b */
    public final C8654Zu0 f13004b;

    /* renamed from: c */
    public long f13005c = -1;

    /* renamed from: d */
    public long f13006d = -1;

    /* renamed from: e */
    public final C7731Ia1 f13007e;

    public W80(HttpURLConnection httpURLConnection, C7731Ia1 c7731Ia1, C8654Zu0 c8654Zu0) {
        this.f13003a = httpURLConnection;
        this.f13004b = c8654Zu0;
        this.f13007e = c7731Ia1;
        c8654Zu0.m9636k(httpURLConnection.getURL().toString());
    }

    /* renamed from: a */
    public final void m8675a() {
        long j = this.f13005c;
        C8654Zu0 c8654Zu0 = this.f13004b;
        C7731Ia1 c7731Ia1 = this.f13007e;
        if (j == -1) {
            c7731Ia1.m3949d();
            long j2 = c7731Ia1.f5021a;
            this.f13005c = j2;
            c8654Zu0.m9632g(j2);
        }
        try {
            this.f13003a.connect();
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    /* renamed from: b */
    public final Object m8676b() throws IOException {
        C7731Ia1 c7731Ia1 = this.f13007e;
        m8683i();
        HttpURLConnection httpURLConnection = this.f13003a;
        int responseCode = httpURLConnection.getResponseCode();
        C8654Zu0 c8654Zu0 = this.f13004b;
        c8654Zu0.m9630e(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                c8654Zu0.m9633h(httpURLConnection.getContentType());
                return new S80((InputStream) content, c8654Zu0, c7731Ia1);
            }
            c8654Zu0.m9633h(httpURLConnection.getContentType());
            c8654Zu0.m9634i(httpURLConnection.getContentLength());
            c8654Zu0.m9635j(c7731Ia1.m3946a());
            c8654Zu0.m9628b();
            return content;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    /* renamed from: c */
    public final Object m8677c(Class[] clsArr) throws IOException {
        C7731Ia1 c7731Ia1 = this.f13007e;
        m8683i();
        HttpURLConnection httpURLConnection = this.f13003a;
        int responseCode = httpURLConnection.getResponseCode();
        C8654Zu0 c8654Zu0 = this.f13004b;
        c8654Zu0.m9630e(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                c8654Zu0.m9633h(httpURLConnection.getContentType());
                return new S80((InputStream) content, c8654Zu0, c7731Ia1);
            }
            c8654Zu0.m9633h(httpURLConnection.getContentType());
            c8654Zu0.m9634i(httpURLConnection.getContentLength());
            c8654Zu0.m9635j(c7731Ia1.m3946a());
            c8654Zu0.m9628b();
            return content;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    /* renamed from: d */
    public final InputStream m8678d() {
        HttpURLConnection httpURLConnection = this.f13003a;
        C8654Zu0 c8654Zu0 = this.f13004b;
        m8683i();
        try {
            c8654Zu0.m9630e(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f13002f.m25320a();
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new S80(errorStream, c8654Zu0, this.f13007e) : errorStream;
    }

    /* renamed from: e */
    public final InputStream m8679e() throws IOException {
        C7731Ia1 c7731Ia1 = this.f13007e;
        m8683i();
        HttpURLConnection httpURLConnection = this.f13003a;
        int responseCode = httpURLConnection.getResponseCode();
        C8654Zu0 c8654Zu0 = this.f13004b;
        c8654Zu0.m9630e(responseCode);
        c8654Zu0.m9633h(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new S80(inputStream, c8654Zu0, c7731Ia1) : inputStream;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f13003a.equals(obj);
    }

    /* renamed from: f */
    public final OutputStream m8680f() throws IOException {
        C7731Ia1 c7731Ia1 = this.f13007e;
        C8654Zu0 c8654Zu0 = this.f13004b;
        try {
            OutputStream outputStream = this.f13003a.getOutputStream();
            return outputStream != null ? new T80(outputStream, c8654Zu0, c7731Ia1) : outputStream;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    /* renamed from: g */
    public final int m8681g() throws IOException {
        m8683i();
        long j = this.f13006d;
        C7731Ia1 c7731Ia1 = this.f13007e;
        C8654Zu0 c8654Zu0 = this.f13004b;
        if (j == -1) {
            long jM3946a = c7731Ia1.m3946a();
            this.f13006d = jM3946a;
            C8498Wu0 c8498Wu0 = c8654Zu0.f15212d;
            c8498Wu0.m23922n();
            C8602Yu0.m9390B((C8602Yu0) c8498Wu0.f40483b, jM3946a);
        }
        try {
            int responseCode = this.f13003a.getResponseCode();
            c8654Zu0.m9630e(responseCode);
            return responseCode;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    /* renamed from: h */
    public final String m8682h() throws IOException {
        HttpURLConnection httpURLConnection = this.f13003a;
        m8683i();
        long j = this.f13006d;
        C7731Ia1 c7731Ia1 = this.f13007e;
        C8654Zu0 c8654Zu0 = this.f13004b;
        if (j == -1) {
            long jM3946a = c7731Ia1.m3946a();
            this.f13006d = jM3946a;
            C8498Wu0 c8498Wu0 = c8654Zu0.f15212d;
            c8498Wu0.m23922n();
            C8602Yu0.m9390B((C8602Yu0) c8498Wu0.f40483b, jM3946a);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            c8654Zu0.m9630e(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0, c8654Zu0);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f13003a.hashCode();
    }

    /* renamed from: i */
    public final void m8683i() {
        long j = this.f13005c;
        C8654Zu0 c8654Zu0 = this.f13004b;
        if (j == -1) {
            C7731Ia1 c7731Ia1 = this.f13007e;
            c7731Ia1.m3949d();
            long j2 = c7731Ia1.f5021a;
            this.f13005c = j2;
            c8654Zu0.m9632g(j2);
        }
        HttpURLConnection httpURLConnection = this.f13003a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            c8654Zu0.m9629d(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            c8654Zu0.m9629d("POST");
        } else {
            c8654Zu0.m9629d("GET");
        }
    }

    public final String toString() {
        return this.f13003a.toString();
    }
}
