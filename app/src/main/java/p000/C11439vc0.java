package p000;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* renamed from: vc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11439vc0 extends AbstractC10543oc0 {

    /* renamed from: a */
    public final Serializable f44448a;

    public C11439vc0(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f44448a = bool;
    }

    /* renamed from: h */
    public static boolean m25456h(C11439vc0 c11439vc0) {
        Serializable serializable = c11439vc0.f44448a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: b */
    public final Number m25457b() {
        Serializable serializable = this.f44448a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C10553oh0((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* renamed from: d */
    public final String m25458d() {
        Serializable serializable = this.f44448a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m25457b().toString();
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
        if (obj == null || C11439vc0.class != obj.getClass()) {
            return false;
        }
        C11439vc0 c11439vc0 = (C11439vc0) obj;
        Serializable serializable = this.f44448a;
        Serializable serializable2 = c11439vc0.f44448a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m25456h(this) && m25456h(c11439vc0)) {
            return m25457b().longValue() == c11439vc0.m25457b().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = m25457b().doubleValue();
        double dDoubleValue2 = c11439vc0.m25457b().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f44448a;
        if (serializable == null) {
            return 31;
        }
        if (m25456h(this)) {
            jDoubleToLongBits = m25457b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m25457b().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public C11439vc0(Number number) {
        Objects.requireNonNull(number);
        this.f44448a = number;
    }

    public C11439vc0(String str) {
        Objects.requireNonNull(str);
        this.f44448a = str;
    }
}
