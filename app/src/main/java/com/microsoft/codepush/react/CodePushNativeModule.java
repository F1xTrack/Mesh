package com.microsoft.codepush.react;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.push.AttributionReporter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC1374Vq;
import p000.AbstractC4019eu;
import p000.AbstractC8985cT1;
import p000.AsyncTaskC1440Wt;
import p000.AsyncTaskC1503Xt;
import p000.AsyncTaskC1566Yt;
import p000.AsyncTaskC1751au;
import p000.C1000Pt;
import p000.C1814bu;
import p000.C3894cu;
import p000.C3956du;
import p000.HZ0;
import p000.IJ0;
import p000.QK0;
import p000.RunnableC1251Tt;
import p000.RunnableC1483XZ;
import ru.mes.dnevnik.MainApplication;

/* loaded from: classes2.dex */
public class CodePushNativeModule extends ReactContextBaseJavaModule {
    private boolean _allowed;
    private boolean _restartInProgress;
    private ArrayList<Boolean> _restartQueue;
    private String mBinaryContentsHash;
    private String mClientUniqueId;
    private C1000Pt mCodePush;
    private LifecycleEventListener mLifecycleEventListener;
    private int mMinimumBackgroundDuration;
    private HZ0 mSettingsManager;
    private C1814bu mTelemetryManager;
    private C3956du mUpdateManager;

    public CodePushNativeModule(ReactApplicationContext reactApplicationContext, C1000Pt c1000Pt, C3956du c3956du, C1814bu c1814bu, HZ0 hz0) {
        String strM10710g;
        super(reactApplicationContext);
        this.mBinaryContentsHash = null;
        this.mClientUniqueId = null;
        this.mLifecycleEventListener = null;
        this.mMinimumBackgroundDuration = 0;
        this._allowed = true;
        this._restartInProgress = false;
        this._restartQueue = new ArrayList<>();
        this.mCodePush = c1000Pt;
        this.mSettingsManager = hz0;
        this.mTelemetryManager = c1814bu;
        this.mUpdateManager = c3956du;
        c1000Pt.getClass();
        String str = AbstractC4019eu.f26935a;
        try {
            try {
                strM10710g = AbstractC8985cT1.m10710g(reactApplicationContext.getAssets().open("CodePushHash"));
            } catch (IOException unused) {
                strM10710g = null;
            }
        } catch (IOException unused2) {
            strM10710g = AbstractC8985cT1.m10710g(reactApplicationContext.getAssets().open("CodePushHash.json"));
        }
        this.mBinaryContentsHash = strM10710g;
        SharedPreferences sharedPreferences = c1000Pt.f9335g.getSharedPreferences("CodePush", 0);
        String string = sharedPreferences.getString("clientUniqueId", null);
        this.mClientUniqueId = string;
        if (string == null) {
            this.mClientUniqueId = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("clientUniqueId", this.mClientUniqueId).apply();
        }
    }

