package com.varioqub.reactnative;

import android.app.Activity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import com.yandex.varioqub.config.Varioqub;
import java.util.Iterator;
import p000.AbstractC10565on0;
import p000.C10909rT0;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = VarioqubModule.NAME)
/* loaded from: classes2.dex */
public class VarioqubModule extends ReactContextBaseJavaModule {
    private static final int FETCH_REQUEST_ERROR = 2;
    private static final int FETCH_REQUEST_SUCCESS = 0;
    private static final int FETCH_REQUEST_THROTTLED = 1;
    public static final String NAME = "Varioqub";
    public static final String TAG = "VarioqubReactNative";

    public VarioqubModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Activity getActivity() {
        return getCurrentActivity();
    }

    @ReactMethod
    public void activateConfig() {
        try {
            Varioqub.activateConfig(null);
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void clearClientFeatures() {
        try {
            Varioqub.clearClientFeatures();
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void fetchConfig(Callback callback) {
        try {
            Varioqub.fetchConfig(new C10909rT0(callback));
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void getAllKeys(Promise promise) {
        try {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<String> it = Varioqub.getAllKeys().iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushString(it.next());
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void getBoolean(String str, boolean z, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(Varioqub.getBoolean(str, z)));
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void getId(Promise promise) {
        try {
            promise.resolve(Varioqub.getId());
        } catch (Throwable unused) {
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getNumber(String str, double d, Promise promise) {
        try {
            promise.resolve(Double.valueOf(Varioqub.getDouble(str, d)));
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void getString(String str, String str2, Promise promise) {
        try {
            promise.resolve(Varioqub.getString(str, str2));
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void initVarioqubWithAppMetricaAdapter(ReadableMap readableMap) {
        try {
            Varioqub.init(AbstractC10565on0.m23557a(readableMap), new AppMetricaAdapter(getActivity()), getActivity());
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public void putClientFeature(String str, String str2) {
        try {
            Varioqub.putClientFeature(str, str2);
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public void setDefaults(ReadableMap readableMap, Promise promise) {
        try {
            Varioqub.setDefaults(readableMap.toHashMap());
            promise.resolve(Boolean.TRUE);
        } catch (Throwable unused) {
        }
    }
}
