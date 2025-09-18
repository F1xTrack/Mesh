package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: nu */
/* loaded from: classes.dex */
public final class C6162nu extends AbstractC7407uP1 {
    public static final Logger e = Logger.getLogger(C6162nu.class.getName());
    public static final boolean f = AbstractC1053Ng1.e;
    public C1562Tu0 a;
    public final byte[] b;
    public final int c;
    public int d;

    public C6162nu(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int b(int i) {
        return t(i) + 1;
    }

    public static int c(int i, C0362Ek c0362Ek) {
        return d(c0362Ek) + t(i);
    }

    public static int d(C0362Ek c0362Ek) {
        int size = c0362Ek.size();
        return v(size) + size;
    }

    public static int e(int i) {
        return t(i) + 8;
    }

    public static int f(int i, int i2) {
        return l(i2) + t(i);
    }

    public static int g(int i) {
        return t(i) + 4;
    }

    public static int h(int i) {
        return t(i) + 8;
    }

    public static int i(int i) {
        return t(i) + 4;
    }

    public static int j(int i, J0 j0, DV0 dv0) {
        return j0.c(dv0) + (t(i) * 2);
    }

    public static int k(int i, int i2) {
        return l(i2) + t(i);
    }

    public static int l(int i) {
        if (i >= 0) {
            return v(i);
        }
        return 10;
    }

    public static int m(int i, long j) {
        return x(j) + t(i);
    }

    public static int n(int i) {
        return t(i) + 4;
    }

    public static int o(int i) {
        return t(i) + 8;
    }

    public static int p(int i, int i2) {
        return v((i2 >> 31) ^ (i2 << 1)) + t(i);
    }

    public static int q(int i, long j) {
        return x((j >> 63) ^ (j << 1)) + t(i);
    }

    public static int r(int i, String str) {
        return s(str) + t(i);
    }

    public static int s(String str) {
        int length;
        try {
            length = AbstractC7270th1.b(str);
        } catch (C6888rh1 unused) {
            length = str.getBytes(AbstractC7929x90.a).length;
        }
        return v(length) + length;
    }

    public static int t(int i) {
        return v(i << 3);
    }

    public static int u(int i, int i2) {
        return v(i2) + t(i);
    }

    public static int v(int i) {
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

    public static int w(int i, long j) {
        return x(j) + t(i);
    }

    public static int x(long j) {
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

    public final void A(C0362Ek c0362Ek) {
        I(c0362Ek.size());
        z(c0362Ek.b, c0362Ek.h(), c0362Ek.size());
    }

    public final void B(int i, int i2) {
        H(i, 5);
        C(i2);
    }

    public final void C(int i) {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 0);
        }
    }

    public final void D(int i, long j) {
        H(i, 1);
        E(j);
    }

    public final void E(long j) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
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
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 0);
        }
    }

    public final void F(int i) {
        if (i >= 0) {
            I(i);
        } else {
            K(i);
        }
    }

    public final void G(String str) {
        int i = this.d;
        try {
            int iV = v(str.length() * 3);
            int iV2 = v(str.length());
            byte[] bArr = this.b;
            int i2 = this.c;
            if (iV2 == iV) {
                int i3 = i + iV2;
                this.d = i3;
                int iA = AbstractC7270th1.a.a(str, bArr, i3, i2 - i3);
                this.d = i;
                I((iA - i) - iV2);
                this.d = iA;
            } else {
                I(AbstractC7270th1.b(str));
                int i4 = this.d;
                this.d = AbstractC7270th1.a.a(str, bArr, i4, i2 - i4);
            }
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(e2);
        } catch (C6888rh1 e3) {
            this.d = i;
            e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC7929x90.a);
            try {
                I(bytes.length);
                z(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C6353ou(e4);
            }
        }
    }

    public final void H(int i, int i2) {
        I((i << 3) | i2);
    }

    public final void I(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.b;
            if (i2 == 0) {
                int i3 = this.d;
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.d;
                    this.d = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 0);
                }
            }
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 0);
        }
    }

    public final void J(int i, long j) {
        H(i, 0);
        K(j);
    }

    public final void K(long j) {
        byte[] bArr = this.b;
        boolean z = f;
        int i = this.c;
        if (z && i - this.d >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.d;
                this.d = i2 + 1;
                AbstractC1053Ng1.k(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.d;
            this.d = 1 + i3;
            AbstractC1053Ng1.k(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.d;
                this.d = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2, 0);
            }
        }
        int i5 = this.d;
        this.d = i5 + 1;
        bArr[i5] = (byte) j;
    }

    public final void y(byte b) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 0);
        }
    }

    public final void z(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2, 0);
        }
    }
}
