package defpackage;

/* renamed from: wz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7895wz0 {
    public final UK a;
    public int[] b = null;
    public boolean c = true;
    public boolean d = true;
    public C8312zA0 e;
    public C8312zA0 f;
    public C8312zA0 g;
    public C8312zA0 h;
    public C8312zA0 i;
    public C8312zA0 j;
    public InterfaceC3635ej0 k;
    public int l;
    public boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public int q;
    public boolean r;
    public JV s;
    public boolean t;
    public boolean u;
    public final /* synthetic */ C8312zA0 v;

    public C7895wz0(C8312zA0 c8312zA0, UK uk) {
        this.v = c8312zA0;
        C2100aG c2100aG = new C2100aG();
        c2100aG.a = c8312zA0;
        this.k = c2100aG;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = null;
        this.p = true;
        this.q = 0;
        this.r = false;
        this.s = JV.a;
        this.t = false;
        this.u = false;
        this.a = uk;
    }

    public final void a() {
        C8312zA0 c8312zA0 = this.v;
        if (!c8312zA0.K) {
            c8312zA0.L = this;
            return;
        }
        c8312zA0.r();
        HT ht = c8312zA0.q;
        ht.a = this.f;
        ht.b = this.g;
        ht.e = this.e;
        ht.c = this.h;
        ht.d = this.i;
        ht.f = this.j;
        ht.getClass();
        c8312zA0.q.g = this.k;
        c8312zA0.setSwipeEnabled(this.c);
        c8312zA0.setNightMode(false);
        c8312zA0.z = this.d;
        c8312zA0.setDefaultPage(this.l);
        c8312zA0.setLandscapeOrientation(false);
        c8312zA0.setDualPageMode(false);
        c8312zA0.setSwipeVertical(!this.m);
        c8312zA0.D = this.n;
        c8312zA0.setScrollHandle(null);
        c8312zA0.E = this.p;
        c8312zA0.setSpacing(this.q);
        c8312zA0.setAutoSpacing(this.r);
        c8312zA0.setPageFitPolicy(this.s);
        c8312zA0.setFitEachPage(false);
        c8312zA0.setPageSnap(this.u);
        c8312zA0.setPageFling(this.t);
        int[] iArr = this.b;
        UK uk = this.a;
        if (iArr != null) {
            c8312zA0.m(uk, this.o, iArr);
        } else {
            c8312zA0.m(uk, this.o, null);
        }
    }
}
