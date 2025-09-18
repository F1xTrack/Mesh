package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: n80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10355n80 implements U21 {

    /* renamed from: a */
    public final C11917zN0 f38136a;

    /* renamed from: b */
    public final Inflater f38137b;

    /* renamed from: c */
    public int f38138c;

    /* renamed from: d */
    public boolean f38139d;

    public C10355n80(C11917zN0 c11917zN0, Inflater inflater) {
        this.f38136a = c11917zN0;
        this.f38137b = inflater;
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) {
        O90.m5968f(c6507nj, "sink");
        do {
            long jM23093a = m23093a(c6507nj, 8192L);
            if (jM23093a > 0) {
                return jM23093a;
            }
            Inflater inflater = this.f38137b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f38136a.m26387m());
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: a */
    public final long m23093a(C6507nj c6507nj, long j) throws DataFormatException, IOException {
        Inflater inflater = this.f38137b;
        O90.m5968f(c6507nj, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "byteCount < 0: ").toString());
        }
        if (this.f38139d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        try {
            JX0 jx0M23189n0 = c6507nj.m23189n0(1);
            int iMin = (int) Math.min(j, 8192 - jx0M23189n0.f5581c);
            boolean zNeedsInput = inflater.needsInput();
            C11917zN0 c11917zN0 = this.f38136a;
            if (zNeedsInput && !c11917zN0.m26387m()) {
                JX0 jx0 = c11917zN0.f46810b.f38487a;
                O90.m5965c(jx0);
                int i = jx0.f5581c;
                int i2 = jx0.f5580b;
                int i3 = i - i2;
                this.f38138c = i3;
                inflater.setInput(jx0.f5579a, i2, i3);
            }
            int iInflate = inflater.inflate(jx0M23189n0.f5579a, jx0M23189n0.f5581c, iMin);
            int i4 = this.f38138c;
            if (i4 != 0) {
                int remaining = i4 - inflater.getRemaining();
                this.f38138c -= remaining;
                c11917zN0.m26386b0(remaining);
            }
            if (iInflate > 0) {
                jx0M23189n0.f5581c += iInflate;
                long j2 = iInflate;
                c6507nj.f38488b += j2;
                return j2;
            }
            if (jx0M23189n0.f5580b == jx0M23189n0.f5581c) {
                c6507nj.f38487a = jx0M23189n0.m4339a();
                RX0.m7031a(jx0M23189n0);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38139d) {
            return;
        }
        this.f38137b.end();
        this.f38139d = true;
        this.f38136a.close();
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f38136a.f46809a.mo97r();
    }
}
