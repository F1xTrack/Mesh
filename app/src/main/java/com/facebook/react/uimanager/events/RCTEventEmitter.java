package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
@Deprecated
/* loaded from: classes.dex */
public interface RCTEventEmitter extends JavaScriptModule {
    @Deprecated
    void receiveEvent(int i, String str, WritableMap writableMap);

    @Deprecated
    void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2);
}
