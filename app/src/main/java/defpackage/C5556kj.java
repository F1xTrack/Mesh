package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5556kj implements Closeable {
    public C6129nj a;
    public boolean b;
    public JX0 c;
    public byte[] e;
    public long d = -1;
    public int f = -1;
    public int g = -1;

    public final void a(long j) {
        C6129nj c6129nj = this.a;
        if (c6129nj == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j2 = c6129nj.b;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(NX.g(j, "newSize < 0: ").toString());
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                JX0 jx0 = c6129nj.a;
                O90.c(jx0);
                JX0 jx02 = jx0.g;
                O90.c(jx02);
                int i = jx02.c;
                long j4 = i - jx02.b;
                if (j4 > j3) {
                    jx02.c = i - ((int) j3);
                    break;
                } else {
                    c6129nj.a = jx02.a();
                    RX0.a(jx02);
                    j3 -= j4;
                }
            }
            this.c = null;
            this.d = j;
            this.e = null;
            this.f = -1;
            this.g = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                JX0 jx0N0 = c6129nj.n0(i2);
                int iMin = (int) Math.min(j5, 8192 - jx0N0.c);
                int i3 = jx0N0.c + iMin;
                jx0N0.c = i3;
                j5 -= iMin;
                if (z) {
                    this.c = jx0N0;
                    this.d = j2;
                    this.e = jx0N0.a;
                    this.f = i3 - iMin;
                    this.g = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        c6129nj.b = j;
    }

    public final int c(long j) {
        C6129nj c6129nj = this.a;
        if (c6129nj == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = c6129nj.b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.c = null;
                    this.d = j;
                    this.e = null;
                    this.f = -1;
                    this.g = -1;
                    return -1;
                }
                JX0 jx0 = c6129nj.a;
                JX0 jx02 = this.c;
                long j3 = 0;
                if (jx02 != null) {
                    long j4 = this.d - (this.f - jx02.b);
                    if (j4 > j) {
                        j2 = j4;
                        jx02 = jx0;
                        jx0 = jx02;
                    } else {
                        j3 = j4;
                    }
                } else {
                    jx02 = jx0;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        O90.c(jx02);
                        long j5 = (jx02.c - jx02.b) + j3;
                        if (j < j5) {
                            break;
                        }
                        jx02 = jx02.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        O90.c(jx0);
                        jx0 = jx0.g;
                        O90.c(jx0);
                        j2 -= jx0.c - jx0.b;
                    }
                    jx02 = jx0;
                    j3 = j2;
                }
                if (this.b) {
                    O90.c(jx02);
                    if (jx02.d) {
                        byte[] bArr = jx02.a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        O90.e(bArrCopyOf, "copyOf(this, size)");
                        JX0 jx03 = new JX0(bArrCopyOf, jx02.b, jx02.c, false, true);
                        if (c6129nj.a == jx02) {
                            c6129nj.a = jx03;
                        }
                        jx02.b(jx03);
                        JX0 jx04 = jx03.g;
                        O90.c(jx04);
                        jx04.a();
                        jx02 = jx03;
                    }
                }
                this.c = jx02;
                this.d = j;
                O90.c(jx02);
                this.e = jx02.a;
                int i = jx02.b + ((int) (j - j3));
                this.f = i;
                int i2 = jx02.c;
                this.g = i2;
                return i2 - i;
            }
        }
        StringBuilder sbP = AbstractC8235ym.p("offset=", j, " > size=");
        sbP.append(c6129nj.b);
        throw new ArrayIndexOutOfBoundsException(sbP.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.a = null;
        this.c = null;
        this.d = -1L;
        this.e = null;
        this.f = -1;
        this.g = -1;
    }
}
