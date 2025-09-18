package p000;

/* renamed from: p00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10591p00 implements InterfaceC10829qr0 {

    /* renamed from: b */
    public static final C10591p00 f39427b = new C10591p00(0);

    /* renamed from: a */
    public final /* synthetic */ int f39428a;

    public /* synthetic */ C10591p00(int i) {
        this.f39428a = i;
    }

    @Override // p000.InterfaceC10829qr0
    /* renamed from: a */
    public final C10121lJ0 mo6424a(Class cls) {
        switch (this.f39428a) {
            case 0:
                if (!B00.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C10121lJ0) B00.m427e(cls.asSubclass(B00.class)).mo432d(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.InterfaceC10829qr0
    /* renamed from: b */
    public final boolean mo6425b(Class cls) {
        switch (this.f39428a) {
            case 0:
                return B00.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
