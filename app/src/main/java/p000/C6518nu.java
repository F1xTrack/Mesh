package p000;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: nu */
/* loaded from: classes.dex */
public final class C6518nu extends AbstractC11286uP1 {

    /* renamed from: e */
    public static final Logger f38597e = Logger.getLogger(C6518nu.class.getName());

    /* renamed from: f */
    public static final boolean f38598f = AbstractC8003Ng1.f7953e;

    /* renamed from: a */
    public C8342Tu0 f38599a;

    /* renamed from: b */
    public final byte[] f38600b;

    /* renamed from: c */
    public final int f38601c;

    /* renamed from: d */
    public int f38602d;

    public C6518nu(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f38600b = bArr;
        this.f38602d = 0;
        this.f38601c = i;
    }

    /* renamed from: b */
    public static int m23244b(int i) {
        return m23262t(i) + 1;
    }

    /* renamed from: c */
    public static int m23245c(int i, C0299Ek c0299Ek) {
        return m23246d(c0299Ek) + m23262t(i);
    }

    /* renamed from: d */
    public static int m23246d(C0299Ek c0299Ek) {
        int size = c0299Ek.size();
        return m23264v(size) + size;
    }

    /* renamed from: e */
    public static int m23247e(int i) {
        return m23262t(i) + 8;
    }

    /* renamed from: f */
    public static int m23248f(int i, int i2) {
        return m23254l(i2) + m23262t(i);
    }

    /* renamed from: g */
    public static int m23249g(int i) {
        return m23262t(i) + 4;
    }

    /* renamed from: h */
    public static int m23250h(int i) {
        return m23262t(i) + 8;
    }

    /* renamed from: i */
    public static int m23251i(int i) {
        return m23262t(i) + 4;
    }

    /* renamed from: j */
    public static int m23252j(int i, AbstractC0568J0 abstractC0568J0, DV0 dv0) {
        return abstractC0568J0.mo4101c(dv0) + (m23262t(i) * 2);
    }

    /* renamed from: k */
    public static int m23253k(int i, int i2) {
        return m23254l(i2) + m23262t(i);
    }

    /* renamed from: l */
    public static int m23254l(int i) {
        if (i >= 0) {
            return m23264v(i);
        }
        return 10;
    }

    /* renamed from: m */
    public static int m23255m(int i, long j) {
        return m23266x(j) + m23262t(i);
    }

    /* renamed from: n */
    public static int m23256n(int i) {
        return m23262t(i) + 4;
    }

    /* renamed from: o */
    public static int m23257o(int i) {
        return m23262t(i) + 8;
    }

    /* renamed from: p */
    public static int m23258p(int i, int i2) {
        return m23264v((i2 >> 31) ^ (i2 << 1)) + m23262t(i);
    }

    /* renamed from: q */
    public static int m23259q(int i, long j) {
        return m23266x((j >> 63) ^ (j << 1)) + m23262t(i);
    }

    /* renamed from: r */
    public static int m23260r(int i, String str) {
        return m23261s(str) + m23262t(i);
    }

    /* renamed from: s */
    public static int m23261s(String str) {
        int length;
        try {
            length = AbstractC11194th1.m24969b(str);
        } catch (C10938rh1 unused) {
            length = str.getBytes(AbstractC11635x90.f45425a).length;
        }
        return m23264v(length) + length;
    }

    /* renamed from: t */
    public static int m23262t(int i) {
        return m23264v(i << 3);
    }

    /* renamed from: u */
    public static int m23263u(int i, int i2) {
        return m23264v(i2) + m23262t(i);
    }

