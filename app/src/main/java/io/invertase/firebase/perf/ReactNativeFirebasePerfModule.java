package io.invertase.firebase.perf;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p000.AbstractC9376fU1;
import p000.C0786MU;
import p000.C6367lV;
import p000.C9400fg1;
import p000.CallableC9011cg1;
import p000.CallableC9144dg1;
import p000.I30;
import p000.JL0;
import p000.KL0;
import p000.W81;
import p000.X50;
import p000.Y81;

/* loaded from: classes2.dex */
public class ReactNativeFirebasePerfModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Perf";
    private final C9400fg1 module;

    public ReactNativeFirebasePerfModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new C9400fg1(reactApplicationContext, SERVICE_NAME);
    }

    public static /* synthetic */ void lambda$setPerformanceCollectionEnabled$0(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$startHttpMetric$5(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$startScreenTrace$3(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$startTrace$1(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$stopHttpMetric$6(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$stopScreenTrace$4(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$stopTrace$2(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        this.module.getClass();
        HashMap map = new HashMap();
        Boolean bool = C6367lV.m22440a().f37083c;
        map.put("isPerformanceCollectionEnabled", Boolean.valueOf(bool != null ? bool.booleanValue() : C0786MU.m5375d().m5383j()));
        map.put("isInstrumentationEnabled", Boolean.TRUE);
        return map;
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ((W81) this.module.f2473a).m8688e();
        C9400fg1.f27323c.clear();
        C9400fg1.f27325e.clear();
        C9400fg1.f27324d.clear();
    }

    @ReactMethod
    public void setPerformanceCollectionEnabled(Boolean bool, Promise promise) {
        this.module.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new JL0(2, bool)).mo11135b(new KL0(1, promise));
    }

    @ReactMethod
    public void startHttpMetric(int i, String str, String str2, Promise promise) {
        this.module.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC9144dg1(str, str2, i)).mo11135b(new KL0(3, promise));
    }

    @ReactMethod
    public void startScreenTrace(int i, String str, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
            return;
        }
        this.module.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC9144dg1(currentActivity, i, str)).mo11135b(new KL0(4, promise));
    }

    @ReactMethod
    public void startTrace(int i, String str, Promise promise) {
        this.module.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new X50(str, i, 2)).mo11135b(new I30(29, promise));
    }

    @ReactMethod
    public void stopHttpMetric(int i, ReadableMap readableMap, Promise promise) {
        C9400fg1 c9400fg1 = this.module;
        Bundle bundle = Arguments.toBundle(readableMap);
        Bundle bundle2 = Arguments.toBundle(readableMap.getMap("attributes"));
        c9400fg1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC9011cg1(i, bundle, bundle2, 1)).mo11135b(new KL0(0, promise));
    }

    @ReactMethod
    public void stopScreenTrace(final int i, Promise promise) {
        this.module.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new Callable() { // from class: eg1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2;
                int i3;
                SparseIntArray sparseIntArray;
                SparseArray sparseArray = C9400fg1.f27324d;
                int i4 = i;
                C11808yW0 c11808yW0 = (C11808yW0) sparseArray.get(i4);
                if (c11808yW0.f46283b != null) {
                    SparseIntArray[] sparseIntArrayArrMo2454m = c11808yW0.f46282a.f16089a.mo2454m();
                    int i5 = 0;
                    if (sparseIntArrayArrMo2454m == null || (sparseIntArray = sparseIntArrayArrMo2454m[0]) == null) {
                        i2 = 0;
                        i3 = 0;
                    } else {
                        int i6 = 0;
                        i2 = 0;
                        i3 = 0;
                        while (i5 < sparseIntArray.size()) {
                            int iKeyAt = sparseIntArray.keyAt(i5);
                            int iValueAt = sparseIntArray.valueAt(i5);
                            i6 += iValueAt;
                            if (iKeyAt > 700) {
                                i3 += iValueAt;
                            }
                            if (iKeyAt > 16) {
                                i2 += iValueAt;
                            }
                            i5++;
                        }
                        i5 = i6;
                    }
                    if (i5 > 0) {
                        c11808yW0.f46283b.putMetric("_fr_tot", i5);
                    }
                    if (i2 > 0) {
                        c11808yW0.f46283b.putMetric("_fr_slo", i2);
                    }
                    if (i3 > 0) {
                        c11808yW0.f46283b.putMetric("_fr_fzn", i3);
                    }
                    c11808yW0.f46283b.stop();
                }
                sparseArray.remove(i4);
                return null;
            }
        }).mo11135b(new KL0(2, promise));
    }

    @ReactMethod
    public void stopTrace(int i, ReadableMap readableMap, Promise promise) {
        C9400fg1 c9400fg1 = this.module;
        Bundle bundle = Arguments.toBundle(readableMap.getMap("metrics"));
        Bundle bundle2 = Arguments.toBundle(readableMap.getMap("attributes"));
        c9400fg1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC9011cg1(i, bundle, bundle2, 0)).mo11135b(new I30(28, promise));
    }
}
