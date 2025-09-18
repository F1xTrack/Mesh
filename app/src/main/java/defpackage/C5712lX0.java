package defpackage;

/* renamed from: lX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5712lX0 implements InterfaceC5540kd1 {
    public final InterfaceC5521kX0 a;
    public final C4103hA0 b = new C4103hA0(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public C5712lX0(InterfaceC5521kX0 interfaceC5521kX0) {
        this.a = interfaceC5521kX0;
    }

    @Override // defpackage.InterfaceC5540kd1
    public final void a(int i, C4103hA0 c4103hA0) {
        boolean z = (i & 1) != 0;
        int iU = z ? c4103hA0.b + c4103hA0.u() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            c4103hA0.G(iU);
            this.d = 0;
        }
        while (c4103hA0.a() > 0) {
            int i2 = this.d;
            C4103hA0 c4103hA02 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iU2 = c4103hA0.u();
                    c4103hA0.G(c4103hA0.b - 1);
                    if (iU2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(c4103hA0.a(), 3 - this.d);
                c4103hA0.e(c4103hA02.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    c4103hA02.G(0);
                    c4103hA02.F(3);
                    c4103hA02.H(1);
                    int iU3 = c4103hA02.u();
                    int iU4 = c4103hA02.u();
                    this.e = (iU3 & 128) != 0;
                    int i4 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.c = i4;
                    byte[] bArr = c4103hA02.a;
                    if (bArr.length < i4) {
                        c4103hA02.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c4103hA0.a(), this.c - this.d);
                c4103hA0.e(c4103hA02.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        c4103hA02.F(i6);
                    } else {
                        if (AbstractC0277Dh1.m(0, c4103hA02.a, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        c4103hA02.F(this.c - 4);
                    }
                    c4103hA02.G(0);
                    this.a.b(c4103hA02);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC5540kd1
    public final void c() {
        this.f = true;
    }

    @Override // defpackage.InterfaceC5540kd1
    public final void e(C0724Ja1 c0724Ja1, YR yr, YM0 ym0) {
        this.a.e(c0724Ja1, yr, ym0);
        this.f = true;
    }
}
