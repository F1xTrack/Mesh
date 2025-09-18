package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: j20 */
/* loaded from: classes2.dex */
public final class C9829j20 implements U21 {

    /* renamed from: a */
    public byte f34850a;

    /* renamed from: b */
    public final C11917zN0 f34851b;

    /* renamed from: c */
    public final Inflater f34852c;

    /* renamed from: d */
    public final C10355n80 f34853d;

    /* renamed from: e */
    public final CRC32 f34854e;

    public C9829j20(U21 u21) {
        O90.m5968f(u21, "source");
        C11917zN0 c11917zN0 = new C11917zN0(u21);
        this.f34851b = c11917zN0;
        Inflater inflater = new Inflater(true);
        this.f34852c = inflater;
        this.f34853d = new C10355n80(c11917zN0, inflater);
        this.f34854e = new CRC32();
    }

    /* renamed from: a */
    public static void m21959a(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        C11917zN0 c11917zN0;
        C6507nj c6507nj2;
        long j2;
        O90.m5968f(c6507nj, "sink");
        byte b = this.f34850a;
        CRC32 crc32 = this.f34854e;
        C11917zN0 c11917zN02 = this.f34851b;
        if (b == 0) {
            c11917zN02.m26385X(10L);
            C6507nj c6507nj3 = c11917zN02.f46810b;
            byte bM23202x = c6507nj3.m23202x(3L);
            boolean z = ((bM23202x >> 1) & 1) == 1;
            if (z) {
                m21960c(c6507nj3, 0L, 10L);
            }
            m21959a(8075, c11917zN02.m26383U(), "ID1ID2");
            c11917zN02.m26386b0(8L);
            if (((bM23202x >> 2) & 1) == 1) {
                c11917zN02.m26385X(2L);
                if (z) {
                    m21960c(c6507nj3, 0L, 2L);
                }
                short sM23181b0 = c6507nj3.m23181b0();
                long j3 = ((short) (((sM23181b0 & 255) << 8) | ((sM23181b0 & 65280) >>> 8))) & 65535;
                c11917zN02.m26385X(j3);
                if (z) {
                    m21960c(c6507nj3, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                c11917zN02.m26386b0(j2);
            }
            if (((bM23202x >> 3) & 1) == 1) {
                c6507nj2 = c6507nj3;
                long jM26388n = c11917zN02.m26388n((byte) 0, 0L, Long.MAX_VALUE);
                if (jM26388n == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c11917zN0 = c11917zN02;
                    m21960c(c6507nj2, 0L, jM26388n + 1);
                } else {
                    c11917zN0 = c11917zN02;
                }
                c11917zN0.m26386b0(jM26388n + 1);
            } else {
                c11917zN0 = c11917zN02;
                c6507nj2 = c6507nj3;
            }
            if (((bM23202x >> 4) & 1) == 1) {
                long jM26388n2 = c11917zN0.m26388n((byte) 0, 0L, Long.MAX_VALUE);
                if (jM26388n2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m21960c(c6507nj2, 0L, jM26388n2 + 1);
                }
                c11917zN0.m26386b0(jM26388n2 + 1);
            }
            if (z) {
                c11917zN0.m26385X(2L);
                short sM23181b02 = c6507nj2.m23181b0();
                m21959a((short) (((sM23181b02 & 255) << 8) | ((sM23181b02 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f34850a = (byte) 1;
        } else {
            c11917zN0 = c11917zN02;
        }
        if (this.f34850a == 1) {
            long j4 = c6507nj.f38488b;
            long jMo96H = this.f34853d.mo96H(c6507nj, 8192L);
            if (jMo96H != -1) {
                m21960c(c6507nj, j4, jMo96H);
                return jMo96H;
            }
            this.f34850a = (byte) 2;
        }
        if (this.f34850a != 2) {
            return -1L;
        }
        m21959a(c11917zN0.m26382S(), (int) crc32.getValue(), "CRC");
        m21959a(c11917zN0.m26382S(), (int) this.f34852c.getBytesWritten(), "ISIZE");
        this.f34850a = (byte) 3;
        if (c11917zN0.m26387m()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    /* renamed from: c */
    public final void m21960c(C6507nj c6507nj, long j, long j2) {
        JX0 jx0 = c6507nj.f38487a;
        O90.m5965c(jx0);
        while (true) {
            int i = jx0.f5581c;
            int i2 = jx0.f5580b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            jx0 = jx0.f5584f;
            O90.m5965c(jx0);
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(jx0.f5581c - r6, j2);
            this.f34854e.update(jx0.f5579a, (int) (jx0.f5580b + j), iMin);
            j2 -= iMin;
            jx0 = jx0.f5584f;
            O90.m5965c(jx0);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34853d.close();
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f34851b.f46809a.mo97r();
    }
}
