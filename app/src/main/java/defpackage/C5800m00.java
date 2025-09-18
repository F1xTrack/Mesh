package defpackage;

/* renamed from: m00 */
/* loaded from: classes.dex */
public final class C5800m00 extends AbstractC8279z00 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final C5800m00 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private InterfaceC7549v90 androidMemoryReadings_;
    private int bitField0_;
    private InterfaceC7549v90 cpuMetricReadings_;
    private C5227j00 gaugeMetadata_;
    private String sessionId_ = "";

    static {
        C5800m00 c5800m00 = new C5800m00();
        DEFAULT_INSTANCE = c5800m00;
        AbstractC8279z00.s(C5800m00.class, c5800m00);
    }

    public C5800m00() {
        C2101aG0 c2101aG0 = C2101aG0.d;
        this.cpuMetricReadings_ = c2101aG0;
        this.androidMemoryReadings_ = c2101aG0;
    }

    public static C5800m00 A() {
        return DEFAULT_INSTANCE;
    }

    public static C5609l00 E() {
        return (C5609l00) DEFAULT_INSTANCE.l();
    }

    public static void u(C5800m00 c5800m00, String str) {
        c5800m00.getClass();
        str.getClass();
        c5800m00.bitField0_ |= 1;
        c5800m00.sessionId_ = str;
    }

    public static void v(C5800m00 c5800m00, C7913x4 c7913x4) {
        c5800m00.getClass();
        c7913x4.getClass();
        InterfaceC7549v90 interfaceC7549v90 = c5800m00.androidMemoryReadings_;
        if (!((S0) interfaceC7549v90).a) {
            c5800m00.androidMemoryReadings_ = AbstractC8279z00.r(interfaceC7549v90);
        }
        c5800m00.androidMemoryReadings_.add(c7913x4);
    }

    public static void w(C5800m00 c5800m00, C5227j00 c5227j00) {
        c5800m00.getClass();
        c5227j00.getClass();
        c5800m00.gaugeMetadata_ = c5227j00;
        c5800m00.bitField0_ |= 2;
    }

    public static void x(C5800m00 c5800m00, C3339dA c3339dA) {
        c5800m00.getClass();
        c3339dA.getClass();
        InterfaceC7549v90 interfaceC7549v90 = c5800m00.cpuMetricReadings_;
        if (!((S0) interfaceC7549v90).a) {
            c5800m00.cpuMetricReadings_ = AbstractC8279z00.r(interfaceC7549v90);
        }
        c5800m00.cpuMetricReadings_.add(c3339dA);
    }

    public final C5227j00 B() {
        C5227j00 c5227j00 = this.gaugeMetadata_;
        return c5227j00 == null ? C5227j00.x() : c5227j00;
    }

    public final boolean C() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C3339dA.class, "gaugeMetadata_", "androidMemoryReadings_", C7913x4.class});
            case 3:
                return new C5800m00();
            case 4:
                return new C5609l00(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C5800m00.class) {
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

    public final int y() {
        return this.androidMemoryReadings_.size();
    }

    public final int z() {
        return this.cpuMetricReadings_.size();
    }
}
