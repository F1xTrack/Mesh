package com.reactnativekeyboardcontroller;

import android.app.Activity;
import android.widget.EditText;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import p000.AbstractC10468o12;
import p000.C9010cg0;
import p000.I02;
import p000.O90;
import p000.RunnableC0004A3;
import p000.RunnableC0017AG;
import p000.RunnableC6246ja;
import p000.RunnableC6475nD;

@Metadata(m22266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m22267d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "mode", "LTf1;", "setInputMode", "(I)V", "setDefaultMode", "()V", "preload", "", "keepFocus", "dismiss", "(Z)V", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "setFocusTo", "(Ljava/lang/String;)V", "eventName", "addListener", "count", "removeListeners", "(Ljava/lang/Integer;)V", "Lcg0;", "module", "Lcg0;", "react-native-keyboard-controller_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardControllerModule extends ReactContextBaseJavaModule {
    private final C9010cg0 module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardControllerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "mReactContext");
        this.module = new C9010cg0(reactApplicationContext);
    }

    @ReactMethod
    public final void addListener(String eventName) {
    }

    @ReactMethod
    public final void dismiss(boolean keepFocus) {
        Activity currentActivity = this.module.f17682a.getCurrentActivity();
        WeakReference weakReference = AbstractC10468o12.f38689a;
        EditText editText = weakReference != null ? (EditText) weakReference.get() : null;
        if (editText != null) {
            UiThreadUtil.runOnUiThread(new RunnableC0017AG(currentActivity, editText, keepFocus, 3));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardController";
    }

    @ReactMethod
    public final void preload() {
        this.module.getClass();
    }

    @ReactMethod
    public final void removeListeners(Integer count) {
    }

    @ReactMethod
    public final void setDefaultMode() {
        C9010cg0 c9010cg0 = this.module;
        UiThreadUtil.runOnUiThread(new RunnableC6246ja(c9010cg0, c9010cg0.f17683b, 8));
    }

    @ReactMethod
    public final void setFocusTo(String direction) {
        O90.m5968f(direction, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        this.module.getClass();
        if (direction.equals("current")) {
            UiThreadUtil.runOnUiThread(new RunnableC0004A3(3));
            return;
        }
        WeakReference weakReference = AbstractC10468o12.f38689a;
        EditText editText = weakReference != null ? (EditText) weakReference.get() : null;
        if (editText != null) {
            UiThreadUtil.runOnUiThread(new RunnableC6475nD(direction.equals("next") ? I02.m3688b(1, editText) : I02.m3688b(-1, editText), 1));
        }
    }

    @ReactMethod
    public final void setInputMode(int mode) {
        C9010cg0 c9010cg0 = this.module;
        c9010cg0.getClass();
        UiThreadUtil.runOnUiThread(new RunnableC6246ja(c9010cg0, mode, 8));
    }
}
