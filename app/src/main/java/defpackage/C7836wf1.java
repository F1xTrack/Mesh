package defpackage;

/* renamed from: wf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7836wf1 extends AbstractC8026xf1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ C8216yf1 c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7836wf1(C8216yf1 c8216yf1, int i, Object obj, int i2) {
        super(i);
        this.b = i2;
        this.c = c8216yf1;
        this.d = obj;
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() {
        switch (this.b) {
            case 0:
                this.c.b.updateProperties(this.a, (NM0) this.d);
                break;
            default:
                this.c.b.updateViewExtraData(this.a, (C2503cN0) this.d);
                break;
        }
    }
}
