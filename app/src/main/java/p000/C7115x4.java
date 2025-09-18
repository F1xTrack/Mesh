package p000;

/* renamed from: x4 */
/* loaded from: classes.dex */
public final class C7115x4 extends AbstractC11868z00 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C7115x4 DEFAULT_INSTANCE;
    private static volatile InterfaceC9719iA0 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        C7115x4 c7115x4 = new C7115x4();
        DEFAULT_INSTANCE = c7115x4;
        AbstractC11868z00.m26292s(C7115x4.class, c7115x4);
    }

    /* renamed from: u */
    public static void m25753u(C7115x4 c7115x4, long j) {
        c7115x4.bitField0_ |= 1;
        c7115x4.clientTimeUs_ = j;
    }

    /* renamed from: v */
    public static void m25754v(C7115x4 c7115x4, int i) {
        c7115x4.bitField0_ |= 2;
        c7115x4.usedAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: w */
    public static C7052w4 m25755w() {
        return (C7052w4) DEFAULT_INSTANCE.m26295l();
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 3:
                return new C7115x4();
            case 4:
                return new C7052w4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C7115x4.class) {
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
