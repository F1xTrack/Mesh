package p000;

import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: eI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9223eI0 {

    /* renamed from: a */
    public final ReactContext f26652a;

    public C9223eI0(ReactContext reactContext) {
        this.f26652a = reactContext;
    }

    /* renamed from: a */
    public static JSONObject m17897a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                jSONObject.put(str, m17897a((Bundle) obj));
            } else {
                jSONObject.put(str, JSONObject.wrap(obj));
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void m17898b(String str, WritableMap writableMap) {
        ReactContext reactContext = this.f26652a;
        if (reactContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }
}