    /* renamed from: v */
    public static int m23264v(int i) {
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

    /* renamed from: w */
    public static int m23265w(int i, long j) {
        return m23266x(j) + m23262t(i);
    }

    /* renamed from: x */
    public static int m23266x(long j) {
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

    /* renamed from: A */
    public final void m23267A(C0299Ek c0299Ek) {
        m23275I(c0299Ek.size());
        m23279z(c0299Ek.f2872b, c0299Ek.mo1303h(), c0299Ek.size());
    }

    /* renamed from: B */
    public final void m23268B(int i, int i2) {
        m23274H(i, 5);
        m23269C(i2);
    }

    /* renamed from: C */
    public final void m23269C(int i) {
        try {
            byte[] bArr = this.f38600b;
            int i2 = this.f38602d;
            int i3 = i2 + 1;
            this.f38602d = i3;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i2 + 2;
            this.f38602d = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i2 + 3;
            this.f38602d = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f38602d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38602d), Integer.valueOf(this.f38601c), 1), e, 0);
        }
    }

    /* renamed from: D */
    public final void m23270D(int i, long j) {
        m23274H(i, 1);
        m23271E(j);
    }

    /* renamed from: E */
    public final void m23271E(long j) {
        try {
            byte[] bArr = this.f38600b;
            int i = this.f38602d;
            int i2 = i + 1;
            this.f38602d = i2;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i + 2;
            this.f38602d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i + 3;
            this.f38602d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i + 4;
            this.f38602d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i + 5;
            this.f38602d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i + 6;
            this.f38602d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i + 7;
            this.f38602d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f38602d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38602d), Integer.valueOf(this.f38601c), 1), e, 0);
        }
    }

    /* renamed from: F */
    public final void m23272F(int i) {
        if (i >= 0) {
            m23275I(i);
        } else {
            m23277K(i);
        }
    }

    /* renamed from: G */
    public final void m23273G(String str) {
        int i = this.f38602d;
        try {
            int iM23264v = m23264v(str.length() * 3);
            int iM23264v2 = m23264v(str.length());
            byte[] bArr = this.f38600b;
            int i2 = this.f38601c;
            if (iM23264v2 == iM23264v) {
                int i3 = i + iM23264v2;
                this.f38602d = i3;
                int iM23837a = AbstractC11194th1.f43222a.m23837a(str, bArr, i3, i2 - i3);
                this.f38602d = i;
                m23275I((iM23837a - i) - iM23264v2);
                this.f38602d = iM23837a;
            } else {
                m23275I(AbstractC11194th1.m24969b(str));
                int i4 = this.f38602d;
                this.f38602d = AbstractC11194th1.f43222a.m23837a(str, bArr, i4, i2 - i4);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(e);
        } catch (C10938rh1 e2) {
            this.f38602d = i;
            f38597e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(AbstractC11635x90.f45425a);
            try {
                m23275I(bytes.length);
                m23279z(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e3) {
                throw new C6583ou(e3);
            }
        }
    }

    /* renamed from: H */
    public final void m23274H(int i, int i2) {
        m23275I((i << 3) | i2);
    }

    /* renamed from: I */
    public final void m23275I(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f38600b;
            if (i2 == 0) {
                int i3 = this.f38602d;
                this.f38602d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f38602d;
                    this.f38602d = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38602d), Integer.valueOf(this.f38601c), 1), e, 0);
                }
            }
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38602d), Integer.valueOf(this.f38601c), 1), e, 0);
        }
    }

    /* renamed from: J */
    public final void m23276J(int i, long j) {
        m23274H(i, 0);
        m23277K(j);
    }

    /* renamed from: K */
    public final void m23277K(long j) {
        byte[] bArr = this.f38600b;
        boolean z = f38598f;
        int i = this.f38601c;
        if (z && i - this.f38602d >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.f38602d;
                this.f38602d = i2 + 1;
                AbstractC8003Ng1.m5809k(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.f38602d;
            this.f38602d = 1 + i3;
            AbstractC8003Ng1.m5809k(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.f38602d;
                this.f38602d = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38602d), Integer.valueOf(i), 1), e, 0);
            }
        }
        int i5 = this.f38602d;
        this.f38602d = i5 + 1;
        bArr[i5] = (byte) j;
    }

    /* renamed from: y */
    public final void m23278y(byte b) {
        try {
            byte[] bArr = this.f38600b;
            int i = this.f38602d;
            this.f38602d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38602d), Integer.valueOf(this.f38601c), 1), e, 0);
        }
    }

    /* renamed from: z */
    public final void m23279z(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f38600b, this.f38602d, i2);
            this.f38602d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38602d), Integer.valueOf(this.f38601c), Integer.valueOf(i2)), e, 0);
        }
    }
}
