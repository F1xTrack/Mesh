package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* renamed from: zN0 */
/* loaded from: classes2.dex */
public final class C8351zN0 implements InterfaceC0827Kj {
    public final U21 a;
    public final C6129nj b;
    public boolean c;

    public C8351zN0(U21 u21) {
        O90.f(u21, "source");
        this.a = u21;
        this.b = new C6129nj();
    }

    public final void A(C6129nj c6129nj, long j) throws EOFException {
        C6129nj c6129nj2 = this.b;
        try {
            X(j);
            long j2 = c6129nj2.b;
            if (j2 >= j) {
                c6129nj.c0(c6129nj2, j);
            } else {
                c6129nj.c0(c6129nj2, j2);
                throw new EOFException();
            }
        } catch (EOFException e) {
            c6129nj.i(c6129nj2);
            throw e;
        }
    }

    @Override // defpackage.InterfaceC0827Kj
    public final int B(C0717Iy0 c0717Iy0) throws EOFException {
        O90.f(c0717Iy0, "options");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C6129nj c6129nj = this.b;
            int iB = AbstractC3494e.b(c6129nj, c0717Iy0, true);
            if (iB != -2) {
                if (iB != -1) {
                    c6129nj.i0(c0717Iy0.a[iB].c());
                    return iB;
                }
            } else if (this.a.H(c6129nj, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00de A[EDGE_INSN: B:144:0x00de->B:134:0x00de BREAK  A[LOOP:1: B:102:0x005c->B:148:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long D() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8351zN0.D():long");
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) {
        O90.f(c6129nj, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(NX.g(j, "byteCount < 0: ").toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        C6129nj c6129nj2 = this.b;
        if (c6129nj2.b == 0 && this.a.H(c6129nj2, 8192L) == -1) {
            return -1L;
        }
        return c6129nj2.H(c6129nj, Math.min(j, c6129nj2.b));
    }

    public final int J() throws EOFException {
        X(4L);
        return this.b.X();
    }

    @Override // defpackage.InterfaceC0827Kj
    public final long K(C7166t9 c7166t9) {
        C6129nj c6129nj;
        long j = 0;
        while (true) {
            c6129nj = this.b;
            if (this.a.H(c6129nj, 8192L) == -1) {
                break;
            }
            long jO = c6129nj.o();
            if (jO > 0) {
                j += jO;
                c7166t9.c0(c6129nj, jO);
            }
        }
        long j2 = c6129nj.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c7166t9.c0(c6129nj, j2);
        return j3;
    }

    @Override // defpackage.InterfaceC0827Kj
    public final String N(Charset charset) {
        C6129nj c6129nj = this.b;
        c6129nj.i(this.a);
        return c6129nj.N(charset);
    }

    @Override // defpackage.InterfaceC0827Kj
    public final boolean R(long j) {
        C6129nj c6129nj;
        if (j < 0) {
            throw new IllegalArgumentException(NX.g(j, "byteCount < 0: ").toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            c6129nj = this.b;
            if (c6129nj.b >= j) {
                return true;
            }
        } while (this.a.H(c6129nj, 8192L) != -1);
        return false;
    }

    public final int S() throws EOFException {
        X(4L);
        int iX = this.b.X();
        return ((iX & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & iX) >>> 24) | ((16711680 & iX) >>> 8) | ((65280 & iX) << 8);
    }

    public final short U() throws EOFException {
        X(2L);
        return this.b.b0();
    }

    public final String W(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(NX.g(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jN = n((byte) 10, 0L, j2);
        C6129nj c6129nj = this.b;
        if (jN != -1) {
            return AbstractC3494e.a(c6129nj, jN);
        }
        if (j2 < Long.MAX_VALUE && R(j2) && c6129nj.x(j2 - 1) == 13 && R(1 + j2) && c6129nj.x(j2) == 10) {
            return AbstractC3494e.a(c6129nj, j2);
        }
        C6129nj c6129nj2 = new C6129nj();
        c6129nj.p(c6129nj2, 0L, Math.min(32, c6129nj.b));
        throw new EOFException("\\n not found: limit=" + Math.min(c6129nj.b, j) + " content=" + c6129nj2.U(c6129nj2.b).d() + (char) 8230);
    }

    public final void X(long j) throws EOFException {
        if (!R(j)) {
            throw new EOFException();
        }
    }

    public final void b0(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C6129nj c6129nj = this.b;
            if (c6129nj.b == 0 && this.a.H(c6129nj, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c6129nj.b);
            c6129nj.i0(jMin);
            j -= jMin;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.m();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.InterfaceC0827Kj
    public final InputStream l0() {
        return new C5747lj(this, 1);
    }

    public final boolean m() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        C6129nj c6129nj = this.b;
        return c6129nj.w() && this.a.H(c6129nj, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n(byte r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8351zN0.n(byte, long, long):long");
    }

    public final long o(C0674Ik c0674Ik) {
        long j;
        long j2;
        long j3;
        O90.f(c0674Ik, "targetBytes");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C6129nj c6129nj = this.b;
            c6129nj.getClass();
            O90.f(c0674Ik, "targetBytes");
            long j4 = 0;
            if (jMax < 0) {
                throw new IllegalArgumentException(NX.g(jMax, "fromIndex < 0: ").toString());
            }
            JX0 jx0 = c6129nj.a;
            if (jx0 == null) {
                j2 = -1;
            } else {
                long j5 = c6129nj.b;
                long j6 = j5 - jMax;
                byte[] bArr = c0674Ik.a;
                if (j6 < jMax) {
                    while (j5 > jMax) {
                        jx0 = jx0.g;
                        O90.c(jx0);
                        j5 -= jx0.c - jx0.b;
                    }
                    if (bArr.length == 2) {
                        byte b = bArr[0];
                        byte b2 = bArr[1];
                        long j7 = jMax;
                        while (j5 < c6129nj.b) {
                            int i = jx0.c;
                            for (int i2 = (int) ((jx0.b + j7) - j5); i2 < i; i2++) {
                                byte b3 = jx0.a[i2];
                                if (b3 == b || b3 == b2) {
                                    j3 = i2 - jx0.b;
                                    j2 = j3 + j5;
                                    break;
                                }
                            }
                            j7 = (jx0.c - jx0.b) + j5;
                            jx0 = jx0.f;
                            O90.c(jx0);
                            j5 = j7;
                        }
                        j2 = -1;
                    } else {
                        long j8 = jMax;
                        while (j5 < c6129nj.b) {
                            int i3 = jx0.c;
                            for (int i4 = (int) ((jx0.b + j8) - j5); i4 < i3; i4++) {
                                byte b4 = jx0.a[i4];
                                for (byte b5 : bArr) {
                                    if (b4 == b5) {
                                        j3 = i4 - jx0.b;
                                        j2 = j3 + j5;
                                        break;
                                    }
                                }
                            }
                            j8 = (jx0.c - jx0.b) + j5;
                            jx0 = jx0.f;
                            O90.c(jx0);
                            j5 = j8;
                        }
                        j2 = -1;
                    }
                } else {
                    while (true) {
                        long j9 = (jx0.c - jx0.b) + j4;
                        if (j9 > jMax) {
                            break;
                        }
                        jx0 = jx0.f;
                        O90.c(jx0);
                        j4 = j9;
                    }
                    if (bArr.length == 2) {
                        byte b6 = bArr[0];
                        byte b7 = bArr[1];
                        long j10 = jMax;
                        while (j4 < c6129nj.b) {
                            int i5 = jx0.c;
                            for (int i6 = (int) ((jx0.b + j10) - j4); i6 < i5; i6++) {
                                byte b8 = jx0.a[i6];
                                if (b8 == b6 || b8 == b7) {
                                    j = i6 - jx0.b;
                                    j2 = j + j4;
                                    break;
                                }
                            }
                            j10 = (jx0.c - jx0.b) + j4;
                            jx0 = jx0.f;
                            O90.c(jx0);
                            j4 = j10;
                        }
                        j2 = -1;
                    } else {
                        long j11 = jMax;
                        while (j4 < c6129nj.b) {
                            int i7 = jx0.c;
                            for (int i8 = (int) ((jx0.b + j11) - j4); i8 < i7; i8++) {
                                byte b9 = jx0.a[i8];
                                for (byte b10 : bArr) {
                                    if (b9 == b10) {
                                        j = i8 - jx0.b;
                                        j2 = j + j4;
                                        break;
                                    }
                                }
                            }
                            j11 = (jx0.c - jx0.b) + j4;
                            jx0 = jx0.f;
                            O90.c(jx0);
                            j4 = j11;
                        }
                        j2 = -1;
                    }
                }
            }
            if (j2 != -1) {
                return j2;
            }
            long j12 = c6129nj.b;
            if (this.a.H(c6129nj, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j12);
        }
    }

    public final byte p() throws EOFException {
        X(1L);
        return this.b.J();
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.a.r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        O90.f(byteBuffer, "sink");
        C6129nj c6129nj = this.b;
        if (c6129nj.b == 0 && this.a.H(c6129nj, 8192L) == -1) {
            return -1;
        }
        return c6129nj.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.InterfaceC0827Kj
    public final C6129nj v() {
        return this.b;
    }

    public final C0674Ik w(long j) throws EOFException {
        X(j);
        return this.b.U(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x002b, code lost:
    
        if (r5 == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x002e, code lost:
    
        defpackage.HS1.b(16);
        defpackage.HS1.b(16);
        r2 = java.lang.Integer.toString(r9, 16);
        defpackage.O90.e(r2, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x004a, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long x() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8351zN0.x():long");
    }

    @Override // defpackage.InterfaceC0827Kj
    public final byte[] y() {
        U21 u21 = this.a;
        C6129nj c6129nj = this.b;
        c6129nj.i(u21);
        return c6129nj.S(c6129nj.b);
    }

    @Override // defpackage.InterfaceC0827Kj
    public final C6129nj z() {
        return this.b;
    }
}
