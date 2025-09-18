package com.reactnativekeyboardcontroller;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.C1932a;
import com.facebook.react.views.view.ReactViewManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC10889rJ0;
import p000.AbstractC11284uO1;
import p000.AbstractC9188e12;
import p000.C10167lg0;
import p000.C10910rT1;
import p000.C3924dN;
import p000.C9271eg0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;
import p000.ViewTreeObserverOnGlobalLayoutListenerC0347FV;

@Metadata(m22266d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m22267d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardControllerViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "LS91;", "context", "Lcom/facebook/react/views/view/a;", "createViewInstance", "(LS91;)Lcom/facebook/react/views/view/a;", "LTf1;", "invalidate", "view", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/view/a;)V", "LdN;", "", "enabled", "setEnabled", "(LdN;Z)V", "isStatusBarTranslucent", "setStatusBarTranslucent", "isNavigationBarTranslucent", "setNavigationBarTranslucent", "isPreservingEdgeToEdge", "setPreserveEdgeToEdge", "", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Leg0;", "manager", "Leg0;", "react-native-keyboard-controller_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardControllerViewManager extends ReactViewManager {
    private final C9271eg0 manager = new C9271eg0();

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        this.manager.getClass();
        String str = C10167lg0.f37236f.f36605a;
        HashMap mapM24256c = AbstractC10889rJ0.m24256c("registrationName", "onKeyboardMove");
        String str2 = C10167lg0.f37237g.f36605a;
        HashMap mapM24256c2 = AbstractC10889rJ0.m24256c("registrationName", "onKeyboardMoveStart");
        String str3 = C10167lg0.f37238h.f36605a;
        HashMap mapM24256c3 = AbstractC10889rJ0.m24256c("registrationName", "onKeyboardMoveEnd");
        String str4 = C10167lg0.f37239i.f36605a;
        HashMap mapM24256c4 = AbstractC10889rJ0.m24256c("registrationName", "onKeyboardMoveInteractive");
        HashMap mapM24256c5 = AbstractC10889rJ0.m24256c("registrationName", "onFocusedInputLayoutChanged");
        HashMap mapM24256c6 = AbstractC10889rJ0.m24256c("registrationName", "onFocusedInputTextChanged");
        HashMap mapM24256c7 = AbstractC10889rJ0.m24256c("registrationName", "onFocusedInputSelectionChanged");
        HashMap map = new HashMap();
        map.put(str, mapM24256c);
        map.put(str2, mapM24256c2);
        map.put(str3, mapM24256c3);
        map.put(str4, mapM24256c4);
        map.put("topFocusedInputLayoutChanged", mapM24256c5);
        map.put("topFocusedInputTextChanged", mapM24256c6);
        map.put("topFocusedInputSelectionChanged", mapM24256c7);
        return map;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardControllerView";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        S91 s91;
        ViewGroup viewGroupM25184b;
        ViewTreeObserver viewTreeObserver;
        super.invalidate();
        C9271eg0 c9271eg0 = this.manager;
        C10910rT1 c10910rT1 = c9271eg0.f26803a;
        if (c10910rT1 != null && (s91 = (S91) c10910rT1.f41678b) != null && (viewGroupM25184b = AbstractC11284uO1.m25184b(s91)) != null && (viewTreeObserver = viewGroupM25184b.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC0347FV) c10910rT1.f41680d);
        }
        c9271eg0.f26803a = null;
    }

    @InterfaceC9871jM0(name = "enabled")
    public final void setEnabled(C3924dN view, boolean enabled) {
        O90.m5968f(view, "view");
        this.manager.getClass();
        view.setActive(enabled);
    }

    @InterfaceC9871jM0(name = "navigationBarTranslucent")
    public final void setNavigationBarTranslucent(C3924dN view, boolean isNavigationBarTranslucent) {
        O90.m5968f(view, "view");
        this.manager.getClass();
        view.setNavigationBarTranslucent(isNavigationBarTranslucent);
    }

    @InterfaceC9871jM0(name = "preserveEdgeToEdge")
    public final void setPreserveEdgeToEdge(C3924dN view, boolean isPreservingEdgeToEdge) {
        O90.m5968f(view, "view");
        this.manager.getClass();
        view.setPreserveEdgeToEdge(isPreservingEdgeToEdge);
    }

    @InterfaceC9871jM0(name = "statusBarTranslucent")
    public final void setStatusBarTranslucent(C3924dN view, boolean isStatusBarTranslucent) {
        O90.m5968f(view, "view");
        this.manager.getClass();
        view.setStatusBarTranslucent(isStatusBarTranslucent);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public C1932a createViewInstance(S91 context) {
        ViewTreeObserver viewTreeObserver;
        O90.m5968f(context, "context");
        C9271eg0 c9271eg0 = this.manager;
        c9271eg0.getClass();
        if (c9271eg0.f26803a == null) {
            C10910rT1 c10910rT1 = new C10910rT1(context);
            c9271eg0.f26803a = c10910rT1;
            if (C10910rT1.f41676h != context.hashCode()) {
                C10910rT1.f41676h = context.hashCode();
                ViewGroup viewGroupM25184b = AbstractC11284uO1.m25184b(context);
                c10910rT1.m24375J(viewGroupM25184b);
                c10910rT1.f41680d = new ViewTreeObserverOnGlobalLayoutListenerC0347FV(c10910rT1, viewGroupM25184b, 1);
                if (viewGroupM25184b != null && (viewTreeObserver = viewGroupM25184b.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC0347FV) c10910rT1.f41680d);
                }
            }
        }
        return new C3924dN(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1932a view) {
        O90.m5968f(view, "view");
        super.onAfterUpdateTransaction((KeyboardControllerViewManager) view);
        C3924dN c3924dN = (C3924dN) view;
        this.manager.getClass();
        boolean z = c3924dN.f25989f || c3924dN.f25987d;
        if (c3924dN.f25988e != z) {
            c3924dN.f25988e = z;
            Activity currentActivity = c3924dN.f25984a.f10602a.getCurrentActivity();
            if (currentActivity != null) {
                AbstractC9188e12.m17819c(currentActivity.getWindow(), !c3924dN.f25988e);
            }
        }
    }
}
