package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class BD extends AbstractC4087h5 {
    public final double e;
    public double f;
    public long g;
    public double h;
    public double i;
    public int j;
    public int k;

    public BD(ReadableMap readableMap) {
        this.e = readableMap.getDouble("velocity");
        a(readableMap);
    }

    @Override // defpackage.AbstractC4087h5
    public final void a(ReadableMap readableMap) {
        this.f = readableMap.getDouble("deceleration");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.j = i;
        this.k = 1;
        this.a = i == 0;
        this.g = -1L;
        this.h = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.i = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    @Override // defpackage.AbstractC4087h5
    public final void b(long j) {
        long j2 = j / 1000000;
        if (this.g == -1) {
            this.g = j2 - 16;
            double d = this.h;
            if (d == this.i) {
                this.h = this.b.e;
            } else {
                this.b.e = d;
            }
            this.i = this.b.e;
        }
        double d2 = this.h;
        double d3 = this.f;
        double dExp = ((1.0d - Math.exp((-(1.0d - d3)) * (j2 - this.g))) * (this.e / (1.0d - d3))) + d2;
        if (Math.abs(this.i - dExp) < 0.1d) {
            int i = this.j;
            if (i != -1 && this.k >= i) {
                this.a = true;
                return;
            } else {
                this.g = -1L;
                this.k++;
            }
        }
        this.i = dExp;
        this.b.e = dExp;
    }
}
