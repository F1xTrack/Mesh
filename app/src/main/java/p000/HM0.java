package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class HM0 extends AbstractC6550oP {

    /* renamed from: a */
    public final double f4241a;

    /* renamed from: b */
    public final boolean f4242b;

    public HM0(int i, double d, boolean z) {
        super(i);
        this.f4241a = d;
        this.f4242b = z;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", this.f4241a);
        writableMapCreateMap.putBoolean("fromUser", this.f4242b);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "topChange";
    }
}
