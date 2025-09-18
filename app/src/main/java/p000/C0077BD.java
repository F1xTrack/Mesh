package p000;

import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: BD */
/* loaded from: classes.dex */
public final class C0077BD extends AbstractC4157h5 {

    /* renamed from: e */
    public final double f655e;

    /* renamed from: f */
    public double f656f;

    /* renamed from: g */
    public long f657g;

    /* renamed from: h */
    public double f658h;

    /* renamed from: i */
    public double f659i;

    /* renamed from: j */
    public int f660j;

    /* renamed from: k */
    public int f661k;

    public C0077BD(ReadableMap readableMap) {
        this.f655e = readableMap.getDouble("velocity");
        mo558a(readableMap);
    }

    @Override // p000.AbstractC4157h5
    /* renamed from: a */
    public final void mo558a(ReadableMap readableMap) {
        this.f656f = readableMap.getDouble("deceleration");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f660j = i;
        this.f661k = 1;
        this.f28239a = i == 0;
        this.f657g = -1L;
        this.f658h = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f659i = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    @Override // p000.AbstractC4157h5
    /* renamed from: b */
    public final void mo559b(long j) {
        long j2 = j / 1000000;
        if (this.f657g == -1) {
            this.f657g = j2 - 16;
            double d = this.f658h;
            if (d == this.f659i) {
                this.f658h = this.f28240b.f6259e;
            } else {
                this.f28240b.f6259e = d;
            }
            this.f659i = this.f28240b.f6259e;
        }
        double d2 = this.f658h;
        double d3 = this.f656f;
        double dExp = ((1.0d - Math.exp((-(1.0d - d3)) * (j2 - this.f657g))) * (this.f655e / (1.0d - d3))) + d2;
        if (Math.abs(this.f659i - dExp) < 0.1d) {
            int i = this.f660j;
            if (i != -1 && this.f661k >= i) {
                this.f28239a = true;
                return;
            } else {
                this.f657g = -1L;
                this.f661k++;
            }
        }
        this.f659i = dExp;
        this.f28240b.f6259e = dExp;
    }
}
