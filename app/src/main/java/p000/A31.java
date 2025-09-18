package p000;

import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class A31 {

    /* renamed from: a */
    public double f34a;

    /* renamed from: b */
    public double f35b;

    /* renamed from: c */
    public boolean f36c;

    /* renamed from: d */
    public double f37d;

    /* renamed from: e */
    public double f38e;

    /* renamed from: f */
    public double f39f;

    /* renamed from: g */
    public double f40g;

    /* renamed from: h */
    public double f41h;

    /* renamed from: i */
    public double f42i;

    /* renamed from: j */
    public final C0023AM f43j;

    public A31() {
        this.f34a = Math.sqrt(1500.0d);
        this.f35b = 0.5d;
        this.f36c = false;
        this.f42i = Double.MAX_VALUE;
        this.f43j = new C0023AM();
    }

    /* renamed from: a */
    public final C0023AM m40a(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f36c) {
            if (this.f42i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f35b;
            if (d3 > 1.0d) {
                double d4 = this.f34a;
                this.f39f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f35b;
                double d6 = this.f34a;
                this.f40g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= ConfigValue.DOUBLE_DEFAULT_VALUE && d3 < 1.0d) {
                this.f41h = Math.sqrt(1.0d - (d3 * d3)) * this.f34a;
            }
            this.f36c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f42i;
        double d9 = this.f35b;
        if (d9 > 1.0d) {
            double d10 = this.f40g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f39f);
            double d12 = d8 - d11;
            dPow = (Math.pow(2.718281828459045d, this.f39f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f40g;
            double dPow2 = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f39f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow2;
        } else if (d9 == 1.0d) {
            double d15 = this.f34a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f34a) * d7) * d17;
            double d18 = -this.f34a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow4 * d18);
            dPow = dPow3;
        } else {
            double d19 = 1.0d / this.f41h;
            double d20 = this.f34a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            double dSin = ((Math.sin(this.f41h * d7) * d21) + (Math.cos(this.f41h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f34a;
            double d23 = this.f35b;
            double d24 = (-d22) * dSin * d23;
            double dPow5 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f41h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f41h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow5) + d24;
            dPow = dSin;
        }
        float f = (float) (dPow + this.f42i);
        C0023AM c0023am = this.f43j;
        c0023am.f173a = f;
        c0023am.f174b = (float) dCos;
        return c0023am;
    }

    public A31(float f) {
        this.f34a = Math.sqrt(1500.0d);
        this.f35b = 0.5d;
        this.f36c = false;
        this.f43j = new C0023AM();
        this.f42i = f;
    }
}
