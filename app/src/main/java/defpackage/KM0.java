package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class KM0 extends AbstractC6260oP {
    public final /* synthetic */ int a;
    public final double b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KM0(double d, int i, int i2) {
        super(i);
        this.a = i2;
        this.b = d;
    }

    @Override // defpackage.AbstractC6260oP
    public final boolean canCoalesce() {
        switch (this.a) {
        }
        return false;
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        switch (this.a) {
        }
        return (short) 0;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        switch (this.a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("target", getViewTag());
                writableMapCreateMap.putDouble("value", this.b);
                return writableMapCreateMap;
            default:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("target", getViewTag());
                writableMapCreateMap2.putDouble("value", this.b);
                return writableMapCreateMap2;
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topSlidingComplete";
            default:
                return "topSlidingStart";
        }
    }
}
