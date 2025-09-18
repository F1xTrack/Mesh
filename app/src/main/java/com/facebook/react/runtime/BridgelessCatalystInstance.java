package com.facebook.react.runtime;

import android.content.res.AssetManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collection;
import kotlin.Metadata;
import p000.InterfaceC0965PK;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m22267d2 = {"Lcom/facebook/react/runtime/BridgelessCatalystInstance;", "Lcom/facebook/react/bridge/CatalystInstance;", "", "callbackID", "Lcom/facebook/react/bridge/NativeArrayInterface;", "arguments", "LTf1;", "invokeCallback", "(ILcom/facebook/react/bridge/NativeArrayInterface;)V", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public final class BridgelessCatalystInstance implements CatalystInstance {
    @Override // com.facebook.react.bridge.CatalystInstance
    public final void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        O90.m5968f(notThreadSafeBridgeIdleDebugListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw new UnsupportedOperationException("Unimplemented method 'addBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void callFunction(String str, String str2, NativeArray nativeArray) {
        O90.m5968f(str, "module");
        O90.m5968f(str2, "method");
        throw new UnsupportedOperationException("Unimplemented method 'callFunction'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    /* renamed from: destroy */
    public final void lambda$onNativeException$6() {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        O90.m5968f(nativeModuleRegistry, "modules");
        throw new UnsupportedOperationException("Unimplemented method 'extendNativeModules'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final UIManager getFabricUIManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final CallInvokerHolder getJSCallInvokerHolder() {
        throw null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final JavaScriptModule getJSModule(Class cls) {
        O90.m5968f(cls, "jsInterface");
        throw null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        throw null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder() {
        throw new UnsupportedOperationException("Unimplemented method 'getNativeMethodCallInvokerHolder'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final NativeModule getNativeModule(Class cls) {
        O90.m5968f(cls, "nativeModuleInterface");
        throw null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final Collection getNativeModules() {
        throw null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final ReactQueueConfiguration getReactQueueConfiguration() {
        throw null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final RuntimeExecutor getRuntimeExecutor() {
        throw null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final RuntimeScheduler getRuntimeScheduler() {
        throw new UnsupportedOperationException("Unimplemented method 'getRuntimeScheduler'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final String getSourceURL() {
        throw new UnsupportedOperationException("Unimplemented method 'getSourceURL'");
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public final void handleMemoryPressure(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'handleMemoryPressure'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final boolean hasNativeModule(Class cls) {
        O90.m5968f(cls, "nativeModuleInterface");
        throw null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final boolean hasRunJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'hasRunJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void initialize() {
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    @InterfaceC0965PK
    public void invokeCallback(int callbackID, NativeArrayInterface arguments) {
        O90.m5968f(arguments, "arguments");
        throw new UnsupportedOperationException("Unimplemented method 'invokeCallback'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final boolean isDestroyed() {
        throw new UnsupportedOperationException("Unimplemented method 'isDestroyed'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public final void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        O90.m5968f(assetManager, "assetManager");
        O90.m5968f(str, "assetURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromAssets'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public final void loadScriptFromFile(String str, String str2, boolean z) {
        O90.m5968f(str, "fileName");
        O90.m5968f(str2, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromFile'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public final void loadSplitBundleFromFile(String str, String str2) {
        O90.m5968f(str, "fileName");
        O90.m5968f(str2, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadSplitBundleFromFile'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void registerSegment(int i, String str) {
        O90.m5968f(str, "path");
        throw new UnsupportedOperationException("Unimplemented method 'registerSegment'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        O90.m5968f(notThreadSafeBridgeIdleDebugListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw new UnsupportedOperationException("Unimplemented method 'removeBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void runJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'runJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void setFabricUIManager(UIManager uIManager) {
        O90.m5968f(uIManager, "fabricUIManager");
        throw new UnsupportedOperationException("Unimplemented method 'setFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void setGlobalVariable(String str, String str2) {
        O90.m5968f(str, "propName");
        O90.m5968f(str2, "jsonValue");
        throw new UnsupportedOperationException("Unimplemented method 'setGlobalVariable'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public final void setSourceURLs(String str, String str2) {
        O90.m5968f(str, "deviceURL");
        O90.m5968f(str2, "remoteURL");
        throw new UnsupportedOperationException("Unimplemented method 'setSourceURLs'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        O90.m5968f(turboModuleRegistry, "turboModuleRegistry");
        throw new UnsupportedOperationException("Unimplemented method 'setTurboModuleRegistry'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final NativeModule getNativeModule(String str) {
        O90.m5968f(str, "moduleName");
        throw null;
    }
}
