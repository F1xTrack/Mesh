package p000;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class WE1 extends AbstractC9191e22 {

    /* renamed from: e */
    public static final Logger f13085e = Logger.getLogger(WE1.class.getName());

    /* renamed from: f */
    public static final boolean f13086f = HM1.f4247e;

    /* renamed from: a */
    public L21 f13087a;

    /* renamed from: b */
    public final byte[] f13088b;

    /* renamed from: c */
    public final int f13089c;

    /* renamed from: d */
    public int f13090d;

    public WE1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.f13088b = bArr;
        this.f13090d = 0;
        this.f13089c = i;
    }

    /* renamed from: b */
    public static int m8717b(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* renamed from: c */
    public static int m8718c(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* renamed from: s */
    public static int m8719s(int i, DD1 dd1, InterfaceC11785yK1 interfaceC11785yK1) {
        int iM8717b = m8717b(i << 3);
        return dd1.mo1598b(interfaceC11785yK1) + iM8717b + iM8717b;
    }

    /* renamed from: t */
    public static int m8720t(DD1 dd1, InterfaceC11785yK1 interfaceC11785yK1) {
        int iMo1598b = dd1.mo1598b(interfaceC11785yK1);
        return m8717b(iMo1598b) + iMo1598b;
    }

    /* renamed from: u */
    public static int m8721u(String str) {
        int length;
        try {
            length = AbstractC9490gN1.m18477c(str);
        } catch (C8845bN1 unused) {
            length = str.getBytes(AbstractC11398vH1.f44320a).length;
        }
        return m8717b(length) + length;
    }

    /* renamed from: d */
    public final void m8722d(byte b) {
        try {
            byte[] bArr = this.f13088b;
            int i = this.f13090d;
            this.f13090d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13090d), Integer.valueOf(this.f13089c), 1), e, 17);
        }
    }

    /* renamed from: e */
    public final void m8723e(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f13088b, this.f13090d, i2);
            this.f13090d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13090d), Integer.valueOf(this.f13089c), Integer.valueOf(i2)), e, 17);
        }
    }

    /* renamed from: f */
    public final void m8724f(int i, JE1 je1) {
        m8734p((i << 3) | 2);
        m8734p(je1.mo3006i());
        je1.mo3014y(this);
    }

    /* renamed from: g */
    public final void m8725g(int i, int i2) {
        m8734p((i << 3) | 5);
        m8726h(i2);
    }

    /* renamed from: h */
    public final void m8726h(int i) throws C6583ou {
        try {
            byte[] bArr = this.f13088b;
            int i2 = this.f13090d;
            int i3 = i2 + 1;
            this.f13090d = i3;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i2 + 2;
            this.f13090d = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i2 + 3;
            this.f13090d = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f13090d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13090d), Integer.valueOf(this.f13089c), 1), e, 17);
        }
    }

    /* renamed from: i */
    public final void m8727i(int i, long j) {
        m8734p((i << 3) | 1);
        m8728j(j);
    }

    /* renamed from: j */
    public final void m8728j(long j) throws C6583ou {
        try {
            byte[] bArr = this.f13088b;
            int i = this.f13090d;
            int i2 = i + 1;
            this.f13090d = i2;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i + 2;
            this.f13090d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i + 3;
            this.f13090d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i + 4;
            this.f13090d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i + 5;
            this.f13090d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i + 6;
            this.f13090d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i + 7;
            this.f13090d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f13090d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13090d), Integer.valueOf(this.f13089c), 1), e, 17);
        }
    }

    /* renamed from: k */
    public final void m8729k(int i, int i2) {
        m8734p(i << 3);
        m8730l(i2);
    }

    /* renamed from: l */
    public final void m8730l(int i) throws C6583ou {
        if (i >= 0) {
            m8734p(i);
        } else {
            m8736r(i);
        }
    }

    /* renamed from: m */
    public final void m8731m(int i, String str) {
        m8734p((i << 3) | 2);
        int i2 = this.f13090d;
        try {
            int iM8717b = m8717b(str.length() * 3);
            int iM8717b2 = m8717b(str.length());
            byte[] bArr = this.f13088b;
            int i3 = this.f13089c;
            if (iM8717b2 == iM8717b) {
                int i4 = i2 + iM8717b2;
                this.f13090d = i4;
                int iM18476b = AbstractC9490gN1.m18476b(str, bArr, i4, i3 - i4);
                this.f13090d = i2;
                m8734p((iM18476b - i2) - iM8717b2);
                this.f13090d = iM18476b;
            } else {
                m8734p(AbstractC9490gN1.m18477c(str));
                int i5 = this.f13090d;
                this.f13090d = AbstractC9490gN1.m18476b(str, bArr, i5, i3 - i5);
            }
        } catch (C8845bN1 e) {
            this.f13090d = i2;
            f13085e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AbstractC11398vH1.f44320a);
            try {
                int length = bytes.length;
                m8734p(length);
                m8723e(bytes, 0, length);
            } catch (IndexOutOfBoundsException e2) {
                throw new C6583ou(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new C6583ou(e3);
        }
    }

    /* renamed from: n */
    public final void m8732n(int i, int i2) {
        m8734p((i << 3) | i2);
    }

    /* renamed from: o */
    public final void m8733o(int i, int i2) {
        m8734p(i << 3);
        m8734p(i2);
    }

    /* renamed from: p */
    public final void m8734p(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f13088b;
            if (i2 == 0) {
                int i3 = this.f13090d;
                this.f13090d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f13090d;
                    this.f13090d = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13090d), Integer.valueOf(this.f13089c), 1), e, 17);
                }
            }
            throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13090d), Integer.valueOf(this.f13089c), 1), e, 17);
        }
    }

    /* renamed from: q */
    public final void m8735q(int i, long j) {
        m8734p(i << 3);
        m8736r(j);
    }

    /* renamed from: r */
    public final void m8736r(long j) throws C6583ou {
        byte[] bArr = this.f13088b;
        boolean z = f13086f;
        int i = this.f13089c;
        if (!z || i - this.f13090d < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i2 = this.f13090d;
                    this.f13090d = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C6583ou(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13090d), Integer.valueOf(i), 1), e, 17);
                }
            }
            int i3 = this.f13090d;
            this.f13090d = i3 + 1;
            bArr[i3] = (byte) j;
            return;
        }
        while (true) {
            int i4 = (int) j;
            if ((j & (-128)) == 0) {
                int i5 = this.f13090d;
                this.f13090d = 1 + i5;
                HM1.f4245c.mo162d(bArr, HM1.f4248f + i5, (byte) i4);
                return;
            }
            int i6 = this.f13090d;
            this.f13090d = i6 + 1;
            HM1.f4245c.mo162d(bArr, HM1.f4248f + i6, (byte) ((i4 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
            j >>>= 7;
        }
    }
}
