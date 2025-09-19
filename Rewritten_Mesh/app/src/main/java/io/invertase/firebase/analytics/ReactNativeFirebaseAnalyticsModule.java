package io.invertase.firebase.analytics;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC9376fU1;
import p000.C8755ag1;
import p000.C9450g32;
import p000.CG1;
import p000.CallableC0298Ej;
import p000.CallableC0361Fj;
import p000.CallableC7043vw;
import p000.CallableC8089Ox1;
import p000.CallableC8573Yf1;
import p000.CallableC8625Zf1;
import p000.I30;
import p000.PG1;
import p000.Y81;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Analytics";
    private final C8755ag1 module;

    public ReactNativeFirebaseAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new C8755ag1(reactApplicationContext, SERVICE_NAME);
    }

    public static /* synthetic */ void lambda$getAppInstanceId$3(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$getSessionId$4(Promise promise, Task task) {
        if (!task.mo11144k()) {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        } else {
            Long l = (Long) task.mo11142i();
            promise.resolve(l != null ? Double.valueOf(l.doubleValue()) : null);
        }
    }

    public static /* synthetic */ void lambda$logEvent$0(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$resetAnalyticsData$8(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$setAnalyticsCollectionEnabled$1(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$setConsent$10(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$setDefaultEventParameters$9(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$setSessionTimeoutDuration$2(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$setUserId$5(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$setUserProperties$7(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$setUserProperty$6(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    private Bundle toBundle(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) bundle.getSerializable("items");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Bundle) {
                Bundle bundle2 = (Bundle) next;
                if (bundle2.containsKey("quantity")) {
                    bundle2.putInt("quantity", (int) bundle2.getDouble("quantity"));
                }
            }
        }
        if (bundle.containsKey("extend_session")) {
            bundle.putLong("extend_session", (long) bundle.getDouble("extend_session"));
        }
        return bundle;
    }

    @ReactMethod
    public void getAppInstanceId(Promise promise) {
        FirebaseAnalytics.getInstance((ReactApplicationContext) this.module.f2474b).m11296a().mo11135b(new I30(8, promise));
    }

    @ReactMethod
    public void getSessionId(Promise promise) {
        C9450g32 c9450g32M18243d;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance((ReactApplicationContext) this.module.f2474b);
        firebaseAnalytics.getClass();
        try {
            c9450g32M18243d = AbstractC9376fU1.m18242c(firebaseAnalytics.m11297b(), new CallableC8089Ox1(firebaseAnalytics, 1));
        } catch (RuntimeException e) {
            CG1 cg1 = firebaseAnalytics.f18443a;
            cg1.getClass();
            cg1.m1136f(new PG1(cg1, "Failed to schedule task for getSessionId", (Exception) null));
            c9450g32M18243d = AbstractC9376fU1.m18243d(e);
        }
        c9450g32M18243d.mo11135b(new I30(13, promise));
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        Bundle bundle = toBundle(readableMap);
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC0298Ej(c8755ag1, str, bundle, 3)).mo11135b(new I30(12, promise));
    }

    @ReactMethod
    public void resetAnalyticsData(Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC0361Fj(9, c8755ag1)).mo11135b(new I30(14, promise));
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool, Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC7043vw(c8755ag1, 7, bool)).mo11135b(new I30(11, promise));
    }

    @ReactMethod
    public void setConsent(ReadableMap readableMap, Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        Bundle bundle = Arguments.toBundle(readableMap);
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC8573Yf1(c8755ag1, bundle, 1)).mo11135b(new I30(10, promise));
    }

    @ReactMethod
    public void setDefaultEventParameters(ReadableMap readableMap, Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        Bundle bundle = toBundle(readableMap);
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC8573Yf1(c8755ag1, bundle, 2)).mo11135b(new I30(15, promise));
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d, Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC8625Zf1(c8755ag1, (long) d, 0)).mo11135b(new I30(17, promise));
    }

    @ReactMethod
    public void setUserId(String str, Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC7043vw(c8755ag1, 8, str)).mo11135b(new I30(18, promise));
    }

    @ReactMethod
    public void setUserProperties(ReadableMap readableMap, Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        Bundle bundle = Arguments.toBundle(readableMap);
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC8573Yf1(c8755ag1, bundle, 0)).mo11135b(new I30(16, promise));
    }

    @ReactMethod
    public void setUserProperty(String str, String str2, Promise promise) {
        C8755ag1 c8755ag1 = this.module;
        c8755ag1.getClass();
        AbstractC9376fU1.m18242c(Y81.f14171a, new CallableC0298Ej(c8755ag1, str, str2, 4)).mo11135b(new I30(9, promise));
    }
}
