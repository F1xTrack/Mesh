package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class JW0 extends AbstractC6550oP {

    /* renamed from: k */
    public static final C10107lC0 f5565k = new C10107lC0(3);

    /* renamed from: a */
    public float f5566a;

    /* renamed from: b */
    public float f5567b;

    /* renamed from: c */
    public float f5568c;

    /* renamed from: d */
    public float f5569d;

    /* renamed from: e */
    public int f5570e;

    /* renamed from: f */
    public int f5571f;

    /* renamed from: g */
    public int f5572g;

    /* renamed from: h */
    public int f5573h;

    /* renamed from: i */
    public MW0 f5574i;

    /* renamed from: j */
    public boolean f5575j;

    /* renamed from: a */
    public static final void m4338a(JW0 jw0, int i, int i2, MW0 mw0, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6, boolean z) {
        super.init(i, i2);
        jw0.f5574i = mw0;
        jw0.f5566a = f;
        jw0.f5567b = f2;
        jw0.f5568c = f3;
        jw0.f5569d = f4;
        jw0.f5570e = i3;
        jw0.f5571f = i4;
        jw0.f5572g = i5;
        jw0.f5573h = i6;
        jw0.f5575j = z;
    }

    @Override // p000.AbstractC6550oP
    public final boolean canCoalesce() {
        return this.f5574i == MW0.f7205d;
    }

    @Override // p000.AbstractC6550oP
    public final boolean experimental_isSynchronous() {
        return this.f5575j;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", ConfigValue.DOUBLE_DEFAULT_VALUE);
        writableMapCreateMap.putDouble("bottom", ConfigValue.DOUBLE_DEFAULT_VALUE);
        writableMapCreateMap.putDouble("left", ConfigValue.DOUBLE_DEFAULT_VALUE);
        writableMapCreateMap.putDouble("right", ConfigValue.DOUBLE_DEFAULT_VALUE);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", AbstractC11406vL1.m25402a(this.f5566a));
        writableMapCreateMap2.putDouble("y", AbstractC11406vL1.m25402a(this.f5567b));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble(Snapshot.WIDTH, AbstractC11406vL1.m25402a(this.f5570e));
        writableMapCreateMap3.putDouble(Snapshot.HEIGHT, AbstractC11406vL1.m25402a(this.f5571f));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble(Snapshot.WIDTH, AbstractC11406vL1.m25402a(this.f5572g));
        writableMapCreateMap4.putDouble(Snapshot.HEIGHT, AbstractC11406vL1.m25402a(this.f5573h));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putDouble("x", this.f5568c);
        writableMapCreateMap5.putDouble("y", this.f5569d);
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

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        C1210TE c1210te = MW0.f7202a;
        MW0 mw0 = this.f5574i;
        UN1.m7999c(mw0);
        c1210te.getClass();
        return C1210TE.m7635J(mw0);
    }

    @Override // p000.AbstractC6550oP
    public final void onDispose() {
        try {
            f5565k.mo4580d(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("JW0", e);
        }
    }
}
