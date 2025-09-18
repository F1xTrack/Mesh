package defpackage;

/* loaded from: classes.dex */
public final class W6 extends AX {
    public final /* synthetic */ C3330d7 j;
    public final /* synthetic */ C3902g7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(C3902g7 c3902g7, C3902g7 c3902g72, C3330d7 c3330d7) {
        super(c3902g72);
        this.k = c3902g7;
        this.j = c3330d7;
    }

    @Override // defpackage.AX
    public final InterfaceC8090y01 b() {
        return this.j;
    }

    @Override // defpackage.AX
    public final boolean c() {
        C3902g7 c3902g7 = this.k;
        if (c3902g7.getInternalPopup().a()) {
            return true;
        }
        c3902g7.f.l(c3902g7.getTextDirection(), c3902g7.getTextAlignment());
        return true;
    }
}
