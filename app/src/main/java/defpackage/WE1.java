package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class WE1 extends AbstractC3506e22 {
    public static final Logger e = Logger.getLogger(WE1.class.getName());
    public static final boolean f = HM1.e;
    public L21 a;
    public final byte[] b;
    public final int c;
    public int d;

    public WE1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int b(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int c(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int s(int i, DD1 dd1, InterfaceC8153yK1 interfaceC8153yK1) {
        int iB = b(i << 3);
        return dd1.b(interfaceC8153yK1) + iB + iB;
    }

    public static int t(DD1 dd1, InterfaceC8153yK1 interfaceC8153yK1) {
        int iB = dd1.b(interfaceC8153yK1);
        return b(iB) + iB;
    }

    public static int u(String str) {
        int length;
        try {
            length = AbstractC3952gN1.c(str);
        } catch (C2314bN1 unused) {
            length = str.getBytes(AbstractC7574vH1.a).length;
        }
        return b(length) + length;
    }

    public final void d(byte b) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 17);
        }
    }

    public final void e(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2, 17);
        }
    }

    public final void f(int i, JE1 je1) {
        p((i << 3) | 2);
        p(je1.i());
        je1.y(this);
    }

    public final void g(int i, int i2) {
        p((i << 3) | 5);
        h(i2);
    }

    public final void h(int i) throws C6353ou {
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
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 17);
        }
    }

    public final void i(int i, long j) {
        p((i << 3) | 1);
        j(j);
    }

    public final void j(long j) throws C6353ou {
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
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 17);
        }
    }

    public final void k(int i, int i2) {
        p(i << 3);
        l(i2);
    }

    public final void l(int i) throws C6353ou {
        if (i >= 0) {
            p(i);
        } else {
            r(i);
        }
    }

    public final void m(int i, String str) {
        p((i << 3) | 2);
        int i2 = this.d;
        try {
            int iB = b(str.length() * 3);
            int iB2 = b(str.length());
            byte[] bArr = this.b;
            int i3 = this.c;
            if (iB2 == iB) {
                int i4 = i2 + iB2;
                this.d = i4;
                int iB3 = AbstractC3952gN1.b(str, bArr, i4, i3 - i4);
                this.d = i2;
                p((iB3 - i2) - iB2);
                this.d = iB3;
            } else {
                p(AbstractC3952gN1.c(str));
                int i5 = this.d;
                this.d = AbstractC3952gN1.b(str, bArr, i5, i3 - i5);
            }
        } catch (C2314bN1 e2) {
            this.d = i2;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(AbstractC7574vH1.a);
            try {
                int length = bytes.length;
                p(length);
                e(bytes, 0, length);
            } catch (IndexOutOfBoundsException e3) {
                throw new C6353ou(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new C6353ou(e4);
        }
    }

    public final void n(int i, int i2) {
        p((i << 3) | i2);
    }

    public final void o(int i, int i2) {
        p(i << 3);
        p(i2);
    }

    public final void p(int i) {
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
                    bArr[i4] = (byte) ((i | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 17);
                }
            }
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 17);
        }
    }

    public final void q(int i, long j) {
        p(i << 3);
        r(j);
    }

    public final void r(long j) throws C6353ou {
        byte[] bArr = this.b;
        boolean z = f;
        int i = this.c;
        if (!z || i - this.d < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2, 17);
                }
            }
            int i3 = this.d;
            this.d = i3 + 1;
            bArr[i3] = (byte) j;
            return;
        }
        while (true) {
            int i4 = (int) j;
            if ((j & (-128)) == 0) {
                int i5 = this.d;
                this.d = 1 + i5;
                HM1.c.d(bArr, HM1.f + i5, (byte) i4);
                return;
            }
            int i6 = this.d;
            this.d = i6 + 1;
            HM1.c.d(bArr, HM1.f + i6, (byte) ((i4 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
            j >>>= 7;
        }
    }
}
