package com.remoteconfig;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import p000.AbstractC9313f02;
import p000.C10519oQ0;
import p000.C10647pQ0;
import p000.C11923zQ0;
import p000.C1210TE;
import p000.C1848cS;
import p000.C3927dQ;
import p000.C8313Tf1;
import p000.C8367Ug1;
import p000.C8419Vg1;
import p000.C8471Wg1;
import p000.C9189e20;
import p000.DQ0;
import p000.EnumC6738rM;
import p000.FQ0;
import p000.G31;
import p000.GQ0;
import p000.H30;
import p000.KL0;
import p000.O90;
import p000.Q81;
import p000.YZ1;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

@Metadata(m22266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\"\u0010 J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b#\u0010 J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\nH\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b(\u0010&J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-¨\u00060"}, m22267d2 = {"Lcom/remoteconfig/RemoteConfigModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "LTf1;", "createReactRemoteConfigListener", "()V", "Lcom/facebook/react/bridge/ReactContext;", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "sendEvent", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "getName", "()Ljava/lang/String;", "appId", "", "interval", "updateBehaviour", "Lcom/facebook/react/bridge/ReadableMap;", "createRemoteConfig", "(Ljava/lang/String;DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "init", "(Lcom/facebook/react/bridge/Promise;)V", "getRemoteConfig", "key", "getString", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getBoolean", "getNumber", "containsKey", "value", "setAccount", "(Ljava/lang/String;)V", "setLanguage", "addListener", "", "count", "removeListeners", "(I)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Companion", "FQ0", "react-native-rustore-remote-config_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RemoteConfigModule extends ReactContextBaseJavaModule {
    private static final FQ0 Companion = new FQ0();
    private static boolean isInitialized;
    private static RemoteConfig remoteConfig;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
    }

    private final void createReactRemoteConfigListener() {
        if (DQ0.f2012b != null) {
            return;
        }
        DQ0.f2012b = new GQ0(0, this);
    }

    public static final void getRemoteConfig$lambda$5(C9189e20 c9189e20, Promise promise, RemoteConfig remoteConfig2) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(remoteConfig2, "config");
        remoteConfig = remoteConfig2;
        promise.resolve(c9189e20.m17823d(remoteConfig2));
    }

    public static final void getRemoteConfig$lambda$6(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th);
    }

    public static final void init$lambda$3(Promise promise, C8313Tf1 c8313Tf1) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(c8313Tf1, "it");
        promise.resolve(Boolean.TRUE);
    }

    public static final void init$lambda$4(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "it");
        promise.reject(th);
    }

    public final void sendEvent(ReactContext reactContext, String eventName, WritableMap params) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    @ReactMethod
    public final void addListener(String eventName) {
        O90.m5968f(eventName, "eventName");
    }

    @ReactMethod
    public final void containsKey(String key, Promise promise) {
        O90.m5968f(key, "key");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        RemoteConfig remoteConfig2 = remoteConfig;
        promise.resolve(remoteConfig2 != null ? Boolean.valueOf(remoteConfig2.m24540a(key)) : null);
    }

    @ReactMethod
    public final void createRemoteConfig(String appId, double interval, String updateBehaviour, ReadableMap params) throws PackageManager.NameNotFoundException {
        YZ1 c8419Vg1;
        YZ1 yz1;
        O90.m5968f(appId, "appId");
        O90.m5968f(updateBehaviour, "updateBehaviour");
        O90.m5968f(params, "params");
        createReactRemoteConfigListener();
        if (isInitialized) {
            return;
        }
        int i = 0;
        PackageInfo packageInfo = this.reactContext.getPackageManager().getPackageInfo(this.reactContext.getPackageName(), 0);
        String string = params.getString("osVersion");
        if (string == null) {
            string = String.valueOf(Build.VERSION.SDK_INT);
        }
        String string2 = params.getString("deviceModel");
        if (string2 == null) {
            string2 = Build.MODEL;
        }
        String string3 = params.getString("deviceId");
        String string4 = params.getString(AttributionReporter.APP_VERSION);
        if (string4 == null) {
            string4 = packageInfo.versionName;
        }
        String string5 = params.getString("appBuild");
        if (string5 == null) {
            string5 = String.valueOf(packageInfo.versionCode);
        }
        int iHashCode = updateBehaviour.hashCode();
        if (iHashCode != -2032180703) {
            if (iHashCode != 1067500996) {
                if (iHashCode != 1925356942 || updateBehaviour.equals("ACTUAL")) {
                    yz1 = C8367Ug1.f11975a;
                }
            } else if (updateBehaviour.equals("SNAPSHOT")) {
                c8419Vg1 = new C8471Wg1(AbstractC9313f02.m18150c(interval, EnumC6738rM.f41612e));
                yz1 = c8419Vg1;
            }
            yz1 = C8367Ug1.f11975a;
        } else {
            if (updateBehaviour.equals("DEFAULT")) {
                c8419Vg1 = new C8419Vg1(AbstractC9313f02.m18150c(interval, EnumC6738rM.f41612e));
                yz1 = c8419Vg1;
            }
            yz1 = C8367Ug1.f11975a;
        }
        String string6 = params.getString("environment");
        if (string6 != null) {
            int iHashCode2 = string6.hashCode();
            if (iHashCode2 != 2035184) {
                if (iHashCode2 != 62372158) {
                    if (iHashCode2 == 1808577511 && string6.equals("RELEASE")) {
                        i = 3;
                    }
                } else if (string6.equals("ALPHA")) {
                    i = 1;
                }
            } else if (string6.equals("BETA")) {
                i = 2;
            }
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        C10647pQ0 c10647pQ0 = new C10647pQ0(reactApplicationContext, appId);
        C1210TE c1210te = new C1210TE(10);
        synchronized (C10647pQ0.f40061l) {
            c10647pQ0.f40070i = c1210te;
        }
        c10647pQ0.m23782h(new DQ0());
        c10647pQ0.m23783i(yz1);
        O90.m5968f(string, "value");
        c10647pQ0.m23781g(string);
        if (string2 == null) {
            string2 = null;
        }
        c10647pQ0.m23778d(string2);
        if (string3 == null) {
            string3 = null;
        }
        c10647pQ0.m23779e(string3);
        c10647pQ0.m23780f(i);
        if (string4 == null) {
            string4 = null;
        }
        c10647pQ0.m23777c(string4);
        O90.m5968f(string5, "value");
        c10647pQ0.m23776b(string5);
        c10647pQ0.m23775a();
        isInitialized = true;
    }

    @ReactMethod
    public final void getBoolean(String key, Promise promise) {
        O90.m5968f(key, "key");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        RemoteConfig remoteConfig2 = remoteConfig;
        promise.resolve(remoteConfig2 != null ? Boolean.valueOf(remoteConfig2.m24541b(key)) : null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RemoteConfig";
    }

    @ReactMethod
    public final void getNumber(String key, Promise promise) {
        O90.m5968f(key, "key");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        RemoteConfig remoteConfig2 = remoteConfig;
        promise.resolve(remoteConfig2 != null ? Double.valueOf(remoteConfig2.m24542c(key)) : null);
    }

    @ReactMethod
    public final void getRemoteConfig(Promise promise) throws C11923zQ0 {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        C3927dQ c3927dQ = C3927dQ.f26057c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = G31.f3555a;
        C9189e20 c9189e20 = new C9189e20(c3927dQ, new HashMap(map), new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, new ArrayList(linkedList));
        C1848cS c1848cS = C1848cS.f17479N;
        if (c1848cS == null) {
            throw new C11923zQ0();
        }
        Q81 q81Mo4072a = ((C10519oQ0) c1848cS.f17499g.getValue()).f38996a.mo4072a();
        q81Mo4072a.m6585b(new H30(c9189e20, 5, promise), null);
        q81Mo4072a.m6585b(null, new KL0(7, promise));
    }

    @ReactMethod
    public final void getString(String key, Promise promise) {
        O90.m5968f(key, "key");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        RemoteConfig remoteConfig2 = remoteConfig;
        promise.resolve(remoteConfig2 != null ? remoteConfig2.m24543d(key) : null);
    }

    @ReactMethod
    public final void init(Promise promise) throws C11923zQ0 {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        C1848cS c1848cS = C1848cS.f17479N;
        if (c1848cS == null) {
            throw new C11923zQ0();
        }
        Q81 q81Mo4073b = ((C10519oQ0) c1848cS.f17499g.getValue()).f38996a.mo4073b();
        q81Mo4073b.m6585b(new KL0(5, promise), null);
        q81Mo4073b.m6585b(null, new KL0(6, promise));
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void setAccount(String value) {
        O90.m5968f(value, "value");
        C1210TE.f11215j = value;
    }

    @ReactMethod
    public final void setLanguage(String value) {
        O90.m5968f(value, "value");
        C1210TE.f11216k = value;
    }
}
