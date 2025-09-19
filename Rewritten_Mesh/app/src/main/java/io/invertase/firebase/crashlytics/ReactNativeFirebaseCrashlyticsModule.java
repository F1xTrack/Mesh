package io.invertase.firebase.crashlytics;

import android.os.Handler;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.Objects;
import p000.C0226Da;
import p000.DL0;
import p000.I30;
import p000.LL0;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseCrashlyticsModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Crashlytics";

    public ReactNativeFirebaseCrashlyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    public static /* synthetic */ void lambda$checkForUnsentReports$0(Promise promise, Task task) {
        if (!task.mo11144k()) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", task.mo11141h() != null ? task.mo11141h().getMessage() : "checkForUnsentReports() request error");
        } else if (task.mo11142i() != null) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", "Unknown result of check for unsent reports");
        }
    }

    private Exception recordJavaScriptError(ReadableMap readableMap) {
        String string = readableMap.getString("message");
        ReadableArray array = readableMap.getArray("frames");
        Objects.requireNonNull(array);
        ReadableArray readableArray = array;
        C0226Da c0226Da = readableMap.getBoolean("isUnhandledRejection") ? new C0226Da(string, 13) : new C0226Da(string, 11);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            Objects.requireNonNull(map);
            ReadableMap readableMap2 = map;
            stackTraceElementArr[i] = new StackTraceElement("", readableMap2.getString("fn"), readableMap2.getString("file"), -1);
        }
        c0226Da.setStackTrace(stackTraceElementArr);
        FirebaseCrashlytics.getInstance().recordException(c0226Da);
        return c0226Da;
    }

    @ReactMethod
    public void checkForUnsentReports(Promise promise) {
        FirebaseCrashlytics.getInstance().checkForUnsentReports().mo11135b(new I30(19, promise));
    }

    @ReactMethod
    public void crash() {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            new Handler().postDelayed(new DL0(0), 50L);
        }
    }

    @ReactMethod
    public void crashWithStackPromise(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            recordJavaScriptError(readableMap).printStackTrace(System.err);
            System.exit(0);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void deleteUnsentReports() {
        FirebaseCrashlytics.getInstance().deleteUnsentReports();
    }

    @ReactMethod
    public void didCrashOnPreviousExecution(Promise promise) {
        promise.resolve(Boolean.valueOf(FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution()));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0040  */
    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> getConstants() {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsInitProvider.m21331a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "isCrashlyticsCollectionEnabled"
            r0.put(r2, r1)
            HL0 r1 = p000.HL0.f4233b
            LL0 r2 = p000.LL0.f6614b
            android.content.SharedPreferences r3 = r2.m4957c()
            java.lang.String r4 = "crashlytics_is_error_generation_on_js_crash_enabled"
            boolean r3 = r3.contains(r4)
            r5 = 0
            r6 = 1
            r7 = 128(0x80, float:1.8E-43)
            r8 = 0
            if (r3 == 0) goto L30
            android.content.SharedPreferences r1 = r2.m4957c()
            boolean r1 = r1.getBoolean(r4, r6)
            goto L66
        L30:
            org.json.JSONObject r3 = r1.f4234a
            if (r3 != 0) goto L36
            r3 = r5
            goto L3a
        L36:
            boolean r3 = r3.has(r4)
        L3a:
            if (r3 == 0) goto L47
            org.json.JSONObject r1 = r1.f4234a
            if (r1 != 0) goto L42
        L40:
            r1 = r6
            goto L66
        L42:
            boolean r1 = r1.optBoolean(r4, r6)
            goto L66
        L47:
            android.content.Context r1 = p000.CO1.f1354a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            if (r3 != 0) goto L51
        L4f:
            r1 = r8
            goto L5d
        L51:
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo(r1, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            if (r1 == 0) goto L4f
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
        L5d:
            if (r1 != 0) goto L60
            goto L40
        L60:
            java.lang.String r3 = "rnfirebase_crashlytics_is_error_generation_on_js_crash_enabled"
            boolean r1 = r1.getBoolean(r3, r6)
        L66:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "isErrorGenerationOnJSCrashEnabled"
            r0.put(r3, r1)
            HL0 r1 = p000.HL0.f4233b
            android.content.SharedPreferences r3 = r2.m4957c()
            java.lang.String r4 = "crashlytics_javascript_exception_handler_chaining_enabled"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L86
            android.content.SharedPreferences r1 = r2.m4957c()
            boolean r1 = r1.getBoolean(r4, r6)
            goto Lbb
        L86:
            org.json.JSONObject r2 = r1.f4234a
            if (r2 != 0) goto L8b
            goto L8f
        L8b:
            boolean r5 = r2.has(r4)
        L8f:
            if (r5 == 0) goto L9c
            org.json.JSONObject r1 = r1.f4234a
            if (r1 != 0) goto L96
            goto L9a
        L96:
            boolean r6 = r1.optBoolean(r4, r6)
        L9a:
            r1 = r6
            goto Lbb
        L9c:
            android.content.Context r1 = p000.CO1.f1354a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r2 != 0) goto La5
            goto Lb1
        La5:
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r1 == 0) goto Lb1
            android.os.Bundle r8 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
        Lb1:
            if (r8 != 0) goto Lb4
            goto L9a
        Lb4:
            java.lang.String r1 = "rnfirebase_crashlytics_javascript_exception_handler_chaining_enabled"
            boolean r6 = r8.getBoolean(r1, r6)
            goto L9a
        Lbb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled"
            r0.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsModule.getConstants():java.util.Map");
    }

    @ReactMethod
    public void log(String str) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
    }

    @ReactMethod
    public void logPromise(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void recordError(ReadableMap readableMap) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            recordJavaScriptError(readableMap);
        }
    }

    @ReactMethod
    public void recordErrorPromise(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            recordJavaScriptError(readableMap);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void sendUnsentReports() {
        FirebaseCrashlytics.getInstance().sendUnsentReports();
    }

    @ReactMethod
    public void setAttribute(String str, String str2, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            FirebaseCrashlytics.getInstance().setCustomKey(str, str2);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setAttributes(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                firebaseCrashlytics.setCustomKey(strNextKey, readableMap.getString(strNextKey));
            }
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setCrashlyticsCollectionEnabled(Boolean bool, Promise promise) {
        LL0 ll0 = LL0.f6614b;
        ll0.m4957c().edit().putBoolean("crashlytics_auto_collection_enabled", bool.booleanValue()).apply();
        promise.resolve(null);
    }

    @ReactMethod
    public void setUserId(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m21331a()) {
            FirebaseCrashlytics.getInstance().setUserId(str);
        }
        promise.resolve(null);
    }
}
