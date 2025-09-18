package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: j40 */
/* loaded from: classes2.dex */
public final class C5243j40 implements U21 {
    public final C8351zN0 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public C5243j40(C8351zN0 c8351zN0) {
        O90.f(c8351zN0, "source");
        this.a = c8351zN0;
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        int i;
        int iJ;
        O90.f(c6129nj, "sink");
        do {
            int i2 = this.e;
            C8351zN0 c8351zN0 = this.a;
            if (i2 != 0) {
                long jH = c8351zN0.H(c6129nj, Math.min(8192L, i2));
                if (jH == -1) {
                    return -1L;
                }
                this.e -= (int) jH;
                return jH;
            }
            c8351zN0.b0(this.f);
            this.f = 0;
            if ((this.c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int iU = AbstractC0199Ch1.u(c8351zN0);
            this.e = iU;
            this.b = iU;
            int iP = c8351zN0.p() & 255;
            this.c = c8351zN0.p() & 255;
            Logger logger = C5434k40.d;
            if (logger.isLoggable(Level.FINE)) {
                C0674Ik c0674Ik = Z30.a;
                logger.fine(Z30.a(true, this.d, this.b, iP, this.c));
            }
            iJ = c8351zN0.J() & Integer.MAX_VALUE;
            this.d = iJ;
            if (iP != 9) {
                throw new IOException(iP + " != TYPE_CONTINUATION");
            }
        } while (iJ == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.a.a.r();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
