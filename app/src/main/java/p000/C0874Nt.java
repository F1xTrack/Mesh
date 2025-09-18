package p000;

import android.net.Uri;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: Nt */
/* loaded from: classes.dex */
public final class C0874Nt {

    /* renamed from: m */
    public static final Pattern f8102m = Pattern.compile(".*-.*");

    /* renamed from: a */
    public final C22 f8103a;

    /* renamed from: b */
    public final InterfaceC6237jR f8104b;

    /* renamed from: c */
    public final long f8105c;

    /* renamed from: d */
    public final float f8106d;

    /* renamed from: e */
    public final String f8107e;

    /* renamed from: f */
    public final boolean f8108f;

    /* renamed from: g */
    public final boolean f8109g;

    /* renamed from: h */
    public final boolean f8110h;

    /* renamed from: i */
    public long f8111i;

    /* renamed from: j */
    public String f8112j;

    /* renamed from: k */
    public String f8113k;

    /* renamed from: l */
    public String f8114l;

    public C0874Nt(C22 c22, InterfaceC6237jR interfaceC6237jR, long j, float f, String str, boolean z, boolean z2, boolean z3) {
        YN1.m9278c(j >= 0);
        YN1.m9278c(f == -3.4028235E38f || f > 0.0f);
        this.f8103a = c22;
        this.f8104b = interfaceC6237jR;
        this.f8105c = j;
        this.f8106d = f;
        this.f8107e = str;
        this.f8108f = z;
        this.f8109g = z2;
        this.f8110h = z3;
        this.f8111i = -9223372036854775807L;
    }

