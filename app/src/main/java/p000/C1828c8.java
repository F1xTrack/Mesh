package p000;

/* renamed from: c8 */
/* loaded from: classes.dex */
public final class C1828c8 extends AbstractC11868z00 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final C1828c8 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC9719iA0 PARSER;
    private C4093g4 androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private C9541gn0 customAttributes_ = C9541gn0.f27993b;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        C1828c8 c1828c8 = new C1828c8();
        DEFAULT_INSTANCE = c1828c8;
        AbstractC11868z00.m26292s(C1828c8.class, c1828c8);
    }

    /* renamed from: A */
    public static C1828c8 m10597A() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: F */
    public static C1581Z7 m10598F() {
        return (C1581Z7) DEFAULT_INSTANCE.m26295l();
    }

    /* renamed from: u */
    public static void m10599u(C1828c8 c1828c8, String str) {
        c1828c8.getClass();
        str.getClass();
        c1828c8.bitField0_ |= 1;
        c1828c8.googleAppId_ = str;
    }

    /* renamed from: v */
    public static void m10600v(C1828c8 c1828c8, EnumC3909d8 enumC3909d8) {
        c1828c8.getClass();
        c1828c8.applicationProcessState_ = enumC3909d8.f25838a;
        c1828c8.bitField0_ |= 8;
    }

    /* renamed from: w */
    public static C9541gn0 m10601w(C1828c8 c1828c8) {
        C9541gn0 c9541gn0 = c1828c8.customAttributes_;
        if (!c9541gn0.f27994a) {
            c1828c8.customAttributes_ = c9541gn0.m18641i();
        }
        return c1828c8.customAttributes_;
    }

    /* renamed from: x */
    public static void m10602x(C1828c8 c1828c8, String str) {
        c1828c8.getClass();
        str.getClass();
        c1828c8.bitField0_ |= 2;
        c1828c8.appInstanceId_ = str;
    }

    /* renamed from: y */
    public static void m10603y(C1828c8 c1828c8, C4093g4 c4093g4) {
        c1828c8.getClass();
        c1828c8.androidAppInfo_ = c4093g4;
        c1828c8.bitField0_ |= 4;
    }

    /* renamed from: B */
    public final boolean m10604B() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: C */
    public final boolean m10605C() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: D */
    public final boolean m10606D() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: E */
    public final boolean m10607E() {
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", C10689pl0.f40366c, "customAttributes_", AbstractC1645a8.f15323a});
            case 3:
                return new C1828c8();
            case 4:
                return new C1581Z7(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C1828c8.class) {
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

    /* renamed from: z */
    public final C4093g4 m10608z() {
        C4093g4 c4093g4 = this.androidAppInfo_;
        return c4093g4 == null ? C4093g4.m18398x() : c4093g4;
    }
}
