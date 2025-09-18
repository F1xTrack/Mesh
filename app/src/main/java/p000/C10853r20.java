package p000;

/* renamed from: r20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10853r20 implements InterfaceC6548oN {

    /* renamed from: a */
    public final C4238iN f41290a;

    /* renamed from: b */
    public final boolean f41291b;

    /* renamed from: c */
    public final boolean f41292c;

    /* renamed from: g */
    public long f41296g;

    /* renamed from: i */
    public String f41298i;

    /* renamed from: j */
    public InterfaceC8357Ub1 f41299j;

    /* renamed from: k */
    public C10725q20 f41300k;

    /* renamed from: l */
    public boolean f41301l;

    /* renamed from: n */
    public boolean f41303n;

    /* renamed from: h */
    public final boolean[] f41297h = new boolean[3];

    /* renamed from: d */
    public final C1664aR f41293d = new C1664aR(7);

    /* renamed from: e */
    public final C1664aR f41294e = new C1664aR(8);

    /* renamed from: f */
    public final C1664aR f41295f = new C1664aR(6);

    /* renamed from: m */
    public long f41302m = -9223372036854775807L;

    /* renamed from: o */
    public final C9591hA0 f41304o = new C9591hA0();

    public C10853r20(C4238iN c4238iN, boolean z, boolean z2) {
        this.f41290a = c4238iN;
        this.f41291b = z;
        this.f41292c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24148a(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10853r20.m24148a(byte[], int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0289  */
    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9102b(p000.C9591hA0 r31) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10853r20.mo9102b(hA0):void");
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        this.f41296g = 0L;
        this.f41303n = false;
        this.f41302m = -9223372036854775807L;
        TA1.m7611a(this.f41297h);
        this.f41293d.m9738g();
        this.f41294e.m9738g();
        this.f41295f.m9738g();
        C10725q20 c10725q20 = this.f41300k;
        if (c10725q20 != null) {
            c10725q20.f40517k = false;
            c10725q20.f40521o = false;
            C10597p20 c10597p20 = c10725q20.f40520n;
            c10597p20.f39741b = false;
            c10597p20.f39740a = false;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f41298i = (String) ym0.f14269b;
        ym0.m9267b();
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(ym0.f14272e, 2);
        this.f41299j = interfaceC8357Ub1Mo2005w;
        this.f41300k = new C10725q20(interfaceC8357Ub1Mo2005w, this.f41291b, this.f41292c);
        this.f41290a.m19016s(interfaceC1538YR, ym0);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
        YN1.m9283h(this.f41299j);
        int i = AbstractC7485Dh1.f2166a;
        if (z) {
            C10725q20 c10725q20 = this.f41300k;
            long j = this.f41296g;
            c10725q20.m23928a();
            c10725q20.f40516j = j;
            long j2 = c10725q20.f40523q;
            if (j2 != -9223372036854775807L) {
                boolean z2 = c10725q20.f40524r;
                c10725q20.f40507a.mo960a(j2, z2 ? 1 : 0, (int) (j - c10725q20.f40522p), 0, null);
            }
            c10725q20.f40521o = false;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f41302m = j;
        this.f41303n = ((i & 2) != 0) | this.f41303n;
    }
}
