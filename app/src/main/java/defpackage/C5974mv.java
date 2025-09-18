package defpackage;

/* renamed from: mv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5974mv implements InterfaceC1729Vy {
    public static final C5974mv b = new C5974mv(0);
    public static final C5974mv c = new C5974mv(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C5974mv(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return JN.a;
        }
    }

    @Override // defpackage.InterfaceC1729Vy
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }
}
