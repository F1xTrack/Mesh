package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: My1 */
/* loaded from: classes.dex */
public final class C1029My1 implements InterfaceC0877Kz1 {
    public final Double a;

    public C1029My1(Double d) {
        if (d == null) {
            this.a = Double.valueOf(Double.NaN);
        } else {
            this.a = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1029My1) {
            return this.a.equals(((C1029My1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return null;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) throws NumberFormatException {
        if ("toString".equals(str)) {
            return new C1812Wz1(zzf());
        }
        throw new IllegalArgumentException(zzf() + "." + str + " is not a function.");
    }

    public final String toString() {
        return zzf();
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        return new C1029My1(this.a);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        Double d = this.a;
        return Boolean.valueOf((Double.isNaN(d.doubleValue()) || d.doubleValue() == ConfigValue.DOUBLE_DEFAULT_VALUE) ? false : true);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() throws NumberFormatException {
        Double d = this.a;
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
