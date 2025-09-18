package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class HM0 extends AbstractC6260oP {
    public final double a;
    public final boolean b;

    public HM0(int i, double d, boolean z) {
        super(i);
        this.a = d;
        this.b = z;
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", this.a);
        writableMapCreateMap.putBoolean("fromUser", this.b);
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "topChange";
    }
}
