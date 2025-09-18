package defpackage;

/* loaded from: classes.dex */
public final class UU1 implements Runnable {
    public final /* synthetic */ CU1 a;
    public final /* synthetic */ CU1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ JU1 e;

    public UU1(JU1 ju1, CU1 cu1, CU1 cu12, long j, boolean z) {
        this.a = cu1;
        this.b = cu12;
        this.c = j;
        this.d = z;
        this.e = ju1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.F1(this.a, this.b, this.c, this.d, null);
    }
}
