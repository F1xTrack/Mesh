package defpackage;

/* renamed from: Xc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1821Xc1 extends AbstractC8279z00 {
    private static final C1821Xc1 DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile InterfaceC4294iA0 PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        C1821Xc1 c1821Xc1 = new C1821Xc1();
        DEFAULT_INSTANCE = c1821Xc1;
        AbstractC8279z00.s(C1821Xc1.class, c1821Xc1);
    }

    @Override // defpackage.AbstractC8279z00
    public final Object m(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5479kJ0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", NV1.f});
            case 3:
                return new C1821Xc1();
            case 4:
                return new C1743Wc1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC4294iA0 c7136t00 = PARSER;
                if (c7136t00 == null) {
                    synchronized (C1821Xc1.class) {
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
