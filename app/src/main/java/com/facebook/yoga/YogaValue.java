package com.facebook.yoga;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import p000.AbstractC7222ym;

/* loaded from: classes.dex */
public final class YogaValue {

    /* renamed from: c */
    public static final YogaValue f17999c = new YogaValue(Float.NaN, 1);

    /* renamed from: d */
    public static final YogaValue f18000d = new YogaValue(Float.NaN, 4);

    /* renamed from: a */
    public final float f18001a;

    /* renamed from: b */
    public final int f18002b;

    public YogaValue(float f, int i) {
        this.f18001a = f;
        this.f18002b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        int i = yogaValue.f18002b;
        int i2 = this.f18002b;
        if (i2 == i) {
            return i2 == 1 || i2 == 4 || Float.compare(this.f18001a, yogaValue.f18001a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC7222ym.m26247x(this.f18002b) + Float.floatToIntBits(this.f18001a);
    }

    public final String toString() {
        int iM26247x = AbstractC7222ym.m26247x(this.f18002b);
        if (iM26247x == 0) {
            return StringUtils.UNDEFINED;
        }
        float f = this.f18001a;
        if (iM26247x == 1) {
            return Float.toString(f);
        }
        if (iM26247x != 2) {
            if (iM26247x == 3) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return f + "%";
    }
}
