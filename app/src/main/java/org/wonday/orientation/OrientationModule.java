package org.wonday.orientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC3929dS;
import p000.C8090Oy0;
import p000.InterfaceC8298Sy0;

/* loaded from: classes2.dex */
public class OrientationModule extends ReactContextBaseJavaModule implements InterfaceC8298Sy0 {
    final ReactApplicationContext ctx;
    private boolean isConfigurationChangeReceiverRegistered;
    private boolean isLocked;
    private String lastDeviceOrientationValue;
    private String lastOrientationValue;
    final OrientationEventListener mOrientationListener;
    final BroadcastReceiver mReceiver;

    public OrientationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.isLocked = false;
        this.isConfigurationChangeReceiverRegistered = false;
        this.lastOrientationValue = "";
        this.lastDeviceOrientationValue = "";
        this.ctx = reactApplicationContext;
        C6579a c6579a = new C6579a(this, reactApplicationContext);
        this.mOrientationListener = c6579a;
        if (c6579a.canDetectOrientation()) {
            AbstractC3929dS.m17669b("ReactNative");
            c6579a.enable();
        } else {
            AbstractC3929dS.m17669b("ReactNative");
            c6579a.disable();
        }
        this.mReceiver = new C6580b(this);
        if (C8090Oy0.f8762c == null) {
            C8090Oy0.f8762c = new C8090Oy0();
        }
        C8090Oy0 c8090Oy0 = C8090Oy0.f8762c;
        c8090Oy0.f8763a = this;
        if (C8090Oy0.f8761b.get() == 1) {
            c8090Oy0.f8763a.start();
        }
    }

    private void compatRegisterReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z ? 2 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCurrentOrientation() {
        int rotation = ((WindowManager) getReactApplicationContext().getSystemService("window")).getDefaultDisplay().getRotation();
        return rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "LANDSCAPE-RIGHT" : "PORTRAIT-UPSIDEDOWN" : "LANDSCAPE-LEFT" : "PORTRAIT";
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getAutoRotateState(Callback callback) {
        callback.invoke(Boolean.valueOf(Settings.System.getInt(this.ctx.getContentResolver(), "accelerometer_rotation", 0) == 1));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("initialOrientation", getCurrentOrientation());
        return map;
    }

    @ReactMethod
    public void getDeviceOrientation(Callback callback) {
        callback.invoke(this.lastDeviceOrientationValue);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Orientation";
    }

    @ReactMethod
    public void getOrientation(Callback callback) {
        callback.invoke(getCurrentOrientation());
    }

    @ReactMethod
    public void lockToLandscape() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(6);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-LEFT";
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", writableMapCreateMap2);
        }
    }

    @ReactMethod
    public void lockToLandscapeLeft() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(0);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-LEFT";
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", writableMapCreateMap2);
        }
    }

    @ReactMethod
    public void lockToLandscapeRight() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(8);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-RIGHT";
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", writableMapCreateMap2);
        }
    }

    @ReactMethod
    public void lockToPortrait() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(1);
        this.isLocked = true;
        this.lastOrientationValue = "PORTRAIT";
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", writableMapCreateMap2);
        }
    }

    @ReactMethod
    public void lockToPortraitUpsideDown() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(9);
        this.isLocked = true;
        this.lastOrientationValue = "PORTRAIT-UPSIDEDOWN";
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", writableMapCreateMap2);
        }
    }

    @Override // p000.InterfaceC8298Sy0
    public void release() {
        AbstractC3929dS.m17669b("ReactNative");
        this.mOrientationListener.disable();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        try {
            if (this.isConfigurationChangeReceiverRegistered) {
                currentActivity.unregisterReceiver(this.mReceiver);
                this.isConfigurationChangeReceiverRegistered = false;
            }
        } catch (Exception unused) {
            AbstractC3929dS.m17686s("ReactNative");
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @Override // p000.InterfaceC8298Sy0
    public void start() {
        AbstractC3929dS.m17677j("ReactNative");
        this.mOrientationListener.enable();
        compatRegisterReceiver(this.ctx, this.mReceiver, new IntentFilter("onConfigurationChanged"), false);
        this.isConfigurationChangeReceiverRegistered = true;
    }

    @Override // p000.InterfaceC8298Sy0
    public void stop() {
        AbstractC3929dS.m17669b("ReactNative");
        this.mOrientationListener.disable();
        try {
            if (this.isConfigurationChangeReceiverRegistered) {
                this.ctx.unregisterReceiver(this.mReceiver);
                this.isConfigurationChangeReceiverRegistered = false;
            }
        } catch (Exception unused) {
            AbstractC3929dS.m17686s("ReactNative");
        }
    }

    @ReactMethod
    public void unlockAllOrientations() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(4);
        this.isLocked = false;
        this.lastOrientationValue = getCurrentOrientation();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("orientation", GrsBaseInfo.CountryCodeSource.UNKNOWN);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", writableMapCreateMap2);
        }
    }
}
