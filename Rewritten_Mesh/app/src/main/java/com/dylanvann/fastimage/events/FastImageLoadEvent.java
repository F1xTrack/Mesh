package com.dylanvann.fastimage.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p000.AbstractC6550oP;

/* loaded from: classes.dex */
public class FastImageLoadEvent extends AbstractC6550oP {
    private final int height;
    private final int width;

    public FastImageLoadEvent(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.width = i3;
        this.height = i4;
    }

    @Override // p000.AbstractC6550oP
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(Snapshot.WIDTH, this.width);
        writableMapCreateMap.putInt(Snapshot.HEIGHT, this.height);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public String getEventName() {
        return "onFastImageLoad";
    }
}
