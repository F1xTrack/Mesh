package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: Kh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0823Kh1 extends T4 {
    public double e = Double.NaN;
    public double f = ConfigValue.DOUBLE_DEFAULT_VALUE;
    public C1204Pf g;

    @Override // defpackage.T4
    public String c() {
        return "ValueAnimatedNode[" + this.d + "]: value: " + this.e + " offset: " + this.f;
    }

    public Object e() {
        return null;
    }

    public final double f() {
        if (Double.isNaN(this.f + this.e)) {
            d();
        }
        return this.f + this.e;
    }
}
