package defpackage;

/* renamed from: x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7913x4 extends AbstractC8279z00 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C7913x4 DEFAULT_INSTANCE;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        C7913x4 c7913x4 = new C7913x4();
        DEFAULT_INSTANCE = c7913x4;
        AbstractC8279z00.s(C7913x4.class, c7913x4);
    }

    public static void u(C7913x4 c7913x4, long j) {
        c7913x4.bitField0_ |= 1;
        c7913x4.clientTimeUs_ = j;
    }

    public static void v(C7913x4 c7913x4, int i) {
        c7913x4.bitField0_ |= 2;
        c7913x4.usedAppJavaHeapMemoryKb_ = i;
    }

    public static C7723w4 w() {
        return (C7723w4) DEFAULT_INSTANCE.l();
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 3:
                return new C7913x4();
            case 4:
                return new C7723w4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C7913x4.class) {
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
