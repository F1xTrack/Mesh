package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: lg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5739lg0 extends AbstractC6260oP {
    public static final EnumC5548kg0 f = EnumC5548kg0.b;
    public static final EnumC5548kg0 g = EnumC5548kg0.c;
    public static final EnumC5548kg0 h = EnumC5548kg0.d;
    public static final EnumC5548kg0 i = EnumC5548kg0.e;
    public final EnumC5548kg0 a;
    public final double b;
    public final double c;
    public final int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5739lg0(int i2, int i3, EnumC5548kg0 enumC5548kg0, double d, double d2, int i4, int i5) {
        super(i2, i3);
        O90.f(enumC5548kg0, "event");
        this.a = enumC5548kg0;
        this.b = d;
        this.c = d2;
        this.d = i4;
        this.e = i5;
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("progress", this.c);
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, this.b);
        writableMapCreateMap.putInt("duration", this.d);
        writableMapCreateMap.putInt("target", this.e);
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return this.a.a;
    }
}
