package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* renamed from: nj */
/* loaded from: classes2.dex */
public final class C6507nj implements InterfaceC0676Kj, InterfaceC0613Jj, Cloneable, ByteChannel {

    /* renamed from: a */
    public JX0 f38487a;

    /* renamed from: b */
    public long f38488b;

    /* renamed from: A */
    public final int m23174A(byte[] bArr, int i, int i2) {
        O90.m5968f(bArr, "sink");
        AbstractC1240Ti.m7729b(bArr.length, i, i2);
        JX0 jx0 = this.f38487a;
        if (jx0 == null) {
            return -1;
        }
        int iMin = Math.min(i2, jx0.f5581c - jx0.f5580b);
        int i3 = jx0.f5580b;
        AbstractC0576J8.m4181h(jx0.f5579a, i, i3, bArr, i3 + iMin);
        int i4 = jx0.f5580b + iMin;
        jx0.f5580b = i4;
        this.f38488b -= iMin;
        if (i4 == jx0.f5581c) {
            this.f38487a = jx0.m4339a();
            RX0.m7031a(jx0);
        }
        return iMin;
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: B */
    public final int mo4702B(C7778Iy0 c7778Iy0) throws EOFException {
        O90.m5968f(c7778Iy0, "options");
        int iM17810b = AbstractC3962e.m17810b(this, c7778Iy0, false);
        if (iM17810b == -1) {
            return -1;
        }
        m23185i0(c7778Iy0.f5235a[iM17810b].mo3983c());
        return iM17810b;
    }

    /* renamed from: D */
    public final C6318kj m23175D(C6318kj c6318kj) {
        O90.m5968f(c6318kj, "unsafeCursor");
        byte[] bArr = AbstractC3962e.f26471a;
        if (c6318kj == AbstractC1240Ti.f11470a) {
            c6318kj = new C6318kj();
        }
        if (c6318kj.f36632a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c6318kj.f36632a = this;
        c6318kj.f36633b = true;
        return c6318kj;
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) {
        O90.m5968f(c6507nj, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f38488b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c6507nj.mo2328c0(this, j);
        return j;
    }

    /* renamed from: J */
    public final byte m23176J() {
        if (this.f38488b == 0) {
            throw new EOFException();
        }
        JX0 jx0 = this.f38487a;
        O90.m5965c(jx0);
        int i = jx0.f5580b;
        int i2 = jx0.f5581c;
        int i3 = i + 1;
        byte b = jx0.f5579a[i];
        this.f38488b--;
        if (i3 == i2) {
            this.f38487a = jx0.m4339a();
            RX0.m7031a(jx0);
        } else {
            jx0.f5580b = i3;
        }
        return b;
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: K */
    public final long mo4703K(C6868t9 c6868t9) {
        long j = this.f38488b;
        if (j > 0) {
            c6868t9.mo2328c0(this, j);
        }
        return j;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: L */
    public final /* bridge */ /* synthetic */ InterfaceC0613Jj mo4391L(String str) {
        m23203x0(str);
        return this;
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: N */
    public final String mo4704N(Charset charset) {
        O90.m5968f(charset, "charset");
        return m23182d0(this.f38488b, charset);
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: O */
    public final /* bridge */ /* synthetic */ InterfaceC0613Jj mo4392O(byte[] bArr, int i, int i2) {
        m23194q0(bArr, i, i2);
        return this;
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: R */
    public final boolean mo4705R(long j) {
        return this.f38488b >= j;
    }

    /* renamed from: S */
    public final byte[] m23177S(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "byteCount: ").toString());
        }
        if (this.f38488b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        m23179W(bArr);
        return bArr;
    }

    /* renamed from: U */
    public final C0551Ik m23178U(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "byteCount: ").toString());
        }
        if (this.f38488b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C0551Ik(m23177S(j));
        }
        C0551Ik c0551IkM23187m0 = m23187m0((int) j);
        m23185i0(j);
        return c0551IkM23187m0;
    }

    /* renamed from: W */
    public final void m23179W(byte[] bArr) throws EOFException {
        O90.m5968f(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int iM23174A = m23174A(bArr, i, bArr.length - i);
            if (iM23174A == -1) {
                throw new EOFException();
            }
            i += iM23174A;
        }
    }

    /* renamed from: X */
    public final int m23180X() throws EOFException {
        if (this.f38488b < 4) {
            throw new EOFException();
        }
        JX0 jx0 = this.f38487a;
        O90.m5965c(jx0);
        int i = jx0.f5580b;
        int i2 = jx0.f5581c;
        if (i2 - i < 4) {
            return ((m23176J() & 255) << 24) | ((m23176J() & 255) << 16) | ((m23176J() & 255) << 8) | (m23176J() & 255);
        }
        byte[] bArr = jx0.f5579a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f38488b -= 4;
        if (i5 == i2) {
            this.f38487a = jx0.m4339a();
            RX0.m7031a(jx0);
        } else {
            jx0.f5580b = i5;
        }
        return i6;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: a0 */
    public final /* bridge */ /* synthetic */ InterfaceC0613Jj mo4393a0(byte[] bArr) {
        m23193p0(bArr);
        return this;
    }

    /* renamed from: b0 */
    public final short m23181b0() throws EOFException {
        if (this.f38488b < 2) {
            throw new EOFException();
        }
        JX0 jx0 = this.f38487a;
        O90.m5965c(jx0);
        int i = jx0.f5580b;
        int i2 = jx0.f5581c;
        if (i2 - i < 2) {
            return (short) (((m23176J() & 255) << 8) | (m23176J() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = jx0.f5579a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f38488b -= 2;
        if (i5 == i2) {
            this.f38487a = jx0.m4339a();
            RX0.m7031a(jx0);
        } else {
            jx0.f5580b = i5;
        }
        return (short) i6;
    }

    @Override // p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) {
        JX0 jx0M7032b;
        O90.m5968f(c6507nj, "source");
        if (c6507nj == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1240Ti.m7729b(c6507nj.f38488b, 0L, j);
        while (j > 0) {
            JX0 jx0 = c6507nj.f38487a;
            O90.m5965c(jx0);
            int i = jx0.f5581c;
            JX0 jx02 = c6507nj.f38487a;
            O90.m5965c(jx02);
            long j2 = i - jx02.f5580b;
            int i2 = 0;
            if (j < j2) {
                JX0 jx03 = this.f38487a;
                JX0 jx04 = jx03 != null ? jx03.f5585g : null;
                if (jx04 != null && jx04.f5583e) {
                    if ((jx04.f5581c + j) - (jx04.f5582d ? 0 : jx04.f5580b) <= 8192) {
                        JX0 jx05 = c6507nj.f38487a;
                        O90.m5965c(jx05);
                        jx05.m4342d(jx04, (int) j);
                        c6507nj.f38488b -= j;
                        this.f38488b += j;
                        return;
                    }
                }
                JX0 jx06 = c6507nj.f38487a;
                O90.m5965c(jx06);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > jx06.f5581c - jx06.f5580b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    jx0M7032b = jx06.m4341c();
                } else {
                    jx0M7032b = RX0.m7032b();
                    int i4 = jx06.f5580b;
                    AbstractC0576J8.m4181h(jx06.f5579a, 0, i4, jx0M7032b.f5579a, i4 + i3);
                }
                jx0M7032b.f5581c = jx0M7032b.f5580b + i3;
                jx06.f5580b += i3;
                JX0 jx07 = jx06.f5585g;
                O90.m5965c(jx07);
                jx07.m4340b(jx0M7032b);
                c6507nj.f38487a = jx0M7032b;
            }
            JX0 jx08 = c6507nj.f38487a;
            O90.m5965c(jx08);
            long j3 = jx08.f5581c - jx08.f5580b;
            c6507nj.f38487a = jx08.m4339a();
            JX0 jx09 = this.f38487a;
            if (jx09 == null) {
                this.f38487a = jx08;
                jx08.f5585g = jx08;
                jx08.f5584f = jx08;
            } else {
                JX0 jx010 = jx09.f5585g;
                O90.m5965c(jx010);
                jx010.m4340b(jx08);
                JX0 jx011 = jx08.f5585g;
                if (jx011 == jx08) {
                    throw new IllegalStateException("cannot compact");
                }
                O90.m5965c(jx011);
                if (jx011.f5583e) {
                    int i5 = jx08.f5581c - jx08.f5580b;
                    JX0 jx012 = jx08.f5585g;
                    O90.m5965c(jx012);
                    int i6 = 8192 - jx012.f5581c;
                    JX0 jx013 = jx08.f5585g;
                    O90.m5965c(jx013);
                    if (!jx013.f5582d) {
                        JX0 jx014 = jx08.f5585g;
                        O90.m5965c(jx014);
                        i2 = jx014.f5580b;
                    }
                    if (i5 <= i6 + i2) {
                        JX0 jx015 = jx08.f5585g;
                        O90.m5965c(jx015);
                        jx08.m4342d(jx015, i5);
                        jx08.m4339a();
                        RX0.m7031a(jx08);
                    }
                }
            }
            c6507nj.f38488b -= j3;
            this.f38488b += j3;
            j -= j3;
        }
    }

    /* renamed from: d0 */
    public final String m23182d0(long j, Charset charset) throws EOFException {
        O90.m5968f(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "byteCount: ").toString());
        }
        if (this.f38488b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        JX0 jx0 = this.f38487a;
        O90.m5965c(jx0);
        int i = jx0.f5580b;
        if (i + j > jx0.f5581c) {
            return new String(m23177S(j), charset);
        }
        int i2 = (int) j;
        String str = new String(jx0.f5579a, i, i2, charset);
        int i3 = jx0.f5580b + i2;
        jx0.f5580b = i3;
        this.f38488b -= j;
        if (i3 == jx0.f5581c) {
            this.f38487a = jx0.m4339a();
            RX0.m7031a(jx0);
        }
        return str;
    }

    /* renamed from: e0 */
    public final String m23183e0() {
        return m23182d0(this.f38488b, AbstractC7038vr.f44561a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6507nj) {
                long j = this.f38488b;
                C6507nj c6507nj = (C6507nj) obj;
                if (j == c6507nj.f38488b) {
                    if (j != 0) {
                        JX0 jx0 = this.f38487a;
                        O90.m5965c(jx0);
                        JX0 jx02 = c6507nj.f38487a;
                        O90.m5965c(jx02);
                        int i = jx0.f5580b;
                        int i2 = jx02.f5580b;
                        long j2 = 0;
                        while (j2 < this.f38488b) {
                            long jMin = Math.min(jx0.f5581c - i, jx02.f5581c - i2);
                            long j3 = 0;
                            while (j3 < jMin) {
                                int i3 = i + 1;
                                byte b = jx0.f5579a[i];
                                int i4 = i2 + 1;
                                if (b == jx02.f5579a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == jx0.f5581c) {
                                JX0 jx03 = jx0.f5584f;
                                O90.m5965c(jx03);
                                i = jx03.f5580b;
                                jx0 = jx03;
                            }
                            if (i2 == jx02.f5581c) {
                                jx02 = jx02.f5584f;
                                O90.m5965c(jx02);
                                i2 = jx02.f5580b;
                            }
                            j2 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: f0 */
    public final /* bridge */ /* synthetic */ InterfaceC0613Jj mo4394f0(long j) {
        m23196s0(j);
        return this;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: g0 */
    public final OutputStream mo4395g0() {
        return new C6444mj(this, 0);
    }

    /* renamed from: h0 */
    public final int m23184h0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f38488b == 0) {
            throw new EOFException();
        }
        byte bM23202x = m23202x(0L);
        if ((bM23202x & 128) == 0) {
            i = bM23202x & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bM23202x & 224) == 192) {
            i = bM23202x & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM23202x & 240) == 224) {
            i = bM23202x & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM23202x & 248) != 240) {
                m23185i0(1L);
                return 65533;
            }
            i = bM23202x & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f38488b < j) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i2, "size < ", ": ");
            sbM26237n.append(this.f38488b);
            sbM26237n.append(" (to read code point prefixed 0x");
            sbM26237n.append(AbstractC1240Ti.m7732e(bM23202x));
            sbM26237n.append(')');
            throw new EOFException(sbM26237n.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM23202x2 = m23202x(j2);
            if ((bM23202x2 & 192) != 128) {
                m23185i0(j2);
                return 65533;
            }
            i = (i << 6) | (bM23202x2 & 63);
        }
        m23185i0(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final int hashCode() {
        JX0 jx0 = this.f38487a;
        if (jx0 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jx0.f5581c;
            for (int i3 = jx0.f5580b; i3 < i2; i3++) {
                i = (i * 31) + jx0.f5579a[i3];
            }
            jx0 = jx0.f5584f;
            O90.m5965c(jx0);
        } while (jx0 != this.f38487a);
        return i;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: i */
    public final long mo4396i(U21 u21) {
        O90.m5968f(u21, "source");
        long j = 0;
        while (true) {
            long jMo96H = u21.mo96H(this, 8192L);
            if (jMo96H == -1) {
                return j;
            }
            j += jMo96H;
        }
    }

    /* renamed from: i0 */
    public final void m23185i0(long j) throws EOFException {
        while (j > 0) {
            JX0 jx0 = this.f38487a;
            if (jx0 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, jx0.f5581c - jx0.f5580b);
            long j2 = iMin;
            this.f38488b -= j2;
            j -= j2;
            int i = jx0.f5580b + iMin;
            jx0.f5580b = i;
            if (i == jx0.f5581c) {
                this.f38487a = jx0.m4339a();
                RX0.m7031a(jx0);
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC0613Jj mo4397k(int i) {
        m23195r0(i);
        return this;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: k0 */
    public final /* bridge */ /* synthetic */ InterfaceC0613Jj mo4398k0(C0551Ik c0551Ik) {
        m23191o0(c0551Ik);
        return this;
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: l0 */
    public final InputStream mo4706l0() {
        return new C6381lj(this, 0);
    }

    /* renamed from: m */
    public final void m23186m() throws EOFException {
        m23185i0(this.f38488b);
    }

    /* renamed from: m0 */
    public final C0551Ik m23187m0(int i) {
        if (i == 0) {
            return C0551Ik.f5116d;
        }
        AbstractC1240Ti.m7729b(this.f38488b, 0L, i);
        JX0 jx0 = this.f38487a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            O90.m5965c(jx0);
            int i5 = jx0.f5581c;
            int i6 = jx0.f5580b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            jx0 = jx0.f5584f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        JX0 jx02 = this.f38487a;
        int i7 = 0;
        while (i2 < i) {
            O90.m5965c(jx02);
            bArr[i7] = jx02.f5579a;
            i2 += jx02.f5581c - jx02.f5580b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = jx02.f5580b;
            jx02.f5582d = true;
            i7++;
            jx02 = jx02.f5584f;
        }
        return new SX0(bArr, iArr);
    }

    /* renamed from: n */
    public final C6507nj clone() {
        C6507nj c6507nj = new C6507nj();
        if (this.f38488b != 0) {
            JX0 jx0 = this.f38487a;
            O90.m5965c(jx0);
            JX0 jx0M4341c = jx0.m4341c();
            c6507nj.f38487a = jx0M4341c;
            jx0M4341c.f5585g = jx0M4341c;
            jx0M4341c.f5584f = jx0M4341c;
            for (JX0 jx02 = jx0.f5584f; jx02 != jx0; jx02 = jx02.f5584f) {
                JX0 jx03 = jx0M4341c.f5585g;
                O90.m5965c(jx03);
                O90.m5965c(jx02);
                jx03.m4340b(jx02.m4341c());
            }
            c6507nj.f38488b = this.f38488b;
        }
        return c6507nj;
    }

    /* renamed from: n0 */
    public final JX0 m23189n0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        JX0 jx0 = this.f38487a;
        if (jx0 == null) {
            JX0 jx0M7032b = RX0.m7032b();
            this.f38487a = jx0M7032b;
            jx0M7032b.f5585g = jx0M7032b;
            jx0M7032b.f5584f = jx0M7032b;
            return jx0M7032b;
        }
        JX0 jx02 = jx0.f5585g;
        O90.m5965c(jx02);
        if (jx02.f5581c + i <= 8192 && jx02.f5583e) {
            return jx02;
        }
        JX0 jx0M7032b2 = RX0.m7032b();
        jx02.m4340b(jx0M7032b2);
        return jx0M7032b2;
    }

    /* renamed from: o */
    public final long m23190o() {
        long j = this.f38488b;
        if (j == 0) {
            return 0L;
        }
        JX0 jx0 = this.f38487a;
        O90.m5965c(jx0);
        JX0 jx02 = jx0.f5585g;
        O90.m5965c(jx02);
        if (jx02.f5581c < 8192 && jx02.f5583e) {
            j -= r3 - jx02.f5580b;
        }
        return j;
    }

    /* renamed from: o0 */
    public final void m23191o0(C0551Ik c0551Ik) {
        O90.m5968f(c0551Ik, "byteString");
        c0551Ik.mo3992l(this, c0551Ik.mo3983c());
    }

    /* renamed from: p */
    public final void m23192p(C6507nj c6507nj, long j, long j2) {
        O90.m5968f(c6507nj, "out");
        AbstractC1240Ti.m7729b(this.f38488b, j, j2);
        if (j2 == 0) {
            return;
        }
        c6507nj.f38488b += j2;
        JX0 jx0 = this.f38487a;
        while (true) {
            O90.m5965c(jx0);
            long j3 = jx0.f5581c - jx0.f5580b;
            if (j < j3) {
                break;
            }
            j -= j3;
            jx0 = jx0.f5584f;
        }
        while (j2 > 0) {
            O90.m5965c(jx0);
            JX0 jx0M4341c = jx0.m4341c();
            int i = jx0M4341c.f5580b + ((int) j);
            jx0M4341c.f5580b = i;
            jx0M4341c.f5581c = Math.min(i + ((int) j2), jx0M4341c.f5581c);
            JX0 jx02 = c6507nj.f38487a;
            if (jx02 == null) {
                jx0M4341c.f5585g = jx0M4341c;
                jx0M4341c.f5584f = jx0M4341c;
                c6507nj.f38487a = jx0M4341c;
            } else {
                JX0 jx03 = jx02.f5585g;
                O90.m5965c(jx03);
                jx03.m4340b(jx0M4341c);
            }
            j2 -= jx0M4341c.f5581c - jx0M4341c.f5580b;
            jx0 = jx0.f5584f;
            j = 0;
        }
    }

    /* renamed from: p0 */
    public final void m23193p0(byte[] bArr) {
        O90.m5968f(bArr, "source");
        m23194q0(bArr, 0, bArr.length);
    }

    /* renamed from: q0 */
    public final void m23194q0(byte[] bArr, int i, int i2) {
        O90.m5968f(bArr, "source");
        long j = i2;
        AbstractC1240Ti.m7729b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            JX0 jx0M23189n0 = m23189n0(1);
            int iMin = Math.min(i3 - i, 8192 - jx0M23189n0.f5581c);
            int i4 = i + iMin;
            AbstractC0576J8.m4181h(bArr, jx0M23189n0.f5581c, i, jx0M23189n0.f5579a, i4);
            jx0M23189n0.f5581c += iMin;
            i = i4;
        }
        this.f38488b += j;
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return C7523Ea1.f2789d;
    }

    /* renamed from: r0 */
    public final void m23195r0(int i) {
        JX0 jx0M23189n0 = m23189n0(1);
        int i2 = jx0M23189n0.f5581c;
        jx0M23189n0.f5581c = i2 + 1;
        jx0M23189n0.f5579a[i2] = (byte) i;
        this.f38488b++;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        O90.m5968f(byteBuffer, "sink");
        JX0 jx0 = this.f38487a;
        if (jx0 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), jx0.f5581c - jx0.f5580b);
        byteBuffer.put(jx0.f5579a, jx0.f5580b, iMin);
        int i = jx0.f5580b + iMin;
        jx0.f5580b = i;
        this.f38488b -= iMin;
        if (i == jx0.f5581c) {
            this.f38487a = jx0.m4339a();
            RX0.m7031a(jx0);
        }
        return iMin;
    }

    /* renamed from: s0 */
    public final void m23196s0(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            m23195r0(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m23203x0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        JX0 jx0M23189n0 = m23189n0(i);
        int i2 = jx0M23189n0.f5581c + i;
        while (true) {
            bArr = jx0M23189n0.f5579a;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC3962e.f26471a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        jx0M23189n0.f5581c += i;
        this.f38488b += i;
    }

    /* renamed from: t0 */
    public final void m23197t0(long j) {
        if (j == 0) {
            m23195r0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        JX0 jx0M23189n0 = m23189n0(i);
        int i2 = jx0M23189n0.f5581c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            jx0M23189n0.f5579a[i3] = AbstractC3962e.f26471a[(int) (15 & j)];
            j >>>= 4;
        }
        jx0M23189n0.f5581c += i;
        this.f38488b += i;
    }

    public final String toString() {
        long j = this.f38488b;
        if (j <= 2147483647L) {
            return m23187m0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f38488b).toString());
    }

    /* renamed from: u0 */
    public final void m23198u0(int i) {
        JX0 jx0M23189n0 = m23189n0(4);
        int i2 = jx0M23189n0.f5581c;
        byte b = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = jx0M23189n0.f5579a;
        bArr[i2] = b;
        bArr[i2 + 1] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        jx0M23189n0.f5581c = i2 + 4;
        this.f38488b += 4;
    }

    /* renamed from: v0 */
    public final void m23199v0(int i) {
        JX0 jx0M23189n0 = m23189n0(2);
        int i2 = jx0M23189n0.f5581c;
        byte b = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = jx0M23189n0.f5579a;
        bArr[i2] = b;
        bArr[i2 + 1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        jx0M23189n0.f5581c = i2 + 2;
        this.f38488b += 2;
    }

    /* renamed from: w */
    public final boolean m23200w() {
        return this.f38488b == 0;
    }

    /* renamed from: w0 */
    public final void m23201w0(int i, int i2, String str) {
        char cCharAt;
        O90.m5968f(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC7222ym.m26229f(i2, "endIndex < beginIndex: ", i, " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i2, "endIndex > string.length: ", " > ");
            sbM26237n.append(str.length());
            throw new IllegalArgumentException(sbM26237n.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                JX0 jx0M23189n0 = m23189n0(1);
                int i3 = jx0M23189n0.f5581c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = jx0M23189n0.f5579a;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = jx0M23189n0.f5581c;
                int i6 = (i3 + i) - i5;
                jx0M23189n0.f5581c = i5 + i6;
                this.f38488b += i6;
            } else {
                if (cCharAt2 < 2048) {
                    JX0 jx0M23189n02 = m23189n0(2);
                    int i7 = jx0M23189n02.f5581c;
                    byte[] bArr2 = jx0M23189n02.f5579a;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    jx0M23189n02.f5581c = i7 + 2;
                    this.f38488b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    JX0 jx0M23189n03 = m23189n0(3);
                    int i8 = jx0M23189n03.f5581c;
                    byte[] bArr3 = jx0M23189n03.f5579a;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    jx0M23189n03.f5581c = i8 + 3;
                    this.f38488b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m23195r0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        JX0 jx0M23189n04 = m23189n0(4);
                        int i11 = jx0M23189n04.f5581c;
                        byte[] bArr4 = jx0M23189n04.f5579a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        jx0M23189n04.f5581c = i11 + 4;
                        this.f38488b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        O90.m5968f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            JX0 jx0M23189n0 = m23189n0(1);
            int iMin = Math.min(i, 8192 - jx0M23189n0.f5581c);
            byteBuffer.get(jx0M23189n0.f5579a, jx0M23189n0.f5581c, iMin);
            i -= iMin;
            jx0M23189n0.f5581c += iMin;
        }
        this.f38488b += iRemaining;
        return iRemaining;
    }

    /* renamed from: x */
    public final byte m23202x(long j) {
        AbstractC1240Ti.m7729b(this.f38488b, j, 1L);
        JX0 jx0 = this.f38487a;
        if (jx0 == null) {
            O90.m5965c(null);
            throw null;
        }
        long j2 = this.f38488b;
        if (j2 - j < j) {
            while (j2 > j) {
                jx0 = jx0.f5585g;
                O90.m5965c(jx0);
                j2 -= jx0.f5581c - jx0.f5580b;
            }
            return jx0.f5579a[(int) ((jx0.f5580b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = jx0.f5581c;
            int i2 = jx0.f5580b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return jx0.f5579a[(int) ((i2 + j) - j3)];
            }
            jx0 = jx0.f5584f;
            O90.m5965c(jx0);
            j3 = j4;
        }
    }

    /* renamed from: x0 */
    public final void m23203x0(String str) {
        O90.m5968f(str, "string");
        m23201w0(0, str.length(), str);
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: y */
    public final byte[] mo4708y() {
        return m23177S(this.f38488b);
    }

    /* renamed from: y0 */
    public final void m23204y0(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            m23195r0(i);
            return;
        }
        if (i < 2048) {
            JX0 jx0M23189n0 = m23189n0(2);
            int i3 = jx0M23189n0.f5581c;
            byte[] bArr = jx0M23189n0.f5579a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            jx0M23189n0.f5581c = i3 + 2;
            this.f38488b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m23195r0(63);
            return;
        }
        if (i < 65536) {
            JX0 jx0M23189n02 = m23189n0(3);
            int i4 = jx0M23189n02.f5581c;
            byte[] bArr2 = jx0M23189n02.f5579a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            jx0M23189n02.f5581c = i4 + 3;
            this.f38488b += 3;
            return;
        }
        if (i <= 1114111) {
            JX0 jx0M23189n03 = m23189n0(4);
            int i5 = jx0M23189n03.f5581c;
            byte[] bArr3 = jx0M23189n03.f5579a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            jx0M23189n03.f5581c = i5 + 4;
            this.f38488b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = AbstractC1141S8.f10591a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            if (i2 < 0) {
                throw new IndexOutOfBoundsException(AbstractC7222ym.m26230g(i2, "startIndex: ", ", endIndex: 8, size: 8"));
            }
            if (i2 > 8) {
                throw new IllegalArgumentException(AbstractC7222ym.m26230g(i2, "startIndex: ", " > endIndex: 8"));
            }
            str = new String(cArr2, i2, 8 - i2);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.Z11
    public final void close() {
    }

    @Override // p000.Z11, java.io.Flushable
    public final void flush() {
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: v */
    public final C6507nj mo4707v() {
        return this;
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: z */
    public final C6507nj mo4709z() {
        return this;
    }
}
