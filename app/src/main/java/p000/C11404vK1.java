package p000;

import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: vK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11404vK1 extends JE1 {

    /* renamed from: h */
    public static final int[] f44333h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: c */
    public final int f44334c;

    /* renamed from: d */
    public final JE1 f44335d;

    /* renamed from: e */
    public final JE1 f44336e;

    /* renamed from: f */
    public final int f44337f;

    /* renamed from: g */
    public final int f44338g;

    public C11404vK1(JE1 je1, JE1 je12) {
        this.f44335d = je1;
        this.f44336e = je12;
        int iMo3006i = je1.mo3006i();
        this.f44337f = iMo3006i;
        this.f44334c = je12.mo3006i() + iMo3006i;
        this.f44338g = Math.max(je1.mo3008q(), je12.mo3008q()) + 1;
    }

    /* renamed from: G */
    public static int m25400G(int i) {
        int[] iArr = f44333h;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // p000.JE1
    /* renamed from: B */
    public final AbstractC10168lg1 iterator() {
        return new EJ1(this);
    }

    @Override // p000.JE1
    /* renamed from: b */
    public final byte mo3004b(int i) {
        JE1.m4260F(i, this.f44334c);
        return mo3005d(i);
    }

    @Override // p000.JE1
    /* renamed from: d */
    public final byte mo3005d(int i) {
        int i2 = this.f44337f;
        return i < i2 ? this.f44335d.mo3005d(i) : this.f44336e.mo3005d(i - i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JE1)) {
            return false;
        }
        JE1 je1 = (JE1) obj;
        int iMo3006i = je1.mo3006i();
        int i = this.f44334c;
        if (i != iMo3006i) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.f5403a;
        int i3 = je1.f5403a;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        C11548wT0 c11548wT0 = new C11548wT0(this);
        GE1 ge1M25633b = c11548wT0.m25633b();
        C11548wT0 c11548wT02 = new C11548wT0(je1);
        GE1 ge1M25633b2 = c11548wT02.m25633b();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iMo3006i2 = ge1M25633b.mo3006i() - i4;
            int iMo3006i3 = ge1M25633b2.mo3006i() - i5;
            int iMin = Math.min(iMo3006i2, iMo3006i3);
            if (!(i4 == 0 ? ge1M25633b.m3003H(ge1M25633b2, i5, iMin) : ge1M25633b2.m3003H(ge1M25633b, i4, iMin))) {
                return false;
            }
            i6 += iMin;
            if (i6 >= i) {
                if (i6 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iMo3006i2) {
                ge1M25633b = c11548wT0.m25633b();
                i4 = 0;
            } else {
                i4 += iMin;
            }
            if (iMin == iMo3006i3) {
                ge1M25633b2 = c11548wT02.m25633b();
                i5 = 0;
            } else {
                i5 += iMin;
            }
        }
    }

    @Override // p000.JE1
    /* renamed from: i */
    public final int mo3006i() {
        return this.f44334c;
    }

    @Override // p000.JE1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new EJ1(this);
    }

    @Override // p000.JE1
    /* renamed from: k */
    public final void mo3007k(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        JE1 je1 = this.f44335d;
        int i5 = this.f44337f;
        if (i4 <= i5) {
            je1.mo3007k(i, bArr, i2, i3);
            return;
        }
        JE1 je12 = this.f44336e;
        if (i >= i5) {
            je12.mo3007k(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        je1.mo3007k(i, bArr, i2, i6);
        je12.mo3007k(0, bArr, i2 + i6, i3 - i6);
    }

    @Override // p000.JE1
    /* renamed from: q */
    public final int mo3008q() {
        return this.f44338g;
    }

    @Override // p000.JE1
    /* renamed from: r */
    public final boolean mo3009r() {
        return this.f44334c >= m25400G(this.f44338g);
    }

    @Override // p000.JE1
    /* renamed from: s */
    public final int mo3010s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        JE1 je1 = this.f44335d;
        int i5 = this.f44337f;
        if (i4 <= i5) {
            return je1.mo3010s(i, i2, i3);
        }
        JE1 je12 = this.f44336e;
        if (i2 >= i5) {
            return je12.mo3010s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return je12.mo3010s(je1.mo3010s(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.JE1
    /* renamed from: t */
    public final int mo3011t(int i, int i2, int i3) {
        int i4 = i2 + i3;
        JE1 je1 = this.f44335d;
        int i5 = this.f44337f;
        if (i4 <= i5) {
            return je1.mo3011t(i, i2, i3);
        }
        JE1 je12 = this.f44336e;
        if (i2 >= i5) {
            return je12.mo3011t(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return je12.mo3011t(je1.mo3011t(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.JE1
    /* renamed from: u */
    public final JE1 mo3012u(int i, int i2) {
        int i3 = this.f44334c;
        int iM4257A = JE1.m4257A(i, i2, i3);
        if (iM4257A == 0) {
            return JE1.f5402b;
        }
        if (iM4257A == i3) {
            return this;
        }
        JE1 je1 = this.f44335d;
        int i4 = this.f44337f;
        if (i2 <= i4) {
            return je1.mo3012u(i, i2);
        }
        JE1 je12 = this.f44336e;
        if (i < i4) {
            return new C11404vK1(je1.mo3012u(i, je1.mo3006i()), je12.mo3012u(0, i2 - i4));
        }
        return je12.mo3012u(i - i4, i2 - i4);
    }

    @Override // p000.JE1
    /* renamed from: v */
    public final String mo3013v(Charset charset) {
        byte[] bArr;
        int iMo3006i = mo3006i();
        if (iMo3006i == 0) {
            bArr = AbstractC11398vH1.f44321b;
        } else {
            byte[] bArr2 = new byte[iMo3006i];
            mo3007k(0, bArr2, 0, iMo3006i);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // p000.JE1
    /* renamed from: y */
    public final void mo3014y(WE1 we1) {
        this.f44335d.mo3014y(we1);
        this.f44336e.mo3014y(we1);
    }

    @Override // p000.JE1
    /* renamed from: z */
    public final boolean mo3015z() {
        int iMo3011t = this.f44335d.mo3011t(0, 0, this.f44337f);
        JE1 je1 = this.f44336e;
        return je1.mo3011t(iMo3011t, 0, je1.mo3006i()) == 0;
    }
}
