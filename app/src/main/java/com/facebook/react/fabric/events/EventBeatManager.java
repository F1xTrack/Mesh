package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricSoLoader;
import p000.InterfaceC0965PK;
import p000.InterfaceC1301Ug;

@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public final class EventBeatManager implements InterfaceC1301Ug {

    @InterfaceC0965PK
    private final HybridData mHybridData;

    static {
        FabricSoLoader.staticInit();
    }

    @Deprecated(forRemoval = true, since = "Deprecated on v0.72.0 Use EventBeatManager() instead")
    public EventBeatManager(ReactApplicationContext reactApplicationContext) {
        this();
    }

    private static native HybridData initHybrid();

    private native void tick();

    @Override // p000.InterfaceC1301Ug
    public void onBatchEventDispatched() {
        tick();
    }

    public EventBeatManager() {
        this.mHybridData = initHybrid();
    }
}
