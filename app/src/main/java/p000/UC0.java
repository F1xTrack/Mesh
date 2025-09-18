package p000;

import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class UC0 extends B00 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final UC0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC9975kA0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        UC0 uc0 = new UC0();
        DEFAULT_INSTANCE = uc0;
        B00.m429h(UC0.class, uc0);
    }

    /* renamed from: i */
    public static void m7928i(UC0 uc0, long j) {
        uc0.valueCase_ = 4;
        uc0.value_ = Long.valueOf(j);
    }

    /* renamed from: j */
    public static void m7929j(UC0 uc0, String str) {
        uc0.getClass();
        str.getClass();
        uc0.valueCase_ = 5;
        uc0.value_ = str;
    }

    /* renamed from: k */
    public static void m7930k(UC0 uc0, RC0 rc0) {
        uc0.getClass();
        uc0.value_ = rc0.m24567a();
        uc0.valueCase_ = 6;
    }

    /* renamed from: l */
    public static void m7931l(UC0 uc0, double d) {
        uc0.valueCase_ = 7;
        uc0.value_ = Double.valueOf(d);
    }

    /* renamed from: m */
    public static void m7932m(UC0 uc0, boolean z) {
        uc0.valueCase_ = 1;
        uc0.value_ = Boolean.valueOf(z);
    }

    /* renamed from: n */
    public static void m7933n(UC0 uc0, float f) {
        uc0.valueCase_ = 2;
        uc0.value_ = Float.valueOf(f);
    }

    /* renamed from: o */
    public static void m7934o(UC0 uc0, int i) {
        uc0.valueCase_ = 3;
        uc0.value_ = Integer.valueOf(i);
    }

    /* renamed from: q */
    public static UC0 m7935q() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: y */
    public static TC0 m7936y() {
        return (TC0) ((AbstractC10975s00) DEFAULT_INSTANCE.mo432d(5));
    }

    @Override // p000.B00
    /* renamed from: d */
    public final Object mo432d(int i) {
        switch (AbstractC7222ym.m26247x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C10121lJ0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", SC0.class});
            case 3:
                return new UC0();
            case 4:
                return new TC0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9975kA0 c11231u00 = PARSER;
                if (c11231u00 == null) {
                    synchronized (UC0.class) {
                        try {
                            c11231u00 = PARSER;
                            if (c11231u00 == null) {
                                c11231u00 = new C11231u00();
                                PARSER = c11231u00;
                            }
                        } finally {
                        }
                    }
                }
                return c11231u00;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    public final boolean m7937p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: r */
    public final double m7938r() {
        return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    /* renamed from: s */
    public final float m7939s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: t */
    public final int m7940t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: u */
    public final long m7941u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* renamed from: v */
    public final String m7942v() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* renamed from: w */
    public final SC0 m7943w() {
        return this.valueCase_ == 6 ? (SC0) this.value_ : SC0.m7193j();
    }

    /* renamed from: x */
    public final int m7944x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}
