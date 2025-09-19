package com.zoontek.rnedgetoedge;

import android.app.Activity;
import android.os.Build;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p000.AbstractC1533YM;
import p000.AbstractC3929dS;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.RunnableC1470XM;
import p000.RunnableC7239z2;
import ru.mes.dnevnik.R;

@InterfaceC9101dL0(name = "RNEdgeToEdge")
@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m22267d2 = {"Lcom/zoontek/rnedgetoedge/EdgeToEdgeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "LTf1;", "invalidate", "()V", "", "getName", "()Ljava/lang/String;", "onHostResume", "onHostPause", "onHostDestroy", "onColorSchemeChange", "style", "setStatusBarStyle", "(Ljava/lang/String;)V", "setNavigationBarStyle", "", "hidden", "setStatusBarHidden", "(Z)V", "setNavigationBarHidden", "react-native-edge-to-edge_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class EdgeToEdgeModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeToEdgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNEdgeToEdge";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @ReactMethod
    public final void onColorSchemeChange() {
        Activity currentActivity;
        LinkedHashMap linkedHashMap = AbstractC1533YM.f14265a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            currentActivity.runOnUiThread(new RunnableC7239z2(currentActivity, 3));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity currentActivity;
        LinkedHashMap linkedHashMap = AbstractC1533YM.f14265a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            currentActivity.runOnUiThread(new RunnableC7239z2(currentActivity, 3));
        }
    }

    @ReactMethod
    public final void setNavigationBarHidden(boolean hidden) {
        Activity currentActivity;
        LinkedHashMap linkedHashMap = AbstractC1533YM.f14265a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            AbstractC1533YM.f14267c = hidden;
            currentActivity.runOnUiThread(new RunnableC7239z2(currentActivity, 1));
        }
    }

    @ReactMethod
    public final void setNavigationBarStyle(String style) {
        Activity currentActivity;
        O90.m5968f(style, "style");
        LinkedHashMap linkedHashMap = AbstractC1533YM.f14265a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            if (Build.VERSION.SDK_INT < 27 || AbstractC1533YM.m9265c(currentActivity, R.attr.enforceNavigationBarContrast)) {
                return;
            }
            currentActivity.runOnUiThread(new RunnableC1470XM(currentActivity, 1, style));
        }
    }

    @ReactMethod
    public final void setStatusBarHidden(boolean hidden) {
        Activity currentActivity;
        LinkedHashMap linkedHashMap = AbstractC1533YM.f14265a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            AbstractC1533YM.f14266b = hidden;
            currentActivity.runOnUiThread(new RunnableC7239z2(currentActivity, 2));
        }
    }

    @ReactMethod
    public final void setStatusBarStyle(String style) {
        Activity currentActivity;
        O90.m5968f(style, "style");
        LinkedHashMap linkedHashMap = AbstractC1533YM.f14265a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (currentActivity = reactApplicationContext.getCurrentActivity()) == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            currentActivity.runOnUiThread(new RunnableC1470XM(currentActivity, 0, style));
        }
    }
}
