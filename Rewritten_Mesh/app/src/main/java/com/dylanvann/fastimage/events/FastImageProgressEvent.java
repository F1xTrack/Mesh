package com.dylanvann.fastimage.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p000.AbstractC6550oP;

/* loaded from: classes.dex */
public class FastImageProgressEvent extends AbstractC6550oP {
    private final int mBytesRead;
    private final int mExpectedLength;

    public FastImageProgressEvent(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.mBytesRead = i3;
        this.mExpectedLength = i4;
    }

    @Override // p000.AbstractC6550oP
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("loaded", this.mBytesRead);
        writableMapCreateMap.putInt("total", this.mExpectedLength);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public String getEventName() {
        return "onFastImageProgress";
    }
}
