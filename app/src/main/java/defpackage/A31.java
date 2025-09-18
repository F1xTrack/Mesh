package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class A31 {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final AM j;

    public A31() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new AM();
    }

    public final AM a(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.b;
            if (d3 > 1.0d) {
                double d4 = this.a;
                this.f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.b;
                double d6 = this.a;
                this.g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= ConfigValue.DOUBLE_DEFAULT_VALUE && d3 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d3 * d3)) * this.a;
            }
            this.c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.i;
        double d9 = this.b;
        if (d9 > 1.0d) {
            double d10 = this.g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f);
            double d12 = d8 - d11;
            dPow = (Math.pow(2.718281828459045d, this.f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.g;
            double dPow2 = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow2;
        } else if (d9 == 1.0d) {
            double d15 = this.a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow4 = Math.pow(2.718281828459045d, (-this.a) * d7) * d17;
            double d18 = -this.a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow4 * d18);
            dPow = dPow3;
        } else {
            double d19 = 1.0d / this.h;
            double d20 = this.a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            double dSin = ((Math.sin(this.h * d7) * d21) + (Math.cos(this.h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.a;
            double d23 = this.b;
            double d24 = (-d22) * dSin * d23;
            double dPow5 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow5) + d24;
            dPow = dSin;
        }
        float f = (float) (dPow + this.i);
        AM am = this.j;
        am.a = f;
        am.b = (float) dCos;
        return am;
    }

    public A31(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.j = new AM();
        this.i = f;
    }
}
