package com.reactnativekeyboardcontroller;

import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
import p000.C8754ag0;
import p000.C8882bg0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardBackgroundViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "Lag0;", "createViewInstance", "(LS91;)Lag0;", "Lbg0;", "manager", "Lbg0;", "react-native-keyboard-controller_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardBackgroundViewManager extends ReactViewManager {
    private final C8882bg0 manager = new C8882bg0();

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardBackgroundView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public C8754ag0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        this.manager.getClass();
        return new C8754ag0(reactContext);
    }
}
