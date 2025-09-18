package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ML implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OL b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ML(OL ol, PL pl, int i) {
        this.a = i;
        this.b = ol;
        this.c = pl;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [PL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [PL, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                OL ol = this.b;
                this.c.k0(ol.a, ol.b);
                break;
            case 1:
                OL ol2 = this.b;
                this.c.N(ol2.a, ol2.b);
                break;
            default:
                OL ol3 = this.b;
                this.c.b0(ol3.a, ol3.b);
                break;
        }
    }
}
