package defpackage;

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
public final class C6554px0 extends AbstractC1750Wf {
    public final C6363ox0 e;
    public final N8 f;
    public final String g;
    public final N8 h;
    public HS0 i;
    public InputStream j;
    public boolean k;
    public long l;
    public long m;

    static {
        AbstractC6911rp0.a("media3.datasource.okhttp");
    }

    public C6554px0(C6363ox0 c6363ox0, String str, N8 n8) {
        super(true);
        this.e = c6363ox0;
        this.g = str;
        this.h = n8;
        this.f = new N8(13);
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws IOException {
        D40 d40C;
        C7030sR0 c7030sR0H;
        long j = 0;
        this.m = 0L;
        this.l = 0L;
        g();
        long j2 = c3538eD.f;
        String string = c3538eD.a.toString();
        O90.f(string, "<this>");
        try {
            C40 c40 = new C40();
            c40.f(null, string);
            d40C = c40.c();
        } catch (IllegalArgumentException unused) {
            d40C = null;
        }
        if (d40C == null) {
            throw new C6961s40("Malformed URL", GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        C7375uF c7375uF = new C7375uF(9, false);
        c7375uF.a = d40C;
        HashMap map = new HashMap();
        N8 n8 = this.h;
        if (n8 != null) {
            map.putAll(n8.q());
        }
        map.putAll(this.f.q());
        map.putAll(c3538eD.e);
        for (Map.Entry entry : map.entrySet()) {
            c7375uF.y((String) entry.getKey(), (String) entry.getValue());
        }
        long j3 = c3538eD.g;
        String strA = I40.a(j2, j3);
        if (strA != null) {
            c7375uF.k("Range", strA);
        }
        String str = this.g;
        if (str != null) {
            c7375uF.k("User-Agent", str);
        }
        if (!c3538eD.c(1)) {
            c7375uF.k("Accept-Encoding", "identity");
        }
        int i = c3538eD.c;
        byte[] bArr = c3538eD.d;
        if (bArr != null) {
            c7030sR0H = C6518pl0.h(0, bArr.length, null, bArr);
        } else if (i == 2) {
            byte[] bArr2 = AbstractC0277Dh1.f;
            O90.f(bArr2, "<this>");
            c7030sR0H = C6518pl0.h(0, bArr2.length, null, bArr2);
        } else {
            c7030sR0H = null;
        }
        c7375uF.A(C3538eD.b(i), c7030sR0H);
        DN0 dn0B = this.e.b(c7375uF.o());
        try {
            C7817wZ0 c7817wZ0 = new C7817wZ0();
            FirebasePerfOkHttpClient.enqueue(dn0B, new C3866fw1(23, c7817wZ0));
            try {
                try {
                    HS0 hs0 = (HS0) c7817wZ0.get();
                    this.i = hs0;
                    IS0 is0 = hs0.g;
                    is0.getClass();
                    this.j = is0.m();
                    boolean zN = hs0.n();
                    long j4 = c3538eD.f;
                    int i2 = hs0.d;
                    if (zN) {
                        is0.p();
                        if (i2 == 200 && j4 != 0) {
                            j = j4;
                        }
                        if (j3 != -1) {
                            this.l = j3;
                        } else {
                            long jO = is0.o();
                            this.l = jO != -1 ? jO - j : -1L;
                        }
                        this.k = true;
                        h(c3538eD);
                        try {
                            p(j);
                            return this.l;
                        } catch (C6961s40 e) {
                            i();
                            throw e;
                        }
                    }
                    K20 k20 = hs0.f;
                    if (i2 == 416 && j4 == I40.b(k20.b("Content-Range"))) {
                        this.k = true;
                        h(c3538eD);
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.j;
                        inputStream.getClass();
                        AbstractC0050Ak.b(inputStream);
                    } catch (IOException unused2) {
                        int i3 = AbstractC0277Dh1.a;
                    }
                    TreeMap treeMapK = k20.k();
                    i();
                    throw new C7343u40(i2, i2 == 416 ? new C2091aD(2008) : null, treeMapK);
                } catch (InterruptedException unused3) {
                    dn0B.e();
                    throw new InterruptedIOException();
                }
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw C6961s40.b(1, e3);
        }
    }

    @Override // defpackage.ZC
    public final void close() {
        if (this.k) {
            this.k = false;
            e();
            i();
        }
    }

    public final void i() {
        HS0 hs0 = this.i;
        if (hs0 != null) {
            IS0 is0 = hs0.g;
            is0.getClass();
            is0.close();
            this.i = null;
        }
        this.j = null;
    }

    @Override // defpackage.AbstractC1750Wf, defpackage.ZC
    public final Map l() {
        HS0 hs0 = this.i;
        return hs0 == null ? Collections.emptyMap() : hs0.f.k();
    }

    @Override // defpackage.ZC
    public final Uri o() {
        HS0 hs0 = this.i;
        if (hs0 == null) {
            return null;
        }
        return Uri.parse(hs0.a.a.h);
    }

    public final void p(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096);
                InputStream inputStream = this.j;
                int i = AbstractC0277Dh1.a;
                int i2 = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i2 == -1) {
                    throw new C6961s40(2008);
                }
                j -= i2;
                a(i2);
            } catch (IOException e) {
                if (!(e instanceof C6961s40)) {
                    throw new C6961s40(2000);
                }
                throw ((C6961s40) e);
            }
        }
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
            long r0 = r6.l     // Catch: java.io.IOException -> L33
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.m     // Catch: java.io.IOException -> L33
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
            long r8 = r6.m     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.m = r8     // Catch: java.io.IOException -> L33
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6554px0.r(byte[], int, int):int");
    }
}
