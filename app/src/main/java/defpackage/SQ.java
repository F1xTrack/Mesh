package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class SQ implements InterfaceC1373Rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ SQ(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.InterfaceC1373Rj0
    public final void invoke(Object obj) {
        GB0 gb0 = (GB0) obj;
        switch (this.a) {
            case 0:
                gb0.m(this.b);
                break;
            default:
                gb0.z(this.b);
                break;
        }
    }
}
