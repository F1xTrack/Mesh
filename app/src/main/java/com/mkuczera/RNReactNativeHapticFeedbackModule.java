package com.mkuczera;

import android.media.AudioManager;
import android.os.Vibrator;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import p000.AbstractC7747Ii1;
import p000.InterfaceC7695Hi1;

/* loaded from: classes2.dex */
public class RNReactNativeHapticFeedbackModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public RNReactNativeHapticFeedbackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNHapticFeedback";
    }

    @ReactMethod
    public void trigger(String str, ReadableMap readableMap) {
        ReactApplicationContext reactApplicationContext = this.reactContext;
        boolean z = readableMap.getBoolean("ignoreAndroidSystemSettings");
        Vibrator vibrator = (Vibrator) reactApplicationContext.getSystemService("vibrator");
        AudioManager audioManager = (AudioManager) reactApplicationContext.getSystemService("audio");
        boolean z2 = false;
        boolean z3 = vibrator != null && vibrator.hasVibrator();
        boolean z4 = audioManager.getRingerMode() != 0;
        boolean z5 = audioManager.getRingerMode() == 1;
        if (z3 && (z4 || z5)) {
            z2 = true;
        }
        if (z || z2) {
            Vibrator vibrator2 = (Vibrator) reactApplicationContext.getSystemService("vibrator");
            InterfaceC7695Hi1 interfaceC7695Hi1 = (InterfaceC7695Hi1) AbstractC7747Ii1.f5090a.get(str);
            if (vibrator2 == null || interfaceC7695Hi1 == null) {
                return;
            }
            interfaceC7695Hi1.mo3552a(vibrator2);
        }
    }
}
