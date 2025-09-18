package defpackage;

/* renamed from: o00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6182o00 implements InterfaceC6536pr0 {
    public static final C6182o00 b = new C6182o00(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C6182o00(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC6536pr0
    public final C5479kJ0 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!AbstractC8279z00.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C5479kJ0) AbstractC8279z00.n(cls.asSubclass(AbstractC8279z00.class)).m(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.InterfaceC6536pr0
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return AbstractC8279z00.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
