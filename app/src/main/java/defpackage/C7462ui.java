package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: ui, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7462ui extends AbstractC6260oP {
    public final double a;
    public final double b;

    public C7462ui(int i, int i2, double d, double d2) {
        super(i, i2);
        this.a = d;
        this.b = d2;
    }

    @Override // defpackage.AbstractC6260oP
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        O90.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), "onBlankAreaEvent", getEventData());
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("offsetStart", this.a);
        writableMapCreateMap.putDouble("offsetEnd", this.b);
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "onBlankAreaEvent";
    }
}
