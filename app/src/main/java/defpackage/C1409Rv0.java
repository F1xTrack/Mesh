package defpackage;

/* renamed from: Rv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1409Rv0 extends JH {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1409Rv0(X01 x01, int i) {
        super(x01);
        this.c = i;
    }

    @Override // defpackage.IH, defpackage.AbstractC0663Ig0
    public final boolean G() {
        switch (this.c) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.IH
    public final IH h0(X01 x01) {
        switch (this.c) {
            case 0:
                return new C1409Rv0(x01, 0);
            default:
                return new C1409Rv0(x01, 1);
        }
    }
}
