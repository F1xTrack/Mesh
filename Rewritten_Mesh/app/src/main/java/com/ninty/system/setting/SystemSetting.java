package com.ninty.system.setting;

import android.app.Activity;
import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.view.WindowManager;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p000.C8687a81;
import p000.C8815b81;
import p000.C8943c81;
import p000.C9076d81;
import p000.C9204e81;
import p000.C9332f81;
import p000.I71;
import p000.RunnableC1483XZ;

/* loaded from: classes2.dex */
public class SystemSetting extends ReactContextBaseJavaModule implements ActivityEventListener, LifecycleEventListener {
    private static final String VOL_ALARM = "alarm";
    private static final String VOL_MUSIC = "music";
    private static final String VOL_NOTIFICATION = "notification";
    private static final String VOL_RING = "ring";
    private static final String VOL_SYSTEM = "system";
    private static final String VOL_VOICE_CALL = "call";
    private String TAG;
    private volatile BroadcastReceiver airplaneBR;

    /* renamed from: am */
    private AudioManager f20226am;
    private volatile BroadcastReceiver bluetoothBR;

    /* renamed from: lm */
    private LocationManager f20227lm;
    private volatile BroadcastReceiver locationBR;
    private volatile BroadcastReceiver locationModeBR;
    private ReactApplicationContext mContext;
    private C9332f81 volumeBR;
    private volatile BroadcastReceiver wifiBR;

    /* renamed from: wm */
    private WifiManager f20228wm;

