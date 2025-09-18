package defpackage;

/* renamed from: dA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3339dA extends AbstractC8279z00 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C3339dA DEFAULT_INSTANCE;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        C3339dA c3339dA = new C3339dA();
        DEFAULT_INSTANCE = c3339dA;
        AbstractC8279z00.s(C3339dA.class, c3339dA);
    }

    public static void u(C3339dA c3339dA, long j) {
        c3339dA.bitField0_ |= 1;
        c3339dA.clientTimeUs_ = j;
    }

    public static void v(C3339dA c3339dA, long j) {
        c3339dA.bitField0_ |= 2;
        c3339dA.userTimeUs_ = j;
    }

    public static void w(C3339dA c3339dA, long j) {
        c3339dA.bitField0_ |= 4;
        c3339dA.systemTimeUs_ = j;
    }

    public static C2463cA x() {
        return (C2463cA) DEFAULT_INSTANCE.l();
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new C3339dA();
            case 4:
                return new C2463cA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C3339dA.class) {
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
}
