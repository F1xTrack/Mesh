package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class AW0 extends AbstractC6260oP {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final short d;

    public AW0(int i, int i2, float f, boolean z, boolean z2, short s) {
        super(i, i2);
        this.a = f;
        this.b = z;
        this.c = z2;
        this.d = s;
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return this.d;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("progress", this.a);
        writableMapCreateMap.putInt("closing", this.b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "topTransitionProgress";
    }
}
