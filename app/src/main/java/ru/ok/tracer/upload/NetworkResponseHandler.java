package ru.ok.tracer.upload;

import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.D51;
import defpackage.O90;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.config.ConfigStorage;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/tracer/upload/NetworkResponseHandler;", "", "<init>", "()V", "", "contentType", RemoteMessageConst.Notification.CONTENT, "featureName", "tag", "LTf1;", "universalHandleResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkResponseHandler {
    public static final NetworkResponseHandler INSTANCE = new NetworkResponseHandler();

    private NetworkResponseHandler() {
    }

    public static /* synthetic */ void universalHandleResponse$default(NetworkResponseHandler networkResponseHandler, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        networkResponseHandler.universalHandleResponse(str, str2, str3, str4);
    }

    public final void universalHandleResponse(String contentType, String str, String featureName, String tag) {
        O90.f(featureName, "featureName");
        if (str == null) {
            Logger.w$default("Response with no body", null, 2, null);
            return;
        }
        if (D51.o(str, "{", false)) {
            try {
                universalHandleResponse(new JSONObject(str), featureName, tag);
            } catch (JSONException unused) {
            }
        } else {
            Logger.w$default("Unsupported Content-Type " + contentType, null, 2, null);
        }
    }

    public static /* synthetic */ void universalHandleResponse$default(NetworkResponseHandler networkResponseHandler, JSONObject jSONObject, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        networkResponseHandler.universalHandleResponse(jSONObject, str, str2);
    }

    public final void universalHandleResponse(JSONObject jsonObject, String featureName, String tag) {
        O90.f(jsonObject, "jsonObject");
        O90.f(featureName, "featureName");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("commands");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        long jOptLong = jSONObjectOptJSONObject.optLong("tagShutdownMs");
        long jOptLong2 = jSONObjectOptJSONObject.optLong("featureShutdownMs");
        long jOptLong3 = jSONObjectOptJSONObject.optLong("globalShutdownMs");
        ConfigStorage configStorage = ConfigStorage.INSTANCE;
        configStorage.setLimits(featureName, tag, Long.valueOf(jOptLong3), Long.valueOf(jOptLong2), Long.valueOf(jOptLong));
        configStorage.save();
    }
}
