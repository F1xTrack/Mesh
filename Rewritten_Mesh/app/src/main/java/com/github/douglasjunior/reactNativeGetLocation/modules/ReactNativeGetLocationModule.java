package com.github.douglasjunior.reactNativeGetLocation.modules;

import android.content.ComponentName;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p000.C8669a10;

/* loaded from: classes.dex */
public class ReactNativeGetLocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "ReactNativeGetLocation";
    private C8669a10 getLocation;
    private LocationManager locationManager;

    public ReactNativeGetLocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        try {
            this.locationManager = (LocationManager) reactApplicationContext.getApplicationContext().getSystemService("location");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r5.isProviderEnabled("network") != false) goto L27;
     */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getCurrentPosition(com.facebook.react.bridge.ReadableMap r19, com.facebook.react.bridge.Promise r20) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.douglasjunior.reactNativeGetLocation.modules.ReactNativeGetLocationModule.getCurrentPosition(com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void openAppSettings(Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setFlags(335544320);
            intent.setData(Uri.fromParts("package", reactApplicationContext.getPackageName(), null));
            reactApplicationContext.startActivity(intent);
            promise.resolve(null);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    @ReactMethod
    public void openCelularSettings(Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity"));
            intent.setFlags(335544320);
            reactApplicationContext.startActivity(intent);
            promise.resolve(null);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    @ReactMethod
    public void openGpsSettings(Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            intent.setFlags(335544320);
            reactApplicationContext.startActivity(intent);
            promise.resolve(null);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    @ReactMethod
    public void openWifiSettings(Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intent intent = new Intent("android.settings.WIFI_SETTINGS");
            intent.setFlags(335544320);
            reactApplicationContext.startActivity(intent);
            promise.resolve(null);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }
}
