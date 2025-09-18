package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: p40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6389p40 implements Closeable {
    public static final Logger f = Logger.getLogger(Z30.class.getName());
    public final C8161yN0 a;
    public final C6129nj b;
    public int c;
    public boolean d;
    public final Q30 e;

    public C6389p40(C8161yN0 c8161yN0) {
        O90.f(c8161yN0, "sink");
        this.a = c8161yN0;
        C6129nj c6129nj = new C6129nj();
        this.b = c6129nj;
        this.c = 16384;
        this.e = new Q30(c6129nj);
    }

    public final synchronized void a(AZ0 az0) {
        try {
            O90.f(az0, "peerSettings");
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.c;
            int i2 = az0.a;
            if ((i2 & 32) != 0) {
                i = az0.b[5];
            }
            this.c = i;
            if (((i2 & 2) != 0 ? az0.b[1] : -1) != -1) {
                Q30 q30 = this.e;
                int i3 = (i2 & 2) != 0 ? az0.b[1] : -1;
                q30.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = q30.e;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        q30.c = Math.min(q30.c, iMin);
                    }
                    q30.d = true;
                    q30.e = iMin;
                    int i5 = q30.i;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            I20[] i20Arr = q30.f;
                            J8.k(i20Arr, 0, i20Arr.length);
                            q30.g = q30.f.length - 1;
                            q30.h = 0;
                            q30.i = 0;
                        } else {
                            q30.a(i5 - iMin);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z, int i, C6129nj c6129nj, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        e(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            O90.c(c6129nj);
            this.a.c0(c6129nj, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.a.close();
    }

    public final void e(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f;
        if (logger.isLoggable(level)) {
            logger.fine(Z30.a(false, i, i2, i3, i4));
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "reserved bit set: ").toString());
        }
        byte[] bArr = AbstractC0199Ch1.a;
        C8161yN0 c8161yN0 = this.a;
        O90.f(c8161yN0, "<this>");
        c8161yN0.k((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        c8161yN0.k((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        c8161yN0.k(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        c8161yN0.k(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        c8161yN0.k(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        c8161yN0.n(i & Integer.MAX_VALUE);
    }

    public final synchronized void f(byte[] bArr, int i, int i2) {
        NX.m(i2, "errorCode");
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC8235ym.x(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        e(0, bArr.length + 8, 7, 0);
        this.a.n(i);
        this.a.n(AbstractC8235ym.x(i2));
        if (bArr.length != 0) {
            this.a.a0(bArr);
        }
        this.a.flush();
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public final synchronized void g(boolean z, int i, ArrayList arrayList) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.e.d(arrayList);
        long j = this.b.b;
        long jMin = Math.min(this.c, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        e(i, (int) jMin, 1, i2);
        this.a.c0(this.b, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.c, j2);
                j2 -= jMin2;
                e(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.a.c0(this.b, jMin2);
            }
        }
    }

    public final synchronized void j(int i, int i2, boolean z) {
        if (this.d) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z ? 1 : 0);
        this.a.n(i);
        this.a.n(i2);
        this.a.flush();
    }

    public final synchronized void l(int i, int i2) {
        NX.m(i2, "errorCode");
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC8235ym.x(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        e(i, 4, 3, 0);
        this.a.n(AbstractC8235ym.x(i2));
        this.a.flush();
    }

    public final synchronized void m(AZ0 az0) {
        try {
            O90.f(az0, "settings");
            if (this.d) {
                throw new IOException("closed");
            }
            e(0, Integer.bitCount(az0.a) * 6, 4, 0);
            int i = 0;
            while (i < 10) {
                boolean z = true;
                if (((1 << i) & az0.a) == 0) {
                    z = false;
                }
                if (z) {
                    int i2 = i != 4 ? i != 7 ? i : 4 : 3;
                    C8161yN0 c8161yN0 = this.a;
                    if (c8161yN0.c) {
                        throw new IllegalStateException("closed");
                    }
                    c8161yN0.b.v0(i2);
                    c8161yN0.m();
                    this.a.n(az0.b[i]);
                }
                i++;
            }
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(int i, long j) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        e(i, 4, 8, 0);
        this.a.n((int) j);
        this.a.flush();
    }
}
