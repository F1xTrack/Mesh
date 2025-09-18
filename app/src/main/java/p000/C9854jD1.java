package p000;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: jD1 */
/* loaded from: classes.dex */
public final class C9854jD1 extends U12 {

    /* renamed from: e */
    public static final Logger f34983e = Logger.getLogger(C9854jD1.class.getName());

    /* renamed from: f */
    public static final boolean f34984f = BJ1.f713e;

    /* renamed from: a */
    public C10525oT0 f34985a;

    /* renamed from: b */
    public final byte[] f34986b;

    /* renamed from: c */
    public final int f34987c;

    /* renamed from: d */
    public int f34988d;

    public C9854jD1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.f34986b = bArr;
        this.f34988d = 0;
        this.f34987c = i;
    }

    /* renamed from: o */
    public static int m21989o(int i, DB1 db1, PH1 ph1) {
        int iM21992r = m21992r(i << 3);
        return db1.mo1586a(ph1) + iM21992r + iM21992r;
    }

    /* renamed from: p */
    public static int m21990p(DB1 db1, PH1 ph1) {
        int iMo1586a = db1.mo1586a(ph1);
        return m21992r(iMo1586a) + iMo1586a;
    }

    /* renamed from: q */
    public static int m21991q(String str) {
        int length;
        try {
            length = AbstractC8711aK1.m9703c(str);
        } catch (WJ1 unused) {
            length = str.getBytes(AbstractC9090dF1.f25904a).length;
        }
        return m21992r(length) + length;
    }

    /* renamed from: r */
    public static int m21992r(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* renamed from: s */
    public static int m21993s(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* renamed from: c */
    public final void m21994c(byte b) {
        try {
            byte[] bArr = this.f34986b;
            int i = this.f34988d;
            this.f34988d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34988d), Integer.valueOf(this.f34987c), 1), e, 16);
        }
    }

    /* renamed from: d */
    public final void m21995d(int i, byte[] bArr) throws C6583ou {
        try {
            System.arraycopy(bArr, 0, this.f34986b, this.f34988d, i);
            this.f34988d += i;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34988d), Integer.valueOf(this.f34987c), Integer.valueOf(i)), e, 16);
        }
    }

    /* renamed from: e */
    public final void m21996e(int i, C11769yC1 c11769yC1) {
        m22003l((i << 3) | 2);
        m22003l(c11769yC1.mo23955h());
        m21995d(c11769yC1.mo23955h(), c11769yC1.f46140b);
    }

    /* renamed from: f */
    public final void m21997f(int i, int i2) {
        m22003l((i << 3) | 5);
        m21998g(i2);
    }

    /* renamed from: g */
    public final void m21998g(int i) throws C6583ou {
        try {
            byte[] bArr = this.f34986b;
            int i2 = this.f34988d;
            int i3 = i2 + 1;
            this.f34988d = i3;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i2 + 2;
            this.f34988d = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i2 + 3;
            this.f34988d = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f34988d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34988d), Integer.valueOf(this.f34987c), 1), e, 16);
        }
    }

    /* renamed from: h */
    public final void m21999h(int i, long j) {
        m22003l((i << 3) | 1);
        m22000i(j);
    }

    /* renamed from: i */
    public final void m22000i(long j) throws C6583ou {
        try {
            byte[] bArr = this.f34986b;
            int i = this.f34988d;
            int i2 = i + 1;
            this.f34988d = i2;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i + 2;
            this.f34988d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i + 3;
            this.f34988d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i + 4;
            this.f34988d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i + 5;
            this.f34988d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i + 6;
            this.f34988d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i + 7;
            this.f34988d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f34988d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34988d), Integer.valueOf(this.f34987c), 1), e, 16);
        }
    }

    /* renamed from: j */
    public final void m22001j(int i, String str) {
        m22003l((i << 3) | 2);
        int i2 = this.f34988d;
        try {
            int iM21992r = m21992r(str.length() * 3);
            int iM21992r2 = m21992r(str.length());
            byte[] bArr = this.f34986b;
            int i3 = this.f34987c;
            if (iM21992r2 == iM21992r) {
                int i4 = i2 + iM21992r2;
                this.f34988d = i4;
                int iM9702b = AbstractC8711aK1.m9702b(str, bArr, i4, i3 - i4);
                this.f34988d = i2;
                m22003l((iM9702b - i2) - iM21992r2);
                this.f34988d = iM9702b;
            } else {
                m22003l(AbstractC8711aK1.m9703c(str));
                int i5 = this.f34988d;
                this.f34988d = AbstractC8711aK1.m9702b(str, bArr, i5, i3 - i5);
            }
        } catch (WJ1 e) {
            this.f34988d = i2;
            f34983e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AbstractC9090dF1.f25904a);
            try {
                int length = bytes.length;
                m22003l(length);
                m21995d(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new C6583ou(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new C6583ou(e3);
        }
    }

    /* renamed from: k */
    public final void m22002k(int i, int i2) {
        m22003l((i << 3) | i2);
    }

    /* renamed from: l */
    public final void m22003l(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f34986b;
            if (i2 == 0) {
                int i3 = this.f34988d;
                this.f34988d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f34988d;
                    this.f34988d = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34988d), Integer.valueOf(this.f34987c), 1), e, 16);
                }
            }
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34988d), Integer.valueOf(this.f34987c), 1), e, 16);
        }
    }

    /* renamed from: m */
    public final void m22004m(int i, long j) {
        m22003l(i << 3);
        m22005n(j);
    }

    /* renamed from: n */
    public final void m22005n(long j) {
        byte[] bArr = this.f34986b;
        boolean z = f34984f;
        int i = this.f34987c;
        if (!z || i - this.f34988d < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i2 = this.f34988d;
                    this.f34988d = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34988d), Integer.valueOf(i), 1), e, 16);
                }
            }
            int i3 = this.f34988d;
            this.f34988d = i3 + 1;
            bArr[i3] = (byte) j;
            return;
        }
        while (true) {
            int i4 = (int) j;
            if ((j & (-128)) == 0) {
                int i5 = this.f34988d;
                this.f34988d = 1 + i5;
                BJ1.f711c.mo162d(bArr, BJ1.f714f + i5, (byte) i4);
                return;
            }
            int i6 = this.f34988d;
            this.f34988d = i6 + 1;
            BJ1.f711c.mo162d(bArr, BJ1.f714f + i6, (byte) ((i4 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
            j >>>= 7;
        }
    }
}
