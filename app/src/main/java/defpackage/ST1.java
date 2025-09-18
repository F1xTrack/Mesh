package defpackage;

/* loaded from: classes.dex */
public final class ST1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ XQ1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ FR1 e;

    public /* synthetic */ ST1(FR1 fr1, XQ1 xq1, long j, boolean z, int i) {
        this.a = i;
        this.b = xq1;
        this.c = j;
        this.d = z;
        this.e = fr1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.e.M1(this.b);
                FR1.O1(this.e, this.b, this.c, false, this.d);
                break;
            default:
                this.e.M1(this.b);
                FR1.O1(this.e, this.b, this.c, true, this.d);
                break;
        }
    }
}
