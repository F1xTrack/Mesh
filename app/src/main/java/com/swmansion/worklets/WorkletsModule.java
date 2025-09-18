package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import com.swmansion.reanimated.NativeWorkletsModuleSpec;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC11495w22;
import p000.InterfaceC0965PK;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = NativeWorkletsModuleSpec.NAME)
/* loaded from: classes2.dex */
public class WorkletsModule extends NativeWorkletsModuleSpec {
    private final AndroidUIScheduler mAndroidUIScheduler;

    @InterfaceC0965PK
    private HybridData mHybridData;
    private final AtomicBoolean mInvalidated;
    private final WorkletsMessageQueueThread mMessageQueueThread;

    static {
        SoLoader.m11076j("worklets");
    }

    public WorkletsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mMessageQueueThread = new WorkletsMessageQueueThread();
        this.mInvalidated = new AtomicBoolean(false);
        this.mAndroidUIScheduler = new AndroidUIScheduler(reactApplicationContext);
    }

    private native HybridData initHybrid(long j, String str, MessageQueueThread messageQueueThread, CallInvokerHolderImpl callInvokerHolderImpl, AndroidUIScheduler androidUIScheduler);

    private native void invalidateCpp();

    public AndroidUIScheduler getAndroidUIScheduler() {
        return this.mAndroidUIScheduler;
    }

    public HybridData getHybridData() {
        return this.mHybridData;
    }

    @Override // com.swmansion.reanimated.NativeWorkletsModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        this.mHybridData = initHybrid(javaScriptContextHolder.get(), str, this.mMessageQueueThread, AbstractC11495w22.m25551a(reactApplicationContext), this.mAndroidUIScheduler);
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        if (this.mInvalidated.getAndSet(true)) {
            return;
        }
        HybridData hybridData = this.mHybridData;
        if (hybridData != null && hybridData.isValid()) {
            invalidateCpp();
        }
        AndroidUIScheduler androidUIScheduler = this.mAndroidUIScheduler;
        synchronized (androidUIScheduler.f20264b) {
            androidUIScheduler.f20264b.set(false);
            androidUIScheduler.invalidate();
        }
    }
}
