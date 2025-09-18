package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes2.dex */
public final class H51 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public /* synthetic */ H51() {
        this(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, -1.0d);
    }

    public final WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.a);
        writableMapCreateMap.putDouble("tiltY", this.b);
        writableMapCreateMap.putDouble("altitudeAngle", this.c);
        writableMapCreateMap.putDouble("azimuthAngle", this.d);
        writableMapCreateMap.putDouble("pressure", this.e);
        return writableMapCreateMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H51)) {
            return false;
        }
        H51 h51 = (H51) obj;
        return Double.compare(this.a, h51.a) == 0 && Double.compare(this.b, h51.b) == 0 && Double.compare(this.c, h51.c) == 0 && Double.compare(this.d, h51.d) == 0 && Double.compare(this.e, h51.e) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i3 = (i2 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.e);
        return i3 + ((int) ((jDoubleToLongBits5 >>> 32) ^ jDoubleToLongBits5));
    }

    public final String toString() {
        return "StylusData(tiltX=" + this.a + ", tiltY=" + this.b + ", altitudeAngle=" + this.c + ", azimuthAngle=" + this.d + ", pressure=" + this.e + ")";
    }

    public H51(double d, double d2, double d3, double d4, double d5) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
    }
}
