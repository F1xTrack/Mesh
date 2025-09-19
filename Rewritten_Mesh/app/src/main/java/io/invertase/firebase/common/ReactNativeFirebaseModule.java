package io.invertase.firebase.common;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p000.AbstractC11104t01;
import p000.AbstractC1374Vq;
import p000.W81;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseModule extends ReactContextBaseJavaModule {
    private final W81 executorService;
    private String moduleName;

    public ReactNativeFirebaseModule(ReactApplicationContext reactApplicationContext, String str) {
        super(reactApplicationContext);
        this.moduleName = str;
        this.executorService = new W81(getName());
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2, ReadableMap readableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", str);
        writableMapCreateMap.putString("message", str2);
        if (readableMap != null) {
            writableMapCreateMap.putMap("resolver", readableMap);
        }
        promise.reject(str, str2, writableMapCreateMap);
    }

    public static void rejectPromiseWithExceptionMap(Promise promise, Exception exc) {
        promise.reject(exc, AbstractC11104t01.m24816a(exc));
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getApplicationContext() {
        return getReactApplicationContext().getApplicationContext();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    public ReactContext getContext() {
        return getReactApplicationContext();
    }

    public final ExecutorService getExecutor() {
        return this.executorService.m8685a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return AbstractC1374Vq.m8593l(new StringBuilder("RNFB"), this.moduleName, "Module");
    }

    public final ExecutorService getTransactionalExecutor() {
        return this.executorService.m8686b("", true);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.executorService.m8688e();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    @Deprecated
    public void onCatalystInstanceDestroy() {
        invalidate();
    }

    public final void removeEventListeningExecutor(String str) {
        String strM8687c = this.executorService.m8687c(str, true);
        this.executorService.getClass();
        W81.m8684d(strM8687c);
    }

    public final ExecutorService getTransactionalExecutor(String str) {
        W81 w81 = this.executorService;
        if (w81.f13010b == 0) {
            str = "";
        }
        return w81.m8686b(str, true);
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", str);
        writableMapCreateMap.putString("message", str2);
        promise.reject(str, str2, writableMapCreateMap);
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", str);
        writableMapCreateMap.putString("message", str2);
        writableMapCreateMap.putString("nativeErrorMessage", str3);
        promise.reject(str, str2, writableMapCreateMap);
    }
}
