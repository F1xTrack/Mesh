package io.invertase.firebase.config;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import p000.AbstractC9376fU1;
import p000.C0267EE;
import p000.C0437Gw;
import p000.C0500Hw;
import p000.C0786MU;
import p000.C10910rT1;
import p000.C1415WU;
import p000.C4224i9;
import p000.C6556oV;
import p000.C6621pV;
import p000.C6827sV;
import p000.C6890tV;
import p000.C7005vK;
import p000.C7142xV;
import p000.C8883bg1;
import p000.C9450g32;
import p000.CL0;
import p000.CallableC0298Ej;
import p000.CallableC6493nV;
import p000.CallableC7043vw;
import p000.CallableC8625Zf1;
import p000.InterfaceC7079wV;
import p000.RunnableC8176Qp0;
import p000.S81;
import p000.W81;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseConfigModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Config";
    private static HashMap<String, C0437Gw> mConfigUpdateRegistrations = new HashMap<>();
    private final C8883bg1 module;

    public ReactNativeFirebaseConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new C8883bg1(reactApplicationContext, SERVICE_NAME);
    }

    public /* synthetic */ void lambda$activate$0(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(task.mo11142i()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public /* synthetic */ void lambda$ensureInitialized$7(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(null));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public /* synthetic */ void lambda$fetch$1(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(task.mo11142i()));
        } else {
            rejectPromiseWithConfigException(promise, task.mo11141h());
        }
    }

    public /* synthetic */ void lambda$fetchAndActivate$2(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(task.mo11142i()));
        } else {
            rejectPromiseWithConfigException(promise, task.mo11141h());
        }
    }

    public /* synthetic */ void lambda$reset$3(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(task.mo11142i()));
        } else {
            rejectPromiseWithConfigException(promise, task.mo11141h());
        }
    }

    public /* synthetic */ void lambda$setConfigSettings$4(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(task.mo11142i()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public /* synthetic */ void lambda$setCustomSignals$8(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(task.mo11142i()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public /* synthetic */ void lambda$setDefaults$5(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(task.mo11142i()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public /* synthetic */ void lambda$setDefaultsFromResource$6(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(resultWithConstants(task.mo11142i()));
            return;
        }
        Exception excMo11141h = task.mo11141h();
        if (excMo11141h != null && excMo11141h.getMessage().equals("resource_not_found")) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "resource_not_found", "The specified resource name was not found.");
        }
        ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
    }

    private void rejectPromiseWithConfigException(Promise promise, Exception exc) {
        if (exc == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", "Operation cannot be completed successfully, due to an unknown error.");
        } else if (exc.getCause() instanceof C6827sV) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "throttled", "fetch() operation cannot be completed successfully, due to throttling.", exc.getMessage());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "failure", "fetch() operation cannot be completed successfully.", exc.getMessage());
        }
    }

    private WritableMap resultWithConstants(Object obj) {
        HashMap map = new HashMap(2);
        map.put("result", obj);
        this.module.getClass();
        HashMap map2 = new HashMap();
        C6890tV c6890tVM23807c = C6621pV.m23803d(C0786MU.m5376e("[DEFAULT]")).m23807c();
        HashMap mapM23806b = C6621pV.m23803d(C0786MU.m5376e("[DEFAULT]")).m23806b();
        HashMap map3 = new HashMap(mapM23806b.size());
        for (Map.Entry entry : mapM23806b.entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC7079wV interfaceC7079wV = (InterfaceC7079wV) entry.getValue();
            Bundle bundle = new Bundle(2);
            C7142xV c7142xV = (C7142xV) interfaceC7079wV;
            bundle.putString("value", c7142xV.m25909d());
            int i = c7142xV.f45662b;
            if (i == 1) {
                bundle.putString("source", "default");
            } else if (i != 2) {
                bundle.putString("source", "static");
            } else {
                bundle.putString("source", "remote");
            }
            map3.put(str, bundle);
        }
        map2.put("values", map3);
        map2.put("lastFetchTime", Long.valueOf(c6890tVM23807c.f43094a));
        int i2 = c6890tVM23807c.f43095b;
        map2.put("lastFetchStatus", i2 != -1 ? i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "throttled" : "failure" : "no_fetch_yet" : "success");
        C7005vK c7005vK = c6890tVM23807c.f43096c;
        map2.put("minimumFetchInterval", Long.valueOf(c7005vK.f44330c));
        map2.put("fetchTimeout", Long.valueOf(c7005vK.f44329b));
        map.put("constants", map2);
        return Arguments.makeNativeMap(map);
    }

    @ReactMethod
    public void activate(String str, Promise promise) {
        this.module.getClass();
        C6621pV c6621pVM23803d = C6621pV.m23803d(C0786MU.m5376e(str));
        Task taskM26005c = c6621pVM23803d.f40117d.m26005c();
        Task taskM26005c2 = c6621pVM23803d.f40118e.m26005c();
        AbstractC9376fU1.m18247h(taskM26005c, taskM26005c2).mo11140g(c6621pVM23803d.f40116c, new C4224i9(c6621pVM23803d, taskM26005c, taskM26005c2, 11)).mo11135b(new CL0(this, promise, 1));
    }

    @ReactMethod
    public void ensureInitialized(String str, Promise promise) {
        this.module.getClass();
        C6621pV c6621pVM23803d = C6621pV.m23803d(C0786MU.m5376e(str));
        Task taskM26005c = c6621pVM23803d.f40118e.m26005c();
        Task taskM26005c2 = c6621pVM23803d.f40119f.m26005c();
        Task taskM26005c3 = c6621pVM23803d.f40117d.m26005c();
        CallableC6493nV callableC6493nV = new CallableC6493nV(c6621pVM23803d, 1);
        Executor executor = c6621pVM23803d.f40116c;
        C9450g32 c9450g32M18242c = AbstractC9376fU1.m18242c(executor, callableC6493nV);
        C1415WU c1415wu = (C1415WU) c6621pVM23803d.f40123j;
        C9450g32 c9450g32Mo11139f = AbstractC9376fU1.m18247h(taskM26005c, taskM26005c2, taskM26005c3, c9450g32M18242c, c1415wu.m8789d(), c1415wu.m8790e()).mo11139f(executor, new C0267EE(12, c9450g32M18242c));
        try {
            C6621pV c6621pVM23803d2 = C6621pV.m23803d(C0786MU.m5376e(str));
            AbstractC9376fU1.m18240a(c6621pVM23803d2.m23805a().m18387n(c6621pVM23803d2.f40116c, new C6556oV(c6621pVM23803d2)));
        } catch (Exception unused) {
        }
        c9450g32Mo11139f.mo11135b(new CL0(this, promise, 6));
    }

    @ReactMethod
    public void fetch(String str, double d, Promise promise) {
        C8883bg1 c8883bg1 = this.module;
        c8883bg1.getClass();
        AbstractC9376fU1.m18242c(((W81) c8883bg1.f2473a).m8685a(), new CallableC8625Zf1(C0786MU.m5376e(str), (long) d, 1)).mo11135b(new CL0(this, promise, 4));
    }

    @ReactMethod
    public void fetchAndActivate(String str, Promise promise) {
        this.module.getClass();
        C6621pV c6621pVM23803d = C6621pV.m23803d(C0786MU.m5376e(str));
        c6621pVM23803d.m23805a().m18387n(c6621pVM23803d.f40116c, new C6556oV(c6621pVM23803d)).mo11135b(new CL0(this, promise, 3));
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        this.module.getClass();
        return new HashMap();
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        Iterator<Map.Entry<String, C0437Gw>> it = mConfigUpdateRegistrations.entrySet().iterator();
        while (it.hasNext()) {
            C0437Gw value = it.next().getValue();
            C10910rT1 c10910rT1 = value.f3966b;
            C0500Hw c0500Hw = value.f3965a;
            synchronized (c10910rT1) {
                ((LinkedHashSet) c10910rT1.f41678b).remove(c0500Hw);
            }
            it.remove();
        }
    }

    @ReactMethod
    public void onConfigUpdated(String str) {
        C0437Gw c0437Gw;
        if (mConfigUpdateRegistrations.get(str) == null) {
            C6621pV c6621pVM23803d = C6621pV.m23803d(C0786MU.m5376e(str));
            C0500Hw c0500Hw = new C0500Hw(1, str);
            C10910rT1 c10910rT1 = c6621pVM23803d.f40124k;
            synchronized (c10910rT1) {
                ((LinkedHashSet) c10910rT1.f41678b).add(c0500Hw);
                c10910rT1.m24382o();
                c0437Gw = new C0437Gw(c10910rT1, c0500Hw);
            }
            mConfigUpdateRegistrations.put(str, c0437Gw);
        }
    }

    @ReactMethod
    public void removeConfigUpdateRegistration(String str) {
        C0437Gw c0437Gw = mConfigUpdateRegistrations.get(str);
        if (c0437Gw != null) {
            C10910rT1 c10910rT1 = c0437Gw.f3966b;
            C0500Hw c0500Hw = c0437Gw.f3965a;
            synchronized (c10910rT1) {
                ((LinkedHashSet) c10910rT1.f41678b).remove(c0500Hw);
            }
            mConfigUpdateRegistrations.remove(str);
        }
    }

    @ReactMethod
    public void reset(String str, Promise promise) {
        this.module.getClass();
        C6621pV c6621pVM23803d = C6621pV.m23803d(C0786MU.m5376e(str));
        c6621pVM23803d.getClass();
        AbstractC9376fU1.m18242c(c6621pVM23803d.f40116c, new CallableC6493nV(c6621pVM23803d, 0)).mo11135b(new CL0(this, promise, 0));
    }

    @ReactMethod
    public void setConfigSettings(String str, ReadableMap readableMap, Promise promise) {
        C8883bg1 c8883bg1 = this.module;
        Bundle bundle = Arguments.toBundle(readableMap);
        c8883bg1.getClass();
        AbstractC9376fU1.m18242c(((W81) c8883bg1.f2473a).m8685a(), new CallableC7043vw(bundle, 9, C0786MU.m5376e(str))).mo11135b(new CL0(this, promise, 2));
    }

    @ReactMethod
    public void setCustomSignals(String str, ReadableMap readableMap, Promise promise) {
        C8883bg1 c8883bg1 = this.module;
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        c8883bg1.getClass();
        S81 s81 = new S81();
        ((W81) c8883bg1.f2473a).m8685a().execute(new RunnableC8176Qp0(hashMap, C0786MU.m5376e(str), s81, 16));
        s81.f10598a.mo11135b(new CL0(this, promise, 8));
    }

    @ReactMethod
    public void setDefaults(String str, ReadableMap readableMap, Promise promise) {
        C8883bg1 c8883bg1 = this.module;
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        c8883bg1.getClass();
        C6621pV c6621pVM23803d = C6621pV.m23803d(C0786MU.m5376e(str));
        c6621pVM23803d.getClass();
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map.put(entry.getKey(), new String((byte[]) value));
            } else {
                map.put(entry.getKey(), value.toString());
            }
        }
        c6621pVM23803d.m23809f(map).mo11135b(new CL0(this, promise, 5));
    }

    @ReactMethod
    public void setDefaultsFromResource(String str, String str2, Promise promise) {
        C8883bg1 c8883bg1 = this.module;
        c8883bg1.getClass();
        AbstractC9376fU1.m18242c(((W81) c8883bg1.f2473a).m8685a(), new CallableC0298Ej(c8883bg1, str2, C0786MU.m5376e(str), 5)).mo11135b(new CL0(this, promise, 7));
    }
}
