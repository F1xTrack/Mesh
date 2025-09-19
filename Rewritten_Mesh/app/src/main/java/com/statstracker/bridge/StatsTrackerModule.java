package com.statstracker.bridge;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.provider.Settings;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.statstracker.data.MessageDatabase;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;
import p000.AbstractC10106lB1;
import p000.C9551gs0;
import p000.O90;
import p000.WQ1;

@Metadata(m22266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m22267d2 = {"Lcom/statstracker/bridge/StatsTrackerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "ssoId", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "provide", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "jsonObjectForSending", "logEvent", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lgs0;", "mobileCounter", "Lgs0;", "currentSsoId", "Ljava/lang/String;", "diary-utils_react-native-stats-tracker_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class StatsTrackerModule extends ReactContextBaseJavaModule {
    private String currentSsoId;
    private final C9551gs0 mobileCounter;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsTrackerModule(ReactApplicationContext reactApplicationContext) {
        String string;
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
        C9551gs0 c9551gs0 = new C9551gs0();
        this.mobileCounter = c9551gs0;
        this.currentSsoId = "";
        ApplicationInfo applicationInfo = reactApplicationContext.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = reactApplicationContext.getString(i);
            O90.m5967e(string, "getString(...)");
        }
        AbstractC10106lB1.f36953i = string;
        String string2 = Settings.Secure.getString(reactApplicationContext.getContentResolver(), "android_id");
        O90.m5967e(string2, "getString(...)");
        AbstractC10106lB1.f36952h = string2;
        c9551gs0.f28070a = ((MessageDatabase) WQ1.m8759a(reactApplicationContext, "Message_database", MessageDatabase.class).m23151b()).mo13691p();
        SharedPreferences sharedPreferences = reactApplicationContext.getSharedPreferences("SavedData", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i2 = sharedPreferences.getInt("Counter", 0) + 1;
        AbstractC10106lB1.f36954j = i2;
        editorEdit.putInt("Counter", i2).apply();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "StatsTracker";
    }

    @ReactMethod
    public final void logEvent(ReadableMap jsonObjectForSending, Promise promise) {
        O90.m5968f(jsonObjectForSending, "jsonObjectForSending");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            HashMap<String, Object> hashMap = jsonObjectForSending.toHashMap();
            O90.m5966d(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            this.mobileCounter.m18670b(new JSONObject(hashMap), this.currentSsoId);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject("ERROR", e);
        }
    }

    @ReactMethod
    public final void provide(String ssoId, Promise promise) {
        O90.m5968f(ssoId, "ssoId");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            this.currentSsoId = ssoId;
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject("ERROR", e);
        }
    }
}
