package com.huawei.hms.hatool;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: com.huawei.hms.hatool.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC2153i0 {
    /* renamed from: a */
    public static String m12050a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC2194z.m12307a(str, str2))) {
            return AbstractC2194z.m12307a(str, str2);
        }
        C2186v.m12271c("hmsSdk", "getAndroidId(): to getConfigByType()");
        return m12052c(context, str, str2);
    }

    /* renamed from: b */
    public static String m12051b(Context context, String str, String str2) {
        if (!str2.equals("oper") && !str2.equals("maint") && !str2.equals("diffprivacy") && !str2.equals("preins")) {
            C2186v.m12276f("hmsSdk", "getChannel(): Invalid type: ".concat(str2));
            return "";
        }
        return m12053d(context, str, str2);
    }

    /* renamed from: c */
    private static String m12052c(Context context, String str, String str2) {
        if (!AbstractC2194z.m12308b(str, str2)) {
            return "";
        }
        if (TextUtils.isEmpty(AbstractC2177q0.m12187d())) {
            C2180s.m12212c().m12217b().m12005b(AbstractC2170o.m12145a(context));
        }
        return AbstractC2177q0.m12187d();
    }

    /* renamed from: d */
    private static String m12053d(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        if (!TextUtils.isEmpty(AbstractC2130a1.m11908d(str, str2))) {
            return AbstractC2130a1.m11908d(str, str2);
        }
        C2148g1 c2148g1M12217b = C2180s.m12212c().m12217b();
        if (TextUtils.isEmpty(c2148g1M12217b.m12016h())) {
            String strM12149b = AbstractC2170o.m12149b(context);
            if (!C2142e1.m11984a("channel", strM12149b, 256)) {
                strM12149b = "";
            }
            c2148g1M12217b.m12013f(strM12149b);
        }
        return c2148g1M12217b.m12016h();
    }
}
