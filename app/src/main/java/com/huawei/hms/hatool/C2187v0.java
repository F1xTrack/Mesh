package com.huawei.hms.hatool;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.hms.hatool.v0 */
/* loaded from: classes.dex */
public class C2187v0 implements InterfaceRunnableC2146g {

    /* renamed from: a */
    private Context f19312a = AbstractC2177q0.m12197i();

    /* renamed from: b */
    private String f19313b;

    /* renamed from: c */
    private String f19314c;

    /* renamed from: d */
    private String f19315d;

    public C2187v0(String str, String str2, String str3) {
        this.f19313b = str;
        this.f19314c = str2;
        this.f19315d = str3;
    }

    /* renamed from: a */
    private void m12277a(String str, List<C2133b1> list) {
        Pair<String, String> pairM12137a = AbstractC2169n1.m12137a(str);
        new C2184u(list, (String) pairM12137a.first, (String) pairM12137a.second, this.f19315d).m12258a();
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, List<C2133b1>> mapM11948a;
        C2186v.m12271c("hmsSdk", "eventReportTask is running");
        boolean zM11943a = C2135c0.m11943a(this.f19312a);
        if (zM11943a) {
            C2186v.m12271c("hmsSdk", "workKey is refresh,begin report all data");
            this.f19314c = "alltype";
        }
        try {
            try {
                try {
                    mapM11948a = C2136c1.m11948a(this.f19312a, this.f19313b, this.f19314c);
                } catch (Exception e) {
                    C2186v.m12275e("hmsSdk", "readEventRecords handData Exception:" + e.getMessage());
                    if ("alltype".equals(this.f19314c)) {
                        C2137d.m11957a(this.f19312a, "stat_v2_1", new String[0]);
                        C2137d.m11957a(this.f19312a, "cached_v2_1", new String[0]);
                    } else {
                        String strM12139a = AbstractC2169n1.m12139a(this.f19313b, this.f19314c);
                        C2137d.m11957a(this.f19312a, "stat_v2_1", strM12139a);
                        C2137d.m11957a(this.f19312a, "cached_v2_1", strM12139a);
                    }
                }
            } catch (IllegalArgumentException e2) {
                C2186v.m12275e("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e2.getMessage());
                if ("alltype".equals(this.f19314c)) {
                    C2137d.m11957a(this.f19312a, "stat_v2_1", new String[0]);
                    C2137d.m11957a(this.f19312a, "cached_v2_1", new String[0]);
                } else {
                    String strM12139a2 = AbstractC2169n1.m12139a(this.f19313b, this.f19314c);
                    C2137d.m11957a(this.f19312a, "stat_v2_1", strM12139a2);
                    C2137d.m11957a(this.f19312a, "cached_v2_1", strM12139a2);
                }
            }
            if (mapM11948a.size() == 0) {
                C2186v.m12269b("hmsSdk", "no have events to report: tag:%s : type:%s", this.f19313b, this.f19314c);
                if ("alltype".equals(this.f19314c)) {
                    C2137d.m11957a(this.f19312a, "stat_v2_1", new String[0]);
                    C2137d.m11957a(this.f19312a, "cached_v2_1", new String[0]);
                    return;
                } else {
                    String strM12139a3 = AbstractC2169n1.m12139a(this.f19313b, this.f19314c);
                    C2137d.m11957a(this.f19312a, "stat_v2_1", strM12139a3);
                    C2137d.m11957a(this.f19312a, "cached_v2_1", strM12139a3);
                    return;
                }
            }
            for (Map.Entry<String, List<C2133b1>> entry : mapM11948a.entrySet()) {
                m12277a(entry.getKey(), entry.getValue());
            }
            if ("alltype".equals(this.f19314c)) {
                C2137d.m11957a(this.f19312a, "stat_v2_1", new String[0]);
                C2137d.m11957a(this.f19312a, "cached_v2_1", new String[0]);
            } else {
                String strM12139a4 = AbstractC2169n1.m12139a(this.f19313b, this.f19314c);
                C2137d.m11957a(this.f19312a, "stat_v2_1", strM12139a4);
                C2137d.m11957a(this.f19312a, "cached_v2_1", strM12139a4);
            }
            if (zM11943a) {
                C2186v.m12271c("hmsSdk", "refresh local key");
                C2171o0.m12156d().m12161b();
            }
        } catch (Throwable th) {
            if ("alltype".equals(this.f19314c)) {
                C2137d.m11957a(this.f19312a, "stat_v2_1", new String[0]);
                C2137d.m11957a(this.f19312a, "cached_v2_1", new String[0]);
            } else {
                String strM12139a5 = AbstractC2169n1.m12139a(this.f19313b, this.f19314c);
                C2137d.m11957a(this.f19312a, "stat_v2_1", strM12139a5);
                C2137d.m11957a(this.f19312a, "cached_v2_1", strM12139a5);
            }
            throw th;
        }
    }
}
