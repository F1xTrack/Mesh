package defpackage;

/* renamed from: g4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3893g4 extends AbstractC8279z00 {
    private static final C3893g4 DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC4294iA0 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        C3893g4 c3893g4 = new C3893g4();
        DEFAULT_INSTANCE = c3893g4;
        AbstractC8279z00.s(C3893g4.class, c3893g4);
    }

    public static C3511e4 A() {
        return (C3511e4) DEFAULT_INSTANCE.l();
    }

    public static void u(C3893g4 c3893g4, String str) {
        c3893g4.getClass();
        str.getClass();
        c3893g4.bitField0_ |= 1;
        c3893g4.packageName_ = str;
    }

    public static void v(C3893g4 c3893g4) {
        c3893g4.getClass();
        c3893g4.bitField0_ |= 2;
        c3893g4.sdkVersion_ = "21.0.4";
    }

    public static void w(C3893g4 c3893g4, String str) {
        c3893g4.getClass();
        c3893g4.bitField0_ |= 4;
        c3893g4.versionName_ = str;
    }

    public static C3893g4 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new C3893g4();
            case 4:
                return new C3511e4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C3893g4.class) {
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

    public final boolean y() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 2) != 0;
    }
}
