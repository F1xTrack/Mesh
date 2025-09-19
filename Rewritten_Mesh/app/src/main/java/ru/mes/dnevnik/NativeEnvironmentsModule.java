package ru.mes.dnevnik;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;

public final class NativeEnvironmentsModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public NativeEnvironmentsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return MapsKt.mapOf(
                new Pair("RUSTORE_PUSH_PROJECT_ID", this.reactContext.getString(R.string.RustorePushProjectId)),
                new Pair("RUSTORE_REMOTE_CONFIG_APP_ID", this.reactContext.getString(R.string.RustoreRemoteConfigAppId)),
                new Pair("APPMETRICA_API_KEY", this.reactContext.getString(R.string.AppmetricaApiKey)),
                new Pair("APPMETRICA_APP_ID", this.reactContext.getString(R.string.AppmetricaAppId)),
                new Pair("MYTRACKER_SDK_KEY", this.reactContext.getString(R.string.MytrackerSdkKey))
        );
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Environments";
    }
}
