package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: u01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7328u01 extends AbstractC6260oP {
    public final int a;
    public final boolean b;

    public C7328u01(int i, int i2, int i3, boolean z) {
        super(i, i2);
        this.a = i3;
        this.b = z;
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("index", this.a);
        writableMapCreateMap.putBoolean("isStable", this.b);
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "topSheetDetentChanged";
    }
}
