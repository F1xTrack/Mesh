package com.huawei.hms.framework.network.grs.p006e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.C2091a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p008g.C2106d;
import com.huawei.hms.framework.network.grs.p008g.C2109g;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2114c;
import com.huawei.hms.framework.network.grs.p011h.C2120e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC7222ym;

/* renamed from: com.huawei.hms.framework.network.grs.e.a */
/* loaded from: classes.dex */
public class C2095a {

    /* renamed from: e */
    private static final String f19025e = "a";

    /* renamed from: f */
    private static final Map<String, Map<String, Map<String, String>>> f19026f = new ConcurrentHashMap(16);

    /* renamed from: a */
    private final Map<String, Long> f19027a = new ConcurrentHashMap(16);

    /* renamed from: b */
    private final C2097c f19028b;

    /* renamed from: c */
    private final C2097c f19029c;

    /* renamed from: d */
    private final C2109g f19030d;

    public C2095a(C2097c c2097c, C2097c c2097c2, C2109g c2109g) {
        this.f19029c = c2097c2;
        this.f19028b = c2097c;
        this.f19030d = c2109g;
        c2109g.m11837a(this);
    }

    /* renamed from: a */
    public C2097c m11733a() {
        return this.f19028b;
    }

    /* renamed from: b */
    public C2109g m11737b() {
        return this.f19030d;
    }

    /* renamed from: c */
    public C2097c m11739c() {
        return this.f19029c;
    }

    /* renamed from: a */
    public Map<String, String> m11734a(GrsBaseInfo grsBaseInfo, String str, C2096b c2096b, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map<String, Map<String, Map<String, String>>> map = f19026f;
        Map<String, Map<String, String>> map2 = map.get(grsParasKey);
        if (map2 != null && !map2.isEmpty()) {
            m11731a(grsBaseInfo, c2096b, context, str);
            return map2.get(str);
        }
        Logger.m11685i(f19025e, "Cache size is: " + map.size());
        return new HashMap();
    }

    /* renamed from: b */
    public void m11738b(GrsBaseInfo grsBaseInfo, Context context) throws NumberFormatException {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String strM11743a = this.f19028b.m11743a(grsParasKey, "");
        String strM11743a2 = this.f19028b.m11743a(grsParasKey + CrashHianalyticsData.TIME, "0");
        long j = 0;
        if (!TextUtils.isEmpty(strM11743a2) && strM11743a2.matches("\\d+")) {
            try {
                j = Long.parseLong(strM11743a2);
            } catch (NumberFormatException e) {
                Logger.m11690w(f19025e, "convert urlParamKey from String to Long catch NumberFormatException.", e);
            }
        }
        Map<String, Map<String, Map<String, String>>> map = f19026f;
        map.put(grsParasKey, C2091a.m11694a(strM11743a));
        Logger.m11685i(f19025e, "Cache size is: " + map.size());
        this.f19027a.put(grsParasKey, Long.valueOf(j));
        m11732a(grsBaseInfo, grsParasKey, context);
    }

    /* renamed from: a */
    public void m11735a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f19028b.m11747b(grsParasKey + CrashHianalyticsData.TIME, "0");
        this.f19027a.remove(grsParasKey + CrashHianalyticsData.TIME);
        Map<String, Map<String, Map<String, String>>> map = f19026f;
        map.remove(grsParasKey);
        Logger.m11685i(f19025e, "Cache size is: " + map.size());
        this.f19030d.m11839a(grsParasKey);
    }

    /* renamed from: a */
    private void m11731a(GrsBaseInfo grsBaseInfo, C2096b c2096b, Context context, String str) {
        Long l = this.f19027a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (C2120e.m11870a(l)) {
            c2096b.m11740a(2);
            return;
        }
        if (C2120e.m11871a(l, 300000L)) {
            this.f19030d.m11838a(new C2114c(grsBaseInfo, context), null, str, this.f19029c, -1);
        }
        c2096b.m11740a(1);
    }

    /* renamed from: a */
    public void m11736a(GrsBaseInfo grsBaseInfo, C2106d c2106d, Context context, C2114c c2114c) {
        if (c2106d.m11819f() == 2) {
            Logger.m11689w(f19025e, "update cache from server failed");
            return;
        }
        if (c2114c.m11851d().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (c2106d.m11826m()) {
                f19026f.put(grsParasKey, C2091a.m11694a(this.f19028b.m11743a(grsParasKey, "")));
            } else {
                this.f19028b.m11747b(grsParasKey, c2106d.m11823j());
                f19026f.put(grsParasKey, C2091a.m11694a(c2106d.m11823j()));
            }
            if (!TextUtils.isEmpty(c2106d.m11818e())) {
                this.f19028b.m11747b(AbstractC7222ym.m26232i(grsParasKey, "ETag"), c2106d.m11818e());
            }
            this.f19028b.m11747b(AbstractC7222ym.m26232i(grsParasKey, CrashHianalyticsData.TIME), c2106d.m11809a());
            this.f19027a.put(grsParasKey, Long.valueOf(Long.parseLong(c2106d.m11809a())));
        } else {
            this.f19028b.m11747b("geoipCountryCode", c2106d.m11823j());
            this.f19028b.m11747b("geoipCountryCodetime", c2106d.m11809a());
        }
        Logger.m11685i(f19025e, "Cache size is: " + f19026f.size());
    }

    /* renamed from: a */
    private void m11732a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (C2120e.m11871a(this.f19027a.get(str), 300000L)) {
            this.f19030d.m11838a(new C2114c(grsBaseInfo, context), null, null, this.f19029c, -1);
        }
    }
}
