package defpackage;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class IF extends AbstractC1750Wf {
    public final int e;
    public final int f;
    public final N8 g;
    public final N8 h;
    public HttpURLConnection i;
    public InputStream j;
    public boolean k;
    public int l;
    public long m;
    public long n;

    public IF(int i, int i2, N8 n8) {
        super(true);
        this.e = i;
        this.f = i2;
        this.g = n8;
        this.h = new N8(13);
    }

    public static void s(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (httpURLConnection == null || AbstractC0277Dh1.a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    @Override // defpackage.ZC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(defpackage.C3538eD r23) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IF.c(eD):long");
    }

    @Override // defpackage.ZC
    public final void close() {
        try {
            InputStream inputStream = this.j;
            if (inputStream != null) {
                long j = this.m;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.n;
                }
                s(this.i, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = AbstractC0277Dh1.a;
                    throw new C6961s40(2000, 3, e);
                }
            }
        } finally {
            this.j = null;
            i();
            if (this.k) {
                this.k = false;
                e();
            }
        }
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC6789rA1.e("Unexpected error while disconnecting", e);
            }
            this.i = null;
        }
    }

    @Override // defpackage.AbstractC1750Wf, defpackage.ZC
    public final Map l() {
        HttpURLConnection httpURLConnection = this.i;
        return httpURLConnection == null ? C5500kQ0.g : new HF(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.ZC
    public final Uri o() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection p(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap map2 = new HashMap();
        N8 n8 = this.g;
        if (n8 != null) {
            map2.putAll(n8.q());
        }
        map2.putAll(this.h.q());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = I40.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C3538eD.b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // defpackage.RC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L32
        L4:
            long r0 = r6.m     // Catch: java.io.IOException -> L33
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.n     // Catch: java.io.IOException -> L33
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L18
        L16:
            r7 = r3
            goto L32
        L18:
            long r4 = (long) r9     // Catch: java.io.IOException -> L33
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L33
            int r9 = (int) r0     // Catch: java.io.IOException -> L33
        L1e:
            java.io.InputStream r0 = r6.j     // Catch: java.io.IOException -> L33
            int r1 = defpackage.AbstractC0277Dh1.a     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r3) goto L29
            goto L16
        L29:
            long r8 = r6.n     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.n = r8     // Catch: java.io.IOException -> L33
            r6.a(r7)     // Catch: java.io.IOException -> L33
        L32:
            return r7
        L33:
            r7 = move-exception
            int r8 = defpackage.AbstractC0277Dh1.a
            r8 = 2
            s40 r7 = defpackage.C6961s40.b(r8, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IF.r(byte[], int, int):int");
    }

    public final void t(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.j;
            int i = AbstractC0277Dh1.a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C6961s40(2000, 1, new InterruptedIOException());
            }
            if (i2 == -1) {
                throw new C6961s40(2008);
            }
            j -= i2;
            a(i2);
        }
    }
}
