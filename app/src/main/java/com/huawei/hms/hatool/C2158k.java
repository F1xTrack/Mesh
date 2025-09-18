package com.huawei.hms.hatool;

import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import p000.CB1;

/* renamed from: com.huawei.hms.hatool.k */
/* loaded from: classes.dex */
public class C2158k extends C2185u0 {

    /* renamed from: com.huawei.hms.hatool.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19225a;

        static {
            int[] iArr = new int[EnumC2138d0.values().length];
            f19225a = iArr;
            try {
                iArr[EnumC2138d0.SN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19225a[EnumC2138d0.IMEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19225a[EnumC2138d0.UDID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static C2144f0 m12075a(String str, String str2, String str3, String str4) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        C2144f0 c2144f0M12259a = C2185u0.m12259a(str, str2, str3, str4);
        String strM12057a = C2155j.m12055a().m12057a(AbstractC2130a1.m11907c(str2, str3));
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM1003c = CB1.m1003c(AbstractC2177q0.m12191f() + strM12057a + jCurrentTimeMillis);
        c2144f0M12259a.m12085f(String.valueOf(jCurrentTimeMillis));
        c2144f0M12259a.m11990g(strM1003c);
        return c2144f0M12259a;
    }

    /* renamed from: b */
    public static Map<String, String> m12079b(String str, String str2, String str3) {
        Map<String, String> mapM12263c = C2185u0.m12263c(str, str3);
        Map<String, String> mapM11913i = AbstractC2130a1.m11913i(str, str2);
        if (mapM11913i == null) {
            return mapM12263c;
        }
        mapM12263c.putAll(mapM11913i);
        return mapM12263c;
    }

    /* renamed from: a */
    public static C2151h1 m12076a(List<C2133b1> list, String str, String str2, String str3, String str4) {
        C2186v.m12271c("hmsSdk", "generate UploadData");
        C2151h1 c2151h1M12262b = C2185u0.m12262b(str, str2);
        if (c2151h1M12262b == null) {
            return null;
        }
        c2151h1M12262b.m12043a(m12075a(C2166m1.m12122d().m12123a(), str, str2, str3));
        c2151h1M12262b.m12044a(m12077a(str, str2));
        c2151h1M12262b.m12045a(m12078a(str2, str, str4));
        c2151h1M12262b.m12046a(AbstractC2130a1.m11911g(str, str2));
        c2151h1M12262b.m12047a(list);
        return c2151h1M12262b;
    }

    /* renamed from: a */
    public static C2161l m12077a(String str, String str2) {
        C2161l c2161lM12260a = C2185u0.m12260a(str, str2);
        C2152i c2152iM12060c = C2155j.m12055a().m12060c(str, str2);
        c2161lM12260a.m12098g(C2155j.m12055a().m12057a(AbstractC2130a1.m11907c(str, str2)));
        c2161lM12260a.m12097f(AbstractC2130a1.m11919o(str, str2));
        c2161lM12260a.m12094c(C2155j.m12055a().m12063f(str, str2));
        int i = a.f19225a[c2152iM12060c.m12048a().ordinal()];
        if (i == 1) {
            c2161lM12260a.m12095d(c2152iM12060c.m12049b());
        } else if (i == 2) {
            c2161lM12260a.m12093b(c2152iM12060c.m12049b());
        } else if (i == 3) {
            c2161lM12260a.m12096e(c2152iM12060c.m12049b());
        }
        return c2161lM12260a;
    }

    /* renamed from: a */
    public static C2193y0 m12078a(String str, String str2, String str3) {
        C2193y0 c2193y0M12261a = C2185u0.m12261a(str, str2, str3);
        Pair<String, String> pairM12062e = C2155j.m12055a().m12062e(str2, str);
        c2193y0M12261a.m12304f((String) pairM12062e.first);
        c2193y0M12261a.m12305g((String) pairM12062e.second);
        c2193y0M12261a.m12306h(AbstractC2170o.m12148b());
        c2193y0M12261a.m12255d(C2155j.m12055a().m12061d(str2, str));
        return c2193y0M12261a;
    }
}
