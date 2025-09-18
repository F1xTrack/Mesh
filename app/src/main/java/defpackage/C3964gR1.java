package defpackage;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: gR1 */
/* loaded from: classes.dex */
public final class C3964gR1 extends F22 {
    public static final Logger f = Logger.getLogger(C3964gR1.class.getName());
    public static final boolean g = VV1.e;
    public C6446pN0 b;
    public final byte[] c;
    public final int d;
    public int e;

    public C3964gR1(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC8235ym.f(bArr.length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    public static int A(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int a(int i) {
        return A(i << 3) + 4;
    }

    public static int b(int i, int i2) {
        return v(i2) + A(i << 3);
    }

    public static int c(int i, String str) {
        return f(str) + A(i << 3);
    }

    public static int d(int i, IP1 ip1, InterfaceC3404dV1 interfaceC3404dV1) {
        return ip1.a(interfaceC3404dV1) + (A(i << 3) << 1);
    }

    public static int e(int i, JQ1 jq1) {
        int iA = A(i << 3);
        int iK = jq1.k();
        return A(iK) + iK + iA;
    }

    public static int f(String str) {
        int length;
        try {
            length = AbstractC4170hW1.a(str);
        } catch (C5710lW1 unused) {
            length = str.getBytes(BS1.a).length;
        }
        return A(length) + length;
    }

    public static int h(int i) {
        return A(i << 3) + 1;
    }

    public static int i(int i) {
        return A(i << 3) + 8;
    }

    public static int j(int i) {
        return A(i << 3) + 8;
    }

    public static int l(int i) {
        return A(i << 3) + 4;
    }

    public static int m(int i, long j) {
        return v(j) + A(i << 3);
    }

    public static int o(int i) {
        return A(i << 3) + 8;
    }

    public static int p(int i, int i2) {
        return v(i2) + A(i << 3);
    }

    public static int r(int i) {
        return A(i << 3) + 4;
    }

    public static int s(int i, long j) {
        return v((j >> 63) ^ (j << 1)) + A(i << 3);
    }

    public static int t(int i, int i2) {
        return A((i2 >> 31) ^ (i2 << 1)) + A(i << 3);
    }

    public static int u(int i, long j) {
        return v(j) + A(i << 3);
    }

    public static int v(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int w(int i) {
        return A(i << 3);
    }

    public static int x(int i, int i2) {
        return A(i2) + A(i << 3);
    }

    public final void B(int i, int i2) {
        H(i, 5);
        C(i2);
    }

    public final void C(int i) throws C6353ou {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = i >> 24;
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C6353ou(i2, this.d, 4, e);
        }
    }

    public final void D(int i, int i2) {
        H(i, 0);
        G(i2);
    }

    public final void E(int i, long j) {
        H(i, 0);
        F(j);
    }

    public final void F(long j) throws C6353ou {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        if (!g || k() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6353ou(i, this.d, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                VV1.c.d(bArr, VV1.f + i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            VV1.c.d(bArr, VV1.f + i2, (byte) j);
        }
        this.e = i;
    }

    public final void G(int i) throws C6353ou {
        if (i >= 0) {
            I(i);
        } else {
            F(i);
        }
    }

    public final void H(int i, int i2) {
        I((i << 3) | i2);
    }

    public final void I(int i) {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6353ou(i2, this.d, 1, e);
                }
            }
            throw new C6353ou(i2, this.d, 1, e);
        }
    }

    public final void J(int i, int i2) {
        H(i, 0);
        I(i2);
    }

    public final void g(byte b) {
        int i;
        int i2 = this.e;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.c[i2] = b;
            this.e = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new C6353ou(i2, this.d, 1, e);
        }
    }

    public final int k() {
        return this.d - this.e;
    }

    public final void n(JQ1 jq1) {
        I(jq1.k());
        q(jq1.b, jq1.q(), jq1.k());
    }

    public final void q(byte[] bArr, int i, int i2) throws C6353ou {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C6353ou(this.e, this.d, i2, e);
        }
    }

    public final void y(int i, long j) {
        H(i, 1);
        z(j);
    }

    public final void z(long j) throws C6353ou {
        int i = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new C6353ou(i, this.d, 8, e);
        }
    }
}
