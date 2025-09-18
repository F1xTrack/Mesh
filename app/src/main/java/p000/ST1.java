package p000;

/* loaded from: classes.dex */
public final class ST1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10802a;

    /* renamed from: b */
    public final /* synthetic */ XQ1 f10803b;

    /* renamed from: c */
    public final /* synthetic */ long f10804c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10805d;

    /* renamed from: e */
    public final /* synthetic */ FR1 f10806e;

    public /* synthetic */ ST1(FR1 fr1, XQ1 xq1, long j, boolean z, int i) {
        this.f10802a = i;
        this.f10803b = xq1;
        this.f10804c = j;
        this.f10805d = z;
        this.f10806e = fr1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10802a) {
            case 0:
                this.f10806e.m2643M1(this.f10803b);
                FR1.m2632O1(this.f10806e, this.f10803b, this.f10804c, false, this.f10805d);
                break;
            default:
                this.f10806e.m2643M1(this.f10803b);
                FR1.m2632O1(this.f10806e, this.f10803b, this.f10804c, true, this.f10805d);
                break;
        }
    }
}
