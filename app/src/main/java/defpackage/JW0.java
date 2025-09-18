package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class JW0 extends AbstractC6260oP {
    public static final C5649lC0 k = new C5649lC0(3);
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public MW0 i;
    public boolean j;

    public static final void a(JW0 jw0, int i, int i2, MW0 mw0, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6, boolean z) {
        super.init(i, i2);
        jw0.i = mw0;
        jw0.a = f;
        jw0.b = f2;
        jw0.c = f3;
        jw0.d = f4;
        jw0.e = i3;
        jw0.f = i4;
        jw0.g = i5;
        jw0.h = i6;
        jw0.j = z;
    }

    @Override // defpackage.AbstractC6260oP
    public final boolean canCoalesce() {
        return this.i == MW0.d;
    }

    @Override // defpackage.AbstractC6260oP
    public final boolean experimental_isSynchronous() {
        return this.j;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", ConfigValue.DOUBLE_DEFAULT_VALUE);
        writableMapCreateMap.putDouble("bottom", ConfigValue.DOUBLE_DEFAULT_VALUE);
        writableMapCreateMap.putDouble("left", ConfigValue.DOUBLE_DEFAULT_VALUE);
        writableMapCreateMap.putDouble("right", ConfigValue.DOUBLE_DEFAULT_VALUE);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", AbstractC7586vL1.a(this.a));
        writableMapCreateMap2.putDouble("y", AbstractC7586vL1.a(this.b));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble(Snapshot.WIDTH, AbstractC7586vL1.a(this.e));
        writableMapCreateMap3.putDouble(Snapshot.HEIGHT, AbstractC7586vL1.a(this.f));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble(Snapshot.WIDTH, AbstractC7586vL1.a(this.g));
        writableMapCreateMap4.putDouble(Snapshot.HEIGHT, AbstractC7586vL1.a(this.h));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putDouble("x", this.c);
        writableMapCreateMap5.putDouble("y", this.d);
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", getViewTag());
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", true);
        return writableMapCreateMap6;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        TE te = MW0.a;
        MW0 mw0 = this.i;
        UN1.c(mw0);
        te.getClass();
        return TE.J(mw0);
    }

    @Override // defpackage.AbstractC6260oP
    public final void onDispose() {
        try {
            k.d(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("JW0", e);
        }
    }
}
