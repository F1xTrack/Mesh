package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: My1 */
/* loaded from: classes.dex */
public final class C7987My1 implements InterfaceC7885Kz1 {

    /* renamed from: a */
    public final Double f7417a;

    public C7987My1(Double d) {
        if (d == null) {
            this.f7417a = Double.valueOf(Double.NaN);
        } else {
            this.f7417a = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7987My1) {
            return this.f7417a.equals(((C7987My1) obj).f7417a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7417a.hashCode();
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return null;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    public final InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) throws NumberFormatException {
        if ("toString".equals(str)) {
            return new C8509Wz1(zzf());
        }
        throw new IllegalArgumentException(zzf() + "." + str + " is not a function.");
    }

    public final String toString() {
        return zzf();
    }

    @Override // p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        return new C7987My1(this.f7417a);
    }

    @Override // p000.InterfaceC7885Kz1
    public final Boolean zzd() {
        Double d = this.f7417a;
        return Boolean.valueOf((Double.isNaN(d.doubleValue()) || d.doubleValue() == ConfigValue.DOUBLE_DEFAULT_VALUE) ? false : true);
    }

    @Override // p000.InterfaceC7885Kz1
    public final Double zze() {
        return this.f7417a;
    }

    @Override // p000.InterfaceC7885Kz1
    public final String zzf() throws NumberFormatException {
        Double d = this.f7417a;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = (bigDecimalValueOf.signum() == 0 || bigDecimalValueOf.signum() == 0) ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }
}
