package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: Vx0 */
/* loaded from: classes.dex */
public final class C8452Vx0 extends AbstractC6550oP {

    /* renamed from: e */
    public static final C10107lC0 f12881e = new C10107lC0(20);

    /* renamed from: a */
    public int f12882a;

    /* renamed from: b */
    public int f12883b;

    /* renamed from: c */
    public int f12884c;

    /* renamed from: d */
    public int f12885d;

    /* renamed from: a */
    public static C8452Vx0 m8643a(int i, int i2, int i3, int i4, int i5) {
        C8452Vx0 c8452Vx0 = (C8452Vx0) f12881e.mo4581i();
        if (c8452Vx0 == null) {
            c8452Vx0 = new C8452Vx0();
        }
        super.init(-1, i);
        c8452Vx0.f12882a = i2;
        c8452Vx0.f12883b = i3;
        c8452Vx0.f12884c = i4;
        c8452Vx0.f12885d = i5;
        return c8452Vx0;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", AbstractC11406vL1.m25402a(this.f12882a));
        writableMapCreateMap.putDouble("y", AbstractC11406vL1.m25402a(this.f12883b));
        writableMapCreateMap.putDouble(Snapshot.WIDTH, AbstractC11406vL1.m25402a(this.f12884c));
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, AbstractC11406vL1.m25402a(this.f12885d));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "topLayout";
    }

    @Override // p000.AbstractC6550oP
    public final void onDispose() {
        f12881e.mo4580d(this);
    }
}
