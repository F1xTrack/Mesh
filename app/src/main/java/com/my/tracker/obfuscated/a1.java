package com.my.tracker.obfuscated;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a1 {
    public static final a1 g = new a1(-1, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 0.0f, 0.0f, 0);
    public final int a;
    public final double b;
    public final double c;
    public final float d;
    public final float e;
    public final long f;

    public a1(int i, double d, double d2, float f, float f2, long j) {
        this.a = i;
        this.b = d;
        this.c = d2;
        this.d = f;
        this.e = f2;
        this.f = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.a == a1Var.a && Double.compare(a1Var.b, this.b) == 0 && Double.compare(a1Var.c, this.c) == 0 && Float.compare(a1Var.d, this.d) == 0 && Float.compare(a1Var.e, this.e) == 0 && this.f == a1Var.f;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Long.valueOf(this.f));
    }
}
