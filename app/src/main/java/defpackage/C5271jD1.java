package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: jD1 */
/* loaded from: classes.dex */
public final class C5271jD1 extends U12 {
    public static final Logger e = Logger.getLogger(C5271jD1.class.getName());
    public static final boolean f = BJ1.e;
    public C6273oT0 a;
    public final byte[] b;
    public final int c;
    public int d;

    public C5271jD1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int o(int i, DB1 db1, PH1 ph1) {
        int iR = r(i << 3);
        return db1.a(ph1) + iR + iR;
    }

    public static int p(DB1 db1, PH1 ph1) {
        int iA = db1.a(ph1);
        return r(iA) + iA;
    }

    public static int q(String str) {
        int length;
        try {
            length = AbstractC2114aK1.c(str);
        } catch (WJ1 unused) {
            length = str.getBytes(AbstractC3356dF1.a).length;
        }
        return r(length) + length;
    }

    public static int r(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int s(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void c(byte b) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 16);
        }
    }

    public final void d(int i, byte[] bArr) throws C6353ou {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i);
            this.d += i;
        } catch (IndexOutOfBoundsException e2) {
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i)), e2, 16);
        }
    }

    public final void e(int i, C8129yC1 c8129yC1) {
        l((i << 3) | 2);
        l(c8129yC1.h());
        d(c8129yC1.h(), c8129yC1.b);
    }

    public final void f(int i, int i2) {
        l((i << 3) | 5);
        g(i2);
    }

    public final void g(int i) throws C6353ou {
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
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 16);
        }
    }

    public final void h(int i, long j) {
        l((i << 3) | 1);
        i(j);
    }

    public final void i(long j) throws C6353ou {
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
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 16);
        }
    }

    public final void j(int i, String str) {
        l((i << 3) | 2);
        int i2 = this.d;
        try {
            int iR = r(str.length() * 3);
            int iR2 = r(str.length());
            byte[] bArr = this.b;
            int i3 = this.c;
            if (iR2 == iR) {
                int i4 = i2 + iR2;
                this.d = i4;
                int iB = AbstractC2114aK1.b(str, bArr, i4, i3 - i4);
                this.d = i2;
                l((iB - i2) - iR2);
                this.d = iB;
            } else {
                l(AbstractC2114aK1.c(str));
                int i5 = this.d;
                this.d = AbstractC2114aK1.b(str, bArr, i5, i3 - i5);
            }
        } catch (WJ1 e2) {
            this.d = i2;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(AbstractC3356dF1.a);
            try {
                int length = bytes.length;
                l(length);
                d(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new C6353ou(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new C6353ou(e4);
        }
    }

    public final void k(int i, int i2) {
        l((i << 3) | i2);
    }

    public final void l(int i) {
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
                    throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 16);
                }
            }
            throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, 16);
        }
    }

    public final void m(int i, long j) {
        l(i << 3);
        n(j);
    }

    public final void n(long j) {
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
                    throw new C6353ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2, 16);
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
                BJ1.c.d(bArr, BJ1.f + i5, (byte) i4);
                return;
            }
            int i6 = this.d;
            this.d = i6 + 1;
            BJ1.c.d(bArr, BJ1.f + i6, (byte) ((i4 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
            j >>>= 7;
        }
    }
}
