package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* renamed from: nj */
/* loaded from: classes2.dex */
public final class C6129nj implements InterfaceC0827Kj, InterfaceC0749Jj, Cloneable, ByteChannel {
    public JX0 a;
    public long b;

    public final int A(byte[] bArr, int i, int i2) {
        O90.f(bArr, "sink");
        AbstractC1525Ti.b(bArr.length, i, i2);
        JX0 jx0 = this.a;
        if (jx0 == null) {
            return -1;
        }
        int iMin = Math.min(i2, jx0.c - jx0.b);
        int i3 = jx0.b;
        J8.h(jx0.a, i, i3, bArr, i3 + iMin);
        int i4 = jx0.b + iMin;
        jx0.b = i4;
        this.b -= iMin;
        if (i4 == jx0.c) {
            this.a = jx0.a();
            RX0.a(jx0);
        }
        return iMin;
    }

    @Override // defpackage.InterfaceC0827Kj
    public final int B(C0717Iy0 c0717Iy0) throws EOFException {
        O90.f(c0717Iy0, "options");
        int iB = AbstractC3494e.b(this, c0717Iy0, false);
        if (iB == -1) {
            return -1;
        }
        i0(c0717Iy0.a[iB].c());
        return iB;
    }

    public final C5556kj D(C5556kj c5556kj) {
        O90.f(c5556kj, "unsafeCursor");
        byte[] bArr = AbstractC3494e.a;
        if (c5556kj == AbstractC1525Ti.a) {
            c5556kj = new C5556kj();
        }
        if (c5556kj.a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c5556kj.a = this;
        c5556kj.b = true;
        return c5556kj;
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) {
        O90.f(c6129nj, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(NX.g(j, "byteCount < 0: ").toString());
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c6129nj.c0(this, j);
        return j;
    }

    public final byte J() {
        if (this.b == 0) {
            throw new EOFException();
        }
        JX0 jx0 = this.a;
        O90.c(jx0);
        int i = jx0.b;
        int i2 = jx0.c;
        int i3 = i + 1;
        byte b = jx0.a[i];
        this.b--;
        if (i3 == i2) {
            this.a = jx0.a();
            RX0.a(jx0);
        } else {
            jx0.b = i3;
        }
        return b;
    }

    @Override // defpackage.InterfaceC0827Kj
    public final long K(C7166t9 c7166t9) {
        long j = this.b;
        if (j > 0) {
            c7166t9.c0(this, j);
        }
        return j;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final /* bridge */ /* synthetic */ InterfaceC0749Jj L(String str) {
        x0(str);
        return this;
    }

    @Override // defpackage.InterfaceC0827Kj
    public final String N(Charset charset) {
        O90.f(charset, "charset");
        return d0(this.b, charset);
    }

    @Override // defpackage.InterfaceC0749Jj
    public final /* bridge */ /* synthetic */ InterfaceC0749Jj O(byte[] bArr, int i, int i2) {
        q0(bArr, i, i2);
        return this;
    }

    @Override // defpackage.InterfaceC0827Kj
    public final boolean R(long j) {
        return this.b >= j;
    }

    public final byte[] S(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(NX.g(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        W(bArr);
        return bArr;
    }

    public final C0674Ik U(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(NX.g(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C0674Ik(S(j));
        }
        C0674Ik c0674IkM0 = m0((int) j);
        i0(j);
        return c0674IkM0;
    }

    public final void W(byte[] bArr) throws EOFException {
        O90.f(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int iA = A(bArr, i, bArr.length - i);
            if (iA == -1) {
                throw new EOFException();
            }
            i += iA;
        }
    }

    public final int X() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        JX0 jx0 = this.a;
        O90.c(jx0);
        int i = jx0.b;
        int i2 = jx0.c;
        if (i2 - i < 4) {
            return ((J() & 255) << 24) | ((J() & 255) << 16) | ((J() & 255) << 8) | (J() & 255);
        }
        byte[] bArr = jx0.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.b -= 4;
        if (i5 == i2) {
            this.a = jx0.a();
            RX0.a(jx0);
        } else {
            jx0.b = i5;
        }
        return i6;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final /* bridge */ /* synthetic */ InterfaceC0749Jj a0(byte[] bArr) {
        p0(bArr);
        return this;
    }

    public final short b0() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        JX0 jx0 = this.a;
        O90.c(jx0);
        int i = jx0.b;
        int i2 = jx0.c;
        if (i2 - i < 2) {
            return (short) (((J() & 255) << 8) | (J() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = jx0.a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = jx0.a();
            RX0.a(jx0);
        } else {
            jx0.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) {
        JX0 jx0B;
        O90.f(c6129nj, "source");
        if (c6129nj == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1525Ti.b(c6129nj.b, 0L, j);
        while (j > 0) {
            JX0 jx0 = c6129nj.a;
            O90.c(jx0);
            int i = jx0.c;
            JX0 jx02 = c6129nj.a;
            O90.c(jx02);
            long j2 = i - jx02.b;
            int i2 = 0;
            if (j < j2) {
                JX0 jx03 = this.a;
                JX0 jx04 = jx03 != null ? jx03.g : null;
                if (jx04 != null && jx04.e) {
                    if ((jx04.c + j) - (jx04.d ? 0 : jx04.b) <= 8192) {
                        JX0 jx05 = c6129nj.a;
                        O90.c(jx05);
                        jx05.d(jx04, (int) j);
                        c6129nj.b -= j;
                        this.b += j;
                        return;
                    }
                }
                JX0 jx06 = c6129nj.a;
                O90.c(jx06);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > jx06.c - jx06.b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    jx0B = jx06.c();
                } else {
                    jx0B = RX0.b();
                    int i4 = jx06.b;
                    J8.h(jx06.a, 0, i4, jx0B.a, i4 + i3);
                }
                jx0B.c = jx0B.b + i3;
                jx06.b += i3;
                JX0 jx07 = jx06.g;
                O90.c(jx07);
                jx07.b(jx0B);
                c6129nj.a = jx0B;
            }
            JX0 jx08 = c6129nj.a;
            O90.c(jx08);
            long j3 = jx08.c - jx08.b;
            c6129nj.a = jx08.a();
            JX0 jx09 = this.a;
            if (jx09 == null) {
                this.a = jx08;
                jx08.g = jx08;
                jx08.f = jx08;
            } else {
                JX0 jx010 = jx09.g;
                O90.c(jx010);
                jx010.b(jx08);
                JX0 jx011 = jx08.g;
                if (jx011 == jx08) {
                    throw new IllegalStateException("cannot compact");
                }
                O90.c(jx011);
                if (jx011.e) {
                    int i5 = jx08.c - jx08.b;
                    JX0 jx012 = jx08.g;
                    O90.c(jx012);
                    int i6 = 8192 - jx012.c;
                    JX0 jx013 = jx08.g;
                    O90.c(jx013);
                    if (!jx013.d) {
                        JX0 jx014 = jx08.g;
                        O90.c(jx014);
                        i2 = jx014.b;
                    }
                    if (i5 <= i6 + i2) {
                        JX0 jx015 = jx08.g;
                        O90.c(jx015);
                        jx08.d(jx015, i5);
                        jx08.a();
                        RX0.a(jx08);
                    }
                }
            }
            c6129nj.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    public final String d0(long j, Charset charset) throws EOFException {
        O90.f(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(NX.g(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        JX0 jx0 = this.a;
        O90.c(jx0);
        int i = jx0.b;
        if (i + j > jx0.c) {
            return new String(S(j), charset);
        }
        int i2 = (int) j;
        String str = new String(jx0.a, i, i2, charset);
        int i3 = jx0.b + i2;
        jx0.b = i3;
        this.b -= j;
        if (i3 == jx0.c) {
            this.a = jx0.a();
            RX0.a(jx0);
        }
        return str;
    }

    public final String e0() {
        return d0(this.b, AbstractC7680vr.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6129nj) {
                long j = this.b;
                C6129nj c6129nj = (C6129nj) obj;
                if (j == c6129nj.b) {
                    if (j != 0) {
                        JX0 jx0 = this.a;
                        O90.c(jx0);
                        JX0 jx02 = c6129nj.a;
                        O90.c(jx02);
                        int i = jx0.b;
                        int i2 = jx02.b;
                        long j2 = 0;
                        while (j2 < this.b) {
                            long jMin = Math.min(jx0.c - i, jx02.c - i2);
                            long j3 = 0;
                            while (j3 < jMin) {
                                int i3 = i + 1;
                                byte b = jx0.a[i];
                                int i4 = i2 + 1;
                                if (b == jx02.a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == jx0.c) {
                                JX0 jx03 = jx0.f;
                                O90.c(jx03);
                                i = jx03.b;
                                jx0 = jx03;
                            }
                            if (i2 == jx02.c) {
                                jx02 = jx02.f;
                                O90.c(jx02);
                                i2 = jx02.b;
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

    @Override // defpackage.InterfaceC0749Jj
    public final /* bridge */ /* synthetic */ InterfaceC0749Jj f0(long j) {
        s0(j);
        return this;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final OutputStream g0() {
        return new C5938mj(this, 0);
    }

    public final int h0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            throw new EOFException();
        }
        byte bX = x(0L);
        if ((bX & 128) == 0) {
            i = bX & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bX & 224) == 192) {
            i = bX & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bX & 240) == 224) {
            i = bX & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bX & 248) != 240) {
                i0(1L);
                return 65533;
            }
            i = bX & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder sbN = AbstractC8235ym.n(i2, "size < ", ": ");
            sbN.append(this.b);
            sbN.append(" (to read code point prefixed 0x");
            sbN.append(AbstractC1525Ti.e(bX));
            sbN.append(')');
            throw new EOFException(sbN.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bX2 = x(j2);
            if ((bX2 & 192) != 128) {
                i0(j2);
                return 65533;
            }
            i = (i << 6) | (bX2 & 63);
        }
        i0(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final int hashCode() {
        JX0 jx0 = this.a;
        if (jx0 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jx0.c;
            for (int i3 = jx0.b; i3 < i2; i3++) {
                i = (i * 31) + jx0.a[i3];
            }
            jx0 = jx0.f;
            O90.c(jx0);
        } while (jx0 != this.a);
        return i;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final long i(U21 u21) {
        O90.f(u21, "source");
        long j = 0;
        while (true) {
            long jH = u21.H(this, 8192L);
            if (jH == -1) {
                return j;
            }
            j += jH;
        }
    }

    public final void i0(long j) throws EOFException {
        while (j > 0) {
            JX0 jx0 = this.a;
            if (jx0 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, jx0.c - jx0.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = jx0.b + iMin;
            jx0.b = i;
            if (i == jx0.c) {
                this.a = jx0.a();
                RX0.a(jx0);
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final /* bridge */ /* synthetic */ InterfaceC0749Jj k(int i) {
        r0(i);
        return this;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final /* bridge */ /* synthetic */ InterfaceC0749Jj k0(C0674Ik c0674Ik) {
        o0(c0674Ik);
        return this;
    }

    @Override // defpackage.InterfaceC0827Kj
    public final InputStream l0() {
        return new C5747lj(this, 0);
    }

    public final void m() throws EOFException {
        i0(this.b);
    }

    public final C0674Ik m0(int i) {
        if (i == 0) {
            return C0674Ik.d;
        }
        AbstractC1525Ti.b(this.b, 0L, i);
        JX0 jx0 = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            O90.c(jx0);
            int i5 = jx0.c;
            int i6 = jx0.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            jx0 = jx0.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        JX0 jx02 = this.a;
        int i7 = 0;
        while (i2 < i) {
            O90.c(jx02);
            bArr[i7] = jx02.a;
            i2 += jx02.c - jx02.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = jx02.b;
            jx02.d = true;
            i7++;
            jx02 = jx02.f;
        }
        return new SX0(bArr, iArr);
    }

    /* renamed from: n */
    public final C6129nj clone() {
        C6129nj c6129nj = new C6129nj();
        if (this.b != 0) {
            JX0 jx0 = this.a;
            O90.c(jx0);
            JX0 jx0C = jx0.c();
            c6129nj.a = jx0C;
            jx0C.g = jx0C;
            jx0C.f = jx0C;
            for (JX0 jx02 = jx0.f; jx02 != jx0; jx02 = jx02.f) {
                JX0 jx03 = jx0C.g;
                O90.c(jx03);
                O90.c(jx02);
                jx03.b(jx02.c());
            }
            c6129nj.b = this.b;
        }
        return c6129nj;
    }

    public final JX0 n0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        JX0 jx0 = this.a;
        if (jx0 == null) {
            JX0 jx0B = RX0.b();
            this.a = jx0B;
            jx0B.g = jx0B;
            jx0B.f = jx0B;
            return jx0B;
        }
        JX0 jx02 = jx0.g;
        O90.c(jx02);
        if (jx02.c + i <= 8192 && jx02.e) {
            return jx02;
        }
        JX0 jx0B2 = RX0.b();
        jx02.b(jx0B2);
        return jx0B2;
    }

    public final long o() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        JX0 jx0 = this.a;
        O90.c(jx0);
        JX0 jx02 = jx0.g;
        O90.c(jx02);
        if (jx02.c < 8192 && jx02.e) {
            j -= r3 - jx02.b;
        }
        return j;
    }

    public final void o0(C0674Ik c0674Ik) {
        O90.f(c0674Ik, "byteString");
        c0674Ik.l(this, c0674Ik.c());
    }

    public final void p(C6129nj c6129nj, long j, long j2) {
        O90.f(c6129nj, "out");
        AbstractC1525Ti.b(this.b, j, j2);
        if (j2 == 0) {
            return;
        }
        c6129nj.b += j2;
        JX0 jx0 = this.a;
        while (true) {
            O90.c(jx0);
            long j3 = jx0.c - jx0.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            jx0 = jx0.f;
        }
        while (j2 > 0) {
            O90.c(jx0);
            JX0 jx0C = jx0.c();
            int i = jx0C.b + ((int) j);
            jx0C.b = i;
            jx0C.c = Math.min(i + ((int) j2), jx0C.c);
            JX0 jx02 = c6129nj.a;
            if (jx02 == null) {
                jx0C.g = jx0C;
                jx0C.f = jx0C;
                c6129nj.a = jx0C;
            } else {
                JX0 jx03 = jx02.g;
                O90.c(jx03);
                jx03.b(jx0C);
            }
            j2 -= jx0C.c - jx0C.b;
            jx0 = jx0.f;
            j = 0;
        }
    }

    public final void p0(byte[] bArr) {
        O90.f(bArr, "source");
        q0(bArr, 0, bArr.length);
    }

    public final void q0(byte[] bArr, int i, int i2) {
        O90.f(bArr, "source");
        long j = i2;
        AbstractC1525Ti.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            JX0 jx0N0 = n0(1);
            int iMin = Math.min(i3 - i, 8192 - jx0N0.c);
            int i4 = i + iMin;
            J8.h(bArr, jx0N0.c, i, jx0N0.a, i4);
            jx0N0.c += iMin;
            i = i4;
        }
        this.b += j;
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return C0334Ea1.d;
    }

    public final void r0(int i) {
        JX0 jx0N0 = n0(1);
        int i2 = jx0N0.c;
        jx0N0.c = i2 + 1;
        jx0N0.a[i2] = (byte) i;
        this.b++;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        O90.f(byteBuffer, "sink");
        JX0 jx0 = this.a;
        if (jx0 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), jx0.c - jx0.b);
        byteBuffer.put(jx0.a, jx0.b, iMin);
        int i = jx0.b + iMin;
        jx0.b = i;
        this.b -= iMin;
        if (i == jx0.c) {
            this.a = jx0.a();
            RX0.a(jx0);
        }
        return iMin;
    }

    public final void s0(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            r0(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                x0("-9223372036854775808");
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
        JX0 jx0N0 = n0(i);
        int i2 = jx0N0.c + i;
        while (true) {
            bArr = jx0N0.a;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC3494e.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        jx0N0.c += i;
        this.b += i;
    }

    public final void t0(long j) {
        if (j == 0) {
            r0(48);
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
        JX0 jx0N0 = n0(i);
        int i2 = jx0N0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            jx0N0.a[i3] = AbstractC3494e.a[(int) (15 & j)];
            j >>>= 4;
        }
        jx0N0.c += i;
        this.b += i;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return m0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final void u0(int i) {
        JX0 jx0N0 = n0(4);
        int i2 = jx0N0.c;
        byte b = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = jx0N0.a;
        bArr[i2] = b;
        bArr[i2 + 1] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        jx0N0.c = i2 + 4;
        this.b += 4;
    }

    public final void v0(int i) {
        JX0 jx0N0 = n0(2);
        int i2 = jx0N0.c;
        byte b = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = jx0N0.a;
        bArr[i2] = b;
        bArr[i2 + 1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        jx0N0.c = i2 + 2;
        this.b += 2;
    }

    public final boolean w() {
        return this.b == 0;
    }

    public final void w0(int i, int i2, String str) {
        char cCharAt;
        O90.f(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC8235ym.f(i2, "endIndex < beginIndex: ", i, " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbN = AbstractC8235ym.n(i2, "endIndex > string.length: ", " > ");
            sbN.append(str.length());
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                JX0 jx0N0 = n0(1);
                int i3 = jx0N0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = jx0N0.a;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = jx0N0.c;
                int i6 = (i3 + i) - i5;
                jx0N0.c = i5 + i6;
                this.b += i6;
            } else {
                if (cCharAt2 < 2048) {
                    JX0 jx0N02 = n0(2);
                    int i7 = jx0N02.c;
                    byte[] bArr2 = jx0N02.a;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    jx0N02.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    JX0 jx0N03 = n0(3);
                    int i8 = jx0N03.c;
                    byte[] bArr3 = jx0N03.a;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    jx0N03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        r0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        JX0 jx0N04 = n0(4);
                        int i11 = jx0N04.c;
                        byte[] bArr4 = jx0N04.a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        jx0N04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        O90.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            JX0 jx0N0 = n0(1);
            int iMin = Math.min(i, 8192 - jx0N0.c);
            byteBuffer.get(jx0N0.a, jx0N0.c, iMin);
            i -= iMin;
            jx0N0.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    public final byte x(long j) {
        AbstractC1525Ti.b(this.b, j, 1L);
        JX0 jx0 = this.a;
        if (jx0 == null) {
            O90.c(null);
            throw null;
        }
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                jx0 = jx0.g;
                O90.c(jx0);
                j2 -= jx0.c - jx0.b;
            }
            return jx0.a[(int) ((jx0.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = jx0.c;
            int i2 = jx0.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return jx0.a[(int) ((i2 + j) - j3)];
            }
            jx0 = jx0.f;
            O90.c(jx0);
            j3 = j4;
        }
    }

    public final void x0(String str) {
        O90.f(str, "string");
        w0(0, str.length(), str);
    }

    @Override // defpackage.InterfaceC0827Kj
    public final byte[] y() {
        return S(this.b);
    }

    public final void y0(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            r0(i);
            return;
        }
        if (i < 2048) {
            JX0 jx0N0 = n0(2);
            int i3 = jx0N0.c;
            byte[] bArr = jx0N0.a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            jx0N0.c = i3 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            r0(63);
            return;
        }
        if (i < 65536) {
            JX0 jx0N02 = n0(3);
            int i4 = jx0N02.c;
            byte[] bArr2 = jx0N02.a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            jx0N02.c = i4 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            JX0 jx0N03 = n0(4);
            int i5 = jx0N03.c;
            byte[] bArr3 = jx0N03.a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            jx0N03.c = i5 + 4;
            this.b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = S8.a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            if (i2 < 0) {
                throw new IndexOutOfBoundsException(AbstractC8235ym.g(i2, "startIndex: ", ", endIndex: 8, size: 8"));
            }
            if (i2 > 8) {
                throw new IllegalArgumentException(AbstractC8235ym.g(i2, "startIndex: ", " > endIndex: 8"));
            }
            str = new String(cArr2, i2, 8 - i2);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.Z11
    public final void close() {
    }

    @Override // defpackage.Z11, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.InterfaceC0827Kj
    public final C6129nj v() {
        return this;
    }

    @Override // defpackage.InterfaceC0827Kj
    public final C6129nj z() {
        return this;
    }
}
