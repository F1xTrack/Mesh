package p000;

/* renamed from: wz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11612wz0 {

    /* renamed from: a */
    public final InterfaceC1279UK f45219a;

    /* renamed from: b */
    public int[] f45220b = null;

    /* renamed from: c */
    public boolean f45221c = true;

    /* renamed from: d */
    public boolean f45222d = true;

    /* renamed from: e */
    public C11891zA0 f45223e;

    /* renamed from: f */
    public C11891zA0 f45224f;

    /* renamed from: g */
    public C11891zA0 f45225g;

    /* renamed from: h */
    public C11891zA0 f45226h;

    /* renamed from: i */
    public C11891zA0 f45227i;

    /* renamed from: j */
    public C11891zA0 f45228j;

    /* renamed from: k */
    public InterfaceC9277ej0 f45229k;

    /* renamed from: l */
    public int f45230l;

    /* renamed from: m */
    public boolean f45231m;

    /* renamed from: n */
    public boolean f45232n;

    /* renamed from: o */
    public String f45233o;

    /* renamed from: p */
    public boolean f45234p;

    /* renamed from: q */
    public int f45235q;

    /* renamed from: r */
    public boolean f45236r;

    /* renamed from: s */
    public EnumC0599JV f45237s;

    /* renamed from: t */
    public boolean f45238t;

    /* renamed from: u */
    public boolean f45239u;

    /* renamed from: v */
    public final /* synthetic */ C11891zA0 f45240v;

    public C11612wz0(C11891zA0 c11891zA0, InterfaceC1279UK interfaceC1279UK) {
        this.f45240v = c11891zA0;
        C1653aG c1653aG = new C1653aG();
        c1653aG.f15408a = c11891zA0;
        this.f45229k = c1653aG;
        this.f45230l = 0;
        this.f45231m = false;
        this.f45232n = false;
        this.f45233o = null;
        this.f45234p = true;
        this.f45235q = 0;
        this.f45236r = false;
        this.f45237s = EnumC0599JV.f5557a;
        this.f45238t = false;
        this.f45239u = false;
        this.f45219a = interfaceC1279UK;
    }

    /* renamed from: a */
    public final void m25729a() {
        C11891zA0 c11891zA0 = this.f45240v;
        if (!c11891zA0.f45931K) {
            c11891zA0.f45932L = this;
            return;
        }
        c11891zA0.m26025r();
        C0471HT c0471ht = c11891zA0.f45950q;
        c0471ht.f4309a = this.f45224f;
        c0471ht.f4310b = this.f45225g;
        c0471ht.f4313e = this.f45223e;
        c0471ht.f4311c = this.f45226h;
        c0471ht.f4312d = this.f45227i;
        c0471ht.f4314f = this.f45228j;
        c0471ht.getClass();
        c11891zA0.f45950q.f4315g = this.f45229k;
        c11891zA0.setSwipeEnabled(this.f45221c);
        c11891zA0.setNightMode(false);
        c11891zA0.f45959z = this.f45222d;
        c11891zA0.setDefaultPage(this.f45230l);
        c11891zA0.setLandscapeOrientation(false);
        c11891zA0.setDualPageMode(false);
        c11891zA0.setSwipeVertical(!this.f45231m);
        c11891zA0.f45924D = this.f45232n;
        c11891zA0.setScrollHandle(null);
        c11891zA0.f45925E = this.f45234p;
        c11891zA0.setSpacing(this.f45235q);
        c11891zA0.setAutoSpacing(this.f45236r);
        c11891zA0.setPageFitPolicy(this.f45237s);
        c11891zA0.setFitEachPage(false);
        c11891zA0.setPageSnap(this.f45239u);
        c11891zA0.setPageFling(this.f45238t);
        int[] iArr = this.f45220b;
        InterfaceC1279UK interfaceC1279UK = this.f45219a;
        if (iArr != null) {
            c11891zA0.m26020m(interfaceC1279UK, this.f45233o, iArr);
        } else {
            c11891zA0.m26020m(interfaceC1279UK, this.f45233o, null);
        }
    }
}
