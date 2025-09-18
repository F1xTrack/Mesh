package ru.vvdev.yamap;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.runtime.i18n.I18nManagerFactory;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.MD0;
import p000.O90;
import p000.VI0;
import p000.WI0;

@Metadata(m22266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, m22267d2 = {"Lru/vvdev/yamap/RNYamapModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "", "getConstants", "()Ljava/util/Map;", "apiKey", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "init", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", CommonUrlParts.LOCALE, "Lcom/facebook/react/bridge/Callback;", "successCb", "errorCb", "setLocale", "(Ljava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "getLocale", "(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "resetLocale", "Companion", "WI0", "react-native-yamap_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RNYamapModule extends ReactContextBaseJavaModule {
    public static final WI0 Companion = new WI0();
    private static final String REACT_CLASS = "yamap";
    private static ReactApplicationContext context;

    public RNYamapModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        context = reactApplicationContext;
    }

    public static final void getLocale$lambda$2(Callback callback) {
        O90.m5968f(callback, "$successCb");
        String locale = I18nManagerFactory.getLocale();
        O90.m5967e(locale, "getLocale(...)");
        callback.invoke(locale);
    }

    public static final void init$lambda$0(String str, Promise promise) {
        O90.m5968f(promise, "$promise");
        try {
            O90.m5965c(str);
            MapKitFactory.setApiKey(str);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            MapKitFactory.initialize(context);
            MapKitFactory.getInstance().onStart();
            promise.resolve(null);
        } catch (Exception e) {
            if (th != null) {
                promise.reject(th);
            } else {
                promise.reject(e);
            }
        }
    }

    public static final void resetLocale$lambda$3(Callback callback) {
        O90.m5968f(callback, "$successCb");
        I18nManagerFactory.setLocale(null);
        callback.invoke(new Object[0]);
    }

    public static final void setLocale$lambda$1(String str, Callback callback) {
        O90.m5968f(callback, "$successCb");
        I18nManagerFactory.setLocale(str);
        callback.invoke(new Object[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @ReactMethod
    public final void getLocale(Callback successCb, Callback errorCb) {
        O90.m5968f(successCb, "successCb");
        UiThreadUtil.runOnUiThread(new Thread(new VI0(1, successCb)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public final void init(String apiKey, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        UiThreadUtil.runOnUiThread(new Thread(new MD0(apiKey, 5, promise)));
    }

    @ReactMethod
    public final void resetLocale(Callback successCb, Callback errorCb) {
        O90.m5968f(successCb, "successCb");
        UiThreadUtil.runOnUiThread(new Thread(new VI0(0, successCb)));
    }

    @ReactMethod
    public final void setLocale(String str, Callback successCb, Callback errorCb) {
        O90.m5968f(successCb, "successCb");
        UiThreadUtil.runOnUiThread(new Thread(new MD0(str, 6, successCb)));
    }
}
