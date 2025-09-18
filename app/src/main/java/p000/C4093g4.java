package p000;

/* renamed from: g4 */
/* loaded from: classes.dex */
public final class C4093g4 extends AbstractC11868z00 {
    private static final C4093g4 DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC9719iA0 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        C4093g4 c4093g4 = new C4093g4();
        DEFAULT_INSTANCE = c4093g4;
        AbstractC11868z00.m26292s(C4093g4.class, c4093g4);
    }

    /* renamed from: A */
    public static C3967e4 m18394A() {
        return (C3967e4) DEFAULT_INSTANCE.m26295l();
    }

    /* renamed from: u */
    public static void m18395u(C4093g4 c4093g4, String str) {
        c4093g4.getClass();
        str.getClass();
        c4093g4.bitField0_ |= 1;
        c4093g4.packageName_ = str;
    }

    /* renamed from: v */
    public static void m18396v(C4093g4 c4093g4) {
        c4093g4.getClass();
        c4093g4.bitField0_ |= 2;
        c4093g4.sdkVersion_ = "21.0.4";
    }

    /* renamed from: w */
    public static void m18397w(C4093g4 c4093g4, String str) {
        c4093g4.getClass();
        c4093g4.bitField0_ |= 4;
        c4093g4.versionName_ = str;
    }

    /* renamed from: x */
    public static C4093g4 m18398x() {
        return DEFAULT_INSTANCE;
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new C4093g4();
            case 4:
                return new C3967e4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C4093g4.class) {
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
    public final boolean m18399y() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: z */
    public final boolean m18400z() {
        return (this.bitField0_ & 2) != 0;
    }
}
