package com.facebook.react.bridge;

import java.util.Map;
import p000.AbstractC10707pu0;
import p000.UN1;

/* loaded from: classes.dex */
public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";
    private final ReactApplicationContext mReactApplicationContext;

    public BaseJavaModule() {
        this(null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map<String, Object> getConstants() {
        return null;
    }

    public final ReactApplicationContext getReactApplicationContext() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        UN1.m8000d(reactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        return reactApplicationContext;
    }

    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.hasActiveReactInstance()) {
            return this.mReactApplicationContext;
        }
        ReactSoftExceptionLogger.logSoftException("ReactNative", new RuntimeException("React Native Instance has already disappeared: requested by " + getName()));
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public /* synthetic */ void onCatalystInstanceDestroy() {
        AbstractC10707pu0.m23884b(this);
    }

    public BaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }
}
