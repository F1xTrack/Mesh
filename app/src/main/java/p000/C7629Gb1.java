package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: Gb1 */
/* loaded from: classes.dex */
public final class C7629Gb1 extends AbstractC11868z00 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final C7629Gb1 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC9719iA0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private C9541gn0 counters_;
    private C9541gn0 customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private InterfaceC11381v90 perfSessions_;
    private InterfaceC11381v90 subtraces_;

    static {
        C7629Gb1 c7629Gb1 = new C7629Gb1();
        DEFAULT_INSTANCE = c7629Gb1;
        AbstractC11868z00.m26292s(C7629Gb1.class, c7629Gb1);
    }

    public C7629Gb1() {
        C9541gn0 c9541gn0 = C9541gn0.f27993b;
        this.counters_ = c9541gn0;
        this.customAttributes_ = c9541gn0;
        this.name_ = "";
        C8702aG0 c8702aG0 = C8702aG0.f15409d;
        this.subtraces_ = c8702aG0;
        this.perfSessions_ = c8702aG0;
    }

    /* renamed from: A */
    public static void m3096A(C7629Gb1 c7629Gb1, List list) {
        InterfaceC11381v90 interfaceC11381v90 = c7629Gb1.perfSessions_;
        if (!((AbstractC1133S0) interfaceC11381v90).f10523a) {
            c7629Gb1.perfSessions_ = AbstractC11868z00.m26291r(interfaceC11381v90);
        }
        AbstractC0568J0.m4100b(list, c7629Gb1.perfSessions_);
    }

    /* renamed from: B */
    public static void m3097B(C7629Gb1 c7629Gb1, long j) {
        c7629Gb1.bitField0_ |= 4;
        c7629Gb1.clientStartTimeUs_ = j;
    }

    /* renamed from: C */
    public static void m3098C(C7629Gb1 c7629Gb1, long j) {
        c7629Gb1.bitField0_ |= 8;
        c7629Gb1.durationUs_ = j;
    }

    /* renamed from: H */
    public static C7629Gb1 m3099H() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C7473Db1 m3100N() {
        return (C7473Db1) DEFAULT_INSTANCE.m26295l();
    }

    /* renamed from: u */
    public static void m3101u(C7629Gb1 c7629Gb1, String str) {
        c7629Gb1.getClass();
        str.getClass();
        c7629Gb1.bitField0_ |= 1;
        c7629Gb1.name_ = str;
    }

    /* renamed from: v */
    public static C9541gn0 m3102v(C7629Gb1 c7629Gb1) {
        C9541gn0 c9541gn0 = c7629Gb1.counters_;
        if (!c9541gn0.f27994a) {
            c7629Gb1.counters_ = c9541gn0.m18641i();
        }
        return c7629Gb1.counters_;
    }

    /* renamed from: w */
    public static void m3103w(C7629Gb1 c7629Gb1, C7629Gb1 c7629Gb12) {
        c7629Gb1.getClass();
        c7629Gb12.getClass();
        InterfaceC11381v90 interfaceC11381v90 = c7629Gb1.subtraces_;
        if (!((AbstractC1133S0) interfaceC11381v90).f10523a) {
            c7629Gb1.subtraces_ = AbstractC11868z00.m26291r(interfaceC11381v90);
        }
        c7629Gb1.subtraces_.add(c7629Gb12);
    }

    /* renamed from: x */
    public static void m3104x(C7629Gb1 c7629Gb1, ArrayList arrayList) {
        InterfaceC11381v90 interfaceC11381v90 = c7629Gb1.subtraces_;
        if (!((AbstractC1133S0) interfaceC11381v90).f10523a) {
            c7629Gb1.subtraces_ = AbstractC11868z00.m26291r(interfaceC11381v90);
        }
        AbstractC0568J0.m4100b(arrayList, c7629Gb1.subtraces_);
    }

    /* renamed from: y */
    public static C9541gn0 m3105y(C7629Gb1 c7629Gb1) {
        C9541gn0 c9541gn0 = c7629Gb1.customAttributes_;
        if (!c9541gn0.f27994a) {
            c7629Gb1.customAttributes_ = c9541gn0.m18641i();
        }
        return c7629Gb1.customAttributes_;
    }

    /* renamed from: z */
    public static void m3106z(C7629Gb1 c7629Gb1, IA0 ia0) {
        c7629Gb1.getClass();
        InterfaceC11381v90 interfaceC11381v90 = c7629Gb1.perfSessions_;
        if (!((AbstractC1133S0) interfaceC11381v90).f10523a) {
            c7629Gb1.perfSessions_ = AbstractC11868z00.m26291r(interfaceC11381v90);
        }
        c7629Gb1.perfSessions_.add(ia0);
    }

    /* renamed from: D */
    public final boolean m3107D() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    /* renamed from: E */
    public final int m3108E() {
        return this.counters_.size();
    }

    /* renamed from: F */
    public final Map m3109F() {
        return Collections.unmodifiableMap(this.counters_);
    }

    /* renamed from: G */
    public final Map m3110G() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    /* renamed from: I */
    public final long m3111I() {
        return this.durationUs_;
    }

    /* renamed from: J */
    public final String m3112J() {
        return this.name_;
    }

    /* renamed from: K */
    public final InterfaceC11381v90 m3113K() {
        return this.perfSessions_;
    }

    /* renamed from: L */
    public final InterfaceC11381v90 m3114L() {
        return this.subtraces_;
    }

    /* renamed from: M */
    public final boolean m3115M() {
        return (this.bitField0_ & 4) != 0;
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", AbstractC7525Eb1.f2799a, "subtraces_", C7629Gb1.class, "customAttributes_", AbstractC7577Fb1.f3324a, "perfSessions_", IA0.class});
            case 3:
                return new C7629Gb1();
            case 4:
                return new C7473Db1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C7629Gb1.class) {
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
