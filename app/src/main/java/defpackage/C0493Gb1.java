package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: Gb1 */
/* loaded from: classes.dex */
public final class C0493Gb1 extends AbstractC8279z00 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final C0493Gb1 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private C4029gn0 counters_;
    private C4029gn0 customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private InterfaceC7549v90 perfSessions_;
    private InterfaceC7549v90 subtraces_;

    static {
        C0493Gb1 c0493Gb1 = new C0493Gb1();
        DEFAULT_INSTANCE = c0493Gb1;
        AbstractC8279z00.s(C0493Gb1.class, c0493Gb1);
    }

    public C0493Gb1() {
        C4029gn0 c4029gn0 = C4029gn0.b;
        this.counters_ = c4029gn0;
        this.customAttributes_ = c4029gn0;
        this.name_ = "";
        C2101aG0 c2101aG0 = C2101aG0.d;
        this.subtraces_ = c2101aG0;
        this.perfSessions_ = c2101aG0;
    }

    public static void A(C0493Gb1 c0493Gb1, List list) {
        InterfaceC7549v90 interfaceC7549v90 = c0493Gb1.perfSessions_;
        if (!((S0) interfaceC7549v90).a) {
            c0493Gb1.perfSessions_ = AbstractC8279z00.r(interfaceC7549v90);
        }
        J0.b(list, c0493Gb1.perfSessions_);
    }

    public static void B(C0493Gb1 c0493Gb1, long j) {
        c0493Gb1.bitField0_ |= 4;
        c0493Gb1.clientStartTimeUs_ = j;
    }

    public static void C(C0493Gb1 c0493Gb1, long j) {
        c0493Gb1.bitField0_ |= 8;
        c0493Gb1.durationUs_ = j;
    }

    public static C0493Gb1 H() {
        return DEFAULT_INSTANCE;
    }

    public static C0259Db1 N() {
        return (C0259Db1) DEFAULT_INSTANCE.l();
    }

    public static void u(C0493Gb1 c0493Gb1, String str) {
        c0493Gb1.getClass();
        str.getClass();
        c0493Gb1.bitField0_ |= 1;
        c0493Gb1.name_ = str;
    }

    public static C4029gn0 v(C0493Gb1 c0493Gb1) {
        C4029gn0 c4029gn0 = c0493Gb1.counters_;
        if (!c4029gn0.a) {
            c0493Gb1.counters_ = c4029gn0.i();
        }
        return c0493Gb1.counters_;
    }

    public static void w(C0493Gb1 c0493Gb1, C0493Gb1 c0493Gb12) {
        c0493Gb1.getClass();
        c0493Gb12.getClass();
        InterfaceC7549v90 interfaceC7549v90 = c0493Gb1.subtraces_;
        if (!((S0) interfaceC7549v90).a) {
            c0493Gb1.subtraces_ = AbstractC8279z00.r(interfaceC7549v90);
        }
        c0493Gb1.subtraces_.add(c0493Gb12);
    }

    public static void x(C0493Gb1 c0493Gb1, ArrayList arrayList) {
        InterfaceC7549v90 interfaceC7549v90 = c0493Gb1.subtraces_;
        if (!((S0) interfaceC7549v90).a) {
            c0493Gb1.subtraces_ = AbstractC8279z00.r(interfaceC7549v90);
        }
        J0.b(arrayList, c0493Gb1.subtraces_);
    }

    public static C4029gn0 y(C0493Gb1 c0493Gb1) {
        C4029gn0 c4029gn0 = c0493Gb1.customAttributes_;
        if (!c4029gn0.a) {
            c0493Gb1.customAttributes_ = c4029gn0.i();
        }
        return c0493Gb1.customAttributes_;
    }

    public static void z(C0493Gb1 c0493Gb1, IA0 ia0) {
        c0493Gb1.getClass();
        InterfaceC7549v90 interfaceC7549v90 = c0493Gb1.perfSessions_;
        if (!((S0) interfaceC7549v90).a) {
            c0493Gb1.perfSessions_ = AbstractC8279z00.r(interfaceC7549v90);
        }
        c0493Gb1.perfSessions_.add(ia0);
    }

    public final boolean D() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int E() {
        return this.counters_.size();
    }

    public final Map F() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map G() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long I() {
        return this.durationUs_;
    }

    public final String J() {
        return this.name_;
    }

    public final InterfaceC7549v90 K() {
        return this.perfSessions_;
    }

    public final InterfaceC7549v90 L() {
        return this.subtraces_;
    }

    public final boolean M() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", AbstractC0337Eb1.a, "subtraces_", C0493Gb1.class, "customAttributes_", AbstractC0415Fb1.a, "perfSessions_", IA0.class});
            case 3:
                return new C0493Gb1();
            case 4:
                return new C0259Db1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C0493Gb1.class) {
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
