package defpackage;

/* renamed from: hf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4197hf1 extends AbstractC8026xf1 {
    public final int b;
    public final boolean c;
    public final boolean d;
    public final /* synthetic */ C8216yf1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4197hf1(C8216yf1 c8216yf1, int i, int i2, boolean z, boolean z2) {
        super(i);
        this.e = c8216yf1;
        this.b = i2;
        this.d = z;
        this.c = z2;
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() {
        boolean z = this.d;
        C8216yf1 c8216yf1 = this.e;
        if (z) {
            c8216yf1.b.clearJSResponder();
            return;
        }
        c8216yf1.b.setJSResponder(this.a, this.b, this.c);
    }
}
