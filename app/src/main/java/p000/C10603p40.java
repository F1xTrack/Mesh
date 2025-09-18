package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: p40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10603p40 implements Closeable {

    /* renamed from: f */
    public static final Logger f39768f = Logger.getLogger(Z30.class.getName());

    /* renamed from: a */
    public final C11790yN0 f39769a;

    /* renamed from: b */
    public final C6507nj f39770b;

    /* renamed from: c */
    public int f39771c;

    /* renamed from: d */
    public boolean f39772d;

    /* renamed from: e */
    public final Q30 f39773e;

    public C10603p40(C11790yN0 c11790yN0) {
        O90.m5968f(c11790yN0, "sink");
        this.f39769a = c11790yN0;
        C6507nj c6507nj = new C6507nj();
        this.f39770b = c6507nj;
        this.f39771c = 16384;
        this.f39773e = new Q30(c6507nj);
    }

    /* renamed from: a */
    public final synchronized void m23597a(AZ0 az0) {
        try {
            O90.m5968f(az0, "peerSettings");
            if (this.f39772d) {
                throw new IOException("closed");
            }
            int i = this.f39771c;
            int i2 = az0.f248a;
            if ((i2 & 32) != 0) {
                i = az0.f249b[5];
            }
            this.f39771c = i;
            if (((i2 & 2) != 0 ? az0.f249b[1] : -1) != -1) {
                Q30 q30 = this.f39773e;
                int i3 = (i2 & 2) != 0 ? az0.f249b[1] : -1;
                q30.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = q30.f9441e;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        q30.f9439c = Math.min(q30.f9439c, iMin);
                    }
                    q30.f9440d = true;
                    q30.f9441e = iMin;
                    int i5 = q30.f9445i;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            I20[] i20Arr = q30.f9442f;
                            AbstractC0576J8.m4184k(i20Arr, 0, i20Arr.length);
                            q30.f9443g = q30.f9442f.length - 1;
                            q30.f9444h = 0;
                            q30.f9445i = 0;
                        } else {
                            q30.m6564a(i5 - iMin);
                        }
                    }
                }
            }
            m23599e(0, 0, 4, 1);
            this.f39769a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m23598c(boolean z, int i, C6507nj c6507nj, int i2) {
        if (this.f39772d) {
            throw new IOException("closed");
        }
        m23599e(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            O90.m5965c(c6507nj);
            this.f39769a.mo2328c0(c6507nj, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f39772d = true;
        this.f39769a.close();
    }

    /* renamed from: e */
    public final void m23599e(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f39768f;
        if (logger.isLoggable(level)) {
            logger.fine(Z30.m9461a(false, i, i2, i3, i4));
        }
        if (i2 > this.f39771c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f39771c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "reserved bit set: ").toString());
        }
        byte[] bArr = AbstractC7433Ch1.f1577a;
        C11790yN0 c11790yN0 = this.f39769a;
        O90.m5968f(c11790yN0, "<this>");
        c11790yN0.mo4397k((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        c11790yN0.mo4397k((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        c11790yN0.mo4397k(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        c11790yN0.mo4397k(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        c11790yN0.mo4397k(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        c11790yN0.m26144n(i & Integer.MAX_VALUE);
    }

    /* renamed from: f */
    public final synchronized void m23600f(byte[] bArr, int i, int i2) {
        AbstractC0852NX.m5764m(i2, "errorCode");
        if (this.f39772d) {
            throw new IOException("closed");
        }
        if (AbstractC7222ym.m26247x(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m23599e(0, bArr.length + 8, 7, 0);
        this.f39769a.m26144n(i);
        this.f39769a.m26144n(AbstractC7222ym.m26247x(i2));
        if (bArr.length != 0) {
            this.f39769a.mo4393a0(bArr);
        }
        this.f39769a.flush();
    }

    public final synchronized void flush() {
        if (this.f39772d) {
            throw new IOException("closed");
        }
        this.f39769a.flush();
    }

    /* renamed from: g */
    public final synchronized void m23601g(boolean z, int i, ArrayList arrayList) {
        if (this.f39772d) {
            throw new IOException("closed");
        }
        this.f39773e.m6567d(arrayList);
        long j = this.f39770b.f38488b;
        long jMin = Math.min(this.f39771c, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m23599e(i, (int) jMin, 1, i2);
        this.f39769a.mo2328c0(this.f39770b, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.f39771c, j2);
                j2 -= jMin2;
                m23599e(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.f39769a.mo2328c0(this.f39770b, jMin2);
            }
        }
    }

    /* renamed from: j */
    public final synchronized void m23602j(int i, int i2, boolean z) {
        if (this.f39772d) {
            throw new IOException("closed");
        }
        m23599e(0, 8, 6, z ? 1 : 0);
        this.f39769a.m26144n(i);
        this.f39769a.m26144n(i2);
        this.f39769a.flush();
    }

    /* renamed from: l */
    public final synchronized void m23603l(int i, int i2) {
        AbstractC0852NX.m5764m(i2, "errorCode");
        if (this.f39772d) {
            throw new IOException("closed");
        }
        if (AbstractC7222ym.m26247x(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m23599e(i, 4, 3, 0);
        this.f39769a.m26144n(AbstractC7222ym.m26247x(i2));
        this.f39769a.flush();
    }

    /* renamed from: m */
    public final synchronized void m23604m(AZ0 az0) {
        try {
            O90.m5968f(az0, "settings");
            if (this.f39772d) {
                throw new IOException("closed");
            }
            m23599e(0, Integer.bitCount(az0.f248a) * 6, 4, 0);
            int i = 0;
            while (i < 10) {
                boolean z = true;
                if (((1 << i) & az0.f248a) == 0) {
                    z = false;
                }
                if (z) {
                    int i2 = i != 4 ? i != 7 ? i : 4 : 3;
                    C11790yN0 c11790yN0 = this.f39769a;
                    if (c11790yN0.f46238c) {
                        throw new IllegalStateException("closed");
                    }
                    c11790yN0.f46237b.m23199v0(i2);
                    c11790yN0.m26143m();
                    this.f39769a.m26144n(az0.f249b[i]);
                }
                i++;
            }
            this.f39769a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: n */
    public final synchronized void m23605n(int i, long j) {
        if (this.f39772d) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        m23599e(i, 4, 8, 0);
        this.f39769a.m26144n((int) j);
        this.f39769a.flush();
    }
}
