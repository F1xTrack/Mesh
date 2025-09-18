package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: y31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8102y31 extends AbstractC4087h5 {
    public long e;
    public boolean f;
    public double g;
    public double h;
    public double i;
    public double j;
    public boolean k;
    public final TB0 l;
    public double m;
    public double n;
    public double o;
    public double p;
    public double q;
    public int r;
    public int s;
    public double t;

    public C8102y31(ReadableMap readableMap) {
        TB0 tb0 = new TB0();
        this.l = tb0;
        tb0.b = readableMap.getDouble("initialVelocity");
        a(readableMap);
    }

    @Override // defpackage.AbstractC4087h5
    public final void a(ReadableMap readableMap) {
        this.g = readableMap.getDouble("stiffness");
        this.h = readableMap.getDouble("damping");
        this.i = readableMap.getDouble("mass");
        this.j = this.l.b;
        this.n = readableMap.getDouble("toValue");
        this.o = readableMap.getDouble("restSpeedThreshold");
        this.p = readableMap.getDouble("restDisplacementThreshold");
        this.k = readableMap.getBoolean("overshootClamping");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.r = i;
        this.a = i == 0;
        this.s = 0;
        this.q = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    @Override // defpackage.AbstractC4087h5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8102y31.b(long):void");
    }

    public final boolean c() {
        TB0 tb0 = this.l;
        return Math.abs(tb0.b) <= this.o && (Math.abs(this.n - tb0.a) <= this.p || this.g == ConfigValue.DOUBLE_DEFAULT_VALUE);
    }
}
