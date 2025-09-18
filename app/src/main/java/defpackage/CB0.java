package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class CB0 {
    public static final CB0 d = new CB0(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
    }

    public CB0(float f, float f2) {
        YN1.c(f > 0.0f);
        YN1.c(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CB0.class != obj.getClass()) {
            return false;
        }
        CB0 cb0 = (CB0) obj;
        return this.a == cb0.a && this.b == cb0.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = AbstractC0277Dh1.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
