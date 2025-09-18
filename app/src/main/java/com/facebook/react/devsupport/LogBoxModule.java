package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import p000.AbstractC3929dS;
import p000.C9537gl0;
import p000.G10;
import p000.InterfaceC1839cJ;
import p000.InterfaceC9101dL0;
import p000.K61;
import p000.O90;
import p000.RunnableC9409fl0;

@InterfaceC9101dL0(name = "LogBox")
@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m22267d2 = {"Lcom/facebook/react/devsupport/LogBoxModule;", "Lcom/facebook/fbreact/specs/NativeLogBoxSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LcJ;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LcJ;)V", "LTf1;", "show", "()V", "hide", "invalidate", "LcJ;", "LK61;", "surfaceDelegate", "LK61;", "Companion", "gl0", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class LogBoxModule extends NativeLogBoxSpec {
    public static final C9537gl0 Companion = new C9537gl0();
    public static final String NAME = "LogBox";
    private final InterfaceC1839cJ devSupportManager;
    private final K61 surfaceDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxModule(ReactApplicationContext reactApplicationContext, InterfaceC1839cJ interfaceC1839cJ) {
        super(reactApplicationContext);
        O90.m5968f(interfaceC1839cJ, "devSupportManager");
        this.devSupportManager = interfaceC1839cJ;
        this.surfaceDelegate = new G10(interfaceC1839cJ);
        UiThreadUtil.runOnUiThread(new RunnableC9409fl0(this, 1));
    }

    public static final void _init_$lambda$0(LogBoxModule logBoxModule) {
        O90.m5968f(logBoxModule, "this$0");
        G10 g10 = (G10) logBoxModule.surfaceDelegate;
        g10.getClass();
        ((InterfaceC1839cJ) g10.f3531b).getClass();
        AbstractC3929dS.m17672e("ReactNative");
    }

    public static final void hide$lambda$2(LogBoxModule logBoxModule) {
        O90.m5968f(logBoxModule, "this$0");
        ((G10) logBoxModule.surfaceDelegate).getClass();
    }

    public static final void invalidate$lambda$3(LogBoxModule logBoxModule) {
        O90.m5968f(logBoxModule, "this$0");
        ((G10) logBoxModule.surfaceDelegate).getClass();
    }

    private static final void show$lambda$1(LogBoxModule logBoxModule) {
        O90.m5968f(logBoxModule, "this$0");
        ((G10) logBoxModule.surfaceDelegate).getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new RunnableC9409fl0(this, 0));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        UiThreadUtil.runOnUiThread(new RunnableC9409fl0(this, 2));
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        ((G10) this.surfaceDelegate).getClass();
    }
}
