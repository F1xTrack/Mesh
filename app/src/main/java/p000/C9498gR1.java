package p000;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: gR1 */
/* loaded from: classes.dex */
public final class C9498gR1 extends F22 {

    /* renamed from: f */
    public static final Logger f27799f = Logger.getLogger(C9498gR1.class.getName());

    /* renamed from: g */
    public static final boolean f27800g = VV1.f12600e;

    /* renamed from: b */
    public C10641pN0 f27801b;

    /* renamed from: c */
    public final byte[] f27802c;

    /* renamed from: d */
    public final int f27803d;

    /* renamed from: e */
    public int f27804e;

    public C9498gR1(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC7222ym.m26229f(bArr.length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
        }
        this.f27802c = bArr;
        this.f27804e = 0;
        this.f27803d = i;
    }

    /* renamed from: A */
    public static int m18522A(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* renamed from: a */
    public static int m18523a(int i) {
        return m18522A(i << 3) + 4;
    }

    /* renamed from: b */
    public static int m18524b(int i, int i2) {
        return m18540v(i2) + m18522A(i << 3);
    }

    /* renamed from: c */
    public static int m18525c(int i, String str) {
        return m18528f(str) + m18522A(i << 3);
    }

    /* renamed from: d */
    public static int m18526d(int i, IP1 ip1, InterfaceC9122dV1 interfaceC9122dV1) {
        return ip1.mo3856a(interfaceC9122dV1) + (m18522A(i << 3) << 1);
    }

    /* renamed from: e */
    public static int m18527e(int i, JQ1 jq1) {
        int iM18522A = m18522A(i << 3);
        int iMo4321k = jq1.mo4321k();
        return m18522A(iMo4321k) + iMo4321k + iM18522A;
    }

    /* renamed from: f */
    public static int m18528f(String str) {
        int length;
        try {
            length = AbstractC9636hW1.m18821a(str);
        } catch (C10148lW1 unused) {
            length = str.getBytes(BS1.f826a).length;
        }
        return m18522A(length) + length;
    }

    /* renamed from: h */
    public static int m18529h(int i) {
        return m18522A(i << 3) + 1;
    }

    /* renamed from: i */
    public static int m18530i(int i) {
        return m18522A(i << 3) + 8;
    }

    /* renamed from: j */
    public static int m18531j(int i) {
        return m18522A(i << 3) + 8;
    }

    /* renamed from: l */
    public static int m18532l(int i) {
        return m18522A(i << 3) + 4;
    }

    /* renamed from: m */
    public static int m18533m(int i, long j) {
        return m18540v(j) + m18522A(i << 3);
    }

    /* renamed from: o */
    public static int m18534o(int i) {
        return m18522A(i << 3) + 8;
    }

    /* renamed from: p */
    public static int m18535p(int i, int i2) {
        return m18540v(i2) + m18522A(i << 3);
    }

    /* renamed from: r */
    public static int m18536r(int i) {
        return m18522A(i << 3) + 4;
    }

    /* renamed from: s */
    public static int m18537s(int i, long j) {
        return m18540v((j >> 63) ^ (j << 1)) + m18522A(i << 3);
    }

    /* renamed from: t */
    public static int m18538t(int i, int i2) {
        return m18522A((i2 >> 31) ^ (i2 << 1)) + m18522A(i << 3);
    }

    /* renamed from: u */
    public static int m18539u(int i, long j) {
        return m18540v(j) + m18522A(i << 3);
    }

    /* renamed from: v */
    public static int m18540v(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* renamed from: w */
    public static int m18541w(int i) {
        return m18522A(i << 3);
    }

    /* renamed from: x */
    public static int m18542x(int i, int i2) {
        return m18522A(i2) + m18522A(i << 3);
    }

    /* renamed from: B */
    public final void m18543B(int i, int i2) {
        m18549H(i, 5);
        m18544C(i2);
    }

    /* renamed from: C */
    public final void m18544C(int i) throws C6583ou {
        int i2 = this.f27804e;
        try {
            byte[] bArr = this.f27802c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = i >> 24;
            this.f27804e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(i2, this.f27803d, 4, e);
        }
    }

    /* renamed from: D */
    public final void m18545D(int i, int i2) {
        m18549H(i, 0);
        m18548G(i2);
    }

    /* renamed from: E */
    public final void m18546E(int i, long j) {
        m18549H(i, 0);
        m18547F(j);
    }

    /* renamed from: F */
    public final void m18547F(long j) throws C6583ou {
        int i;
        int i2 = this.f27804e;
        byte[] bArr = this.f27802c;
        if (!f27800g || m18553k() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6583ou(i, this.f27803d, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                VV1.f12598c.mo7385d(bArr, VV1.f12601f + i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            VV1.f12598c.mo7385d(bArr, VV1.f12601f + i2, (byte) j);
        }
        this.f27804e = i;
    }

    /* renamed from: G */
    public final void m18548G(int i) throws C6583ou {
        if (i >= 0) {
            m18550I(i);
        } else {
            m18547F(i);
        }
    }

    /* renamed from: H */
    public final void m18549H(int i, int i2) {
        m18550I((i << 3) | i2);
    }

    /* renamed from: I */
    public final void m18550I(int i) {
        int i2;
        int i3 = this.f27804e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f27802c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f27804e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6583ou(i2, this.f27803d, 1, e);
                }
            }
            throw new C6583ou(i2, this.f27803d, 1, e);
        }
    }

    /* renamed from: J */
    public final void m18551J(int i, int i2) {
        m18549H(i, 0);
        m18550I(i2);
    }

    /* renamed from: g */
    public final void m18552g(byte b) {
        int i;
        int i2 = this.f27804e;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.f27802c[i2] = b;
            this.f27804e = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new C6583ou(i2, this.f27803d, 1, e);
        }
    }

    /* renamed from: k */
    public final int m18553k() {
        return this.f27803d - this.f27804e;
    }

    /* renamed from: n */
    public final void m18554n(JQ1 jq1) {
        m18550I(jq1.mo4321k());
        m18555q(jq1.f5519b, jq1.mo4322q(), jq1.mo4321k());
    }

    /* renamed from: q */
    public final void m18555q(byte[] bArr, int i, int i2) throws C6583ou {
        try {
            System.arraycopy(bArr, i, this.f27802c, this.f27804e, i2);
            this.f27804e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(this.f27804e, this.f27803d, i2, e);
        }
    }

    /* renamed from: y */
    public final void m18556y(int i, long j) {
        m18549H(i, 1);
        m18557z(j);
    }

    /* renamed from: z */
    public final void m18557z(long j) throws C6583ou {
        int i = this.f27804e;
        try {
            byte[] bArr = this.f27802c;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f27804e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(i, this.f27803d, 8, e);
        }
    }
}
