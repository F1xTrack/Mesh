package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import p000.InterfaceC1839cJ;
import p000.InterfaceC9101dL0;
import p000.O90;

@InterfaceC9101dL0(name = NativeDevSettingsSpec.NAME)
@Metadata(m22266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006%"}, m22267d2 = {"Lcom/facebook/react/modules/debug/DevSettingsModule;", "Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LcJ;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LcJ;)V", "LTf1;", "reload", "()V", "", "reason", "reloadWithReason", "(Ljava/lang/String;)V", "onFastRefresh", "", "isHotLoadingEnabled", "setHotLoadingEnabled", "(Z)V", "isDebugginRemotelyEnabled", "setIsDebuggingRemotely", "isProfilingEnabled", "setProfilingEnabled", "toggleElementInspector", "title", "addMenuItem", "openDebugger", "enabled", "setIsShakeToShowDevMenuEnabled", "eventName", "addListener", "", "count", "removeListeners", "(D)V", "LcJ;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DevSettingsModule extends NativeDevSettingsSpec {
    private final InterfaceC1839cJ devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevSettingsModule(ReactApplicationContext reactApplicationContext, InterfaceC1839cJ interfaceC1839cJ) {
        super(reactApplicationContext);
        O90.m5968f(interfaceC1839cJ, "devSupportManager");
        this.devSupportManager = interfaceC1839cJ;
    }

    private static final void addMenuItem$lambda$1(String str, DevSettingsModule devSettingsModule) {
        O90.m5968f(str, "$title");
        O90.m5968f(devSettingsModule, "this$0");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("title", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = devSettingsModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("didPressMenuItem", writableMapCreateMap);
        }
    }

    private static final void reload$lambda$0(DevSettingsModule devSettingsModule) {
        O90.m5968f(devSettingsModule, "this$0");
        devSettingsModule.devSupportManager.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String eventName) {
        O90.m5968f(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(String title) {
        O90.m5968f(title, "title");
        this.devSupportManager.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void openDebugger() {
        this.devSupportManager.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
        this.devSupportManager.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String reason) {
        O90.m5968f(reason, "reason");
        reload();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean isHotLoadingEnabled) {
        this.devSupportManager.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsDebuggingRemotely(boolean isDebugginRemotelyEnabled) {
        this.devSupportManager.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean enabled) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean isProfilingEnabled) {
        this.devSupportManager.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
        this.devSupportManager.getClass();
    }
}
