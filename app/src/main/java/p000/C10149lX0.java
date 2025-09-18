package p000;

/* renamed from: lX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10149lX0 implements InterfaceC10034kd1 {

    /* renamed from: a */
    public final InterfaceC10021kX0 f37098a;

    /* renamed from: b */
    public final C9591hA0 f37099b = new C9591hA0(32);

    /* renamed from: c */
    public int f37100c;

    /* renamed from: d */
    public int f37101d;

    /* renamed from: e */
    public boolean f37102e;

    /* renamed from: f */
    public boolean f37103f;

    public C10149lX0(InterfaceC10021kX0 interfaceC10021kX0) {
        this.f37098a = interfaceC10021kX0;
    }

    @Override // p000.InterfaceC10034kd1
    /* renamed from: a */
    public final void mo8700a(int i, C9591hA0 c9591hA0) {
        boolean z = (i & 1) != 0;
        int iM18763u = z ? c9591hA0.f28294b + c9591hA0.m18763u() : -1;
        if (this.f37103f) {
            if (!z) {
                return;
            }
            this.f37103f = false;
            c9591hA0.m18741G(iM18763u);
            this.f37101d = 0;
        }
        while (c9591hA0.m18743a() > 0) {
            int i2 = this.f37101d;
            C9591hA0 c9591hA02 = this.f37099b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM18763u2 = c9591hA0.m18763u();
                    c9591hA0.m18741G(c9591hA0.f28294b - 1);
                    if (iM18763u2 == 255) {
                        this.f37103f = true;
                        return;
                    }
                }
                int iMin = Math.min(c9591hA0.m18743a(), 3 - this.f37101d);
                c9591hA0.m18747e(c9591hA02.f28293a, this.f37101d, iMin);
                int i3 = this.f37101d + iMin;
                this.f37101d = i3;
                if (i3 == 3) {
                    c9591hA02.m18741G(0);
                    c9591hA02.m18740F(3);
                    c9591hA02.m18742H(1);
                    int iM18763u3 = c9591hA02.m18763u();
                    int iM18763u4 = c9591hA02.m18763u();
                    this.f37102e = (iM18763u3 & 128) != 0;
                    int i4 = (((iM18763u3 & 15) << 8) | iM18763u4) + 3;
                    this.f37100c = i4;
                    byte[] bArr = c9591hA02.f28293a;
                    if (bArr.length < i4) {
                        c9591hA02.m18744b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c9591hA0.m18743a(), this.f37100c - this.f37101d);
                c9591hA0.m18747e(c9591hA02.f28293a, this.f37101d, iMin2);
                int i5 = this.f37101d + iMin2;
                this.f37101d = i5;
                int i6 = this.f37100c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f37102e) {
                        c9591hA02.m18740F(i6);
                    } else {
                        if (AbstractC7485Dh1.m1828m(0, c9591hA02.f28293a, i6, -1) != 0) {
                            this.f37103f = true;
                            return;
                        }
                        c9591hA02.m18740F(this.f37100c - 4);
                    }
                    c9591hA02.m18741G(0);
                    this.f37098a.mo5439b(c9591hA02);
                    this.f37101d = 0;
                }
            }
        }
    }

    @Override // p000.InterfaceC10034kd1
    /* renamed from: c */
    public final void mo8702c() {
        this.f37103f = true;
    }

    @Override // p000.InterfaceC10034kd1
    /* renamed from: e */
    public final void mo8703e(C7783Ja1 c7783Ja1, InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        this.f37098a.mo5441e(c7783Ja1, interfaceC1538YR, ym0);
        this.f37103f = true;
    }
}
