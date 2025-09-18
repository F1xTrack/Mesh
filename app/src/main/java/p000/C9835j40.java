package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: j40 */
/* loaded from: classes2.dex */
public final class C9835j40 implements U21 {

    /* renamed from: a */
    public final C11917zN0 f34897a;

    /* renamed from: b */
    public int f34898b;

    /* renamed from: c */
    public int f34899c;

    /* renamed from: d */
    public int f34900d;

    /* renamed from: e */
    public int f34901e;

    /* renamed from: f */
    public int f34902f;

    public C9835j40(C11917zN0 c11917zN0) {
        O90.m5968f(c11917zN0, "source");
        this.f34897a = c11917zN0;
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        int i;
        int iM26381J;
        O90.m5968f(c6507nj, "sink");
        do {
            int i2 = this.f34901e;
            C11917zN0 c11917zN0 = this.f34897a;
            if (i2 != 0) {
                long jMo96H = c11917zN0.mo96H(c6507nj, Math.min(8192L, i2));
                if (jMo96H == -1) {
                    return -1L;
                }
                this.f34901e -= (int) jMo96H;
                return jMo96H;
            }
            c11917zN0.m26386b0(this.f34902f);
            this.f34902f = 0;
            if ((this.f34899c & 4) != 0) {
                return -1L;
            }
            i = this.f34900d;
            int iM1292u = AbstractC7433Ch1.m1292u(c11917zN0);
            this.f34901e = iM1292u;
            this.f34898b = iM1292u;
            int iM26390p = c11917zN0.m26390p() & 255;
            this.f34899c = c11917zN0.m26390p() & 255;
            Logger logger = C9963k40.f36282d;
            if (logger.isLoggable(Level.FINE)) {
                C0551Ik c0551Ik = Z30.f14674a;
                logger.fine(Z30.m9461a(true, this.f34900d, this.f34898b, iM26390p, this.f34899c));
            }
            iM26381J = c11917zN0.m26381J() & Integer.MAX_VALUE;
            this.f34900d = iM26381J;
            if (iM26390p != 9) {
                throw new IOException(iM26390p + " != TYPE_CONTINUATION");
            }
        } while (iM26381J == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f34897a.f46809a.mo97r();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
