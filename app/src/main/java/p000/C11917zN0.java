package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* renamed from: zN0 */
/* loaded from: classes2.dex */
public final class C11917zN0 implements InterfaceC0676Kj {

    /* renamed from: a */
    public final U21 f46809a;

    /* renamed from: b */
    public final C6507nj f46810b;

    /* renamed from: c */
    public boolean f46811c;

    public C11917zN0(U21 u21) {
        O90.m5968f(u21, "source");
        this.f46809a = u21;
        this.f46810b = new C6507nj();
    }

    /* renamed from: A */
    public final void m26379A(C6507nj c6507nj, long j) throws EOFException {
        C6507nj c6507nj2 = this.f46810b;
        try {
            m26385X(j);
            long j2 = c6507nj2.f38488b;
            if (j2 >= j) {
                c6507nj.mo2328c0(c6507nj2, j);
            } else {
                c6507nj.mo2328c0(c6507nj2, j2);
                throw new EOFException();
            }
        } catch (EOFException e) {
            c6507nj.mo4396i(c6507nj2);
            throw e;
        }
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: B */
    public final int mo4702B(C7778Iy0 c7778Iy0) throws EOFException {
        O90.m5968f(c7778Iy0, "options");
        if (this.f46811c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C6507nj c6507nj = this.f46810b;
            int iM17810b = AbstractC3962e.m17810b(c6507nj, c7778Iy0, true);
            if (iM17810b != -2) {
                if (iM17810b != -1) {
                    c6507nj.m23185i0(c7778Iy0.f5235a[iM17810b].mo3983c());
                    return iM17810b;
                }
            } else if (this.f46809a.mo96H(c6507nj, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00de A[EDGE_INSN: B:144:0x00de->B:134:0x00de BREAK  A[LOOP:1: B:102:0x005c->B:148:?], SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m26380D() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11917zN0.m26380D():long");
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) {
        O90.m5968f(c6507nj, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "byteCount < 0: ").toString());
        }
        if (this.f46811c) {
            throw new IllegalStateException("closed");
        }
        C6507nj c6507nj2 = this.f46810b;
        if (c6507nj2.f38488b == 0 && this.f46809a.mo96H(c6507nj2, 8192L) == -1) {
            return -1L;
        }
        return c6507nj2.mo96H(c6507nj, Math.min(j, c6507nj2.f38488b));
    }

    /* renamed from: J */
    public final int m26381J() throws EOFException {
        m26385X(4L);
        return this.f46810b.m23180X();
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: K */
    public final long mo4703K(C6868t9 c6868t9) {
        C6507nj c6507nj;
        long j = 0;
        while (true) {
            c6507nj = this.f46810b;
            if (this.f46809a.mo96H(c6507nj, 8192L) == -1) {
                break;
            }
            long jM23190o = c6507nj.m23190o();
            if (jM23190o > 0) {
                j += jM23190o;
                c6868t9.mo2328c0(c6507nj, jM23190o);
            }
        }
        long j2 = c6507nj.f38488b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c6868t9.mo2328c0(c6507nj, j2);
        return j3;
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: N */
    public final String mo4704N(Charset charset) {
        C6507nj c6507nj = this.f46810b;
        c6507nj.mo4396i(this.f46809a);
        return c6507nj.mo4704N(charset);
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: R */
    public final boolean mo4705R(long j) {
        C6507nj c6507nj;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "byteCount < 0: ").toString());
        }
        if (this.f46811c) {
            throw new IllegalStateException("closed");
        }
        do {
            c6507nj = this.f46810b;
            if (c6507nj.f38488b >= j) {
                return true;
            }
        } while (this.f46809a.mo96H(c6507nj, 8192L) != -1);
        return false;
    }

    /* renamed from: S */
    public final int m26382S() throws EOFException {
        m26385X(4L);
        int iM23180X = this.f46810b.m23180X();
        return ((iM23180X & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & iM23180X) >>> 24) | ((16711680 & iM23180X) >>> 8) | ((65280 & iM23180X) << 8);
    }

    /* renamed from: U */
    public final short m26383U() throws EOFException {
        m26385X(2L);
        return this.f46810b.m23181b0();
    }

    /* renamed from: W */
    public final String m26384W(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM26388n = m26388n((byte) 10, 0L, j2);
        C6507nj c6507nj = this.f46810b;
        if (jM26388n != -1) {
            return AbstractC3962e.m17809a(c6507nj, jM26388n);
        }
        if (j2 < Long.MAX_VALUE && mo4705R(j2) && c6507nj.m23202x(j2 - 1) == 13 && mo4705R(1 + j2) && c6507nj.m23202x(j2) == 10) {
            return AbstractC3962e.m17809a(c6507nj, j2);
        }
        C6507nj c6507nj2 = new C6507nj();
        c6507nj.m23192p(c6507nj2, 0L, Math.min(32, c6507nj.f38488b));
        throw new EOFException("\\n not found: limit=" + Math.min(c6507nj.f38488b, j) + " content=" + c6507nj2.m23178U(c6507nj2.f38488b).mo3984d() + (char) 8230);
    }

    /* renamed from: X */
    public final void m26385X(long j) throws EOFException {
        if (!mo4705R(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: b0 */
    public final void m26386b0(long j) throws EOFException {
        if (this.f46811c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C6507nj c6507nj = this.f46810b;
            if (c6507nj.f38488b == 0 && this.f46809a.mo96H(c6507nj, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c6507nj.f38488b);
            c6507nj.m23185i0(jMin);
            j -= jMin;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f46811c) {
            return;
        }
        this.f46811c = true;
        this.f46809a.close();
        this.f46810b.m23186m();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f46811c;
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: l0 */
    public final InputStream mo4706l0() {
        return new C6381lj(this, 1);
    }

    /* renamed from: m */
    public final boolean m26387m() {
        if (this.f46811c) {
            throw new IllegalStateException("closed");
        }
        C6507nj c6507nj = this.f46810b;
        return c6507nj.m23200w() && this.f46809a.mo96H(c6507nj, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
    
        return r2;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m26388n(byte r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11917zN0.m26388n(byte, long, long):long");
    }

    /* renamed from: o */
    public final long m26389o(C0551Ik c0551Ik) {
        long j;
        long j2;
        long j3;
        O90.m5968f(c0551Ik, "targetBytes");
        if (this.f46811c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C6507nj c6507nj = this.f46810b;
            c6507nj.getClass();
            O90.m5968f(c0551Ik, "targetBytes");
            long j4 = 0;
            if (jMax < 0) {
                throw new IllegalArgumentException(AbstractC0852NX.m5758g(jMax, "fromIndex < 0: ").toString());
            }
            JX0 jx0 = c6507nj.f38487a;
            if (jx0 == null) {
                j2 = -1;
            } else {
                long j5 = c6507nj.f38488b;
                long j6 = j5 - jMax;
                byte[] bArr = c0551Ik.f5117a;
                if (j6 < jMax) {
                    while (j5 > jMax) {
                        jx0 = jx0.f5585g;
                        O90.m5965c(jx0);
                        j5 -= jx0.f5581c - jx0.f5580b;
                    }
                    if (bArr.length == 2) {
                        byte b = bArr[0];
                        byte b2 = bArr[1];
                        long j7 = jMax;
                        while (j5 < c6507nj.f38488b) {
                            int i = jx0.f5581c;
                            for (int i2 = (int) ((jx0.f5580b + j7) - j5); i2 < i; i2++) {
                                byte b3 = jx0.f5579a[i2];
                                if (b3 == b || b3 == b2) {
                                    j3 = i2 - jx0.f5580b;
                                    j2 = j3 + j5;
                                    break;
                                }
                            }
                            j7 = (jx0.f5581c - jx0.f5580b) + j5;
                            jx0 = jx0.f5584f;
                            O90.m5965c(jx0);
                            j5 = j7;
                        }
                        j2 = -1;
                    } else {
                        long j8 = jMax;
                        while (j5 < c6507nj.f38488b) {
                            int i3 = jx0.f5581c;
                            for (int i4 = (int) ((jx0.f5580b + j8) - j5); i4 < i3; i4++) {
                                byte b4 = jx0.f5579a[i4];
                                for (byte b5 : bArr) {
                                    if (b4 == b5) {
                                        j3 = i4 - jx0.f5580b;
                                        j2 = j3 + j5;
                                        break;
                                    }
                                }
                            }
                            j8 = (jx0.f5581c - jx0.f5580b) + j5;
                            jx0 = jx0.f5584f;
                            O90.m5965c(jx0);
                            j5 = j8;
                        }
                        j2 = -1;
                    }
                } else {
                    while (true) {
                        long j9 = (jx0.f5581c - jx0.f5580b) + j4;
                        if (j9 > jMax) {
                            break;
                        }
                        jx0 = jx0.f5584f;
                        O90.m5965c(jx0);
                        j4 = j9;
                    }
                    if (bArr.length == 2) {
                        byte b6 = bArr[0];
                        byte b7 = bArr[1];
                        long j10 = jMax;
                        while (j4 < c6507nj.f38488b) {
                            int i5 = jx0.f5581c;
                            for (int i6 = (int) ((jx0.f5580b + j10) - j4); i6 < i5; i6++) {
                                byte b8 = jx0.f5579a[i6];
                                if (b8 == b6 || b8 == b7) {
                                    j = i6 - jx0.f5580b;
                                    j2 = j + j4;
                                    break;
                                }
                            }
                            j10 = (jx0.f5581c - jx0.f5580b) + j4;
                            jx0 = jx0.f5584f;
                            O90.m5965c(jx0);
                            j4 = j10;
                        }
                        j2 = -1;
                    } else {
                        long j11 = jMax;
                        while (j4 < c6507nj.f38488b) {
                            int i7 = jx0.f5581c;
                            for (int i8 = (int) ((jx0.f5580b + j11) - j4); i8 < i7; i8++) {
                                byte b9 = jx0.f5579a[i8];
                                for (byte b10 : bArr) {
                                    if (b9 == b10) {
                                        j = i8 - jx0.f5580b;
                                        j2 = j + j4;
                                        break;
                                    }
                                }
                            }
                            j11 = (jx0.f5581c - jx0.f5580b) + j4;
                            jx0 = jx0.f5584f;
                            O90.m5965c(jx0);
                            j4 = j11;
                        }
                        j2 = -1;
                    }
                }
            }
            if (j2 != -1) {
                return j2;
            }
            long j12 = c6507nj.f38488b;
            if (this.f46809a.mo96H(c6507nj, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j12);
        }
    }

    /* renamed from: p */
    public final byte m26390p() throws EOFException {
        m26385X(1L);
        return this.f46810b.m23176J();
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f46809a.mo97r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        O90.m5968f(byteBuffer, "sink");
        C6507nj c6507nj = this.f46810b;
        if (c6507nj.f38488b == 0 && this.f46809a.mo96H(c6507nj, 8192L) == -1) {
            return -1;
        }
        return c6507nj.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f46809a + ')';
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: v */
    public final C6507nj mo4707v() {
        return this.f46810b;
    }

    /* renamed from: w */
    public final C0551Ik m26391w(long j) throws EOFException {
        m26385X(j);
        return this.f46810b.m23178U(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x002b, code lost:
    
        if (r5 == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x002e, code lost:
    
        p000.HS1.m3431b(16);
        p000.HS1.m3431b(16);
        r2 = java.lang.Integer.toString(r9, 16);
        p000.O90.m5967e(r2, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x004a, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r2));
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m26392x() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11917zN0.m26392x():long");
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: y */
    public final byte[] mo4708y() {
        U21 u21 = this.f46809a;
        C6507nj c6507nj = this.f46810b;
        c6507nj.mo4396i(u21);
        return c6507nj.m23177S(c6507nj.f38488b);
    }

    @Override // p000.InterfaceC0676Kj
    /* renamed from: z */
    public final C6507nj mo4709z() {
        return this.f46810b;
    }
}
