package p000;

import java.math.BigDecimal;

/* renamed from: oh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10553oh0 extends Number {

    /* renamed from: a */
    public final String f39181a;

    public C10553oh0(String str) {
        this.f39181a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f39181a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10553oh0)) {
            return false;
        }
        Object obj2 = ((C10553oh0) obj).f39181a;
        String str = this.f39181a;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f39181a);
    }

    public final int hashCode() {
        return this.f39181a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f39181a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f39181a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f39181a;
    }
}
