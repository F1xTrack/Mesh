package com.reactnativelastactivestate;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = LastActiveStateModule.NAME)
/* loaded from: classes2.dex */
public class LastActiveStateModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String NAME = "LastActiveState";
    ReactApplicationContext context;

    public LastActiveStateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private Long getLastActive() {
        return Long.valueOf(this.context.getSharedPreferences("lastActiveTime", 0).getLong("lastActiveTime", 0L));
    }

    private void sendEvent(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("changeLastActiveTime", writableMap);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap(1);
        map.put("initialLastActiveTime", getLastActive());
        return map;
    }

    @ReactMethod
    public void getLastActiveTime(Callback callback) {
        callback.invoke(Double.valueOf(getLastActive().doubleValue()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.context.removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences("lastActiveTime", 0).edit();
        editorEdit.putLong("lastActiveTime", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("lastActiveTime", getLastActive().doubleValue());
        sendEvent(writableMapCreateMap);
    }
}
