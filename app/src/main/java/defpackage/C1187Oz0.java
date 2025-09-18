package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: Oz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1187Oz0 extends AbstractC6260oP {
    public final int a;
    public final float b;

    public C1187Oz0(int i, float f, int i2) {
        super(i);
        this.a = i2;
        this.b = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : f;
    }

    @Override // defpackage.AbstractC6260oP
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        O90.f(rCTEventEmitter, "rctEventEmitter");
        int viewTag = getViewTag();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.a);
        writableMapCreateMap.putDouble("offset", this.b);
        rCTEventEmitter.receiveEvent(viewTag, "topPageScroll", writableMapCreateMap);
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "topPageScroll";
    }
}
