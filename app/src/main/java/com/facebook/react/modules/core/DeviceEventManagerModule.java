package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import p000.GR0;
import p000.InterfaceC0965PK;
import p000.InterfaceC7189yF;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = NativeDeviceEventManagerSpec.NAME)
/* loaded from: classes.dex */
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    private final Runnable mInvokeDefaultBackPressRunnable;

    @InterfaceC0965PK
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, InterfaceC7189yF interfaceC7189yF) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new GR0(12, interfaceC7189yF);
    }

    public void emitHardwareBackPressed() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("hardwareBackPress", null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("url", uri.toString());
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("url", writableMapCreateMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceEventManagerSpec
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
