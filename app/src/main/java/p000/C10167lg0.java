package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: lg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10167lg0 extends AbstractC6550oP {

    /* renamed from: f */
    public static final EnumC10039kg0 f37236f = EnumC10039kg0.f36600b;

    /* renamed from: g */
    public static final EnumC10039kg0 f37237g = EnumC10039kg0.f36601c;

    /* renamed from: h */
    public static final EnumC10039kg0 f37238h = EnumC10039kg0.f36602d;

    /* renamed from: i */
    public static final EnumC10039kg0 f37239i = EnumC10039kg0.f36603e;

    /* renamed from: a */
    public final EnumC10039kg0 f37240a;

    /* renamed from: b */
    public final double f37241b;

    /* renamed from: c */
    public final double f37242c;

    /* renamed from: d */
    public final int f37243d;

    /* renamed from: e */
    public final int f37244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10167lg0(int i, int i2, EnumC10039kg0 enumC10039kg0, double d, double d2, int i3, int i4) {
        super(i, i2);
        O90.m5968f(enumC10039kg0, "event");
        this.f37240a = enumC10039kg0;
        this.f37241b = d;
        this.f37242c = d2;
        this.f37243d = i3;
        this.f37244e = i4;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("progress", this.f37242c);
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, this.f37241b);
        writableMapCreateMap.putInt("duration", this.f37243d);
        writableMapCreateMap.putInt("target", this.f37244e);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return this.f37240a.f36605a;
    }
}
