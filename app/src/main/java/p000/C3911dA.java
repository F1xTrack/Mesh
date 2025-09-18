package p000;

/* renamed from: dA */
/* loaded from: classes.dex */
public final class C3911dA extends AbstractC11868z00 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C3911dA DEFAULT_INSTANCE;
    private static volatile InterfaceC9719iA0 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        C3911dA c3911dA = new C3911dA();
        DEFAULT_INSTANCE = c3911dA;
        AbstractC11868z00.m26292s(C3911dA.class, c3911dA);
    }

    /* renamed from: u */
    public static void m17497u(C3911dA c3911dA, long j) {
        c3911dA.bitField0_ |= 1;
        c3911dA.clientTimeUs_ = j;
    }

    /* renamed from: v */
    public static void m17498v(C3911dA c3911dA, long j) {
        c3911dA.bitField0_ |= 2;
        c3911dA.userTimeUs_ = j;
    }

    /* renamed from: w */
    public static void m17499w(C3911dA c3911dA, long j) {
        c3911dA.bitField0_ |= 4;
        c3911dA.systemTimeUs_ = j;
    }

    /* renamed from: x */
    public static C1830cA m17500x() {
        return (C1830cA) DEFAULT_INSTANCE.m26295l();
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new C3911dA();
            case 4:
                return new C1830cA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C3911dA.class) {
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
}
