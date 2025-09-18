package p000;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class IA0 extends AbstractC11868z00 {
    private static final IA0 DEFAULT_INSTANCE;
    private static volatile InterfaceC9719iA0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC11253u90 sessionVerbosity_converter_ = new C7564Ev0(18);
    private int bitField0_;
    private String sessionId_ = "";
    private InterfaceC11125t90 sessionVerbosity_ = C8816b90.f16825d;

    static {
        IA0 ia0 = new IA0();
        DEFAULT_INSTANCE = ia0;
        AbstractC11868z00.m26292s(IA0.class, ia0);
    }

    /* renamed from: u */
    public static void m3772u(IA0 ia0, String str) {
        ia0.getClass();
        str.getClass();
        ia0.bitField0_ |= 1;
        ia0.sessionId_ = str;
    }

    /* renamed from: v */
    public static void m3773v(IA0 ia0) {
        ia0.getClass();
        List list = ia0.sessionVerbosity_;
        if (!((AbstractC1133S0) list).f10523a) {
            int size = list.size();
            int i = size == 0 ? 10 : size * 2;
            C8816b90 c8816b90 = (C8816b90) list;
            if (i < c8816b90.f16827c) {
                throw new IllegalArgumentException();
            }
            ia0.sessionVerbosity_ = new C8816b90(Arrays.copyOf(c8816b90.f16826b, i), c8816b90.f16827c, true);
        }
        ((C8816b90) ia0.sessionVerbosity_).m10423d(AbstractC7222ym.m26247x(2));
    }

    /* renamed from: y */
    public static HA0 m3774y() {
        return (HA0) DEFAULT_INSTANCE.m26295l();
    }

    @Override // p000.AbstractC11868z00
    /* renamed from: m */
    public final Object mo2061m(int i) {
        switch (AbstractC7222ym.m26247x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", C9937jt0.f35441f});
            case 3:
                return new IA0();
            case 4:
                return new HA0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (IA0.class) {
                        try {
                            c11103t00 = PARSER;
                            if (c11103t00 == null) {
                                c11103t00 = new C11103t00();
                                PARSER = c11103t00;
                            }
                        } finally {
                        }
                    }
                }
                return c11103t00;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: w */
    public final int m3775w() {
        int i = 0;
        int i2 = ((C8816b90) this.sessionVerbosity_).getInt(0);
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

    /* renamed from: x */
    public final int m3776x() {
        return this.sessionVerbosity_.size();
    }
}
