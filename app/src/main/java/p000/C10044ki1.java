package p000;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: ki1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10044ki1 {

    /* renamed from: d */
    public static final C10044ki1 f36620d = new C10044ki1(-1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE);

    /* renamed from: e */
    public static final C10044ki1 f36621e = new C10044ki1(1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE);

    /* renamed from: f */
    public static final C10044ki1 f36622f = new C10044ki1(ConfigValue.DOUBLE_DEFAULT_VALUE, -1.0d);

    /* renamed from: g */
    public static final C10044ki1 f36623g = new C10044ki1(ConfigValue.DOUBLE_DEFAULT_VALUE, 1.0d);

    /* renamed from: h */
    public static final C10044ki1 f36624h = new C10044ki1(1.0d, -1.0d);

    /* renamed from: i */
    public static final C10044ki1 f36625i = new C10044ki1(1.0d, 1.0d);

    /* renamed from: j */
    public static final C10044ki1 f36626j = new C10044ki1(-1.0d, -1.0d);

    /* renamed from: k */
    public static final C10044ki1 f36627k = new C10044ki1(-1.0d, 1.0d);

    /* renamed from: l */
    public static final C10044ki1 f36628l = new C10044ki1(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);

    /* renamed from: a */
    public final double f36629a;

    /* renamed from: b */
    public final double f36630b;

    /* renamed from: c */
    public final double f36631c;

    public C10044ki1(double d, double d2) {
        double dHypot = Math.hypot(d, d2);
        this.f36631c = dHypot;
        boolean z = dHypot > 0.1d;
        double d3 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f36629a = z ? d / dHypot : 0.0d;
        this.f36630b = z ? d2 / dHypot : d3;
    }
}
