package p000;

/* renamed from: o00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10463o00 implements InterfaceC10701pr0 {

    /* renamed from: b */
    public static final C10463o00 f38667b = new C10463o00(0);

    /* renamed from: a */
    public final /* synthetic */ int f38668a;

    public /* synthetic */ C10463o00(int i) {
        this.f38668a = i;
    }

    @Override // p000.InterfaceC10701pr0
    /* renamed from: a */
    public final C9993kJ0 mo6137a(Class cls) {
        switch (this.f38668a) {
            case 0:
                if (!AbstractC11868z00.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C9993kJ0) AbstractC11868z00.m26289n(cls.asSubclass(AbstractC11868z00.class)).mo2061m(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.InterfaceC10701pr0
    /* renamed from: b */
    public final boolean mo6138b(Class cls) {
        switch (this.f38668a) {
            case 0:
                return AbstractC11868z00.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
