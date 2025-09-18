package com.huawei.hms.hatool;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.f0 */
/* loaded from: classes.dex */
public class C2144f0 extends AbstractC2159k0 {

    /* renamed from: g */
    private String f19175g = "";

    @Override // com.huawei.hms.hatool.InterfaceC2172o1
    /* renamed from: a */
    public JSONObject mo11930a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonUrlParts.PROTOCOL_VERSION, "3");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.f19229d);
        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.f19226a);
        jSONObject.put("hmac", this.f19175g);
        jSONObject.put("chifer", this.f19231f);
        jSONObject.put("timestamp", this.f19227b);
        jSONObject.put("servicetag", this.f19228c);
        jSONObject.put("requestid", this.f19230e);
        return jSONObject;
    }

    /* renamed from: g */
    public void m11990g(String str) {
        this.f19175g = str;
    }
}
