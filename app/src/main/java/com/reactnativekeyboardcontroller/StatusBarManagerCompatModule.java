package com.reactnativekeyboardcontroller;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC10977s02;
import p000.C3924dN;
import p000.InterfaceC11315ue0;
import p000.InterfaceC11697xe0;
import p000.MD0;
import p000.N41;
import p000.O90;
import p000.P41;
import p000.Q41;
import p000.U41;
import p000.V41;

@Metadata(m22266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m22267d2 = {"Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "hidden", "LTf1;", "setHidden", "(Z)V", "", "color", "animated", "setColor", "(IZ)V", "translucent", "setTranslucent", "", "style", "setStyle", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "", "", "getConstants", "()Ljava/util/Map;", "LP41;", "module", "LP41;", "react-native-keyboard-controller_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class StatusBarManagerCompatModule extends ReactContextBaseJavaModule {
    private final P41 module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarManagerCompatModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "mReactContext");
        this.module = new P41(reactApplicationContext);
    }

    @ReactMethod
    private final void setColor(final int color, final boolean animated) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        P41 p41 = this.module;
        p41.getClass();
        WeakReference weakReference = AbstractC10977s02.f42200a;
        C3924dN c3924dN = weakReference != null ? (C3924dN) weakReference.get() : null;
        if (c3924dN != null ? c3924dN.getActive() : false) {
            final Activity currentActivity = p41.f8843a.getCurrentActivity();
            if (currentActivity == null) {
                int i = Q41.f9469a;
                return;
            } else {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: O41
                    @Override // java.lang.Runnable
                    public final void run() {
                        Window window = currentActivity.getWindow();
                        boolean z = animated;
                        int i2 = color;
                        if (!z) {
                            window.setStatusBarColor(i2);
                            return;
                        }
                        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(i2));
                        valueAnimatorOfObject.addUpdateListener(new CW0(window, 1));
                        valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
                        valueAnimatorOfObject.start();
                    }
                });
                return;
            }
        }
        double d = color;
        U41 u41 = p41.f8844b;
        u41.getClass();
        try {
            Method method = (Method) u41.f11646c;
            if (method != null) {
                method.invoke(u41.f11644a, Double.valueOf(d), Boolean.valueOf(animated));
            }
        } catch (Exception unused) {
            int i2 = V41.f12346a;
        }
    }

    @ReactMethod
    private final void setHidden(boolean hidden) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        P41 p41 = this.module;
        p41.getClass();
        WeakReference weakReference = AbstractC10977s02.f42200a;
        C3924dN c3924dN = weakReference != null ? (C3924dN) weakReference.get() : null;
        if (c3924dN != null ? c3924dN.getActive() : false) {
            UiThreadUtil.runOnUiThread(new N41(hidden, p41));
            return;
        }
        U41 u41 = p41.f8844b;
        u41.getClass();
        try {
            Method method = (Method) u41.f11645b;
            if (method != null) {
                method.invoke(u41.f11644a, Boolean.valueOf(hidden));
            }
        } catch (Exception unused) {
            int i = V41.f12346a;
        }
    }

    @ReactMethod
    private final void setStyle(String style) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        P41 p41 = this.module;
        p41.getClass();
        O90.m5968f(style, "style");
        WeakReference weakReference = AbstractC10977s02.f42200a;
        C3924dN c3924dN = weakReference != null ? (C3924dN) weakReference.get() : null;
        if (c3924dN != null ? c3924dN.getActive() : false) {
            UiThreadUtil.runOnUiThread(new MD0(p41, 23, style));
            return;
        }
        U41 u41 = p41.f8844b;
        u41.getClass();
        try {
            Method method = (Method) u41.f11648e;
            if (method != null) {
                method.invoke(u41.f11644a, style);
            }
        } catch (Exception unused) {
            int i = V41.f12346a;
        }
    }

    @ReactMethod
    private final void setTranslucent(boolean translucent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        P41 p41 = this.module;
        p41.getClass();
        WeakReference weakReference = AbstractC10977s02.f42200a;
        C3924dN c3924dN = weakReference != null ? (C3924dN) weakReference.get() : null;
        if (c3924dN != null ? c3924dN.getActive() : false) {
            UiThreadUtil.runOnUiThread(new N41(p41, translucent));
            return;
        }
        U41 u41 = p41.f8844b;
        u41.getClass();
        try {
            Method method = (Method) u41.f11647d;
            if (method != null) {
                method.invoke(u41.f11644a, Boolean.valueOf(translucent));
            }
        } catch (Exception unused) {
            int i = V41.f12346a;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        U41 u41 = this.module.f8844b;
        u41.getClass();
        try {
            Method method = (Method) u41.f11649f;
            Object objInvoke = method != null ? method.invoke(u41.f11644a, null) : null;
            if (!(objInvoke instanceof Map)) {
                return null;
            }
            if (!(objInvoke instanceof InterfaceC11315ue0) || (objInvoke instanceof InterfaceC11697xe0)) {
                return (Map) objInvoke;
            }
            return null;
        } catch (Exception unused) {
            int i = V41.f12346a;
            return null;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "StatusBarManager";
    }
}
