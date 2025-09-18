package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: KJ */
/* loaded from: classes.dex */
public final class C0650KJ extends C7849Kh1 {

    /* renamed from: h */
    public final C1881a f5984h;

    /* renamed from: i */
    public final int f5985i;

    /* renamed from: j */
    public final double f5986j;

    /* renamed from: k */
    public final double f5987k;

    /* renamed from: l */
    public double f5988l = ConfigValue.DOUBLE_DEFAULT_VALUE;

    public C0650KJ(ReadableMap readableMap, C1881a c1881a) {
        this.f5984h = c1881a;
        this.f5985i = readableMap.getInt("input");
        this.f5986j = readableMap.getDouble("min");
        this.f5987k = readableMap.getDouble("max");
        this.f6259e = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    @Override // p000.C7849Kh1, p000.AbstractC1200T4
    /* renamed from: c */
    public final String mo2442c() {
        return "DiffClampAnimatedNode[" + this.f11143d + "]: InputNodeTag: " + this.f5985i + " min: " + this.f5986j + " max: " + this.f5987k + " lastValue: " + this.f5988l + " super: " + super.mo2442c();
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: d */
    public final void mo3769d() {
        AbstractC1200T4 abstractC1200T4M10932i = this.f5984h.m10932i(this.f5985i);
        if (abstractC1200T4M10932i == null || !(abstractC1200T4M10932i instanceof C7849Kh1)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        double dM4701f = ((C7849Kh1) abstractC1200T4M10932i).m4701f();
        double d = dM4701f - this.f5988l;
        this.f5988l = dM4701f;
        this.f6259e = Math.min(Math.max(this.f6259e + d, this.f5986j), this.f5987k);
    }
}
