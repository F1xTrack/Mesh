package defpackage;

import java.util.List;

/* renamed from: Yu0 */
/* loaded from: classes.dex */
public final class C1952Yu0 extends AbstractC8279z00 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final C1952Yu0 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private C4029gn0 customAttributes_ = C4029gn0.b;
    private String url_ = "";
    private String responseContentType_ = "";
    private InterfaceC7549v90 perfSessions_ = C2101aG0.d;

    static {
        C1952Yu0 c1952Yu0 = new C1952Yu0();
        DEFAULT_INSTANCE = c1952Yu0;
        AbstractC8279z00.s(C1952Yu0.class, c1952Yu0);
    }

    public static void A(C1952Yu0 c1952Yu0, long j) {
        c1952Yu0.bitField0_ |= 256;
        c1952Yu0.timeToRequestCompletedUs_ = j;
    }

    public static void B(C1952Yu0 c1952Yu0, long j) {
        c1952Yu0.bitField0_ |= 512;
        c1952Yu0.timeToResponseInitiatedUs_ = j;
    }

    public static void C(C1952Yu0 c1952Yu0, long j) {
        c1952Yu0.bitField0_ |= 1024;
        c1952Yu0.timeToResponseCompletedUs_ = j;
    }

    public static C4029gn0 D(C1952Yu0 c1952Yu0) {
        C4029gn0 c4029gn0 = c1952Yu0.customAttributes_;
        if (!c4029gn0.a) {
            c1952Yu0.customAttributes_ = c4029gn0.i();
        }
        return c1952Yu0.customAttributes_;
    }

    public static void E(C1952Yu0 c1952Yu0, List list) {
        InterfaceC7549v90 interfaceC7549v90 = c1952Yu0.perfSessions_;
        if (!((S0) interfaceC7549v90).a) {
            c1952Yu0.perfSessions_ = AbstractC8279z00.r(interfaceC7549v90);
        }
        J0.b(list, c1952Yu0.perfSessions_);
    }

    public static void F(C1952Yu0 c1952Yu0, int i) {
        c1952Yu0.getClass();
        c1952Yu0.httpMethod_ = AbstractC8235ym.x(i);
        c1952Yu0.bitField0_ |= 2;
    }

    public static void G(C1952Yu0 c1952Yu0, long j) {
        c1952Yu0.bitField0_ |= 4;
        c1952Yu0.requestPayloadBytes_ = j;
    }

    public static void H(C1952Yu0 c1952Yu0, long j) {
        c1952Yu0.bitField0_ |= 8;
        c1952Yu0.responsePayloadBytes_ = j;
    }

    public static C1952Yu0 J() {
        return DEFAULT_INSTANCE;
    }

    public static C1796Wu0 b0() {
        return (C1796Wu0) DEFAULT_INSTANCE.l();
    }

    public static void u(C1952Yu0 c1952Yu0, String str) {
        c1952Yu0.getClass();
        str.getClass();
        c1952Yu0.bitField0_ |= 1;
        c1952Yu0.url_ = str;
    }

    public static void v(C1952Yu0 c1952Yu0) {
        c1952Yu0.getClass();
        c1952Yu0.networkClientErrorReason_ = AbstractC8235ym.x(2);
        c1952Yu0.bitField0_ |= 16;
    }

    public static void w(C1952Yu0 c1952Yu0, int i) {
        c1952Yu0.bitField0_ |= 32;
        c1952Yu0.httpResponseCode_ = i;
    }

    public static void x(C1952Yu0 c1952Yu0, String str) {
        c1952Yu0.getClass();
        str.getClass();
        c1952Yu0.bitField0_ |= 64;
        c1952Yu0.responseContentType_ = str;
    }

    public static void y(C1952Yu0 c1952Yu0) {
        c1952Yu0.bitField0_ &= -65;
        c1952Yu0.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void z(C1952Yu0 c1952Yu0, long j) {
        c1952Yu0.bitField0_ |= 128;
        c1952Yu0.clientStartTimeUs_ = j;
    }

    public final long I() {
        return this.clientStartTimeUs_;
    }

    public final int K() {
        int i;
        switch (this.httpMethod_) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int L() {
        return this.httpResponseCode_;
    }

    public final InterfaceC7549v90 M() {
        return this.perfSessions_;
    }

    public final long N() {
        return this.requestPayloadBytes_;
    }

    public final long O() {
        return this.responsePayloadBytes_;
    }

    public final long P() {
        return this.timeToRequestCompletedUs_;
    }

    public final long Q() {
        return this.timeToResponseCompletedUs_;
    }

    public final long R() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String S() {
        return this.url_;
    }

    public final boolean T() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean U() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean V() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean W() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean X() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean Y() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean Z() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean a0() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", C5396jt0.e, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", C0084Av0.f, "customAttributes_", AbstractC1874Xu0.a, "perfSessions_", IA0.class});
            case 3:
                return new C1952Yu0();
            case 4:
                return new C1796Wu0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C1952Yu0.class) {
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
