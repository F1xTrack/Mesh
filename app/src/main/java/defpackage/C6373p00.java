package defpackage;

/* renamed from: p00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6373p00 implements InterfaceC6727qr0 {
    public static final C6373p00 b = new C6373p00(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C6373p00(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC6727qr0
    public final C5670lJ0 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!B00.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C5670lJ0) B00.e(cls.asSubclass(B00.class)).d(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.InterfaceC6727qr0
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return B00.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
