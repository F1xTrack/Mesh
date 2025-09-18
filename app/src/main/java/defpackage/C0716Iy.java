package defpackage;

/* renamed from: Iy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0716Iy extends U0 implements QN0 {
    public final /* synthetic */ int c = 0;
    public final C1559Tt0 d;
    public final ED e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0716Iy(InterfaceC7662vl interfaceC7662vl, AbstractC0663Ig0 abstractC0663Ig0, C1559Tt0 c1559Tt0) {
        super(abstractC0663Ig0);
        O90.f(abstractC0663Ig0, "receiverType");
        this.e = (FD) interfaceC7662vl;
        this.d = c1559Tt0;
    }

    @Override // defpackage.U0
    public final String toString() {
        switch (this.c) {
            case 0:
                return getType() + ": Ctx { " + ((InterfaceC7492us) this.e) + " }";
            default:
                return "Cxt { " + ((FD) this.e) + " }";
        }
    }

    public final C1559Tt0 w1() {
        switch (this.c) {
        }
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0716Iy(InterfaceC7492us interfaceC7492us, AbstractC0663Ig0 abstractC0663Ig0, C1559Tt0 c1559Tt0) {
        super(abstractC0663Ig0);
        O90.f(abstractC0663Ig0, "receiverType");
        this.e = interfaceC7492us;
        this.d = c1559Tt0;
    }
}
