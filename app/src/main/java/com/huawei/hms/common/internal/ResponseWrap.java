package com.huawei.hms.common.internal;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ResponseWrap {

    /* renamed from: a */
    private String f18970a;

    /* renamed from: b */
    private ResponseHeader f18971b;

    public ResponseWrap(ResponseHeader responseHeader) {
        this.f18971b = responseHeader;
    }

    public boolean fromJson(String str) {
        if (this.f18971b == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f18971b.setStatusCode(JsonUtil.getIntValue(jSONObject, "status_code"));
            this.f18971b.setErrorCode(JsonUtil.getIntValue(jSONObject, "error_code"));
            this.f18971b.setErrorReason(JsonUtil.getStringValue(jSONObject, "error_reason"));
            this.f18971b.setSrvName(JsonUtil.getStringValue(jSONObject, "srv_name"));
            this.f18971b.setApiName(JsonUtil.getStringValue(jSONObject, "api_name"));
            this.f18971b.setAppID(JsonUtil.getStringValue(jSONObject, "app_id"));
            this.f18971b.setPkgName(JsonUtil.getStringValue(jSONObject, "pkg_name"));
            this.f18971b.setSessionId(JsonUtil.getStringValue(jSONObject, "session_id"));
            this.f18971b.setTransactionId(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.TRANSACTION_ID));
            this.f18971b.setResolution(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.HAS_RESOLUTION));
            this.f18970a = JsonUtil.getStringValue(jSONObject, "body");
            return true;
        } catch (JSONException e) {
            HMSLog.m12620e("ResponseWrap", "fromJson failed: " + e.getMessage());
            return false;
        }
    }

    public String getBody() {
        if (TextUtils.isEmpty(this.f18970a)) {
            this.f18970a = new JSONObject().toString();
        }
        return this.f18970a;
    }

    public ResponseHeader getResponseHeader() {
        return this.f18971b;
    }

    public void setBody(String str) {
        this.f18970a = str;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.f18971b = responseHeader;
    }

    public String toJson() throws JSONException {
        if (this.f18971b == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", this.f18971b.getStatusCode());
            jSONObject.put("error_code", this.f18971b.getErrorCode());
            jSONObject.put("error_reason", this.f18971b.getErrorReason());
            jSONObject.put("srv_name", this.f18971b.getSrvName());
            jSONObject.put("api_name", this.f18971b.getApiName());
            jSONObject.put("app_id", this.f18971b.getAppID());
            jSONObject.put("pkg_name", this.f18971b.getPkgName());
            jSONObject.put(CommonCode.MapKey.TRANSACTION_ID, this.f18971b.getTransactionId());
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, this.f18971b.getResolution());
            String sessionId = this.f18971b.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                jSONObject.put("session_id", sessionId);
            }
            if (!TextUtils.isEmpty(this.f18970a)) {
                jSONObject.put("body", this.f18970a);
            }
        } catch (JSONException e) {
            HMSLog.m12620e("ResponseWrap", "toJson failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "ResponseWrap{body='" + this.f18970a + "', responseHeader=" + this.f18971b + '}';
    }
}
