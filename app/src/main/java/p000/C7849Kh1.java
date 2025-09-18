package p000;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: Kh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7849Kh1 extends AbstractC1200T4 {

    /* renamed from: e */
    public double f6259e = Double.NaN;

    /* renamed from: f */
    public double f6260f = ConfigValue.DOUBLE_DEFAULT_VALUE;

    /* renamed from: g */
    public C0986Pf f6261g;

    @Override // p000.AbstractC1200T4
    /* renamed from: c */
    public String mo2442c() {
        return "ValueAnimatedNode[" + this.f11143d + "]: value: " + this.f6259e + " offset: " + this.f6260f;
    }

    /* renamed from: e */
    public Object mo3770e() {
        return null;
    }

    /* renamed from: f */
    public final double m4701f() {
        if (Double.isNaN(this.f6260f + this.f6259e)) {
            mo3769d();
        }
        return this.f6260f + this.f6259e;
    }
}
