package com.zoontek.rnpermissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractActivityC11909zJ0;
import p000.AbstractC3929dS;
import p000.InterfaceC9101dL0;
import p000.PA0;
import p000.QA0;
import p000.SA0;
import p000.TA0;
import p000.UN1;

@InterfaceC9101dL0(name = "RNPermissions")
/* loaded from: classes2.dex */
public class RNPermissionsModule extends ReactContextBaseJavaModule implements QA0 {
    private final SparseArray<Callback> mCallbacks;

    public RNPermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCallbacks = new SparseArray<>();
    }

    @ReactMethod
    public void check(String str, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (str == null || UN1.m8003g(str)) {
            promise.resolve("unavailable");
        } else if (reactApplicationContext.getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve("granted");
        } else {
            promise.resolve("denied");
        }
    }

    @ReactMethod
    public void checkLocationAccuracy(Promise promise) {
        promise.reject("Permissions:checkLocationAccuracy", "checkLocationAccuracy is not supported on Android");
    }

    @ReactMethod
    public void checkMultiple(ReadableArray readableArray, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Context baseContext = reactApplicationContext.getBaseContext();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (UN1.m8003g(string)) {
                writableNativeMap.putString(string, "unavailable");
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, "granted");
            } else {
                writableNativeMap.putString(string, "denied");
            }
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void checkNotifications(Promise promise) {
        promise.resolve(UN1.m8001e(getReactApplicationContext(), "denied"));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("available", Arguments.createArray());
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNPermissions";
    }

    @Override // p000.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        SparseArray<Callback> sparseArray = this.mCallbacks;
        try {
            sparseArray.get(i).invoke(iArr, UN1.m8002f(reactApplicationContext));
            sparseArray.remove(i);
            return sparseArray.size() == 0;
        } catch (Exception unused) {
            AbstractC3929dS.m17676i("PermissionsModule", "Unexpected invocation of `onRequestPermissionsResult`", new Object[0]);
            return false;
        }
    }

    @ReactMethod
    public void openPhotoPicker(Promise promise) {
        promise.reject("Permissions:openPhotoPicker", "openPhotoPicker is not supported on Android");
    }

    @ReactMethod
    public void openSettings(Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        try {
            Intent intent = new Intent();
            String packageName = reactApplicationContext.getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("package", packageName, null));
            reactApplicationContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject("E_INVALID_ACTIVITY", e);
        }
    }

    @ReactMethod
    public void request(String str, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        SparseArray<Callback> sparseArray = this.mCallbacks;
        if (str == null || UN1.m8003g(str)) {
            promise.resolve("unavailable");
            return;
        }
        if (reactApplicationContext.getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve("granted");
            return;
        }
        try {
            PA0 pa0M8002f = UN1.m8002f(reactApplicationContext);
            sparseArray.put(UN1.f11768a, new SA0(1, str, promise));
            ((AbstractActivityC11909zJ0) pa0M8002f).m26369k(new String[]{str}, UN1.f11768a, this);
            UN1.f11768a++;
        } catch (IllegalStateException e) {
            promise.reject("E_INVALID_ACTIVITY", e);
        }
    }

    @ReactMethod
    public void requestLocationAccuracy(String str, Promise promise) {
        promise.reject("Permissions:requestLocationAccuracy", "requestLocationAccuracy is not supported on Android");
    }

    @ReactMethod
    public void requestMultiple(ReadableArray readableArray, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        SparseArray<Callback> sparseArray = this.mCallbacks;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = reactApplicationContext.getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            if (UN1.m8003g(string)) {
                writableNativeMap.putString(string, "unavailable");
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, "granted");
            } else {
                arrayList.add(string);
            }
            i++;
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            PA0 pa0M8002f = UN1.m8002f(reactApplicationContext);
            sparseArray.put(UN1.f11768a, new TA0(arrayList, writableNativeMap, promise, 1));
            ((AbstractActivityC11909zJ0) pa0M8002f).m26369k((String[]) arrayList.toArray(new String[0]), UN1.f11768a, this);
            UN1.f11768a++;
        } catch (IllegalStateException e) {
            promise.reject("E_INVALID_ACTIVITY", e);
        }
    }

    @ReactMethod
    public void requestNotifications(ReadableArray readableArray, Promise promise) {
        promise.resolve(UN1.m8001e(getReactApplicationContext(), "blocked"));
    }

    @ReactMethod
    public void shouldShowRequestRationale(String str, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (str == null) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(UN1.m8002f(reactApplicationContext).shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            promise.reject("E_INVALID_ACTIVITY", e);
        }
    }
}
