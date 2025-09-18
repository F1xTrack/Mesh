package com.facebook.react.bridge;

import android.content.Context;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;
import p000.AbstractC3929dS;
import p000.InterfaceC0965PK;
import p000.UN1;

/* loaded from: classes.dex */
public class BridgeReactContext extends ReactApplicationContext {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
    private static final String EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module before CatalystInstance has been set!";
    private static final String LATE_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module after the React instance was destroyed.";
    private static final String LATE_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module after CatalystInstance has been destroyed!";
    private static final String TAG = "BridgeReactContext";
    private CatalystInstance mCatalystInstance;
    private volatile boolean mDestroyed;

    @InterfaceC0965PK
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public BridgeReactContext(Context context) {
        super(context);
        this.mDestroyed = false;
    }

    private void raiseCatalystInstanceMissingException() {
        throw new IllegalStateException(this.mDestroyed ? LATE_NATIVE_MODULE_EXCEPTION_MESSAGE : EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mDestroyed = true;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.lambda$onNativeException$6();
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        UN1.m7999c(catalystInstance);
        return catalystInstance;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.mCatalystInstance.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJSCallInvokerHolder();
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        if (this.mCatalystInstance != null) {
            InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
            return (interopModuleRegistry == null || !interopModuleRegistry.shouldReturnInteropModule(cls)) ? (T) this.mCatalystInstance.getJSModule(cls) : (T) this.mInteropModuleRegistry.getInteropModule(cls);
        }
        if (this.mDestroyed) {
            throw new IllegalStateException(LATE_JS_ACCESS_EXCEPTION_MESSAGE);
        }
        throw new IllegalStateException(EARLY_JS_ACCESS_EXCEPTION_MESSAGE);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return (T) this.mCatalystInstance.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection<NativeModule> getNativeModules() {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance == null) {
            return null;
        }
        return catalystInstance.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        boolean z = (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
        boolean z2 = getJSExceptionHandler() != null;
        if (z && z2) {
            getJSExceptionHandler().handleException(exc);
        } else {
            AbstractC3929dS.m17675h("ReactNative");
            throw new IllegalStateException(exc);
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasCatalystInstance() {
        return this.mCatalystInstance != null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.mCatalystInstance != null;
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        }
        if (this.mCatalystInstance != null) {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot initialize ReactContext after it has been destroyed."));
        }
        this.mCatalystInstance = catalystInstance;
        initializeMessageQueueThreads(catalystInstance.getReactQueueConfiguration());
        initializeInteropModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean isBridgeless() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i, String str, Callback callback) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        UN1.m7999c(catalystInstance);
        catalystInstance.registerSegment(i, str);
        UN1.m7999c(callback);
        callback.invoke(new Object[0]);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String str) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.getNativeModule(str);
    }
}
