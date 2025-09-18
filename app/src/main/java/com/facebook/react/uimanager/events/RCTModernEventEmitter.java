package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import p000.C11438vb1;

/* loaded from: classes.dex */
public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int i, int i2, String str, WritableMap writableMap);

    void receiveEvent(int i, int i2, String str, boolean z, int i3, WritableMap writableMap, int i4);

    @Deprecated
    void receiveTouches(C11438vb1 c11438vb1);
}
