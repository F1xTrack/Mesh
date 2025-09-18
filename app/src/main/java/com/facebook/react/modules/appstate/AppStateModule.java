package com.facebook.react.modules.appstate;

import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11205tn0;
import p000.C1140S7;
import p000.InterfaceC9101dL0;
import p000.O90;

@InterfaceC9101dL0(name = "AppState")
@Metadata(m22266d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u0013R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m22267d2 = {"Lcom/facebook/react/modules/appstate/AppStateModule;", "Lcom/facebook/fbreact/specs/NativeAppStateSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/WindowFocusChangeListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/WritableMap;", "createAppStateEventMap", "()Lcom/facebook/react/bridge/WritableMap;", "", "eventName", "", "data", "LTf1;", "sendEvent", "(Ljava/lang/String;Ljava/lang/Object;)V", "sendAppStateChangeEvent", "()V", "", "getTypedExportedConstants", "()Ljava/util/Map;", "Lcom/facebook/react/bridge/Callback;", "success", "error", "getCurrentAppState", "(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "onHostResume", "onHostPause", "onHostDestroy", "", "hasFocus", "onWindowFocusChange", "(Z)V", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "invalidate", "appState", "Ljava/lang/String;", "Companion", "S7", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class AppStateModule extends NativeAppStateSpec implements LifecycleEventListener, WindowFocusChangeListener {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    public static final C1140S7 Companion = new C1140S7();
    private static final String INITIAL_STATE = "initialAppState";
    public static final String NAME = "AppState";
    private String appState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        reactApplicationContext.addLifecycleEventListener(this);
        reactApplicationContext.addWindowFocusChangeListener(this);
        this.appState = reactApplicationContext.getLifecycleState() == LifecycleState.f17893c ? APP_STATE_ACTIVE : "background";
    }

    private final WritableMap createAppStateEventMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("app_state", this.appState);
        return writableMapCreateMap;
    }

    private final void sendAppStateChangeEvent() {
        sendEvent("appStateDidChange", createAppStateEventMap());
    }

    private final void sendEvent(String eventName, Object data) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, data);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void addListener(String eventName) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void getCurrentAppState(Callback success, Callback error) {
        O90.m5968f(success, "success");
        success.invoke(createAppStateEventMap());
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public Map<String, Object> getTypedExportedConstants() {
        return AbstractC11205tn0.m24984c(new Pair(INITIAL_STATE, this.appState));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.appState = "background";
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.appState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.WindowFocusChangeListener
    public void onWindowFocusChange(boolean hasFocus) {
        sendEvent("appStateFocusChange", Boolean.valueOf(hasFocus));
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void removeListeners(double count) {
    }
}
