package p000;

/* renamed from: t20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11109t20 implements InterfaceC6548oN {

    /* renamed from: a */
    public final C4238iN f42772a;

    /* renamed from: b */
    public String f42773b;

    /* renamed from: c */
    public InterfaceC8357Ub1 f42774c;

    /* renamed from: d */
    public C10981s20 f42775d;

    /* renamed from: e */
    public boolean f42776e;

    /* renamed from: l */
    public long f42783l;

    /* renamed from: f */
    public final boolean[] f42777f = new boolean[3];

    /* renamed from: g */
    public final C1664aR f42778g = new C1664aR(32);

    /* renamed from: h */
    public final C1664aR f42779h = new C1664aR(33);

    /* renamed from: i */
    public final C1664aR f42780i = new C1664aR(34);

    /* renamed from: j */
    public final C1664aR f42781j = new C1664aR(39);

    /* renamed from: k */
    public final C1664aR f42782k = new C1664aR(40);

    /* renamed from: m */
    public long f42784m = -9223372036854775807L;

    /* renamed from: n */
    public final C9591hA0 f42785n = new C9591hA0();

    public C11109t20(C4238iN c4238iN) {
        this.f42772a = c4238iN;
    }

    /* renamed from: a */
    public final void m24831a(byte[] bArr, int i, int i2) {
        C10981s20 c10981s20 = this.f42775d;
        if (c10981s20.f42212f) {
            int i3 = c10981s20.f42210d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                c10981s20.f42213g = (bArr[i4] & 128) != 0;
                c10981s20.f42212f = false;
            } else {
                c10981s20.f42210d = (i2 - i) + i3;
            }
        }
        if (!this.f42776e) {
            this.f42778g.m9732a(bArr, i, i2);
            this.f42779h.m9732a(bArr, i, i2);
            this.f42780i.m9732a(bArr, i, i2);
        }
        this.f42781j.m9732a(bArr, i, i2);
        this.f42782k.m9732a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022e A[SYNTHETIC] */
    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9102b(p000.C9591hA0 r38) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11109t20.mo9102b(hA0):void");
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        this.f42783l = 0L;
        this.f42784m = -9223372036854775807L;
        TA1.m7611a(this.f42777f);
        this.f42778g.m9738g();
        this.f42779h.m9738g();
        this.f42780i.m9738g();
        this.f42781j.m9738g();
        this.f42782k.m9738g();
        C10981s20 c10981s20 = this.f42775d;
        if (c10981s20 != null) {
            c10981s20.f42212f = false;
            c10981s20.f42213g = false;
            c10981s20.f42214h = false;
            c10981s20.f42215i = false;
            c10981s20.f42216j = false;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f42773b = (String) ym0.f14269b;
        ym0.m9267b();
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(ym0.f14272e, 2);
        this.f42774c = interfaceC8357Ub1Mo2005w;
        this.f42775d = new C10981s20(interfaceC8357Ub1Mo2005w);
        this.f42772a.m19016s(interfaceC1538YR, ym0);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
        YN1.m9283h(this.f42774c);
        int i = AbstractC7485Dh1.f2166a;
        if (z) {
            C10981s20 c10981s20 = this.f42775d;
            long j = this.f42783l;
            c10981s20.f42219m = c10981s20.f42209c;
            c10981s20.m24578a((int) (j - c10981s20.f42208b));
            c10981s20.f42217k = c10981s20.f42208b;
            c10981s20.f42208b = j;
            c10981s20.m24578a(0);
            c10981s20.f42215i = false;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f42784m = j;
    }
}
