package ru.mes.dnevnik;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11077sn0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m22267d2 = {"Lru/mes/dnevnik/NativeEnvironmentsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "", "getName", "app_moscowRelease"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class NativeEnvironmentsModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeEnvironmentsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return AbstractC11077sn0.m24779g(new Pair("RUSTORE_PUSH_PROJECT_ID", this.reactContext.getString(R.string.RustorePushProjectId)), new Pair("RUSTORE_REMOTE_CONFIG_APP_ID", this.reactContext.getString(R.string.RustoreRemoteConfigAppId)), new Pair("APPMETRICA_API_KEY", this.reactContext.getString(R.string.AppmetricaApiKey)), new Pair("APPMETRICA_APP_ID", this.reactContext.getString(R.string.AppmetricaAppId)), new Pair("MYTRACKER_SDK_KEY", this.reactContext.getString(R.string.MytrackerSdkKey)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativeEnvironmentsModule";
    }
}
