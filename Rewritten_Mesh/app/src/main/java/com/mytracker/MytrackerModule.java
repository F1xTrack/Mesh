package com.mytracker;

import android.app.Application;
import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.p018my.tracker.MyTracker;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.MyTrackerParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.C8080Ot0;
import p000.InterfaceC9101dL0;
import p000.O90;

@InterfaceC9101dL0(name = MytrackerModule.NAME)
@Metadata(m22266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010\u001cJ!\u0010 \u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b \u0010\u0012J)\u0010!\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\nH\u0007¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020#H\u0007¢\u0006\u0004\b.\u0010&J\u0017\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020#H\u0007¢\u0006\u0004\b/\u0010&J\u0017\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020#H\u0007¢\u0006\u0004\b0\u0010&J\u0017\u00101\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b1\u0010,J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020#H\u0007¢\u0006\u0004\b3\u0010&J\u0017\u00104\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b4\u0010,J\u0017\u00107\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, m22267d2 = {"Lcom/mytracker/MytrackerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "SDK_KEY", "LTf1;", "initTracker", "(Ljava/lang/String;)V", "name", "trackEvent", "userId", "vkConnectId", "trackLoginEvent", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "attributes", "trackLoginEventWithParams", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "trackEventWithParams", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "USER_ID", "setCustomUserId", "trackInviteEvent", "()V", "trackInviteEventWithParams", "(Lcom/facebook/react/bridge/ReadableMap;)V", "flush", "trackRegistrationEvent", "trackRegistrationEventWithParams", "trackLevel", "", "level", "trackLevelWithLevel", "(I)V", "trackLevelWithLevelWithParams", "(ILcom/facebook/react/bridge/ReadableMap;)V", "", "enable", "trackLaunchEnable", "(Z)V", "seconds", "trackLaunchTimeout", "bufferingPeriod", "forcingPeriod", "autotrackPurchase", NotificationConstants.NUMBER, "trackLocation", "setDebugMode", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getInstanceId", "(Lcom/facebook/react/bridge/Promise;)V", "Landroid/app/Application;", "application", "Landroid/app/Application;", "Companion", "Ot0", "splicer97_react-native-mytracker_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MytrackerModule extends ReactContextBaseJavaModule {
    public static final C8080Ot0 Companion = new C8080Ot0();
    public static final String NAME = "MyTracker";
    private final Application application;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MytrackerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        Context applicationContext = reactApplicationContext.getApplicationContext();
        O90.m5966d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        this.application = (Application) applicationContext;
    }

    @ReactMethod
    public final void autotrackPurchase(boolean enable) {
        MyTrackerConfig trackerConfig = MyTracker.getTrackerConfig();
        O90.m5967e(trackerConfig, "getTrackerConfig(...)");
        trackerConfig.setAutotrackingPurchaseEnabled(enable);
    }

    @ReactMethod
    public final void bufferingPeriod(int seconds) {
        MyTrackerConfig trackerConfig = MyTracker.getTrackerConfig();
        O90.m5967e(trackerConfig, "getTrackerConfig(...)");
        trackerConfig.setBufferingPeriod(seconds);
    }

    @ReactMethod
    public final void flush() {
        MyTracker.flush();
    }

    @ReactMethod
    public final void forcingPeriod(int seconds) {
        MyTrackerConfig trackerConfig = MyTracker.getTrackerConfig();
        O90.m5967e(trackerConfig, "getTrackerConfig(...)");
        trackerConfig.setForcingPeriod(seconds);
    }

    @ReactMethod
    public final void getInstanceId(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        String instanceId = MyTracker.getInstanceId(getReactApplicationContext());
        O90.m5967e(instanceId, "getInstanceId(...)");
        promise.resolve(instanceId);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void initTracker(String SDK_KEY) {
        O90.m5968f(SDK_KEY, "SDK_KEY");
        MyTracker.initTracker(SDK_KEY, this.application);
    }

    @ReactMethod
    public final void setCustomUserId(String USER_ID) {
        MyTrackerParams trackerParams = MyTracker.getTrackerParams();
        O90.m5967e(trackerParams, "getTrackerParams(...)");
        trackerParams.setCustomUserId(USER_ID);
    }

    @ReactMethod
    public final void setDebugMode(boolean enable) {
        MyTracker.setDebugMode(enable);
    }

    @ReactMethod
    public final void trackEvent(String name) {
        O90.m5968f(name, "name");
        MyTracker.trackEvent(name);
    }

    @ReactMethod
    public final void trackEventWithParams(String name, ReadableMap attributes) {
        O90.m5968f(name, "name");
        O90.m5968f(attributes, "attributes");
        HashMap<String, Object> hashMap = attributes.toHashMap();
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                map.put(key, value);
            }
        }
        MyTracker.trackEvent(name, map);
    }

    @ReactMethod
    public final void trackInviteEvent() {
        MyTracker.trackInviteEvent();
    }

    @ReactMethod
    public final void trackInviteEventWithParams(ReadableMap attributes) {
        O90.m5968f(attributes, "attributes");
        HashMap<String, Object> hashMap = attributes.toHashMap();
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                map.put(key, value);
            }
            MyTracker.trackInviteEvent(map);
        }
    }

    @ReactMethod
    public final void trackLaunchEnable(boolean enable) {
        MyTrackerConfig trackerConfig = MyTracker.getTrackerConfig();
        O90.m5967e(trackerConfig, "getTrackerConfig(...)");
        trackerConfig.setTrackingLaunchEnabled(enable);
    }

    @ReactMethod
    public final void trackLaunchTimeout(int seconds) {
        MyTrackerConfig trackerConfig = MyTracker.getTrackerConfig();
        O90.m5967e(trackerConfig, "getTrackerConfig(...)");
        trackerConfig.setLaunchTimeout(seconds);
    }

    @ReactMethod
    public final void trackLevel() {
        MyTracker.trackLevelEvent();
    }

    @ReactMethod
    public final void trackLevelWithLevel(int level) {
        MyTracker.trackLevelEvent(level, null);
    }

    @ReactMethod
    public final void trackLevelWithLevelWithParams(int level, ReadableMap attributes) {
        O90.m5968f(attributes, "attributes");
        HashMap<String, Object> hashMap = attributes.toHashMap();
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                map.put(key, value);
            }
        }
        MyTracker.trackLevelEvent(level, map);
    }

    @ReactMethod
    public final void trackLocation(int number) {
        MyTrackerConfig trackerConfig = MyTracker.getTrackerConfig();
        O90.m5967e(trackerConfig, "getTrackerConfig(...)");
        if (number == 0) {
            trackerConfig.setTrackingLocationEnabled(false);
        }
        if (number == 1 || number == 2) {
            trackerConfig.setTrackingLocationEnabled(true);
        }
    }

    @ReactMethod
    public final void trackLoginEvent(String userId, String vkConnectId) {
        O90.m5968f(userId, "userId");
        MyTracker.trackLoginEvent(userId, vkConnectId);
    }

    @ReactMethod
    public final void trackLoginEventWithParams(String userId, String vkConnectId, ReadableMap attributes) {
        O90.m5968f(userId, "userId");
        O90.m5968f(attributes, "attributes");
        HashMap<String, Object> hashMap = attributes.toHashMap();
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                map.put(key, value);
            }
        }
        MyTracker.trackLoginEvent(userId, vkConnectId, map);
    }

    @ReactMethod
    public final void trackRegistrationEvent(String userId, String vkConnectId) {
        O90.m5968f(userId, "userId");
        MyTracker.trackRegistrationEvent(userId, vkConnectId);
    }

    @ReactMethod
    public final void trackRegistrationEventWithParams(String userId, String vkConnectId, ReadableMap attributes) {
        O90.m5968f(userId, "userId");
        O90.m5968f(attributes, "attributes");
        HashMap<String, Object> hashMap = attributes.toHashMap();
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                map.put(key, value);
            }
        }
        MyTracker.trackRegistrationEvent(userId, vkConnectId, map);
    }
}
