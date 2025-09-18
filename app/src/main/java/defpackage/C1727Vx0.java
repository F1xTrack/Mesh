package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: Vx0 */
/* loaded from: classes.dex */
public final class C1727Vx0 extends AbstractC6260oP {
    public static final C5649lC0 e = new C5649lC0(20);
    public int a;
    public int b;
    public int c;
    public int d;

    public static C1727Vx0 a(int i, int i2, int i3, int i4, int i5) {
        C1727Vx0 c1727Vx0 = (C1727Vx0) e.i();
        if (c1727Vx0 == null) {
            c1727Vx0 = new C1727Vx0();
        }
        super.init(-1, i);
        c1727Vx0.a = i2;
        c1727Vx0.b = i3;
        c1727Vx0.c = i4;
        c1727Vx0.d = i5;
        return c1727Vx0;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", AbstractC7586vL1.a(this.a));
        writableMapCreateMap.putDouble("y", AbstractC7586vL1.a(this.b));
        writableMapCreateMap.putDouble(Snapshot.WIDTH, AbstractC7586vL1.a(this.c));
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, AbstractC7586vL1.a(this.d));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "topLayout";
    }

    @Override // defpackage.AbstractC6260oP
    public final void onDispose() {
        e.d(this);
    }
}
