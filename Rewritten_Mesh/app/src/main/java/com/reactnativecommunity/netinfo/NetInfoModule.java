package com.reactnativecommunity.netinfo;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p000.AbstractC6981ux;
import p000.C0885O3;
import p000.C0948P3;
import p000.C3946dj;
import p000.C8082Ou0;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = NetInfoModule.NAME)
/* loaded from: classes2.dex */
public class NetInfoModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNCNetInfo";
    private final C0948P3 mAmazonConnectivityChecker;
    private final AbstractC6981ux mConnectivityReceiver;
    private int numberOfListeners;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.numberOfListeners = 0;
        if (Build.VERSION.SDK_INT >= 24) {
            this.mConnectivityReceiver = new C8082Ou0(reactApplicationContext);
        } else {
            this.mConnectivityReceiver = new C3946dj(reactApplicationContext);
        }
        this.mAmazonConnectivityChecker = new C0948P3(reactApplicationContext, this);
    }

    @ReactMethod
    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.f44039e = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        promise.resolve(this.mConnectivityReceiver.m25289a(str));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mConnectivityReceiver.mo6180c();
        C0948P3 c0948p3 = this.mAmazonConnectivityChecker;
        c0948p3.getClass();
        if (C0948P3.m6218a()) {
            C0885O3 c0885o3 = c0948p3.f8804a;
            if (!c0885o3.f8192a) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
                intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
                int i = Build.VERSION.SDK_INT;
                ReactApplicationContext reactApplicationContext = c0948p3.f8805b;
                if (i < 34 || reactApplicationContext.getApplicationInfo().targetSdkVersion < 34) {
                    reactApplicationContext.registerReceiver(c0885o3, intentFilter);
                } else {
                    reactApplicationContext.registerReceiver(c0885o3, intentFilter, 4);
                }
                c0885o3.f8192a = true;
            }
            if (c0948p3.f8809f) {
                return;
            }
            Handler handler = new Handler();
            c0948p3.f8808e = handler;
            c0948p3.f8809f = true;
            handler.post(c0948p3.f8807d);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        C0948P3 c0948p3 = this.mAmazonConnectivityChecker;
        c0948p3.getClass();
        if (C0948P3.m6218a()) {
            if (c0948p3.f8809f) {
                c0948p3.f8809f = false;
                c0948p3.f8808e.removeCallbacksAndMessages(null);
                c0948p3.f8808e = null;
            }
            C0885O3 c0885o3 = c0948p3.f8804a;
            if (c0885o3.f8192a) {
                c0948p3.f8805b.unregisterReceiver(c0885o3);
                c0885o3.f8192a = false;
            }
        }
        this.mConnectivityReceiver.mo6181d();
        this.mConnectivityReceiver.f44039e = false;
    }

    public void onAmazonFireDeviceConnectivityChanged(boolean z) {
        AbstractC6981ux abstractC6981ux = this.mConnectivityReceiver;
        abstractC6981ux.f44043i = Boolean.valueOf(z);
        abstractC6981ux.m25290e(abstractC6981ux.f44040f, abstractC6981ux.f44041g, abstractC6981ux.f44042h);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        invalidate();
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int iIntValue = this.numberOfListeners - num.intValue();
        this.numberOfListeners = iIntValue;
        if (iIntValue == 0) {
            this.mConnectivityReceiver.f44039e = false;
        }
    }
}
