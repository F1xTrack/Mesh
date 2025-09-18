package p000;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: qu */
/* loaded from: classes.dex */
public final class C6709qu extends AbstractC11668xP1 {

    /* renamed from: f */
    public static final Logger f41238f = Logger.getLogger(C6709qu.class.getName());

    /* renamed from: g */
    public static final boolean f41239g = AbstractC8055Og1.f8567f;

    /* renamed from: a */
    public C8170Qm0 f41240a;

    /* renamed from: b */
    public final byte[] f41241b;

    /* renamed from: c */
    public final int f41242c;

    /* renamed from: d */
    public int f41243d;

    /* renamed from: e */
    public final C6444mj f41244e;

    public C6709qu(C6444mj c6444mj, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f41241b = new byte[iMax];
        this.f41242c = iMax;
        this.f41244e = c6444mj;
    }

    /* renamed from: A */
    public static int m24079A(int i, int i2) {
        return m24080B(i2) + m24101z(i);
    }

    /* renamed from: B */
    public static int m24080B(int i) {
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

    /* renamed from: C */
    public static int m24081C(int i, long j) {
        return m24082D(j) + m24101z(i);
    }

    /* renamed from: D */
    public static int m24082D(long j) {
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

    /* renamed from: h */
    public static int m24083h(int i) {
        return m24101z(i) + 1;
    }

    /* renamed from: i */
    public static int m24084i(int i, C0362Fk c0362Fk) {
        return m24085j(c0362Fk) + m24101z(i);
    }

    /* renamed from: j */
    public static int m24085j(C0362Fk c0362Fk) {
        int size = c0362Fk.size();
        return m24080B(size) + size;
    }

    /* renamed from: k */
    public static int m24086k(int i) {
        return m24101z(i) + 8;
    }

    /* renamed from: l */
    public static int m24087l(int i, int i2) {
        return m24093r(i2) + m24101z(i);
    }

    /* renamed from: m */
    public static int m24088m(int i) {
        return m24101z(i) + 4;
    }

    /* renamed from: n */
    public static int m24089n(int i) {
        return m24101z(i) + 8;
    }

    /* renamed from: o */
    public static int m24090o(int i) {
        return m24101z(i) + 4;
    }

    /* renamed from: p */
    public static int m24091p(int i, AbstractC0694L0 abstractC0694L0, EV0 ev0) {
        return abstractC0694L0.m4819b(ev0) + (m24101z(i) * 2);
    }

    /* renamed from: q */
    public static int m24092q(int i, int i2) {
        return m24093r(i2) + m24101z(i);
    }

    /* renamed from: r */
    public static int m24093r(int i) {
        if (i >= 0) {
            return m24080B(i);
        }
        return 10;
    }

    /* renamed from: s */
    public static int m24094s(int i, long j) {
        return m24082D(j) + m24101z(i);
    }

    /* renamed from: t */
    public static int m24095t(int i) {
        return m24101z(i) + 4;
    }

    /* renamed from: u */
    public static int m24096u(int i) {
        return m24101z(i) + 8;
    }

    /* renamed from: v */
    public static int m24097v(int i, int i2) {
        return m24080B((i2 >> 31) ^ (i2 << 1)) + m24101z(i);
    }

    /* renamed from: w */
    public static int m24098w(int i, long j) {
        return m24082D((j >> 63) ^ (j << 1)) + m24101z(i);
    }

    /* renamed from: x */
    public static int m24099x(int i, String str) {
        return m24100y(str) + m24101z(i);
    }

    /* renamed from: y */
    public static int m24100y(String str) {
        int length;
        try {
            length = AbstractC11322uh1.m25221b(str);
        } catch (C11066sh1 unused) {
            length = str.getBytes(AbstractC11889z90.f46666a).length;
        }
        return m24080B(length) + length;
    }

    /* renamed from: z */
    public static int m24101z(int i) {
        return m24080B(i << 3);
    }

    /* renamed from: E */
    public final void m24102E() {
        this.f41244e.write(this.f41241b, 0, this.f41243d);
        this.f41243d = 0;
    }

    /* renamed from: F */
    public final void m24103F(int i) {
        if (this.f41242c - this.f41243d < i) {
            m24102E();
        }
    }

    /* renamed from: G */
    public final void m24104G(byte b) {
        if (this.f41243d == this.f41242c) {
            m24102E();
        }
        int i = this.f41243d;
        this.f41243d = i + 1;
        this.f41241b[i] = b;
    }

    /* renamed from: H */
    public final void m24105H(byte[] bArr, int i, int i2) {
        int i3 = this.f41243d;
        int i4 = this.f41242c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f41241b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f41243d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f41243d = i4;
        m24102E();
        if (i7 > i4) {
            this.f41244e.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f41243d = i7;
        }
    }

    /* renamed from: I */
    public final void m24106I(int i, boolean z) {
        m24103F(11);
        m24125e(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f41243d;
        this.f41243d = i2 + 1;
        this.f41241b[i2] = b;
    }

    /* renamed from: J */
    public final void m24107J(int i, C0362Fk c0362Fk) {
        m24117T(i, 2);
        m24108K(c0362Fk);
    }

    /* renamed from: K */
    public final void m24108K(C0362Fk c0362Fk) {
        m24119V(c0362Fk.size());
        mo24122b(c0362Fk.f3406b, c0362Fk.m2765d(), c0362Fk.size());
    }

    /* renamed from: L */
    public final void m24109L(int i, int i2) {
        m24103F(14);
        m24125e(i, 5);
        m24123c(i2);
    }

    /* renamed from: M */
    public final void m24110M(int i) {
        m24103F(4);
        m24123c(i);
    }

    /* renamed from: N */
    public final void m24111N(int i, long j) {
        m24103F(18);
        m24125e(i, 1);
        m24124d(j);
    }

    /* renamed from: O */
    public final void m24112O(long j) {
        m24103F(8);
        m24124d(j);
    }

    /* renamed from: P */
    public final void m24113P(int i, int i2) {
        m24103F(20);
        m24125e(i, 0);
        if (i2 >= 0) {
            m24126f(i2);
        } else {
            m24127g(i2);
        }
    }

    /* renamed from: Q */
    public final void m24114Q(int i) {
        if (i >= 0) {
            m24119V(i);
        } else {
            m24121X(i);
        }
    }

    /* renamed from: R */
    public final void m24115R(int i, String str) {
        m24117T(i, 2);
        m24116S(str);
    }

    /* renamed from: S */
    public final void m24116S(String str) {
        try {
            int length = str.length() * 3;
            int iM24080B = m24080B(length);
            int i = iM24080B + length;
            int i2 = this.f41242c;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM24046a = AbstractC11322uh1.f43795a.m24046a(str, bArr, 0, length);
                m24119V(iM24046a);
                m24105H(bArr, 0, iM24046a);
                return;
            }
            if (i > i2 - this.f41243d) {
                m24102E();
            }
            int iM24080B2 = m24080B(str.length());
            int i3 = this.f41243d;
            byte[] bArr2 = this.f41241b;
            try {
                if (iM24080B2 == iM24080B) {
                    int i4 = i3 + iM24080B2;
                    this.f41243d = i4;
                    int iM24046a2 = AbstractC11322uh1.f43795a.m24046a(str, bArr2, i4, i2 - i4);
                    this.f41243d = i3;
                    m24126f((iM24046a2 - i3) - iM24080B2);
                    this.f41243d = iM24046a2;
                } else {
                    int iM25221b = AbstractC11322uh1.m25221b(str);
                    m24126f(iM25221b);
                    this.f41243d = AbstractC11322uh1.f43795a.m24046a(str, bArr2, this.f41243d, iM25221b);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C6646pu(e);
            } catch (C11066sh1 e2) {
                this.f41243d = i3;
                throw e2;
            }
        } catch (C11066sh1 e3) {
            f41238f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC11889z90.f46666a);
            try {
                m24119V(bytes.length);
                mo24122b(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C6646pu(e4);
            } catch (C6646pu e5) {
                throw e5;
            }
        }
    }

    /* renamed from: T */
    public final void m24117T(int i, int i2) {
        m24119V((i << 3) | i2);
    }

    /* renamed from: U */
    public final void m24118U(int i, int i2) {
        m24103F(20);
        m24125e(i, 0);
        m24126f(i2);
    }

    /* renamed from: V */
    public final void m24119V(int i) {
        m24103F(5);
        m24126f(i);
    }

    /* renamed from: W */
    public final void m24120W(int i, long j) {
        m24103F(20);
        m24125e(i, 0);
        m24127g(j);
    }

    /* renamed from: X */
    public final void m24121X(long j) {
        m24103F(10);
        m24127g(j);
    }

    @Override // p000.AbstractC11668xP1
    /* renamed from: b */
    public final void mo24122b(byte[] bArr, int i, int i2) {
        m24105H(bArr, i, i2);
    }

    /* renamed from: c */
    public final void m24123c(int i) {
        int i2 = this.f41243d;
        int i3 = i2 + 1;
        this.f41243d = i3;
        byte b = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f41241b;
        bArr[i2] = b;
        int i4 = i2 + 2;
        this.f41243d = i4;
        bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i2 + 3;
        this.f41243d = i5;
        bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f41243d = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: d */
    public final void m24124d(long j) {
        int i = this.f41243d;
        int i2 = i + 1;
        this.f41243d = i2;
        byte[] bArr = this.f41241b;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f41243d = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f41243d = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f41243d = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f41243d = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i7 = i + 6;
        this.f41243d = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i + 7;
        this.f41243d = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f41243d = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: e */
    public final void m24125e(int i, int i2) {
        m24126f((i << 3) | i2);
    }

    /* renamed from: f */
    public final void m24126f(int i) {
        boolean z = f41239g;
        byte[] bArr = this.f41241b;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.f41243d;
                this.f41243d = i2 + 1;
                AbstractC8055Og1.m6110m(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.f41243d;
            this.f41243d = i3 + 1;
            AbstractC8055Og1.m6110m(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.f41243d;
            this.f41243d = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i5 = this.f41243d;
        this.f41243d = i5 + 1;
        bArr[i5] = (byte) i;
    }

    /* renamed from: g */
    public final void m24127g(long j) {
        boolean z = f41239g;
        byte[] bArr = this.f41241b;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.f41243d;
                this.f41243d = i + 1;
                AbstractC8055Og1.m6110m(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.f41243d;
            this.f41243d = i2 + 1;
            AbstractC8055Og1.m6110m(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.f41243d;
            this.f41243d = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i4 = this.f41243d;
        this.f41243d = i4 + 1;
        bArr[i4] = (byte) j;
    }
}