    private void clearLifecycleEventListener() {
        if (this.mLifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mLifecycleEventListener);
            this.mLifecycleEventListener = null;
        }
    }

    private void loadBundle() {
        clearLifecycleEventListener();
        try {
            C1000Pt c1000Pt = this.mCodePush;
            resolveInstanceManager();
            c1000Pt.getClass();
        } catch (Exception unused) {
            this.mCodePush.getClass();
        }
        try {
            QK0 qk0ResolveInstanceManager = resolveInstanceManager();
            if (qk0ResolveInstanceManager == null) {
                return;
            }
            C1000Pt c1000Pt2 = this.mCodePush;
            setJSBundle(qk0ResolveInstanceManager, c1000Pt2.m6467d(c1000Pt2.f9330b));
            new Handler(Looper.getMainLooper()).post(new RunnableC1483XZ(this, qk0ResolveInstanceManager, false, 5));
        } catch (Exception e) {
            e.getMessage();
            loadBundleLegacy();
        }
    }

    public void loadBundleLegacy() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        this.mCodePush.getClass();
        C1000Pt.f9328m = null;
        currentActivity.runOnUiThread(new RunnableC1251Tt(currentActivity, 0));
    }

    private void resetReactRootViews(QK0 qk0) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = qk0.getClass().getDeclaredField("mAttachedRootViews");
        declaredField.setAccessible(true);
        List<ReactRootView> list = (List) declaredField.get(qk0);
        for (ReactRootView reactRootView : list) {
            reactRootView.removeAllViews();
            reactRootView.setId(-1);
        }
        declaredField.set(qk0, list);
    }

    private QK0 resolveInstanceManager() throws IllegalAccessException, NoSuchFieldException {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return ((MainApplication) ((IJ0) currentActivity.getApplication())).f41951a.m6302a();
    }

    public void restartAppInternal(boolean z) {
        if (this._restartInProgress) {
            this._restartQueue.add(Boolean.valueOf(z));
            return;
        }
        if (!this._allowed) {
            this._restartQueue.add(Boolean.valueOf(z));
            return;
        }
        this._restartInProgress = true;
        if (!z || this.mSettingsManager.m3501c(null)) {
            loadBundle();
            return;
        }
        this._restartInProgress = false;
        if (this._restartQueue.size() > 0) {
            boolean zBooleanValue = this._restartQueue.get(0).booleanValue();
            this._restartQueue.remove(0);
            restartAppInternal(zBooleanValue);
        }
    }

    private void setJSBundle(QK0 qk0, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            JSBundleLoader jSBundleLoaderCreateAssetLoader = str.toLowerCase().startsWith("assets://") ? JSBundleLoader.createAssetLoader(getReactApplicationContext(), str, false) : JSBundleLoader.createFileLoader(str);
            Field declaredField = qk0.getClass().getDeclaredField("mBundleLoader");
            declaredField.setAccessible(true);
            declaredField.set(qk0, jSBundleLoaderCreateAssetLoader);
        } catch (Exception unused) {
            throw new IllegalAccessException("Could not setJSBundle");
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void allow(Promise promise) {
        this._allowed = true;
        if (this._restartQueue.size() > 0) {
            boolean zBooleanValue = this._restartQueue.get(0).booleanValue();
            this._restartQueue.remove(0);
            restartAppInternal(zBooleanValue);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void clearPendingRestart(Promise promise) {
        this._restartQueue.clear();
        promise.resolve(null);
    }

    @ReactMethod
    public void clearUpdates() {
        this.mCodePush.m6464a();
    }

    @ReactMethod
    public void disallow(Promise promise) {
        this._allowed = false;
        promise.resolve(null);
    }

    @ReactMethod
    public void downloadAndReplaceCurrentBundle(String str) {
    }

    @ReactMethod
    public void downloadUpdate(ReadableMap readableMap, boolean z, Promise promise) {
        new AsyncTaskC1440Wt(this, readableMap, z, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getConfiguration(Promise promise) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            this.mCodePush.getClass();
            writableMapCreateMap.putString(AttributionReporter.APP_VERSION, C1000Pt.f9325j);
            writableMapCreateMap.putString("clientUniqueId", this.mClientUniqueId);
            writableMapCreateMap.putString("deploymentKey", this.mCodePush.f9334f);
            this.mCodePush.getClass();
            writableMapCreateMap.putString("serverUrl", C1000Pt.f9326k);
            String str = this.mBinaryContentsHash;
            if (str != null) {
                writableMapCreateMap.putString("packageHash", str);
            }
            promise.resolve(writableMapCreateMap);
        } catch (C3894cu e) {
            promise.reject(e);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        AbstractC1374Vq.m8595n(0, map, "codePushInstallModeImmediate", 1, "codePushInstallModeOnNextRestart");
        AbstractC1374Vq.m8595n(2, map, "codePushInstallModeOnNextResume", 3, "codePushInstallModeOnNextSuspend");
        AbstractC1374Vq.m8595n(0, map, "codePushUpdateStateRunning", 1, "codePushUpdateStatePending");
        map.put("codePushUpdateStateLatest", 2);
        return map;
    }

    @ReactMethod
    public void getLatestRollbackInfo(Promise promise) {
        JSONObject jSONObject;
        try {
            String string = this.mSettingsManager.f4351a.getString("LATEST_ROLLBACK_INFO", null);
            if (string == null) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                promise.resolve(AbstractC8985cT1.m10706c(jSONObject));
            } else {
                promise.resolve(null);
            }
        } catch (C3894cu e) {
            promise.reject(e);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CodePush";
    }

    @ReactMethod
    public void getNewStatusReport(Promise promise) {
        new AsyncTaskC1566Yt(this, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getUpdateMetadata(int i, Promise promise) {
        new AsyncTaskC1503Xt(this, promise, i).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void installUpdate(ReadableMap readableMap, int i, int i2, Promise promise) {
        new AsyncTaskC1751au(this, readableMap, i, i2, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void isFailedUpdate(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.mSettingsManager.m3500b(str)));
        } catch (C3894cu e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void isFirstRun(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.mCodePush.f9329a && str != null && str.length() > 0 && str.equals(this.mUpdateManager.m17772d().optString("currentPackage", null))));
        } catch (C3894cu e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void notifyApplicationReady(Promise promise) {
        try {
            this.mSettingsManager.f4351a.edit().remove("CODE_PUSH_PENDING_UPDATE").commit();
            promise.resolve("");
        } catch (C3894cu e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void recordStatusReported(ReadableMap readableMap) {
        try {
            this.mTelemetryManager.m10542e(readableMap);
        } catch (C3894cu unused) {
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void restartApp(boolean z, Promise promise) {
        try {
            restartAppInternal(z);
            promise.resolve(null);
        } catch (C3894cu e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void saveStatusReportForRetry(ReadableMap readableMap) {
        try {
            C1814bu c1814bu = this.mTelemetryManager;
            c1814bu.getClass();
            c1814bu.f17214a.edit().putString("CODE_PUSH_RETRY_DEPLOYMENT_REPORT", AbstractC8985cT1.m10708e(readableMap).toString()).commit();
        } catch (C3894cu unused) {
        }
    }

    @ReactMethod
    public void setLatestRollbackInfo(String str, Promise promise) {
        try {
            this.mSettingsManager.m3504f(str);
            promise.resolve(null);
        } catch (C3894cu e) {
            promise.reject(e);
        }
    }
}
