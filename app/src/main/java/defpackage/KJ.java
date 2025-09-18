package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class KJ extends C0823Kh1 {
    public final a h;
    public final int i;
    public final double j;
    public final double k;
    public double l = ConfigValue.DOUBLE_DEFAULT_VALUE;

    public KJ(ReadableMap readableMap, a aVar) {
        this.h = aVar;
        this.i = readableMap.getInt("input");
        this.j = readableMap.getDouble("min");
        this.k = readableMap.getDouble("max");
        this.e = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    @Override // defpackage.C0823Kh1, defpackage.T4
    public final String c() {
        return "DiffClampAnimatedNode[" + this.d + "]: InputNodeTag: " + this.i + " min: " + this.j + " max: " + this.k + " lastValue: " + this.l + " super: " + super.c();
    }

    @Override // defpackage.T4
    public final void d() {
        T4 t4I = this.h.i(this.i);
        if (t4I == null || !(t4I instanceof C0823Kh1)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        double dF = ((C0823Kh1) t4I).f();
        double d = dF - this.l;
        this.l = dF;
        this.e = Math.min(Math.max(this.e + d, this.j), this.k);
    }
}
