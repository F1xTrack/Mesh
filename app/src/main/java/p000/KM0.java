package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class KM0 extends AbstractC6550oP {

    /* renamed from: a */
    public final /* synthetic */ int f6031a;

    /* renamed from: b */
    public final double f6032b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KM0(double d, int i, int i2) {
        super(i);
        this.f6031a = i2;
        this.f6032b = d;
    }

    @Override // p000.AbstractC6550oP
    public final boolean canCoalesce() {
        switch (this.f6031a) {
        }
        return false;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        switch (this.f6031a) {
        }
        return (short) 0;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        switch (this.f6031a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("target", getViewTag());
                writableMapCreateMap.putDouble("value", this.f6032b);
                return writableMapCreateMap;
            default:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("target", getViewTag());
                writableMapCreateMap2.putDouble("value", this.f6032b);
                return writableMapCreateMap2;
        }
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        switch (this.f6031a) {
            case 0:
                return "topSlidingComplete";
            default:
                return "topSlidingStart";
        }
    }
}
