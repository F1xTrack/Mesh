package com.p018my.tracker.obfuscated;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Objects;

/* renamed from: com.my.tracker.obfuscated.a1 */
/* loaded from: classes2.dex */
public final class C2291a1 {

    /* renamed from: g */
    public static final C2291a1 f19753g = new C2291a1(-1, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 0.0f, 0.0f, 0);

    /* renamed from: a */
    public final int f19754a;

    /* renamed from: b */
    public final double f19755b;

    /* renamed from: c */
    public final double f19756c;

    /* renamed from: d */
    public final float f19757d;

    /* renamed from: e */
    public final float f19758e;

    /* renamed from: f */
    public final long f19759f;

    public C2291a1(int i, double d, double d2, float f, float f2, long j) {
        this.f19754a = i;
        this.f19755b = d;
        this.f19756c = d2;
        this.f19757d = f;
        this.f19758e = f2;
        this.f19759f = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2291a1.class != obj.getClass()) {
            return false;
        }
        C2291a1 c2291a1 = (C2291a1) obj;
        return this.f19754a == c2291a1.f19754a && Double.compare(c2291a1.f19755b, this.f19755b) == 0 && Double.compare(c2291a1.f19756c, this.f19756c) == 0 && Float.compare(c2291a1.f19757d, this.f19757d) == 0 && Float.compare(c2291a1.f19758e, this.f19758e) == 0 && this.f19759f == c2291a1.f19759f;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f19754a), Double.valueOf(this.f19755b), Double.valueOf(this.f19756c), Float.valueOf(this.f19757d), Float.valueOf(this.f19758e), Long.valueOf(this.f19759f));
    }
}
