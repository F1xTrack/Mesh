package io.appmetrica.analytics.reactnative;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes2.dex */
public class ReactNativeStartupParamsListener implements StartupParamsCallback {
    private final Callback listener;

    public ReactNativeStartupParamsListener(Callback callback) {
        this.listener = callback;
    }

    private static WritableMap toParamsMap(StartupParamsCallback.Result result) {
        if (result == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("deviceId", result.deviceId);
        writableNativeMap.putString("deviceIdHash", result.deviceIdHash);
        writableNativeMap.putString(CommonUrlParts.UUID, result.uuid);
        return writableNativeMap;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public void onReceive(StartupParamsCallback.Result result) {
        this.listener.invoke(toParamsMap(result), null);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.listener.invoke(null, reason.value);
    }
}
