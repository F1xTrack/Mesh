package com.swmansion.reanimated;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p000.AbstractC6550oP;

/* loaded from: classes2.dex */
public class CopiedEvent {
    private String eventName;
    private WritableMap payload;
    private int targetTag;

    public CopiedEvent(AbstractC6550oP abstractC6550oP) {
        abstractC6550oP.dispatch(new RCTEventEmitter() { // from class: com.swmansion.reanimated.CopiedEvent.1
            @Override // com.facebook.react.uimanager.events.RCTEventEmitter
            public void receiveEvent(int i, String str, WritableMap writableMap) {
                CopiedEvent.this.targetTag = i;
                CopiedEvent.this.eventName = str;
                CopiedEvent.this.payload = writableMap.copy();
            }

            @Override // com.facebook.react.uimanager.events.RCTEventEmitter
            public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
            }
        });
    }

    public String getEventName() {
        return this.eventName;
    }

    public WritableMap getPayload() {
        return this.payload;
    }

    public int getTargetTag() {
        return this.targetTag;
    }
}
