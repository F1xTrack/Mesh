package p000;

/* renamed from: mv */
/* loaded from: classes2.dex */
public final class C6456mv implements InterfaceC1382Vy {

    /* renamed from: b */
    public static final C6456mv f37990b = new C6456mv(0);

    /* renamed from: c */
    public static final C6456mv f37991c = new C6456mv(1);

    /* renamed from: a */
    public final /* synthetic */ int f37992a;

    public /* synthetic */ C6456mv(int i) {
        this.f37992a = i;
    }

    @Override // p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        switch (this.f37992a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return C0591JN.f5499a;
        }
    }

    @Override // p000.InterfaceC1382Vy
    public final void resumeWith(Object obj) {
        switch (this.f37992a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f37992a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    /* renamed from: b */
    private final void m23017b(Object obj) {
    }
}
