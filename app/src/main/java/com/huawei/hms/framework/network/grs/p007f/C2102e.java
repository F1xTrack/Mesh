package com.huawei.hms.framework.network.grs.p007f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p006e.C2095a;
import com.huawei.hms.framework.network.grs.p008g.C2104b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.huawei.hms.framework.network.grs.f.e */
/* loaded from: classes.dex */
public class C2102e {

    /* renamed from: a */
    private static final String f19043a = "e";

    /* renamed from: b */
    public static final Set<String> f19044b = Collections.unmodifiableSet(new a(16));

    /* renamed from: com.huawei.hms.framework.network.grs.f.e$a */
    public class a extends HashSet<String> {
        public a(int i) {
            super(i);
            add("ser_country");
            add("reg_country");
            add("issue_country");
            add("geo_ip");
        }
    }

    /* renamed from: a */
    private static String m11775a(Context context, C2095a c2095a, String str, GrsBaseInfo grsBaseInfo, boolean z) throws NumberFormatException {
        String str2;
        StringBuilder sb;
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        for (String str3 : str.split(">")) {
            if (f19044b.contains(str3.trim())) {
                if (!"ser_country".equals(str3.trim()) || TextUtils.isEmpty(serCountry) || GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(serCountry)) {
                    if ("reg_country".equals(str3.trim()) && !TextUtils.isEmpty(regCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(regCountry)) {
                        Logger.m11685i(f19043a, "current route_by is regCountry and routerCountry is: " + regCountry);
                        return regCountry;
                    }
                    if ("issue_country".equals(str3.trim()) && !TextUtils.isEmpty(issueCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(issueCountry)) {
                        Logger.m11685i(f19043a, "current route_by is issueCountry and routerCountry is: " + issueCountry);
                        return issueCountry;
                    }
                    if ("geo_ip".equals(str3.trim())) {
                        serCountry = new C2104b(context, c2095a, grsBaseInfo).m11784a(z);
                        str2 = f19043a;
                        sb = new StringBuilder("current route_by is geo_ip and routerCountry is: ");
                    }
                } else {
                    str2 = f19043a;
                    sb = new StringBuilder("current route_by is serCountry and routerCountry is: ");
                }
                sb.append(serCountry);
                Logger.m11685i(str2, sb.toString());
                return serCountry;
            }
        }
        return "";
    }

    /* renamed from: b */
    public static String m11776b(Context context, C2095a c2095a, String str, GrsBaseInfo grsBaseInfo, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Logger.m11689w(f19043a, "routeBy must be not empty string or null.");
            return null;
        }
        if (!"no_route".equals(str) && !"unconditional".equals(str)) {
            return m11775a(context, c2095a, str, grsBaseInfo, z);
        }
        Logger.m11687v(f19043a, "routeBy equals NO_ROUTE_POLICY");
        return "no_route_country";
    }
}
