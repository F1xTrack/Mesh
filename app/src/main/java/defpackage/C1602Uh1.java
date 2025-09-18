package defpackage;

/* renamed from: Uh1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1602Uh1 extends AbstractC5197iq0 {
    public static final C1602Uh1 d = new C1602Uh1("must have no value parameters", 0);
    public static final C1602Uh1 e = new C1602Uh1("must have a single value parameter", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1602Uh1(String str, int i) {
        super(str, 1);
        this.c = i;
    }

    @Override // defpackage.InterfaceC8440zr
    public final boolean a(C3611eb0 c3611eb0) {
        switch (this.c) {
            case 0:
                return c3611eb0.f0().isEmpty();
            default:
                return c3611eb0.f0().size() == 1;
        }
    }
}
