package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import p000.AbstractC3929dS;
import p000.G41;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class StateWrapperImpl implements G41 {
    private static final String TAG = "StateWrapperImpl";
    private volatile boolean mDestroyed = false;

    @InterfaceC0965PK
    private final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    private StateWrapperImpl() {
    }

    private native ReadableNativeMap getStateDataImpl();

    private native ReadableMapBuffer getStateMapBufferDataImpl();

    private static native HybridData initHybrid();

    @Override // p000.G41
    public void destroyState() {
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        this.mHybridData.resetNative();
    }

    @Override // p000.G41
    public ReadableNativeMap getStateData() {
        if (!this.mDestroyed) {
            return getStateDataImpl();
        }
        AbstractC3929dS.m17672e(TAG);
        return null;
    }

    @Override // p000.G41
    public ReadableMapBuffer getStateDataMapBuffer() {
        if (!this.mDestroyed) {
            return getStateMapBufferDataImpl();
        }
        AbstractC3929dS.m17672e(TAG);
        return null;
    }

    public String toString() {
        if (this.mDestroyed) {
            return "<destroyed>";
        }
        ReadableMapBuffer stateMapBufferDataImpl = getStateMapBufferDataImpl();
        if (stateMapBufferDataImpl != null) {
            return stateMapBufferDataImpl.toString();
        }
        ReadableNativeMap stateDataImpl = getStateDataImpl();
        return stateDataImpl == null ? "<unexpected null>" : stateDataImpl.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.G41
    public void updateState(WritableMap writableMap) {
        if (this.mDestroyed) {
            AbstractC3929dS.m17672e(TAG);
        } else {
            updateStateImpl((NativeMap) writableMap);
        }
    }

    public native void updateStateImpl(NativeMap nativeMap);
}
