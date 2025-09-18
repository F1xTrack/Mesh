package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricSoLoader;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class EventEmitterWrapper {

    @InterfaceC0965PK
    private final HybridData mHybridData;

    static {
        FabricSoLoader.staticInit();
    }

    @InterfaceC0965PK
    private EventEmitterWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void dispatchEvent(String str, NativeMap nativeMap, int i);

    private native void dispatchEventSynchronously(String str, NativeMap nativeMap);

    private native void dispatchUniqueEvent(String str, NativeMap nativeMap);

    private boolean isValid() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            return hybridData.isValid();
        }
        return false;
    }

    public synchronized void destroy() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void dispatch(String str, WritableMap writableMap, int i) {
        if (isValid()) {
            dispatchEvent(str, (NativeMap) writableMap, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void dispatchEventSynchronously(String str, WritableMap writableMap) {
        if (isValid()) {
            dispatchEventSynchronously(str, (NativeMap) writableMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void dispatchUnique(String str, WritableMap writableMap) {
        if (isValid()) {
            dispatchUniqueEvent(str, (NativeMap) writableMap);
        }
    }
}
