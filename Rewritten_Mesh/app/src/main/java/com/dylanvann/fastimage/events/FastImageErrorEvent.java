package com.dylanvann.fastimage.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p000.AbstractC6550oP;

/* loaded from: classes.dex */
public class FastImageErrorEvent extends AbstractC6550oP {
    private final ReadableMap mSource;

    public FastImageErrorEvent(int i, int i2, ReadableMap readableMap) {
        super(i, i2);
        this.mSource = readableMap;
    }

    @Override // p000.AbstractC6550oP
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (this.mSource != null) {
            writableMapCreateMap.putString("message", "Invalid source prop:" + this.mSource);
        }
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public String getEventName() {
        return "onFastImageError";
    }
}
