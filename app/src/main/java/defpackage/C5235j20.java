package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: j20 */
/* loaded from: classes2.dex */
public final class C5235j20 implements U21 {
    public byte a;
    public final C8351zN0 b;
    public final Inflater c;
    public final C6019n80 d;
    public final CRC32 e;

    public C5235j20(U21 u21) {
        O90.f(u21, "source");
        C8351zN0 c8351zN0 = new C8351zN0(u21);
        this.b = c8351zN0;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new C6019n80(c8351zN0, inflater);
        this.e = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        C8351zN0 c8351zN0;
        C6129nj c6129nj2;
        long j2;
        O90.f(c6129nj, "sink");
        byte b = this.a;
        CRC32 crc32 = this.e;
        C8351zN0 c8351zN02 = this.b;
        if (b == 0) {
            c8351zN02.X(10L);
            C6129nj c6129nj3 = c8351zN02.b;
            byte bX = c6129nj3.x(3L);
            boolean z = ((bX >> 1) & 1) == 1;
            if (z) {
                c(c6129nj3, 0L, 10L);
            }
            a(8075, c8351zN02.U(), "ID1ID2");
            c8351zN02.b0(8L);
            if (((bX >> 2) & 1) == 1) {
                c8351zN02.X(2L);
                if (z) {
                    c(c6129nj3, 0L, 2L);
                }
                short sB0 = c6129nj3.b0();
                long j3 = ((short) (((sB0 & 255) << 8) | ((sB0 & 65280) >>> 8))) & 65535;
                c8351zN02.X(j3);
                if (z) {
                    c(c6129nj3, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                c8351zN02.b0(j2);
            }
            if (((bX >> 3) & 1) == 1) {
                c6129nj2 = c6129nj3;
                long jN = c8351zN02.n((byte) 0, 0L, Long.MAX_VALUE);
                if (jN == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c8351zN0 = c8351zN02;
                    c(c6129nj2, 0L, jN + 1);
                } else {
                    c8351zN0 = c8351zN02;
                }
                c8351zN0.b0(jN + 1);
            } else {
                c8351zN0 = c8351zN02;
                c6129nj2 = c6129nj3;
            }
            if (((bX >> 4) & 1) == 1) {
                long jN2 = c8351zN0.n((byte) 0, 0L, Long.MAX_VALUE);
                if (jN2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c(c6129nj2, 0L, jN2 + 1);
                }
                c8351zN0.b0(jN2 + 1);
            }
            if (z) {
                c8351zN0.X(2L);
                short sB02 = c6129nj2.b0();
                a((short) (((sB02 & 255) << 8) | ((sB02 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.a = (byte) 1;
        } else {
            c8351zN0 = c8351zN02;
        }
        if (this.a == 1) {
            long j4 = c6129nj.b;
            long jH = this.d.H(c6129nj, 8192L);
            if (jH != -1) {
                c(c6129nj, j4, jH);
                return jH;
            }
            this.a = (byte) 2;
        }
        if (this.a != 2) {
            return -1L;
        }
        a(c8351zN0.S(), (int) crc32.getValue(), "CRC");
        a(c8351zN0.S(), (int) this.c.getBytesWritten(), "ISIZE");
        this.a = (byte) 3;
        if (c8351zN0.m()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    public final void c(C6129nj c6129nj, long j, long j2) {
        JX0 jx0 = c6129nj.a;
        O90.c(jx0);
        while (true) {
            int i = jx0.c;
            int i2 = jx0.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            jx0 = jx0.f;
            O90.c(jx0);
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(jx0.c - r6, j2);
            this.e.update(jx0.a, (int) (jx0.b + j), iMin);
            j2 -= iMin;
            jx0 = jx0.f;
            O90.c(jx0);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.b.a.r();
    }
}
