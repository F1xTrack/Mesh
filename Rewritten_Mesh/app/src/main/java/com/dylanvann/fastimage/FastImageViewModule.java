package com.dylanvann.fastimage;

import android.app.Activity;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import p000.AbstractC7381Bh1;
import p000.C7265zS;
import p000.RunnableC1420WZ;
import p000.RunnableC1483XZ;

/* loaded from: classes.dex */
class FastImageViewModule extends ReactContextBaseJavaModule {
    C7265zS impl;

    public FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C7265zS c7265zS = new C7265zS();
        c7265zS.f46835a = reactApplicationContext;
        this.impl = c7265zS;
    }

    @ReactMethod
    public void clearDiskCache(Promise promise) {
        Activity currentActivity = this.impl.f46835a.getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
            return;
        }
        ComponentCallbacks2C1874a componentCallbacks2C1874aM10883a = ComponentCallbacks2C1874a.m10883a(currentActivity.getApplicationContext());
        componentCallbacks2C1874aM10883a.getClass();
        if (!AbstractC7381Bh1.m810i()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        componentCallbacks2C1874aM10883a.f17773a.f2684f.m1677b().clear();
        promise.resolve(null);
    }

    @ReactMethod
    public void clearMemoryCache(Promise promise) {
        Activity currentActivity = this.impl.f46835a.getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            currentActivity.runOnUiThread(new RunnableC1483XZ(currentActivity, 9, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FastImageView";
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        Activity currentActivity = this.impl.f46835a.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new RunnableC1420WZ(readableArray, 7, currentActivity));
    }
}
