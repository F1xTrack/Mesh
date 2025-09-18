package p000;

/* renamed from: pY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10664pY1 implements InterfaceC10920rY1 {

    /* renamed from: a */
    public static final WO1 f40202a;

    /* renamed from: b */
    public static final WO1 f40203b;

    /* renamed from: c */
    public static final WO1 f40204c;

    /* renamed from: d */
    public static final WO1 f40205d;

    /* renamed from: e */
    public static final WO1 f40206e;

    /* renamed from: f */
    public static final WO1 f40207f;

    static {
        C1338VG c1338vg = new C1338VG(AbstractC11028sO1.m24733a("com.google.android.gms.measurement"), "", "", true, true);
        f40202a = c1338vg.m8353s("measurement.test.boolean_flag", false);
        f40203b = c1338vg.m8351q(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = WO1.f13159g;
        f40204c = new WO1(c1338vg, "measurement.test.double_flag", dValueOf, 3);
        f40205d = c1338vg.m8351q(-2L, "measurement.test.int_flag");
        f40206e = c1338vg.m8351q(-1L, "measurement.test.long_flag");
        f40207f = c1338vg.m8352r("measurement.test.string_flag", "---");
    }
}
