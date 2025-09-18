package p000;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: xV */
/* loaded from: classes.dex */
public final class C7142xV implements InterfaceC7079wV {

    /* renamed from: a */
    public final String f45661a;

    /* renamed from: b */
    public final int f45662b;

    public C7142xV(String str, int i) {
        this.f45661a = str;
        this.f45662b = i;
    }

    /* renamed from: a */
    public final boolean m25906a() {
        if (this.f45662b == 0) {
            return false;
        }
        String strTrim = m25909d().trim();
        if (C0311Ew.f2971e.matcher(strTrim).matches()) {
            return true;
        }
        if (C0311Ew.f2972f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC7222ym.m26234k("[Value: ", strTrim, "] cannot be converted to a boolean."));
    }

    /* renamed from: b */
    public final double m25907b() {
        if (this.f45662b == 0) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        String strTrim = m25909d().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    /* renamed from: c */
    public final long m25908c() {
        if (this.f45662b == 0) {
            return 0L;
        }
        String strTrim = m25909d().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    /* renamed from: d */
    public final String m25909d() {
        return this.f45662b == 0 ? "" : this.f45661a;
    }
}
