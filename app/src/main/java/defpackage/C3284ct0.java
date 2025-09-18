package defpackage;

/* renamed from: ct0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3284ct0 implements InterfaceC6254oN {
    public final C4103hA0 a;
    public final C1258Px b;
    public final String c;
    public final int d;
    public InterfaceC1584Ub1 e;
    public String f;
    public int g = 0;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;

    public C3284ct0(String str, int i) {
        C4103hA0 c4103hA0 = new C4103hA0(4);
        this.a = c4103hA0;
        c4103hA0.a[0] = -1;
        this.b = new C1258Px();
        this.m = -9223372036854775807L;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void b(C4103hA0 c4103hA0) {
        YN1.h(this.e);
        while (c4103hA0.a() > 0) {
            int i = this.g;
            C4103hA0 c4103hA02 = this.a;
            if (i == 0) {
                byte[] bArr = c4103hA0.a;
                int i2 = c4103hA0.b;
                int i3 = c4103hA0.c;
                while (true) {
                    if (i2 >= i3) {
                        c4103hA0.G(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.j && (b & 224) == 224;
                    this.j = z;
                    if (z2) {
                        c4103hA0.G(i2 + 1);
                        this.j = false;
                        c4103hA02.a[1] = bArr[i2];
                        this.h = 2;
                        this.g = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(c4103hA0.a(), 4 - this.h);
                c4103hA0.e(c4103hA02.a, this.h, iMin);
                int i4 = this.h + iMin;
                this.h = i4;
                if (i4 >= 4) {
                    c4103hA02.G(0);
                    int iG = c4103hA02.g();
                    C1258Px c1258Px = this.b;
                    if (c1258Px.b(iG)) {
                        this.l = c1258Px.b;
                        if (!this.i) {
                            this.k = (c1258Px.f * 1000000) / c1258Px.c;
                            C6475pX c6475pX = new C6475pX();
                            c6475pX.a = this.f;
                            c6475pX.l = AbstractC1865Xr0.n((String) c1258Px.g);
                            c6475pX.m = 4096;
                            c6475pX.z = c1258Px.d;
                            c6475pX.A = c1258Px.c;
                            c6475pX.d = this.c;
                            c6475pX.f = this.d;
                            this.e.f(new C6666qX(c6475pX));
                            this.i = true;
                        }
                        c4103hA02.G(0);
                        this.e.d(4, c4103hA02);
                        this.g = 2;
                    } else {
                        this.h = 0;
                        this.g = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c4103hA0.a(), this.l - this.h);
                this.e.d(iMin2, c4103hA0);
                int i5 = this.h + iMin2;
                this.h = i5;
                if (i5 >= this.l) {
                    YN1.f(this.m != -9223372036854775807L);
                    this.e.a(this.m, 1, this.l, 0, null);
                    this.m += this.k;
                    this.h = 0;
                    this.g = 0;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        ym0.a();
        ym0.b();
        this.f = (String) ym0.b;
        ym0.b();
        this.e = yr.w(ym0.e, 1);
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
    }
}
