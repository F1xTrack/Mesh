package com.reactnativekeyboardcontroller;

import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
import p000.C9527gg0;
import p000.C9783ig0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m22267d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "Lgg0;", "createViewInstance", "(LS91;)Lgg0;", "view", "", "offset", "LTf1;", "setInterpolator", "(Lgg0;D)V", "interpolator", "(Lgg0;Ljava/lang/String;)V", "", "value", "setScrollKeyboardOnScreenWhenNotVisible", "(Lgg0;Z)V", "setScrollKeyboardOffScreenWhenVisible", "setTextInputNativeID", "Lig0;", "manager", "Lig0;", "react-native-keyboard-controller_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardGestureAreaViewManager extends ReactViewManager {
    private final C9783ig0 manager = new C9783ig0();

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardGestureArea";
    }

    @InterfaceC9871jM0(name = "offset")
    public final void setInterpolator(C9527gg0 view, double offset) {
        O90.m5968f(view, "view");
        this.manager.getClass();
        view.setOffset(offset);
    }

    @InterfaceC9871jM0(name = "enableSwipeToDismiss")
    public final void setScrollKeyboardOffScreenWhenVisible(C9527gg0 view, boolean value) {
        O90.m5968f(view, "view");
        this.manager.getClass();
        view.setScrollKeyboardOffScreenWhenVisible(value);
    }

    @InterfaceC9871jM0(name = "showOnSwipeUp")
    public final void setScrollKeyboardOnScreenWhenNotVisible(C9527gg0 view, boolean value) {
        O90.m5968f(view, "view");
        this.manager.getClass();
        view.setScrollKeyboardOnScreenWhenNotVisible(value);
    }

    @InterfaceC9871jM0(name = "textInputNativeID")
    public final void setTextInputNativeID(C9527gg0 view, String value) {
        O90.m5968f(view, "view");
        O90.m5968f(value, "value");
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public C9527gg0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        this.manager.getClass();
        return new C9527gg0(reactContext);
    }

    @InterfaceC9871jM0(name = "interpolator")
    public final void setInterpolator(C9527gg0 view, String interpolator) {
        O90.m5968f(view, "view");
        O90.m5968f(interpolator, "interpolator");
        this.manager.getClass();
        view.setInterpolator(interpolator);
    }
}
