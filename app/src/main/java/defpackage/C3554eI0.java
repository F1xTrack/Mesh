package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: eI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3554eI0 {
    public final ReactContext a;

    public C3554eI0(ReactContext reactContext) {
        this.a = reactContext;
    }

    public static JSONObject a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                jSONObject.put(str, a((Bundle) obj));
            } else {
                jSONObject.put(str, JSONObject.wrap(obj));
            }
        }
        return jSONObject;
    }

    public final void b(String str, WritableMap writableMap) {
        ReactContext reactContext = this.a;
        if (reactContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }
}
