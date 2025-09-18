package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: qx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6744qx {
    public static final C6744qx e;
    public static final C6744qx f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        C3852fs c3852fs = C3852fs.r;
        C3852fs c3852fs2 = C3852fs.s;
        C3852fs c3852fs3 = C3852fs.t;
        C3852fs c3852fs4 = C3852fs.l;
        C3852fs c3852fs5 = C3852fs.n;
        C3852fs c3852fs6 = C3852fs.m;
        C3852fs c3852fs7 = C3852fs.o;
        C3852fs c3852fs8 = C3852fs.q;
        C3852fs c3852fs9 = C3852fs.p;
        C3852fs[] c3852fsArr = {c3852fs, c3852fs2, c3852fs3, c3852fs4, c3852fs5, c3852fs6, c3852fs7, c3852fs8, c3852fs9, C3852fs.j, C3852fs.k, C3852fs.h, C3852fs.i, C3852fs.f, C3852fs.g, C3852fs.e};
        C6553px c6553px = new C6553px();
        c6553px.b((C3852fs[]) Arrays.copyOf(new C3852fs[]{c3852fs, c3852fs2, c3852fs3, c3852fs4, c3852fs5, c3852fs6, c3852fs7, c3852fs8, c3852fs9}, 9));
        EnumC1113Oa1 enumC1113Oa1 = EnumC1113Oa1.TLS_1_3;
        EnumC1113Oa1 enumC1113Oa12 = EnumC1113Oa1.TLS_1_2;
        c6553px.e(enumC1113Oa1, enumC1113Oa12);
        if (!c6553px.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6553px.b = true;
        c6553px.a();
        C6553px c6553px2 = new C6553px();
        c6553px2.b((C3852fs[]) Arrays.copyOf(c3852fsArr, 16));
        c6553px2.e(enumC1113Oa1, enumC1113Oa12);
        if (!c6553px2.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6553px2.b = true;
        e = c6553px2.a();
        C6553px c6553px3 = new C6553px();
        c6553px3.b((C3852fs[]) Arrays.copyOf(c3852fsArr, 16));
        c6553px3.e(enumC1113Oa1, enumC1113Oa12, EnumC1113Oa1.TLS_1_1, EnumC1113Oa1.TLS_1_0);
        if (!c6553px3.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6553px3.b = true;
        c6553px3.a();
        f = new C6744qx(false, false, null, null);
    }

    public C6744qx(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C3852fs.b.s(str));
        }
        return AbstractC8069xu.b0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !AbstractC0199Ch1.k(strArr, sSLSocket.getEnabledProtocols(), C8450zu0.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || AbstractC0199Ch1.k(strArr2, sSLSocket.getEnabledCipherSuites(), C3852fs.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(IY1.b(str));
        }
        return AbstractC8069xu.b0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6744qx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6744qx c6744qx = (C6744qx) obj;
        boolean z = c6744qx.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, c6744qx.c) && Arrays.equals(this.d, c6744qx.d) && this.b == c6744qx.b);
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return F91.w(sb, this.b, ')');
    }
}
