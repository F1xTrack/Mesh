package p000;

/* renamed from: dt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9169dt0 implements InterfaceC6548oN {

    /* renamed from: e */
    public String f26357e;

    /* renamed from: f */
    public InterfaceC8357Ub1 f26358f;

    /* renamed from: i */
    public boolean f26361i;

    /* renamed from: k */
    public int f26363k;

    /* renamed from: l */
    public int f26364l;

    /* renamed from: n */
    public int f26366n;

    /* renamed from: o */
    public int f26367o;

    /* renamed from: s */
    public int f26371s;

    /* renamed from: u */
    public boolean f26373u;

    /* renamed from: d */
    public int f26356d = 0;

    /* renamed from: a */
    public final C9591hA0 f26353a = new C9591hA0(new byte[15], 2);

    /* renamed from: b */
    public final C0683Kq f26354b = new C0683Kq();

    /* renamed from: c */
    public final C9591hA0 f26355c = new C9591hA0();

    /* renamed from: p */
    public final C9297et0 f26368p = new C9297et0();

    /* renamed from: q */
    public int f26369q = -2147483647;

    /* renamed from: r */
    public int f26370r = -1;

    /* renamed from: t */
    public long f26372t = -1;

    /* renamed from: j */
    public boolean f26362j = true;

    /* renamed from: m */
    public boolean f26365m = true;

    /* renamed from: g */
    public double f26359g = -9.223372036854776E18d;

    /* renamed from: h */
    public double f26360h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0410  */
    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9102b(p000.C9591hA0 r24) throws p000.C10103lA0 {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9169dt0.mo9102b(hA0):void");
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        this.f26356d = 0;
        this.f26364l = 0;
        this.f26353a.m18738D(2);
        this.f26366n = 0;
        this.f26367o = 0;
        this.f26369q = -2147483647;
        this.f26370r = -1;
        this.f26371s = 0;
        this.f26372t = -1L;
        this.f26373u = false;
        this.f26361i = false;
        this.f26365m = true;
        this.f26362j = true;
        this.f26359g = -9.223372036854776E18d;
        this.f26360h = -9.223372036854776E18d;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f26357e = (String) ym0.f14269b;
        ym0.m9267b();
        this.f26358f = interfaceC1538YR.mo2005w(ym0.f14272e, 1);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f26363k = i;
        if (!this.f26362j && (this.f26367o != 0 || !this.f26365m)) {
            this.f26361i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f26361i) {
                this.f26360h = j;
            } else {
                this.f26359g = j;
            }
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
    }
}
