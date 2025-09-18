package com.huawei.hms.framework.network.grs.p008g;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.C2091a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p006e.C2095a;
import com.huawei.hms.framework.network.grs.p006e.C2097c;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2114c;
import com.huawei.hms.framework.network.grs.p011h.C2120e;
import org.json.JSONException;

/* renamed from: com.huawei.hms.framework.network.grs.g.b */
/* loaded from: classes.dex */
public class C2104b {

    /* renamed from: a */
    private final Context f19053a;

    /* renamed from: b */
    private final GrsBaseInfo f19054b;

    /* renamed from: c */
    private final C2095a f19055c;

    public C2104b(Context context, C2095a c2095a, GrsBaseInfo grsBaseInfo) {
        this.f19053a = context;
        this.f19054b = grsBaseInfo;
        this.f19055c = c2095a;
    }

    /* renamed from: a */
    public String m11784a(boolean z) throws NumberFormatException {
        String strM11840a;
        String str = C2091a.m11696a(this.f19055c.m11733a().m11743a("geoipCountryCode", ""), "geoip.countrycode").get("ROOT");
        Logger.m11685i("GeoipCountry", "geoIpCountry is: " + str);
        String strM11743a = this.f19055c.m11733a().m11743a("geoipCountryCodetime", "0");
        long j = 0;
        if (!TextUtils.isEmpty(strM11743a) && strM11743a.matches("\\d+")) {
            try {
                j = Long.parseLong(strM11743a);
            } catch (NumberFormatException e) {
                Logger.m11690w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e);
            }
        }
        if (TextUtils.isEmpty(str) || C2120e.m11870a(Long.valueOf(j))) {
            C2114c c2114c = new C2114c(this.f19054b, this.f19053a);
            c2114c.m11848a("geoip.countrycode");
            C2097c c2097cM11739c = this.f19055c.m11739c();
            if (c2097cM11739c != null) {
                try {
                    strM11840a = C2110h.m11840a(c2097cM11739c.m11743a("services", ""), c2114c.m11850c());
                } catch (JSONException e2) {
                    Logger.m11691w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e2.getMessage()));
                    strM11840a = null;
                }
                if (!TextUtils.isEmpty(strM11840a)) {
                    c2097cM11739c.m11747b("services", strM11840a);
                }
            }
            if (z) {
                C2106d c2106dM11836a = this.f19055c.m11737b().m11836a(c2114c, "geoip.countrycode", c2097cM11739c, -1);
                if (c2106dM11836a != null) {
                    str = C2091a.m11696a(c2106dM11836a.m11823j(), "geoip.countrycode").get("ROOT");
                }
                Logger.m11685i("GeoipCountry", "sync request to query geoip.countrycode is:" + str);
            } else {
                Logger.m11685i("GeoipCountry", "async request to query geoip.countrycode");
                this.f19055c.m11737b().m11838a(c2114c, null, "geoip.countrycode", c2097cM11739c, -1);
            }
        }
        return str;
    }
}
