package com.huawei.hms.hatool;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.hms.hatool.u0 */
/* loaded from: classes.dex */
public class C2185u0 {
    /* renamed from: a */
    public static C2144f0 m12259a(String str, String str2, String str3, String str4) {
        C2144f0 c2144f0 = new C2144f0();
        c2144f0.m12080a(str);
        c2144f0.m12081b(AbstractC2177q0.m12191f());
        c2144f0.m12084e(str2);
        c2144f0.m12082c(str4);
        StringBuffer stringBuffer = new StringBuffer("hmshi");
        stringBuffer.append(str3);
        stringBuffer.append("qrt");
        c2144f0.m12083d(stringBuffer.toString());
        return c2144f0;
    }

    /* renamed from: b */
    public static C2151h1 m12262b(String str, String str2) {
        C2186v.m12271c("hmsSdk", "generate UploadData EventModelHandlerBase");
        C2166m1.m12122d().m12124a(str, str2);
        if (!TextUtils.isEmpty(C2166m1.m12122d().m12123a())) {
            return new C2151h1(C2166m1.m12122d().m12126c());
        }
        C2186v.m12276f("hmsSdk", "event chifer is empty");
        return null;
    }

    /* renamed from: c */
    public static Map<String, String> m12263c(String str, String str2) {
        HashMap map = new HashMap();
        map.put("App-Id", AbstractC2177q0.m12191f());
        map.put("App-Ver", AbstractC2177q0.m12193g());
        map.put("Sdk-Name", "hianalytics");
        map.put("Sdk-Ver", "2.2.0.314");
        map.put("Device-Type", Build.MODEL);
        map.put("servicetag", str);
        C2186v.m12266a("hmsSdk", "sendData RequestId : %s", str2);
        map.put("Request-Id", str2);
        return map;
    }

    /* renamed from: a */
    public static C2161l m12260a(String str, String str2) {
        C2161l c2161l = new C2161l();
        c2161l.m12251a(C2155j.m12055a().m12056a(str, str2));
        return c2161l;
    }

    /* renamed from: a */
    public static C2193y0 m12261a(String str, String str2, String str3) {
        C2193y0 c2193y0 = new C2193y0();
        c2193y0.m12254c(AbstractC2177q0.m12198j());
        c2193y0.m12256e(AbstractC2177q0.m12200l());
        c2193y0.m12252a(str3);
        c2193y0.m12253b(C2155j.m12055a().m12059b(str2, str));
        return c2193y0;
    }
}
