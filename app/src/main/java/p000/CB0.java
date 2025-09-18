package p000;

import java.util.Locale;

/* loaded from: classes.dex */
public final class CB0 {

    /* renamed from: d */
    public static final CB0 f1238d = new CB0(1.0f, 1.0f);

    /* renamed from: a */
    public final float f1239a;

    /* renamed from: b */
    public final float f1240b;

    /* renamed from: c */
    public final int f1241c;

    static {
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
    }

    public CB0(float f, float f2) {
        YN1.m9278c(f > 0.0f);
        YN1.m9278c(f2 > 0.0f);
        this.f1239a = f;
        this.f1240b = f2;
        this.f1241c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CB0.class != obj.getClass()) {
            return false;
        }
        CB0 cb0 = (CB0) obj;
        return this.f1239a == cb0.f1239a && this.f1240b == cb0.f1240b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1240b) + ((Float.floatToRawIntBits(this.f1239a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f1239a), Float.valueOf(this.f1240b)};
        int i = AbstractC7485Dh1.f2166a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