    /* renamed from: b */
    public static String m5895b(InterfaceC6237jR interfaceC6237jR) {
        YN1.m9278c(interfaceC6237jR != null);
        int iM9165h = AbstractC8544Xr0.m9165h(interfaceC6237jR.mo2732m().f40974m);
        if (iM9165h == -1) {
            iM9165h = AbstractC8544Xr0.m9165h(interfaceC6237jR.mo2732m().f40973l);
        }
        if (iM9165h == 1) {
            return "a";
        }
        if (iM9165h == 2) {
            return "v";
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* renamed from: a */
    public final C0937Ot m5896a() {
        R70 r70;
        C0623Jt c0623Jt;
        boolean z;
        C22 c22 = this.f8103a;
        C9196e41 c9196e41 = (C9196e41) ((QQ0) c22.f1152d).f9619a;
        C9432fw1 c9432fw1 = new C9432fw1(19);
        C1116Rk c1116Rk = (C1116Rk) c9196e41.f26532b;
        C9196e41.m17836t0(c9432fw1, "CMCD-Object", c1116Rk.f10403a);
        C9196e41.m17836t0(c9432fw1, "CMCD-Request", c1116Rk.f10404b);
        C9196e41.m17836t0(c9432fw1, "CMCD-Session", c1116Rk.f10405c);
        C9196e41.m17836t0(c9432fw1, "CMCD-Status", c1116Rk.f10406d);
        Collection collectionEntrySet = ((C1752av) c9432fw1.f27505b).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            r70 = C0654KN.f6036e;
        } else {
            C1504Xu c1504Xu = (C1504Xu) collectionEntrySet;
            C1356VY c1356vy = new C1356VY(c1504Xu.f14042b.size());
            Iterator it = c1504Xu.iterator();
            int size = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                P70 p70M6234u = P70.m6234u((Collection) entry.getValue());
                if (!p70M6234u.isEmpty()) {
                    c1356vy.m8486Y(key, p70M6234u);
                    size += p70M6234u.size();
                }
            }
            r70 = new R70(c1356vy.m8503p(), size);
        }
        O90.m5967e(r70, "build(...)");
        C10007kQ0 c10007kQ0 = r70.f10018d;
        AbstractC10168lg1 it2 = c10007kQ0.keySet().iterator();
        while (it2.hasNext()) {
            for (String str : r70.mo5490c((String) it2.next())) {
                int i = AbstractC7485Dh1.f2166a;
                YN1.m9281f(f8102m.matcher(str.split(ContainerUtils.KEY_VALUE_DELIMITER, -1)[0]).matches());
            }
        }
        InterfaceC6237jR interfaceC6237jR = this.f8104b;
        int iM1822g = AbstractC7485Dh1.m1822g(interfaceC6237jR.mo2732m().f40970i, 1000);
        C0623Jt c0623Jt2 = new C0623Jt();
        c0623Jt2.f5769a = -2147483647;
        c0623Jt2.f5770b = -2147483647;
        c0623Jt2.f5771c = -9223372036854775807L;
        N70 n70 = P70.f8867b;
        c0623Jt2.f5773e = C9367fQ0.f27184e;
        String str2 = this.f8112j;
        boolean z2 = str2 != null && str2.equals("i");
        QQ0 qq0 = (QQ0) c22.f1152d;
        if (!z2) {
            qq0.getClass();
            YN1.m9278c(iM1822g >= 0 || iM1822g == -2147483647);
            c0623Jt2.f5769a = iM1822g;
            qq0.getClass();
            C8149Qb1 c8149Qb1Mo2724d = interfaceC6237jR.mo2724d();
            int iMax = interfaceC6237jR.mo2732m().f40970i;
            for (int i2 = 0; i2 < c8149Qb1Mo2724d.f9687a; i2++) {
                iMax = Math.max(iMax, c8149Qb1Mo2724d.f9690d[i2].f40970i);
            }
            int iM1822g2 = AbstractC7485Dh1.m1822g(iMax, 1000);
            YN1.m9278c(iM1822g2 >= 0 || iM1822g2 == -2147483647);
            c0623Jt2.f5770b = iM1822g2;
            qq0.getClass();
            long jM1819d0 = AbstractC7485Dh1.m1819d0(this.f8111i);
            YN1.m9278c(jM1819d0 >= 0 || jM1819d0 == -9223372036854775807L);
            c0623Jt2.f5771c = jM1819d0;
        }
        qq0.getClass();
        c0623Jt2.f5772d = this.f8112j;
        if (c10007kQ0.containsKey("CMCD-Object")) {
            c0623Jt2.f5773e = P70.m6234u(r70.mo5490c("CMCD-Object"));
        }
        C0686Kt c0686Kt = new C0686Kt();
        c0686Kt.f6375a = -9223372036854775807L;
        c0686Kt.f6376b = -2147483647L;
        c0686Kt.f6377c = -9223372036854775807L;
        N70 n702 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        c0686Kt.f6381g = c9367fQ0;
        String str3 = this.f8112j;
        if (str3 == null || !str3.equals("i")) {
            c0623Jt = c0623Jt2;
            z = false;
        } else {
            c0623Jt = c0623Jt2;
            z = true;
        }
        long j = this.f8105c;
        if (!z) {
            qq0.getClass();
            long jM1819d02 = AbstractC7485Dh1.m1819d0(j);
            YN1.m9278c(jM1819d02 >= 0 || jM1819d02 == -9223372036854775807L);
            c0686Kt.f6375a = ((jM1819d02 + 50) / 100) * 100;
        }
        qq0.getClass();
        if (interfaceC6237jR.mo2722a() != -2147483647L) {
            long jMo2722a = (interfaceC6237jR.mo2722a() + 999) / 1000;
            YN1.m9278c(jMo2722a >= 0 || jMo2722a == -2147483647L);
            c0686Kt.f6376b = ((jMo2722a + 50) / 100) * 100;
        }
        qq0.getClass();
        float f = this.f8106d;
        long jM1819d03 = AbstractC7485Dh1.m1819d0((long) (j / f));
        YN1.m9278c(jM1819d03 >= 0 || jM1819d03 == -9223372036854775807L);
        c0686Kt.f6377c = ((jM1819d03 + 50) / 100) * 100;
        qq0.getClass();
        boolean z3 = this.f8109g;
        c0686Kt.f6378d = z3 || this.f8110h;
        qq0.getClass();
        String str4 = this.f8113k;
        c0686Kt.f6379e = str4 == null ? null : Uri.encode(str4);
        qq0.getClass();
        c0686Kt.f6380f = this.f8114l;
        if (c10007kQ0.containsKey("CMCD-Request")) {
            c0686Kt.f6381g = P70.m6234u(r70.mo5490c("CMCD-Request"));
        }
        C0748Lt c0748Lt = new C0748Lt();
        c0748Lt.f6921f = c9367fQ0;
        qq0.getClass();
        String str5 = (String) c22.f1151c;
        YN1.m9278c(str5 == null || str5.length() <= 64);
        c0748Lt.f6916a = str5;
        qq0.getClass();
        String str6 = (String) c22.f1150b;
        YN1.m9278c(str6 == null || str6.length() <= 64);
        c0748Lt.f6917b = str6;
        qq0.getClass();
        c0748Lt.f6918c = this.f8107e;
        qq0.getClass();
        c0748Lt.f6919d = this.f8108f ? "l" : "v";
        qq0.getClass();
        YN1.m9278c(f > 0.0f || f == -3.4028235E38f);
        c0748Lt.f6920e = f;
        if (c10007kQ0.containsKey("CMCD-Session")) {
            c0748Lt.f6921f = P70.m6234u(r70.mo5490c("CMCD-Session"));
        }
        C0811Mt c0811Mt = new C0811Mt();
        c0811Mt.f7378a = -2147483647;
        c0811Mt.f7380c = c9367fQ0;
        qq0.getClass();
        qq0.getClass();
        c0811Mt.f7378a = -2147483647;
        qq0.getClass();
        c0811Mt.f7379b = z3;
        if (c10007kQ0.containsKey("CMCD-Status")) {
            c0811Mt.f7380c = P70.m6234u(r70.mo5490c("CMCD-Status"));
        }
        C0623Jt c0623Jt3 = new C0623Jt();
        c0623Jt3.f5769a = c0623Jt.f5769a;
        c0623Jt3.f5770b = c0623Jt.f5770b;
        c0623Jt3.f5771c = c0623Jt.f5771c;
        c0623Jt3.f5772d = (String) c0623Jt.f5772d;
        c0623Jt3.f5773e = (P70) c0623Jt.f5773e;
        C0686Kt c0686Kt2 = new C0686Kt();
        c0686Kt2.f6375a = c0686Kt.f6375a;
        c0686Kt2.f6376b = c0686Kt.f6376b;
        c0686Kt2.f6377c = c0686Kt.f6377c;
        c0686Kt2.f6378d = c0686Kt.f6378d;
        c0686Kt2.f6379e = c0686Kt.f6379e;
        c0686Kt2.f6380f = c0686Kt.f6380f;
        c0686Kt2.f6381g = c0686Kt.f6381g;
        C0748Lt c0748Lt2 = new C0748Lt();
        c0748Lt2.f6916a = c0748Lt.f6916a;
        c0748Lt2.f6917b = c0748Lt.f6917b;
        c0748Lt2.f6918c = c0748Lt.f6918c;
        c0748Lt2.f6919d = c0748Lt.f6919d;
        c0748Lt2.f6920e = c0748Lt.f6920e;
        c0748Lt2.f6921f = c0748Lt.f6921f;
        C0811Mt c0811Mt2 = new C0811Mt();
        c0811Mt2.f7378a = c0811Mt.f7378a;
        c0811Mt2.f7379b = c0811Mt.f7379b;
        c0811Mt2.f7380c = c0811Mt.f7380c;
        return new C0937Ot(c0623Jt3, c0686Kt2, c0748Lt2, c0811Mt2, c22.f1149a);
    }

    /* renamed from: c */
    public final void m5897c(long j) {
        YN1.m9278c(j >= 0);
        this.f8111i = j;
    }
}
