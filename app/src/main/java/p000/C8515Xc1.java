package p000;

/* renamed from: Xc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8515Xc1 extends AbstractC11868z00 {
    private static final C8515Xc1 DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile InterfaceC9719iA0 PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        C8515Xc1 c8515Xc1 = new C8515Xc1();
        DEFAULT_INSTANCE = c8515Xc1;
        AbstractC11868z00.m26292s(C8515Xc1.class, c8515Xc1);
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
                return new C9993kJ0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", NV1.f7840f});
            case 3:
                return new C8515Xc1();
            case 4:
                return new C8463Wc1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC9719iA0 c11103t00 = PARSER;
                if (c11103t00 == null) {
                    synchronized (C8515Xc1.class) {
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
