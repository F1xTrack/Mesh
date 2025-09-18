package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: ki1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5555ki1 {
    public static final C5555ki1 d = new C5555ki1(-1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE);
    public static final C5555ki1 e = new C5555ki1(1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE);
    public static final C5555ki1 f = new C5555ki1(ConfigValue.DOUBLE_DEFAULT_VALUE, -1.0d);
    public static final C5555ki1 g = new C5555ki1(ConfigValue.DOUBLE_DEFAULT_VALUE, 1.0d);
    public static final C5555ki1 h = new C5555ki1(1.0d, -1.0d);
    public static final C5555ki1 i = new C5555ki1(1.0d, 1.0d);
    public static final C5555ki1 j = new C5555ki1(-1.0d, -1.0d);
    public static final C5555ki1 k = new C5555ki1(-1.0d, 1.0d);
    public static final C5555ki1 l = new C5555ki1(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
    public final double a;
    public final double b;
    public final double c;

    public C5555ki1(double d2, double d3) {
        double dHypot = Math.hypot(d2, d3);
        this.c = dHypot;
        boolean z = dHypot > 0.1d;
        double d4 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.a = z ? d2 / dHypot : 0.0d;
        this.b = z ? d3 / dHypot : d4;
    }
}
