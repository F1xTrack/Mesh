package com.reactnativemmkv;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = MmkvModule.NAME)
/* loaded from: classes2.dex */
public class MmkvModule extends ReactContextBaseJavaModule {
    public static final String NAME = "MMKV";

    public MmkvModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static native void nativeInstall(long j, String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install(String str) {
        try {
            System.loadLibrary("reactnativemmkv");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (str == null) {
                str = getReactApplicationContext().getFilesDir().getAbsolutePath() + "/mmkv";
            }
            nativeInstall(javaScriptContextHolder.get(), str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
