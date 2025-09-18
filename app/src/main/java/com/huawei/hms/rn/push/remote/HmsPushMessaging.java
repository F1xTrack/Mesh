package com.huawei.hms.rn.push.remote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.rn.push.constants.ResultCode;
import com.huawei.hms.rn.push.logger.HMSLogger;
import com.huawei.hms.rn.push.utils.ActivityUtils;
import com.huawei.hms.rn.push.utils.BundleUtils;
import com.huawei.hms.rn.push.utils.MapUtils;
import com.huawei.hms.rn.push.utils.RemoteMessageUtils;
import com.huawei.hms.rn.push.utils.ResultUtils;
import defpackage.I30;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HmsPushMessaging extends ReactContextBaseJavaModule implements ActivityEventListener, LifecycleEventListener {
    private static volatile ReactApplicationContext context;
    private static Map<String, Object> initialNotification = new HashMap();
    private final String TAG;

    public HmsPushMessaging(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.TAG = "HmsPushMessaging";
        setContext(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public static ReactApplicationContext getContext() {
        return context;
    }

    public static Map<String, Object> getInitialNotification() {
        return initialNotification;
    }

    public static /* synthetic */ void lambda$subscribe$2(Promise promise, Task task) {
        if (task.g()) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("subscribe");
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        } else {
            HMSLogger.getInstance(getContext()).sendSingleEvent("subscribe", task.d().getMessage());
            ResultUtils.handleResult(false, task.d().getLocalizedMessage(), promise);
        }
    }

    public static /* synthetic */ void lambda$turnOffPush$1(Promise promise, Task task) {
        if (task.g()) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("turnOffPush");
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        } else {
            HMSLogger.getInstance(getContext()).sendSingleEvent("turnOffPush", task.d().getMessage());
            ResultUtils.handleResult(false, task.d().getLocalizedMessage(), promise);
        }
    }

    public static /* synthetic */ void lambda$turnOnPush$0(Promise promise, Task task) {
        if (task.g()) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("turnOnPush");
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        } else {
            HMSLogger.getInstance(getContext()).sendSingleEvent("turnOnPush", task.d().getMessage());
            ResultUtils.handleResult(false, task.d().getLocalizedMessage(), promise);
        }
    }

    public static /* synthetic */ void lambda$unsubscribe$3(Promise promise, Task task) {
        if (task.g()) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("unsubscribe");
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        } else {
            HMSLogger.getInstance(getContext()).sendSingleEvent("unsubscribe", task.d().getMessage());
            ResultUtils.handleResult(false, task.d().getLocalizedMessage(), promise);
        }
    }

    public static void setContext(ReactApplicationContext reactApplicationContext) {
        context = reactApplicationContext;
    }

    public static void setInitialNotification(Map<String, Object> map) {
        initialNotification = map;
    }

    public boolean checkFlag(Intent intent) {
        return intent.getFlags() == 805437440 || intent.getFlags() == 809631744 || intent.getBundleExtra("notification") != null;
    }

    @ReactMethod
    public void disableLogger(Promise promise) {
        HMSLogger.getInstance(getContext()).disableLogger();
        ResultUtils.handleResult(true, Boolean.TRUE, promise);
    }

    @ReactMethod
    public void enableLogger(Promise promise) {
        HMSLogger.getInstance(getContext()).enableLogger();
        ResultUtils.handleResult(true, Boolean.TRUE, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.TAG;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }

    @ReactMethod
    public void isAutoInitEnabled(Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("isAutoInitEnabled");
        try {
            boolean zIsAutoInitEnabled = HmsMessaging.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).isAutoInitEnabled();
            HMSLogger.getInstance(getContext()).sendSingleEvent("isAutoInitEnabled");
            ResultUtils.handleResult(true, Boolean.valueOf(zIsAutoInitEnabled), promise);
        } catch (Exception e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("isAutoInitEnabled", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity currentActivity = getContext().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Intent intent = currentActivity.getIntent();
        if (checkFlag(intent)) {
            sendOpenedNotificationData(intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        Activity currentActivity = context.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setIntent(intent);
        }
    }

    public void sendOpenedNotificationData(Intent intent) {
        try {
            HashMap map = new HashMap();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                map.put("remoteMessage", RemoteMessageUtils.toMap(new RemoteMessage(extras)));
                map.put("extras", BundleUtils.convertJSONObject(extras));
            }
            if (intent.getDataString() != null) {
                map.put("uriPage", intent.getDataString());
            }
            setInitialNotification(map);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.NOTIFICATION_OPENED_EVENT, MapUtils.copyToWritableMap(map));
            intent.setFlags(0);
            intent.replaceExtras(new Bundle());
            intent.setData(null);
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }

    @ReactMethod
    public void sendRemoteMessage(ReadableMap readableMap, Promise promise) {
        try {
            RemoteMessage remoteMessage = RemoteMessageUtils.toRemoteMessage(readableMap);
            HMSLogger.getInstance(getContext()).startMethodExecutionTimer("sendRemoteMessage");
            HmsMessaging.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).send(remoteMessage);
            HMSLogger.getInstance(getContext()).sendSingleEvent("sendRemoteMessage");
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        } catch (IllegalArgumentException unused) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("sendRemoteMessage");
            ResultUtils.handleResult(false, Boolean.FALSE, promise);
        }
    }

    @ReactMethod
    public void setAutoInitEnabled(boolean z, Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("setAutoInitEnabled");
        try {
            HmsMessaging.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).setAutoInitEnabled(z);
            HMSLogger.getInstance(getContext()).sendSingleEvent("setAutoInitEnabled");
            ResultUtils.handleResult(true, Boolean.valueOf(z), promise);
        } catch (Exception e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("setAutoInitEnabled", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void subscribe(String str, Promise promise) {
        if (str == null || str.equals("")) {
            ResultUtils.handleResult(false, "topic is empty!", promise, ResultCode.PARAMETER_IS_EMPTY);
            return;
        }
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("subscribe");
        try {
            HmsMessaging.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).subscribe(str).a(new I30(5, promise));
        } catch (Exception e) {
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void turnOffPush(Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("turnOffPush");
        try {
            HmsMessaging.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).turnOffPush().a(new I30(4, promise));
        } catch (Exception e) {
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void turnOnPush(Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("turnOnPush");
        try {
            HmsMessaging.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).turnOnPush().a(new I30(3, promise));
        } catch (Exception e) {
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void unsubscribe(String str, Promise promise) {
        if (str == null || str.equals("")) {
            ResultUtils.handleResult(false, "topic is empty!", promise, ResultCode.PARAMETER_IS_EMPTY);
            return;
        }
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("unsubscribe");
        try {
            HmsMessaging.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).unsubscribe(str).a(new I30(2, promise));
        } catch (Exception e) {
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        ResultUtils.handleResult(true, MapUtils.copyToWritableMap(getInitialNotification()), promise);
    }
}
