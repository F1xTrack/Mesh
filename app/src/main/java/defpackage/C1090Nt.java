package defpackage;

import android.net.Uri;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: Nt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090Nt {
    public static final Pattern m = Pattern.compile(".*-.*");
    public final C22 a;
    public final InterfaceC5311jR b;
    public final long c;
    public final float d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public long i;
    public String j;
    public String k;
    public String l;

    public C1090Nt(C22 c22, InterfaceC5311jR interfaceC5311jR, long j, float f, String str, boolean z, boolean z2, boolean z3) {
        YN1.c(j >= 0);
        YN1.c(f == -3.4028235E38f || f > 0.0f);
        this.a = c22;
        this.b = interfaceC5311jR;
        this.c = j;
        this.d = f;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = -9223372036854775807L;
    }

    public static String b(InterfaceC5311jR interfaceC5311jR) {
        YN1.c(interfaceC5311jR != null);
        int iH = AbstractC1865Xr0.h(interfaceC5311jR.m().m);
        if (iH == -1) {
            iH = AbstractC1865Xr0.h(interfaceC5311jR.m().l);
        }
        if (iH == 1) {
            return "a";
        }
        if (iH == 2) {
            return "v";
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    public final C1168Ot a() {
        R70 r70;
        C0779Jt c0779Jt;
        boolean z;
        C22 c22 = this.a;
        C3513e41 c3513e41 = (C3513e41) ((QQ0) c22.d).a;
        C3866fw1 c3866fw1 = new C3866fw1(19);
        C1375Rk c1375Rk = (C1375Rk) c3513e41.b;
        C3513e41.t0(c3866fw1, "CMCD-Object", c1375Rk.a);
        C3513e41.t0(c3866fw1, "CMCD-Request", c1375Rk.b);
        C3513e41.t0(c3866fw1, "CMCD-Session", c1375Rk.c);
        C3513e41.t0(c3866fw1, "CMCD-Status", c1375Rk.d);
        Collection collectionEntrySet = ((C2223av) c3866fw1.b).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            r70 = KN.e;
        } else {
            C1873Xu c1873Xu = (C1873Xu) collectionEntrySet;
            VY vy = new VY(c1873Xu.b.size());
            Iterator it = c1873Xu.iterator();
            int size = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                P70 p70U = P70.u((Collection) entry.getValue());
                if (!p70U.isEmpty()) {
                    vy.Y(key, p70U);
                    size += p70U.size();
                }
            }
            r70 = new R70(vy.p(), size);
        }
        O90.e(r70, "build(...)");
        C5500kQ0 c5500kQ0 = r70.d;
        AbstractC5740lg1 it2 = c5500kQ0.keySet().iterator();
        while (it2.hasNext()) {
            for (String str : r70.c((String) it2.next())) {
                int i = AbstractC0277Dh1.a;
                YN1.f(m.matcher(str.split(ContainerUtils.KEY_VALUE_DELIMITER, -1)[0]).matches());
            }
        }
        InterfaceC5311jR interfaceC5311jR = this.b;
        int iG = AbstractC0277Dh1.g(interfaceC5311jR.m().i, 1000);
        C0779Jt c0779Jt2 = new C0779Jt();
        c0779Jt2.a = -2147483647;
        c0779Jt2.b = -2147483647;
        c0779Jt2.c = -9223372036854775807L;
        N70 n70 = P70.b;
        c0779Jt2.e = C3769fQ0.e;
        String str2 = this.j;
        boolean z2 = str2 != null && str2.equals("i");
        QQ0 qq0 = (QQ0) c22.d;
        if (!z2) {
            qq0.getClass();
            YN1.c(iG >= 0 || iG == -2147483647);
            c0779Jt2.a = iG;
            qq0.getClass();
            C1272Qb1 c1272Qb1D = interfaceC5311jR.d();
            int iMax = interfaceC5311jR.m().i;
            for (int i2 = 0; i2 < c1272Qb1D.a; i2++) {
                iMax = Math.max(iMax, c1272Qb1D.d[i2].i);
            }
            int iG2 = AbstractC0277Dh1.g(iMax, 1000);
            YN1.c(iG2 >= 0 || iG2 == -2147483647);
            c0779Jt2.b = iG2;
            qq0.getClass();
            long jD0 = AbstractC0277Dh1.d0(this.i);
            YN1.c(jD0 >= 0 || jD0 == -9223372036854775807L);
            c0779Jt2.c = jD0;
        }
        qq0.getClass();
        c0779Jt2.d = this.j;
        if (c5500kQ0.containsKey("CMCD-Object")) {
            c0779Jt2.e = P70.u(r70.c("CMCD-Object"));
        }
        C0857Kt c0857Kt = new C0857Kt();
        c0857Kt.a = -9223372036854775807L;
        c0857Kt.b = -2147483647L;
        c0857Kt.c = -9223372036854775807L;
        N70 n702 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        c0857Kt.g = c3769fQ0;
        String str3 = this.j;
        if (str3 == null || !str3.equals("i")) {
            c0779Jt = c0779Jt2;
            z = false;
        } else {
            c0779Jt = c0779Jt2;
            z = true;
        }
        long j = this.c;
        if (!z) {
            qq0.getClass();
            long jD02 = AbstractC0277Dh1.d0(j);
            YN1.c(jD02 >= 0 || jD02 == -9223372036854775807L);
            c0857Kt.a = ((jD02 + 50) / 100) * 100;
        }
        qq0.getClass();
        if (interfaceC5311jR.a() != -2147483647L) {
            long jA = (interfaceC5311jR.a() + 999) / 1000;
            YN1.c(jA >= 0 || jA == -2147483647L);
            c0857Kt.b = ((jA + 50) / 100) * 100;
        }
        qq0.getClass();
        float f = this.d;
        long jD03 = AbstractC0277Dh1.d0((long) (j / f));
        YN1.c(jD03 >= 0 || jD03 == -9223372036854775807L);
        c0857Kt.c = ((jD03 + 50) / 100) * 100;
        qq0.getClass();
        boolean z3 = this.g;
        c0857Kt.d = z3 || this.h;
        qq0.getClass();
        String str4 = this.k;
        c0857Kt.e = str4 == null ? null : Uri.encode(str4);
        qq0.getClass();
        c0857Kt.f = this.l;
        if (c5500kQ0.containsKey("CMCD-Request")) {
            c0857Kt.g = P70.u(r70.c("CMCD-Request"));
        }
        C0934Lt c0934Lt = new C0934Lt();
        c0934Lt.f = c3769fQ0;
        qq0.getClass();
        String str5 = (String) c22.c;
        YN1.c(str5 == null || str5.length() <= 64);
        c0934Lt.a = str5;
        qq0.getClass();
        String str6 = (String) c22.b;
        YN1.c(str6 == null || str6.length() <= 64);
        c0934Lt.b = str6;
        qq0.getClass();
        c0934Lt.c = this.e;
        qq0.getClass();
        c0934Lt.d = this.f ? "l" : "v";
        qq0.getClass();
        YN1.c(f > 0.0f || f == -3.4028235E38f);
        c0934Lt.e = f;
        if (c5500kQ0.containsKey("CMCD-Session")) {
            c0934Lt.f = P70.u(r70.c("CMCD-Session"));
        }
        C1012Mt c1012Mt = new C1012Mt();
        c1012Mt.a = -2147483647;
        c1012Mt.c = c3769fQ0;
        qq0.getClass();
        qq0.getClass();
        c1012Mt.a = -2147483647;
        qq0.getClass();
        c1012Mt.b = z3;
        if (c5500kQ0.containsKey("CMCD-Status")) {
            c1012Mt.c = P70.u(r70.c("CMCD-Status"));
        }
        C0779Jt c0779Jt3 = new C0779Jt();
        c0779Jt3.a = c0779Jt.a;
        c0779Jt3.b = c0779Jt.b;
        c0779Jt3.c = c0779Jt.c;
        c0779Jt3.d = (String) c0779Jt.d;
        c0779Jt3.e = (P70) c0779Jt.e;
        C0857Kt c0857Kt2 = new C0857Kt();
        c0857Kt2.a = c0857Kt.a;
        c0857Kt2.b = c0857Kt.b;
        c0857Kt2.c = c0857Kt.c;
        c0857Kt2.d = c0857Kt.d;
        c0857Kt2.e = c0857Kt.e;
        c0857Kt2.f = c0857Kt.f;
        c0857Kt2.g = c0857Kt.g;
        C0934Lt c0934Lt2 = new C0934Lt();
        c0934Lt2.a = c0934Lt.a;
        c0934Lt2.b = c0934Lt.b;
        c0934Lt2.c = c0934Lt.c;
        c0934Lt2.d = c0934Lt.d;
        c0934Lt2.e = c0934Lt.e;
        c0934Lt2.f = c0934Lt.f;
        C1012Mt c1012Mt2 = new C1012Mt();
        c1012Mt2.a = c1012Mt.a;
        c1012Mt2.b = c1012Mt.b;
        c1012Mt2.c = c1012Mt.c;
        return new C1168Ot(c0779Jt3, c0857Kt2, c0934Lt2, c1012Mt2, c22.a);
    }

    public final void c(long j) {
        YN1.c(j >= 0);
        this.i = j;
    }
}
