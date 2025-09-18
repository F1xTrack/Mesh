package p000;

/* renamed from: j00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9823j00 extends AbstractC11868z00 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final C9823j00 DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile InterfaceC9719iA0 PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static {
        C9823j00 c9823j00 = new C9823j00();
        DEFAULT_INSTANCE = c9823j00;
        AbstractC11868z00.m26292s(C9823j00.class, c9823j00);
    }

    /* renamed from: u */
    public static void m21951u(C9823j00 c9823j00, int i) {
        c9823j00.bitField0_ |= 16;
        c9823j00.maxAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: v */
    public static void m21952v(C9823j00 c9823j00, int i) {
        c9823j00.bitField0_ |= 32;
        c9823j00.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: w */
    public static void m21953w(C9823j00 c9823j00, int i) {
        c9823j00.bitField0_ |= 8;
        c9823j00.deviceRamSizeKb_ = i;
    }

    /* renamed from: x */
    public static C9823j00 m21954x() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: z */
    public static C9695i00 m21955z() {
        return (C9695i00) DEFAULT_INSTANCE.m26295l();
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new C9823j00();
            case 4:
                return new C9695i00(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C9823j00.class) {
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

    /* renamed from: y */
    public final boolean m21956y() {
        return (this.bitField0_ & 16) != 0;
    }
}