    public SystemSetting(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.TAG = "SystemSetting";
        this.mContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f20226am = (AudioManager) this.mContext.getApplicationContext().getSystemService("audio");
        this.f20228wm = (WifiManager) this.mContext.getApplicationContext().getSystemService("wifi");
        this.f20227lm = (LocationManager) this.mContext.getApplicationContext().getSystemService("location");
        this.volumeBR = new C9332f81(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (android.provider.Settings.System.getInt(r1.mContext.getContentResolver(), r2) != r3) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkAndSet(java.lang.String r2, int r3, com.facebook.react.bridge.Promise r4) {
        /*
            r1 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r1.mContext
            boolean r0 = android.provider.Settings.System.canWrite(r0)
            if (r0 != 0) goto L9
            goto L1e
        L9:
            com.facebook.react.bridge.ReactApplicationContext r0 = r1.mContext     // Catch: java.lang.SecurityException -> L1e android.provider.Settings.SettingNotFoundException -> L26
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.SecurityException -> L1e android.provider.Settings.SettingNotFoundException -> L26
            android.provider.Settings.System.putInt(r0, r2, r3)     // Catch: java.lang.SecurityException -> L1e android.provider.Settings.SettingNotFoundException -> L26
            com.facebook.react.bridge.ReactApplicationContext r0 = r1.mContext     // Catch: java.lang.SecurityException -> L1e android.provider.Settings.SettingNotFoundException -> L26
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.SecurityException -> L1e android.provider.Settings.SettingNotFoundException -> L26
            int r2 = android.provider.Settings.System.getInt(r0, r2)     // Catch: java.lang.SecurityException -> L1e android.provider.Settings.SettingNotFoundException -> L26
            if (r2 == r3) goto L26
        L1e:
            java.lang.String r2 = "-1"
            java.lang.String r3 = "write_settings permission is blocked by system"
            r4.reject(r2, r3)
            goto L2b
        L26:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4.resolve(r2)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninty.system.setting.SystemSetting.checkAndSet(java.lang.String, int, com.facebook.react.bridge.Promise):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getNormalizationVolume(String str) {
        int volType = getVolType(str);
        return (this.f20226am.getStreamVolume(volType) * 1.0f) / this.f20226am.getStreamMaxVolume(volType);
    }

    private int getVolType(String str) {
        str.getClass();
        switch (str) {
            case "system":
                return 1;
            case "call":
                return 0;
            case "ring":
                return 2;
            case "alarm":
                return 4;
            case "notification":
                return 5;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLocationEnable() {
        return this.f20227lm.isProviderEnabled("gps") || this.f20227lm.isProviderEnabled("network");
    }

    private void listenAirplaneState() {
        if (this.airplaneBR == null) {
            synchronized (this) {
                try {
                    if (this.airplaneBR == null) {
                        this.airplaneBR = new C9204e81(this);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
                        this.mContext.registerReceiver(this.airplaneBR, intentFilter);
                    }
                } finally {
                }
            }
        }
    }

    private void listenBluetoothState() {
        if (this.bluetoothBR == null) {
            synchronized (this) {
                try {
                    if (this.bluetoothBR == null) {
                        this.bluetoothBR = new C8815b81(this);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                        this.mContext.registerReceiver(this.bluetoothBR, intentFilter);
                    }
                } finally {
                }
            }
        }
    }

    private void listenLocationModeState() {
        if (this.locationModeBR == null) {
            synchronized (this) {
                try {
                    if (this.locationModeBR == null) {
                        this.locationModeBR = new C9076d81(this);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.location.MODE_CHANGED");
                        this.mContext.registerReceiver(this.locationModeBR, intentFilter);
                    }
                } finally {
                }
            }
        }
    }

    private void listenLocationState() {
        if (this.locationBR == null) {
            synchronized (this) {
                try {
                    if (this.locationBR == null) {
                        this.locationBR = new C8943c81(this);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
                        this.mContext.registerReceiver(this.locationBR, intentFilter);
                    }
                } finally {
                }
            }
        }
    }

    private void listenWifiState() {
        if (this.wifiBR == null) {
            synchronized (this) {
                try {
                    if (this.wifiBR == null) {
                        this.wifiBR = new C8687a81(this);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                        this.mContext.registerReceiver(this.wifiBR, intentFilter);
                    }
                } finally {
                }
            }
        }
    }

    private void registerVolumeReceiver() {
        if (this.volumeBR.f27086a) {
            return;
        }
        this.mContext.registerReceiver(this.volumeBR, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        this.volumeBR.f27086a = true;
    }

    private void switchSetting(I71 i71) {
        if (this.mContext.getCurrentActivity() != null) {
            this.mContext.addActivityEventListener(this);
            this.mContext.getCurrentActivity().startActivityForResult(new Intent(i71.f4709a), i71.f4710b);
        }
    }

    private void unregisterVolumeReceiver() {
        C9332f81 c9332f81 = this.volumeBR;
        if (c9332f81.f27086a) {
            this.mContext.unregisterReceiver(c9332f81);
            this.volumeBR.f27086a = false;
        }
    }

    @ReactMethod
    public void activeListener(String str, Promise promise) {
        str.getClass();
        switch (str) {
            case "airplane":
                listenAirplaneState();
                promise.resolve(null);
                break;
            case "locationMode":
                listenLocationModeState();
                promise.resolve(null);
                break;
            case "wifi":
                listenWifiState();
                promise.resolve(null);
                break;
            case "location":
                listenLocationState();
                promise.resolve(null);
                break;
            case "bluetooth":
                listenBluetoothState();
                promise.resolve(null);
                break;
            default:
                promise.reject(ResultCode.ERROR, "unsupported listener type: ".concat(str));
                break;
        }
    }

    @ReactMethod
    public void getAppBrightness(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        try {
            float f = currentActivity.getWindow().getAttributes().screenBrightness;
            if (f < 0.0f) {
                promise.resolve(Float.valueOf((Settings.System.getInt(this.mContext.getContentResolver(), "screen_brightness") * 1.0f) / 255.0f));
            } else {
                promise.resolve(Float.valueOf(f));
            }
        } catch (Exception e) {
            promise.reject(ResultCode.ERROR, "get app's brightness fail", e);
        }
    }

    @ReactMethod
    public void getBrightness(Promise promise) {
        try {
            promise.resolve(Float.valueOf((Settings.System.getInt(this.mContext.getContentResolver(), "screen_brightness") * 1.0f) / 255.0f));
        } catch (Settings.SettingNotFoundException e) {
            promise.reject(ResultCode.ERROR, "get brightness fail", e);
        }
    }

    @ReactMethod
    public void getLocationMode(Promise promise) {
        if (this.f20227lm != null) {
            promise.resolve(Integer.valueOf(getLocationMode()));
        } else {
            promise.reject(ResultCode.ERROR, "get location manager fail");
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SystemSetting";
    }

    @ReactMethod
    public void getScreenMode(Promise promise) {
        try {
            promise.resolve(Integer.valueOf(Settings.System.getInt(this.mContext.getContentResolver(), "screen_brightness_mode")));
        } catch (Settings.SettingNotFoundException e) {
            promise.reject(ResultCode.ERROR, "get screen mode fail", e);
        }
    }

    @ReactMethod
    public void getVolume(String str, Promise promise) {
        promise.resolve(Float.valueOf(getNormalizationVolume(str)));
    }

    @ReactMethod
    public void isAirplaneEnabled(Promise promise) {
        try {
            boolean z = true;
            if (Settings.System.getInt(this.mContext.getContentResolver(), "airplane_mode_on") != 1) {
                z = false;
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Settings.SettingNotFoundException e) {
            promise.reject(ResultCode.ERROR, "get airplane mode fail", e);
        }
    }

    @ReactMethod
    public void isBluetoothEnabled(Promise promise) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        promise.resolve(Boolean.valueOf(defaultAdapter != null && defaultAdapter.isEnabled()));
    }

    @ReactMethod
    public void isLocationEnabled(Promise promise) {
        if (this.f20227lm != null) {
            promise.resolve(Boolean.valueOf(isLocationEnable()));
        } else {
            promise.reject(ResultCode.ERROR, "get location manager fail");
        }
    }

    @ReactMethod
    public void isWifiEnabled(Promise promise) {
        WifiManager wifiManager = this.f20228wm;
        if (wifiManager != null) {
            promise.resolve(Boolean.valueOf(wifiManager.isWifiEnabled()));
        } else {
            promise.reject(ResultCode.ERROR, "get wifi manager fail");
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        I71 i71;
        I71 i712;
        I71[] i71ArrValues = I71.values();
        int length = i71ArrValues.length;
        int i3 = 0;
        while (true) {
            i71 = I71.f4703c;
            if (i3 >= length) {
                i712 = i71;
                break;
            }
            i712 = i71ArrValues[i3];
            if (i712.f4710b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i712 != i71) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("EventEnterForeground", null);
            this.mContext.removeActivityEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (this.wifiBR != null) {
            this.mContext.unregisterReceiver(this.wifiBR);
            this.wifiBR = null;
        }
        if (this.bluetoothBR != null) {
            this.mContext.unregisterReceiver(this.bluetoothBR);
            this.bluetoothBR = null;
        }
        if (this.locationBR != null) {
            this.mContext.unregisterReceiver(this.locationBR);
            this.locationBR = null;
        }
        if (this.locationModeBR != null) {
            this.mContext.unregisterReceiver(this.locationModeBR);
            this.locationBR = null;
        }
        if (this.airplaneBR != null) {
            this.mContext.unregisterReceiver(this.airplaneBR);
            this.airplaneBR = null;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        unregisterVolumeReceiver();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        registerVolumeReceiver();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openAppSystemSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.setData(Uri.parse("package:" + this.mContext.getPackageName()));
        if (intent.resolveActivity(this.mContext.getPackageManager()) != null) {
            this.mContext.startActivity(intent);
        }
    }

    @ReactMethod
    public void openWriteSetting() {
        this.mContext.getCurrentActivity().startActivity(new Intent("android.settings.action.MANAGE_WRITE_SETTINGS", Uri.parse("package:" + this.mContext.getPackageName())));
    }

    @ReactMethod
    public void setAppBrightness(float f) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = currentActivity.getWindow().getAttributes();
        attributes.screenBrightness = f;
        currentActivity.runOnUiThread(new RunnableC1483XZ(currentActivity, 20, attributes));
    }

    @ReactMethod
    public void setBrightness(float f, Promise promise) {
        checkAndSet("screen_brightness", (int) (f * 255.0f), promise);
    }

    @ReactMethod
    public void setScreenMode(int i, Promise promise) {
        if (i != 0) {
            i = 1;
        }
        checkAndSet("screen_brightness_mode", i, promise);
    }

    @ReactMethod
    public void setVolume(float f, ReadableMap readableMap) {
        unregisterVolumeReceiver();
        String string = readableMap.getString("type");
        boolean z = readableMap.getBoolean(NotificationConstants.PLAY_SOUND);
        boolean z2 = readableMap.getBoolean("showUI");
        int volType = getVolType(string);
        int i = z ? 4 : 0;
        if (z2) {
            i |= 1;
        }
        try {
            this.f20226am.setStreamVolume(volType, (int) (r5.getStreamMaxVolume(volType) * f), i);
        } catch (SecurityException unused) {
            if (f == 0.0f && !((NotificationManager) this.mContext.getSystemService("notification")).isNotificationPolicyAccessGranted()) {
                this.mContext.startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
            }
        }
        registerVolumeReceiver();
    }

    @ReactMethod
    public void switchAirplane() {
        switchSetting(I71.f4707g);
    }

    @ReactMethod
    public void switchBluetooth() {
        switchSetting(I71.f4706f);
    }

    @ReactMethod
    public void switchBluetoothSilence() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            listenBluetoothState();
            if (defaultAdapter.isEnabled()) {
                defaultAdapter.disable();
            } else {
                defaultAdapter.enable();
            }
        }
    }

    @ReactMethod
    public void switchLocation() {
        switchSetting(I71.f4705e);
    }

    @ReactMethod
    public void switchWifi() {
        switchSetting(I71.f4704d);
    }

    @ReactMethod
    public void switchWifiSilence() {
        if (this.f20228wm != null) {
            listenWifiState();
            this.f20228wm.setWifiEnabled(!r0.isWifiEnabled());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLocationMode() {
        boolean zIsProviderEnabled = this.f20227lm.isProviderEnabled("gps");
        return this.f20227lm.isProviderEnabled("network") ? (zIsProviderEnabled ? 1 : 0) | 2 : zIsProviderEnabled ? 1 : 0;
    }
}
