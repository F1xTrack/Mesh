package p000;

import kotlin.KotlinVersion;

/* renamed from: Kq */
/* loaded from: classes.dex */
public final class C0683Kq implements InterfaceC9286en1 {

    /* renamed from: a */
    public final /* synthetic */ int f6324a;

    /* renamed from: b */
    public byte[] f6325b;

    /* renamed from: c */
    public int f6326c;

    /* renamed from: d */
    public int f6327d;

    /* renamed from: e */
    public int f6328e;

    public C0683Kq() {
        this.f6324a = 1;
        this.f6325b = AbstractC7485Dh1.f2171f;
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: a */
    public int mo4741a() {
        return ((mo4744d() << 8) & 65280) | (mo4744d() & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: b */
    public void m4742b() {
        int i;
        int i2;
        switch (this.f6324a) {
            case 1:
                int i3 = this.f6326c;
                YN1.m9281f(i3 >= 0 && (i3 < (i = this.f6328e) || (i3 == i && this.f6327d == 0)));
                break;
            default:
                int i4 = this.f6327d;
                YN1.m9281f(i4 >= 0 && (i4 < (i2 = this.f6326c) || (i4 == i2 && this.f6328e == 0)));
                break;
        }
    }

    /* renamed from: c */
    public int m4743c() {
        return ((this.f6328e - this.f6326c) * 8) - this.f6327d;
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: d */
    public int mo4744d() {
        int i = this.f6328e;
        if (i >= this.f6326c + this.f6327d) {
            return -1;
        }
        this.f6328e = i + 1;
        return this.f6325b[i];
    }

    /* renamed from: e */
    public void m4745e() {
        if (this.f6327d == 0) {
            return;
        }
        this.f6327d = 0;
        this.f6326c++;
        m4742b();
    }

    /* renamed from: f */
    public boolean m4746f(int i) {
        int i2 = this.f6327d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f6328e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f6326c) {
                break;
            }
            if (m4761u(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f6326c;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: g */
    public long mo4747g() {
        int iMin = (int) Math.min((this.f6326c + this.f6327d) - this.f6328e, 4L);
        this.f6328e += iMin;
        return iMin;
    }

    /* renamed from: h */
    public boolean m4748h() {
        int i = this.f6327d;
        int i2 = this.f6328e;
        int i3 = 0;
        while (this.f6327d < this.f6326c && !m4751k()) {
            i3++;
        }
        boolean z = this.f6327d == this.f6326c;
        this.f6327d = i;
        this.f6328e = i2;
        return !z && m4746f((i3 * 2) + 1);
    }

    /* renamed from: i */
    public int m4749i() {
        YN1.m9281f(this.f6327d == 0);
        return this.f6326c;
    }

    /* renamed from: j */
    public int m4750j() {
        return (this.f6326c * 8) + this.f6327d;
    }

    /* renamed from: k */
    public boolean m4751k() {
        switch (this.f6324a) {
            case 1:
                boolean z = (this.f6325b[this.f6326c] & (128 >> this.f6327d)) != 0;
                m4762v();
                return z;
            case 2:
                boolean z2 = (this.f6325b[this.f6327d] & (128 >> this.f6328e)) != 0;
                m4762v();
                return z2;
            default:
                boolean z3 = (((this.f6325b[this.f6327d] & 255) >> this.f6328e) & 1) == 1;
                m4763w(1);
                return z3;
        }
    }

    /* renamed from: l */
    public int m4752l(int i) {
        switch (this.f6324a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.f6327d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.f6327d;
                    if (i3 <= 8) {
                        byte[] bArr = this.f6325b;
                        int i4 = this.f6326c;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((bArr[i4] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.f6327d = 0;
                            this.f6326c = i4 + 1;
                        }
                        m4742b();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.f6327d = i6;
                    byte[] bArr2 = this.f6325b;
                    int i7 = this.f6326c;
                    this.f6326c = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
            case 2:
                this.f6328e += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.f6328e;
                    if (i9 <= 8) {
                        byte[] bArr3 = this.f6325b;
                        int i10 = this.f6327d;
                        int i11 = ((-1) >>> (32 - i)) & (i8 | ((bArr3[i10] & 255) >> (8 - i9)));
                        if (i9 == 8) {
                            this.f6328e = 0;
                            this.f6327d = i10 + (m4761u(i10 + 1) ? 2 : 1);
                        }
                        m4742b();
                        return i11;
                    }
                    int i12 = i9 - 8;
                    this.f6328e = i12;
                    byte[] bArr4 = this.f6325b;
                    int i13 = this.f6327d;
                    i8 |= (bArr4[i13] & 255) << i12;
                    if (!m4761u(i13 + 1)) {
                        i = 1;
                    }
                    this.f6327d = i13 + i;
                }
            default:
                int i14 = this.f6327d;
                int iMin = Math.min(i, 8 - this.f6328e);
                int i15 = i14 + 1;
                byte[] bArr5 = this.f6325b;
                int i16 = ((bArr5[i14] & 255) >> this.f6328e) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - iMin));
                while (iMin < i) {
                    i16 |= (bArr5[i15] & 255) << iMin;
                    iMin += 8;
                    i15++;
                }
                int i17 = i16 & ((-1) >>> (32 - i));
                m4763w(i);
                return i17;
        }
    }

    /* renamed from: m */
    public void m4753m(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f6325b;
            int i4 = this.f6326c;
            int i5 = i4 + 1;
            this.f6326c = i5;
            byte b = bArr2[i4];
            int i6 = this.f6327d;
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
        int i8 = this.f6327d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f6325b;
            int i9 = this.f6326c;
            this.f6326c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f6327d = i8 - 8;
        }
        int i10 = this.f6327d + i7;
        this.f6327d = i10;
        byte[] bArr4 = this.f6325b;
        int i11 = this.f6326c;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f6327d = 0;
            this.f6326c = i11 + 1;
        }
        m4742b();
    }

    /* renamed from: n */
    public long m4754n(int i) {
        if (i <= 32) {
            int iM4752l = m4752l(i);
            int i2 = AbstractC7485Dh1.f2166a;
            return 4294967295L & iM4752l;
        }
        int iM4752l2 = m4752l(i - 32);
        int iM4752l3 = m4752l(32);
        int i3 = AbstractC7485Dh1.f2166a;
        return (4294967295L & iM4752l3) | ((iM4752l2 & 4294967295L) << 32);
    }

    /* renamed from: o */
    public void m4755o(int i, byte[] bArr) {
        YN1.m9281f(this.f6327d == 0);
        System.arraycopy(this.f6325b, this.f6326c, bArr, 0, i);
        this.f6326c += i;
        m4742b();
    }

    /* renamed from: p */
    public int m4756p() {
        int i = 0;
        while (!m4751k()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m4752l(i) : 0);
    }

    /* renamed from: q */
    public int m4757q() {
        int iM4756p = m4756p();
        return ((iM4756p + 1) / 2) * (iM4756p % 2 == 0 ? -1 : 1);
    }

    /* renamed from: r */
    public void m4758r(int i, byte[] bArr) {
        this.f6325b = bArr;
        this.f6326c = 0;
        this.f6327d = 0;
        this.f6328e = i;
    }

    /* renamed from: s */
    public void m4759s(C9591hA0 c9591hA0) {
        m4758r(c9591hA0.f28295c, c9591hA0.f28293a);
        m4760t(c9591hA0.f28294b * 8);
    }

    /* renamed from: t */
    public void m4760t(int i) {
        int i2 = i / 8;
        this.f6326c = i2;
        this.f6327d = i - (i2 * 8);
        m4742b();
    }

    /* renamed from: u */
    public boolean m4761u(int i) {
        if (2 <= i && i < this.f6326c) {
            byte[] bArr = this.f6325b;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public void m4762v() {
        switch (this.f6324a) {
            case 1:
                int i = this.f6327d + 1;
                this.f6327d = i;
                if (i == 8) {
                    this.f6327d = 0;
                    this.f6326c++;
                }
                m4742b();
                break;
            default:
                int i2 = this.f6328e + 1;
                this.f6328e = i2;
                if (i2 == 8) {
                    this.f6328e = 0;
                    int i3 = this.f6327d;
                    this.f6327d = i3 + (m4761u(i3 + 1) ? 2 : 1);
                }
                m4742b();
                break;
        }
    }

    /* renamed from: w */
    public void m4763w(int i) {
        int i2;
        switch (this.f6324a) {
            case 1:
                int i3 = i / 8;
                int i4 = this.f6326c + i3;
                this.f6326c = i4;
                int i5 = (i - (i3 * 8)) + this.f6327d;
                this.f6327d = i5;
                if (i5 > 7) {
                    this.f6326c = i4 + 1;
                    this.f6327d = i5 - 8;
                }
                m4742b();
                break;
            case 2:
                int i6 = this.f6327d;
                int i7 = i / 8;
                int i8 = i6 + i7;
                this.f6327d = i8;
                int i9 = (i - (i7 * 8)) + this.f6328e;
                this.f6328e = i9;
                if (i9 > 7) {
                    this.f6327d = i8 + 1;
                    this.f6328e = i9 - 8;
                }
                while (true) {
                    i6++;
                    if (i6 > this.f6327d) {
                        m4742b();
                        break;
                    } else if (m4761u(i6)) {
                        this.f6327d++;
                        i6 += 2;
                    }
                }
            default:
                int i10 = i / 8;
                int i11 = this.f6327d + i10;
                this.f6327d = i11;
                int i12 = (i - (i10 * 8)) + this.f6328e;
                this.f6328e = i12;
                boolean z = true;
                if (i12 > 7) {
                    this.f6327d = i11 + 1;
                    this.f6328e = i12 - 8;
                }
                int i13 = this.f6327d;
                if (i13 < 0 || (i13 >= (i2 = this.f6326c) && (i13 != i2 || this.f6328e != 0))) {
                    z = false;
                }
                YN1.m9281f(z);
                break;
        }
    }

    /* renamed from: x */
    public void m4764x(int i) {
        YN1.m9281f(this.f6327d == 0);
        this.f6326c += i;
        m4742b();
    }

    public C0683Kq(int i, byte[] bArr, int i2, int i3) {
        this.f6324a = i3;
        switch (i3) {
            case 4:
                this.f6325b = bArr;
                this.f6326c = i;
                this.f6327d = i2;
                this.f6328e = i;
                break;
            default:
                this.f6325b = bArr;
                this.f6327d = i;
                this.f6326c = i2;
                this.f6328e = 0;
                m4742b();
                break;
        }
    }

    public C0683Kq(byte[] bArr) {
        this.f6324a = 3;
        this.f6325b = bArr;
        this.f6326c = bArr.length;
    }

    public C0683Kq(byte[] bArr, int i) {
        this.f6324a = 1;
        this.f6325b = bArr;
        this.f6328e = i;
    }

    public C0683Kq(int i, int i2) {
        this.f6324a = 0;
        this.f6326c = i;
        this.f6327d = i2;
        this.f6325b = new byte[(i2 * 2) - 1];
        this.f6328e = 0;
    }
}
