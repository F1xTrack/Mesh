package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eD */
/* loaded from: classes.dex */
public final class C3976eD {

    /* renamed from: a */
    public final Uri f26595a;

    /* renamed from: b */
    public final long f26596b;

    /* renamed from: c */
    public final int f26597c;

    /* renamed from: d */
    public final byte[] f26598d;

    /* renamed from: e */
    public final Map f26599e;

    /* renamed from: f */
    public final long f26600f;

    /* renamed from: g */
    public final long f26601g;

    /* renamed from: h */
    public final String f26602h;

    /* renamed from: i */
    public final int f26603i;

    static {
        AbstractC10953rp0.m24489a("media3.datasource");
    }

    public C3976eD(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        YN1.m9278c(j + j2 >= 0);
        YN1.m9278c(j2 >= 0);
        YN1.m9278c(j3 > 0 || j3 == -1);
        uri.getClass();
        this.f26595a = uri;
        this.f26596b = j;
        this.f26597c = i;
        this.f26598d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f26599e = Collections.unmodifiableMap(new HashMap(map));
        this.f26600f = j2;
        this.f26601g = j3;
        this.f26602h = str;
        this.f26603i = i2;
    }

    /* renamed from: b */
    public static String m17878b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final C3914dD m17879a() {
        C3914dD c3914dD = new C3914dD();
        c3914dD.f25870a = this.f26595a;
        c3914dD.f25871b = this.f26596b;
        c3914dD.f25872c = this.f26597c;
        c3914dD.f25873d = this.f26598d;
        c3914dD.f25874e = this.f26599e;
        c3914dD.f25875f = this.f26600f;
        c3914dD.f25876g = this.f26601g;
        c3914dD.f25877h = this.f26602h;
        c3914dD.f25878i = this.f26603i;
        return c3914dD;
    }

    /* renamed from: c */
    public final boolean m17880c(int i) {
        return (this.f26603i & i) == i;
    }

    /* renamed from: d */
    public final C3976eD m17881d(long j) {
        long j2 = this.f26601g;
        return m17882e(j, j2 != -1 ? j2 - j : -1L);
    }

    /* renamed from: e */
    public final C3976eD m17882e(long j, long j2) {
        if (j == 0 && this.f26601g == j2) {
            return this;
        }
        long j3 = this.f26600f + j;
        return new C3976eD(this.f26595a, this.f26596b, this.f26597c, this.f26598d, this.f26599e, j3, j2, this.f26602h, this.f26603i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(m17878b(this.f26597c));
        sb.append(" ");
        sb.append(this.f26595a);
        sb.append(", ");
        sb.append(this.f26600f);
        sb.append(", ");
        sb.append(this.f26601g);
        sb.append(", ");
        sb.append(this.f26602h);
        sb.append(", ");
        return AbstractC1374Vq.m8591j(sb, this.f26603i, "]");
    }
}
