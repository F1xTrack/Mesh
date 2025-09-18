package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eD */
/* loaded from: classes.dex */
public final class C3538eD {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        AbstractC6911rp0.a("media3.datasource");
    }

    public C3538eD(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        YN1.c(j + j2 >= 0);
        YN1.c(j2 >= 0);
        YN1.c(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
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

    public final C3348dD a() {
        C3348dD c3348dD = new C3348dD();
        c3348dD.a = this.a;
        c3348dD.b = this.b;
        c3348dD.c = this.c;
        c3348dD.d = this.d;
        c3348dD.e = this.e;
        c3348dD.f = this.f;
        c3348dD.g = this.g;
        c3348dD.h = this.h;
        c3348dD.i = this.i;
        return c3348dD;
    }

    public final boolean c(int i) {
        return (this.i & i) == i;
    }

    public final C3538eD d(long j) {
        long j2 = this.g;
        return e(j, j2 != -1 ? j2 - j : -1L);
    }

    public final C3538eD e(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        long j3 = this.f + j;
        return new C3538eD(this.a, this.b, this.c, this.d, this.e, j3, j2, this.h, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return AbstractC1705Vq.j(sb, this.i, "]");
    }
}
