package com.dylanvann.fastimage.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p000.AbstractC6550oP;

/* loaded from: classes.dex */
public class FastImageLoadStartEvent extends AbstractC6550oP {
    public FastImageLoadStartEvent(int i, int i2) {
        super(i, i2);
    }

    @Override // p000.AbstractC6550oP
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // p000.AbstractC6550oP
    public String getEventName() {
        return "onFastImageLoadStart";
    }
}
