package com.huawei.hms.hatool;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.l */
/* loaded from: classes.dex */
public class C2161l extends AbstractC2182t {

    /* renamed from: b */
    private String f19232b = "";

    /* renamed from: c */
    private String f19233c = "";

    /* renamed from: d */
    private String f19234d = "";

    /* renamed from: e */
    private String f19235e = "";

    /* renamed from: f */
    protected String f19236f = "";

    /* renamed from: g */
    private String f19237g;

    @Override // com.huawei.hms.hatool.InterfaceC2172o1
    /* renamed from: a */
    public JSONObject mo11930a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f19301a);
        jSONObject.put(CommonUrlParts.HUAWEI_OAID, this.f19237g);
        jSONObject.put(CommonUrlParts.UUID, this.f19236f);
        jSONObject.put("upid", this.f19235e);
        jSONObject.put("imei", this.f19232b);
        jSONObject.put("sn", this.f19233c);
        jSONObject.put("udid", this.f19234d);
        return jSONObject;
    }

    /* renamed from: b */
    public void m12093b(String str) {
        this.f19232b = str;
    }

    /* renamed from: c */
    public void m12094c(String str) {
        this.f19237g = str;
    }

    /* renamed from: d */
    public void m12095d(String str) {
        this.f19233c = str;
    }

    /* renamed from: e */
    public void m12096e(String str) {
        this.f19234d = str;
    }

    /* renamed from: f */
    public void m12097f(String str) {
        this.f19235e = str;
    }

    /* renamed from: g */
    public void m12098g(String str) {
        this.f19236f = str;
    }
}
