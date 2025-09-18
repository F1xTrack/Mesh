package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes2.dex */
public final class H51 {

    /* renamed from: a */
    public final double f4051a;

    /* renamed from: b */
    public final double f4052b;

    /* renamed from: c */
    public final double f4053c;

    /* renamed from: d */
    public final double f4054d;

    /* renamed from: e */
    public final double f4055e;

    public /* synthetic */ H51() {
        this(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, -1.0d);
    }

    /* renamed from: a */
    public final WritableMap m3265a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.f4051a);
        writableMapCreateMap.putDouble("tiltY", this.f4052b);
        writableMapCreateMap.putDouble("altitudeAngle", this.f4053c);
        writableMapCreateMap.putDouble("azimuthAngle", this.f4054d);
        writableMapCreateMap.putDouble("pressure", this.f4055e);
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
        return Double.compare(this.f4051a, h51.f4051a) == 0 && Double.compare(this.f4052b, h51.f4052b) == 0 && Double.compare(this.f4053c, h51.f4053c) == 0 && Double.compare(this.f4054d, h51.f4054d) == 0 && Double.compare(this.f4055e, h51.f4055e) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f4051a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f4052b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f4053c);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f4054d);
        int i3 = (i2 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f4055e);
        return i3 + ((int) ((jDoubleToLongBits5 >>> 32) ^ jDoubleToLongBits5));
    }

    public final String toString() {
        return "StylusData(tiltX=" + this.f4051a + ", tiltY=" + this.f4052b + ", altitudeAngle=" + this.f4053c + ", azimuthAngle=" + this.f4054d + ", pressure=" + this.f4055e + ")";
    }

    public H51(double d, double d2, double d3, double d4, double d5) {
        this.f4051a = d;
        this.f4052b = d2;
        this.f4053c = d3;
        this.f4054d = d4;
        this.f4055e = d5;
    }
}
