package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: qu */
/* loaded from: classes.dex */
public final class C6735qu extends AbstractC7978xP1 {
    public static final Logger f = Logger.getLogger(C6735qu.class.getName());
    public static final boolean g = AbstractC1131Og1.f;
    public C1304Qm0 a;
    public final byte[] b;
    public final int c;
    public int d;
    public final C5938mj e;

    public C6735qu(C5938mj c5938mj, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.b = new byte[iMax];
        this.c = iMax;
        this.e = c5938mj;
    }

    public static int A(int i, int i2) {
        return B(i2) + z(i);
    }

    public static int B(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int C(int i, long j) {
        return D(j) + z(i);
    }

    public static int D(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int h(int i) {
        return z(i) + 1;
    }

    public static int i(int i, C0440Fk c0440Fk) {
        return j(c0440Fk) + z(i);
    }

    public static int j(C0440Fk c0440Fk) {
        int size = c0440Fk.size();
        return B(size) + size;
    }

    public static int k(int i) {
        return z(i) + 8;
    }

    public static int l(int i, int i2) {
        return r(i2) + z(i);
    }

    public static int m(int i) {
        return z(i) + 4;
    }

    public static int n(int i) {
        return z(i) + 8;
    }

    public static int o(int i) {
        return z(i) + 4;
    }

    public static int p(int i, L0 l0, EV0 ev0) {
        return l0.b(ev0) + (z(i) * 2);
    }

    public static int q(int i, int i2) {
        return r(i2) + z(i);
    }

    public static int r(int i) {
        if (i >= 0) {
            return B(i);
        }
        return 10;
    }

    public static int s(int i, long j) {
        return D(j) + z(i);
    }

    public static int t(int i) {
        return z(i) + 4;
    }

    public static int u(int i) {
        return z(i) + 8;
    }

    public static int v(int i, int i2) {
        return B((i2 >> 31) ^ (i2 << 1)) + z(i);
    }

    public static int w(int i, long j) {
        return D((j >> 63) ^ (j << 1)) + z(i);
    }

    public static int x(int i, String str) {
        return y(str) + z(i);
    }

    public static int y(String str) {
        int length;
        try {
            length = AbstractC7461uh1.b(str);
        } catch (C7079sh1 unused) {
            length = str.getBytes(AbstractC8309z90.a).length;
        }
        return B(length) + length;
    }

    public static int z(int i) {
        return B(i << 3);
    }

    public final void E() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void F(int i) {
        if (this.c - this.d < i) {
            E();
        }
    }

    public final void G(byte b) {
        if (this.d == this.c) {
            E();
        }
        int i = this.d;
        this.d = i + 1;
        this.b[i] = b;
    }

    public final void H(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        E();
        if (i7 > i4) {
            this.e.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        }
    }

    public final void I(int i, boolean z) {
        F(11);
        e(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.d = i2 + 1;
        this.b[i2] = b;
    }

    public final void J(int i, C0440Fk c0440Fk) {
        T(i, 2);
        K(c0440Fk);
    }

    public final void K(C0440Fk c0440Fk) {
        V(c0440Fk.size());
        b(c0440Fk.b, c0440Fk.d(), c0440Fk.size());
    }

    public final void L(int i, int i2) {
        F(14);
        e(i, 5);
        c(i2);
    }

    public final void M(int i) {
        F(4);
        c(i);
    }

    public final void N(int i, long j) {
        F(18);
        e(i, 1);
        d(j);
    }

    public final void O(long j) {
        F(8);
        d(j);
    }

    public final void P(int i, int i2) {
        F(20);
        e(i, 0);
        if (i2 >= 0) {
            f(i2);
        } else {
            g(i2);
        }
    }

    public final void Q(int i) {
        if (i >= 0) {
            V(i);
        } else {
            X(i);
        }
    }

    public final void R(int i, String str) {
        T(i, 2);
        S(str);
    }

    public final void S(String str) {
        try {
            int length = str.length() * 3;
            int iB = B(length);
            int i = iB + length;
            int i2 = this.c;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA = AbstractC7461uh1.a.a(str, bArr, 0, length);
                V(iA);
                H(bArr, 0, iA);
                return;
            }
            if (i > i2 - this.d) {
                E();
            }
            int iB2 = B(str.length());
            int i3 = this.d;
            byte[] bArr2 = this.b;
            try {
                if (iB2 == iB) {
                    int i4 = i3 + iB2;
                    this.d = i4;
                    int iA2 = AbstractC7461uh1.a.a(str, bArr2, i4, i2 - i4);
                    this.d = i3;
                    f((iA2 - i3) - iB2);
                    this.d = iA2;
                } else {
                    int iB3 = AbstractC7461uh1.b(str);
                    f(iB3);
                    this.d = AbstractC7461uh1.a.a(str, bArr2, this.d, iB3);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C6544pu(e);
            } catch (C7079sh1 e2) {
                this.d = i3;
                throw e2;
            }
        } catch (C7079sh1 e3) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC8309z90.a);
            try {
                V(bytes.length);
                b(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C6544pu(e4);
            } catch (C6544pu e5) {
                throw e5;
            }
        }
    }

    public final void T(int i, int i2) {
        V((i << 3) | i2);
    }

    public final void U(int i, int i2) {
        F(20);
        e(i, 0);
        f(i2);
    }

    public final void V(int i) {
        F(5);
        f(i);
    }

    public final void W(int i, long j) {
        F(20);
        e(i, 0);
        g(j);
    }

    public final void X(long j) {
        F(10);
        g(j);
    }

    @Override // defpackage.AbstractC7978xP1
    public final void b(byte[] bArr, int i, int i2) {
        H(bArr, i, i2);
    }

    public final void c(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        byte b = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.b;
        bArr[i2] = b;
        int i4 = i2 + 2;
        this.d = i4;
        bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i2 + 3;
        this.d = i5;
        bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.d = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void d(long j) {
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte[] bArr = this.b;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.d = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.d = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.d = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.d = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i7 = i + 6;
        this.d = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i + 7;
        this.d = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.d = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void e(int i, int i2) {
        f((i << 3) | i2);
    }

    public final void f(int i) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.d;
                this.d = i2 + 1;
                AbstractC1131Og1.m(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.d;
            this.d = i3 + 1;
            AbstractC1131Og1.m(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.d;
            this.d = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i5 = this.d;
        this.d = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void g(long j) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.d;
                this.d = i + 1;
                AbstractC1131Og1.m(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.d;
            this.d = i2 + 1;
            AbstractC1131Og1.m(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.d;
            this.d = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i4 = this.d;
        this.d = i4 + 1;
        bArr[i4] = (byte) j;
    }
}
