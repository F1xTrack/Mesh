package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: qx */
/* loaded from: classes2.dex */
public final class C6712qx {

    /* renamed from: e */
    public static final C6712qx f41258e;

    /* renamed from: f */
    public static final C6712qx f41259f;

    /* renamed from: a */
    public final boolean f41260a;

    /* renamed from: b */
    public final boolean f41261b;

    /* renamed from: c */
    public final String[] f41262c;

    /* renamed from: d */
    public final String[] f41263d;

    static {
        C4080fs c4080fs = C4080fs.f27436r;
        C4080fs c4080fs2 = C4080fs.f27437s;
        C4080fs c4080fs3 = C4080fs.f27438t;
        C4080fs c4080fs4 = C4080fs.f27430l;
        C4080fs c4080fs5 = C4080fs.f27432n;
        C4080fs c4080fs6 = C4080fs.f27431m;
        C4080fs c4080fs7 = C4080fs.f27433o;
        C4080fs c4080fs8 = C4080fs.f27435q;
        C4080fs c4080fs9 = C4080fs.f27434p;
        C4080fs[] c4080fsArr = {c4080fs, c4080fs2, c4080fs3, c4080fs4, c4080fs5, c4080fs6, c4080fs7, c4080fs8, c4080fs9, C4080fs.f27428j, C4080fs.f27429k, C4080fs.f27426h, C4080fs.f27427i, C4080fs.f27424f, C4080fs.f27425g, C4080fs.f27423e};
        C6649px c6649px = new C6649px();
        c6649px.m23891b((C4080fs[]) Arrays.copyOf(new C4080fs[]{c4080fs, c4080fs2, c4080fs3, c4080fs4, c4080fs5, c4080fs6, c4080fs7, c4080fs8, c4080fs9}, 9));
        EnumC8043Oa1 enumC8043Oa1 = EnumC8043Oa1.TLS_1_3;
        EnumC8043Oa1 enumC8043Oa12 = EnumC8043Oa1.TLS_1_2;
        c6649px.m23894e(enumC8043Oa1, enumC8043Oa12);
        if (!c6649px.f40445a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6649px.f40446b = true;
        c6649px.m23890a();
        C6649px c6649px2 = new C6649px();
        c6649px2.m23891b((C4080fs[]) Arrays.copyOf(c4080fsArr, 16));
        c6649px2.m23894e(enumC8043Oa1, enumC8043Oa12);
        if (!c6649px2.f40445a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6649px2.f40446b = true;
        f41258e = c6649px2.m23890a();
        C6649px c6649px3 = new C6649px();
        c6649px3.m23891b((C4080fs[]) Arrays.copyOf(c4080fsArr, 16));
        c6649px3.m23894e(enumC8043Oa1, enumC8043Oa12, EnumC8043Oa1.TLS_1_1, EnumC8043Oa1.TLS_1_0);
        if (!c6649px3.f40445a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6649px3.f40446b = true;
        c6649px3.m23890a();
        f41259f = new C6712qx(false, false, null, null);
    }

    public C6712qx(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f41260a = z;
        this.f41261b = z2;
        this.f41262c = strArr;
        this.f41263d = strArr2;
    }

    /* renamed from: a */
    public final List m24139a() {
        String[] strArr = this.f41262c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C4080fs.f27420b.m1946s(str));
        }
        return AbstractC7167xu.m25982b0(arrayList);
    }

    /* renamed from: b */
    public final boolean m24140b(SSLSocket sSLSocket) {
        if (!this.f41260a) {
            return false;
        }
        String[] strArr = this.f41263d;
        if (strArr != null && !AbstractC7433Ch1.m1282k(strArr, sSLSocket.getEnabledProtocols(), C11983zu0.f47088b)) {
            return false;
        }
        String[] strArr2 = this.f41262c;
        return strArr2 == null || AbstractC7433Ch1.m1282k(strArr2, sSLSocket.getEnabledCipherSuites(), C4080fs.f27421c);
    }

    /* renamed from: c */
    public final List m24141c() {
        String[] strArr = this.f41263d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(IY1.m3933b(str));
        }
        return AbstractC7167xu.m25982b0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6712qx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6712qx c6712qx = (C6712qx) obj;
        boolean z = c6712qx.f41260a;
        boolean z2 = this.f41260a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f41262c, c6712qx.f41262c) && Arrays.equals(this.f41263d, c6712qx.f41263d) && this.f41261b == c6712qx.f41261b);
    }

    public final int hashCode() {
        if (!this.f41260a) {
            return 17;
        }
        String[] strArr = this.f41262c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f41263d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f41261b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f41260a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m24139a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m24141c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return F91.m2540w(sb, this.f41261b, ')');
    }
}
