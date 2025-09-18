package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class W80 {
    public static final C7533v4 f = C7533v4.d();
    public final HttpURLConnection a;
    public final C2030Zu0 b;
    public long c = -1;
    public long d = -1;
    public final C0646Ia1 e;

    public W80(HttpURLConnection httpURLConnection, C0646Ia1 c0646Ia1, C2030Zu0 c2030Zu0) {
        this.a = httpURLConnection;
        this.b = c2030Zu0;
        this.e = c0646Ia1;
        c2030Zu0.k(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        C2030Zu0 c2030Zu0 = this.b;
        C0646Ia1 c0646Ia1 = this.e;
        if (j == -1) {
            c0646Ia1.d();
            long j2 = c0646Ia1.a;
            this.c = j2;
            c2030Zu0.g(j2);
        }
        try {
            this.a.connect();
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    public final Object b() throws IOException {
        C0646Ia1 c0646Ia1 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        C2030Zu0 c2030Zu0 = this.b;
        c2030Zu0.e(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                c2030Zu0.h(httpURLConnection.getContentType());
                return new S80((InputStream) content, c2030Zu0, c0646Ia1);
            }
            c2030Zu0.h(httpURLConnection.getContentType());
            c2030Zu0.i(httpURLConnection.getContentLength());
            c2030Zu0.j(c0646Ia1.a());
            c2030Zu0.b();
            return content;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        C0646Ia1 c0646Ia1 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        C2030Zu0 c2030Zu0 = this.b;
        c2030Zu0.e(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                c2030Zu0.h(httpURLConnection.getContentType());
                return new S80((InputStream) content, c2030Zu0, c0646Ia1);
            }
            c2030Zu0.h(httpURLConnection.getContentType());
            c2030Zu0.i(httpURLConnection.getContentLength());
            c2030Zu0.j(c0646Ia1.a());
            c2030Zu0.b();
            return content;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.a;
        C2030Zu0 c2030Zu0 = this.b;
        i();
        try {
            c2030Zu0.e(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a();
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new S80(errorStream, c2030Zu0, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        C0646Ia1 c0646Ia1 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        C2030Zu0 c2030Zu0 = this.b;
        c2030Zu0.e(responseCode);
        c2030Zu0.h(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new S80(inputStream, c2030Zu0, c0646Ia1) : inputStream;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        C0646Ia1 c0646Ia1 = this.e;
        C2030Zu0 c2030Zu0 = this.b;
        try {
            OutputStream outputStream = this.a.getOutputStream();
            return outputStream != null ? new T80(outputStream, c2030Zu0, c0646Ia1) : outputStream;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.d;
        C0646Ia1 c0646Ia1 = this.e;
        C2030Zu0 c2030Zu0 = this.b;
        if (j == -1) {
            long jA = c0646Ia1.a();
            this.d = jA;
            C1796Wu0 c1796Wu0 = c2030Zu0.d;
            c1796Wu0.n();
            C1952Yu0.B((C1952Yu0) c1796Wu0.b, jA);
        }
        try {
            int responseCode = this.a.getResponseCode();
            c2030Zu0.e(responseCode);
            return responseCode;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.a;
        i();
        long j = this.d;
        C0646Ia1 c0646Ia1 = this.e;
        C2030Zu0 c2030Zu0 = this.b;
        if (j == -1) {
            long jA = c0646Ia1.a();
            this.d = jA;
            C1796Wu0 c1796Wu0 = c2030Zu0.d;
            c1796Wu0.n();
            C1952Yu0.B((C1952Yu0) c1796Wu0.b, jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            c2030Zu0.e(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            AbstractC1705Vq.o(c0646Ia1, c2030Zu0, c2030Zu0);
            throw e;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        long j = this.c;
        C2030Zu0 c2030Zu0 = this.b;
        if (j == -1) {
            C0646Ia1 c0646Ia1 = this.e;
            c0646Ia1.d();
            long j2 = c0646Ia1.a;
            this.c = j2;
            c2030Zu0.g(j2);
        }
        HttpURLConnection httpURLConnection = this.a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            c2030Zu0.d(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            c2030Zu0.d("POST");
        } else {
            c2030Zu0.d("GET");
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
