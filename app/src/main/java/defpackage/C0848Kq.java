package defpackage;

import kotlin.KotlinVersion;

/* renamed from: Kq */
/* loaded from: classes.dex */
public final class C0848Kq implements InterfaceC3648en1 {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public C0848Kq() {
        this.a = 1;
        this.b = AbstractC0277Dh1.f;
    }

    @Override // defpackage.InterfaceC3648en1
    public int a() {
        return ((d() << 8) & 65280) | (d() & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void b() {
        int i;
        int i2;
        switch (this.a) {
            case 1:
                int i3 = this.c;
                YN1.f(i3 >= 0 && (i3 < (i = this.e) || (i3 == i && this.d == 0)));
                break;
            default:
                int i4 = this.d;
                YN1.f(i4 >= 0 && (i4 < (i2 = this.c) || (i4 == i2 && this.e == 0)));
                break;
        }
    }

    public int c() {
        return ((this.e - this.c) * 8) - this.d;
    }

    @Override // defpackage.InterfaceC3648en1
    public int d() {
        int i = this.e;
        if (i >= this.c + this.d) {
            return -1;
        }
        this.e = i + 1;
        return this.b[i];
    }

    public void e() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        b();
    }

    public boolean f(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.c) {
                break;
            }
            if (u(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.c;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    @Override // defpackage.InterfaceC3648en1
    public long g() {
        int iMin = (int) Math.min((this.c + this.d) - this.e, 4L);
        this.e += iMin;
        return iMin;
    }

    public boolean h() {
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.c && !k()) {
            i3++;
        }
        boolean z = this.d == this.c;
        this.d = i;
        this.e = i2;
        return !z && f((i3 * 2) + 1);
    }

    public int i() {
        YN1.f(this.d == 0);
        return this.c;
    }

    public int j() {
        return (this.c * 8) + this.d;
    }

    public boolean k() {
        switch (this.a) {
            case 1:
                boolean z = (this.b[this.c] & (128 >> this.d)) != 0;
                v();
                return z;
            case 2:
                boolean z2 = (this.b[this.d] & (128 >> this.e)) != 0;
                v();
                return z2;
            default:
                boolean z3 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                w(1);
                return z3;
        }
    }

    public int l(int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.d;
                    if (i3 <= 8) {
                        byte[] bArr = this.b;
                        int i4 = this.c;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((bArr[i4] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.d = 0;
                            this.c = i4 + 1;
                        }
                        b();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.d = i6;
                    byte[] bArr2 = this.b;
                    int i7 = this.c;
                    this.c = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
            case 2:
                this.e += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.e;
                    if (i9 <= 8) {
                        byte[] bArr3 = this.b;
                        int i10 = this.d;
                        int i11 = ((-1) >>> (32 - i)) & (i8 | ((bArr3[i10] & 255) >> (8 - i9)));
                        if (i9 == 8) {
                            this.e = 0;
                            this.d = i10 + (u(i10 + 1) ? 2 : 1);
                        }
                        b();
                        return i11;
                    }
                    int i12 = i9 - 8;
                    this.e = i12;
                    byte[] bArr4 = this.b;
                    int i13 = this.d;
                    i8 |= (bArr4[i13] & 255) << i12;
                    if (!u(i13 + 1)) {
                        i = 1;
                    }
                    this.d = i13 + i;
                }
            default:
                int i14 = this.d;
                int iMin = Math.min(i, 8 - this.e);
                int i15 = i14 + 1;
                byte[] bArr5 = this.b;
                int i16 = ((bArr5[i14] & 255) >> this.e) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - iMin));
                while (iMin < i) {
                    i16 |= (bArr5[i15] & 255) << iMin;
                    iMin += 8;
                    i15++;
                }
                int i17 = i16 & ((-1) >>> (32 - i));
                w(i);
                return i17;
        }
    }

