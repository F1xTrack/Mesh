package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: Oz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8092Oz0 extends AbstractC6550oP {

    /* renamed from: a */
    public final int f8767a;

    /* renamed from: b */
    public final float f8768b;

    public C8092Oz0(int i, float f, int i2) {
        super(i);
        this.f8767a = i2;
        this.f8768b = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : f;
    }

    @Override // p000.AbstractC6550oP
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        O90.m5968f(rCTEventEmitter, "rctEventEmitter");
        int viewTag = getViewTag();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.f8767a);
        writableMapCreateMap.putDouble("offset", this.f8768b);
        rCTEventEmitter.receiveEvent(viewTag, "topPageScroll", writableMapCreateMap);
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "topPageScroll";
    }
}
