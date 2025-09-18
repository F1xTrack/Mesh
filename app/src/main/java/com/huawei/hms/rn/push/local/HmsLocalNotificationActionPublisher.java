package com.huawei.hms.rn.push.local;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.rn.push.utils.BundleUtils;

/* loaded from: classes.dex */
public class HmsLocalNotificationActionPublisher {
    private ReactContext context;

    public HmsLocalNotificationActionPublisher(ReactContext reactContext) {
        this.context = reactContext;
    }

    public void notifyNotificationAction(Bundle bundle) {
        String strConvertJSON = BundleUtils.convertJSON(bundle);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, strConvertJSON);
        sendEvent(writableMapCreateMap);
    }

    public void sendEvent(Object obj) {
        if (this.context.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.LOCAL_NOTIFICATION_ACTION_EVENT, obj);
        }
    }
}
