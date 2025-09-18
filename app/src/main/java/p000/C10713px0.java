package p000;

import android.net.Uri;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* renamed from: px0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10713px0 extends AbstractC1426Wf {

    /* renamed from: e */
    public final C10585ox0 f40449e;

    /* renamed from: f */
    public final C0827N8 f40450f;

    /* renamed from: g */
    public final String f40451g;

    /* renamed from: h */
    public final C0827N8 f40452h;

    /* renamed from: i */
    public HS0 f40453i;

    /* renamed from: j */
    public InputStream f40454j;

    /* renamed from: k */
    public boolean f40455k;

    /* renamed from: l */
    public long f40456l;

    /* renamed from: m */
    public long f40457m;

    static {
        AbstractC10953rp0.m24489a("media3.datasource.okhttp");
    }

    public C10713px0(C10585ox0 c10585ox0, String str, C0827N8 c0827n8) {
        super(true);
        this.f40449e = c10585ox0;
        this.f40451g = str;
        this.f40452h = c0827n8;
        this.f40450f = new C0827N8(13);
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws IOException {
        D40 d40M970c;
        C11033sR0 c11033sR0M23863h;
        long j = 0;
        this.f40457m = 0L;
        this.f40456l = 0L;
        m8827g();
        long j2 = c3976eD.f26600f;
        String string = c3976eD.f26595a.toString();
        O90.m5968f(string, "<this>");
        try {
            C40 c40 = new C40();
            c40.m973f(null, string);
            d40M970c = c40.m970c();
        } catch (IllegalArgumentException unused) {
            d40M970c = null;
        }
        if (d40M970c == null) {
            throw new C10987s40("Malformed URL", GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        C6937uF c6937uF = new C6937uF(9, false);
        c6937uF.f43616a = d40M970c;
        HashMap map = new HashMap();
        C0827N8 c0827n8 = this.f40452h;
        if (c0827n8 != null) {
            map.putAll(c0827n8.m5563q());
        }
        map.putAll(this.f40450f.m5563q());
        map.putAll(c3976eD.f26599e);
        for (Map.Entry entry : map.entrySet()) {
            c6937uF.m25145y((String) entry.getKey(), (String) entry.getValue());
        }
        long j3 = c3976eD.f26601g;
        String strM3742a = I40.m3742a(j2, j3);
        if (strM3742a != null) {
            c6937uF.m25139k("Range", strM3742a);
        }
        String str = this.f40451g;
        if (str != null) {
            c6937uF.m25139k("User-Agent", str);
        }
        if (!c3976eD.m17880c(1)) {
            c6937uF.m25139k("Accept-Encoding", "identity");
        }
        int i = c3976eD.f26597c;
        byte[] bArr = c3976eD.f26598d;
        if (bArr != null) {
            c11033sR0M23863h = C10689pl0.m23863h(0, bArr.length, null, bArr);
        } else if (i == 2) {
            byte[] bArr2 = AbstractC7485Dh1.f2171f;
            O90.m5968f(bArr2, "<this>");
            c11033sR0M23863h = C10689pl0.m23863h(0, bArr2.length, null, bArr2);
        } else {
            c11033sR0M23863h = null;
        }
        c6937uF.m25130A(C3976eD.m17878b(i), c11033sR0M23863h);
        DN0 dn0M23580b = this.f40449e.m23580b(c6937uF.m25141o());
        try {
            C11560wZ0 c11560wZ0 = new C11560wZ0();
            FirebasePerfOkHttpClient.enqueue(dn0M23580b, new C9432fw1(23, c11560wZ0));
            try {
                try {
                    HS0 hs0 = (HS0) c11560wZ0.get();
                    this.f40453i = hs0;
                    IS0 is0 = hs0.f4301g;
                    is0.getClass();
                    this.f40454j = is0.m3876m();
                    boolean zM3428n = hs0.m3428n();
                    long j4 = c3976eD.f26600f;
                    int i2 = hs0.f4298d;
                    if (zM3428n) {
                        is0.mo3384p();
                        if (i2 == 200 && j4 != 0) {
                            j = j4;
                        }
                        if (j3 != -1) {
                            this.f40456l = j3;
                        } else {
                            long jMo3383o = is0.mo3383o();
                            this.f40456l = jMo3383o != -1 ? jMo3383o - j : -1L;
                        }
                        this.f40455k = true;
                        m8828h(c3976eD);
                        try {
                            m23897p(j);
                            return this.f40456l;
                        } catch (C10987s40 e) {
                            m23896i();
                            throw e;
                        }
                    }
                    K20 k20 = hs0.f4300f;
                    if (i2 == 416 && j4 == I40.m3743b(k20.m4524b("Content-Range"))) {
                        this.f40455k = true;
                        m8828h(c3976eD);
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.f40454j;
                        inputStream.getClass();
                        AbstractC0047Ak.m311b(inputStream);
                    } catch (IOException unused2) {
                        int i3 = AbstractC7485Dh1.f2166a;
                    }
                    TreeMap treeMapM4527k = k20.m4527k();
                    m23896i();
                    throw new C11243u40(i2, i2 == 416 ? new C1650aD(2008) : null, treeMapM4527k);
                } catch (InterruptedException unused3) {
                    dn0M23580b.m1668e();
                    throw new InterruptedIOException();
                }
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw C10987s40.m24612b(1, e3);
        }
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        if (this.f40455k) {
            this.f40455k = false;
            m8826e();
            m23896i();
        }
    }

    /* renamed from: i */
    public final void m23896i() {
        HS0 hs0 = this.f40453i;
        if (hs0 != null) {
            IS0 is0 = hs0.f4301g;
            is0.getClass();
            is0.close();
            this.f40453i = null;
        }
        this.f40454j = null;
    }

    @Override // p000.AbstractC1426Wf, p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        HS0 hs0 = this.f40453i;
        return hs0 == null ? Collections.emptyMap() : hs0.f4300f.m4527k();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        HS0 hs0 = this.f40453i;
        if (hs0 == null) {
            return null;
        }
        return Uri.parse(hs0.f4295a.f40870a.f1835h);
    }

    /* renamed from: p */
    public final void m23897p(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096);
                InputStream inputStream = this.f40454j;
                int i = AbstractC7485Dh1.f2166a;
                int i2 = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i2 == -1) {
                    throw new C10987s40(2008);
                }
                j -= i2;
                m8825a(i2);
            } catch (IOException e) {
                if (!(e instanceof C10987s40)) {
                    throw new C10987s40(2000);
                }
                throw ((C10987s40) e);
            }
        }
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
            long r0 = r6.f40456l     // Catch: java.io.IOException -> L33
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.f40457m     // Catch: java.io.IOException -> L33
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
            java.io.InputStream r0 = r6.f40454j     // Catch: java.io.IOException -> L33
            int r1 = p000.AbstractC7485Dh1.f2166a     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r3) goto L29
            goto L16
        L29:
            long r8 = r6.f40457m     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.f40457m = r8     // Catch: java.io.IOException -> L33
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C10713px0.mo2367r(byte[], int, int):int");
    }
}
