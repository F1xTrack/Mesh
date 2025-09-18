package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: ui */
/* loaded from: classes2.dex */
public final class C6966ui extends AbstractC6550oP {

    /* renamed from: a */
    public final double f43796a;

    /* renamed from: b */
    public final double f43797b;

    public C6966ui(int i, int i2, double d, double d2) {
        super(i, i2);
        this.f43796a = d;
        this.f43797b = d2;
    }

    @Override // p000.AbstractC6550oP
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        O90.m5968f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), "onBlankAreaEvent", getEventData());
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("offsetStart", this.f43796a);
        writableMapCreateMap.putDouble("offsetEnd", this.f43797b);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "onBlankAreaEvent";
    }
}
