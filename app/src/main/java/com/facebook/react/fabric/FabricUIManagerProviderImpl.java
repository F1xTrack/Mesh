package com.facebook.react.fabric;

import android.os.Trace;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.events.EventBeatManager;
import p000.ComponentCallbacks2C7803Jk1;
import p000.MT1;

/* loaded from: classes.dex */
public class FabricUIManagerProviderImpl implements UIManagerProvider {
    private final ComponentFactory mComponentFactory;
    private final ReactNativeConfig mConfig;
    private final ComponentCallbacks2C7803Jk1 mViewManagerRegistry;

    public FabricUIManagerProviderImpl(ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig, ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1) {
        this.mComponentFactory = componentFactory;
        this.mConfig = reactNativeConfig;
        this.mViewManagerRegistry = componentCallbacks2C7803Jk1;
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        MT1.m5371b("FabricUIManagerProviderImpl.create");
        EventBeatManager eventBeatManager = new EventBeatManager();
        MT1.m5371b("FabricUIManagerProviderImpl.createUIManager");
        FabricUIManager fabricUIManager = new FabricUIManager(reactApplicationContext, this.mViewManagerRegistry, eventBeatManager);
        Trace.endSection();
        MT1.m5371b("FabricUIManagerProviderImpl.registerBinding");
        BindingImpl bindingImpl = new BindingImpl();
        CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
        RuntimeExecutor runtimeExecutor = catalystInstance.getRuntimeExecutor();
        RuntimeScheduler runtimeScheduler = catalystInstance.getRuntimeScheduler();
        if (runtimeExecutor == null || runtimeScheduler == null) {
            throw new IllegalStateException("Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null");
        }
        bindingImpl.register(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, this.mComponentFactory, this.mConfig);
        Trace.endSection();
        Trace.endSection();
        return fabricUIManager;
    }
}
