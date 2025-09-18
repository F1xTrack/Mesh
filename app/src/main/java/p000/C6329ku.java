package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ku */
/* loaded from: classes.dex */
public final class C6329ku {

    /* renamed from: a */
    public int f36745a;

    /* renamed from: b */
    public C6455mu f36746b;

    /* renamed from: c */
    public final FileInputStream f36747c;

    /* renamed from: d */
    public final byte[] f36748d;

    /* renamed from: e */
    public int f36749e;

    /* renamed from: f */
    public int f36750f;

    /* renamed from: g */
    public int f36751g;

    /* renamed from: h */
    public int f36752h;

    /* renamed from: i */
    public int f36753i;

    /* renamed from: j */
    public int f36754j = Integer.MAX_VALUE;

    public C6329ku(FileInputStream fileInputStream) {
        Charset charset = AbstractC11889z90.f46666a;
        this.f36747c = fileInputStream;
        this.f36748d = new byte[4096];
        this.f36749e = 0;
        this.f36751g = 0;
        this.f36753i = 0;
    }

    /* renamed from: A */
    public final int m22279A() {
        return m22304s();
    }

    /* renamed from: B */
    public final long m22280B() {
        return m22305t();
    }

    /* renamed from: C */
    public final void m22281C() {
        int i = this.f36749e + this.f36750f;
        this.f36749e = i;
        int i2 = this.f36753i + i;
        int i3 = this.f36754j;
        if (i2 <= i3) {
            this.f36750f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f36750f = i4;
        this.f36749e = i - i4;
    }

    /* renamed from: D */
    public final void m22282D(int i) throws Z90 {
        if (m22285G(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f36753i) - this.f36751g) {
            throw Z90.m9501f();
        }
        throw new Z90("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: E */
    public final boolean m22283E(int i) throws Z90 {
        int iM22311z;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f36749e - this.f36751g;
            byte[] bArr = this.f36748d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f36751g;
                    this.f36751g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw Z90.m9498c();
            }
            while (i3 < 10) {
                if (this.f36751g == this.f36749e) {
                    m22282D(1);
                }
                int i6 = this.f36751g;
                this.f36751g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw Z90.m9498c();
            return true;
        }
        if (i2 == 1) {
            m22284F(8);
            return true;
        }
        if (i2 == 2) {
            m22284F(m22304s());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw Z90.m9497b();
            }
            m22284F(4);
            return true;
        }
        do {
            iM22311z = m22311z();
            if (iM22311z == 0) {
                break;
            }
        } while (m22283E(iM22311z));
        m22286a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: F */
    public final void m22284F(int i) throws Z90 {
        int i2 = this.f36749e;
        int i3 = this.f36751g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f36751g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.f36747c;
        if (i < 0) {
            throw Z90.m9499d();
        }
        int i5 = this.f36753i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f36754j;
        if (i7 > i8) {
            m22284F((i8 - i5) - i3);
            throw Z90.m9501f();
        }
        this.f36753i = i6;
        this.f36749e = 0;
        this.f36751g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                long jSkip = fileInputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i4 += (int) jSkip;
                }
            } finally {
                this.f36753i += i4;
                m22281C();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i9 = this.f36749e;
        int i10 = i9 - this.f36751g;
        this.f36751g = i9;
        m22282D(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f36749e;
            if (i11 <= i12) {
                this.f36751g = i11;
                return;
            } else {
                i10 += i12;
                this.f36751g = i12;
                m22282D(1);
            }
        }
    }

    /* renamed from: G */
    public final boolean m22285G(int i) throws IOException {
        int i2 = this.f36751g;
        int i3 = i2 + i;
        int i4 = this.f36749e;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC7222ym.m26230g(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f36753i;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.f36754j) {
            return false;
        }
        byte[] bArr = this.f36748d;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.f36753i += i2;
            this.f36749e -= i2;
            this.f36751g = 0;
        }
        int i6 = this.f36749e;
        int iMin = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f36753i) - i6);
        FileInputStream fileInputStream = this.f36747c;
        int i7 = fileInputStream.read(bArr, i6, iMin);
        if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
            throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
        }
        if (i7 <= 0) {
            return false;
        }
        this.f36749e += i7;
        m22281C();
        if (this.f36749e >= i) {
            return true;
        }
        return m22285G(i);
    }

    /* renamed from: a */
    public final void m22286a(int i) throws Z90 {
        if (this.f36752h != i) {
            throw new Z90("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final int m22287b() {
        return this.f36753i + this.f36751g;
    }

    /* renamed from: c */
    public final boolean m22288c() {
        return this.f36751g == this.f36749e && !m22285G(1);
    }

    /* renamed from: d */
    public final void m22289d(int i) {
        this.f36754j = i;
        m22281C();
    }

    /* renamed from: e */
    public final int m22290e(int i) throws Z90 {
        if (i < 0) {
            throw Z90.m9499d();
        }
        int i2 = this.f36753i + this.f36751g + i;
        int i3 = this.f36754j;
        if (i2 > i3) {
            throw Z90.m9501f();
        }
        this.f36754j = i2;
        m22281C();
        return i3;
    }

    /* renamed from: f */
    public final boolean m22291f() {
        return m22305t() != 0;
    }

    /* renamed from: g */
    public final double m22292g() {
        return Double.longBitsToDouble(m22303r());
    }

    /* renamed from: h */
    public final int m22293h() {
        return m22304s();
    }

    /* renamed from: i */
    public final int m22294i() {
        return m22302q();
    }

    /* renamed from: j */
    public final long m22295j() {
        return m22303r();
    }

    /* renamed from: k */
    public final float m22296k() {
        return Float.intBitsToFloat(m22302q());
    }

    /* renamed from: l */
    public final int m22297l() {
        return m22304s();
    }

    /* renamed from: m */
    public final long m22298m() {
        return m22305t();
    }

    /* renamed from: n */
    public final byte[] m22299n(int i) throws IOException {
        byte[] bArrM22300o = m22300o(i);
        if (bArrM22300o != null) {
            return bArrM22300o;
        }
        int i2 = this.f36751g;
        int i3 = this.f36749e;
        int length = i3 - i2;
        this.f36753i += i3;
        this.f36751g = 0;
        this.f36749e = 0;
        ArrayList arrayListM22301p = m22301p(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f36748d, i2, bArr, 0, length);
        Iterator it = arrayListM22301p.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: o */
    public final byte[] m22300o(int i) throws IOException {
        if (i == 0) {
            return AbstractC11889z90.f46667b;
        }
        if (i < 0) {
            throw Z90.m9499d();
        }
        int i2 = this.f36753i;
        int i3 = this.f36751g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new Z90("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f36754j;
        if (i4 > i5) {
            m22284F((i5 - i2) - i3);
            throw Z90.m9501f();
        }
        int i6 = this.f36749e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.f36747c;
        if (i7 >= 4096 && i7 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f36748d, this.f36751g, bArr, 0, i6);
        this.f36753i += this.f36749e;
        this.f36751g = 0;
        this.f36749e = 0;
        while (i6 < i) {
            int i8 = fileInputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw Z90.m9501f();
            }
            this.f36753i += i8;
            i6 += i8;
        }
        return bArr;
    }

    /* renamed from: p */
    public final ArrayList m22301p(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f36747c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw Z90.m9501f();
                }
                this.f36753i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: q */
    public final int m22302q() throws Z90 {
        int i = this.f36751g;
        if (this.f36749e - i < 4) {
            m22282D(4);
            i = this.f36751g;
        }
        this.f36751g = i + 4;
        byte[] bArr = this.f36748d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: r */
    public final long m22303r() throws Z90 {
        int i = this.f36751g;
        if (this.f36749e - i < 8) {
            m22282D(8);
            i = this.f36751g;
        }
        this.f36751g = i + 8;
        byte[] bArr = this.f36748d;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: s */
    public final int m22304s() {
        int i;
        int i2 = this.f36751g;
        int i3 = this.f36749e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f36748d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f36751g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f36751g = i5;
                return i;
            }
        }
        return (int) m22306u();
    }

    /* renamed from: t */
    public final long m22305t() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f36751g;
        int i2 = this.f36749e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f36748d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f36751g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f36751g = i4;
                return j;
            }
        }
        return m22306u();
    }

    /* renamed from: u */
    public final long m22306u() throws Z90 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f36751g == this.f36749e) {
                m22282D(1);
            }
            int i2 = this.f36751g;
            this.f36751g = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.f36748d[i2] & 128) == 0) {
                return j;
            }
        }
        throw Z90.m9498c();
    }

    /* renamed from: v */
    public final int m22307v() {
        return m22302q();
    }

    /* renamed from: w */
    public final long m22308w() {
        return m22303r();
    }

    /* renamed from: x */
    public final int m22309x() {
        int iM22304s = m22304s();
        return (-(iM22304s & 1)) ^ (iM22304s >>> 1);
    }

    /* renamed from: y */
    public final long m22310y() {
        long jM22305t = m22305t();
        return (-(jM22305t & 1)) ^ (jM22305t >>> 1);
    }

    /* renamed from: z */
    public final int m22311z() throws Z90 {
        if (m22288c()) {
            this.f36752h = 0;
            return 0;
        }
        int iM22304s = m22304s();
        this.f36752h = iM22304s;
        if ((iM22304s >>> 3) != 0) {
            return iM22304s;
        }
        throw new Z90("Protocol message contained an invalid tag (zero).");
    }
}
