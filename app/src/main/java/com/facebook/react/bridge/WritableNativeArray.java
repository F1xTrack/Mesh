package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000.InterfaceC0965PK;
import p000.UN1;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void pushNativeArray(ReadableNativeArray readableNativeArray);

    private native void pushNativeMap(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(ReadableArray readableArray) {
        UN1.m7998b(readableArray == null || (readableArray instanceof ReadableNativeArray), "Illegal type provided");
        pushNativeArray((ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean z);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double d);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int i);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushLong(long j);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(ReadableMap readableMap) {
        UN1.m7998b(readableMap == null || (readableMap instanceof ReadableNativeMap), "Illegal type provided");
        pushNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(String str);
}
