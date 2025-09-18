package defpackage;

/* renamed from: pY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6480pY1 implements InterfaceC6861rY1 {
    public static final WO1 a;
    public static final WO1 b;
    public static final WO1 c;
    public static final WO1 d;
    public static final WO1 e;
    public static final WO1 f;

    static {
        VG vg = new VG(AbstractC7022sO1.a("com.google.android.gms.measurement"), "", "", true, true);
        a = vg.s("measurement.test.boolean_flag", false);
        b = vg.q(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = WO1.g;
        c = new WO1(vg, "measurement.test.double_flag", dValueOf, 3);
        d = vg.q(-2L, "measurement.test.int_flag");
        e = vg.q(-1L, "measurement.test.long_flag");
        f = vg.r("measurement.test.string_flag", "---");
    }
}
