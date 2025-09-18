package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: n80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6019n80 implements U21 {
    public final C8351zN0 a;
    public final Inflater b;
    public int c;
    public boolean d;

    public C6019n80(C8351zN0 c8351zN0, Inflater inflater) {
        this.a = c8351zN0;
        this.b = inflater;
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) {
        O90.f(c6129nj, "sink");
        do {
            long jA = a(c6129nj, 8192L);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.m());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(C6129nj c6129nj, long j) throws DataFormatException, IOException {
        Inflater inflater = this.b;
        O90.f(c6129nj, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(NX.g(j, "byteCount < 0: ").toString());
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        try {
            JX0 jx0N0 = c6129nj.n0(1);
            int iMin = (int) Math.min(j, 8192 - jx0N0.c);
            boolean zNeedsInput = inflater.needsInput();
            C8351zN0 c8351zN0 = this.a;
            if (zNeedsInput && !c8351zN0.m()) {
                JX0 jx0 = c8351zN0.b.a;
                O90.c(jx0);
                int i = jx0.c;
                int i2 = jx0.b;
                int i3 = i - i2;
                this.c = i3;
                inflater.setInput(jx0.a, i2, i3);
            }
            int iInflate = inflater.inflate(jx0N0.a, jx0N0.c, iMin);
            int i4 = this.c;
            if (i4 != 0) {
                int remaining = i4 - inflater.getRemaining();
                this.c -= remaining;
                c8351zN0.b0(remaining);
            }
            if (iInflate > 0) {
                jx0N0.c += iInflate;
                long j2 = iInflate;
                c6129nj.b += j2;
                return j2;
            }
            if (jx0N0.b == jx0N0.c) {
                c6129nj.a = jx0N0.a();
                RX0.a(jx0N0);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.a.a.r();
    }
}
