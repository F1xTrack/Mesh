package p000;

/* renamed from: m00 */
/* loaded from: classes.dex */
public final class C10207m00 extends AbstractC11868z00 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final C10207m00 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC9719iA0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private InterfaceC11381v90 androidMemoryReadings_;
    private int bitField0_;
    private InterfaceC11381v90 cpuMetricReadings_;
    private C9823j00 gaugeMetadata_;
    private String sessionId_ = "";

    static {
        C10207m00 c10207m00 = new C10207m00();
        DEFAULT_INSTANCE = c10207m00;
        AbstractC11868z00.m26292s(C10207m00.class, c10207m00);
    }

    public C10207m00() {
        C8702aG0 c8702aG0 = C8702aG0.f15409d;
        this.cpuMetricReadings_ = c8702aG0;
        this.androidMemoryReadings_ = c8702aG0;
    }

    /* renamed from: A */
    public static C10207m00 m22614A() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: E */
    public static C10079l00 m22615E() {
        return (C10079l00) DEFAULT_INSTANCE.m26295l();
    }

    /* renamed from: u */
    public static void m22616u(C10207m00 c10207m00, String str) {
        c10207m00.getClass();
        str.getClass();
        c10207m00.bitField0_ |= 1;
        c10207m00.sessionId_ = str;
    }

    /* renamed from: v */
    public static void m22617v(C10207m00 c10207m00, C7115x4 c7115x4) {
        c10207m00.getClass();
        c7115x4.getClass();
        InterfaceC11381v90 interfaceC11381v90 = c10207m00.androidMemoryReadings_;
        if (!((AbstractC1133S0) interfaceC11381v90).f10523a) {
            c10207m00.androidMemoryReadings_ = AbstractC11868z00.m26291r(interfaceC11381v90);
        }
        c10207m00.androidMemoryReadings_.add(c7115x4);
    }

    /* renamed from: w */
    public static void m22618w(C10207m00 c10207m00, C9823j00 c9823j00) {
        c10207m00.getClass();
        c9823j00.getClass();
        c10207m00.gaugeMetadata_ = c9823j00;
        c10207m00.bitField0_ |= 2;
    }

    /* renamed from: x */
    public static void m22619x(C10207m00 c10207m00, C3911dA c3911dA) {
        c10207m00.getClass();
        c3911dA.getClass();
        InterfaceC11381v90 interfaceC11381v90 = c10207m00.cpuMetricReadings_;
        if (!((AbstractC1133S0) interfaceC11381v90).f10523a) {
            c10207m00.cpuMetricReadings_ = AbstractC11868z00.m26291r(interfaceC11381v90);
        }
        c10207m00.cpuMetricReadings_.add(c3911dA);
    }

    /* renamed from: B */
    public final C9823j00 m22620B() {
        C9823j00 c9823j00 = this.gaugeMetadata_;
        return c9823j00 == null ? C9823j00.m21954x() : c9823j00;
    }

    /* renamed from: C */
    public final boolean m22621C() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: D */
    public final boolean m22622D() {
        return (this.bitField0_ & 1) != 0;
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C3911dA.class, "gaugeMetadata_", "androidMemoryReadings_", C7115x4.class});
            case 3:
                return new C10207m00();
            case 4:
                return new C10079l00(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C10207m00.class) {
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
    public final int m22623y() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: z */
    public final int m22624z() {
        return this.cpuMetricReadings_.size();
    }
}
