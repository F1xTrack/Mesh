package p000;

import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: y31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11751y31 extends AbstractC4157h5 {

    /* renamed from: e */
    public long f46051e;

    /* renamed from: f */
    public boolean f46052f;

    /* renamed from: g */
    public double f46053g;

    /* renamed from: h */
    public double f46054h;

    /* renamed from: i */
    public double f46055i;

    /* renamed from: j */
    public double f46056j;

    /* renamed from: k */
    public boolean f46057k;

    /* renamed from: l */
    public final TB0 f46058l;

    /* renamed from: m */
    public double f46059m;

    /* renamed from: n */
    public double f46060n;

    /* renamed from: o */
    public double f46061o;

    /* renamed from: p */
    public double f46062p;

    /* renamed from: q */
    public double f46063q;

    /* renamed from: r */
    public int f46064r;

    /* renamed from: s */
    public int f46065s;

    /* renamed from: t */
    public double f46066t;

    public C11751y31(ReadableMap readableMap) {
        TB0 tb0 = new TB0();
        this.f46058l = tb0;
        tb0.f11195b = readableMap.getDouble("initialVelocity");
        mo558a(readableMap);
    }

    @Override // p000.AbstractC4157h5
    /* renamed from: a */
    public final void mo558a(ReadableMap readableMap) {
        this.f46053g = readableMap.getDouble("stiffness");
        this.f46054h = readableMap.getDouble("damping");
        this.f46055i = readableMap.getDouble("mass");
        this.f46056j = this.f46058l.f11195b;
        this.f46060n = readableMap.getDouble("toValue");
        this.f46061o = readableMap.getDouble("restSpeedThreshold");
        this.f46062p = readableMap.getDouble("restDisplacementThreshold");
        this.f46057k = readableMap.getBoolean("overshootClamping");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f46064r = i;
        this.f28239a = i == 0;
        this.f46065s = 0;
        this.f46063q = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f46052f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    @Override // p000.AbstractC4157h5
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo559b(long r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11751y31.mo559b(long):void");
    }

    /* renamed from: c */
    public final boolean m26042c() {
        TB0 tb0 = this.f46058l;
        return Math.abs(tb0.f11195b) <= this.f46061o && (Math.abs(this.f46060n - tb0.f11194a) <= this.f46062p || this.f46053g == ConfigValue.DOUBLE_DEFAULT_VALUE);
    }
}
