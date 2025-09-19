package com.horcrux.svg.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p000.AbstractC6550oP;
import p000.C11121t70;

/* loaded from: classes.dex */
public class SvgLoadEvent extends AbstractC6550oP {
    public static final String EVENT_NAME = "topLoad";
    private final float height;
    private final String uri;
    private final float width;

    public SvgLoadEvent(int i, int i2, ReactContext reactContext, String str, float f, float f2) {
        super(i, i2);
        new C11121t70(reactContext, str);
        this.uri = str;
        this.width = f;
        this.height = f2;
    }

    @Override // p000.AbstractC6550oP
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    @Override // p000.AbstractC6550oP
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // p000.AbstractC6550oP
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(Snapshot.WIDTH, this.width);
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, this.height);
        writableMapCreateMap.putString("uri", this.uri);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("source", writableMapCreateMap);
        return writableMapCreateMap2;
    }

    @Override // p000.AbstractC6550oP
    public String getEventName() {
        return EVENT_NAME;
    }
}
