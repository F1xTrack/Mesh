package p000;

import java.util.List;

/* renamed from: Yu0 */
/* loaded from: classes.dex */
public final class C8602Yu0 extends AbstractC11868z00 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final C8602Yu0 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile InterfaceC9719iA0 PARSER = null;
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
    private C9541gn0 customAttributes_ = C9541gn0.f27993b;
    private String url_ = "";
    private String responseContentType_ = "";
    private InterfaceC11381v90 perfSessions_ = C8702aG0.f15409d;

    static {
        C8602Yu0 c8602Yu0 = new C8602Yu0();
        DEFAULT_INSTANCE = c8602Yu0;
        AbstractC11868z00.m26292s(C8602Yu0.class, c8602Yu0);
    }

    /* renamed from: A */
    public static void m9389A(C8602Yu0 c8602Yu0, long j) {
        c8602Yu0.bitField0_ |= 256;
        c8602Yu0.timeToRequestCompletedUs_ = j;
    }

    /* renamed from: B */
    public static void m9390B(C8602Yu0 c8602Yu0, long j) {
        c8602Yu0.bitField0_ |= 512;
        c8602Yu0.timeToResponseInitiatedUs_ = j;
    }

    /* renamed from: C */
    public static void m9391C(C8602Yu0 c8602Yu0, long j) {
        c8602Yu0.bitField0_ |= 1024;
        c8602Yu0.timeToResponseCompletedUs_ = j;
    }

    /* renamed from: D */
    public static C9541gn0 m9392D(C8602Yu0 c8602Yu0) {
        C9541gn0 c9541gn0 = c8602Yu0.customAttributes_;
        if (!c9541gn0.f27994a) {
            c8602Yu0.customAttributes_ = c9541gn0.m18641i();
        }
        return c8602Yu0.customAttributes_;
    }

    /* renamed from: E */
    public static void m9393E(C8602Yu0 c8602Yu0, List list) {
        InterfaceC11381v90 interfaceC11381v90 = c8602Yu0.perfSessions_;
        if (!((AbstractC1133S0) interfaceC11381v90).f10523a) {
            c8602Yu0.perfSessions_ = AbstractC11868z00.m26291r(interfaceC11381v90);
        }
        AbstractC0568J0.m4100b(list, c8602Yu0.perfSessions_);
    }

    /* renamed from: F */
    public static void m9394F(C8602Yu0 c8602Yu0, int i) {
        c8602Yu0.getClass();
        c8602Yu0.httpMethod_ = AbstractC7222ym.m26247x(i);
        c8602Yu0.bitField0_ |= 2;
    }

    /* renamed from: G */
    public static void m9395G(C8602Yu0 c8602Yu0, long j) {
        c8602Yu0.bitField0_ |= 4;
        c8602Yu0.requestPayloadBytes_ = j;
    }

    /* renamed from: H */
    public static void m9396H(C8602Yu0 c8602Yu0, long j) {
        c8602Yu0.bitField0_ |= 8;
        c8602Yu0.responsePayloadBytes_ = j;
    }

    /* renamed from: J */
    public static C8602Yu0 m9397J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: b0 */
    public static C8498Wu0 m9398b0() {
        return (C8498Wu0) DEFAULT_INSTANCE.m26295l();
    }

    /* renamed from: u */
    public static void m9399u(C8602Yu0 c8602Yu0, String str) {
        c8602Yu0.getClass();
        str.getClass();
        c8602Yu0.bitField0_ |= 1;
        c8602Yu0.url_ = str;
    }

    /* renamed from: v */
    public static void m9400v(C8602Yu0 c8602Yu0) {
        c8602Yu0.getClass();
        c8602Yu0.networkClientErrorReason_ = AbstractC7222ym.m26247x(2);
        c8602Yu0.bitField0_ |= 16;
    }

    /* renamed from: w */
    public static void m9401w(C8602Yu0 c8602Yu0, int i) {
        c8602Yu0.bitField0_ |= 32;
        c8602Yu0.httpResponseCode_ = i;
    }

    /* renamed from: x */
    public static void m9402x(C8602Yu0 c8602Yu0, String str) {
        c8602Yu0.getClass();
        str.getClass();
        c8602Yu0.bitField0_ |= 64;
        c8602Yu0.responseContentType_ = str;
    }

    /* renamed from: y */
    public static void m9403y(C8602Yu0 c8602Yu0) {
        c8602Yu0.bitField0_ &= -65;
        c8602Yu0.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    /* renamed from: z */
    public static void m9404z(C8602Yu0 c8602Yu0, long j) {
        c8602Yu0.bitField0_ |= 128;
        c8602Yu0.clientStartTimeUs_ = j;
    }

    /* renamed from: I */
    public final long m9405I() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: K */
    public final int m9406K() {
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

    /* renamed from: L */
    public final int m9407L() {
        return this.httpResponseCode_;
    }

    /* renamed from: M */
    public final InterfaceC11381v90 m9408M() {
        return this.perfSessions_;
    }

    /* renamed from: N */
    public final long m9409N() {
        return this.requestPayloadBytes_;
    }

    /* renamed from: O */
    public final long m9410O() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: P */
    public final long m9411P() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: Q */
    public final long m9412Q() {
        return this.timeToResponseCompletedUs_;
    }

    /* renamed from: R */
    public final long m9413R() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: S */
    public final String m9414S() {
        return this.url_;
    }

    /* renamed from: T */
    public final boolean m9415T() {
        return (this.bitField0_ & 128) != 0;
    }

    /* renamed from: U */
    public final boolean m9416U() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: V */
    public final boolean m9417V() {
        return (this.bitField0_ & 32) != 0;
    }

    /* renamed from: W */
    public final boolean m9418W() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: X */
    public final boolean m9419X() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: Y */
    public final boolean m9420Y() {
        return (this.bitField0_ & 256) != 0;
    }

    /* renamed from: Z */
    public final boolean m9421Z() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* renamed from: a0 */
    public final boolean m9422a0() {
        return (this.bitField0_ & 512) != 0;
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", C9937jt0.f35440e, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", C7356Av0.f466f, "customAttributes_", AbstractC8550Xu0.f14043a, "perfSessions_", IA0.class});
            case 3:
                return new C8602Yu0();
            case 4:
                return new C8498Wu0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C8602Yu0.class) {
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
