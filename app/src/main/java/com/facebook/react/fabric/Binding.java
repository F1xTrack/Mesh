package com.facebook.react.fabric;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJg\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b\u001a\u0010\u001bJW\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u0018J\u001b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b$\u0010%J?\u00102\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H&¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\bH&¢\u0006\u0004\b4\u0010\u001fJ\u0017\u00107\u001a\u00020\b2\u0006\u00106\u001a\u000205H&¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\b2\u0006\u00106\u001a\u000205H&¢\u0006\u0004\b9\u00108ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, m22267d2 = {"Lcom/facebook/react/fabric/Binding;", "", "", "surfaceId", "", "moduleName", "Lcom/facebook/react/bridge/NativeMap;", "initialProps", "LTf1;", "startSurface", "(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "offsetX", "offsetY", "", "isRTL", "doLeftAndRightSwapInRTL", "startSurfaceWithConstraints", "(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;FFFFFFZZ)V", "stopSurface", "(I)V", "pointScaleFactor", "setPixelDensity", "(F)V", "setConstraints", "(IFFFFFFZZ)V", "driveCxxAnimations", "()V", "reportMount", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "eventEmitterWrapper", "Lcom/facebook/react/bridge/ReadableNativeMap;", "getInspectorDataForInstance", "(Lcom/facebook/react/fabric/events/EventEmitterWrapper;)Lcom/facebook/react/bridge/ReadableNativeMap;", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "runtimeScheduler", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "Lcom/facebook/react/fabric/events/EventBeatManager;", "eventBeatManager", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "Lcom/facebook/react/fabric/ReactNativeConfig;", "reactNativeConfig", "register", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/fabric/ReactNativeConfig;)V", "unregister", "Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "surfaceHandler", "registerSurface", "(Lcom/facebook/react/fabric/SurfaceHandlerBinding;)V", "unregisterSurface", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public interface Binding {
    void driveCxxAnimations();

    ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    void register(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig);

    void registerSurface(SurfaceHandlerBinding surfaceHandler);

    void reportMount(int surfaceId);

    void setConstraints(int surfaceId, float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean isRTL, boolean doLeftAndRightSwapInRTL);

    void setPixelDensity(float pointScaleFactor);

    void startSurface(int surfaceId, String moduleName, NativeMap initialProps);

    void startSurfaceWithConstraints(int surfaceId, String moduleName, NativeMap initialProps, float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean isRTL, boolean doLeftAndRightSwapInRTL);

    void stopSurface(int surfaceId);

    void unregister();

    void unregisterSurface(SurfaceHandlerBinding surfaceHandler);
}
