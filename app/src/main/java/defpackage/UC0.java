package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class UC0 extends B00 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final UC0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC5452kA0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        UC0 uc0 = new UC0();
        DEFAULT_INSTANCE = uc0;
        B00.h(UC0.class, uc0);
    }

    public static void i(UC0 uc0, long j) {
        uc0.valueCase_ = 4;
        uc0.value_ = Long.valueOf(j);
    }

    public static void j(UC0 uc0, String str) {
        uc0.getClass();
        str.getClass();
        uc0.valueCase_ = 5;
        uc0.value_ = str;
    }

    public static void k(UC0 uc0, RC0 rc0) {
        uc0.getClass();
        uc0.value_ = rc0.a();
        uc0.valueCase_ = 6;
    }

    public static void l(UC0 uc0, double d) {
        uc0.valueCase_ = 7;
        uc0.value_ = Double.valueOf(d);
    }

    public static void m(UC0 uc0, boolean z) {
        uc0.valueCase_ = 1;
        uc0.value_ = Boolean.valueOf(z);
    }

    public static void n(UC0 uc0, float f) {
        uc0.valueCase_ = 2;
        uc0.value_ = Float.valueOf(f);
    }

    public static void o(UC0 uc0, int i) {
        uc0.valueCase_ = 3;
        uc0.value_ = Integer.valueOf(i);
    }

    public static UC0 q() {
        return DEFAULT_INSTANCE;
    }

    public static TC0 y() {
        return (TC0) ((AbstractC6945s00) DEFAULT_INSTANCE.d(5));
    }

    @Override // defpackage.B00
    public final Object d(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5670lJ0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", SC0.class});
            case 3:
                return new UC0();
            case 4:
                return new TC0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5452kA0 c7327u00 = PARSER;
                if (c7327u00 == null) {
                    synchronized (UC0.class) {
                        try {
                            c7327u00 = PARSER;
                            if (c7327u00 == null) {
                                c7327u00 = new C7327u00();
                                PARSER = c7327u00;
                            }
                        } finally {
                        }
                    }
                }
                return c7327u00;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public final float s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final SC0 w() {
        return this.valueCase_ == 6 ? (SC0) this.value_ : SC0.j();
    }

    public final int x() {
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
