package defpackage;

/* loaded from: classes.dex */
public final class EA0 extends AbstractC8279z00 implements FA0 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final EA0 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C2457c8 applicationInfo_;
    private int bitField0_;
    private C5800m00 gaugeMetric_;
    private C1952Yu0 networkRequestMetric_;
    private C0493Gb1 traceMetric_;
    private C1821Xc1 transportInfo_;

    static {
        EA0 ea0 = new EA0();
        DEFAULT_INSTANCE = ea0;
        AbstractC8279z00.s(EA0.class, ea0);
    }

    public static DA0 A() {
        return (DA0) DEFAULT_INSTANCE.l();
    }

    public static void u(EA0 ea0, C2457c8 c2457c8) {
        ea0.getClass();
        ea0.applicationInfo_ = c2457c8;
        ea0.bitField0_ |= 1;
    }

    public static void v(EA0 ea0, C5800m00 c5800m00) {
        ea0.getClass();
        ea0.gaugeMetric_ = c5800m00;
        ea0.bitField0_ |= 8;
    }

    public static void w(EA0 ea0, C0493Gb1 c0493Gb1) {
        ea0.getClass();
        ea0.traceMetric_ = c0493Gb1;
        ea0.bitField0_ |= 2;
    }

    public static void x(EA0 ea0, C1952Yu0 c1952Yu0) {
        ea0.getClass();
        ea0.networkRequestMetric_ = c1952Yu0;
        ea0.bitField0_ |= 4;
    }

    @Override // defpackage.FA0
    public final boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // defpackage.FA0
    public final boolean e() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // defpackage.FA0
    public final C0493Gb1 h() {
        C0493Gb1 c0493Gb1 = this.traceMetric_;
        return c0493Gb1 == null ? C0493Gb1.H() : c0493Gb1;
    }

    @Override // defpackage.FA0
    public final boolean i() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // defpackage.FA0
    public final C1952Yu0 j() {
        C1952Yu0 c1952Yu0 = this.networkRequestMetric_;
        return c1952Yu0 == null ? C1952Yu0.J() : c1952Yu0;
    }

    @Override // defpackage.FA0
    public final C5800m00 k() {
        C5800m00 c5800m00 = this.gaugeMetric_;
        return c5800m00 == null ? C5800m00.A() : c5800m00;
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new EA0();
            case 4:
                return new DA0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (EA0.class) {
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

    public final C2457c8 y() {
        C2457c8 c2457c8 = this.applicationInfo_;
        return c2457c8 == null ? C2457c8.A() : c2457c8;
    }

    public final boolean z() {
        return (this.bitField0_ & 1) != 0;
    }
}
