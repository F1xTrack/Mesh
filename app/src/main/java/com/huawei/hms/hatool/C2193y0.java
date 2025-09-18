package com.huawei.hms.hatool;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.y0 */
/* loaded from: classes.dex */
public class C2193y0 extends AbstractC2183t0 {

    /* renamed from: f */
    String f19319f;

    /* renamed from: g */
    String f19320g;

    /* renamed from: h */
    private String f19321h;

    @Override // com.huawei.hms.hatool.InterfaceC2172o1
    /* renamed from: a */
    public JSONObject mo11930a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_rom_ver", this.f19321h);
        jSONObject.put("_emui_ver", this.f19302a);
        jSONObject.put("_model", Build.MODEL);
        jSONObject.put("_mcc", this.f19319f);
        jSONObject.put("_mnc", this.f19320g);
        jSONObject.put("_package_name", this.f19303b);
        jSONObject.put("_app_ver", this.f19304c);
        jSONObject.put("_lib_ver", "2.2.0.314");
        jSONObject.put("_channel", this.f19305d);
        jSONObject.put("_lib_name", "hianalytics");
        jSONObject.put("_oaid_tracking_flag", this.f19306e);
        return jSONObject;
    }

    /* renamed from: f */
    public void m12304f(String str) {
        this.f19319f = str;
    }

    /* renamed from: g */
    public void m12305g(String str) {
        this.f19320g = str;
    }

    /* renamed from: h */
    public void m12306h(String str) {
        this.f19321h = str;
    }
}
