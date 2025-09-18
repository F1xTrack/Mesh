package p000;

/* loaded from: classes.dex */
public final class UU1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CU1 f11813a;

    /* renamed from: b */
    public final /* synthetic */ CU1 f11814b;

    /* renamed from: c */
    public final /* synthetic */ long f11815c;

    /* renamed from: d */
    public final /* synthetic */ boolean f11816d;

    /* renamed from: e */
    public final /* synthetic */ JU1 f11817e;

    public UU1(JU1 ju1, CU1 cu1, CU1 cu12, long j, boolean z) {
        this.f11813a = cu1;
        this.f11814b = cu12;
        this.f11815c = j;
        this.f11816d = z;
        this.f11817e = ju1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11817e.m4332F1(this.f11813a, this.f11814b, this.f11815c, this.f11816d, null);
    }
}
