package com.huawei.hms.activity.internal;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ForegroundInnerHeader {

    /* renamed from: a */
    private int f18711a;

    /* renamed from: b */
    private String f18712b;

    /* renamed from: c */
    private String f18713c;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f18711a = JsonUtil.getIntValue(jSONObject, "apkVersion");
            this.f18712b = JsonUtil.getStringValue(jSONObject, NotificationConstants.ACTION);
            this.f18713c = JsonUtil.getStringValue(jSONObject, "responseCallbackKey");
        } catch (JSONException e) {
            HMSLog.m12620e("ForegroundInnerHeader", "fromJson failed: " + e.getMessage());
        }
    }

    public String getAction() {
        return this.f18712b;
    }

    public int getApkVersion() {
        return this.f18711a;
    }

    public String getResponseCallbackKey() {
        return this.f18713c;
    }

    public void setAction(String str) {
        this.f18712b = str;
    }

    public void setApkVersion(int i) {
        this.f18711a = i;
    }

    public void setResponseCallbackKey(String str) {
        this.f18713c = str;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", this.f18711a);
            jSONObject.put(NotificationConstants.ACTION, this.f18712b);
            jSONObject.put("responseCallbackKey", this.f18713c);
        } catch (JSONException e) {
            HMSLog.m12620e("ForegroundInnerHeader", "ForegroundInnerHeader toJson failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "apkVersion:" + this.f18711a + ", action:" + this.f18712b + ", responseCallbackKey:" + this.f18713c;
    }
}
