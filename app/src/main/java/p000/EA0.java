package p000;

/* loaded from: classes.dex */
public final class EA0 extends AbstractC11868z00 implements FA0 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final EA0 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile InterfaceC9719iA0 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C1828c8 applicationInfo_;
    private int bitField0_;
    private C10207m00 gaugeMetric_;
    private C8602Yu0 networkRequestMetric_;
    private C7629Gb1 traceMetric_;
    private C8515Xc1 transportInfo_;

    static {
        EA0 ea0 = new EA0();
        DEFAULT_INSTANCE = ea0;
        AbstractC11868z00.m26292s(EA0.class, ea0);
    }

    /* renamed from: A */
    public static DA0 m2056A() {
        return (DA0) DEFAULT_INSTANCE.m26295l();
    }

    /* renamed from: u */
    public static void m2057u(EA0 ea0, C1828c8 c1828c8) {
        ea0.getClass();
        ea0.applicationInfo_ = c1828c8;
        ea0.bitField0_ |= 1;
    }

    /* renamed from: v */
    public static void m2058v(EA0 ea0, C10207m00 c10207m00) {
        ea0.getClass();
        ea0.gaugeMetric_ = c10207m00;
        ea0.bitField0_ |= 8;
    }

    /* renamed from: w */
    public static void m2059w(EA0 ea0, C7629Gb1 c7629Gb1) {
        ea0.getClass();
        ea0.traceMetric_ = c7629Gb1;
        ea0.bitField0_ |= 2;
    }

    /* renamed from: x */
    public static void m2060x(EA0 ea0, C8602Yu0 c8602Yu0) {
        ea0.getClass();
        ea0.networkRequestMetric_ = c8602Yu0;
        ea0.bitField0_ |= 4;
    }

    @Override // p000.FA0
    /* renamed from: a */
    public final boolean mo1565a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p000.FA0
    /* renamed from: e */
    public final boolean mo1566e() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.FA0
    /* renamed from: h */
    public final C7629Gb1 mo1567h() {
        C7629Gb1 c7629Gb1 = this.traceMetric_;
        return c7629Gb1 == null ? C7629Gb1.m3099H() : c7629Gb1;
    }

    @Override // p000.FA0
    /* renamed from: i */
    public final boolean mo1568i() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p000.FA0
    /* renamed from: j */
    public final C8602Yu0 mo1569j() {
        C8602Yu0 c8602Yu0 = this.networkRequestMetric_;
        return c8602Yu0 == null ? C8602Yu0.m9397J() : c8602Yu0;
    }

    @Override // p000.FA0
    /* renamed from: k */
    public final C10207m00 mo1570k() {
        C10207m00 c10207m00 = this.gaugeMetric_;
        return c10207m00 == null ? C10207m00.m22614A() : c10207m00;
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new EA0();
            case 4:
                return new DA0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (EA0.class) {
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
    public final C1828c8 m2062y() {
        C1828c8 c1828c8 = this.applicationInfo_;
        return c1828c8 == null ? C1828c8.m10597A() : c1828c8;
    }

    /* renamed from: z */
    public final boolean m2063z() {
        return (this.bitField0_ & 1) != 0;
    }
}