    public void m(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.b;
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            byte b = bArr2[i4];
            int i6 = this.d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (KotlinVersion.MAX_COMPONENT_VALUE >> i7));
        bArr[i2] = b3;
        int i8 = this.d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.b;
            int i9 = this.c;
            this.c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.d = i8 - 8;
        }
        int i10 = this.d + i7;
        this.d = i10;
        byte[] bArr4 = this.b;
        int i11 = this.c;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.d = 0;
            this.c = i11 + 1;
        }
        b();
    }

    public long n(int i) {
        if (i <= 32) {
            int iL = l(i);
            int i2 = AbstractC0277Dh1.a;
            return 4294967295L & iL;
        }
        int iL2 = l(i - 32);
        int iL3 = l(32);
        int i3 = AbstractC0277Dh1.a;
        return (4294967295L & iL3) | ((iL2 & 4294967295L) << 32);
    }

    public void o(int i, byte[] bArr) {
        YN1.f(this.d == 0);
        System.arraycopy(this.b, this.c, bArr, 0, i);
        this.c += i;
        b();
    }

    public int p() {
        int i = 0;
        while (!k()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? l(i) : 0);
    }

    public int q() {
        int iP = p();
        return ((iP + 1) / 2) * (iP % 2 == 0 ? -1 : 1);
    }

    public void r(int i, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i;
    }

    public void s(C4103hA0 c4103hA0) {
        r(c4103hA0.c, c4103hA0.a);
        t(c4103hA0.b * 8);
    }

    public void t(int i) {
        int i2 = i / 8;
        this.c = i2;
        this.d = i - (i2 * 8);
        b();
    }

    public boolean u(int i) {
        if (2 <= i && i < this.c) {
            byte[] bArr = this.b;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void v() {
        switch (this.a) {
            case 1:
                int i = this.d + 1;
                this.d = i;
                if (i == 8) {
                    this.d = 0;
                    this.c++;
                }
                b();
                break;
            default:
                int i2 = this.e + 1;
                this.e = i2;
                if (i2 == 8) {
                    this.e = 0;
                    int i3 = this.d;
                    this.d = i3 + (u(i3 + 1) ? 2 : 1);
                }
                b();
                break;
        }
    }

    public void w(int i) {
        int i2;
        switch (this.a) {
            case 1:
                int i3 = i / 8;
                int i4 = this.c + i3;
                this.c = i4;
                int i5 = (i - (i3 * 8)) + this.d;
                this.d = i5;
                if (i5 > 7) {
                    this.c = i4 + 1;
                    this.d = i5 - 8;
                }
                b();
                break;
            case 2:
                int i6 = this.d;
                int i7 = i / 8;
                int i8 = i6 + i7;
                this.d = i8;
                int i9 = (i - (i7 * 8)) + this.e;
                this.e = i9;
                if (i9 > 7) {
                    this.d = i8 + 1;
                    this.e = i9 - 8;
                }
                while (true) {
                    i6++;
                    if (i6 > this.d) {
                        b();
                        break;
                    } else if (u(i6)) {
                        this.d++;
                        i6 += 2;
                    }
                }
            default:
                int i10 = i / 8;
                int i11 = this.d + i10;
                this.d = i11;
                int i12 = (i - (i10 * 8)) + this.e;
                this.e = i12;
                boolean z = true;
                if (i12 > 7) {
                    this.d = i11 + 1;
                    this.e = i12 - 8;
                }
                int i13 = this.d;
                if (i13 < 0 || (i13 >= (i2 = this.c) && (i13 != i2 || this.e != 0))) {
                    z = false;
                }
                YN1.f(z);
                break;
        }
    }

    public void x(int i) {
        YN1.f(this.d == 0);
        this.c += i;
        b();
    }

    public C0848Kq(int i, byte[] bArr, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 4:
                this.b = bArr;
                this.c = i;
                this.d = i2;
                this.e = i;
                break;
            default:
                this.b = bArr;
                this.d = i;
                this.c = i2;
                this.e = 0;
                b();
                break;
        }
    }

    public C0848Kq(byte[] bArr) {
        this.a = 3;
        this.b = bArr;
        this.c = bArr.length;
    }

    public C0848Kq(byte[] bArr, int i) {
        this.a = 1;
        this.b = bArr;
        this.e = i;
    }

    public C0848Kq(int i, int i2) {
        this.a = 0;
        this.c = i;
        this.d = i2;
        this.b = new byte[(i2 * 2) - 1];
        this.e = 0;
    }
}
