package p000;

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

/* renamed from: IF */
/* loaded from: classes.dex */
public final class C0520IF extends AbstractC1426Wf {

    /* renamed from: e */
    public final int f4850e;

    /* renamed from: f */
    public final int f4851f;

    /* renamed from: g */
    public final C0827N8 f4852g;

    /* renamed from: h */
    public final C0827N8 f4853h;

    /* renamed from: i */
    public HttpURLConnection f4854i;

    /* renamed from: j */
    public InputStream f4855j;

    /* renamed from: k */
    public boolean f4856k;

    /* renamed from: l */
    public int f4857l;

    /* renamed from: m */
    public long f4858m;

    /* renamed from: n */
    public long f4859n;

    public C0520IF(int i, int i2, C0827N8 c0827n8) {
        super(true);
        this.f4850e = i;
        this.f4851f = i2;
        this.f4852g = c0827n8;
        this.f4853h = new C0827N8(13);
    }

    /* renamed from: s */
    public static void m3791s(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (httpURLConnection == null || AbstractC7485Dh1.f2166a > 20) {
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
    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo2365c(p000.C3976eD r23) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0520IF.mo2365c(eD):long");
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        try {
            InputStream inputStream = this.f4855j;
            if (inputStream != null) {
                long j = this.f4858m;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f4859n;
                }
                m3791s(this.f4854i, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = AbstractC7485Dh1.f2166a;
                    throw new C10987s40(2000, 3, e);
                }
            }
        } finally {
            this.f4855j = null;
            m3792i();
            if (this.f4856k) {
                this.f4856k = false;
                m8826e();
            }
        }
    }

    /* renamed from: i */
    public final void m3792i() {
        HttpURLConnection httpURLConnection = this.f4854i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC10872rA1.m24172e("Unexpected error while disconnecting", e);
            }
            this.f4854i = null;
        }
    }

    @Override // p000.AbstractC1426Wf, p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        HttpURLConnection httpURLConnection = this.f4854i;
        return httpURLConnection == null ? C10007kQ0.f36495g : new C0457HF(httpURLConnection.getHeaderFields());
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        HttpURLConnection httpURLConnection = this.f4854i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: p */
    public final HttpURLConnection m3794p(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f4850e);
        httpURLConnection.setReadTimeout(this.f4851f);
        HashMap map2 = new HashMap();
        C0827N8 c0827n8 = this.f4852g;
        if (c0827n8 != null) {
            map2.putAll(c0827n8.m5563q());
        }
        map2.putAll(this.f4853h.m5563q());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strM3742a = I40.m3742a(j, j2);
        if (strM3742a != null) {
            httpURLConnection.setRequestProperty("Range", strM3742a);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C3976eD.m17878b(i));
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
    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo2367r(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L32
        L4:
            long r0 = r6.f4858m     // Catch: java.io.IOException -> L33
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.f4859n     // Catch: java.io.IOException -> L33
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
            java.io.InputStream r0 = r6.f4855j     // Catch: java.io.IOException -> L33
            int r1 = p000.AbstractC7485Dh1.f2166a     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r3) goto L29
            goto L16
        L29:
            long r8 = r6.f4859n     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.f4859n = r8     // Catch: java.io.IOException -> L33
            r6.m8825a(r7)     // Catch: java.io.IOException -> L33
        L32:
            return r7
        L33:
            r7 = move-exception
            int r8 = p000.AbstractC7485Dh1.f2166a
            r8 = 2
            s40 r7 = p000.C10987s40.m24612b(r8, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0520IF.mo2367r(byte[], int, int):int");
    }

    /* renamed from: t */
    public final void m3795t(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f4855j;
            int i = AbstractC7485Dh1.f2166a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C10987s40(2000, 1, new InterruptedIOException());
            }
            if (i2 == -1) {
                throw new C10987s40(2008);
            }
            j -= i2;
            m8825a(i2);
        }
    }
}
