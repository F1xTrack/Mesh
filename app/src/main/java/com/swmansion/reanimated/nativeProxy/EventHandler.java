package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p000.InterfaceC0965PK;
import p000.InterfaceC9009cf1;

@InterfaceC0965PK
/* loaded from: classes2.dex */
public class EventHandler implements RCTEventEmitter {
    InterfaceC9009cf1 mCustomEventNamesResolver;

    @InterfaceC0965PK
    private final HybridData mHybridData;

    @InterfaceC0965PK
    private EventHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(this.mCustomEventNamesResolver.mo2073e(str), i, writableMap);
    }

    public native void receiveEvent(String str, int i, WritableMap writableMap);

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
    }
}
