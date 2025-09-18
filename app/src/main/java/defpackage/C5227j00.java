package defpackage;

/* renamed from: j00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5227j00 extends AbstractC8279z00 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final C5227j00 DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static {
        C5227j00 c5227j00 = new C5227j00();
        DEFAULT_INSTANCE = c5227j00;
        AbstractC8279z00.s(C5227j00.class, c5227j00);
    }

    public static void u(C5227j00 c5227j00, int i) {
        c5227j00.bitField0_ |= 16;
        c5227j00.maxAppJavaHeapMemoryKb_ = i;
    }

    public static void v(C5227j00 c5227j00, int i) {
        c5227j00.bitField0_ |= 32;
        c5227j00.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    public static void w(C5227j00 c5227j00, int i) {
        c5227j00.bitField0_ |= 8;
        c5227j00.deviceRamSizeKb_ = i;
    }

    public static C5227j00 x() {
        return DEFAULT_INSTANCE;
    }

    public static C4260i00 z() {
        return (C4260i00) DEFAULT_INSTANCE.l();
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new C5227j00();
            case 4:
                return new C4260i00(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C5227j00.class) {
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

    public final boolean y() {
        return (this.bitField0_ & 16) != 0;
    }
}
