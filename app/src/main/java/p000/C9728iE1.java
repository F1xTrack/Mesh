package p000;

/* renamed from: iE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9728iE1 implements WG1 {

    /* renamed from: b */
    public static final C9728iE1 f28975b = new C9728iE1(0);

    /* renamed from: a */
    public final /* synthetic */ int f28976a;

    public /* synthetic */ C9728iE1(int i) {
        this.f28976a = i;
    }

    @Override // p000.WG1
    /* renamed from: b */
    public final NH1 mo8738b(Class cls) {
        switch (this.f28976a) {
            case 0:
                if (!EE1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (NH1) EE1.m2091e(cls.asSubclass(EE1.class)).mo1649m(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.WG1
    /* renamed from: d */
    public final boolean mo8739d(Class cls) {
        switch (this.f28976a) {
            case 0:
                return EE1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
