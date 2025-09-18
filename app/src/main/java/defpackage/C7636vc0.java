package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* renamed from: vc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7636vc0 extends AbstractC6300oc0 {
    public final Serializable a;

    public C7636vc0(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean h(C7636vc0 c7636vc0) {
        Serializable serializable = c7636vc0.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number b() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C6315oh0((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String d() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7636vc0.class != obj.getClass()) {
            return false;
        }
        C7636vc0 c7636vc0 = (C7636vc0) obj;
        Serializable serializable = this.a;
        Serializable serializable2 = c7636vc0.a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (h(this) && h(c7636vc0)) {
            return b().longValue() == c7636vc0.b().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = b().doubleValue();
        double dDoubleValue2 = c7636vc0.b().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (h(this)) {
            jDoubleToLongBits = b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public C7636vc0(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public C7636vc0(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
