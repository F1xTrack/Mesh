package defpackage;

/* renamed from: iE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4307iE1 implements WG1 {
    public static final C4307iE1 b = new C4307iE1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C4307iE1(int i) {
        this.a = i;
    }

    @Override // defpackage.WG1
    public final NH1 b(Class cls) {
        switch (this.a) {
            case 0:
                if (!EE1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (NH1) EE1.e(cls.asSubclass(EE1.class)).m(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.WG1
    public final boolean d(Class cls) {
        switch (this.a) {
            case 0:
                return EE1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
