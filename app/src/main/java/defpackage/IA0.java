package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class IA0 extends AbstractC8279z00 {
    private static final IA0 DEFAULT_INSTANCE;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC7358u90 sessionVerbosity_converter_ = new C0396Ev0(18);
    private int bitField0_;
    private String sessionId_ = "";
    private InterfaceC7167t90 sessionVerbosity_ = C2271b90.d;

    static {
        IA0 ia0 = new IA0();
        DEFAULT_INSTANCE = ia0;
        AbstractC8279z00.s(IA0.class, ia0);
    }

    public static void u(IA0 ia0, String str) {
        ia0.getClass();
        str.getClass();
        ia0.bitField0_ |= 1;
        ia0.sessionId_ = str;
    }

    public static void v(IA0 ia0) {
        ia0.getClass();
        List list = ia0.sessionVerbosity_;
        if (!((S0) list).a) {
            int size = list.size();
            int i = size == 0 ? 10 : size * 2;
            C2271b90 c2271b90 = (C2271b90) list;
            if (i < c2271b90.c) {
                throw new IllegalArgumentException();
            }
            ia0.sessionVerbosity_ = new C2271b90(Arrays.copyOf(c2271b90.b, i), c2271b90.c, true);
        }
        ((C2271b90) ia0.sessionVerbosity_).d(AbstractC8235ym.x(2));
    }

    public static HA0 y() {
        return (HA0) DEFAULT_INSTANCE.l();
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", C5396jt0.f});
            case 3:
                return new IA0();
            case 4:
                return new HA0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (IA0.class) {
                        try {
                            c7136t00 = PARSER;
                            if (c7136t00 == null) {
                                c7136t00 = new C7136t00();
                                PARSER = c7136t00;
                            }
                        } finally {
                        }
                    }
                }
                return c7136t00;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int w() {
        int i = 0;
        int i2 = ((C2271b90) this.sessionVerbosity_).getInt(0);
        if (i2 == 0) {
            i = 1;
        } else if (i2 == 1) {
            i = 2;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int x() {
        return this.sessionVerbosity_.size();
    }
}
