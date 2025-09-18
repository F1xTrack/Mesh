package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.C3978eF;
import p000.InterfaceC0965PK;
import p000.O90;
import p000.XZ1;

@Metadata(m22266d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0003J(\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0096 ¢\u0006\u0004\b\u001a\u0010\u001bJh\u0010&\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0096 ¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0096 ¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u001cH\u0096 ¢\u0006\u0004\b+\u0010,JX\u0010-\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0096 ¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b/\u0010\u0003J\u0018\u00100\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0096 ¢\u0006\u0004\b0\u0010)J\u001c\u00104\u001a\u0004\u0018\u0001032\b\u00102\u001a\u0004\u0018\u000101H\u0096 ¢\u0006\u0004\b4\u00105J?\u00109\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00106\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00107\u001a\u00020\f2\u0006\u0010\u000f\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u0010\u0003J\u0018\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020<H\u0096 ¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00102\u0006\u0010=\u001a\u00020<H\u0096 ¢\u0006\u0004\b@\u0010?R\u001a\u0010B\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010\u0003¨\u0006F"}, m22267d2 = {"Lcom/facebook/react/fabric/BindingImpl;", "Lcom/facebook/react/fabric/Binding;", "<init>", "()V", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "runtimeScheduler", "Lcom/facebook/react/fabric/FabricUIManager;", "uiManager", "Lcom/facebook/react/fabric/events/EventBeatManager;", "eventBeatManager", "Lcom/facebook/react/fabric/ComponentFactory;", "componentsRegistry", "", "reactNativeConfig", "LTf1;", "installFabricUIManager", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Ljava/lang/Object;)V", "uninstallFabricUIManager", "", "surfaceId", "", "moduleName", "Lcom/facebook/react/bridge/NativeMap;", "initialProps", "startSurface", "(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "offsetX", "offsetY", "", "isRTL", "doLeftAndRightSwapInRTL", "startSurfaceWithConstraints", "(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;FFFFFFZZ)V", "stopSurface", "(I)V", "pointScaleFactor", "setPixelDensity", "(F)V", "setConstraints", "(IFFFFFFZZ)V", "driveCxxAnimations", "reportMount", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "eventEmitterWrapper", "Lcom/facebook/react/bridge/ReadableNativeMap;", "getInspectorDataForInstance", "(Lcom/facebook/react/fabric/events/EventEmitterWrapper;)Lcom/facebook/react/bridge/ReadableNativeMap;", "fabricUIManager", "componentFactory", "Lcom/facebook/react/fabric/ReactNativeConfig;", "register", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/fabric/ReactNativeConfig;)V", "unregister", "Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "surfaceHandler", "registerSurface", "(Lcom/facebook/react/fabric/SurfaceHandlerBinding;)V", "unregisterSurface", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Companion", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public final class BindingImpl implements Binding {
    private static final Companion Companion = new Companion(null);

    @InterfaceC0965PK
    private final HybridData mHybridData = Companion.initHybrid();

    @Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0083 ¨\u0006\u0005"}, m22267d2 = {"Lcom/facebook/react/fabric/BindingImpl$Companion;", "", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData initHybrid() {
            return BindingImpl.initHybrid();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
        C3978eF.m17883a();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid();

    private final native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager uiManager, EventBeatManager eventBeatManager, ComponentFactory componentsRegistry, Object reactNativeConfig);

    private final native void uninstallFabricUIManager();

    @Override // com.facebook.react.fabric.Binding
    public native void driveCxxAnimations();

    @Override // com.facebook.react.fabric.Binding
    public native ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    @Override // com.facebook.react.fabric.Binding
    public void register(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig) {
        O90.m5968f(runtimeExecutor, "runtimeExecutor");
        O90.m5968f(runtimeScheduler, "runtimeScheduler");
        O90.m5968f(fabricUIManager, "fabricUIManager");
        O90.m5968f(eventBeatManager, "eventBeatManager");
        O90.m5968f(componentFactory, "componentFactory");
        O90.m5968f(reactNativeConfig, "reactNativeConfig");
        fabricUIManager.setBinding(this);
        installFabricUIManager(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, componentFactory, reactNativeConfig);
        setPixelDensity(XZ1.m9088d().density);
    }

    @Override // com.facebook.react.fabric.Binding
    public native void registerSurface(SurfaceHandlerBinding surfaceHandler);

    @Override // com.facebook.react.fabric.Binding
    public native void reportMount(int surfaceId);

    @Override // com.facebook.react.fabric.Binding
    public native void setConstraints(int surfaceId, float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean isRTL, boolean doLeftAndRightSwapInRTL);

    @Override // com.facebook.react.fabric.Binding
    public native void setPixelDensity(float pointScaleFactor);

    @Override // com.facebook.react.fabric.Binding
    public native void startSurface(int surfaceId, String moduleName, NativeMap initialProps);

    @Override // com.facebook.react.fabric.Binding
    public native void startSurfaceWithConstraints(int surfaceId, String moduleName, NativeMap initialProps, float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean isRTL, boolean doLeftAndRightSwapInRTL);

    @Override // com.facebook.react.fabric.Binding
    public native void stopSurface(int surfaceId);

    @Override // com.facebook.react.fabric.Binding
    public void unregister() {
        uninstallFabricUIManager();
    }

    @Override // com.facebook.react.fabric.Binding
    public native void unregisterSurface(SurfaceHandlerBinding surfaceHandler);
}
