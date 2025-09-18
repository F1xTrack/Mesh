package io.appmetrica.analytics.reactnative;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = AppMetricaModule.NAME)
/* loaded from: classes2.dex */
public class AppMetricaModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AppMetrica";
    public static final String TAG = "AppMetricaModule";
    private final ReactApplicationContext reactContext;

    public AppMetricaModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void activate(ReadableMap readableMap) {
        AppMetricaConfig appMetricaConfig = Utils.toAppMetricaConfig(readableMap);
        AppMetrica.activate(this.reactContext, appMetricaConfig);
        if (Boolean.FALSE.equals(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            return;
        }
        AppMetrica.resumeSession(getCurrentActivity());
    }

    @ReactMethod
    public void getLibraryApiLevel(Promise promise) {
        promise.resolve(Integer.valueOf(AppMetrica.getLibraryApiLevel()));
    }

    @ReactMethod
    public void getLibraryVersion(Promise promise) {
        promise.resolve(AppMetrica.getLibraryVersion());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void pauseSession() {
        AppMetrica.pauseSession(getCurrentActivity());
    }

    @ReactMethod
    public void putErrorEnvironmentValue(String str, String str2) {
        AppMetrica.putErrorEnvironmentValue(str, str2);
    }

    @ReactMethod
    public void reportAdRevenue(ReadableMap readableMap) {
        AppMetrica.reportAdRevenue(Utils.toAdRevenue(readableMap));
    }

    @ReactMethod
    public void reportAppOpen(String str) {
        AppMetrica.reportAppOpen(str);
    }

    @ReactMethod
    public void reportECommerce(ReadableMap readableMap) {
        ECommerceEvent eCommerceEvent = Utils.toECommerceEvent(readableMap);
        if (eCommerceEvent != null) {
            AppMetrica.reportECommerce(eCommerceEvent);
        }
    }

    @ReactMethod
    public void reportError(String str, String str2) {
        try {
            Integer.valueOf("00xffWr0ng");
        } catch (Throwable th) {
            AppMetrica.reportError(str, str2, th);
        }
    }

    @ReactMethod
    public void reportEvent(String str, ReadableMap readableMap) {
        if (readableMap == null) {
            AppMetrica.reportEvent(str);
        } else {
            AppMetrica.reportEvent(str, readableMap.toHashMap());
        }
    }

    @ReactMethod
    public void reportExternalAttribution(ReadableMap readableMap) {
        ModulesFacade.reportExternalAttribution(ExternalAttributionSerializer.parseSource(readableMap.getString("source")), ExternalAttributionSerializer.parseValue(readableMap.getMap("value")));
    }

    @ReactMethod
    public void reportRevenue(ReadableMap readableMap) {
        AppMetrica.reportRevenue(Utils.toRevenue(readableMap));
    }

    @ReactMethod
    public void reportUserProfile(ReadableMap readableMap) {
        try {
            AppMetrica.reportUserProfile(Utils.toUserProfile(readableMap));
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void requestStartupParams(ReadableArray readableArray, Callback callback) {
        AppMetrica.requestStartupParams(this.reactContext, new ReactNativeStartupParamsListener(callback), Utils.toStartupKeyList(readableArray));
    }

    @ReactMethod
    public void resumeSession() {
        AppMetrica.resumeSession(getCurrentActivity());
    }

    @ReactMethod
    public void sendEventsBuffer() {
        AppMetrica.sendEventsBuffer();
    }

    @ReactMethod
    public void setDataSendingEnabled(boolean z) {
        AppMetrica.setDataSendingEnabled(z);
    }

    @ReactMethod
    public void setLocation(ReadableMap readableMap) {
        AppMetrica.setLocation(Utils.toLocation(readableMap));
    }

    @ReactMethod
    public void setLocationTracking(boolean z) {
        AppMetrica.setLocationTracking(z);
    }

    @ReactMethod
    public void setUserProfileID(String str) {
        AppMetrica.setUserProfileID(str);
    }
}
