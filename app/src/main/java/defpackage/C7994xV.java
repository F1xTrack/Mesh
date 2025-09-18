package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: xV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7994xV implements InterfaceC7804wV {
    public final String a;
    public final int b;

    public C7994xV(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean a() {
        if (this.b == 0) {
            return false;
        }
        String strTrim = d().trim();
        if (C0398Ew.e.matcher(strTrim).matches()) {
            return true;
        }
        if (C0398Ew.f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC8235ym.k("[Value: ", strTrim, "] cannot be converted to a boolean."));
    }

    public final double b() {
        if (this.b == 0) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        String strTrim = d().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AbstractC8235ym.k("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    public final long c() {
        if (this.b == 0) {
            return 0L;
        }
        String strTrim = d().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AbstractC8235ym.k("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    public final String d() {
        return this.b == 0 ? "" : this.a;
    }
}
