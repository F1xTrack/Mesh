package com.facebook.react.modules.devloading;

import com.facebook.fbreact.specs.NativeDevLoadingViewSpec;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import p000.C1592ZI;
import p000.InterfaceC1656aJ;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.RunnableC0204DE;
import p000.RunnableC3973eA;

@InterfaceC9101dL0(name = "DevLoadingView")
@Metadata(m22266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m22267d2 = {"Lcom/facebook/react/modules/devloading/DevLoadingModule;", "Lcom/facebook/fbreact/specs/NativeDevLoadingViewSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "message", "", "color", "backgroundColor", "LTf1;", "showMessage", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "hide", "()V", "Lcom/facebook/react/bridge/JSExceptionHandler;", "jsExceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "LaJ;", "devLoadingViewManager", "LaJ;", "Companion", "ZI", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DevLoadingModule extends NativeDevLoadingViewSpec {
    public static final C1592ZI Companion = new C1592ZI();
    public static final String NAME = "DevLoadingView";
    private InterfaceC1656aJ devLoadingViewManager;
    private final JSExceptionHandler jsExceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLoadingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.jsExceptionHandler = reactApplicationContext.getJSExceptionHandler();
    }

    public static final void showMessage$lambda$0(DevLoadingModule devLoadingModule, String str) {
        O90.m5968f(devLoadingModule, "this$0");
        O90.m5968f(str, "$message");
    }

    @Override // com.facebook.fbreact.specs.NativeDevLoadingViewSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new RunnableC0204DE(7, this));
    }

    @Override // com.facebook.fbreact.specs.NativeDevLoadingViewSpec
    public void showMessage(String message, Double color, Double backgroundColor) {
        O90.m5968f(message, "message");
        UiThreadUtil.runOnUiThread(new RunnableC3973eA(this, 14, message));
    }
}
