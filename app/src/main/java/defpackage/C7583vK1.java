package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: vK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7583vK1 extends JE1 {
    public static final int[] h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int c;
    public final JE1 d;
    public final JE1 e;
    public final int f;
    public final int g;

    public C7583vK1(JE1 je1, JE1 je12) {
        this.d = je1;
        this.e = je12;
        int i = je1.i();
        this.f = i;
        this.c = je12.i() + i;
        this.g = Math.max(je1.q(), je12.q()) + 1;
    }

    public static int G(int i) {
        int[] iArr = h;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // defpackage.JE1
    /* renamed from: B */
    public final AbstractC5740lg1 iterator() {
        return new EJ1(this);
    }

    @Override // defpackage.JE1
    public final byte b(int i) {
        JE1.F(i, this.c);
        return d(i);
    }

    @Override // defpackage.JE1
    public final byte d(int i) {
        int i2 = this.f;
        return i < i2 ? this.d.d(i) : this.e.d(i - i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JE1)) {
            return false;
        }
        JE1 je1 = (JE1) obj;
        int i = je1.i();
        int i2 = this.c;
        if (i2 != i) {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        int i3 = this.a;
        int i4 = je1.a;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        C7799wT0 c7799wT0 = new C7799wT0(this);
        GE1 ge1B = c7799wT0.b();
        C7799wT0 c7799wT02 = new C7799wT0(je1);
        GE1 ge1B2 = c7799wT02.b();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = ge1B.i() - i5;
            int i9 = ge1B2.i() - i6;
            int iMin = Math.min(i8, i9);
            if (!(i5 == 0 ? ge1B.H(ge1B2, i6, iMin) : ge1B2.H(ge1B, i5, iMin))) {
                return false;
            }
            i7 += iMin;
            if (i7 >= i2) {
                if (i7 == i2) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == i8) {
                ge1B = c7799wT0.b();
                i5 = 0;
            } else {
                i5 += iMin;
            }
            if (iMin == i9) {
                ge1B2 = c7799wT02.b();
                i6 = 0;
            } else {
                i6 += iMin;
            }
        }
    }

    @Override // defpackage.JE1
    public final int i() {
        return this.c;
    }

    @Override // defpackage.JE1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new EJ1(this);
    }

    @Override // defpackage.JE1
    public final void k(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        JE1 je1 = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            je1.k(i, bArr, i2, i3);
            return;
        }
        JE1 je12 = this.e;
        if (i >= i5) {
            je12.k(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        je1.k(i, bArr, i2, i6);
        je12.k(0, bArr, i2 + i6, i3 - i6);
    }

    @Override // defpackage.JE1
    public final int q() {
        return this.g;
    }

    @Override // defpackage.JE1
    public final boolean r() {
        return this.c >= G(this.g);
    }

    @Override // defpackage.JE1
    public final int s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        JE1 je1 = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            return je1.s(i, i2, i3);
        }
        JE1 je12 = this.e;
        if (i2 >= i5) {
            return je12.s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return je12.s(je1.s(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.JE1
    public final int t(int i, int i2, int i3) {
        int i4 = i2 + i3;
        JE1 je1 = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            return je1.t(i, i2, i3);
        }
        JE1 je12 = this.e;
        if (i2 >= i5) {
            return je12.t(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return je12.t(je1.t(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.JE1
    public final JE1 u(int i, int i2) {
        int i3 = this.c;
        int iA = JE1.A(i, i2, i3);
        if (iA == 0) {
            return JE1.b;
        }
        if (iA == i3) {
            return this;
        }
        JE1 je1 = this.d;
        int i4 = this.f;
        if (i2 <= i4) {
            return je1.u(i, i2);
        }
        JE1 je12 = this.e;
        if (i < i4) {
            return new C7583vK1(je1.u(i, je1.i()), je12.u(0, i2 - i4));
        }
        return je12.u(i - i4, i2 - i4);
    }

    @Override // defpackage.JE1
    public final String v(Charset charset) {
        byte[] bArr;
        int i = i();
        if (i == 0) {
            bArr = AbstractC7574vH1.b;
        } else {
            byte[] bArr2 = new byte[i];
            k(0, bArr2, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // defpackage.JE1
    public final void y(WE1 we1) {
        this.d.y(we1);
        this.e.y(we1);
    }

    @Override // defpackage.JE1
    public final boolean z() {
        int iT = this.d.t(0, 0, this.f);
        JE1 je1 = this.e;
        return je1.t(iT, 0, je1.i()) == 0;
    }
}
