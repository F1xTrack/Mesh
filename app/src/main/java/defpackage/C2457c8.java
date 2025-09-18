package defpackage;

/* renamed from: c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2457c8 extends AbstractC8279z00 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final C2457c8 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC4294iA0 PARSER;
    private C3893g4 androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private C4029gn0 customAttributes_ = C4029gn0.b;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        C2457c8 c2457c8 = new C2457c8();
        DEFAULT_INSTANCE = c2457c8;
        AbstractC8279z00.s(C2457c8.class, c2457c8);
    }

    public static C2457c8 A() {
        return DEFAULT_INSTANCE;
    }

    public static Z7 F() {
        return (Z7) DEFAULT_INSTANCE.l();
    }

    public static void u(C2457c8 c2457c8, String str) {
        c2457c8.getClass();
        str.getClass();
        c2457c8.bitField0_ |= 1;
        c2457c8.googleAppId_ = str;
    }

    public static void v(C2457c8 c2457c8, EnumC3333d8 enumC3333d8) {
        c2457c8.getClass();
        c2457c8.applicationProcessState_ = enumC3333d8.a;
        c2457c8.bitField0_ |= 8;
    }

    public static C4029gn0 w(C2457c8 c2457c8) {
        C4029gn0 c4029gn0 = c2457c8.customAttributes_;
        if (!c4029gn0.a) {
            c2457c8.customAttributes_ = c4029gn0.i();
        }
        return c2457c8.customAttributes_;
    }

    public static void x(C2457c8 c2457c8, String str) {
        c2457c8.getClass();
        str.getClass();
        c2457c8.bitField0_ |= 2;
        c2457c8.appInstanceId_ = str;
    }

    public static void y(C2457c8 c2457c8, C3893g4 c3893g4) {
        c2457c8.getClass();
        c2457c8.androidAppInfo_ = c3893g4;
        c2457c8.bitField0_ |= 4;
    }

    public final boolean B() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean E() {
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
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", C6518pl0.c, "customAttributes_", AbstractC2076a8.a});
            case 3:
                return new C2457c8();
            case 4:
                return new Z7(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C2457c8.class) {
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

    public final C3893g4 z() {
        C3893g4 c3893g4 = this.androidAppInfo_;
        return c3893g4 == null ? C3893g4.x() : c3893g4;
    }
}
