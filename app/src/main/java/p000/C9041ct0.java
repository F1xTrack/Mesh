package p000;

/* renamed from: ct0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9041ct0 implements InterfaceC6548oN {

    /* renamed from: a */
    public final C9591hA0 f25694a;

    /* renamed from: b */
    public final C1004Px f25695b;

    /* renamed from: c */
    public final String f25696c;

    /* renamed from: d */
    public final int f25697d;

    /* renamed from: e */
    public InterfaceC8357Ub1 f25698e;

    /* renamed from: f */
    public String f25699f;

    /* renamed from: g */
    public int f25700g = 0;

    /* renamed from: h */
    public int f25701h;

    /* renamed from: i */
    public boolean f25702i;

    /* renamed from: j */
    public boolean f25703j;

    /* renamed from: k */
    public long f25704k;

    /* renamed from: l */
    public int f25705l;

    /* renamed from: m */
    public long f25706m;

    public C9041ct0(String str, int i) {
        C9591hA0 c9591hA0 = new C9591hA0(4);
        this.f25694a = c9591hA0;
        c9591hA0.f28293a[0] = -1;
        this.f25695b = new C1004Px();
        this.f25706m = -9223372036854775807L;
        this.f25696c = str;
        this.f25697d = i;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    public final void mo9102b(C9591hA0 c9591hA0) {
        YN1.m9283h(this.f25698e);
        while (c9591hA0.m18743a() > 0) {
            int i = this.f25700g;
            C9591hA0 c9591hA02 = this.f25694a;
            if (i == 0) {
                byte[] bArr = c9591hA0.f28293a;
                int i2 = c9591hA0.f28294b;
                int i3 = c9591hA0.f28295c;
                while (true) {
                    if (i2 >= i3) {
                        c9591hA0.m18741G(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f25703j && (b & 224) == 224;
                    this.f25703j = z;
                    if (z2) {
                        c9591hA0.m18741G(i2 + 1);
                        this.f25703j = false;
                        c9591hA02.f28293a[1] = bArr[i2];
                        this.f25701h = 2;
                        this.f25700g = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(c9591hA0.m18743a(), 4 - this.f25701h);
                c9591hA0.m18747e(c9591hA02.f28293a, this.f25701h, iMin);
                int i4 = this.f25701h + iMin;
                this.f25701h = i4;
                if (i4 >= 4) {
                    c9591hA02.m18741G(0);
                    int iM18749g = c9591hA02.m18749g();
                    C1004Px c1004Px = this.f25695b;
                    if (c1004Px.m6491b(iM18749g)) {
                        this.f25705l = c1004Px.f9366b;
                        if (!this.f25702i) {
                            this.f25704k = (c1004Px.f9370f * 1000000) / c1004Px.f9367c;
                            C6623pX c6623pX = new C6623pX();
                            c6623pX.f40150a = this.f25699f;
                            c6623pX.f40161l = AbstractC8544Xr0.m9171n((String) c1004Px.f9371g);
                            c6623pX.f40162m = 4096;
                            c6623pX.f40175z = c1004Px.f9368d;
                            c6623pX.f40141A = c1004Px.f9367c;
                            c6623pX.f40153d = this.f25696c;
                            c6623pX.f40155f = this.f25697d;
                            this.f25698e.mo965f(new C6686qX(c6623pX));
                            this.f25702i = true;
                        }
                        c9591hA02.m18741G(0);
                        this.f25698e.mo963d(4, c9591hA02);
                        this.f25700g = 2;
                    } else {
                        this.f25701h = 0;
                        this.f25700g = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c9591hA0.m18743a(), this.f25705l - this.f25701h);
                this.f25698e.mo963d(iMin2, c9591hA0);
                int i5 = this.f25701h + iMin2;
                this.f25701h = i5;
                if (i5 >= this.f25705l) {
                    YN1.m9281f(this.f25706m != -9223372036854775807L);
                    this.f25698e.mo960a(this.f25706m, 1, this.f25705l, 0, null);
                    this.f25706m += this.f25704k;
                    this.f25701h = 0;
                    this.f25700g = 0;
                }
            }
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        this.f25700g = 0;
        this.f25701h = 0;
        this.f25703j = false;
        this.f25706m = -9223372036854775807L;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f25699f = (String) ym0.f14269b;
        ym0.m9267b();
        this.f25698e = interfaceC1538YR.mo2005w(ym0.f14272e, 1);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f25706m = j;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
    }
}
