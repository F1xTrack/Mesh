package io.invertase.firebase.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11104t01;
import p000.C0786MU;
import p000.C10153lZ0;
import p000.C1686an;
import p000.C4057fV;
import p000.CO1;
import p000.EL0;
import p000.EN1;
import p000.FL0;
import p000.HL0;
import p000.LL0;
import p000.MD0;
import p000.RunnableC8352Tz0;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
    private static final String TAG = "App";
    public static Map<String, String> authDomains = new HashMap();

    public ReactNativeFirebaseAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    public static void configureAuthDomain(String str, String str2) {
        if (str2 != null) {
            authDomains.put(str, str2);
        } else {
            authDomains.remove(str);
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        C0786MU c0786muM5376e = C0786MU.m5376e(str);
        if (c0786muM5376e.f7179f.compareAndSet(false, true)) {
            synchronized (C0786MU.f7172k) {
                C0786MU.f7173l.remove(c0786muM5376e.f7175b);
            }
            Iterator it = c0786muM5376e.f7183j.iterator();
            while (it.hasNext()) {
                ((C1686an) it.next()).getClass();
                C10153lZ0.f37154c = null;
            }
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        FL0 fl0 = FL0.f3159g;
        synchronized (fl0.f3162c) {
            try {
                fl0.f3165f++;
                if (fl0.f3162c.containsKey(str)) {
                    fl0.f3162c.put(str, Integer.valueOf(((Integer) fl0.f3162c.get(str)).intValue() + 1));
                } else {
                    fl0.f3162c.put(str, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fl0.f3161b.post(new RunnableC8352Tz0(14, fl0));
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        FL0 fl0 = FL0.f3159g;
        fl0.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap.putInt("listeners", fl0.f3165f);
        writableMapCreateMap.putInt("queued", fl0.f3160a.size());
        synchronized (fl0.f3162c) {
            try {
                for (Map.Entry entry : fl0.f3162c.entrySet()) {
                    writableMapCreateMap2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        writableMapCreateMap.putMap("events", writableMapCreateMap2);
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        FL0 fl0 = FL0.f3159g;
        fl0.f3161b.post(new MD0(fl0, 11, bool));
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        FL0 fl0 = FL0.f3159g;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.merge(readableMap);
        fl0.m2580b(new EL0(str, writableMapCreateMap));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.merge(readableMap);
        promise.resolve(writableMapCreateMap2);
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        FL0 fl0 = FL0.f3159g;
        synchronized (fl0.f3162c) {
            try {
                if (fl0.f3162c.containsKey(str)) {
                    int iIntValue = ((Integer) fl0.f3162c.get(str)).intValue();
                    if (iIntValue <= 1 || bool.booleanValue()) {
                        fl0.f3162c.remove(str);
                    } else {
                        fl0.f3162c.put(str, Integer.valueOf(iIntValue - 1));
                    }
                    int i = fl0.f3165f;
                    if (!bool.booleanValue()) {
                        iIntValue = 1;
                    }
                    fl0.f3165f = i - iIntValue;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ArrayList arrayList;
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        getReactApplicationContext();
        synchronized (C0786MU.f7172k) {
            arrayList = new ArrayList(C0786MU.f7173l.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(EN1.m2200a((C0786MU) it.next()));
        }
        map.put("NATIVE_FIREBASE_APPS", arrayList2);
        HL0.f4233b.getClass();
        map.put("FIREBASE_RAW_JSON", "{\"crashlytics_auto_collection_enabled\":true,\"crashlytics_debug_enabled\":true,\"crashlytics_ndk_enabled\":true,\"crashlytics_is_error_generation_on_js_crash_enabled\":true,\"crashlytics_javascript_exception_handler_chaining_enabled\":true}");
        return map;
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        FL0 fl0 = FL0.f3159g;
        fl0.f3161b.post(new MD0(fl0, 12, getContext()));
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        ReactContext context = getContext();
        String string = readableMap2.getString("name");
        String strCheckNotEmpty = Preconditions.checkNotEmpty(readableMap.getString("apiKey"), "ApiKey must be set.");
        String strCheckNotEmpty2 = Preconditions.checkNotEmpty(readableMap.getString("appId"), "ApplicationId must be set.");
        String string2 = readableMap.getString("projectId");
        String string3 = readableMap.getString("databaseURL");
        String string4 = readableMap.hasKey("gaTrackingId") ? readableMap.getString("gaTrackingId") : null;
        String string5 = readableMap.getString("storageBucket");
        String string6 = readableMap.getString("messagingSenderId");
        C0786MU c0786muM5377h = string.equals("[DEFAULT]") ? C0786MU.m5377h(new C4057fV(strCheckNotEmpty2, strCheckNotEmpty, string3, string4, string6, string5, string2), context, "[DEFAULT]") : C0786MU.m5377h(new C4057fV(strCheckNotEmpty2, strCheckNotEmpty, string3, string4, string6, string5, string2), context, string);
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            c0786muM5377h.m5385l(Boolean.valueOf(readableMap2.getBoolean("automaticDataCollectionEnabled")));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            boolean z = readableMap2.getBoolean("automaticResourceManagement");
            c0786muM5377h.m5379a();
            if (c0786muM5377h.f7178e.compareAndSet(!z, z)) {
                boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
                if (z && zIsInBackground) {
                    c0786muM5377h.m5384k(true);
                } else if (!z && zIsInBackground) {
                    c0786muM5377h.m5384k(false);
                }
            }
        }
        configureAuthDomain(readableMap2.getString("name"), readableMap.getString("authDomain"));
        promise.resolve(Arguments.makeNativeMap(EN1.m2200a(c0786muM5377h)));
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) throws JSONException {
        HL0 hl0 = HL0.f4233b;
        hl0.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        JSONObject jSONObject = hl0.f4234a;
        JSONArray jSONArrayNames = jSONObject.names();
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            try {
                String string = jSONArrayNames.getString(i);
                AbstractC11104t01.m24820e(writableMapCreateMap, string, jSONObject.get(string));
            } catch (JSONException unused) {
            }
        }
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        ApplicationInfo applicationInfo;
        Bundle bundle = null;
        try {
            Context context = CO1.f1354a;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                if (str.startsWith("rnfirebase_")) {
                    Object obj = bundle.get(str);
                    if (obj == null) {
                        writableMapCreateMap.putNull(str);
                    } else if (obj instanceof String) {
                        writableMapCreateMap.putString(str, (String) obj);
                    } else if (obj instanceof Boolean) {
                        writableMapCreateMap.putBoolean(str, ((Boolean) obj).booleanValue());
                    }
                }
            }
        }
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        LL0.f6614b.m4957c().edit().clear().apply();
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        LL0 ll0 = LL0.f6614b;
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : ll0.m4957c().getAll().entrySet()) {
            AbstractC11104t01.m24820e(writableMapCreateMap, entry.getKey(), entry.getValue());
        }
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z, Promise promise) {
        LL0.f6614b.m4957c().edit().putBoolean(str, z).apply();
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        LL0.f6614b.m4957c().edit().putString(str, str2).apply();
        promise.resolve(null);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
        C0786MU.m5376e(str).m5385l(bool);
    }
}
