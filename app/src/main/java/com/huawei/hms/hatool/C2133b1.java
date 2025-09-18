package com.huawei.hms.hatool;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.b1 */
/* loaded from: classes.dex */
public class C2133b1 implements InterfaceC2172o1 {

    /* renamed from: a */
    private String f19151a;

    /* renamed from: b */
    private String f19152b;

    /* renamed from: c */
    private String f19153c;

    /* renamed from: d */
    private String f19154d;

    /* renamed from: e */
    private String f19155e;

    /* renamed from: f */
    private String f19156f;

    @Override // com.huawei.hms.hatool.InterfaceC2172o1
    /* renamed from: a */
    public JSONObject mo11930a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f19151a);
        jSONObject.put("eventtime", this.f19154d);
        jSONObject.put("event", this.f19152b);
        jSONObject.put("event_session_name", this.f19155e);
        jSONObject.put("first_session_event", this.f19156f);
        if (TextUtils.isEmpty(this.f19153c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f19153c));
        return jSONObject;
    }

    /* renamed from: b */
    public String m11933b() {
        return this.f19154d;
    }

    /* renamed from: c */
    public String m11935c() {
        return this.f19151a;
    }

    /* renamed from: d */
    public JSONObject m11937d() throws JSONException {
        JSONObject jSONObjectMo11930a = mo11930a();
        jSONObjectMo11930a.put("properties", C2167n.m12133b(this.f19153c, C2171o0.m12156d().m12160a()));
        return jSONObjectMo11930a;
    }

    /* renamed from: e */
    public void m11939e(String str) {
        this.f19156f = str;
    }

    /* renamed from: f */
    public void m11940f(String str) {
        this.f19155e = str;
    }

    /* renamed from: a */
    public void m11931a(String str) {
        this.f19153c = str;
    }

    /* renamed from: b */
    public void m11934b(String str) {
        this.f19152b = str;
    }

    /* renamed from: c */
    public void m11936c(String str) {
        this.f19154d = str;
    }

    /* renamed from: d */
    public void m11938d(String str) {
        this.f19151a = str;
    }

    /* renamed from: a */
    public void m11932a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f19152b = jSONObject.optString("event");
        this.f19153c = C2167n.m12131a(jSONObject.optString("properties"), C2171o0.m12156d().m12160a());
        this.f19151a = jSONObject.optString("type");
        this.f19154d = jSONObject.optString("eventtime");
        this.f19155e = jSONObject.optString("event_session_name");
        this.f19156f = jSONObject.optString("first_session_event");
    }
}
