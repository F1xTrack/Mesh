package com.rustorepush;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Metadata;
import p000.AbstractC1036QS;
import p000.AbstractC8869bZ1;
import p000.C0910OS;
import p000.C0973PS;
import p000.C10115lG0;
import p000.C10655pU0;
import p000.C11905zH0;
import p000.C4049fN;
import p000.C7821Jt1;
import p000.C7978Mu0;
import p000.C8313Tf1;
import p000.C8730aU0;
import p000.H30;
import p000.K81;
import p000.KL0;
import p000.NQ0;
import p000.O90;
import p000.Q81;
import p000.T71;
import p000.TT0;

@Metadata(m22266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J)\u0010*\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, m22267d2 = {"Lcom/rustorepush/RustorePushModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "getInitialNotification", "(Lcom/facebook/react/bridge/Promise;)V", "checkPushAvailability", "getToken", "deleteToken", "topic", "subscribeToTopic", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "unsubscribeFromTopic", "createPushEmitter", "()V", "deletePushEmitter", "offNativeErrorHandling", "Lcom/facebook/react/bridge/ReadableMap;", "params", "sendTestNotification", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(I)V", "", "throwable", "handleNativeError", "(Ljava/lang/Throwable;)V", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/bridge/WritableMap;", "sendEvent", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "getMessageIdFromIntent", "(Landroid/content/Intent;)Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/bridge/ActivityEventListener;", "activityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "Companion", "pU0", "react-native-rustore-push_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RustorePushModule extends ReactContextBaseJavaModule {
    public static final C10655pU0 Companion = new C10655pU0();
    private static final String MESSAGE_ID = "vkpns.analytics_payload.message_id";
    private static final String TAG = "RustorePushModule";
    private static boolean allowNativeErrorHandling = true;
    private final ActivityEventListener activityEventListener;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RustorePushModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
        this.activityEventListener = new C11905zH0(this, 3);
    }

    public static final void checkPushAvailability$lambda$0(Promise promise, RustorePushModule rustorePushModule, AbstractC1036QS abstractC1036QS) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(rustorePushModule, "this$0");
        O90.m5968f(abstractC1036QS, "result");
        if (abstractC1036QS instanceof C0910OS) {
            promise.resolve(Boolean.TRUE);
        } else if (abstractC1036QS instanceof C0973PS) {
            TT0 tt0 = ((C0973PS) abstractC1036QS).f9074a;
            rustorePushModule.handleNativeError(tt0);
            promise.resolve(tt0.getMessage());
        }
    }

    public static final void checkPushAvailability$lambda$1(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th);
    }

    public static final void deleteToken$lambda$4(Promise promise, C8313Tf1 c8313Tf1) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(c8313Tf1, "it");
        promise.resolve(Boolean.TRUE);
    }

    public static final void deleteToken$lambda$5(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th);
    }

    public final String getMessageIdFromIntent(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return extras.getString(MESSAGE_ID);
    }

    public static final void getToken$lambda$2(Promise promise, String str) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(str, "token");
        promise.resolve(str);
    }

    public static final void getToken$lambda$3(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: FJ.<init>(nZ, zq1, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003c  */
    /* JADX WARN: Type inference failed for: r1v4, types: [GJ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void handleNativeError(java.lang.Throwable r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rustorepush.RustorePushModule.handleNativeError(java.lang.Throwable):void");
    }

    public final void sendEvent(ReactContext reactContext, String eventName, WritableMap params) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    public static final void sendTestNotification$lambda$10(Promise promise, C8313Tf1 c8313Tf1) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(c8313Tf1, "it");
        promise.resolve(Boolean.TRUE);
    }

    public static final void sendTestNotification$lambda$11(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th);
    }

    public static final void subscribeToTopic$lambda$6(Promise promise, C8313Tf1 c8313Tf1) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(c8313Tf1, "it");
        promise.resolve(Boolean.TRUE);
    }

    public static final void subscribeToTopic$lambda$7(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th);
    }

    public static final void unsubscribeFromTopic$lambda$8(Promise promise, C8313Tf1 c8313Tf1) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(c8313Tf1, "it");
        promise.resolve(Boolean.TRUE);
    }

    public static final void unsubscribeFromTopic$lambda$9(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th);
    }

    @ReactMethod
    public final void addListener(String eventName) {
        O90.m5968f(eventName, "eventName");
    }

    @ReactMethod
    public final void checkPushAvailability(Promise promise) {
        Q81 q81;
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (!C4049fN.f27161f) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        Q81 q812 = new Q81();
        K81 k81 = new K81(q812);
        if (C7821Jt1.f5775v != null) {
            C7821Jt1 c7821Jt1 = C7821Jt1.f5775v;
            if (c7821Jt1 == null) {
                throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
            }
            q81 = c7821Jt1.mo369a();
        } else {
            C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            q81 = new Q81();
            c10115lG0.invoke(new K81(q81));
        }
        C8730aU0 c8730aU0 = new C8730aU0(k81);
        q81.getClass();
        q81.m6585b(c8730aU0, null);
        q81.m6585b(null, new C8730aU0(k81));
        q812.m6585b(new H30(promise, 8, this), null);
        q812.m6585b(null, new KL0(16, promise));
    }

    @ReactMethod
    public final void createPushEmitter() {
        this.reactContext.addActivityEventListener(this.activityEventListener);
        LinkedHashMap linkedHashMap = RustorePushService.f20245l;
        RustorePushService.f20246m = new C7978Mu0(29, this);
    }

    @ReactMethod
    public final void deletePushEmitter() {
        LinkedHashMap linkedHashMap = RustorePushService.f20245l;
        RustorePushService.f20246m = null;
        this.reactContext.removeActivityEventListener(this.activityEventListener);
    }

    @ReactMethod
    public final void deleteToken(Promise promise) {
        Q81 q81;
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (!C4049fN.f27161f) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        if (C7821Jt1.f5775v != null) {
            C7821Jt1 c7821Jt1 = C7821Jt1.f5775v;
            if (c7821Jt1 == null) {
                throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
            }
            q81 = c7821Jt1.deleteToken();
        } else {
            C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            q81 = new Q81();
            c10115lG0.invoke(new K81(q81));
        }
        q81.m6585b(new KL0(14, promise), null);
        q81.m6585b(null, new KL0(15, promise));
    }

    @ReactMethod
    public final void getInitialNotification(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Activity currentActivity = this.reactContext.getCurrentActivity();
        NQ0 nq0 = (NQ0) RustorePushService.f20245l.get(getMessageIdFromIntent(currentActivity != null ? currentActivity.getIntent() : null));
        Objects.toString(nq0);
        promise.resolve(nq0 != null ? AbstractC8869bZ1.m10459a(nq0) : null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RustorePush";
    }

    @ReactMethod
    public final void getToken(Promise promise) {
        Q81 q81;
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (!C4049fN.f27161f) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        if (C7821Jt1.f5775v != null) {
            C7821Jt1 c7821Jt1 = C7821Jt1.f5775v;
            if (c7821Jt1 == null) {
                throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
            }
            q81 = c7821Jt1.getToken();
        } else {
            C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            q81 = new Q81();
            c10115lG0.invoke(new K81(q81));
        }
        q81.m6585b(new KL0(8, promise), null);
        q81.m6585b(null, new KL0(11, promise));
    }

    @ReactMethod
    public final void offNativeErrorHandling() {
        allowNativeErrorHandling = false;
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void sendTestNotification(ReadableMap params, Promise promise) {
        O90.m5968f(params, "params");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        String string = params.getString("title");
        if (string == null) {
            string = "";
        }
        String string2 = params.getString("body");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = params.getString("imageUrl");
        String str = string3 != null ? string3 : "";
        ReadableMap map = params.getMap("data");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (readableMapKeySetIteratorKeySetIterator != null) {
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                String string4 = map.getString(strNextKey);
                O90.m5965c(string4);
                linkedHashMap.put(strNextKey, string4);
            }
        }
        if (!C4049fN.f27161f) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        Q81 q81Mo370a = C7821Jt1.f5774u.mo370a(new T71(string, string2, str, linkedHashMap));
        KL0 kl0 = new KL0(9, promise);
        q81Mo370a.getClass();
        q81Mo370a.m6585b(kl0, null);
        q81Mo370a.m6585b(null, new KL0(10, promise));
    }

    @ReactMethod
    public final void subscribeToTopic(String topic, Promise promise) {
        Q81 q81;
        O90.m5968f(topic, "topic");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (!C4049fN.f27161f) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        if (C7821Jt1.f5775v != null) {
            C7821Jt1 c7821Jt1 = C7821Jt1.f5775v;
            if (c7821Jt1 == null) {
                throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
            }
            q81 = c7821Jt1.subscribeToTopic(topic);
        } else {
            C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            q81 = new Q81();
            c10115lG0.invoke(new K81(q81));
        }
        KL0 kl0 = new KL0(17, promise);
        q81.getClass();
        q81.m6585b(kl0, null);
        q81.m6585b(null, new KL0(18, promise));
    }

    @ReactMethod
    public final void unsubscribeFromTopic(String topic, Promise promise) {
        Q81 q81;
        O90.m5968f(topic, "topic");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (!C4049fN.f27161f) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        if (C7821Jt1.f5775v != null) {
            C7821Jt1 c7821Jt1 = C7821Jt1.f5775v;
            if (c7821Jt1 == null) {
                throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
            }
            q81 = c7821Jt1.unsubscribeFromTopic(topic);
        } else {
            C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            q81 = new Q81();
            c10115lG0.invoke(new K81(q81));
        }
        KL0 kl0 = new KL0(12, promise);
        q81.getClass();
        q81.m6585b(kl0, null);
        q81.m6585b(null, new KL0(13, promise));
    }
}
