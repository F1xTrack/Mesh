package p000;

/* renamed from: gd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9522gd1 {

    /* renamed from: a */
    public final byte[] f27890a = new byte[10];

    /* renamed from: b */
    public boolean f27891b;

    /* renamed from: c */
    public int f27892c;

    /* renamed from: d */
    public long f27893d;

    /* renamed from: e */
    public int f27894e;

    /* renamed from: f */
    public int f27895f;

    /* renamed from: g */
    public int f27896g;

    /* renamed from: a */
    public final void m18588a(InterfaceC8357Ub1 interfaceC8357Ub1, C8305Tb1 c8305Tb1) {
        if (this.f27892c > 0) {
            interfaceC8357Ub1.mo960a(this.f27893d, this.f27894e, this.f27895f, this.f27896g, c8305Tb1);
            this.f27892c = 0;
        }
    }

    /* renamed from: b */
    public final void m18589b(InterfaceC8357Ub1 interfaceC8357Ub1, long j, int i, int i2, int i3, C8305Tb1 c8305Tb1) {
        YN1.m9282g(this.f27896g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f27891b) {
            int i4 = this.f27892c;
            int i5 = i4 + 1;
            this.f27892c = i5;
            if (i4 == 0) {
                this.f27893d = j;
                this.f27894e = i;
                this.f27895f = 0;
            }
            this.f27895f += i2;
            this.f27896g = i3;
            if (i5 >= 16) {
                m18588a(interfaceC8357Ub1, c8305Tb1);
            }
        }
    }

    /* renamed from: c */
    public final void m18590c(InterfaceC1475XR interfaceC1475XR) {
        if (this.f27891b) {
            return;
        }
        byte[] bArr = this.f27890a;
        int i = 0;
        interfaceC1475XR.mo3628q(bArr, 0, 10);
        interfaceC1475XR.mo3626m();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f27891b = true;
    }
}
